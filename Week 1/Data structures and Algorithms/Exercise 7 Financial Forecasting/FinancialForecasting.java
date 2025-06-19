import java.util.*;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateValue(double principal, double rate, int years) {
        if (memo.containsKey(years)) return memo.get(years);
        if (years == 0) return principal;

        double res = calculateValue(principal * (1 + rate), rate, years - 1);
        memo.put(years, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual growth rate (as a decimal): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        double fv = calculateValue(principal, rate, years);
        System.out.printf("Future Value : %.2f%n", fv);

        sc.close();
    }
}
