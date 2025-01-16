import java.util.*;

class a5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter column size");
		int col=sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
		         sum+=arr[j][i];
			}
			
			System.out.println("sum of column is  "+ (i+1)+ " " + sum);
		
		}
	}
}
