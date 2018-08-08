package hackernews.sample.com.hackernewsapp;

import android.app.Activity;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import hackernews.sample.com.rahul.Utils.UiUtils;
import hackernews.sample.com.rahul.Utils.Utils;

public class UtilsTest {
    @Test
    public void checkUtils_Utils(){

        try {
            Utils.isTestMode(null);

        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_Utils2(){

        try {
            Utils.isTestMode((Activity) new Object());

        } catch (Exception e) {
            new Fail(e);
        }

    }
}
