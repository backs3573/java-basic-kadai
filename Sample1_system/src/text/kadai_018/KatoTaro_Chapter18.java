package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	//名を表すフィールド
	public  KatoTaro_Chapter18() {
		this.setGivenName();
		this.commonIntroduce();
	}

	private void setGivenName() {
		givenName = "太郎";
	}

	//@Overide
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");

	}

}