package p035ru.unicorn.ujin.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.data.Action;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoPreviewFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u000bJ\b\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0014J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\tH\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/MjpegVideoActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "Lru/unicorn/ujin/view/fragments/BaseFragment$FragmentListener;", "()V", "detector", "Landroid/view/GestureDetector;", "getBottomNavigationMenuId", "", "hasBottomSheet", "", "hideSystemUI", "", "onBackFragment", "fragment", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFinish", "token", "", "onNextFragment", "Landroidx/fragment/app/Fragment;", "clearBackStack", "tag", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onVideoClick", "setScreenOn", "showChatsFragment", "showExitButton", "show", "showSystemUI", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.MjpegVideoActivity */
/* compiled from: MjpegVideoActivity.kt */
public final class MjpegVideoActivity extends BaseActivity implements BaseFragment.FragmentListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private GestureDetector detector;

    @JvmStatic
    public static final Intent start(Context context, String str, String str2, VideoDataSaver.VideoDataType videoDataType) {
        return Companion.start(context, str, str2, videoDataType);
    }

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
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    public void onBackFragment() {
    }

    public void onBackFragment(BaseFragment baseFragment) {
    }

    public void onFinish(String str) {
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    public void onNextFragment(Fragment fragment, boolean z, String str) {
        Intrinsics.checkNotNullParameter(fragment, Action.FRAGMENT);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        supportFragmentManager.beginTransaction().replace((int) R.id.main_container, fragment, "").addToBackStack("").commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String stringExtra;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_mjpeg_preview);
        setScreenOn();
        this.detector = new GestureDetector(this, new TapDetector());
        hideSystemUI();
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("title")) == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "intent?.getStringExtra(\"title\")?:\"\"");
        Intent intent2 = getIntent();
        if (intent2 == null || (str2 = intent2.getStringExtra("type")) == null) {
            str2 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str2, "intent?.getStringExtra(\"type\")?:\"\"");
        Intent intent3 = getIntent();
        if (!(intent3 == null || (stringExtra = intent3.getStringExtra("url")) == null)) {
            VideoPreviewFragment start = VideoPreviewFragment.start(2, stringExtra, str, str2);
            Intrinsics.checkNotNullExpressionValue(start, "VideoPreviewFragment.sta…ISTABLE, it, title, type)");
            onNextFragment(start, false, "");
        }
        ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.tvExit)).setOnClickListener(new MjpegVideoActivity$onCreate$2(this));
    }

    private final void setScreenOn() {
        getWindow().addFlags(128);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/MjpegVideoActivity$Companion;", "", "()V", "start", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "url", "", "title", "type", "Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver$VideoDataType;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.MjpegVideoActivity$Companion */
    /* compiled from: MjpegVideoActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent start(Context context, String str, String str2, VideoDataSaver.VideoDataType videoDataType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(videoDataType, "type");
            Intent intent = new Intent(context, MjpegVideoActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("title", str2);
            intent.putExtra("type", videoDataType.getVideoDataKey());
            return intent;
        }
    }

    /* access modifiers changed from: private */
    public final void hideSystemUI() {
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        decorView.setSystemUiVisibility(3846);
    }

    private final void showSystemUI() {
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1792);
    }

    public void onBackPressed() {
        finish();
    }

    public final void onVideoClick() {
        showExitButton(true);
        showSystemUI();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            new Handler(myLooper).postDelayed(new MjpegVideoActivity$onVideoClick$$inlined$let$lambda$1(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    public final void showExitButton(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.tvExit);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "tvExit");
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.tvExit);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "tvExit");
        linearLayout2.setVisibility(4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        GestureDetector gestureDetector = this.detector;
        if (gestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detector");
        }
        gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0) {
            return true;
        }
        showSystemUI();
        new Handler().postDelayed(new MjpegVideoActivity$onTouchEvent$1(this), 2000);
        return true;
    }
}
