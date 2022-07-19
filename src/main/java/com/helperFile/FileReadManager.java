package com.helperFile;

import java.io.IOException;

public class FileReadManager {
//Private
	private FileReadManager() {
		
	}
		
//Static
	public static FileReadManager getinstance_FRM() {
		FileReadManager FRM = new FileReadManager();
		return FRM;
	}	
//Non-Static
	public ConfigurationReader getinstance_CR() throws IOException {
		ConfigurationReader CR = new ConfigurationReader();
		return CR;
	}
}
