package maxUsingGeneric;

public class Compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Compare.comparision("10", "20", "90");
		Integer[] a = {1,2,3};
		Float[] b = {1.0f,2.0f,3.0f};
		String[] c = {"22", "33", "44"};
		//Compare compare=new Compare();
		Compare.comparision(a);
		Compare.comparision(b);
		Compare.comparision(c);
	}
	
	public static <E extends Comparable<E>> void comparision(E[] d) {
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
