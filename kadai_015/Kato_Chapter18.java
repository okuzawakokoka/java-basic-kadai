package kadai_015;

abstract public class Kato_Chapter18 {
	//姓フィールド
		public String familyName = "加藤";
		//名フィールド
		public String givenName;
		
		//住所フィールド
		public String  address = "東京都中野区〇×";


		//共通のメソッド
		public void commonIntroduce() {
			
			System.out.println("名前は"+ this.familyName + this.givenName + "です");
			System.out.println("住所は"+ this.address + "です");
			
					}
			
		//抽象メソッド
		abstract public void eachIntroduce();
		
		//メソッド
		public void execIntroduce() {
			this.commonIntroduce();
			this.eachIntroduce();
			
		}
		
		
}
