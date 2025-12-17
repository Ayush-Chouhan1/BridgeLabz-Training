public class FeesDiscount{
   public static void main(String[] args){
     int fees = 125000;
     int discount =10;
     int discountAmount = (fees * discount) / 100;
     int discountedFees = fees - discountAmount;
    System.out.println("The discount amount is INR "+ discountAmount +" and final discounted fee is INR " + discountedFees);
    }
  }