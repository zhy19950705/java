package character;

public class Support extends Hero{
	
	public void heal(){
		
	}
	
	public void heal(Hero h){
		System.out.println("为"+h.getName()+"进行治疗");
	}
	
	public void heal(Hero h,int hp){
		h.setHp(h.getHp()+hp);
		System.out.println(h.getName()+"当前有"+h.getHp()+"点血");
	}
	
	public static void main(String[] args) {
		Support fengnv=new Support();
		fengnv.setName("风女");
		
		Hero h1=new Hero();
		h1.setName("瓜瓜");
		h1.setHp(250);
		
		fengnv.heal(h1);
		fengnv.heal(h1, 20);
	}

}
