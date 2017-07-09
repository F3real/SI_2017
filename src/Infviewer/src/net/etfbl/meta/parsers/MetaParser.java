package net.etfbl.meta.parsers;

import java.util.*;

import net.etfbl.meta.model.MetaDescription;

public abstract class MetaParser {
   public abstract List<MetaDescription> getInfResources();
   
   public abstract MetaDescription selectInfResource(String name);

}