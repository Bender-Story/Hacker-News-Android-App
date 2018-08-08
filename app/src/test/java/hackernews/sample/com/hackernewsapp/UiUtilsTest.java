package hackernews.sample.com.hackernewsapp;

import android.app.Activity;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import hackernews.sample.com.rahul.Utils.NetworkUtils;
import hackernews.sample.com.rahul.Utils.UiUtils;

import static org.junit.Assert.assertEquals;

public class UiUtilsTest {

    @Test
    public void checkUtils_UiUtils(){

        try {
           UiUtils.createAlertDialog(null);

        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_UiUtils2(){

        try {
            UiUtils.createAlertDialog((Activity) new Object());

        } catch (Exception e) {
            new Fail(e);
        }

    }
}
