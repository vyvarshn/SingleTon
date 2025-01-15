
public class SingleTon {

	private static SingleTon single_instance=null;
	
	private SingleTon() {
		// TODO Auto-generated constructor stub
	}

	
	public static  SingleTon getIntance() {

		// Double checked locking pattern
		if(single_instance==null) {
			synchronized(SingleTon.class) {
				if(single_instance==null) {
			single_instance = new SingleTon();
			}
			}
		}
		return single_instance;
	}

}
