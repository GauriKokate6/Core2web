import java.util.*;

class a6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=sc.nextInt();

		char[] arr =new char[size];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
                 int count=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				count+=1;
			}
		}

		System.out.println("number of vowels in array is:" +count);
		System.out.println("number of consonents in an array is :" +(size-count));
	}
}
