package com.hn.keeper.starter.model;

public class Action {

	private String field;

	private String operator;

	private String type;

	public Action(String field, String operator, String type) {
		super();
		this.field = field;
		this.operator = operator;
		this.type = type;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
