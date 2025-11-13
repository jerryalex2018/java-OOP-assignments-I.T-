//importing the numberformat class
import java.text.NumberFormat;
//creationg a class
public class OOp223 {
//method to calculate totola cost
    public static double calculateTotalCost(double firstparam,double secondparam, double thirdparam){

        return (firstparam+secondparam+thirdparam);
    }
//calling the method calculateTotalCost in the main method
        public static void main(String[] args) {
            double totalcost = calculateTotalCost(2000,19293,234567);
            //creating the numberformat object
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            //implies the currency rules defined by the formatter object;
            String formatamount = formatter.format(totalcost);
            //an output is printed on the screen showing the cuurency of the total cost and the total cost
            System.out.println( "here is the total cost :"+ formatamount);
        }

}
