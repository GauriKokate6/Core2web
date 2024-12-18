class InputD{
	int x=10;
	static int y=20;
	
	void Run(){
		System.out.println("run");
	}

	void Fun(){
		System.out.println("fun");
	}

	void Gun(){
		System.out.println("gun");
	}

	public static void main(String[] args){
		System.out.println("hello from main");
		InputD obj=new InputD();
		obj.Run();
		obj.Fun();
		obj.Gun();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
