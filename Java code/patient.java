import java.util.Scanner;

public class patient extends preliminarycheck
 {
   
    public static void main(String args[])
	{
		Scanner input  = new Scanner(System.in);
		preliminarycheck pcheck = new preliminarycheck();
        System.out.println("Enter pH");
        Double pH = input.nextDouble();
        System.out.println("Enter Paco2");
        Double Paco2 = input.nextDouble();
        System.out.println("Enter HCO3");
        Double hco3 = input.nextDouble();

        pcheck.checkpostrouter(pH,Paco2,hco3);
    }
}