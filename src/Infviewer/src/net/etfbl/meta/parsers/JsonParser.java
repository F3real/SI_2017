package net.etfbl.meta.parsers;

import java.util.*;

import org.json.JSONObject;

import net.etfbl.meta.model.MetaDescription;

/** @pdOid 36aad12b-655f-43ba-92b0-456338c19bfb */
public class JsonParser extends MetaParser {
	private JSONObject metaSchema;
	
	public JsonParser(JSONObject json) {
		metaSchema = json;
	}
	@Override
	public List<MetaDescription> getInfResources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDescription selectInfResource(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}