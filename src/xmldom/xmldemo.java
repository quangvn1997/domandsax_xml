/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmldom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Asus
 */
public class xmldemo {

    public static void main(String[] args) {
        try {

            File xmlFile = new File("src/xmldom/example.xml");

            DocumentBuilder dbdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document doc = dbdoc.parse(xmlFile);

            NodeList nl = doc.getElementsByTagName("student");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nod = nl.item(i);
                if (nod.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nod;
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Rollnumber: " + element.getElementsByTagName("rollnumber").item(0).getTextContent());
                    System.out.println("Email: " + element.getElementsByTagName("email").item(0).getTextContent());
                    System.out.println("Phone: " + element.getElementsByTagName("phone").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
