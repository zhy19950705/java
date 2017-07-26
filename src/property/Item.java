package property;

public class Item {
	private String name;
	private int price;

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
		Item item1=new Item();
		Item item2=new Item();
		Item item3=new Item();
		item1.setName("∂‡¿∂Ω‰");
		item1.setPrice(400);
		item2.setName("∂‡¿º∂‹");
		item2.setPrice(450);
		item3.setName("∂‡¿ºΩ£");
		item3.setPrice(450);
		System.out.println(item1.getName()+" "+item1.getPrice());
		System.out.println(item2.getName()+" "+item2.getPrice());
		System.out.println(item3.getName()+" "+item3.getPrice());
	}
}
