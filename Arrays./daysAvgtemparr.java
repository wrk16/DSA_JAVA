import java.util.*;
public class daysAvgtemparr {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        //enter the number of days
        System.out.print("How many days' temperatures? ");
        int days = in.nextInt();
        int temps[] = new int[days];      //stores the days in arr.
          int sum=0;

          //record the no. of days high tenperature
          for(int i=0 ;i<days ;i++){
            System.out.print((i+1) +"st day's high temperature: ");
             temps[i]=in.nextInt();
             sum=sum+temps[i]  ;
}

           //find the average
         double avg=sum / days;

         //count days above average
            int above=0;
            for(int i=0 ;i<temps.length ;i++){
              if(temps[i]>avg){
                above++;
              }
            }

         System.out.println();
          System.out.println("Average temp = " + avg);
            System.out.println(above + " days above average");
            in.close();
    }

}
