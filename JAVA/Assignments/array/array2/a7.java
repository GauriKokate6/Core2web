import java.io.*;

class a7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of an array:");
		int size=Integer.parseInt(br.readLine());

		System.out.println("enter array elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
                 System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++){
			if(size%2==0){
			if(i%2==0){
				System.out.println(arr[i]);
			}
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}
