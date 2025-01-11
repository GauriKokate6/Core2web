import java.util.*;

class a2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,2,5,6};
	System.out.println("enter specific number:");
	int spec=sc.nextInt();
        for(int i=0;i<arr.length;i++){
		if(arr[i]==spec){
			System.out.println("Specific number occured at index : " + i);
			break;
		}
	}
	}
}
		
