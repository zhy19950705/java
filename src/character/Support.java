package character;

public class Support extends Hero{
	
	public void heal(){
		
	}
	
	public void heal(Hero h){
		System.out.println("Ϊ"+h.getName()+"��������");
	}
	
	public void heal(Hero h,int hp){
		h.setHp(h.getHp()+hp);
		System.out.println(h.getName()+"��ǰ��"+h.getHp()+"��Ѫ");
	}
	
	public static void main(String[] args) {
		Support fengnv=new Support();
		fengnv.setName("��Ů");
		
		Hero h1=new Hero();
		h1.setName("�Ϲ�");
		h1.setHp(250);
		
		fengnv.heal(h1);
		fengnv.heal(h1, 20);
	}

}
