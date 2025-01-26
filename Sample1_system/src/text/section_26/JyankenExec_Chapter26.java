package text.section_26;

public class JyankenExec_Chapter26 {

    public static void main(String[] args) {
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
        
        String myChoice = jyanken.getMyChoice(); // 自分の手を取得する
        String opponentChoice = jyanken.getRandom(); // 対戦相手の手を取得する
        
        jyanken.playGame(myChoice, opponentChoice); // ゲームを実行し、結果を出力する
    }
}
