import java.util.Scanner;

public class Population {
    public static void main(String[] args){
        final int CURRENT_POP = 312032486;
        final int SECS_PER_YR = 31536000;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        
        int births = (SECS_PER_YR * years) / 7;
        int deaths = (SECS_PER_YR * years) / 13;
        int immigrants = (SECS_PER_YR * years) / 45;
        int total_pop = CURRENT_POP + births + immigrants - deaths;
        
        System.out.println("The population in " + years + 
                " years is " + total_pop);
    } // main
} // Population