public class Hello{
	public static void main(String[] args) {//形参是在执行程序时，传入的。
		for (int i  = 0 ;i<args.length ;i++ ) {
			System.out.println("第"+(i+1)+"个参数"+args[i]);
			
		}
		
	}
}