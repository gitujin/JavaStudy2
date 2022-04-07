package CHAPTER14.EX04_MultiCatch_3;

public class MultiCatch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. catch 블록을 각각 처리했을 때
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		// 2. catch 블록을 하나로 통합했을 때
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException|NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
	}	

}
