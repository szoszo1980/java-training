package i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;



public class Messages {

    public static void main(String[] args) {
        ResourceBundle bundle_en = ResourceBundle.getBundle("messages",new Locale("en","US"));
        ResourceBundle bundle_hu = ResourceBundle.getBundle("messages",new Locale("hu","HU"));
        System.out.println(bundle_en.getString("openscreen.welcome.message"));
        System.out.println(bundle_hu.getString("openscreen.welcome.message"));

        System.out.println(MessageFormat.format(bundle_en.getString("openscreen.p"),"John Doe",100_000));
        System.out.println(MessageFormat.format(bundle_hu.getString("openscreen.p"),"John Doe",100_000));
    }
}
