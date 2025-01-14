package kadai_21;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
		
	//HashMapのdictionaryをインスタンス化
	HashMap<String,String> dictionary = new HashMap<>();
	
	//コンストラクタで辞書に10通りの英単語と意味を追加する
	public Dictionary_Chapter21() {
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃" );
	dictionary.put("banana","バナナ" );
	dictionary.put("lemomn","レモン" );
	dictionary.put("pear","梨" );
	dictionary.put("kiwi","キウィ" );
	dictionary.put("stawberry","いちご" );
	dictionary.put("grape","ぶどう" );
	dictionary.put("muscat","マスカット" );
	dictionary.put("cherry","さくらんぼ" );
	}

    //指定された英単語の意味を返すメソッド
public String getMeaning(String word) {
	return dictionary.getOrDefault(word,"辞書に載ってません");
	}
	
}
