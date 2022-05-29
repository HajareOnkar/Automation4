package genariclib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile
{
    public String getproperty(String key) throws IOException {

        Properties property =new Properties();
        FileInputStream fis= new FileInputStream(Autoconstant.propertyfilepath);
        property.load(fis);
        return property.getProperty(key);

    }




}
