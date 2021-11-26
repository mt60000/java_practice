
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		
		//条件式の評価がfalseになるまでブロック内の処理を繰り返す
		
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}
}
