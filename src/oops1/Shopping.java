package oops1;

public class Shopping {
	String item;
	int quantity;
	int priceItem;
	int bill;
	void acceptDetails(String i, int q, int p ) {
		item=i;
		quantity=q;
		priceItem=p;
	}
	void calculateBill () {
		if (quantity*priceItem>0) {
		 bill= quantity*priceItem;
		
		}
		else {
			bill=0;
		}
	}
	void display() {
		//acceptDetails(item, priceItem, quantity);
		if (bill>0) {
			System.out.println(item +" "+ priceItem +" "+ quantity +" " + bill );
		}
		else {
			System.out.println("error");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shopping a = new Shopping();
a.acceptDetails("soap", 6, 40);
a.calculateBill();
a.display();
	}

}
