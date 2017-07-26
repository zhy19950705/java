package character;

public class Hero {
	private String name;
	private float hp;
	private float hujia;
	private float mokang;
	private float damage;
	private String speakWhenKill;
	private String speakWhenDead;

	public void keng() {
		System.out.println("坑队友！");
	}

	public void legenderay() {
		System.out.println("玩家" + name + "超神了！");
	}

	public void recovery(float blood) {
		hp += blood;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getHujia() {
		return hujia;
	}

	public void setHujia(float hujia) {
		this.hujia = hujia;
	}

	public float getMokang() {
		return mokang;
	}

	public void setMokang(float mokang) {
		this.mokang = mokang;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public String getSpeakWhenKill() {
		return speakWhenKill;
	}

	public void setSpeakWhenKill(String speakWhenKill) {
		this.speakWhenKill = speakWhenKill;
	}

	public String getSpeakWhenDead() {
		return speakWhenDead;
	}

	public void setSpeakWhenDead(String speakWhenDead) {
		this.speakWhenDead = speakWhenDead;
	}
}
