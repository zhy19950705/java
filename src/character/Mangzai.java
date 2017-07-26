package character;

public class Mangzai {
	public static void main(String[] args) {
		Hero Mangzai = new Hero();
		Mangzai.setName("李青");
		Mangzai.setHp(570);
        Mangzai.setDamage(10);
        Mangzai.setSpeakWhenDead("小锋锋的抠脚瞎");
        Mangzai.setSpeakWhenKill("小晗晗真厉害");
        System.out.println(Mangzai.getName()+"\n"+Mangzai.getHp()+"\n"+Mangzai.getDamage()+"\n"+Mangzai.getSpeakWhenDead()+"\n"+Mangzai.getSpeakWhenKill());
	}

}
