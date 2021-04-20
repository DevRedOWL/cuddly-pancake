package p035ru.unicorn.ujin.view.fragments;

import android.util.Log;
import android.widget.Toast;
import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.login.DemoLoginResponse;
import p035ru.unicorn.ujin.data.login.DemoLoginResponseData;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;
import p042cz.msebera.android.httpclient.Header;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/DemoHubFragment$demo2ResponseHandler$1", "Lcom/loopj/android/http/JsonHttpResponseHandler;", "onFailure", "", "statusCode", "", "headers", "", "Lcz/msebera/android/httpclient/Header;", "responseString", "", "throwable", "", "(I[Lcz/msebera/android/httpclient/Header;Ljava/lang/String;Ljava/lang/Throwable;)V", "onSuccess", "jsonResponse", "Lorg/json/JSONObject;", "(I[Lcz/msebera/android/httpclient/Header;Lorg/json/JSONObject;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.DemoHubFragment$demo2ResponseHandler$1 */
/* compiled from: DemoHubFragment.kt */
public final class DemoHubFragment$demo2ResponseHandler$1 extends JsonHttpResponseHandler {
    final /* synthetic */ DemoHubFragment this$0;

    DemoHubFragment$demo2ResponseHandler$1(DemoHubFragment demoHubFragment) {
        this.this$0 = demoHubFragment;
    }

    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(headerArr, "headers");
        Intrinsics.checkNotNullParameter(jSONObject, "jsonResponse");
        DemoLoginResponse demoLoginResponse = (DemoLoginResponse) new Gson().fromJson(jSONObject.toString(), DemoLoginResponse.class);
        Intrinsics.checkNotNullExpressionValue(demoLoginResponse, "response");
        if (demoLoginResponse.getError() == 0) {
            ProfileViewModel profileViewModel = this.this$0.getBaseActivity().profileViewModel;
            DemoLoginResponseData data = demoLoginResponse.getData();
            Intrinsics.checkNotNullExpressionValue(data, "response.data");
            DemoUser user = data.getUser();
            Intrinsics.checkNotNullExpressionValue(user, "response.data.user");
            profileViewModel.setDemoUser(user);
            if (this.this$0.getFlatId() != null) {
                this.this$0.getBaseActivity().showDemo2Stage(this.this$0.getFlatUid(), this.this$0.getComplexId(), this.this$0.getFlatId());
                return;
            }
            DemoHubFragment$demo2ResponseHandler$1 demoHubFragment$demo2ResponseHandler$1 = this;
            this.this$0.getBaseActivity().showDemo2Stage(this.this$0.getFlatUid(), this.this$0.getComplexId());
            return;
        }
        Toast.makeText(this.this$0.getContext(), "Произошла ошибка, попробуйте еще раз", 1).show();
    }

    public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(headerArr, "headers");
        Intrinsics.checkNotNullParameter(str, "responseString");
        Intrinsics.checkNotNullParameter(th, "throwable");
        Log.d("Login", "login faled");
    }
}
