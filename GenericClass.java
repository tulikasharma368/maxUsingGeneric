package maxUsingGeneric;

public class GenericClass <E extends Comparable<E>> {
	E[] inpArr;

	public GenericClass(E[] inpArr) {
		super();
		this.inpArr = inpArr;
	}
	public static void main(String[] args) {
		Integer[] a = {1,2,3};
		Float[] b = {1.0f,2.0f,3.0f};
		String[] c = {"22", "33", "44"};
		//GenericClass gen = new GenericClass();
//		comparision(a);
//		comparision(b);
//		comparision(c);
		new GenericClass<Integer>(a).comparision();
		new GenericClass<Float>(b).comparision();
		new GenericClass<String>(c).comparision();
	}
	
	private void comparision() {	
		comparision(inpArr);
	}
	
	private static <E extends Comparable<E>> void comparision(E[] d) {
		E max = d[0];
		if (max.compareTo(d[1])<0) {
			max = d[1];
		}
		if(max.compareTo(d[2])<0) {
			max = d[2];
		}
		System.out.println(max);
	}
}
