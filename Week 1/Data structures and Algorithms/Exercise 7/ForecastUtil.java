// File: ForecastUtil.java
public class ForecastUtil {

    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }
    
    public static double futureValueMemo(double presentValue, double rate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(presentValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
