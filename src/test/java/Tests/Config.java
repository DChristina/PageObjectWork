package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static String get(String propertyName){
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Property file was not find config.properties");//  для тог чтобі получать сообщение об отсутс файла config
        }

        return prop.getProperty(propertyName);//возвращаем значение проперти ищем по ключу
    }
}
