package com.web.domain.enums;

public enum BoardType {
	notice("공지사"),
	free("자유게시");
	
	private String value;
	
	BoardType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
