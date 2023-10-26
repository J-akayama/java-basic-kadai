package text.section_08;

public class SwitchSyntax_1 {
    public static void main(String[] args) {

        // 0～9のいずれかをランダムに生成
        int randNum = (int)(Math.random() * 10);

        // 乱数randNumの値を出力
        System.out.println(randNum);

        // 当たりはずれの判定
        switch(randNum) {
            case 9  -> System.out.println("大っしろたん");
            case 8  -> System.out.println("当たりたん");
	      default -> System.out.println("はずれたん");
        }
    }
}

