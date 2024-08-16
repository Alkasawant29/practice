package calculator;

public class Calwithparameter {

	public static void main(String[] args) {
		Calwithparameter cal =new Calwithparameter();
		cal.addition(99, 25);
		cal.subtraction(158, 123);
		cal.multiplication(52, 98);
		cal.division(579, 32);
		
      }
     public void addition(int a,int b)
     {
    	int sum = a+b;
    	System.out.println("addition is "+sum);
     }
     public void subtraction(int a,int b)
     {
    	 int sub = a-b;
    	 System.out.println("subtraction is "+sub);
     }
     public void multiplication(int a,int b)
     {
    	 int mul = a*b;
    	 System.out.println("multiplication is "+mul);
     }
     public void division(int a,int b)
     {
    	 int div = a/b;
    	 int rem = a%b;
    	 System.out.println("division is "+div);
    	 System.out.println("remainder is "+rem);
     }
    }
