package hackernews.sample.com.rahul.Utils;

import android.app.Activity;

import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

    public static String  loadJSONFromAsset(Activity context,String fileName) {
        String json;
        try {
            InputStream is = context.getAssets().open(fileName+".json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
