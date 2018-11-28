
public class AnotherTest {
	
	public void method1() {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Summan är: " + sum);
				sum = sum + i;
//				sum = sum + j;
//				sum++;
			}
			System.out.println("Summan blir: " + sum);
		}
	}
	public static void main(String[] args) {
		AnotherTest t2 = new AnotherTest();
		t2.method1();
	}

}
