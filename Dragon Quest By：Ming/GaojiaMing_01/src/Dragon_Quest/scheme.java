package Dragon_Quest;

import java.util.Random;


public class scheme {
	private static int Brave_Hp;
	private static int Brave_Mp;
	private static int Dragon_Hp;
	private static int Dragon_Mp;
	private static int BraveScheme;
	private static int DragonScheme;
	
	public scheme(int brave_Hp, int brave_Mp, int dragon_Hp, int dragon_Mp) {
		Brave_Hp = brave_Hp;
		Brave_Mp = brave_Mp;
		Dragon_Hp = dragon_Hp;
		Dragon_Mp = dragon_Mp;
	}
	public void choose(int choose) {
		BraveScheme = choose;
		dragonScheseNum();
		switch (BraveScheme) {
		case 1:
			dragonSchese();
			braveAttack();
			
			break;
		case 2:
			dragonSchese();
			braveSave();
			
			break;
		case 3:
			dragonSchese();
			braveAvoid();
			
			break;
		case 4:
			dragonSchese();
			braveThump();
			
			break;
		}
	}
	
	public static void setDragonScheme(int dragonScheme) {
		DragonScheme = dragonScheme;
	}
	
	public static int getDragonScheme() {
		return DragonScheme;
	}
	public void braveAttack() {
		if(Brave_Mp > 0) {
			Brave_Mp--;
			if(DragonScheme != 3) {//3是防御
				System.out.println("恶龙受到伤害！！！");
				Dragon_Hp--;
			}else {
				System.out.println("恶龙进行防御");
			}
		}else {
			System.out.println("MP不足");
		}
	}
	public void braveSave() {
		if(Brave_Mp < Brave_Hp) {
			Brave_Mp++;
			System.out.println("勇者MP+1");
		}else {
			System.out.println("勇者蓄力已达最大值");
		}
	}
	public void braveAvoid() {
		switch (DragonScheme) {
		case 1:
			System.out.println("成功闪避恶龙攻击");
			break;
		case 2:
			System.out.println("什么也没有发生");
			break;
		case 3:
			System.out.println("什么也没有发生");
			break;
		case 4:
			System.out.println("受到火焰攻击！！！");
			Brave_Hp-=2;
			break;
		}
	}
	public void braveThump() {
		if(Brave_Mp >= 3) {
			Dragon_Hp-=2;
			Brave_Mp-=2;
			System.out.println("重击击中恶龙！！！");
		}else {
			System.out.println("MP不足");
		}
	}
	
	public void dragonScheseNum() {
		Random ran = new Random();
		if(Dragon_Mp >= 4) {
			setDragonScheme(ran.nextInt(4)+1);
			switch(getDragonScheme()){
			case 1:
				System.out.println("恶龙选择攻击");
				break;
			case 2:
				System.out.println("恶龙选择蓄力");
				break;
			case 3:
				System.out.println("恶龙选择防御");
				break;
			case 4:
				System.out.println("恶龙选择使用火焰");
				break;
			}
		}else {
			setDragonScheme(ran.nextInt(3)+1);
			switch(getDragonScheme()){
			case 1:
				System.out.println("恶龙选择攻击");
				break;
			case 2:
				System.out.println("恶龙选择蓄力");
				break;
			case 3:
				System.out.println("恶龙选择防御");
				break;
		}
		
		}
	}
	public void dragonSchese() {
		switch (getDragonScheme()) {
		case 1:
			dragonAttack();
			break;
		case 2:
			dragonSave();
			break;
		case 3:
			dragonDefense();
			break;
		case 4:
			dragonFire();
			break;
		}
	}
	public void dragonAttack() {
		if(Dragon_Mp > 0) {
			Dragon_Mp--;
		}else {
			Dragon_Mp = 0;
		}
		if(BraveScheme != 3) {
			Brave_Hp--;
			System.out.println("恶龙成功攻击到勇者");
		}else {
			System.out.println("恶龙的攻击被闪避");
		}
	}
	public void dragonSave() {
		if(Dragon_Mp < Dragon_Hp) {
			Dragon_Mp++;
		}else {
			System.out.println("恶龙蓄力已达最大值");
		}
	}
	public void dragonDefense() {
		switch (BraveScheme) {
		case 1:
			System.out.println("恶龙防御了勇者的攻击");
			break;
		case 2:
			System.out.println("什么也没有发生");
			break;
		case 3:
			System.out.println("什么也没有发生");
			break;
		case 4:
			System.out.println("恶龙受到重击！！！");
			Dragon_Hp-=2;
			break;
		}
	}
	public void dragonFire() {
			Dragon_Mp -= 2;
			Brave_Hp -= 2;
			System.out.println("勇者受到火焰伤害！！！");
		
	}
	public static int getBrave_Hp() {
		return Brave_Hp;
	}
	public static void setBrave_Hp(int brave_Hp) {
		Brave_Hp = brave_Hp;
	}
	public static int getBrave_Mp() {
		return Brave_Mp;
	}
	public static void setBrave_Mp(int brave_Mp) {
		Brave_Mp = brave_Mp;
	}
	public static int getDragon_Hp() {
		return Dragon_Hp;
	}
	public static void setDragon_Hp(int dragon_Hp) {
		Dragon_Hp = dragon_Hp;
	}
	public static int getDragon_Mp() {
		return Dragon_Mp;
	}
	public static void setDragon_Mp(int dragon_Mp) {
		Dragon_Mp = dragon_Mp;
	}
	
}
