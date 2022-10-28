
//return type has nothing to do with method overloading.
// its only parameters and method name
class Cal2{
	void add (int a,int b) {
		System.out.println(a+b);
	}
	int add (int a,int b) {
		return a+b;
	}
	float add (int a, float b) {
		return a+b;
		
	}
}
public class MO_codeS1 {

	public static void main(String[] args) {

		Cal2 ref2=new Cal2();
		System.out.println(ref2.add(10, 20));
		
	}

}
