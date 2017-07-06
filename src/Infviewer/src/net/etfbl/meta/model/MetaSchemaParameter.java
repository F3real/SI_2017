package net.etfbl.meta.model;

/**
 * Dio opisa meta sheme. Koristi se da opise jedan parameter unutar bloka
 * @author Spasic
 *
 */
public class MetaSchemaParameter {
	private String name;
	private String type;
	
	public MetaSchemaParameter(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}	
}
