//method overloading with numeric type promotion 
class Cal3{
	float add(float a,float b)
	{
		return a+b;
		
	}
}
public class MO_CodeS2 {

	public static void main(String[] args) {

		Cal3 ref3=new Cal3();
		System.out.println(ref3.add(10, 20));
		
	}

}
