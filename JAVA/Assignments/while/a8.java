class a8{
	public static void main(String[] args){
		int num=123456789;
		int temp=0;
		while(num!=0){
			temp=num%10;
			if(temp%2!=0){
				System.out.println(temp);
			}
			num/=10;
		}
	}
}


