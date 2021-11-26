package exception;

public class Exception02 {
	public static void main(String[] args) {
		try { 
			//例外が発生する可能性がある処理を記述
			System.out.println("100　÷ 0 は？");
			// 0で割るので例外が発生
			int result = 100 / 0;
			System.out.println("計測結果" + result);
		// ArithmeticExceptionクラスの例外が発生した場合の例外処理
		} catch (ArithmeticException e) {
			// 例外クラスが一致するので、例外処理が実行される
			System.out.println("例外が発生");
		} finally {
			// 例外発生しても処理を実行
			System.out.println("プログラム終了");
		}
	}
}
