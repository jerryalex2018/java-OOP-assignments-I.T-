import java.util.Scanner;

public class assignment {
    public static void getFitnessLevel(int param){
        if(param>=10000){
            System.out.println("your fitness level : excellent :");
        }else if(param>=7000 && param <10000){
            System.out.println("your fitness level : Good ");
        }else if(param>=1000 && param <7000){
            System.out.println("your fitness level : Average ");
        }else{
            System.out.println("your fitness level : Poor ");
        }
    }
    public static void main(String[] args) {
        Scanner step = new Scanner(System.in);
        System.out.println("Enter your steps for today :");
        int steps = step.nextInt();
        getFitnessLevel(steps);
    }
}
