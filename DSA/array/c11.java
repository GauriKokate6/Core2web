import java.util.*;

class Prefix2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Q:");
		int Q=sc.nextInt();
		System.out.println("enter n:");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int[] pArr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		pArr[0]=arr[0];
		for(int i=1;i<n;i++){
			pArr[i]=pArr[i-1]+arr[i];
		}
                int sum=0;
		for(int i=0;i<Q;i++){
			System.out.println("enter s:");
			int s=sc.nextInt();
			System.out.println("enter e:");
			int e=sc.nextInt();
			if(s==0){
				sum=pArr[e];
			}
			else{
			sum=pArr[e]-pArr[s-1];
                        }

			System.out.println("sum is" + sum);
		}
	}
}

			

