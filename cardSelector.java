import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class cardSelector {

    public String xmlRead(String mineralType, String mineralSpecification, String mineralAttribute) {
        String specificationValue = "";
        boolean specificationCategory = false;
        boolean mineralCategory = false;
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader =
                    factory.createXMLEventReader(
                            new FileReader("src/cards"));

            while(eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                switch(event.getEventType()){
                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();
                        if (qName.equalsIgnoreCase(mineralType)) {
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            mineralCategory = true;
//                            String rollNo = attributes.next().getValue();
//                            System.out.println("Roll No : " + rollNo);

                        }
                        else if (qName.equalsIgnoreCase(mineralSpecification) && mineralCategory) {
                            specificationCategory = true;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if(specificationCategory){
                            specificationValue = characters.getData();
                            mineralCategory = false;
                            specificationCategory = false;

                        }
                        break;
                    case  XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        if (mineralAttribute.equalsIgnoreCase(specificationValue)){
            return specificationValue;
        }
        else {
            System.out.println("Given value of " + mineralAttribute + " was not correct. Assigning correct value of " +
                    ": " + specificationValue + " instead.");
            return specificationValue;

        }

    }
}