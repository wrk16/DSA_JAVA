import java.util.*;
public class daysAvgtemp{
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        //enter the number of days
        System.out.print("How many days' temperatures? ");
        int days = in.nextInt();
        int sum = 0;

        //record the no. of days high tenperature
        for(int i=1 ;i<=days ;i++){
                    System.out.print(i +"st day's high temperature: ");
                     int next=in.nextInt();
                     sum=sum+next;
        }

        //find the average
                 double avg=sum / days;
                 System.out.println();
                  System.out.println("Average temp = " + avg);

                in.close();
    }
}