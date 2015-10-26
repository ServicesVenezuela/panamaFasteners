/*
 * 
 */
package org.jllinares.api.panama.fasteners.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.jdjf.commons.config.Logeable;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

public class AbstractServiceDAO
  implements Logeable
{
  protected SqlSessionFactory sqlSessionFactory;
  public static final String INSERT = "INSERT";
  public static final String DELETE = "DELETE";
  public static final String UPDATE = "UPDATE";

  public List<?> obtenerInstancias(String nombreSQL)
  {
    return obtenerInstanciaFiltro(nombreSQL, null);
  }

  public List<?> obtenerInstanciasWithFilter(String nombreSQL, Object filtro)
  {
    return obtenerInstanciaFiltro(nombreSQL, filtro);
  }

  public int insertarInstancia(String nombreSQL, BaseBean bean)
  {
    return aplicarOperacion(nombreSQL, bean, "INSERT");
  }

  public int actualizarInstancia(String nombreSQL, BaseBean bean)
  {
    return aplicarOperacion(nombreSQL, bean, "UPDATE");
  }

  public int eliminarInstancia(String nombreSQL, BaseBean bean)
  {
    return aplicarOperacion(nombreSQL, bean, "DELETE");
  }

  public boolean isConnected()
  {
    return this.sqlSessionFactory != null;
  }

  private List<?> obtenerInstanciaFiltro(String nombreSQL, Object filtro)
  {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
    List<?> list = null;
    try
    {
      list = sqlSession.selectList(nombreSQL, filtro);
    } catch (Exception e) {
      LOGGER_ERROR.error("Se ha presentando el siguiente error a la hora de ejecutar el comando SELECT " + nombreSQL, e);
    } finally {
      sqlSession.close();
    }

    return list;
  }

  private int aplicarOperacion(String nombreSQL, BaseBean bean, String comando)
  {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
    int rowAffected = 0;
    try
    {
      switch (comando) {
      case "INSERT":
        rowAffected = sqlSession.insert(nombreSQL, bean);
        break;
      case "UPDATE":
        rowAffected = sqlSession.update(nombreSQL, bean);
        break;
      case "DELETE":
        rowAffected = sqlSession.delete(nombreSQL, bean);
        break;
      default:
        LOGGER_INFO.info("No se reconoce el comando " + comando);
      }

      if (rowAffected > 0)
        sqlSession.commit();
    }
    catch (Exception e) {
      LOGGER_ERROR.error("Se ha presentando el siguiente error a la hora de ejecutar el comando " + comando + " " + nombreSQL, e);
    } finally {
      sqlSession.close();
    }

    return rowAffected;
  }
}