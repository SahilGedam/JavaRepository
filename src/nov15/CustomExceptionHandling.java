package nov15;
import java.io.IOException;
import java.sql.*;
class Laptop{
	//parent does not declare any exception
	public void run () {
		
	}
}
public class CustomExceptionHandling extends Laptop {
// child does not declare any exception 
	@Override
	public void run () throws NullPointerException {
		
	}
//	public void run() thows SQLException {
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
