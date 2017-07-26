
public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		Item item1 = new Item("ÑªÆ¿", 50);
		Item item2 = new Item("²ÝÐ¬", 300);
		Item item3 = new Item("³¤½£", 350);
		System.out.println(item1.getName()+" "+item1.getPrice());
		System.out.println(item2.getName()+" "+item2.getPrice());
		System.out.println(item3.getName()+" "+item3.getPrice());
	}
}
