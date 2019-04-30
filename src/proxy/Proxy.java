package proxy;

public class Proxy extends Subject{
	RealSubject realSubject;
	Other other;

	@Override
	public void Request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.Request();
		if(other == null){
			other = new Other();
		}
		other.Request();
	}

}
