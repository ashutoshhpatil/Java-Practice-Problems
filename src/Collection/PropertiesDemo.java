package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        FileInputStream fis  =  new FileInputStream("src/Collection/abc.properties");
        p.load(fis);
        System.out.println(p);

        String s =p.getProperty("ashutosh");
        System.out.println(s);

        p.setProperty("patil", "95220");

        FileOutputStream fos = new FileOutputStream("src/Collection/abc.properties");
        p.store(fos, "Updated by Ashutosh ");

        System.out.println(p);
    }
}
