import java.io.*;

class a4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		System.out.println("enter array elements:");

		for(int i=0;i<10;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("sum is:");
                int sum=0;
		for(int i=0;i<10;i++){
			if(arr[i]%2!=0){
			sum+=arr[i];
			
		}}
                System.out.println(sum);
	}
		
}
