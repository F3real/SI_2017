package net.etfbl.meta.controllers;
import java.util.HashMap;
import java.util.List;
import net.etfbl.meta.model.MetaDescrition;

/***********************************************************************
 * Module:  InfResourceHandler.java
 * Author:  error
 * Purpose: Defines the Class InfResourceHandler
 ***********************************************************************/


/** @pdOid ff2ed453-13d1-44d2-98a9-24b0225158c9 */
public abstract class InfResourceHandler {
   /** @pdOid 9d97904e-405a-47b4-9274-ba431195f899 */
   private MetaDescrition metaDescription;
   
   /** @pdOid 0ef51600-08dd-4bec-a8d3-1453eb53530d */
   public abstract int initialize();
   /** @pdOid 20736714-a585-4f72-92ea-e7777fe1e641 */
   public abstract String[] getBlocks();
   /** @pdOid 05f5282f-33d7-4b9e-a291-9c9ee7d77311 */
   public abstract int update();
   /** @pdOid 2c8bd7fb-cac8-4276-9358-44c67e6f68e6 */
   public abstract int instert();
   /** @pdOid 69592a7c-39ea-46c5-beeb-f4c5ec0fab75 */
   public abstract int delete();
   /** @pdOid 04a3db5a-7c4a-4e03-9246-4890e41efbe5 */
   public List<HashMap<String, String>> getDataBlocks() {
      // TODO: implement
      return null;
   }

}