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

		//���� ���߿� ++�� --�� ����ϸ� �ڵ忡 �������� ������ 
		//������� �ʴ� ���� ���� 
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
		 //10�� �ڸ����� �ݿø��ؼ� 45400������ ��� 

	/*	 ���1> ����ȯ �̿� 
		 double x=money/100.0;
		 int y=(int)(x+0.5);
		 int kk=y*100;
		 System.out.printf("kk: %d\n", kk);
	*/	 
		 
		//���2>
		money=(money+50);
		double x=money/100.0;
		int y=(int)x*100;
		 
		System.out.printf("money: %d\n", money);
		System.out.printf("x: %f\n", x);
		System.out.printf("y: %d\n", y);
		
	}
}
