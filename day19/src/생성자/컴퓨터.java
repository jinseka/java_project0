package 생성자;

public class 컴퓨터 {

	int price;
	String company;
	int monoter;
	public 컴퓨터(int price, String company, int monoter) {
		super();
		this.price = price;
		this.company = company;
		this.monoter = monoter;
	}
	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", monoter=" + monoter + "]";
	}
	
	
	
}
