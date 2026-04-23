package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
//自分のじゃんけんの手を入力する
	public static String getMyChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		return sc.next();
	
	}
	//対戦相手のじゃんけんの手を乱数で選ぶ
		public static String getRandom() {
			String[]hands = {"r","s","p"};
			int index = (int)Math.floor(Math.random()*3);
			return hands[index];
			
			
		}
		
			
		
		//じゃんけんを行う
			public static void playGame(String my,String cpu) {
				
				//HashMap
				HashMap<String,String> handMap = new HashMap<>();
				handMap.put("r","グー");
				handMap.put("s","チョキ");
				handMap.put("p","パー");
				
				
				System.out.println(
						"自分の手は" + handMap.get(my) +
						",対戦相手の手は" + handMap.get(cpu)
						);
				
				//勝敗判定
				if(my.equals(cpu)) {
					System.out.println("あいこです");
				}else if(
						(my.equals("r") && cpu.equals("s"))||
						(my.equals("s") && cpu.equals("p"))||
						(my.equals("p") && cpu.equals("r"))
						) {
					
					System.out.println("自分の勝ちです");
				}else {
					System.out.println("自分の負けです");
					
					
				}
			}
		
	}

