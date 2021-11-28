package extend.phone;

// interfaceで宣言。「public」か「package-private (何も書かない)」だけ
// interfaceはinterfaceを継承することができる
public interface Phone {
	// フィールドの宣言 (定数)
	final int MAX_NUMBER_DIGITS = 11;
	
	// public abstractが自動で追加される (抽象メソッド)
	public void call(String number);
	
	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}
