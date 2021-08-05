package maxUsingGeneric;

public class IntegerCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerCompare.comparision(100, 20, 90);
	}
	
	public static Integer comparision(Integer a,Integer b,Integer c) {
		Integer max = a;
		if (b.compareTo(max)>0) {
			max = b;
		}
		if(c.compareTo(max)>0) {
			max = c;
		}
		System.out.println(max);
		return max;
	}

}
