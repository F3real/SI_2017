package net.etfbl.meta.factory;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

import net.etfb.meta.exeptions.TypeException;
import net.etfbl.meta.controllers.CsvResourceHandler;
import net.etfbl.meta.controllers.InfResourceHandler;
import net.etfbl.meta.model.MetaDescrition;

public class ResourceHandlerFactory {
	
	public static InfResourceHandler getHandlerInstance(MetaDescrition metaDescription) throws TypeException, FileNotFoundException{
		if (metaDescription.getType() == null){
			System.err.println("Tip informacionog resursa nije specifikovan");
			throw new TypeException("Tip nije specifikovan");
		}
		if (metaDescription.getType().equals(MetaDescrition.CSV_TYPE)){
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
