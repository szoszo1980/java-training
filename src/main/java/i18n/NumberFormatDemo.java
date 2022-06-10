package i18n;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {

    private static  final Locale HUN_LOCALE = new Locale("hu","HU");

    public static void main(String[] args) {

        NumberFormat numberformat = NumberFormat.getInstance(HUN_LOCALE);
        System.out.println(numberformat.format(1212121113.1234567));
        String formatted = numberformat.format(1212121113.1234567);
        System.out.println(formatted.contains(" "));
        for(char c:formatted.toCharArray()){
            System.out.println(c);
        }

        System.out.println((int) ' ');

        try
        {
            Object o = numberformat.parse("123\u00A0123\u00A0123,123456");
            System.out.println(o.getClass().getName());
            //Long result = (Long) o;
            //System.out.println(result);
            Double result = (Double) o;
            System.out.println(o);
        }
        catch (ParseException pe){
            pe.printStackTrace();;
        }

        NumberFormat uiParser = NumberFormat.getInstance();
        DecimalFormat decimalFormat = (DecimalFormat) uiParser;
        DecimalFormatSymbols symbols = decimalFormat.getDecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(symbols);

        try{
            //Number value = uiParser.parse("123 123 123.12345");//classCastException
            Double value = (Double) uiParser.parse("123 123 123,12345");
            System.out.println(value);

        } catch (ParseException pe) {
            pe.printStackTrace();
        }



    }
}
