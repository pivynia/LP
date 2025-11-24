class A {
	int a;
	void printA() {
		System.out.println("Значение переменной а: " + a);
	}
	int addInt(int b) {
		return a + b;
	}
}
class Pr001{
	public static void main(String args[]){
		A clA = new A();
		clA.printA();
		clA.a = 10;
		clA.printA();
		System.out.println("Результат выплнения метода aadInt() для clA:" + clA.addInt(15));
}
}
