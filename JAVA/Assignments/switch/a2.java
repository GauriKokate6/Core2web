import java.io.*;

class a2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a grade");
		char ch=(char)br.read();
		switch(ch){
			case 'O':
				System.out.println("OUTSTANDING");
				break;

			case 'A':
				System.out.println("EXCELLANT");
				break;

			case 'B':
				System.out.println("VERY GOOD");
				break;

			case 'C':
				System.out.println("GOOD");
                                break;
		}
	}
}

