package Dragon_Quest;

public class HPMP {
	private int Brave_Hp;
	private int Brave_Mp;
	private int Dragon_Hp;
	private int Dragon_Mp;
	public HPMP(int Brave_Hp,int Brave_Mp,int Dragon_Hp,int Dragon_Mp) {
		this.Brave_Hp = Brave_Hp;
		this.Brave_Mp = Brave_Mp;
		this.Dragon_Hp = Dragon_Hp;
		this.Dragon_Mp = Dragon_Mp;
	}
	int flag = 0;
	void Brave_HP(){
		
		for(flag = 0;flag < Brave_Hp;flag++) {
			System.out.printf("*");
		}
		 
	}
	void Brave_MP(){
		
		for(flag = 0;flag < Brave_Mp;flag++) {
			System.out.printf("*");
		}
		 
	}
	void Dragon_HP() {
		
		for(flag = 0;flag < Dragon_Hp;flag++) {
			System.out.printf("*");
		}
	}
	void Dragon_MP() {
		
		for(flag = 0;flag < Dragon_Mp;flag++) {
			System.out.printf("*");
		}
	}
	void information() {
		System.out.printf("ÓÂÕß£º\tHP ");Brave_HP();
		System.out.printf("\t%d\n",this.Brave_Hp);
		System.out.printf("\tMP ");Brave_MP();
		System.out.printf("\t%d\n",this.Brave_Mp);
		System.out.printf("¶ñÁú£º\tHP ");Dragon_HP();
		System.out.printf("\t%d\n",this.Dragon_Hp);
		System.out.printf("\tMP ");Dragon_MP();
		System.out.printf("\t%d\n",this.Dragon_Mp);
	}
	public void setHPMP(int Brave_Hp,int Brave_Mp,int Dragon_Hp,int Dragon_Mp) {
		this.Brave_Hp = Brave_Hp;
		this.Brave_Mp = Brave_Mp;
		this.Dragon_Hp = Dragon_Hp;
		this.Dragon_Mp = Dragon_Mp;
	}
}
