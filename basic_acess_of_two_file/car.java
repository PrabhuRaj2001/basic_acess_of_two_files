
public class car {
	String name,color;
	int price;

	public car(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		feature();
	}
	
	public car(String name, String color) {
		// TODO Auto-generated constructor stub
		this(name);
		this.color=color;
		design();
	}
	
	public car(String name, String color, int price) {
		// TODO Auto-generated constructor stub
		this(name,color);
		this.price=price;
		price();
	}
	public void feature()
	{
		System.out.println(this.name+"\t\tvery powerful for racing");
	}
	public void design()
	{
		System.out.println(this.color+"\t\tTime limited edition color");
	}
	public void price()
	{
		System.out.println(this.price+"\tlow level buget car ");
	}

}
