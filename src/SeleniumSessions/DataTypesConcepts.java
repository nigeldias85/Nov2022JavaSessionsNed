package SeleniumSessions;

public class DataTypesConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World! ... ");
		
		//Data Types
		//1.Byte
		//Size: byte = 8 bits
		//Range: -128 to 127
		byte b1=10;
		b1=20;
		byte b2 = 30;
		byte b3 = 40;
		
		System.out.println(b1);
		System.out.println(b2);
		
		//2. Short
		//Size: 2 bytes = 16 bits
		//Range: -32768 to 32767
		short sh = 500;
		short sh1 = -300;		
		System.out.println(sh+sh1);
		
		
		//3. Int
		//Size: 4 bytes = 32 bits
		//Range: -2147483648 to 2147483648
		int i = 1000000;
		int k = 3000;
		byte l = 20;
		System.out.println(i);
		System.out.println(k+l);
		
		//4. Long
		//Size: 8 bytes = 64 bits
		long num = 987654632;
		long ph = 9898989898L;
		System.out.println(num);
		System.out.println(ph);
		
		
		//5. Float
		//Size: 4 bytes = 32 bits
		//Range: Upto 7 digits after decimal
		float f1 = 12.33f;
		float f2 = (float) 25.36;
		System.out.println(f1);
		System.out.println(f2);
		float f3 = 100;
		System.out.println(f3);
		
		//6. Double
		//Size: 8 bytes = 64 bits
		//Range: Upto 16 digits after decimal
		double d1 = 23.45679876543;
		double d2 = 200;
		System.out.println(d1);
		System.out.println(d2);
		
		//7. Char
		//Size: 2 bytes = 16 bits
		char c1 = 'a'; //A-Z , a-z
		char c2 = '1'; //0-9
		char c3 = '$';
		char c4 = 'A';
		char c5 = 'b';
		char c6 = '0';
		char c7 = '9';
		System.out.println(c1 + " " + c2 + " " + c3 + " " +c4);
		System.out.println(c1+c5); //97 + 98
		
		//Ascii Value Range: 97 to 122 (a to z)
		//Ascii Value Range: 65 to 90 (A to Z)
		//Ascii Value Range: 48 to 57 (0 to 9)
		System.out.println(c6 + c7);
		System.out.println(c6 * c7);
		System.out.println(c7);
		System.out.println((int)c7); //Prints 57
		System.out.println(c7+0);
		System.out.println((int)c1);
		System.out.println(c1+0); // 97 + 0
		System.out.println(c1+'0'); // 97 + 48
		
		//8. boolean
		//Size: ~ 1 bit (Approximately 0.99999 bit , which is 1 bit)
		boolean bln1 = true;
		boolean bln2 = false;
		System.out.println(bln1);
		System.out.println(bln2);
		
	}

}
