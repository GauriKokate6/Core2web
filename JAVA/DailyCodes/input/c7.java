import java.io.*;

class c7{
	public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("enter company name: ");
	String compname=br.readLine();

	 System.out.print("enter employee name: ");
        String empname=br.readLine();
         
	System.out.println("company name " +compname);
	System.out.println("employee name " + empname);

	System.out.println("enter id");
	int id=Integer.parseInt(br.readLine());
	System.out.println(id);


	}
}
