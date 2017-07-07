package net.etfbl.meta.controllers;

import java.io.*;

import org.json.JSONException;
import org.json.JSONObject;

import net.etfbl.meta.parsers.JsonParser;
import net.etfbl.meta.parsers.MetaParser;

public class MetaSchemaManager {
	private MetaParser metaParser;

	public void initialize(File metaSchema) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(metaSchema);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] data = new byte[(int) metaSchema.length()];
		try {
			fis.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String str = new String(data, "UTF-8");
			JSONObject json = new JSONObject(str);
			metaParser = new JsonParser(json);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String load() {
		// TODO: implement
		return null;
	}

	public void save() {
		// TODO: implement
	}

	public int validate() {
		// TODO: implement
		return 0;
	}

	public MetaParser getMetaParser() {
		return metaParser;
	}

}