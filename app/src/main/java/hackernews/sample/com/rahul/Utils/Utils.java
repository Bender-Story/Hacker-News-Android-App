package hackernews.sample.com.rahul.Utils;

import android.content.Context;

public class Utils {
    public static boolean isTestMode(Context context) {
        boolean result;
        try {
            context.getClassLoader().loadClass("hackernews.sample.com.rahul.home.view.AppUITest");
            // alternatively (see the comment below):
            // Class.forName("foo.bar.test.SomeTest");
            result = true;
        } catch (final Exception e) {
            result = false;
        }
        return result;
    }
}
