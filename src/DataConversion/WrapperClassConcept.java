package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "100";
		System.out.println(x+20);
		
		//String to Integer conversion
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "100USD";
		System.out.println(y+20);
		//int j = Integer.parseInt(y); //Number format exception is thrown
		//System.out.println(j);
		String[] currArray = y.split("USD");
		System.out.println("currArray[0]: "+currArray[0]);
		System.out.println(Integer.parseInt(currArray[0])+20);
		
		//String to double
		String z="12.33";
		Double d = Double.parseDouble(z);
		System.out.println(d+20);
		
		//String to boolean
		String headless = "true";
		System.out.println(Boolean.parseBoolean(headless));
		
		
		//Integer to String
		int k = 100;
		String kString = String.valueOf(k);
		System.out.println(kString+20);
		
		//boolean to String
		boolean flag = true;
		System.out.println(String.valueOf(flag));
		
		//Integer range
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}

}
