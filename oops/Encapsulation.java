package capgamini;


class mobile
{
	private int imei_no;
	private String name;
	private double price;
	public int getImei_no() {
		return imei_no;
	}
	public void setImei_no(int imei_no) {
		this.imei_no = imei_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		mobile m = new mobile();
		m.setImei_no(76538942);
		m.setName("Eren");
		m.setPrice(49999.99);
		
		System.out.println("mei_no : "+ m.getImei_no());
		System.out.println("Name : "+ m.getName());
		System.out.println("Price : "+ m.getPrice());
	}
}

