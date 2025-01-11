import java.util.*;

class a3{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,2,5,6};
	System.out.println("enter specific number:");
	int spec=sc.nextInt();
	int occur=0;
        for(int i=0;i<arr.length;i++){
		if(arr[i]==spec){
			occur+=1;
		}
	}
	System.out.println("number" + spec + " occured" + occur + " times in an array");

	}
}
		
