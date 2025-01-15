import java.util.*;

class a9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			int original=arr[i];
			int temp=arr[i];
			int reversed=0;


			while(temp!=0){
				int rem=temp%10;
				reversed=reversed*10+rem;
				temp/=10;
			}
			if(original==reversed){
				count++;
			}

		}
		System.out.println("count is " + count);
	}
}
