package com.jalotsav.initjcenter;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Jalotsav on 9/12/2016.
 */
public class GeneralFunctions {

    /**
     *  Show/Cancel Toast
     **/
    static Toast toast = null;

    public static void showToast(Context context, String message, int toastLength) {

        if(toast != null) toast.cancel();
        switch (toastLength) {
            case Toast.LENGTH_LONG:
                toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
                break;
            case Toast.LENGTH_SHORT:
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                break;
            default:
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                break;
        }
        toast.show();
    }

    public static void cancelToast(){

        if(toast !=null) toast.cancel();
    }
}
