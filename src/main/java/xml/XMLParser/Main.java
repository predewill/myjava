package xml.XMLParser;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Считываем файл.xml
        XMLParser xml = new XMLParser( System.getProperty("user.dir") + "\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }
}
