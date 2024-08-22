package genericLabrories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class FileUtilities {
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(Paths.filePath);
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}

}
