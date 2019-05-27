package sax_parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class DefaultHandlerExt extends DefaultHandler {

    private List<Worker> workers;
    private Worker worker;
    private StringBuilder data;

    private boolean isLogin = false;
    private boolean isPosition = false;

    @Override
    public void startDocument() throws SAXException {
        workers = new ArrayList<>();
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("worker")) {
            worker = new Worker();
            workers.add(worker);
        } else if (qName.equalsIgnoreCase("login")) {
            isLogin = true;
        } else if (qName.equalsIgnoreCase("position")) {
            isPosition = true;
        } else if (qName.equalsIgnoreCase("additionalInfo")) {
            String year = attributes.getValue("sinceYear");
            String company = attributes.getValue("company");
            worker.setSinceYear(Integer.parseInt(year));
            worker.setCompany(company);
        }
        this.data = new StringBuilder();
    }

    @Override
    public void endElement(String uri, String localName, String qName) {

        if (isLogin) {
            worker.setLogin(data.toString());
            isLogin = false;
        } else if (isPosition) {
            worker.setPosition(data.toString());
            isPosition = false;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {
         data.append(new String(ch, start, length));
    }
}
