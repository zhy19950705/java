package property;

public class Hujia extends Item{
	private int ac;
    public Hujia(int ac,String name,int price){
    	this.ac=ac;
    	this.setName(name);
    	this.setPrice(price);
    }
	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}
	public static void main(String[] args) {
		Hujia bujia=new Hujia(15,"²¼¼×",300);
		Hujia suozijia=new Hujia(40,"Ëø×Ó¼×",700);
		System.out.println(bujia.getName()+" "+bujia.getPrice()+" "+bujia.getAc());
		System.out.println(suozijia.getName()+" "+suozijia.getPrice()+" "+suozijia.getAc());
		
		
	}

}
