import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("D:\\javafifthbatch\\src\\credential.properties");
        prop.load(fileInputStream);
        System.out.println(prop.getProperty("browser"));

        String browserName = prop.getProperty("browser");
        if (browserName.equals("firefox")){
            String driverLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\Driver\\geckodriver.exe";

        }


    }
}
