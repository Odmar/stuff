/*
 * $Id: Bezeichnung.java 1574 2015-12-12 19:45:03Z michael $
 */
package de.nm.ltxml.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Abstract class for 'Bezeichnung'.
 *
 * @version $Revision: 1574 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Bezeichnung extends Base {

   @XmlAttribute
   protected String bezeichnung;

   /** Create object */
   public Bezeichnung() {
      super();
      bezeichnung = "??";
   }

   /** Create object */
   public Bezeichnung(final String id) {
      super(id);
      bezeichnung = "??";
   }

   /** Create object */
   public Bezeichnung(final String id, final String bez) {
      super(id);
      bezeichnung = bez;
   }

   /**
    * @return the bezeichnung
    */
   public String getBezeichnung() {
      return bezeichnung;
   }

   /**
    * @param bezeichnung the bezeichnung to set
    */
   public void setBezeichnung(final String bezeichnung) {
      this.bezeichnung = bezeichnung;
   }

   @Override
   public String toString() {
      final StringBuilder builder = new StringBuilder();
      builder.append(super.toString());
      builder.append(", bezeichnung=");
      builder.append(bezeichnung);
      return builder.toString();
   }
}
