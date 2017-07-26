package property;

public class Weapon extends Item{
    private int damage;
    public Weapon(){
    	
    };
    public Weapon(String name,int price,int damage){
    	this.setName(name);
    	this.setPrice(price);
    	this.damage=damage;
    }
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public static void main(String[] args) {
		Weapon infinityEdge=new Weapon();
		infinityEdge.setPrice(3600);
		infinityEdge.setName("ÎÞ¾¡Ö®ÈÐ");
		infinityEdge.setDamage(65);
		System.out.println(infinityEdge.getName()+" "+infinityEdge.getPrice()+" "+infinityEdge.getDamage());
	}
}
