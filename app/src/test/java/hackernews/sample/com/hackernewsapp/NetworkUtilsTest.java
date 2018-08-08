package hackernews.sample.com.hackernewsapp;

import android.content.Context;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import hackernews.sample.com.rahul.Utils.FileUtils;
import hackernews.sample.com.rahul.Utils.NetworkUtils;

import static org.junit.Assert.assertEquals;

public class NetworkUtilsTest {
    @Test
    public void checkUtils_NetworkUtils(){

        try {
            boolean value=  NetworkUtils.isConnected(null);
            assertEquals(value,false);
        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_NetworkUtils2(){

        try {
            boolean value=  NetworkUtils.isConnected((Context) new Object());
            assertEquals(value,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }


}
