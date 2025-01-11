import java.io.*;

class a4{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int [] arr= {1,8,3,4,7,0};

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr[i]=0;
			}

			else{
				arr[i]=1;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");

	}}
}
