import java.io.*;

class a1{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+ "  ");
		}
	}
}
