import java.util.*;

class a3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean isPal=true;
                
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]!=arr[size-1-i]){
			isPal=false;
			break;
			}

		}
		
		if(isPal){
			System.out.println("Array is Palindrome");
		}

		else{
			System.out.println("Array is not a palindrome");
		}

	}
}

