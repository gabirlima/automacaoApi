package Services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseService {

    public static String base_url;
    public static String timestamp;
    public static String api_key;
    public static String hash;

    public BaseService(){
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        base_url = prop.getProperty("BASE_URL");
        timestamp = prop.getProperty("TIMESTAMP");
        api_key = prop.getProperty("P_KEY");
        hash = prop.getProperty("HASH");
    }

}
