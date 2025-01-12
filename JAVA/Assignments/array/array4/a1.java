import java.util.*;

class a1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.println("enter size of an array:");
		int size=sc.nextInt();

		System.out.println("enter array elements:");
		int[] array = new int[size];

		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("average of numbers is " +(float) sum/size);
	}
}
			
