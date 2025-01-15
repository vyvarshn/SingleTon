
public class ThreadImple extends Thread {
	
	public void run() {
		SingleTon x = SingleTon.getIntance();
		SingleTon y = SingleTon.getIntance();
		System.out.println("First hash code with thread"+Thread.currentThread().getName()+"is "+x.hashCode());
		System.out.println("Second hash code with thread"+Thread.currentThread().getName()+"is "+y.hashCode());
	}

	public static void main(String[] args) {
		
		ThreadImple t1= new ThreadImple();
		ThreadImple t2 = new ThreadImple();
		t1.start();
		t2.start();

	}

}
