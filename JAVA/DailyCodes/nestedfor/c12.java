class c12{
	public static void main(String[] args){
		char ch1=65;
		char ch2=97;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch2++ +" ");
				}
				else{
					System.out.print(ch1++ +" ");
				}
			}
			System.out.println();
		}
	}
}