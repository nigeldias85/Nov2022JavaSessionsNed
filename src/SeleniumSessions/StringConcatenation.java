package SeleniumSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1+ " " + s2);
		
		int i1 = 100;
		int i2 = 200;
		System.out.println(i1+i2);
		System.out.println(s1+i1);
		System.out.println(i1+i2+s1+s2);
		System.out.println(s1+s2+i1+i2);
		System.out.println(s1+s2+(i1+i2));
		System.out.println(i1+i2+s1+s2+i1+i2);

	}

}
