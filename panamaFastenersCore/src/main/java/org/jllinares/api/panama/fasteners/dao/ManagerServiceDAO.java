/*
 * 
 */
package org.jllinares.api.panama.fasteners.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jllinares.api.panama.fasteners.commons.AppConstans;
import org.jllinares.api.panama.fasteners.commons.PropertiesApp;

public final class ManagerServiceDAO extends AbstractServiceDAO
{
  public ManagerServiceDAO()
  {
    try
    {
      this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream(AppConstans.PATH_CONFIG.getValue() + AppConstans.DB_CONFIG_REG.getValue()), PropertiesApp.getGenericProp().getProperty("ENVIROMENT_DB"));
    } catch (FileNotFoundException e) {
      this.sqlSessionFactory = null;
      LOGGER_ERROR.error("Se ha presentado el siguiente error tratando de obtener el archivo de configuracion " + AppConstans.DB_CONFIG_REG.getValue(), e);
    }
  }
}