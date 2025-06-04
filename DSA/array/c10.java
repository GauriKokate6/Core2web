import java.util.*;

class Prefix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Q:");
		int Q=sc.nextInt();
		System.out.println("enter n:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<Q;i++){
			System.out.println("enter starting index");
			int s=sc.nextInt();

			System.out.println("enter ending index");
			int e=sc.nextInt();

			int sum=0;
			for(int j=s;j<=e;j++){
				sum+=arr[j];
			}

			System.out.println("sum is:" + sum);
		}
	}
}


