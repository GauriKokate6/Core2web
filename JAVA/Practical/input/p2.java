import java.util.*;
class p2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age>=18){
				System.out.println("Voter is eligible");
			}
			else if(age<0){
				System.out.println("invalid");
			}
			else{
				System.out.println("not elgible");
			}
		}
	}

