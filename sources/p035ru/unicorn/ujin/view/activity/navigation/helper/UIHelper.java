package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.UIHelper */
public class UIHelper {
    public static void hideKeyboard(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showKeyboard(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public static SpannableString getTitle(Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i == 0 ? R.drawable.ic_toolbar_logo : R.drawable.ic_toolbar_logo_2);
        drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.6d), (int) (((double) drawable.getIntrinsicHeight()) * 0.6d));
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
        return spannableString;
    }

    public static void getTitleWithCustomFont(Context context, Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/roboto.ttf");
                if (textView.getText().equals(toolbar.getTitle())) {
                    textView.setTypeface(createFromAsset);
                    return;
                }
            }
        }
    }

    public static void getTitleWithCustomFont(Context context, TextView textView) {
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/roboto.ttf"));
    }

    public static void baseBackToolbarTitle(Context context, Toolbar toolbar, String str) {
        toolbar.setLogo(ContextCompat.getDrawable(context, R.drawable.icon_back));
        TextView textView = (TextView) toolbar.findViewById(R.id.tv_toolbar_title);
        ((ImageView) toolbar.findViewById(R.id.iv_arrow)).setVisibility(4);
        textView.setText(str);
        textView.setTextSize(18.0f);
    }

    public static ViewGroup.LayoutParams setLayoutParams(int i, int i2, Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        return new LinearLayout.LayoutParams((int) (((float) i) * f), (int) (((float) i2) * f));
    }

    public static boolean isEmpty(EditText editText) {
        return editText.getText().toString().trim().length() <= 0;
    }
}
