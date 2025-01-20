import java.util.*;

class a3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");;
		char size=sc.next().charAt(0);

		switch(size){
			case 'S':
				System.out.println("small");
				break;
			case 'M':
				System.out.println("medium");
				break;
			case 'L':
				System.out.println("large");
				break;
			default:
				System.out.println("size not exist");
		}
	}
}
