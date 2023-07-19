
public class Arithmeticoperation {
	public static void main(String[]args)
	{
		int res1=subractNumber(20,5);
		int res2=multiplyNumber(4,5);
		double res3=divideNumber(20,4);
		int res4=findRemainderNumber(10,3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.printf("%.2f\n",res3);
		System.out.println(res4);
	}
		public static int subractNumber(int num1,int num2)
		{
			return num1-num2;
		}
		public static int multiplyNumber(int num1,int num2)
		{
			return num1*num2;
		}
		public static double divideNumber(int num1,int num2)
		{
			return num1/num2;
		}
		public static int findRemainderNumber(int num1,int num2){
			{
			return num1%num2;
			}
		
		}
}
