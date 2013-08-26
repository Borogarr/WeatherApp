import java.net.*;
import java.xml.*;

public class GetWeather {

	public GetWeather() {

	}
	
	public static final String[] xmlLoader() {
		String[] xmlData = new String[2];
		
		try {
			URL weatherxml = new URL("http://api.wunderground.com/api/fe55db707e0d22d6/forecast/" +
									 "geolookup/conditions/q/CA/San_Francisco.xml")
			
			DocumentBuilderFactory dbf = new DocumentBuilderFactory.newInstance();
		}
		
		
	}
}
