
public class DoWhile01 {
	public static void main(String[] args) {
		
		//do-while文は処理を行ってから評価を行うので最初の一回は必ずブロック内の処理を行う
		
		int number = 100;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}
}
