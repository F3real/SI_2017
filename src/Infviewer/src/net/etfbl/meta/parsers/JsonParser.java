package net.etfbl.meta.parsers;

import java.util.*;

import org.json.JSONObject;

import net.etfbl.meta.model.MetaDescrition;

/** @pdOid 36aad12b-655f-43ba-92b0-456338c19bfb */
public class JsonParser extends MetaParser {
	private JSONObject metaSchema;
	
	public JsonParser(JSONObject json) {
		metaSchema = json;
	}
	@Override
	public String[] getInfResources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDescrition selectInfResource(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}