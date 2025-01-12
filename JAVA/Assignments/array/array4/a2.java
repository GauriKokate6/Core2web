import java.io.*;

class a2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of an array:");
		int size=Integer.parseInt(br.readLine());
		int[] arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}

		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}

		System.out.println("difference between max and min is " + (max-min));
	}
}
