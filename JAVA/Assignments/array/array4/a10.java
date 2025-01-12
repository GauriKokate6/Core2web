import java.util.*;

class a10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();

		char[] arr =new char[size];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
                 
                System.out.println("enter character key:");
		char key=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++){
			if(arr[i]<key){
                         System.out.println(arr[i]);
			}
	  	}



	     
	}
}
