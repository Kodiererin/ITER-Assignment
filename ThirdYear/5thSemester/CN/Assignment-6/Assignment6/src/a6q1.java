import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class a6q1 {
	public static void show() {
		System.out.println("Registration Number : 2141011063");
		System.out.println("Name : UJJWAL KUMAR");
	}
	public static void main(String[] args) throws Exception{
		show();
	    // TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the url");
	    String urlstring=sc.next();
	    CookieManager cm=new CookieManager();
	    if(urlstring.endsWith(".gov/") || urlstring.endsWith(".gov.in/")) {
	        cm.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
	        System.out.println("No cookie is stored");
	    }
	    else {
	        cm.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
	    }CookieHandler.setDefault(cm);
	    URL u=new URI(urlstring).toURL();
	    BufferedReader in=new BufferedReader(new InputStreamReader(u.openStream()));
	    String r1;
	    while((r1=in.readLine())!=null) {}
	    CookieStore cs=cm.getCookieStore();
	    List<HttpCookie> cookies=cs.getCookies();

	    for(HttpCookie ck:cookies){
	        System.out.println("Cookie name: "+ck.getName());
	        System.out.println("Cookie Domain: "+ck.getDomain());
	        System.out.println("Cookie path: "+ck.getPath());
	        System.out.println("Cookie security: "+ck.getSecure());
	        System.out.println("Cookie value: "+ck.getValue());
	        System.out.println();

	}
	}
}