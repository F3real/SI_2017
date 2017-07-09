package net.etfbl.meta.controllers;

import java.util.*;
import net.etfbl.meta.model.*;

public class InfResourceManager {

	public MetaSchemaManager metaSchemaManager;

	public InfResourceHandler infResourceHandler;

	public void initialize() {
		// TODO: implement
	}

	public MetaSchemaManager getMetaSchemaManager() {
		return metaSchemaManager;
	}

	public InfResourceHandler getInfResourceHandler() {
		return infResourceHandler;
	}

	public List<MetaDescription> getInfResources() {
		if(metaSchemaManager != null) {
			return metaSchemaManager.getMetaParser().getInfResources();
		}
		return null;
	}

	public void setInfResourceHandler() {
		// TODO: implement
	}

	// TODO treba da vrati TreeNode ili nesto slicno
	public Object getData() {
		// TODO: implement
		return null;
	}

	public int update() {
		// TODO: implement
		return 0;
	}

	public int insert() {
		// TODO: implement
		return 0;
	}

	public int delete() {
		// TODO: implement
		return 0;
	}

}