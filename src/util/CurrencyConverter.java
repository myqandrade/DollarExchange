package util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyConverter {

    private static final double IOF = 0.06;

    public static double converter(double dollar, double exchangeRate){
        var total = dollar * exchangeRate;
        return total += (total * IOF);
    }
}
