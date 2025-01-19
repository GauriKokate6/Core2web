import java.util.*;
class s2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a str1:");
		String str1=sc.nextLine();
		System.out.println(System.identityHashCode(str1));
		System.out.println("enter a string to concat:");
		String str2=sc.nextLine();
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println("length of string is : " + str1.length());
	}
}
