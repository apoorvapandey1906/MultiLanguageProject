package ConfigReader;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigPropReader {
	
	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLanguageProp(String language) {
		
		System.out.println("Language is :" + language);
		prop = new Properties();
	
		try {
		
		switch(language.toLowerCase()) {
		
		case "english":
			ip = new FileInputStream("./src/main/resources/lang.english.properties");
			break;
			
		case "french":
			ip = new FileInputStream("./src/main/resources/lang.french.properties");
			break;
			
		default:
			System.out.println("This language property file is not found "+language);
				break;
		}
		
		prop.load(ip);
		
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return prop;
	}

}
