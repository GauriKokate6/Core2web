import java.util.*;

class a4{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("enter the element you want to find:");
		int ele=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				System.out.println("element found at index" + i );
			}
			

		}
		
	}
}
}
