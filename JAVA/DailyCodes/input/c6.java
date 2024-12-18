import java.io.*;
class c6{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Name:");
		String name=br.readLine();
		System.out.println(name);
		br.close();

		System.out.println("Enter Clg Name:");
                String clgname=br.readLine();
                System.out.println(clgname);
	}
}
