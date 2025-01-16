import java.util.*;

class a10{
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
		System.out.println("corner elements are:"); 
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
			if((i==0 && j==0) || (i==0 && j==col-1) || (i==row-1 && j==0) || (i==row-1 && j==col-1)){
	                System.out.println(arr[i][j]);
			}
		}
		
		} 
		
	}
}

