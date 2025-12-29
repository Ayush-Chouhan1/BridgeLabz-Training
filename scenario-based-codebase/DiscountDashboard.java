import java.util.Scanner;

public class DiscountDashboard {

          /*  8. Shopkeeper’s Discount Dashboard 🛍️
            A shopkeeper gives discounts based on total bill:
            ● Input item prices in a for-loop.
            ● Use if-else for discount logic.
            ● Use proper indentation, constants, and comments. */

    public static void main(String[] args) {

        //creating scanner class object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items.");
        int items = sc.nextInt();
        System.out.println("Enter item prices.");
        //creating array to store item price
        int itemPrice[] = new int[items];
        int totalPrice =0;
        for(int i = 0 ; i < items ; i++ ){
            System.out.println("Enter price for item "+ i+1);
            itemPrice[i]=sc.nextInt();
            totalPrice+=itemPrice[i];
        }

        // calculating discount
        double discount =0;
        double discountRate =0;
        if(totalPrice>=1000 && totalPrice <2500){
            discount = totalPrice * 0.1; // discount of 1 % over 1000rs.
            discountRate = 1;
        }
        else if(totalPrice>=2500 && totalPrice<5000){
            discount = totalPrice * 0.025; // discount of 2.5%  over 2500rs.
            discountRate = 2.5;

        }
        else if(totalPrice >= 5000 && totalPrice < 10000){ // discount of 5 % over 5000rs.
            discount = totalPrice * 0.05;
            discountRate = 5;

        }
        else if(totalPrice>=10000 ){
            discount = totalPrice * 0.07; // discount of  7 % over 10,000rs.
            discountRate = 7;

        }

        // calculating actual price after discount
        double actualPrice =0;
        actualPrice = totalPrice - discount;

        System.out.println("Discount applied "+ discountRate+" %");
        System.out.println("Discount of "+ discount+ " on total price "+ totalPrice);
        System.out.println("Amount to be paid = "+actualPrice );

    }
}
