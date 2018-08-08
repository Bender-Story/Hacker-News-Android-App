package hackernews.sample.com.hackernewsapp;

import android.app.Activity;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import hackernews.sample.com.rahul.Utils.UiUtils;
import hackernews.sample.com.rahul.Utils.Utils;

import static org.junit.Assert.assertEquals;

public class UtilsTest {
    @Test
    public void checkUtils_Utils(){

        try {
           boolean value= Utils.isTestMode(null);
            assertEquals(value,false);
        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_Utils2(){

        try {
            boolean value= Utils.isTestMode((Activity) new Object());
            assertEquals(value,false);
        } catch (Exception e) {
            new Fail(e);
        }

    }
}
