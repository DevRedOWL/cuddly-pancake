package p035ru.unicorn.ujin.view.activity.domru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/PasswordWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startAuthActivity", "hasBeenSent", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.PasswordWebViewActivity */
/* compiled from: PasswordWebViewActivity.kt */
public final class PasswordWebViewActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String URL = "url";
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_password_web_view);
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivClose)).setOnClickListener(new PasswordWebViewActivity$onCreate$1(this));
        WebView webView = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        WebView webView2 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView2, "webView");
        WebSettings settings2 = webView2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "webView.settings");
        settings2.setDomStorageEnabled(true);
        WebView webView3 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView3, "webView");
        webView3.setWebViewClient(new PasswordWebViewActivity$onCreate$2(this));
        ((WebView) _$_findCachedViewById(C5619R.C5622id.webView)).setOnLongClickListener(PasswordWebViewActivity$onCreate$3.INSTANCE);
        WebView webView4 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        Intrinsics.checkNotNullExpressionValue(webView4, "webView");
        webView4.setLongClickable(false);
        WebView webView5 = (WebView) _$_findCachedViewById(C5619R.C5622id.webView);
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        webView5.loadUrl(stringExtra);
    }

    public void onBackPressed() {
        startAuthActivity(false);
    }

    /* access modifiers changed from: private */
    public final void startAuthActivity(boolean z) {
        startActivity(new Intent(this, RegisterDomruActivity.class).putExtra(RegisterDomruActivity.PASSWORD_HAS_BEEN_SENT, z));
        finish();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/PasswordWebViewActivity$Companion;", "", "()V", "URL", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.domru.PasswordWebViewActivity$Companion */
    /* compiled from: PasswordWebViewActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
