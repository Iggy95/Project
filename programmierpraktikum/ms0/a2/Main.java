package ms0.a2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(2);
        BigDecimal c = new BigDecimal(5);
        MathContext highPrecision = new MathContext(50, RoundingMode.HALF_UP);
        MathContext mc = new MathContext(30, RoundingMode.HALF_UP);
        System.out.println(a.add(c.sqrt(highPrecision),highPrecision).divide(b,highPrecision).round(mc));
    }
}
