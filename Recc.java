import java.util.Scanner;
public class Recc{
    public static void main(String[] arg){
        Scanner cana = new Scanner(System.in);

        double discount;
        System.out.println("enter the target amount please");
double amount = cana.nextDouble();
if(amount >= 5000){
    //discount is 10%
    discount = amount * 0.1;
}
else if(amount>=1000 && amount <=5000){
    //discount is 5%
    discount = amount * 0.05;
}else{
    discount = 0;
}

double finalamount = amount - discount;

System.out.println("initial amount:                                       $"+amount);
System.out.println("discount:                                             $"+discount);
System.out.println("finalamount:                                          $"+finalamount);
cana.close();

    }
}