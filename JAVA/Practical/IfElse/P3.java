class P3{
	public static void main(String[] args){
		char ch=96;
		if(ch>=65 && ch<=90){
			System.out.println(ch +" is a uppercase character");
		}
		else if(ch>96 && ch<=122){
			System.out.println(ch+ " is a lowercase character");
		}
		else{
			System.out.println("character is not alphabet");
		}
	}
}
