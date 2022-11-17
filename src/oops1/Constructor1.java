package oops1;



public class Constructor1 {
	int movies;
	String actor;
	Constructor1(int movies, String actor){
		this.movies=movies;
		this.actor=actor;
	}
	 Constructor1(){
		this(1,"gunda");
			if(movies<1) {
				System.out.println("tapori");
			}
			else {
				System.out.println("shooter");
			}
			this.display();
		
	}
	 void display() {
		 System.out.println(movies);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor1 c= new Constructor1();

	}

}
