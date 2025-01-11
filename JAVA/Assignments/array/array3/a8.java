import java.util.*;


class a9{
	public static void main(String[] args){
		int[] arr={1,6,8,3,5,9};

		for(int i=0;i<arr.length;i++){
			for(int j=2;j<=Math.sqrt(arr[i]);j++){
				if(arr[i]%j==0){
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
