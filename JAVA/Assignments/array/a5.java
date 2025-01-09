import java.io.*;

class a5{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char arr[]=new char[5];
		System.out.println("enter characters:");
		for(int i=0;i<5;i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}

		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
	}
}
