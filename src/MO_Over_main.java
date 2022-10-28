//Overloading main Method we can do that but JVM will only Be calling Main Method With String Arguments
public class MO_Over_main {
public static void main(String[] args) { 
	System.out.println("I am Original Main Method");
}
public static int main(int b) { 

	System.out.println("I am  Main Method with Int Args");
	return 0;
}
}
