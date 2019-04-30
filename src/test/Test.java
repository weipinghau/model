package test;


public class Test {
	static int i = 1;
	public static void main(String[] args) {
		System.out.println(test2());
	}
	public static int test(){
		try{
			i++;
			return i;
		}catch (Exception e) {
			i++;
			return i;
		}finally {
			i++;
		}
	}
	
	public static String test2(){
		try{
			System.out.println("try");
			return "try  " +System.currentTimeMillis();
		}catch (Exception e) {
			System.out.println("Exception");
			return "try";
		}finally {
			System.out.println("finally  "+System.currentTimeMillis());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
