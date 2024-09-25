class P2{
	public static void main(String[] args){
		int num=-1;
		if(num>10 && num%2==0){
			System.out.println("number is greater than 10 and even");
		}
		else if(num>10 && num%2!=0){
			System.out.println("number is greater than 10 and odd");
		}
		
		else if(num<10 && num%2==0){
                        System.out.println("number is less than 10 and even");
                }
                else if(num<10 && num%2!=0){
                        System.out.println("number is less than 10 and odd");
                }
		else{
			System.out.println("number is even and 10");
		}
	}
}
