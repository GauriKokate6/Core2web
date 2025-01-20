import java.io.*;

class a1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int num=Integer.parseInt(br.readLine());
		switch(num%2){
			case 0:
				System.out.println("even");
				break;

			case 1:
				System.out.println("odd");
				break;
		}
	}
}

