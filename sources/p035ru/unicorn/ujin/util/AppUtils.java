package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.facebook.react.modules.storage.ReactDatabaseSupplier;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.Pair;

/* renamed from: ru.unicorn.ujin.util.AppUtils */
public class AppUtils {
    public static int getScreenWidthInPx(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static boolean keyboardShown(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static void saveKeyValuePair(String str, String str2, Context context) {
        ReactDatabaseSupplier instance = ReactDatabaseSupplier.getInstance(context);
        SQLiteStatement compileStatement = instance.get().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
        try {
            instance.get().beginTransaction();
            compileStatement.clearBindings();
            compileStatement.bindString(1, str);
            compileStatement.bindString(2, str2);
            compileStatement.execute();
            instance.get().setTransactionSuccessful();
            try {
                instance.get().endTransaction();
            } catch (Exception e) {
                Log.w("AsyncStorage", e.getMessage(), e);
            }
        } catch (Exception e2) {
            Log.w("AsyncStorage", e2.getMessage(), e2);
            instance.get().endTransaction();
        } catch (Throwable th) {
            try {
                instance.get().endTransaction();
            } catch (Exception e3) {
                Log.w("AsyncStorage", e3.getMessage(), e3);
            }
            throw th;
        }
    }

    public static boolean isRegistrationCodeValid(String str) {
        return str.length() == 20;
    }

    public static boolean isNameValid(String str) {
        return str.matches(".*\\p{InCyrillic}.*");
    }

    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static String getFirstChar(@Nullable String str) {
        return (str == null || str.length() <= 0) ? " " : str.substring(0, 1);
    }

    public static Bitmap getPhotoThumbnail(String str) {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(new FileInputStream(str)), 64, 64, false);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
            return bitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap getVideoThumbnail(String str) {
        return ThumbnailUtils.createVideoThumbnail(str, 1);
    }

    public static String getChatTitle(String str, Boolean bool, int i) {
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "...";
    }

    public static boolean isPhoneValid(String str) {
        return str.length() == 11;
    }

    public static String firstUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static BitmapDescriptor bitmapDescriptorFromVector(Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = !drawable.getBounds().isEmpty() ? drawable.getBounds().width() : drawable.getIntrinsicWidth();
        int height = !drawable.getBounds().isEmpty() ? drawable.getBounds().height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        if (height <= 0) {
            height = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static int pxToDp(Context context, int i) {
        return Math.round(((float) i) / getPixelScaleFactor(context));
    }

    private static float getPixelScaleFactor(Context context) {
        return context.getResources().getDisplayMetrics().xdpi / 160.0f;
    }

    public static int getDarkenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public static int getLightenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return Color.HSVToColor(80, fArr);
    }

    public static String getPhoneMac() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = t.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(Integer.toHexString(b & 255) + ":");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Nullable
    public static Pair<String, Integer> getWithMinimumValue(HashMap<String, Integer> hashMap) {
        HashMap hashMap2 = new HashMap();
        String str = "";
        int i = -1;
        for (Map.Entry next : hashMap.entrySet()) {
            if (hashMap2.isEmpty()) {
                str = (String) next.getKey();
                i = ((Integer) next.getValue()).intValue();
                hashMap2.put(str, Integer.valueOf(i));
            } else if (i < ((Integer) next.getValue()).intValue()) {
                hashMap2.clear();
                str = (String) next.getKey();
                i = ((Integer) next.getValue()).intValue();
                hashMap2.put(str, Integer.valueOf(i));
            }
        }
        if (str.isEmpty()) {
            return null;
        }
        return new Pair<>(str, Integer.valueOf(i));
    }
}
