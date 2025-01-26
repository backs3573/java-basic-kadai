package text.kadai_018;

abstract public class Kato_Chapter18 {

	//姓を表すフィールド
	public String familyName = "加藤";
	//名を表すフィールド
	public String givenName;
	//住所を表すフィールド
	public String address = "東京都中野区○×です";

	//共通の紹介をするメソッド
	public void commonIntroduce() {

		System.out.println("名前は" +familyName + givenName);
		System.out.println("住所は" + address);
	}

	//個別の紹介を出力する
	abstract public void eachIntroduce();

	//紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
	}
}
