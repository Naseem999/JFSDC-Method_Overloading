
class Cal1 {
	int add(int a , int b) {
		return a+b;
		
	}
	
	int add( int a ,int b,int c) {
		return a+b+c;
		
	}
	float add(int a, float b) {
		return a+b;
		
	}
	float add(float a,float b ) {
		return a+b;
		
	}
	float add(float a, float b , float c ) {
		return a+b+c;
		
	}
	
	float add(float a,int b) {
		return a+b;
		
	}

	double add(double a,double b) {
		return a+b;
		
	}
}

public class MOG {

	public static void main(String[] args) {

     Cal1 ref=new Cal1();
     
    System.out.println(ref.add(10, 20));
    System.out.println(ref.add(10, 20,30));
    System.out.println(ref.add(10, 20.5f));
    System.out.println(ref.add(10.4f, 20f));
    System.out.println(ref.add(10.4f, 20f,30.5f));
    System.out.println(ref.add(10.5f, 20));
    System.out.println(ref.add(10.4, 20.45));
   
  
		
	}

}
