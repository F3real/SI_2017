package net.etfbl.meta.controllers;

import java.util.*;
import net.etfbl.meta.model.*;

/** @pdOid 0d3d875c-e83c-49a1-acfc-a2e474fd43ae */
public class InfResourceManager {
   /** @pdRoleInfo migr=no name=MetaSchemaManager assc=association4 mult=1..1 type=Composition */
   public MetaSchemaManager metaSchemaManager;
   /** @pdRoleInfo migr=no name=InfResourceHandler assc=association6 mult=1..1 type=Composition */
   public InfResourceHandler infResourceHandler;
   
   /** @pdOid 47f9a127-2f98-44a6-b396-d962d732b0cf */
   public void initialize() {
      // TODO: implement
   }
   
   /** @pdOid d3871c31-81b8-4dd5-9140-041df4610a21 */
   public MetaSchemaManager getMetaSchemaManager() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e63feb44-ee9a-4dc0-8eba-35cebdb0d268 */
   public InfResourceHandler getInfResourceHandler() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid cd800ef1-92bd-4f74-bdda-54e66a50f700 */
   public void setInfResourceHandler() {
      // TODO: implement
   }
   
   /** @pdOid 4d73ad1f-d924-436a-8f16-c418586fa242 */
   public TreeNode<Node> getData() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 49f86fe5-ea50-462b-8e9d-89da43fac929 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 543a2e0e-f72f-4e4f-a1a1-e21366c1d6a4 */
   public int insert() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid c1647b3e-9fe2-435e-a9f9-5a295ece5966 */
   public int delete() {
      // TODO: implement
      return 0;
   }

}