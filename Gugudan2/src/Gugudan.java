import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while(01 <= number) {
			if (number <2) {
				System.out.println("2이하의 수를 입력하였습니다. 다시 입력해 주세요");
				number = scanner.nextInt();
				continue;
			} else if (number > 9) {
				System.out.println("10이상의 숫자를 입력하였습니다. 2~9 사이의 숫자를 입력해 주세요");
				number = scanner.nextInt();
				continue;
			} else {
				System.out.println("number : " + number);
				for (int i = 1 ; i<10; i++) {
					System.out.println(number + " x " + i + " : " + number * i);
			
		}
		break;	
		}
		
			
		}
	System.out.println("끝!");	
	}

}
