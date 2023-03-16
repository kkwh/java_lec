package edu.java.singleton;

public class Captain2 {
	
	private static Captain2 instance = null;
	
	private Captain2 () {}
	
	public static Captain2 getInstance() {
		if(instance == null) {
			instance = new Captain2();
		}	
			return instance;
		
	}
	
}
