package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = null;
		
		if(data == null) {
			throw new ApplicationException("DATA_NOT_FOUND_EXCEPTION");
		}

	}

}
