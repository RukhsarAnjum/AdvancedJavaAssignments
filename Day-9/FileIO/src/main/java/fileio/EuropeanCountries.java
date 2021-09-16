package fileio;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

public class EuropeanCountries extends ListResourceBundle {
    @Override
//    public static String currency="FUR";
    protected Object[][] getContents(){
        return new Object[0][];
    }
    private Object[][] contents={
            {"textRate",new BigDecimal(18.50)},{"currency","DE"}
    };
}
