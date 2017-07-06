package net.etfbl.meta.model;

import java.util.List;

/**
 * Sadrzi podatke o primarnom kljucu
 * @author Spasic
 *
 */
public class ForeignKey {
	private String blockName;
	private List<String> parameters;
	public ForeignKey(String blockName, List<String> parameters) {
		super();
		this.blockName = blockName;
		this.parameters = parameters;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public List<String> getParameters() {
		return parameters;
	}
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	
	
}
