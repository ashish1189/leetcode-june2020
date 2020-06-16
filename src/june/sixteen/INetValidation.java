package june.sixteen;

public class INetValidation {

	public String validIPAddress(String IP) {
		if(IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
			return "IPv4";
        
		if(IP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})"))
			return "IPv6";
        
		return "Neither";
	}

	public static void main(String[] args) {
		INetValidation net = new INetValidation();
		
		System.out.println("1 - "+net.validIPAddress("172.16.254.1"));
		System.out.println("2 - "+net.validIPAddress("01.01.01.01"));
		System.out.println("3 - "+net.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
		System.out.println("4 - "+net.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		System.out.println("5 - "+net.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
		System.out.println("6 - "+net.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
	}

}
