
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		
		//break文が実行されると、以降のcase文は評価されずに、switch処理を終了する
		
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
			
		//全てのcase文と一致しない場合、default内のブロックの処理が実行される。必須ではない
			
		default:
			System.out.println("がんばろう！");
		}
	}
}
