public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYearTerm = (int) service.calculate(1_000_000, 12);
        System.out.println(monthlyPaymentOneYearTerm);

        int monthlyPaymentTwoYearTerm = (int) service.calculate(1_000_000, 24);
        System.out.println(monthlyPaymentTwoYearTerm);

        int monthlyPaymentThreeYearTerm = (int) service.calculate(1_000_000, 36);
        System.out.println(monthlyPaymentThreeYearTerm);
    }
}