package p035ru.unicorn.ujin.view.activity.sapfir;

import android.util.Log;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.loopj.android.http.JsonHttpResponseHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.C5619R;
import p042cz.msebera.android.httpclient.Header;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/sapfir/SapfirRegistrationActivity$registerMSF$1", "Lcom/loopj/android/http/JsonHttpResponseHandler;", "onFailure", "", "statusCode", "", "headers", "", "Lcz/msebera/android/httpclient/Header;", "e", "", "response", "Lorg/json/JSONObject;", "(I[Lcz/msebera/android/httpclient/Header;Ljava/lang/Throwable;Lorg/json/JSONObject;)V", "onSuccess", "(I[Lcz/msebera/android/httpclient/Header;Lorg/json/JSONObject;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity$registerMSF$1 */
/* compiled from: SapfirRegistrationActivity.kt */
public final class SapfirRegistrationActivity$registerMSF$1 extends JsonHttpResponseHandler {
    final /* synthetic */ SapfirRegistrationActivity this$0;

    SapfirRegistrationActivity$registerMSF$1(SapfirRegistrationActivity sapfirRegistrationActivity) {
        this.this$0 = sapfirRegistrationActivity;
    }

    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = null;
            try {
                JSONObject jSONObject3 = new JSONObject(String.valueOf(jSONObject));
                if (jSONObject3.getInt("error") == 0) {
                    Toast.makeText(this.this$0.getApplicationContext(), "Введите код подтверждения", 1).show();
                    RelativeLayout relativeLayout = (RelativeLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.rlRegistrationStep1);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlRegistrationStep1");
                    relativeLayout.setVisibility(8);
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.rlRegistrationStep2);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlRegistrationStep2");
                    relativeLayout2.setVisibility(0);
                    EditText editText = (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.editTextSMS);
                    Intrinsics.checkNotNullExpressionValue(editText, "editTextSMS");
                    this.this$0.showKeyboard(this.this$0, editText);
                } else {
                    Toast.makeText(this.this$0.getApplicationContext(), jSONObject3.getString("message"), 1).show();
                }
                ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            Log.e("Error", e2.toString());
        }
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(th, "e");
        Log.e("ERROR", th.toString());
        this.this$0.exit(0);
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
    }
}
