package sept14;
class Pen {
	 int penprice;
	 String color;
	 String brandname;

	public void setPenprice(int penprice) {
		this.penprice = penprice;
	}

	public int getPenprice() {
		return penprice;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getBrandname() {
		return brandname;
	}
}

public class Bag {
	 String brand;
	 int price;
	Pen pen;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	public void setPen(Pen pen) {
		this.pen=pen;
	}
	public Pen getPen() {
		return pen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag b= new Bag();
		b.setBrand("gucci");
		b.setPrice(5000);
		b.setPen(new Pen());
		b.getPen().setBrandname("cello");
		b.getPen().setColor("white");
		b.getPen().setPenprice(99);
		System.out.println(b.getBrand()+" "+b.getPrice()+" "+b.getPen().getBrandname()+ " "+b.getPen().getColor()+" "+b.getPen().getPenprice() );



	}

}
