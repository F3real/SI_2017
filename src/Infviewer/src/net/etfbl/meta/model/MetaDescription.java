package net.etfbl.meta.model;

import java.util.List;

/**
 * Opis jednog informacionog resursa
 * @author Spasic
 *
 */
public class MetaDescription {
	protected String name;
	protected String type;
	protected String userName;
	protected String password;
	protected String delimiter;
	protected List<MetaSchemaParameter> parameters;
	protected List<String> primaryKey;
	protected List<ForeignKey> foregnKey;
	public static final String CSV_TYPE = "csv";
	
	public MetaDescription(String name, String type, String userName,
			String password, String delimiter,
			List<MetaSchemaParameter> parameters, List<String> primaryKey,
			List<ForeignKey> foregnKey) {
		super();
		this.name = name;
		this.type = type;
		this.userName = userName;
		this.password = password;
		this.delimiter = delimiter;
		this.parameters = parameters;
		this.primaryKey = primaryKey;
		this.foregnKey = foregnKey;
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
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDelimiter() {
		return delimiter;
	}
	
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public List<MetaSchemaParameter> getParameters() {
		return parameters;
	}
	
	public void setParameters(List<MetaSchemaParameter> parameters) {
		this.parameters = parameters;
	}
	
	public List<String> getPrimaryKey() {
		return primaryKey;
	}
	
	public void setPrimaryKey(List<String> primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	public List<ForeignKey> getForegnKey() {
		return foregnKey;
	}
	
	public void setForegnKey(List<ForeignKey> foregnKey) {
		this.foregnKey = foregnKey;
	}
	
}
