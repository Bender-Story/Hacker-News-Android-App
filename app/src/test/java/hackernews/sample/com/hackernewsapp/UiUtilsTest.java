package hackernews.sample.com.hackernewsapp;

import android.app.Activity;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;


import hackernews.sample.com.rahul.Utils.UiUtils;


// Junit Test class for UiUtils class
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
