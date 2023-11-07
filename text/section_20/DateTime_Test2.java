package text.section_20;

import java.util.Calendar;
import java.util.Date;

public class DateTime_Test2 {

   public static void main(String[] args) {
      //現在日時を取得する
	Date date = new Date();
	
	//Calendarクラスのオブジェクトを生成する
	Calendar calendar = Calendar.getInstance();
	
	//Dateクラスで日時を設定する
	calendar.setTime(date);
	
	//任意の年月日を取得して、出力する
	System.out.println("年は"+calendar.get(calendar.YEAR));
      //CalendarクラスのMONTHは0から始まるので、実行結果の1は2月を示します。
	System.out.println("月は"+(calendar.get(calendar.MONTH) + 1));
	System.out.println("日は"+calendar.get(calendar.DATE));
	
	//任意の時分秒を取得して、出力する
	System.out.println("時間は"+calendar.get(calendar.HOUR));
	System.out.println("分は"+calendar.get(calendar.MINUTE));
	System.out.println("秒は"+calendar.get(calendar.SECOND));
	
   }

}
