import java.util.Scanner;

public class FeesDiscountInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int fee = input.nextInt();
    int discountPercent = input.nextInt();

    int discountAmount = (fee * discountPercent) / 100;
    int finalFee = fee - discountAmount;

    System.out.println("The discount amount is INR " + discountAmount +
            " and final discounted fee is INR " + finalFee);
  }
}
