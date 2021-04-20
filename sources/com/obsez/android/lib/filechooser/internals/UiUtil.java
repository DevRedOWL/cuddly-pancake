package com.obsez.android.lib.filechooser.internals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.ListView;
import java.util.Iterator;

public final class UiUtil {
    public static float dip2px(float f) {
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static int px2dip(int i) {
        return (int) ((((float) i) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static Drawable resolveFileTypeIcon(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setType(getMimeType(context, uri));
        PackageManager packageManager = context.getPackageManager();
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
        if (it.hasNext()) {
            return it.next().loadIcon(packageManager);
        }
        return null;
    }

    public static String getMimeType(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getApplicationContext().getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    public static int getThemeAccentColor(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = 16843829;
        } else {
            i = context.getResources().getIdentifier("colorAccent", "attr", context.getPackageName());
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static int getListYScroll(ListView listView) {
        View childAt = listView.getChildAt(0);
        return ((listView.getFirstVisiblePosition() * childAt.getHeight()) - childAt.getTop()) + listView.getPaddingTop();
    }

    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void ensureVisible(ListView listView, int i) {
        if (listView != null && listView.getAdapter() != null && i >= 0 && i < listView.getAdapter().getCount()) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int lastVisiblePosition = listView.getLastVisiblePosition();
            if (i < firstVisiblePosition) {
                listView.setSelection(i);
            } else if (i >= lastVisiblePosition) {
                listView.setSelection((i + 1) - (lastVisiblePosition - firstVisiblePosition));
            }
        }
    }
}
