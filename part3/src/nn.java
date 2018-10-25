class nn
{
	static int x = 20;
	static void test()
	{
		x=40;
	Q.x=60;
	System.out.println(x);
}
	public static void main(String[] args) 
	{
		System.out.println("main:" + x);
		test();
		System.out.println("main end:" + x);
	}
}

