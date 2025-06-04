import java.util.*;

class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter array size");
		int N=sc.nextInt();
		int[] arr=new int[N];
		System.out.println("enter array elements:");

		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("enter no of queries:");
		int Q=sc.nextInt();

		for(int i=0;i<Q;i++){
			System.out.println("enter start element");
			int s=sc.nextInt();
			System.out.println("enter end element");
			int e=sc.nextInt();
			int sum=0;
			for(int j=s;j<=e;j++){
				sum+=arr[j];
			}
			System.out.println(sum);
		}

	}
}
				

		
