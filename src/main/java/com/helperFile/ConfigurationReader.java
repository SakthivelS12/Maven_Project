package com.helperFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties P;	
	public ConfigurationReader() throws IOException {
		File F = new File("C:\\Users\\sakth\\eclipse-workspaces\\Maven_Program\\src\\main\\java\\com\\helperFile\\Configuration.properties");
		FileInputStream FIS = new FileInputStream(F);
		P = new Properties();
		P.load(FIS);
	}
	public String get_url() {
		String url = P.getProperty("Url");
		return url;
	}
	public String get_uname() {
		String uname = P.getProperty("UserName");
		return uname;
	}
	public String get_passwd() {
		String passwd = P.getProperty("Password");
		return passwd;
	}
}
