package maxUsingGeneric;

public class IntegerCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerCompare.comparision(10, 20, 9);
	}
	
	public static Integer comparision(Integer a,Integer b,Integer c) {
		Integer max = a;
		if (max.compareTo(b)<0) {
			max = b;
		}
		else if(max.compareTo(c)<0) {
			max = c;
		}
		System.out.println(max);
		return max;
	}

}
