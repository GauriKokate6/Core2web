import java.util.*;

class a7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			int element=sc.nextInt();
			if(element>=65 && element<=90){
				arr[i]=(char)element;
			}
			else{
				arr[i]=element;
		}
		}

		  
	

		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "  ");
		}
	}
	}

