package character;

public class Mangzai {
	public static void main(String[] args) {
		Hero Mangzai = new Hero();
		Mangzai.setName("����");
		Mangzai.setHp(570);
        Mangzai.setDamage(10);
        Mangzai.setSpeakWhenDead("С���Ŀٽ�Ϲ");
        Mangzai.setSpeakWhenKill("С����������");
        System.out.println(Mangzai.getName()+"\n"+Mangzai.getHp()+"\n"+Mangzai.getDamage()+"\n"+Mangzai.getSpeakWhenDead()+"\n"+Mangzai.getSpeakWhenKill());
	}

}
