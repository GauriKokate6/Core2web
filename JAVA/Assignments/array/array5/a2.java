import java.util.*;

class a2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int sum1=0;
		int sum2=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sum1+=arr[i];
			}
			else{
				sum2+=arr[i];
			}
		}
		System.out.println("sum of even elements is :" +sum1);
		System.out.println("sum of odd elements is :" +sum2);
	}
}

