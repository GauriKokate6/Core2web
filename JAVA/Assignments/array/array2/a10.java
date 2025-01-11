import java.io.*;

class a10{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of an array:");
		int size=Integer.parseInt(br.readLine());

		System.out.println("enter array elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
                int max=arr[0]; 
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
		
			}
		
		}
		System.out.println("minimum number in the array is:" + max);
	}
}
