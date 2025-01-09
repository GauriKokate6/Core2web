import java.io.*;

class a2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array elements:");
		int arr[] = new int[10];
		for(int i=0;i<10;i++){
			System.out.println("enter element :");
			arr[i]=Integer.parseInt(br.readLine());
		}

			System.out.println("array elements are:");
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
	}
}


