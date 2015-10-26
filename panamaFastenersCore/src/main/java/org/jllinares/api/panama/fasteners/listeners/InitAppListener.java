package org.jllinares.api.panama.fasteners.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.jdjf.commons.config.Log4JConfig;
import org.jdjf.commons.config.Logeable;
import org.jllinares.api.panama.fasteners.commons.AppConstans;
import org.jllinares.api.panama.fasteners.utils.LoadConfigurationUtils;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving initApp events.
 * The class that is interested in processing a initApp
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addInitAppListener<code> method. When
 * the initApp event occurs, that object's appropriate
 * method is invoked.
 *
 * @see InitAppEvent
 */
public class InitAppListener
  implements ServletContextListener, Logeable
{
  
  /* (non-Javadoc)
   * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
   */
  public void contextInitialized(ServletContextEvent sce)
  {
    initLog4j();
    LoadConfigurationUtils.loadProperties();
    LoadConfigurationUtils.initDataBases();
    LOGGER_INFO.info("Contexto de los servicios de Fasteners Panama en su version " + AppConstans.VERSION_APP.getValue() + " iniciado correctamente");
  }

  /* (non-Javadoc)
   * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
   */
  public void contextDestroyed(ServletContextEvent sce)
  {
    LOGGER_INFO.info("Contexto de los servicios de Fasteners Panama en su version " + AppConstans.VERSION_APP.getValue() + " detenido correctamente");
  }

  /**
   * Inits the log4j.
   */
  private static void initLog4j()
  {
    try
    {
      Log4JConfig logcnf = new Log4JConfig();
      logcnf.configure(AppConstans.ID_APP.getValue(), false);
    } catch (Exception e) {
      LOGGER_ERROR.error("Configuracion de Log4J errada: " + e);
    }
  }
}