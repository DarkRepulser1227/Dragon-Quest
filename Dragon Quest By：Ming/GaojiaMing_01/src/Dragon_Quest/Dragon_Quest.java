package Dragon_Quest;

import java.util.Scanner;

public class Dragon_Quest {
	public static void main(String[] args) {
		page page = new page();
		levelChoose L = new levelChoose();
		Scanner in = new Scanner(System.in);
		
		page.homePage();
		/*
		 * 设置难度等级
		 */
		System.out.println(L.toString());
		int level = in.nextInt();
		L.setLevel(level);
		/*
		 * 创建勇者与恶龙对象
		 */
		braveMan braveMan = new braveMan(level);
		dragon dragon = new dragon(level);
		/*
		 * 创建HPMP动态信息并传参
		 */
		HPMP hpmp = new HPMP(braveMan.getHp(),braveMan.getMp(),dragon.getHp(),dragon.getMp());
		page.divisionLine();
		hpmp.information();
		page.divisionLine();
		page.schemePage();
		
		int choose;
		/*
		 * 每一次的勇者行动的选择与对应的魔王选择
		 */
		scheme scheme = new scheme(braveMan.getHp(),braveMan.getMp(),dragon.getHp(),dragon.getMp());
		
		while(dragon.getHp() > 0&&braveMan.getHp() > 0) {
			choose = in.nextInt();
			scheme.choose(choose);
			braveMan.setHp(scheme.getBrave_Hp());braveMan.setMp(scheme.getBrave_Mp());
			dragon.setHp(scheme.getDragon_Hp());dragon.setMp(scheme.getDragon_Mp());
			hpmp.setHPMP(braveMan.getHp(),braveMan.getMp(),dragon.getHp(),dragon.getMp());
			page.divisionLine();
			hpmp.information();
			page.divisionLine();
		}
		page.engPage();
	}
}
