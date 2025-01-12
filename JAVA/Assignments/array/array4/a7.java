import java.util.*;

class a7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();

		char[] arr =new char[size];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
                 

		for(int i=0;i<arr.length;i++){
			if(arr[i]>='a' && arr[i]<='z'){
                         arr[i]=(char)(arr[i]-32);
			}
	  	}


		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}


	     
	}
}
