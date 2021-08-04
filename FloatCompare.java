package maxUsingGeneric;

public class FloatCompare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatCompare.comparision(10.1f,20.0f,9.3f);
	}
	
	public static Float comparision(Float a,Float b,Float c) {
		Float max = a;
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
