package net.etfbl.meta.parsers;

import java.util.*;

import net.etfbl.meta.model.MetaDescrition;

public abstract class MetaParser {
   public abstract String[] getInfResources();
   
   public abstract MetaDescrition selectInfResource(String name);

}