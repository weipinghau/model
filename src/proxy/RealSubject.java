package proxy;

public class RealSubject extends Subject{

	@Override
	public void Request() {
		System.out.println("��ʵ�����󡭡�");
	}
	public void appl(){
		System.out.println("appl--RealSubject");
	}


}
