package com.iut.as2021.enumerations;

public enum EOperation {

	INCONNUE(0, ""),
	MULTIPLICATION(1, "*"),
	DIVISION(2, "/"),
	ADDITION(3, "+"), 
	SOUSTRACTION(4, "-"), 	
	CLOSE_BRACKET(5, "]"),
	CLOSE_BRACKET_M(6, "]*"),
	CLOSE_BRACKET_D(7, "]/"),
	CLOSE_BRACKET_A(8, "]+"),
	CLOSE_BRACKET_S(9, "]-"),
	OPEN_BRACKET(10, "[");
	
	private int code;
	private String operateur;

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	private EOperation(int code, String operateur) {
		this.code = code;
		this.operateur = operateur;
	}
}
