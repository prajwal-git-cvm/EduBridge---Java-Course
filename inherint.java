package edubridgeJava;

class parent{
	int add(int a, int b) {
		
		return a + b;
		
	}
}

public class inherint extends parent{
	
	public static void main(String[] args) {
		inherint obj = new inherint();
		int sum = obj.add(8, 9);
		
		System.out.println(sum);
	}
}
