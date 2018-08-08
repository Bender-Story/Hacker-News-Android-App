package hackernews.sample.com.hackernewsapp;

import android.app.Activity;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import hackernews.sample.com.rahul.Utils.FileUtils;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FileUtilsUnitTest {


    @Test
    public void checkUtils_FileUtils(){

        try {
            String json=  FileUtils.loadJSONFromAsset(null,null);
            assertEquals(json,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_FileUtils2(){

        try {
           String json= FileUtils.loadJSONFromAsset(null,"");
           assertEquals(json,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_FileUtils3(){

        try {
            String json= FileUtils.loadJSONFromAsset(null,new String("someText"));
            assertEquals(json,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }
    @Test
    public void checkUtils_FileUtils4(){

        try {
            String json= FileUtils.loadJSONFromAsset((Activity) new Object(),new String("someText"));
            assertEquals(json,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }
}