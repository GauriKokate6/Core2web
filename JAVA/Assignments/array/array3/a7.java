import java.util.*;

class a7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4};
		for(int i=0;i<arr.length;i++){
			if(arr.length%2!=0 && arr.length>=5){
				if(arr[i]%2!=0){
				System.out.println(arr[i]);
			}
			}
			else{
				if(arr[i]%2==0){
					System.out.println(arr[i]);
				}
			}
		}
	}
}
				
