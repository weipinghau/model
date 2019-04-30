package proxy;

public class RealSubject extends Subject{

	@Override
	public void Request() {
		System.out.println("真实的请求……");
	}
	public void appl(){
		System.out.println("appl--RealSubject");
	}


}
