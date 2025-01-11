import java.util.*;

class a6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int product=1;
		
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
				product*=arr[i];
			
			}
		
		}
			System.out.println("product of odd indexed elements is:" +product);
		}
}

				
		
