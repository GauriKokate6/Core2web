import java.util.*;

class a7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter col size:");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
               		}
		System.out.println("product of primary elements of diagonal is :"); 
		int product=1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==j){
					product*=arr[i][j];
					
			}
		}
		} 
		System.out.println(product);
	}
}
