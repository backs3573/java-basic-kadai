package kadai_21;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        
        // Dictionary_Chapter21クラスのオブジェクトを作る
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        
        // 英単語の意味を出力する
        System.out.println("りんごの英単語は " + dictionary.getMeaning("apple"));
        System.out.println("バナナの英単語は " + dictionary.getMeaning("banana"));
        System.out.println("ぶどうの英単語は " + dictionary.getMeaning("grape"));
        System.out.println("オレンジの英単語は " + dictionary.getMeaning("orange"));
    }
}
