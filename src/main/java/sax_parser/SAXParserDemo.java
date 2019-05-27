package sax_parser;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SAXParserDemo {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        /* Создать класс Worker, преобразовать следущий xml в List<Worker> с помощью SAX. */

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        InputStream is = SAXParserDemo.class.getClassLoader().getResourceAsStream("worker.xml");
        DefaultHandlerExt handler = new DefaultHandlerExt();
        parser.parse(is, handler);
        is = SAXParserDemo.class.getClassLoader().getResourceAsStream("worker.xml");
        parser.parse(is, handler);

        List<Worker> workers = handler.getWorkers();

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
