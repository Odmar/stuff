/*
 * $Id: Base.java 1574 2015-12-12 19:45:03Z michael $
 */
package de.nm.ltxml.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

/**
 * Abstract class for all classes.
 *
 * @version $Revision: 1574 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Base {

   // fields
   @XmlAttribute
   @XmlID
   protected String id;

   /** Create object */
   public Base() {
      id = "??";
   }

   /** Create object */
   public Base(final String id) {
      this.id = id;
   }

   /**
    * @return the id
    */
   public String getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(final String id) {
      this.id = id;
   }

   @Override
   public String toString() {
      final StringBuilder builder = new StringBuilder();
      builder.append("id=");
      builder.append(id);
      return builder.toString();
   }
}
