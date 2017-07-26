package character;

public class ADHero extends Hero{
   public void attack(){
	   System.out.println(getName()+"������һ�ι��� �����ǲ�ȷ������˭��");
   }
   
   public void attack(Hero...heros){
	   for(int i=0;i<heros.length;i++){
		   System.out.println(getName()+"������"+heros[i].getName());
		   heros[i].setHp(heros[i].getHp()-getDamage());
	   }
   }
   public static void main(String[] args) {
	ADHero bf=new ADHero();
	bf.setName("�ͽ�����");
	bf.setDamage(20);
	
	Hero h1=new Hero();
	h1.setName("����");
	h1.setHp(500);
	Hero h2=new Hero();
	h2.setName("��Ī");
	h2.setHp(600);
	
	bf.attack(h1);
	System.out.println(h1.getName()+h1.getHp());
	bf.attack(h1,h2);
	System.out.println(h1.getName()+h1.getHp());
	System.out.println(h2.getName()+h2.getHp());
	
}
}
