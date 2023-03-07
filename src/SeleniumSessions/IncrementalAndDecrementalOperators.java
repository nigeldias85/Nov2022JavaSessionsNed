package SeleniumSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Post Increment A++
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		a = 1;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int c = -99;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		//2. Pre Increment ++A
		int t = 1;
		int u = ++t;
		System.out.println(t); //2
		System.out.println(u); //2
		
		int k = -99;
		int p = ++k;
		System.out.println(k);
		System.out.println(p);
		
		//3.Post Decrement A--
		int s1 = 2;
		int s2 = s1--;
		
		System.out.println(s1);
		System.out.println(s2);
		
		int l1 = -999;
		int l2 = l1--;
		System.out.println(l1);
		System.out.println(l2);
		
		//4.Pre Decrement --A
		int r1 = 2;
		int r2 = --r1;
		System.out.println(r1);
		System.out.println(r2);
		
		//////////----------------////////////
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		int total = 10;
		System.out.println(++total);
		System.out.println(total);
		
		System.out.println(2 * 10);
		System.out.println(-2 * 10);
		System.out.println(-2 * -10);
		
		float f1 = 2.5f;
		float f2 = f1++;
		System.out.println(f1);
		System.out.println(f2);
		
		char ch = 'a';
		System.out.println(++ch);
		System.out.println(ch++);
		
		ch = 'a';
		System.out.println((int) ++ch);
		System.out.println((int)ch++);
		
		char th= '1';
		System.out.println(++th);
		System.out.println(th);
		
		th = '1';
		System.out.println((int)++th);
		System.out.println((int)th);
		
		byte b1 = 120;
		byte b2 = 60;
		
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		
		b1 = 120;
		b2 = 60;
		int b4 = b1 + b2;
		System.out.println(b4);
		
		
	
		
		
		
				
				
		
				
		
			

	}

}
