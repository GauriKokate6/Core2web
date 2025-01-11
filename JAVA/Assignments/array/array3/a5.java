import java.io.*;

class a5{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr={-1,3,7,-5,8,9,-6};
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr[i]=arr[i]*arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
