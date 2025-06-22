// File: Main.java
public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;   
        double annualGrowthRate = 0.10; 
        int years = 5;

        double fv = ForecastUtil.futureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Recursive Future Value after %d years: Rs. %.2f%n", years, fv);

        double[] memo = new double[years + 1];
        double fvMemo = ForecastUtil.futureValueMemo(presentValue, annualGrowthRate, years, memo);
        System.out.printf("Memoized Future Value after %d years: Rs. %.2f%n", years, fvMemo);

    }
}
