import java.io.*;

class a1{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter size of an array:");
		int size=Integer.parseInt(br.readLine());
		int[] arr =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		 boolean isDes=true;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				isDes=false;
				break;
		
			
		
			}
		}
		if(isDes){
			System.out.println("array is in descending order.");
		}
		else{
			System.out.println("array not in descending order.");
		}
	}
}

