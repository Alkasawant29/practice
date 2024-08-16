package calculator;

public class Calwithoutparameter {

	public static void main(String[] args)
	{
		Calwithoutparameter cal =new Calwithoutparameter();
		 addition();
		 subtraction();
		 multiplication();
         division();
	}
     public static void addition()
     {
    	int a = 90;
    	int b = 85;
    	int sum = a + b;
    	System.out.println("addition is "+sum);
    	 
     }
     public static void subtraction()
     {
    	int a = 90;
     	int b = 85;
     	int sub = a - b;
        System.out.println("subtraction is "+sub);
     }
     public static void multiplication()
     {
    	int a = 90;
      	int b = 85;
      	int mul = a * b;
        System.out.println("multiplication is "+mul);
     }
     public static void division()
     {
    	int a = 90;
       	int b = 85;
       	int div = a/b;
       	int rem = a%b;
        System.out.println("division is "+div);
        System.out.println("remainder is "+rem);
     }
}
