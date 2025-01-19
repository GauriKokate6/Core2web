import java.util.*;
class s4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a str1:");
		String str1=sc.nextLine();
		System.out.println(System.identityHashCode(str1));
		System.out.println("enter a str2");
		String str2=sc.nextLine();
		int diff=str1.compareTo(str2);
		//System.out.println(str1);
		//System.out.println(System.identityHashCode(str1));
		System.out.println("difference is : " + diff);
	}
}
