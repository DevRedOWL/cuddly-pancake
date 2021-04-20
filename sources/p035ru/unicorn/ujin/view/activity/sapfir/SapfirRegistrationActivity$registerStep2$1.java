package p035ru.unicorn.ujin.view.activity.sapfir;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.registration.RegistrationResponse;
import p035ru.unicorn.ujin.data.registration.RegistrationResponseData;
import p042cz.msebera.android.httpclient.Header;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/sapfir/SapfirRegistrationActivity$registerStep2$1", "Lcom/loopj/android/http/JsonHttpResponseHandler;", "onFailure", "", "statusCode", "", "headers", "", "Lcz/msebera/android/httpclient/Header;", "e", "", "response", "Lorg/json/JSONObject;", "(I[Lcz/msebera/android/httpclient/Header;Ljava/lang/Throwable;Lorg/json/JSONObject;)V", "onSuccess", "(I[Lcz/msebera/android/httpclient/Header;Lorg/json/JSONObject;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity$registerStep2$1 */
/* compiled from: SapfirRegistrationActivity.kt */
public final class SapfirRegistrationActivity$registerStep2$1 extends JsonHttpResponseHandler {
    final /* synthetic */ SapfirRegistrationActivity this$0;

    SapfirRegistrationActivity$registerStep2$1(SapfirRegistrationActivity sapfirRegistrationActivity) {
        this.this$0 = sapfirRegistrationActivity;
    }

    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        RegistrationResponseData.AppLink appLink;
        String android2;
        StringBuilder sb = new StringBuilder();
        sb.append("Messsage: ");
        Intrinsics.checkNotNull(jSONObject);
        sb.append(jSONObject.toString());
        Log.d("Response Step 2", sb.toString());
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        SapfirRegistrationActivity sapfirRegistrationActivity = this.this$0;
        sapfirRegistrationActivity.hideSoftKeyboard(sapfirRegistrationActivity);
        Object fromJson = new Gson().fromJson(jSONObject.toString(), (Type) RegistrationResponse.class);
        if (fromJson != null) {
            RegistrationResponse registrationResponse = (RegistrationResponse) fromJson;
            if (registrationResponse.getError() == 0) {
                Application application = this.this$0.getApplication();
                if (application != null) {
                    SharedPreferences.Editor edit = ((MainApplication) application).sharedPreferences.edit();
                    RegistrationResponseData data = registrationResponse.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "regResponse.data");
                    edit.putString("token", data.getToken()).apply();
                    this.this$0.profileViewModel.getLoginMutableLiveData().observe(this.this$0, new SapfirRegistrationActivity$registerStep2$1$onSuccess$1(this));
                    ProfileViewModel profileViewModel = this.this$0.profileViewModel;
                    RegistrationResponseData data2 = registrationResponse.getData();
                    Intrinsics.checkNotNullExpressionValue(data2, "regResponse.data");
                    String token = data2.getToken();
                    Intrinsics.checkNotNullExpressionValue(token, "regResponse.data.token");
                    profileViewModel.requestUser(token);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.MainApplication");
            }
            Toast.makeText(this.this$0.getApplicationContext(), registrationResponse.getMessage(), 1).show();
            RegistrationResponseData data3 = registrationResponse.getData();
            if (data3 != null && (appLink = data3.appLink) != null && (android2 = appLink.getAndroid()) != null) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(android2)));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.registration.RegistrationResponse");
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(th, "e");
        Log.e("ERROR", th.toString());
    }
}
