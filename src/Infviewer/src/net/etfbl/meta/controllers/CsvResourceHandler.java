package net.etfbl.meta.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;

import net.etfbl.meta.model.MetaDescrition;
import net.etfbl.meta.model.MetaSchemaParameter;

public class CsvResourceHandler extends InfResourceHandler {
	private CSVReader reader;
	
	public CsvResourceHandler(MetaDescrition metaDescription) {
		this.metaDescription = metaDescription;
	}
		
	public CSVReader getReader() {
		return reader;
	}

	public void setReader(CSVReader reader) {
		this.reader = reader;
	}

	public String[] getBlocks() {
		String[] result;
		if (reader == null){
			return result;
		}
		String[] header = reader.readNext();
		List<MetaSchemaParameter> parameters = this.metaDescription.getParameters();
		int index = 0;
		for (String item : header){
			if (!item.equals(parameters.get(index).getName())){
				System.err.println("Parameter " + item + " nije definisan u meta shemi ili je definisan na pogresnom indeksu");
			}
		}
		return header;
	}

	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int instert() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<HashMap<String, String>> getDataBlocks(){
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		if (reader == null){
			return result;
		}
		List<String[]> allRows = reader.readAll();
		String[] header = allRows.get(0);
		for (int i = 1; i< allRows.size();i++){
			HashMap<String, String> hashRow = new HashMap<String, String>();
			for (int j=0;j<header.length;j++){
				hashRow.put(header[j], allRows.get(i)[j]);
				
			}
			result.add(hashRow);
		}
		return result;
	}
}