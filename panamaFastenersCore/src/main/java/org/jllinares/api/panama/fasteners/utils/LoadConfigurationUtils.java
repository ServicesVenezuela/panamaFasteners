package org.jllinares.api.panama.fasteners.utils;

import org.jdjf.commons.config.CoreProperties;
import org.jdjf.commons.config.Logeable;
import org.jllinares.api.panama.fasteners.commons.AppConstans;
import org.jllinares.api.panama.fasteners.commons.PropertiesApp;
import org.jllinares.api.panama.fasteners.dao.ManagerServiceDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadConfigurationUtils.
 */
public class LoadConfigurationUtils
  implements Logeable
{
  
  /** The dao. */
  private static ManagerServiceDAO dao = null;

  /**
   * Load properties.
   */
  public static synchronized void loadProperties()
  {
    CoreProperties core = new CoreProperties();
    PropertiesApp.setGenericProp(core.getProperties(AppConstans.ID_APP.getValue(), "generic"));
    PropertiesApp.printProperties();
  }

  /**
   * Inits the data bases.
   */
  public static synchronized void initDataBases()
  {
    dao = new ManagerServiceDAO();
  }

  /**
   * Gets the register db.
   *
   * @return the register db
   */
  public static ManagerServiceDAO getRegisterDB()
  {
    return dao;
  }
}