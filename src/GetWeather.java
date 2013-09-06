import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.*;
import javax.xml.parsers.*;
import java.io.InputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;

public class GetWeather {

	public GetWeather() {

        }
	
	public static void xmlLoader() throws Exception {
		Document doc = null;
		
		try {
			URL weatherxml = new URL("http://api.wunderground.com/api/fe55db707e0d22d6/forecast/" +
									 "geolookup/conditions/q/CA/San_Francisco.xml");
                                
                        URLConnection urlconnection = weatherxml.openConnection();
                        InputStream in = new BufferedInputStream(urlconnection.getInputStream());
                       
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        doc = db.parse(in);
		}
		catch (Exception ex) {
                    throw ex;
                }
		
                NodeList temperature_string = doc.getElementsByTagName("temperature_string");              
                NodeList full = doc.getElementsByTagName("full");
                NodeList feelslike_string = doc.getElementsByTagName("feelslike_string");
                
                System.out.println("Request processed for " + full.item(0).getTextContent());
                System.out.println("The Temperature is" + " " + temperature_string.item(0).getTextContent());
                System.out.println("It feels like " + feelslike_string.item(0).getTextContent());
                
	}
}
