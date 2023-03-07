package SeleniumSessions;

import java.util.Arrays;

public class Customer {

	//WAF:
	//Get Employee Devices
	//Return devices list
	 public String[] getEmployeeDevices(String empName) {
		 
		 //Remove trailing spaces
		 empName = empName.trim().toLowerCase();
		 System.out.println("Getting employee devices for "+empName);
		
		 //Declarations
		 String devices[]=null;
		 
		 if(empName.equals("Ravi")) {
			 devices = new String[]{"macbook", "ipod", "iPhone13"};
			 return devices;
		 }
		 else if(empName.equals("Om")) {
			 devices = new String[]{"Samsung S10", "Chromebook", "iWatch"};
			 return devices;
		 }
		 else if(empName.equals("Rashmi")) {
			 devices = new String[]{"Windows 10", "iMac", "IBM PC"};
			 return devices;
		 }
		 else {
			 System.out.println("Employee not found....");
		 }
		 
		 return devices;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj = new Customer();
		String[] devices = obj.getEmployeeDevices(" Ravi  ");
		if(devices != null) {
			System.out.println("Device Count: "+devices.length);
			System.out.println(Arrays.toString(devices));
		}
		

	}

}
