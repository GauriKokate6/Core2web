import java.util.*;

class a6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		  
		System.out.println("enter key:");
		int key=sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]%key==0){
				System.out.println("an element multiple of " + key +  " found at index :" + i);
			}
		}
	}
}
