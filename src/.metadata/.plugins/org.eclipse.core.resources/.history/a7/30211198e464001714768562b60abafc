package net.etfbl.meta.factory;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

import net.etfbl.meta.controllers.CsvResourceHandler;
import net.etfbl.meta.controllers.InfResourceHandler;
import net.etfbl.meta.exceptions.TypeException;
import net.etfbl.meta.model.MetaDescription;

public class ResourceHandlerFactory {
	
	public static InfResourceHandler getHandlerInstance(MetaDescription metaDescription) throws TypeException, FileNotFoundException{
		if (metaDescription.getType() == null){
			System.err.println("Tip informacionog resursa nije specifikovan");
			throw new TypeException("Tip nije specifikovan");
		}
		if (metaDescription.getType().equals(MetaDescription.CSV_TYPE)){
			CsvResourceHandler handler = new CsvResourceHandler(metaDescription);
			CSVReader reader = new CSVReader(new FileReader("src/res/meta_schema/" + metaDescription.getName() + ".csv"), metaDescription.getDelimiter().charAt(0));
			handler.setReader(reader);
			return handler;
		}
		String errorMessage = "Tip " + metaDescription.getType() + "nije podrzan";
		System.err.println(errorMessage);
		throw new TypeException(errorMessage);
	}
}
