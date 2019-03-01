package Dragon_Quest;

public class page {
	public page() {
		
	}
	void homePage() {
		System.out.printf("\n\t\t勇者斗恶龙\n\n");
		System.out.println("by:Ming");
		System.out.println();
		System.out.printf("说明：勇者的操作方式为以下所示：\n\t使用攻击消耗1Mp 伤害1Hp\n\t使用蓄力可以增加1Mp 伤害0Hp\n\t使用闪避需消耗0Mp 伤害0Hp\t躲避攻击\n\t使用重击消耗3Mp 伤害2Hp\t防御无效");
	}
	void schemePage() {
		System.out.println("你要做什么：\n1.攻击\t2.蓄力\n3.躲闪\t4.重击");
	}
	void engPage() {
		System.out.println("游戏结束 谢谢参与");
	}
	void divisionLine() {
		System.out.println("=======================================================");
	}
}
