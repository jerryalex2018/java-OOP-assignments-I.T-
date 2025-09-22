import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Rec {
 public static void main(String[] args) {
        // System.out.println("hello");
        Scanner skana = new Scanner(System.in);
String bookid;


while (true){
    System.out.println("enter a valid id");
    bookid = skana.nextLine();

    int lengthi = bookid.length();
    if (lengthi >= 8 && lengthi <=20){
        break;
    
    }
    else{
        System.out.println("either bookid is too short or too long");
    }
}
//so here user is prompted to enter due date for retuning the book borrowed from the library
System.out.println("enter due date in the format year-month-day");

LocalDate duedate = LocalDate.parse(skana.nextLine());

//and the user is now promted to enter the date he/she returned the book, return date
System.out.println("now enter the date you returned the book ");

LocalDate returndate = LocalDate.parse(skana.nextLine());

        long daysoverdue = ChronoUnit.DAYS.between(duedate, returndate);

        long fineamount ;
        int finerate ;
        if(daysoverdue <= 7){
            finerate = 20;
            fineamount = daysoverdue * finerate ;
        }
        else if (daysoverdue>=8 && daysoverdue<=14) {
            finerate = 50;
            fineamount = daysoverdue * finerate;
        }else{
            finerate = 100;
            fineamount = daysoverdue * finerate;
        }

        System.out.println("bookid:    " + bookid);
        System.out.println("duedate:   " + duedate);
        System.out.println("returndate:   " + returndate);
        System.out.println("daysoverdue:   " + daysoverdue);
        System.out.println("finerate:   " + finerate);
        System.out.println("fineamount:   " + fineamount);
    }
}