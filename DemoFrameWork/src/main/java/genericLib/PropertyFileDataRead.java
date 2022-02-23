package genericLib;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Vishwa
 *
 */

public class PropertyFileDataRead {

	public String  getValueProperty(String key) throws Throwable {
		FileInputStream file=new FileInputStream(FrameWorkConstants.PROPERTIES_PATH);
		Properties properties=new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}
}