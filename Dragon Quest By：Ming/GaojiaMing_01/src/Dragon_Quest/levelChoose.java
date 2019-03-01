package Dragon_Quest;

public class levelChoose {
	private int level;
	public levelChoose() {
		
	}
	public String toString(){
		return ("\n请选择难度1.娱乐 2.挑战 3.噩梦");
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
