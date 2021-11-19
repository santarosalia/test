package kr.or.iei.member.controller;

import java.util.HashMap;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;

	public HandlerMapping() {
		super();
		mappings = new HashMap<String, Controller>();
		mappings.put("/search.do", new searchController());
		mappings.put("/login.do", new loginController());
	}
	public Controller getController(String uri) {
		return mappings.get(uri);
	}
	
}
