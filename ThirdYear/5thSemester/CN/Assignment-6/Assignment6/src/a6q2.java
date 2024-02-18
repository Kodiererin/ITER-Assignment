import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class a6q2 {
	public static void show() {
		System.out.println("Registration Number : 2141011063");
		System.out.println("Name : UJJWAL KUMAR");
	}
	public static void main(String[] args) {
		show();
		try {
			String url = new Scanner(System.in).next();
			URL uri = new URL(url);
			URLConnection uc = uri.openConnection();
			String contentType = uc.getContentType();
			int start = contentType.indexOf("charset=");
			String encodingFormat = "ISO-8859-1";
			InputStreamReader in = new InputStreamReader(uc.getInputStream() , encodingFormat);
			
			while(in.read()>-1) {
				System.out.print((char)in.read());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
