package practice.raykor;
class MyNewException extends Throwable{
	MyNewException(String s){
		super(s);
	}
}
public class CustomException {
static void phoneNum() throws MyNewException {
	String num = "9845651jj";
	for(int i=0;i<num.length();i++) {
		if(num.charAt(i)>'9' || num.charAt(i)<'0') {
			throw new MyNewException("invalid phone num");
			
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	phoneNum();
	
}
catch(MyNewException e) {
	System.out.println(e.getMessage());
}
	}

}
