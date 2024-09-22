class A6{
	public static void main(String[] args){
		char ch=97;
		if(ch=='a'){
			System.out.println(ch-- + ch);
		}
		else{
			System.out.println(ch++);
		}
		System.out.println(ch+=5);
	}
}
