import java.util.*;

class p6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("num1:");
		int num1=sc.nextInt();
		System.out.println("num2:");
                int num2=sc.nextInt();
		int sum = 0;
		for(int i=num1;i<=num2;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}
