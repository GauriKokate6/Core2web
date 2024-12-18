class c11{
	public static void main(String[] args){
		int x=1;
		char ch='A';
		for(int i=1;i<=4;i++){
			
			if(i%2==0){
				for(char j=1;j<=3;j++){
					System.out.print(ch++ + " ");
				}
				System.out.println();
			}
			else{
				for(int j=1;j<=3;j++){
					System.out.print(x++ + " ");
				}
				System.out.println();
			}
		}
	}
}


