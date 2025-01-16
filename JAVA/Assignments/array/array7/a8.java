import java.util.*;

class a8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter col size:");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
               		}
		System.out.println("product of secondary diagonal elements is :"); 
		int product=1;
		
		for(int i=0;i<arr.length;i++){
			
			int l =arr[i].length;
			product*=arr[i][l-i-1];
		}
		System.out.println(product);
		} 
		
	}

