package hackernews.sample.com.rahul.Utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import hackernews.sample.com.rahul.R;

public class UiUtils {
    public static void createAlertDialog(Activity activity){
        try {
            AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage(activity.getResources().getString(R.string.network_error));
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } catch (Resources.NotFoundException e) {
            Log.d("error opening Dialog",e.toString());
        }
    }
}
