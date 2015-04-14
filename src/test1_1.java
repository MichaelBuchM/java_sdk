
public class test1_1 {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		int test_5 = 1;
		int test_3 = 1;
		for (int i = 1 ; i <= 100 ; i++){
			test_5 = i % 5;
			test_3 = i % 3;
			if (test_3 == 0 && test_5 == 0){
				System.out.println("FizzBuzz");
				
			
			}
			else if (test_3 == 0){
				System.out.println("Fizz");
				
			}
			else if (test_5 == 0){
				System.out.println("Buzz");
				
			}
			else {
				System.out.println(i);
			}

		}

	}

}
