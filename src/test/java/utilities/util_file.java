package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class util_file {
	Properties prop;
	String path;

	// used for loading properties from config file
	public Properties propfile() throws IOException {
		this.prop = new Properties();
		// path for properties file
		path = System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties";
		// reading the file
		FileInputStream fs = new FileInputStream(path);
		// loading the file
		prop.load(fs);
		return prop;
	}

}
