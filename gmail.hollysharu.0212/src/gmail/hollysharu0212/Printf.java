package gmail.hollysharu0212;

public class Printf {

	public static void main(String[] args) {
		
		int a=8;
		int b=197;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("========================");
		
		//다섯 자리를 가지고 a를 출력하고 남는 자리는 0으로 채우기 
		System.out.printf("%05d\n", a);
		System.out.printf("%05d\n", b);
		
		System.out.println("========================");
		double d=3.2345234;
		System.out.println(d);
		
		//소수 셋째 자리까지 출력 - 넷째 자리에서 반올림
		System.out.printf("%.3f\n", d);
		//전체 자릿수 확보.셋째 자리부터 출력 
		System.out.printf("%6.3f\n", d);
		
		
	}
}
