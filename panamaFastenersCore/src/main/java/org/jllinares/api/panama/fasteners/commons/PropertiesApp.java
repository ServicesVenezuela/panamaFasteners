package org.jllinares.api.panama.fasteners.commons;

import java.util.Enumeration;
import java.util.Properties;
import org.jdjf.commons.config.Logeable;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertiesApp.
 */
public final class PropertiesApp implements Logeable {
  
  /** The generic prop. */
  private static Properties genericProp;

  /**
   * Gets the generic prop.
   *
   * @return the generic prop
   */
  public static Properties getGenericProp()
  {
    return genericProp;
  }

  /**
   * Sets the generic prop.
   *
   * @param genericProp the new generic prop
   */
  public static void setGenericProp(Properties genericProp)
  {
    PropertiesApp.genericProp = genericProp;
  }

  /**
   * Prints the properties.
   */
  public static void printProperties()
  {
    printProp(genericProp);
  }

  /**
   * Prints the prop.
   *
   * @param prop the prop
   */
  private static void printProp(Properties prop)
  {
    String aux = "";
    Enumeration<?> e = prop.propertyNames();

    while (e.hasMoreElements()) {
      aux = e.nextElement().toString();

      if (!"password".contains(aux)) {
        LOGGER_INFO.info(aux + ": " + prop.getProperty(aux));
      }
      else
      {
        LOGGER_INFO.info(aux + ": XXXXXX");
      }
    }
  }
}