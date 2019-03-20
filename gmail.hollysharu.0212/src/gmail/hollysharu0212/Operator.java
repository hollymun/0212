package gmail.hollysharu0212;

public class Operator {

	public static void main(String[] args) {
		int a=-5;
		System.out.printf("~a:%d\n", ~a);
		
		int b=10;
		b++;
		System.out.printf("b: %d\n", b);
		b--;
		System.out.printf("b: %d\n", b);

		//연산 도중에 ++나 --를 사용하면 코드에 가독성이 떨어짐 
		//사용하지 않는 것을 권장 
		System.out.printf("b++: %d\n", b++);
		System.out.printf("=>b: %d\n", b);
		System.out.printf("++b: %d\n", ++b);
		System.out.printf("=>b: %d\n", b);
		
		int c=0;
		//int result=++c + ++c;
		int result=c++ + c++;
		System.out.printf("result: %d\n",result);
		System.out.printf("c: %d\n",c);
		
		
		
		 int money=45390;
		 //10의 자리에서 반올림해서 45400원으로 출력 

	/*	 방법1> 형변환 이용 
		 double x=money/100.0;
		 int y=(int)(x+0.5);
		 int kk=y*100;
		 System.out.printf("kk: %d\n", kk);
	*/	 
		 
		//방법2>
		money=(money+50);
		double x=money/100.0;
		int y=(int)x*100;
		 
		System.out.printf("money: %d\n", money);
		System.out.printf("x: %f\n", x);
		System.out.printf("y: %d\n", y);
		
	}
}
