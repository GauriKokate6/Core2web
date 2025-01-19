import java.util.*;

class s10{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		if(!str.isEmpty()){
		System.out.println(str.charAt(str.length()-1));
		}
		else{
			System.out.println("string is empty");
		}
	}
}
