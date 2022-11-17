package test24sept;
//Write a program with Shopping class which has overloaded method
//‘doTransaction’. If it
//has CreditCard type parameter it should display message ‘You got 15%
//discount on bill on credit card transaction’.
//If it has DebitCard type parameter it should display message ‘No discount
//on bill on debit card transaction’.

public class Shopping {
	int quantity;
	double priceperitem,billamount;
	String purchaseitem;
	public void acceptDetails(String item,int quant, double price) {
		purchaseitem=item;
		quantity=quant;
		priceperitem=price;
		doTRansaction();
	}
	public void acceptDetails(String item,int quant, double price,String cardtype) {
		purchaseitem=item;
		quantity=quant;
		priceperitem=price;
		doTRansaction(cardtype);
	}
	//for other modes of payment
	
public void doTRansaction() {
	billamount=quantity*priceperitem;
	//display();
}
public void doTRansaction(String cardtype) {
	//String Debitcard= D;
	System.out.println("No discount on bill on debit card transaction");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shopping s = new Shopping();
s.doTRansaction(null);
	}

}
