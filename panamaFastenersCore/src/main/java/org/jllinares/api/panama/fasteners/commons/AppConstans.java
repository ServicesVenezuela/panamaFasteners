package org.jllinares.api.panama.fasteners.commons;

// TODO: Auto-generated Javadoc
/**
 * The Enum AppConstans.
 */
public enum AppConstans
{
  
  /** The id app. */
  ID_APP("panamaFasteners"), 
  
  /** The version app. */
  VERSION_APP("V1.0.0"), 
  
  /** The jdjf home. */
  JDJF_HOME(System.getenv("JDJF_HOME")), 
  
  /** The db config reg. */
  DB_CONFIG_REG("mybatis-api-config.xml"), 
  
  /** The path config. */
  PATH_CONFIG(JDJF_HOME.getValue() + "/appl/" + ID_APP.getValue() + "/config/"), 
  
  /** The namespace util. */
  NAMESPACE_UTIL("org.jllinares.api.panama.fasteners.service.beans.");

  /** The value. */
  private String value;

  /**
   * Instantiates a new app constans.
   *
   * @param value the value
   */
  private AppConstans(String value)
  {
    this.value = value;
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public String getValue()
  {
    return this.value;
  }
}