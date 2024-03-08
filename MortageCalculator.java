import java.util.Scanner;
public class MortageCalculator {
    
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the principles: ");
        Double principal =scanner.nextDouble();
        System.out.println();
        
        System.out.print("Enter intest rate:");
        Double interestRage=scanner.nextDouble();
        System.out.println(interestRage);

        
       

        System.out.println();
        System.out.print("Enter number of payment: ");
        Double numberOfPayment =scanner.nextDouble();
        Double mathlyInterestRate=interestRage/12/100;
        System.out.println("mathlyIntesrtRate: " +  mathlyInterestRate);
                

        Double mortage=(principal*(mathlyInterestRate)*Math.pow(1+mathlyInterestRate,numberOfPayment))/(Math.pow(1+mathlyInterestRate,numberOfPayment)-1);
        System.out.println("The Mortage is equal: $" + mortage);



        

    }
    
}
