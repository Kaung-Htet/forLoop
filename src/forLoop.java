public class forLoop {
    public static void main(String[] args) {
        int amount = 10_000;
        //for (init, termination, increment)
        for (int i = 2; i <= 8; i++){
            //String.format("%.2f") က ဒဿမ ၂ လုံးဖြတ်တာ
            System.out.println(amount + " at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(amount,i)));
        }

        for (int i = 8; i >= 2; i--){
            //String.format("%.2f") က ဒဿမ ၂ လုံးဖြတ်တာ
            System.out.println(amount + " at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(amount,i)));
        }

// 2, 3, 5, 7, 11, 13, 17, 19,
        int count = 0;
        for (int i = 20; i < 50; i++){
            if (isPrimeNumber(i)){
                System.out.println("Number " + i + " is a prime number");
                count++;
                if  (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest (double amount, double interestRate){
            return  (amount * (interestRate/100));

    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        int countLooping = 0;

//      ဒီ if statement ကအောက်ကနှစ်ခုထက်ပိုမြန်တယ်
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {

//      ဒီ if statement ကအောက်ကတစ်ခုထက်ပိုမြန်တယ်
//        for (int i = 2; i <= n/2; i++){

//      ဒီ if statement ကအပေါ်နှစ်ခုထက်ပိုနှေးတယ်
//      for (int i = 2; i < n; i++){

            countLooping++;
            System.out.println("Total Looping Times " + countLooping);

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
