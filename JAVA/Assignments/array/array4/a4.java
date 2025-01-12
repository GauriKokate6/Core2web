import java.util.*;

class a4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to check:");
		int check=sc.nextInt();
                int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==check){
				count+=1;
			}
		}

		if(count==2){
			System.out.println("number occured two times");
		}

		else if(count>2){
			System.out.println("number occured more than 2 times");

		}

		else{
			System.out.println("number occured less than 2 times");
		}
	}
}
