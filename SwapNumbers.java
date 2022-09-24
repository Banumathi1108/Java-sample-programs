
public class SwapNumbers {

	public static void main(String[] args) {
		
		int num1 = 15, num2 = 20;

        System.out.println("***Numbers assigned before swap***");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        // Value of num1 is assigned to swapvalue below
        int swapvalue = num1;

        // Value of num2 is assigned to num1 below
        num1 = num2;

        // Value of swapvalue is now assigned to num2
        num2 = swapvalue;

        System.out.println("***Numbers after swap***");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
	}

}
