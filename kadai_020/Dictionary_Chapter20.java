package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void reference(String[] words) {

		HashMap<String, String> eDictionaly = new HashMap<String, String>();

		eDictionaly.put("apple", "りんご");
		eDictionaly.put("peach", "桃");
		eDictionaly.put("banana", "バナナ");
		eDictionaly.put("lemon", "レモン");
		eDictionaly.put("pear", "梨");
		eDictionaly.put("kiwi", "キウィ");
		eDictionaly.put("strawberry", "いちご");
		eDictionaly.put("grape", "ぶどう");
		eDictionaly.put("muscat", "マスカット");
		eDictionaly.put("cherry", "さくらんぼ");

		for (String name : words) {
			if (eDictionaly.equals(name)) {
				System.out.println(name + "の意味は" + eDictionaly.get(name));
			} else {
				System.out.println(name + "は辞書に存在しません");
			}
		}
	}
}
