import java.util.Scanner;

public class IT24101605Lab5Q3{
public static void main (String[] args){

Scanner input=new Scanner(System.in);

double Room_Charge_Per_Day=48000.00;
double Discount_3_to_4_Days=0.1;
double Discount_5_or_More_Days=0.2;

int startDate, endDate,numberOfDayReserved;
double totalAmountBeforeDiscount, discountAmount,totalAmountTobePaid;

double discountRate=0;

System.out.print("Enter Start Date (1-31): ");
startDate=input.nextInt();

System.out.print("Enter End Date (1-31): ");
endDate=input.nextInt();

if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
    System.out.println("Error: Days must be between 1 and 31");
    return;
}
if(startDate>=endDate){
    System.out.println("Error: Start Date must be less than End date");
    return;
}

numberOfDayReserved=endDate-startDate;
if(numberOfDayReserved>=3 && numberOfDayReserved<=4){
    discountRate=Discount_3_to_4_Days;
}
else if(numberOfDayReserved>=5){
    discountRate=Discount_5_or_More_Days;
}

totalAmountBeforeDiscount=numberOfDayReserved*Room_Charge_Per_Day;
discountAmount=totalAmountBeforeDiscount*discountRate;
totalAmountTobePaid=totalAmountBeforeDiscount-discountAmount;

System.out.println();
System.out.println("Room Charge Per Day: "+ Room_Charge_Per_Day);
System.out.println("Number of Days Reserved: "+ numberOfDayReserved);
System.out.println("Total Amount: "+ totalAmountTobePaid);

}
}