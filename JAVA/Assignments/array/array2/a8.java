import java.io.*;

class a8{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of an array:");
		int size=Integer.parseInt(br.readLine());

		System.out.println("enter array elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
                 
		for(int i=0;i<arr.length;i++){
			if(arr[i]>5 && arr[i]<9){
			
				System.out.println(arr[i] + "is greater than 5 but less than 9");
			}
		
		}
	}
}
