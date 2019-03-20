package gmail.hollysharu0212;

public class DataType2 {

	public static void main(String[] args) {
	
		//0.1을 1000번 더하면 100.0이 나와야 하는데 이상한 결과 출력
		//소수는 정확하게 표현할 수 없는 경우가 생기기 때문
		double d=0.1;
		double sum=0.0;
		for(int i=0; i<1000; i=i+1) {
			sum=sum+d;
		}
		System.out.println("합계: "+sum);
		
		//실수 연산을 여러 번 해야 할 때는 정수로 변경한 후 연산하고 실수로 변경
		double d2=0.1;
		double sum2=0.0;
		for(int i=0; i<1000; i=i+1) {
			sum2=sum2+(d2*10);
		}
		System.out.println("합계: "+(sum2/10));
		
		//실수 연산 결과값은 false 
		boolean pan=(2.0-1.8)==0.2;
		System.out.println("실수를 그대로 연산하면: "+pan); 
		
		//가장 큰 숫자보다 더 큰 숫자를 저장해서
		//Overflow가 발생해서 음수가 나옴 				=>long 자료형으로 사용하면 됨 
		int n=2147483647;
		int result=n+1;
		System.out.println("overflow 결과: "+result);

		//가장 작은 숫자보다 더 작은 숫자를 저장
		//Underflow가 발생해서 양수가 나옴 
		n=-2147483648;
		result=n-1;
		System.out.println("underflow 결과: "+result);

		
	}

}
