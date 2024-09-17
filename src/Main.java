import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number for the month : ");
        int month  = sr.nextInt();

        String month_of_the_year;

        if(month == 1){
            month_of_the_year = "January";
        }
        else if(month == 2) {
            month_of_the_year = "February";
        }
            else if(month == 3){
                month_of_the_year = "March";
            }
        else if(month == 4){
            month_of_the_year = "April";
        }
        else if(month == 5){
            month_of_the_year = "May";
        }
        else if(month == 6){
            month_of_the_year = "June";
        }
        else if(month == 7){
            month_of_the_year = "July";
        }
        else if(month == 8){
            month_of_the_year = "August";
        }
        else if(month == 9){
            month_of_the_year = "September";
        }
        else if(month == 10){
            month_of_the_year = "October";
        }
        else if(month == 11){
            month_of_the_year = "Novermber";
        }
        else if(month == 12){
            month_of_the_year = "December";
        }
        else{
            month_of_the_year = "INVALID";
        }

        System.out.println("The month of the year is : " + month_of_the_year);

    }
}
