package org.linphone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.util.UriUtil;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.linphone.core.DialPlan;
import org.linphone.core.LinphoneAccountCreator;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.video.capture.hwconf.Hacks;

public final class LinphoneUtils {
    private static Context context;

    private static boolean isConnectionFast(int i, int i2) {
        return (i == 0 && (i2 == 1 || i2 == 2 || i2 == 11)) ? false : true;
    }

    private LinphoneUtils() {
    }

    public static boolean isSipAddress(String str) {
        try {
            LinphoneCoreFactory.instance().createLinphoneAddress(str);
            return true;
        } catch (LinphoneCoreException unused) {
            return false;
        }
    }

    public static boolean isNumberAddress(String str) {
        return LinphoneManager.getLc().createProxyConfig().normalizePhoneNumber(str) != null;
    }

    public static boolean isStrictSipAddress(String str) {
        return isSipAddress(str) && str.startsWith("sip:");
    }

    public static String getAddressDisplayName(String str) {
        try {
            return getAddressDisplayName(LinphoneCoreFactory.instance().createLinphoneAddress(str));
        } catch (LinphoneCoreException unused) {
            return null;
        }
    }

    public static String getAddressDisplayName(LinphoneAddress linphoneAddress) {
        if (linphoneAddress.getDisplayName() != null) {
            return linphoneAddress.getDisplayName();
        }
        if (linphoneAddress.getUserName() != null) {
            return linphoneAddress.getUserName();
        }
        return linphoneAddress.asStringUriOnly();
    }

    public static String getUsernameFromAddress(String str) {
        if (str.contains("sip:")) {
            str = str.replace("sip:", "");
        }
        return str.contains("@") ? str.split("@")[0] : str;
    }

    public static boolean onKeyBackGoHome(Activity activity, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        activity.startActivity(new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
        return true;
    }

    public static String timestampToHumanDate(Context context2, long j, String str) {
        SimpleDateFormat simpleDateFormat;
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            if (isToday(instance)) {
                simpleDateFormat = new SimpleDateFormat(context2.getResources().getString(C5321R.string.today_date_format), Locale.getDefault());
            } else {
                simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            }
            return simpleDateFormat.format(instance.getTime());
        } catch (NumberFormatException unused) {
            return String.valueOf(j);
        }
    }

    static boolean isToday(Calendar calendar) {
        return isSameDay(calendar, Calendar.getInstance());
    }

    static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null && calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    public static boolean onKeyVolumeAdjust(int i) {
        if (((i != 24 && i != 25) || !Hacks.needSoftvolume()) && Build.VERSION.SDK_INT < 15) {
            return false;
        }
        if (!LinphoneService.isReady()) {
            Log.m6905i("Couldn't change softvolume has service is not running");
            return true;
        }
        if (i == 24) {
            LinphoneManager.getInstance().adjustVolume(1);
        } else if (i == 25) {
            LinphoneManager.getInstance().adjustVolume(-1);
        }
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0022=Splitter:B:15:0x0022, B:21:0x0035=Splitter:B:21:0x0035} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap downloadBitmap(android.net.Uri r5) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0033, IOException -> 0x0020, all -> 0x001d }
            java.lang.String r5 = r5.toString()     // Catch:{ MalformedURLException -> 0x0033, IOException -> 0x0020, all -> 0x001d }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0033, IOException -> 0x0020, all -> 0x001d }
            java.io.InputStream r5 = r4.openStream()     // Catch:{ MalformedURLException -> 0x0033, IOException -> 0x0020, all -> 0x001d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ MalformedURLException -> 0x001b, IOException -> 0x0019 }
            r5.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x0035
        L_0x001d:
            r0 = move-exception
            r5 = r3
            goto L_0x0045
        L_0x0020:
            r4 = move-exception
            r5 = r3
        L_0x0022:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0044 }
            r2[r1] = r4     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0044 }
            r2[r0] = r1     // Catch:{ all -> 0x0044 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r2)     // Catch:{ all -> 0x0044 }
        L_0x002f:
            r5.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0043
        L_0x0033:
            r4 = move-exception
            r5 = r3
        L_0x0035:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0044 }
            r2[r1] = r4     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0044 }
            r2[r0] = r1     // Catch:{ all -> 0x0044 }
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r2)     // Catch:{ all -> 0x0044 }
            goto L_0x002f
        L_0x0043:
            return r3
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneUtils.downloadBitmap(android.net.Uri):android.graphics.Bitmap");
    }

    public static void setImagePictureFromUri(Context context2, ImageView imageView, Uri uri, Uri uri2) {
        if (uri == null && uri2 == null) {
            imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
        } else if (uri.getScheme().startsWith("http")) {
            Bitmap downloadBitmap = downloadBitmap(uri);
            if (downloadBitmap == null) {
                imageView.setImageResource(C5321R.C5323drawable.avatar);
            }
            imageView.setImageBitmap(downloadBitmap);
        } else {
            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap(context2.getContentResolver(), uri);
            } catch (IOException unused) {
                if (uri2 != null) {
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(context2.getContentResolver(), uri2);
                    } catch (IOException unused2) {
                    }
                }
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
            }
        }
    }

    public static void setThumbnailPictureFromUri(Context context2, ImageView imageView, Uri uri) {
        if (uri == null) {
            imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
        } else if (uri.getScheme().startsWith("http")) {
            Bitmap downloadBitmap = downloadBitmap(uri);
            if (downloadBitmap == null) {
                imageView.setImageResource(C5321R.C5323drawable.avatar);
            }
            imageView.setImageBitmap(downloadBitmap);
        } else {
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(context2.getContentResolver(), uri);
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageBitmap(ContactsManager.getInstance().getDefaultAvatarBitmap());
                }
            } catch (IOException e) {
                Log.m6903e("Error in setThumbnailPictureFromUri: " + e);
            }
        }
    }

    public static final List<LinphoneCall> getLinphoneCallsNotInConf(LinphoneCore linphoneCore) {
        ArrayList arrayList = new ArrayList();
        for (LinphoneCall linphoneCall : linphoneCore.getCalls()) {
            if (!linphoneCall.isInConference()) {
                arrayList.add(linphoneCall);
            }
        }
        return arrayList;
    }

    public static final List<LinphoneCall> getLinphoneCallsInConf(LinphoneCore linphoneCore) {
        ArrayList arrayList = new ArrayList();
        for (LinphoneCall linphoneCall : linphoneCore.getCalls()) {
            if (linphoneCall.isInConference()) {
                arrayList.add(linphoneCall);
            }
        }
        return arrayList;
    }

    public static final List<LinphoneCall> getLinphoneCalls(LinphoneCore linphoneCore) {
        return new ArrayList(Arrays.asList(linphoneCore.getCalls()));
    }

    public static final boolean hasExistingResumeableCall(LinphoneCore linphoneCore) {
        for (LinphoneCall state : getLinphoneCalls(linphoneCore)) {
            if (state.getState() == LinphoneCall.State.Paused) {
                return true;
            }
        }
        return false;
    }

    public static final List<LinphoneCall> getCallsInState(LinphoneCore linphoneCore, Collection<LinphoneCall.State> collection) {
        ArrayList arrayList = new ArrayList();
        for (LinphoneCall next : getLinphoneCalls(linphoneCore)) {
            if (collection.contains(next.getState())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List<LinphoneCall> getRunningOrPausedCalls(LinphoneCore linphoneCore) {
        return getCallsInState(linphoneCore, Arrays.asList(new LinphoneCall.State[]{LinphoneCall.State.Paused, LinphoneCall.State.PausedByRemote, LinphoneCall.State.StreamsRunning}));
    }

    public static final int countConferenceCalls(LinphoneCore linphoneCore) {
        int conferenceSize = linphoneCore.getConferenceSize();
        return linphoneCore.isInConference() ? conferenceSize - 1 : conferenceSize;
    }

    public static int countVirtualCalls(LinphoneCore linphoneCore) {
        return linphoneCore.getCallsNb() - countConferenceCalls(linphoneCore);
    }

    public static int countNonConferenceCalls(LinphoneCore linphoneCore) {
        return linphoneCore.getCallsNb() - countConferenceCalls(linphoneCore);
    }

    public static void setVisibility(View view, int i, boolean z) {
        view.findViewById(i).setVisibility(z ? 0 : 8);
    }

    public static void setVisibility(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static void enableView(View view, int i, View.OnClickListener onClickListener, boolean z) {
        View findViewById = view.findViewById(i);
        findViewById.setVisibility(z ? 0 : 8);
        findViewById.setOnClickListener(onClickListener);
    }

    public static int pixelsToDpi(Resources resources, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    public static boolean isCallRunning(LinphoneCall linphoneCall) {
        if (linphoneCall == null) {
            return false;
        }
        LinphoneCall.State state = linphoneCall.getState();
        if (state == LinphoneCall.State.Connected || state == LinphoneCall.State.CallUpdating || state == LinphoneCall.State.CallUpdatedByRemote || state == LinphoneCall.State.StreamsRunning || state == LinphoneCall.State.Resuming) {
            return true;
        }
        return false;
    }

    public static boolean isCallEstablished(LinphoneCall linphoneCall) {
        if (linphoneCall == null) {
            return false;
        }
        LinphoneCall.State state = linphoneCall.getState();
        if (isCallRunning(linphoneCall) || state == LinphoneCall.State.Paused || state == LinphoneCall.State.PausedByRemote || state == LinphoneCall.State.Pausing) {
            return true;
        }
        return false;
    }

    public static boolean isHighBandwidthConnection(Context context2) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && isConnectionFast(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
    }

    public static void clearLogs() {
        try {
            Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
        } catch (IOException e) {
            Log.m6903e(e);
        }
    }

    public static boolean zipLogs(StringBuilder sb, String str) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
            zipOutputStream.putNextEntry(new ZipEntry("logs.txt"));
            zipOutputStream.write(sb.toString().getBytes());
            zipOutputStream.close();
            return true;
        } catch (Exception e) {
            Log.m6903e("Exception when trying to zip the logs: " + e.getMessage());
            return false;
        }
    }

    public static void collectLogs(Context context2, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "|", "grep", "`adb shell ps | grep " + context2.getPackageName() + " | cut -c10-15`"}).getInputStream()), 2048);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\r\n");
            }
            String str2 = context2.getExternalFilesDir((String) null).getAbsolutePath() + "/logs.zip";
            Log.m6905i("Saving logs to " + str2);
            if (zipLogs(sb, str2)) {
                String string = context2 != null ? context2.getString(C5321R.string.app_name) : "Linphone(?)";
                Uri parse = Uri.parse("file://" + str2);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                intent.putExtra("android.intent.extra.SUBJECT", string + " Logs");
                intent.putExtra("android.intent.extra.TEXT", string + " logs");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.STREAM", parse);
                try {
                    context2.startActivity(Intent.createChooser(intent, "Send mail..."));
                } catch (ActivityNotFoundException unused) {
                }
            }
        } catch (IOException e) {
            Log.m6903e(e);
        }
    }

    public static String getNameFromFilePath(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf > 0 ? str.substring(lastIndexOf + 1) : str;
    }

    public static String getExtensionFromFileName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static Boolean isExtensionImage(String str) {
        String extensionFromFileName = getExtensionFromFileName(str);
        if (extensionFromFileName != null) {
            extensionFromFileName = extensionFromFileName.toLowerCase();
        }
        return Boolean.valueOf(extensionFromFileName != null && extensionFromFileName.matches(".*(png|jpg|jpeg|bmp|gif).*"));
    }

    public static void recursiveFileRemoval(File file) {
        File[] listFiles;
        if (!file.delete() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File recursiveFileRemoval : listFiles) {
                recursiveFileRemoval(recursiveFileRemoval);
            }
        }
    }

    public static String getDisplayableUsernameFromAddress(String str) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null) {
            return str;
        }
        if (str.startsWith("sip:")) {
            str = str.substring(4);
        }
        if (!str.contains("@")) {
            return str;
        }
        String str2 = str.split("@")[1];
        LinphoneProxyConfig defaultProxyConfig = lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig();
        if (defaultProxyConfig == null) {
            return str2.equals(LinphoneManager.getInstance().getContext().getString(C5321R.string.default_domain)) ? str.split("@")[0] : str;
        }
        if (str2.equals(defaultProxyConfig.getDomain())) {
            return str.split("@")[0];
        }
        return str;
    }

    public static String getFullAddressFromUsername(String str) {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null) {
            return str;
        }
        if (!str.startsWith("sip:")) {
            str = "sip:" + str;
        }
        if (str.contains("@")) {
            return str;
        }
        LinphoneProxyConfig defaultProxyConfig = lcIfManagerNotDestroyedOrNull.getDefaultProxyConfig();
        if (defaultProxyConfig != null) {
            return str + "@" + defaultProxyConfig.getDomain();
        }
        return str + "@" + LinphoneManager.getInstance().getContext().getString(C5321R.string.default_domain);
    }

    public static void storeImage(Context context2, LinphoneChatMessage linphoneChatMessage) {
        if (linphoneChatMessage != null && linphoneChatMessage.getFileTransferInformation() != null && linphoneChatMessage.getAppData() != null) {
            File file = new File(Environment.getExternalStorageDirectory(), linphoneChatMessage.getAppData());
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath());
            if (decodeFile != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", file.getName());
                String subtype = linphoneChatMessage.getFileTransferInformation().getSubtype();
                contentValues.put("mime_type", "image/" + subtype);
                ContentResolver contentResolver = context2.getContentResolver();
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                try {
                    OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                    if (subtype == null || !subtype.toLowerCase(Locale.getDefault()).equals("png")) {
                        decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                    } else {
                        decodeFile.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream);
                    }
                    openOutputStream.close();
                    file.delete();
                    decodeFile.recycle();
                    linphoneChatMessage.setAppData(insert.toString());
                } catch (FileNotFoundException e) {
                    Log.m6903e(e);
                } catch (IOException e2) {
                    Log.m6903e(e2);
                }
            }
        }
    }

    private static Context getContext() {
        if (context == null && LinphoneManager.isInstanciated()) {
            context = LinphoneManager.getInstance().getContext();
        }
        return context;
    }

    public static void displayError(boolean z, TextView textView, String str) {
        if (z) {
            textView.setVisibility(4);
            textView.setText("");
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    public static String errorForPhoneNumberStatus(int i) {
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        if (LinphoneAccountCreator.PhoneNumberCheck.CountryCodeInvalid.value() == (LinphoneAccountCreator.PhoneNumberCheck.CountryCodeInvalid.value() & i)) {
            return context2.getString(C5321R.string.country_code_invalid);
        }
        if (LinphoneAccountCreator.PhoneNumberCheck.TooShort.value() == (LinphoneAccountCreator.PhoneNumberCheck.TooShort.value() & i)) {
            return context2.getString(C5321R.string.phone_number_too_short);
        }
        if (LinphoneAccountCreator.PhoneNumberCheck.TooLong.value() == (LinphoneAccountCreator.PhoneNumberCheck.TooLong.value() & i)) {
            return context2.getString(C5321R.string.phone_number_too_long);
        }
        if (LinphoneAccountCreator.PhoneNumberCheck.Invalid.value() == (i & LinphoneAccountCreator.PhoneNumberCheck.Invalid.value())) {
            return context2.getString(C5321R.string.phone_number_invalid);
        }
        return null;
    }

    public static String errorForEmailStatus(LinphoneAccountCreator.EmailCheck emailCheck) {
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        if (emailCheck.equals(LinphoneAccountCreator.EmailCheck.InvalidCharacters) || emailCheck.equals(LinphoneAccountCreator.EmailCheck.Malformed)) {
            return context2.getString(C5321R.string.invalid_email);
        }
        return null;
    }

    public static String errorForUsernameStatus(LinphoneAccountCreator.UsernameCheck usernameCheck) {
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        if (usernameCheck.equals(LinphoneAccountCreator.UsernameCheck.InvalidCharacters)) {
            return context2.getString(C5321R.string.invalid_username);
        }
        if (usernameCheck.equals(LinphoneAccountCreator.UsernameCheck.TooShort)) {
            return context2.getString(C5321R.string.username_too_short);
        }
        if (usernameCheck.equals(LinphoneAccountCreator.UsernameCheck.TooLong)) {
            return context2.getString(C5321R.string.username_too_long);
        }
        if (usernameCheck.equals(LinphoneAccountCreator.UsernameCheck.Invalid)) {
            return context2.getString(C5321R.string.username_invalid_size);
        }
        if (usernameCheck.equals(LinphoneAccountCreator.UsernameCheck.InvalidCharacters)) {
            return context2.getString(C5321R.string.invalid_display_name);
        }
        return null;
    }

    public static String errorForPasswordStatus(LinphoneAccountCreator.PasswordCheck passwordCheck) {
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        if (passwordCheck.equals(LinphoneAccountCreator.PasswordCheck.TooShort)) {
            return context2.getString(C5321R.string.password_too_short);
        }
        if (passwordCheck.equals(LinphoneAccountCreator.PasswordCheck.TooLong)) {
            return context2.getString(C5321R.string.password_too_long);
        }
        return null;
    }

    public static String errorForRequestStatus(LinphoneAccountCreator.RequestStatus requestStatus) {
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.Failed)) {
            return context2.getString(C5321R.string.request_failed);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.ErrorServer)) {
            return context2.getString(C5321R.string.wizard_failed);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExist) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountExistWithAlias)) {
            return context2.getString(C5321R.string.account_already_exist);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasIsAccount) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasExist)) {
            return context2.getString(C5321R.string.assistant_phone_number_unavailable);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotExist)) {
            return context2.getString(C5321R.string.assistant_error_bad_credentials);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasNotExist)) {
            return context2.getString(C5321R.string.phone_number_not_exist);
        }
        if (requestStatus.equals(LinphoneAccountCreator.RequestStatus.AliasNotExist) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotActivated) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountAlreadyActivated) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountActivated) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.AccountNotCreated) || requestStatus.equals(LinphoneAccountCreator.RequestStatus.f6352Ok)) {
            return "";
        }
        return null;
    }

    public static String getCountryCode(EditText editText) {
        if (editText == null) {
            return null;
        }
        String obj = editText.getText().toString();
        return (obj == null || !obj.startsWith("+")) ? obj : obj.substring(1);
    }

    public static void setCountry(DialPlan dialPlan, EditText editText, Button button, int i) {
        if (dialPlan != null && editText != null && button != null) {
            editText.setText(dialPlan.getCountryCode());
            button.setText(dialPlan.getCountryName());
        } else if (i != -1) {
            editText.setText("+" + i);
        } else {
            editText.setText("+");
        }
    }

    public static void displayErrorAlert(String str, Context context2) {
        if (context2 != null && str != null) {
            new AlertDialog.Builder(context2).setMessage(str).setCancelable(false).setNeutralButton(context2.getString(C5321R.string.f6327ok), (DialogInterface.OnClickListener) null).show();
        }
    }

    public static String getFilePath(Context context2, Uri uri) {
        Uri uri2 = null;
        if (Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context2, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                String typeFromUri = getTypeFromUri(uri, context2);
                String dataColumn = getDataColumn(context2, uri, (String) null, (String[]) null);
                if (TextUtils.isEmpty(dataColumn) && (uri.getAuthority().contains("com.google.android") || uri.getAuthority().contains("com.android"))) {
                    try {
                        File createFile = createFile(context2, (String) null, typeFromUri);
                        FileInputStream sourceStream = getSourceStream(context2, uri);
                        if (copyToFile(sourceStream, createFile)) {
                            dataColumn = createFile.getAbsolutePath();
                        }
                        sourceStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return dataColumn;
            } else if (UriUtil.LOCAL_FILE_SCHEME.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if (split.length >= 1) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            }
        } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            try {
                return getDataColumn(context2, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
            } catch (NumberFormatException unused) {
                if (documentId.startsWith("raw:")) {
                    return documentId.substring(4);
                }
            }
        } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str = split2[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(context2, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    private static String getTypeFromUri(Uri uri, Context context2) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(context2.getContentResolver().getType(uri));
    }

    private static boolean copyToFile(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        if (!(inputStream == null || file == null)) {
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        return true;
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        }
        return false;
    }

    public static String getTimestamp() {
        try {
            return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ROOT).format(new Date());
        } catch (RuntimeException unused) {
            return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        }
    }

    public static File createFile(Context context2, String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            str = getTimestamp() + "." + str2;
        }
        File externalCacheDir = context2.getExternalCacheDir();
        if (externalCacheDir != null && !externalCacheDir.exists()) {
            externalCacheDir.mkdirs();
        }
        return new File(externalCacheDir, str);
    }

    public static FileInputStream getSourceStream(Context context2, Uri uri) throws FileNotFoundException {
        if (Build.VERSION.SDK_INT < 19) {
            return (FileInputStream) context2.getContentResolver().openInputStream(uri);
        }
        ParcelFileDescriptor openFileDescriptor = context2.getContentResolver().openFileDescriptor(uri, "r");
        if (openFileDescriptor != null) {
            return new FileInputStream(openFileDescriptor.getFileDescriptor());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0031 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x002b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x0028
            r8.close()
        L_0x0028:
            return r9
        L_0x0029:
            r9 = move-exception
            goto L_0x0033
        L_0x002b:
            if (r8 == 0) goto L_0x0030
            r8.close()
        L_0x0030:
            return r7
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            if (r8 == 0) goto L_0x0038
            r8.close()
        L_0x0038:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getRealPathFromURI(Context context2, Uri uri) {
        Cursor loadInBackground = new CursorLoader(context2, uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null).loadInBackground();
        if (loadInBackground == null || !loadInBackground.moveToFirst()) {
            return null;
        }
        String string = loadInBackground.getString(loadInBackground.getColumnIndexOrThrow("_data"));
        loadInBackground.close();
        return string;
    }

    public static String processContactUri(Context context2, Uri uri) {
        InputStream inputStream;
        ContentResolver contentResolver = context2.getContentResolver();
        if (contentResolver != null) {
            try {
                inputStream = contentResolver.openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                inputStream = null;
            }
            if (inputStream != null) {
                StringBuffer stringBuffer = new StringBuffer("");
                while (true) {
                    try {
                        int read = inputStream.read();
                        if (read == -1) {
                            break;
                        }
                        stringBuffer.append((char) read);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return new String(stringBuffer);
            }
        }
        return null;
    }

    public static String getContactNameFromVcard(String str) {
        if (str == null) {
            return null;
        }
        String substring = str.substring(str.indexOf("FN:") + 3);
        return substring.substring(0, substring.indexOf("\n") - 1).replace(";", "").replace(" ", "");
    }

    public static Uri createCvsFromString(String str) {
        String contactNameFromVcard = getContactNameFromVcard(str);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file = new File(externalStorageDirectory, contactNameFromVcard + ".cvs");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
            return Uri.fromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
