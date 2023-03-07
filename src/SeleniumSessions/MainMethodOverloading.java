package SeleniumSessions;

public class MainMethodOverloading {
	
	//JVM - main psvm - String[] args

	public static void main(String a[]) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//System.out.println(a[0]);
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, 20);
	}
	
	public static void main(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		System.out.println("Main with 1 param");
	}
	
	public static void main(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i);
		System.out.println(j);
		System.out.println("Main with 2 param");
	}

}
