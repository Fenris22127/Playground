package de.medieninformatik;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadXML {
    protected static void read() throws FileNotFoundException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder;
        final FileInputStream inputStream = new FileInputStream("src/main/java/de/medieninformatik/Music.xml");
        final FileReader fileReader = new FileReader("src/main/java/de/medieninformatik/Music.xml");
        try (inputStream; fileReader) {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);
            /*SAXParserFactory parserFactory = SAXParserFactory.newDefaultInstance();
            SAXParser parser = parserFactory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            reader.setContentHandler(new DefaultHandler()); //eigenen Handler nutzen!
            InputSource source = new InputSource(fileReader);
            reader.parse(source);*/
            System.out.println(doc);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }


}
