package net.etfbl.meta.exceptions;

public class TypeException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;
	public TypeException(){
		this.message = "";
	}
	public TypeException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
}
