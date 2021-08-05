package maxUsingGeneric;

public class StringCompare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompare.comparision("10", "20", "90");
	}
	
	public static String comparision(String a,String b,String c) {
		String max = a;
		if (max.compareTo(b)<0) {
			max = b;
		}
		if(max.compareTo(c)<0) {
			max = c;
		}
		System.out.println(max);
		return max;
	}

}
