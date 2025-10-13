package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numofppl = scan.nextInt();
        System.out.print("Please enter the number of salespeople: " + numofppl );

        final int SALESPEOPLE = numofppl;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i+1 + ": ");
            sales[i] = scan.nextInt();
        }


        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i+1 + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        // the average sale :
        double averageSale = (double) sum /5 ;
        System.out.println("\nAverage sale: " + averageSale);

        // the maximum sale :
        int maxsaleid = 0 ;
        for (int i=0; i<sales.length; i++)
        { // >
            if (sales[maxsaleid]<sales[i]){
                maxsaleid = i ;
            }
        }
        System.out.println("Salesperson "+ maxsaleid+1+ " had the highest sale with $" + sales[maxsaleid] +".");

        // the minimum sale :
        int minsaleid = 0 ;
        for (int i=0; i<sales.length; i++)
        { // >
            if (sales[minsaleid]>sales[i]){
                minsaleid = i ;
            }
        }
        System.out.println("Salesperson "+ minsaleid+1 + " had the lowesr sale with $" + sales[minsaleid] +".");


        // id of each salesperson who exceeded the value amount
        int value = scan.nextInt();
        System.out.print("Please enter a value: " + value);
        int totalnum = 0;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i]>value){
                System.out.println("Salesperson "+ i+1 + " has exceeded the amount, their amount is: " + sales[i] +".");
                totalnum++ ;
            }
        }
        System.out.println("the total number of salespeople whose sales exceeded the value entered is: " + totalnum);


    }
}