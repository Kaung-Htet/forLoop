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
    }

    public static double calculateInterest (double amount, double interestRate){
            return  (amount * (interestRate/100));

    }
}
