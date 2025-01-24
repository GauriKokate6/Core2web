class a6{
	public static void main(String[] args){
		int num=9307;
		int temp=0;
		while(num!=0){
			temp=num%10;
			System.out.println(temp);
			num/=10;
		}
	}
}
