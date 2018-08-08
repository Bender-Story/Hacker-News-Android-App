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
            boolean json=  NetworkUtils.isConnected(null);
            assertEquals(json,false);
        } catch (Exception e) {
            new Fail(e);
        }

    }

    @Test
    public void checkUtils_NetworkUtils2(){

        try {
            boolean json=  NetworkUtils.isConnected((Context) new Object());
            assertEquals(json,null);
        } catch (Exception e) {
            new Fail(e);
        }

    }


}
