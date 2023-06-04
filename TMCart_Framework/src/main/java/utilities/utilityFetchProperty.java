package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilityFetchProperty {
    public static String fetchPropertyValue(String key) throws IOException {
        FileInputStream file=new FileInputStream("src/test/resources/properties/config.properties");//copy properties file path(content root)
        Properties property=new Properties();
        property.load(file);                        //loading property file
        return property.get(key).toString();
    }
}
