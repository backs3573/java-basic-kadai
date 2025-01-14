package kadai_018;

abstract public class Kato_Chapter18 {
//親クラスKato_Chapter18
	
	//姓を表すフィールド
	public String familyName = "加藤";
	//名を表すフィールド
	public String givenName;
	//住所を表す
	public String address = "東京都中野区○×";
	
	
	//コンストラクタで名字と住所の設定
	public Kato_Chapter18(String givenName) {
		this.givenName = givenName;
	}
	
	//共通紹介部分
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//各個人の紹介の部分
		abstract void eachIntroduce();	
		
	//自己紹介をまとめて出す
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
	
	
