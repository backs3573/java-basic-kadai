package text.section_26;

import java.util.Scanner;

public class Jyanken_Chapter26 {

    /**
    メソッド: getMyChoice
    自分のじゃんけんの手を入力し、取得する。
     */
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう:");
        String choice = scanner.nextLine().toLowerCase();
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。再度試してください:");
            choice = scanner.nextLine().toLowerCase();
        }
        return choice;
    }

    /**
    メソッド: getRandom
    対戦相手の手をランダムに取得する。
    */
    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int randomIndex = (int) (Math.random() * 3);
        return choices[randomIndex];
    }

    /**
    メソッド: playGame
    ゲームを実行し、結果を出力する。
    */
    public void playGame(String myChoice, String opponentChoice) {
        String result = "";
        if (myChoice.equals(opponentChoice)) {
            result = "引き分けです";
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            result = "自分の勝ちです";
        } else {
            result = "自分の負けです";
        }

        String myHand = convertToHand(myChoice);
        String opponentHand = convertToHand(opponentChoice);
        System.out.println("自分の手は" + myHand + "、対戦相手の手は" + opponentHand);
        System.out.println(result);
    }

    /**
    メソッド: convertToHand
    入力された文字を対応する手に変換します。
    */
    private String convertToHand(String choice) {
        switch (choice) {
            case "r":
                return "グー";
            case "s":
                return "チョキ";
            case "p":
                return "パー";
            default:
                throw new IllegalArgumentException("無効な手: " + choice);
        }
    }
}
