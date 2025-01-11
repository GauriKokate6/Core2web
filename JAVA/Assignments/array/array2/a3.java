import java.io.*;

class a3{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter size");
		int size=Integer.parseInt(br.readLine());
		char[] arr = new char[size];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=(char)br.read();
			br.skip(1);
		}
		for(int i =0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'|| arr[i]=='A'|| arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				System.out.println("vowel" + arr[i] + " found at index " + i);
			}
		}
	}
}
