package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;
import org.linphone.LinphonePreferences;
import org.linphone.LinphoneService;
import org.linphone.MyIntentService;
import p035ru.unicorn.BuildConfig;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.sip.SipResponse;
import p035ru.unicorn.ujin.util.LinphoneHelper;
import p042cz.msebera.android.httpclient.Header;
import p046io.realm.ImportFlag;
import p046io.realm.Realm;

/* renamed from: ru.unicorn.ujin.util.LinphoneHelper */
public class LinphoneHelper {
    public static void deleteAccount() {
        if (LinphonePreferences.instance() != null && LinphonePreferences.instance().getAccountCount() > 0) {
            LinphonePreferences.instance().deleteAccount(0);
        }
    }

    public static void updateDriver(Context context) {
        String file = context.getFilesDir().toString();
        if (!new File(file + "/" + "libopenh264.so").exists()) {
            Log.d("TAG", "XXX start update driver");
            if (!ServiceHelper.isMyServiceRunning(LinphoneService.class, context)) {
                Intent intent = new Intent(context, LinphoneService.class);
                intent.putExtra("only_update", true);
                context.startService(intent);
            }
            context.startService(new Intent(context, MyIntentService.class));
            new Handler().postDelayed(new Runnable(context) {
                private final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    ServiceHelper.stopLinphoneService(this.f$0);
                }
            }, 8000);
        }
    }

    public static boolean driverExist(Context context) {
        String file = context.getFilesDir().toString();
        return new File(file + "/" + "libopenh264.so").exists();
    }

    public static void registerPushToken(final Context context, final String str, final String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://api-product.mysmartflat.ru/api/");
        sb.append(z ? "push/subscribe/?token=" : "push/unsubscribe/?token=");
        String sb2 = sb.toString();
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient(true, 80, 443);
        String str3 = sb2 + str + "&tokenbrowser=" + str2 + "&device_type=android&build=" + BuildConfig.VERSION_NAME + "&mac=" + AppUtils.getPhoneMac();
        Log.d("TAG", "XXX  url " + str3);
        asyncHttpClient.post(str3, new JsonHttpResponseHandler() {
            public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
            }

            public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
                LinphoneHelper.getSip(str, str2, context);
            }
        });
    }

    public static void pushToken(Context context, String str, boolean z) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener(z, context, str) {
            private final /* synthetic */ boolean f$0;
            private final /* synthetic */ Context f$1;
            private final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onComplete(Task task) {
                LinphoneHelper.lambda$pushToken$1(this.f$0, this.f$1, this.f$2, task);
            }
        });
    }

    static /* synthetic */ void lambda$pushToken$1(boolean z, Context context, String str, Task task) {
        try {
            if (task.getResult() != null) {
                String token = ((InstanceIdResult) task.getResult()).getToken();
                ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
                if (z) {
                    instance.saveFirebaseToProfile(token);
                    AppUtils.saveKeyValuePair("firebase", token, context);
                } else {
                    instance.saveFirebaseToProfile("");
                    deleteFcmAccount();
                }
                registerPushToken(context, str, token, z);
            }
        } catch (Exception e) {
            Log.d("TAG", "XXX pushToken " + e.getMessage());
        }
    }

    private static void deleteFcmAccount() {
        new Thread($$Lambda$LinphoneHelper$odvkUq2FZUxiuaY8wH_2ncxDCcM.INSTANCE).start();
    }

    static /* synthetic */ void lambda$deleteFcmAccount$2() {
        try {
            FirebaseInstanceId.getInstance().deleteInstanceId();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pushToken(Context context, String str) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener(context, str) {
            private final /* synthetic */ Context f$0;
            private final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onComplete(Task task) {
                LinphoneHelper.registerPushToken(this.f$0, this.f$1, ((InstanceIdResult) task.getResult()).getToken(), true);
            }
        });
    }

    public static void getSip(String str, String str2, final Context context) {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient(true, 80, 443);
        asyncHttpClient.post("https://api-product.mysmartflat.ru/api/intercom/get_sip_information/?token=" + str + "&firebase_token=" + str2, new JsonHttpResponseHandler() {
            public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
            }

            public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
                SipResponse sipResponse = (SipResponse) new Gson().fromJson(jSONObject.toString(), SipResponse.class);
                if (!(sipResponse.getError() != 0 || sipResponse.getData() == null || sipResponse.getData().getSipUser().intValue() == 0)) {
                    ProfileLocalRepository.Companion.getInstance().deleteSip();
                    Realm.getDefaultInstance().executeTransactionAsync(new Realm.Transaction() {
                        public final void execute(Realm realm) {
                            LinphoneHelper.C57692.lambda$onSuccess$0(SipResponse.this, realm);
                        }
                    });
                }
                if (!LinphoneHelper.driverExist(context)) {
                    ServiceHelper.startLinphoneService(context, sipResponse.getData(), "");
                }
            }

            static /* synthetic */ void lambda$onSuccess$0(SipResponse sipResponse, Realm realm) {
                SipParametrs sipParametrs = (SipParametrs) realm.copyToRealmOrUpdate(sipResponse.getData(), new ImportFlag[0]);
            }
        });
    }
}
