package extend.animal;

//Abstract(意味： 概要)抽象クラスとして宣言する
public abstract class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
	//サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}
