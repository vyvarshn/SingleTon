
public class SingleTonImple {

	public static void main(String[] args) {
		
		SingleTon x = SingleTon.getIntance();
		SingleTon y = SingleTon.getIntance();
		
		System.out.println(x.hashCode()==y.hashCode());

	}

}
