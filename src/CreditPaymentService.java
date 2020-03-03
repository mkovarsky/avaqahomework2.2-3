import static java.lang.Math.*;

public class CreditPaymentService {
    public double calculate(int amountOfCredit, int creditTerm) {
        double creditInterest = 9.99;
        double monthlyCreditInterest = creditInterest / 100 / 12;
        double monthlyPayment = amountOfCredit * monthlyCreditInterest + amountOfCredit * (monthlyCreditInterest / (pow(1 + monthlyCreditInterest, creditTerm) - 1));
        return monthlyPayment;
    }
}
