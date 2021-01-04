
public class GugudanMain {
	public static void main(String[] args) {
		for (int j = 2; j <10; j++) {
			// Gugudan의 calculate와 print 메소드를 활용해 구구단 구현하기
			int[] result = Gugudan2.calculate(j);
			Gugudan2.print(result);
			if( j == 9) {
				System.out.println("끝!");
				
			}
		}
	}

}
