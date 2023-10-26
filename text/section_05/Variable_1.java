package text.section_05;

public class Variable_1 {

	public static void main(String[] args) {
        // 整数型の変数を宣言
        byte  testByte  = 1;
        short testShort = 12;
        int   testInt   = 123;
        long  testLong  = 1234;

        // 浮動小数点型の変数を宣言
        float  testFloat  = 0.123F;  // 代入する値の末尾にはFが必要
        double testDouble = 0.123456;

        // 論理型の変数を宣言
        boolean testBoolean = true;

        // 文字列型・文字型の変数を宣言
        String testString = "Samurai";
        char   testChar   = 'S';

        // 変数testの値を表示
        System.out.println(testByte);
        System.out.println(testShort);
        System.out.println(testInt);
        System.out.println(testLong);
        System.out.println(testFloat);
        System.out.println(testDouble);
        System.out.println(testBoolean);
        System.out.println(testString);
        System.out.println(testChar);
        
        //変数testに123をセット
        int test=123;
        System.out.println(test);
        //変数testの中身を456に入替え
        test=456;
        System.out.println(456);
        
	}

}
