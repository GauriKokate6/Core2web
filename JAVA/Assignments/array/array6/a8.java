import java.util.*;

class a8{
	public static void main(String[] arg){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		char[] arr= new char[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}

		System.out.println("before reverse:");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
			System.out.println(arr[i]);
			}
		}
			char[] arr2=new char[size];
                
		for(int i=0;i<arr.length;i++){
			
			arr2[i]=arr[size-i-1];
		}

		System.out.println("after reverse:");
		for(int i=0;i<arr.length;i+=2){
			
			System.out.println(arr2[i]);
			
		}
	}
}
