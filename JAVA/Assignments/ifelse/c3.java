import java.util.*;

class c3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a char:");
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='e' || ch=='a' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='U' || ch=='u'){
			System.out.println("a vowel");
		}
		else{
			System.out.println("it is a consonant");
		}
	}
}

