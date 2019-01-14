

	// Java program to illustrate 
	// Inetaddress class methods 
	import java.io.IOException; 
	import java.net.InetAddress; 
	import java.util.Arrays; 
public class PruebaConex {
	
	
	  

	    public static void main(String[] args) throws IOException  
	    { 
	      
	  
	        String url = "www.rutacert.cl"; 
	        byte addr[] = { 127, 0, 0, 1 }; 
	  
	        // getByName() method 
	        InetAddress ip1 = InetAddress.getByName(url); 
	        System.out.println("getByName() : " + ip1); 
	  
	        // getByAddress() method 
	        InetAddress ip2 = InetAddress.getByAddress(addr); 
	        System.out.println("getByAddress() : " + ip2); 
	  
	        // getLocalHost() method 
	        InetAddress ip3 = InetAddress.getLocalHost(); 
	        System.out.println("getLocalHost() : " + ip3); 
	  
	        // getLoopbackAddress() method 
	        InetAddress ip4 = InetAddress.getLoopbackAddress(); 
	        System.out.println("getLoopbackAddress() : " + ip4); 
	  
	        // getAllByName() method - returns all ip addresses 
	        // associated with google.com 
	        InetAddress addrs[] = InetAddress.getAllByName("www.google.com"); 
	        System.out.println("Google ip addresses : " + Arrays.toString(addrs)); 
	  
	        // isReachable() method 
	        boolean isreach = ip1.isReachable(50); 
	        System.out.println("ip1 isReachable() : " + isreach); 
	  
	        // getHostname() method 
	        String hostname = ip1.getHostName(); 
	        System.out.println("ip1 hostname :" + hostname); 
	  
	        // getCanonicalHostname() method 
	        System.out.println("ip1 CanonicalHostname : " + ip1.getCanonicalHostName()); 
	  
	        // toString() method 
	        System.out.println("ip1 toString() : " + ip1.toString()); 
	     
	} 

}
