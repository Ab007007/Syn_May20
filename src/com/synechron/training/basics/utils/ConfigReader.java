package com.synechron.training.basics.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader extends DriverUtils {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println(getConfigValue("url"));
		System.out.println(getConfigValue("username"));
		System.out.println(getConfigValue("password"));
		System.out.println(getConfigValue("browser"));
	}
	
	
	
	
	
}
