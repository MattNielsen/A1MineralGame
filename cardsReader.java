/**
 * Created by Matthew on 29/09/2016.
 */
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class cardsReader extends DefaultHandler{

    public void getXml(){
        try {
            // obtain and configure a SAX based parser
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

            // obtain object for SAX parser
            SAXParser saxParser = saxParserFactory.newSAXParser();

            // default handler for SAX handler class
            // all three methods are written in handler's body
            DefaultHandler defaultHandler = new DefaultHandler(){

                String mineralTag="close";
                String hardnessTag="close";
                String gravityTag="close";
                String cleavageTag="close";
                String abundanceTag="close";
                String valueTag="close";

                // this method is called every time the parser gets an open tag '<'
                // identifies which tag is being open at time by assigning an open flag
                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {

                    if (qName.equalsIgnoreCase("TYPE")) {
                        mineralTag = "open";
                    }
                    if (qName.equalsIgnoreCase("HARDNESS")) {
                        hardnessTag = "open";
                    }
                    if (qName.equalsIgnoreCase("GRAVITY")) {
                        gravityTag = "open";
                    }
                    if (qName.equalsIgnoreCase("CLEAVAGE")) {
                        cleavageTag = "open";
                    }
                    if (qName.equalsIgnoreCase("ABUNDANCE")) {
                        abundanceTag = "open";
                    }
                    if (qName.equalsIgnoreCase("VALUE")) {
                        valueTag = "open";
                    }
                }

                // prints data stored in between '<' and '>' tags
                public void characters(char ch[], int start, int length)
                        throws SAXException {

                    if (mineralTag.equals("open")) {
                        System.out.println("Mineral Name : " + new String(ch, start, length));
                    }
                    if (hardnessTag.equals("open")) {
                        System.out.println("Hardness : " + new String(ch, start, length));
                    }
                    if (gravityTag.equals("open")) {
                        System.out.println("Gravity : " + new String(ch, start, length));
                    }
                    if (cleavageTag.equals("open")) {
                        System.out.println("Cleavage : " + new String(ch, start, length));
                    }
                    if (abundanceTag.equals("open")) {
                        System.out.println("Abundance : " + new String(ch, start, length));
                    }
                    if (valueTag.equals("open")) {
                        System.out.println("Value : " + new String(ch, start, length));
                    }
                }

                // calls by the parser whenever '>' end tag is found in xml
                // makes tags flag to 'close'
                public void endElement(String uri, String localName, String qName)
                        throws SAXException {

                    if (qName.equalsIgnoreCase("type")) {
                        mineralTag = "close";
                    }
                    if (qName.equalsIgnoreCase("hardness")) {
                        hardnessTag = "close";
                    }
                    if (qName.equalsIgnoreCase("gravity")) {
                        gravityTag = "close";
                    }
                    if (qName.equalsIgnoreCase("cleavage")) {
                        cleavageTag = "close";
                    }
                    if (qName.equalsIgnoreCase("abundance")) {
                        abundanceTag = "close";
                    }
                    if (qName.equalsIgnoreCase("value")) {
                        valueTag = "close";
                    }
                }
            };

            // parse the XML specified in the given path and uses supplied
            // handler to parse the document
            // this calls startElement(), endElement() and character() methods
            // accordingly
            saxParser.parse("src/cards", defaultHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
