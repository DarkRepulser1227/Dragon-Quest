package Dragon_Quest;

public class braveMan {
	private static int Hp;
	private static int Mp = 0;
	public braveMan() {
		
	}
	
	public braveMan(int level) {
		switch(level) {
		case 1:setHp(20);break;
		case 2:setHp(20);break;
		case 3:setHp(15);break;
		}
	}

	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getMp() {
		return Mp;
	}
	public void setMp(int mp) {
		Mp = mp;
	}
	
}
