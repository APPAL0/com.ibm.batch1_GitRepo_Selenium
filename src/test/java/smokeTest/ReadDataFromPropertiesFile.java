package smokeTest;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		
		System.out.println("application url: " + prop.getProperty("nop_appURL"));
		System.out.println("application username: " + prop.getProperty("userName"));
		System.out.println("application password: " + prop.getProperty("password"));
		System.out.println("application wrong key: " + prop.getProperty("asdfaffsafs"));
		
		

	}

}
