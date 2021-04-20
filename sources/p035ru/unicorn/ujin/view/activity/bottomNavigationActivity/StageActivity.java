package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.tasks.Task;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.Enums;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.service.location.ServiceRunningChecker;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.CallMaker;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.TermsActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.BleSettingsFragmentKt;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.fragments.CallAttentionDialog;
import p035ru.unicorn.ujin.view.fragments.chats.ChatListFragment;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J8\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001a\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\rH\u0002J\u0012\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u00010(H\u0014J-\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00172\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020#072\u0006\u00108\u001a\u000209H\u0016¢\u0006\u0002\u0010:J1\u0010;\u001a\u00020\u00152\u0010\u00106\u001a\f\u0012\u0006\b\u0001\u0012\u00020#\u0018\u0001072\u0006\u00105\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010=H\u0017¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\u0015H\u0002J\b\u0010@\u001a\u00020\u0015H\u0002J\b\u0010A\u001a\u00020\u0015H\u0014J\u000e\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u0017J\b\u0010C\u001a\u00020\u0015H\u0002J\b\u0010D\u001a\u00020\u0015H\u0002J\b\u0010E\u001a\u00020\u0015H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006G"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "Lcom/facebook/react/modules/core/PermissionAwareActivity;", "()V", "appStage", "Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;", "getAppStage", "()Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;", "setAppStage", "(Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;)V", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "hasHotkeys", "", "getHasHotkeys", "()Z", "setHasHotkeys", "(Z)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "checkVersionUpdates", "", "getBottomNavigationMenuId", "", "handleChatEvent", "chatListEvent", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "hasBottomSheet", "initAppShortCut", "result", "", "Lru/unicorn/ujin/data/MyPassIn;", "initBottomSheet", "makeRouteToApp", "event", "", "sectionId", "secondSectionID", "fromPush", "pushIntent", "Landroid/content/Intent;", "makeRouteToAppByEvent", "navigateProfile", "whatToOpen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetSchema", "resource", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onNewIntent", "intent", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermissions", "listener", "Lcom/facebook/react/modules/core/PermissionListener;", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "selectDummy", "showAlert", "showChatsFragment", "serviceType", "showLinphoneTutorialIfNeeded", "showUpdatingAvailableDialog", "startLocationServiceChecker", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity */
/* compiled from: StageActivity.kt */
public final class StageActivity extends BaseActivity implements PermissionAwareActivity {
    public static final String APP_STAGE = "appStage";
    public static final int CHAT_LIMIT = 200;
    public static final int CHAT_MANAGER_SERVICE_TYPE = 5;
    public static final int CHAT_OFFSET = 0;
    public static final String CHECKING_VERSION_TIME = "checkingVersionTime";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "StageActivity";
    private HashMap _$_findViewCache;
    private AppStage appStage = AppStage.SMARTFLAT;
    private AppUpdateManager appUpdateManager;
    private boolean hasHotkeys;
    /* access modifiers changed from: private */
    public SharedPreferences sharedPreferences;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[AppStage.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[AppStage.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$3 = new int[AppStage.values().length];

        static {
            $EnumSwitchMapping$0[AppStage.NEW_FLAT.ordinal()] = 1;
            $EnumSwitchMapping$0[AppStage.COMPLEX_CONSTRUCTION.ordinal()] = 2;
            $EnumSwitchMapping$0[AppStage.SMARTFLAT.ordinal()] = 3;
            $EnumSwitchMapping$1[AppStage.SMARTFLAT.ordinal()] = 1;
            $EnumSwitchMapping$2 = new int[Enums.PushClickEventType.values().length];
            $EnumSwitchMapping$2[Enums.PushClickEventType.NEWS_PUPLISH.ordinal()] = 1;
            $EnumSwitchMapping$2[Enums.PushClickEventType.SMART_HOUSE_MESSAGE.ordinal()] = 2;
            $EnumSwitchMapping$2[Enums.PushClickEventType.SMART_HOUSE.ordinal()] = 3;
            $EnumSwitchMapping$2[Enums.PushClickEventType.TICKET_UPDATED.ordinal()] = 4;
            $EnumSwitchMapping$2[Enums.PushClickEventType.TICKET_UPDATED_CHAT.ordinal()] = 5;
            $EnumSwitchMapping$2[Enums.PushClickEventType.PASS_REVOKED.ordinal()] = 6;
            $EnumSwitchMapping$2[Enums.PushClickEventType.NEW_MESSAGE.ordinal()] = 7;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET_COMPANY.ordinal()] = 8;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET.ordinal()] = 9;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET_GROUP.ordinal()] = 10;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET_OFFER.ordinal()] = 11;
            $EnumSwitchMapping$2[Enums.PushClickEventType.RENT_STATUS_CHANGED.ordinal()] = 12;
            $EnumSwitchMapping$2[Enums.PushClickEventType.PASS_SHOW_MY.ordinal()] = 13;
            $EnumSwitchMapping$2[Enums.PushClickEventType.ACCRUAL_CREATED.ordinal()] = 14;
            $EnumSwitchMapping$2[Enums.PushClickEventType.DEFAULT.ordinal()] = 15;
            $EnumSwitchMapping$2[Enums.PushClickEventType.EMPLOYEE_PERMISSION_CHANGED.ordinal()] = 16;
            $EnumSwitchMapping$2[Enums.PushClickEventType.RESIDENT_APARTMENT_ACCEPT.ordinal()] = 17;
            $EnumSwitchMapping$2[Enums.PushClickEventType.RESIDENT_APARTMENT_REJECT.ordinal()] = 18;
            $EnumSwitchMapping$3[AppStage.NEW_FLAT.ordinal()] = 1;
            $EnumSwitchMapping$3[AppStage.COMPLEX_CONSTRUCTION.ordinal()] = 2;
            $EnumSwitchMapping$3[AppStage.SMARTFLAT.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final Intent start(Context context, AppStage appStage2, Bundle bundle, boolean z) {
        return Companion.start(context, appStage2, bundle, z);
    }

    @JvmStatic
    public static final Intent start(Context context, AppStage appStage2, String str, Bundle bundle, boolean z) {
        return Companion.start(context, appStage2, str, bundle, z);
    }

    @JvmStatic
    public static final Intent start(Context context, AppStage appStage2, String str, boolean z) {
        return Companion.start(context, appStage2, str, z);
    }

    @JvmStatic
    public static final Intent start(Context context, AppStage appStage2, boolean z) {
        return Companion.start(context, appStage2, z);
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

    public static final /* synthetic */ SharedPreferences access$getSharedPreferences$p(StageActivity stageActivity) {
        SharedPreferences sharedPreferences2 = stageActivity.sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        return sharedPreferences2;
    }

    public final AppStage getAppStage() {
        return this.appStage;
    }

    public final void setAppStage(AppStage appStage2) {
        Intrinsics.checkNotNullParameter(appStage2, "<set-?>");
        this.appStage = appStage2;
    }

    public final boolean getHasHotkeys() {
        return this.hasHotkeys;
    }

    public final void setHasHotkeys(boolean z) {
        this.hasHotkeys = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity$Companion;", "", "()V", "APP_STAGE", "", "CHAT_LIMIT", "", "CHAT_MANAGER_SERVICE_TYPE", "CHAT_OFFSET", "CHECKING_VERSION_TIME", "TAG", "start", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "appStage", "Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;", "bundle", "Landroid/os/Bundle;", "showProfile", "", "tab", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$Companion */
    /* compiled from: StageActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent start(Context context, AppStage appStage, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appStage, StageActivity.APP_STAGE);
            Intent intent = new Intent(context, StageActivity.class);
            intent.putExtra(StageActivity.APP_STAGE, appStage.getStageNum());
            intent.putExtra("profile", z);
            intent.putExtra(ReactConst.SMARTFLAT, true);
            return intent;
        }

        @JvmStatic
        public final Intent start(Context context, AppStage appStage, Bundle bundle, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appStage, StageActivity.APP_STAGE);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intent intent = new Intent(context, StageActivity.class);
            bundle.remove(StageActivity.APP_STAGE);
            bundle.remove(ReactConst.SMARTFLAT);
            intent.putExtra(StageActivity.APP_STAGE, appStage.getStageNum());
            intent.putExtras(bundle);
            intent.putExtra("profile", z);
            return intent;
        }

        @JvmStatic
        public final Intent start(Context context, AppStage appStage, String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appStage, StageActivity.APP_STAGE);
            Intrinsics.checkNotNullParameter(str, "tab");
            Intent intent = new Intent(context, StageActivity.class);
            intent.putExtra(StageActivity.APP_STAGE, appStage.getStageNum());
            intent.putExtra(str, true);
            intent.putExtra("profile", z);
            return intent;
        }

        @JvmStatic
        public final Intent start(Context context, AppStage appStage, String str, Bundle bundle, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appStage, StageActivity.APP_STAGE);
            Intrinsics.checkNotNullParameter(str, "tab");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intent intent = new Intent(context, StageActivity.class);
            bundle.remove(StageActivity.APP_STAGE);
            bundle.remove(str);
            intent.putExtras(bundle);
            intent.putExtra("profile", z);
            intent.putExtra(StageActivity.APP_STAGE, appStage.getStageNum());
            intent.putExtra(str, true);
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0365, code lost:
        if (r12.getBoolean(p035ru.unicorn.ujin.data.Constants.SP_FIRST_LAUNCH_AFTER_REGISTARTION, false) == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (r2.getBoolean(p035ru.unicorn.ujin.data.Constants.SP_FIRST_LAUNCH_AFTER_REGISTARTION, false) == false) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = r11.appStage
            java.lang.String r0 = r0.name()
            r1 = 0
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r1)
            java.lang.String r2 = "getSharedPreferences(app…me, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r11.sharedPreferences = r0
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage$Companion r0 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.Companion
            android.content.Intent r2 = r11.getIntent()
            r3 = 3
            java.lang.String r4 = "appStage"
            int r2 = r2.getIntExtra(r4, r3)
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = r0.getByNumber(r2)
            r11.appStage = r0
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "demoFlatUID"
            java.lang.String r0 = r0.getStringExtra(r2)
            r11.demoFlatUid = r0
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "currentComplexId"
            java.lang.String r0 = r0.getStringExtra(r2)
            r11.currentComplexId = r0
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r4 = "demoFlatId"
            java.lang.String r0 = r0.getStringExtra(r4)
            r11.demoFlatId = r0
            r11.isChoosingApartmentVisible = r1
            super.onCreate(r12)
            java.lang.String r12 = r11.currentComplexId
            r0 = 0
            if (r12 != 0) goto L_0x0061
            ru.unicorn.ujin.data.realm.profile.Apartment r12 = r11.getCurrentApartment()
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = r12.getComplexId()
            goto L_0x005f
        L_0x005e:
            r12 = r0
        L_0x005f:
            r11.currentComplexId = r12
        L_0x0061:
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            int[] r4 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity.WhenMappings.$EnumSwitchMapping$0
            int r12 = r12.ordinal()
            r12 = r4[r12]
            java.lang.String r4 = "fragmentProfileChooser"
            java.lang.String r5 = "intent"
            java.lang.String r6 = "getIntent()"
            java.lang.String r7 = "is_first_launch_after_registration"
            java.lang.String r8 = "sharedPreferences"
            r9 = 1
            if (r12 == r9) goto L_0x030e
            r10 = 2
            if (r12 == r10) goto L_0x029e
            if (r12 == r3) goto L_0x007f
            goto L_0x0399
        L_0x007f:
            android.content.Intent r12 = r11.getIntent()
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r2 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r2 = r2.getEVENT_KEY()
            java.lang.String r2 = r12.getStringExtra(r2)
            if (r2 == 0) goto L_0x00be
            android.content.Intent r12 = r11.getIntent()
            if (r12 == 0) goto L_0x00b4
            android.content.Intent r12 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x00b4
            android.content.Intent r12 = r11.getIntent()
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r0 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r0 = r0.getEVENT_KEY()
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x00b4
            r12 = 1
            goto L_0x00b5
        L_0x00b4:
            r12 = 0
        L_0x00b5:
            if (r12 == 0) goto L_0x0258
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            r11.makeRouteToAppByEvent(r12)
            goto L_0x0258
        L_0x00be:
            ru.unicorn.ujin.data.realm.profile.Apartment r2 = r11.getCurrentApartment()
            if (r2 == 0) goto L_0x00cf
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r2 = r2.getApartmentRequest()
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = r2.getStatus()
            goto L_0x00d0
        L_0x00cf:
            r2 = r0
        L_0x00d0:
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts r3 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.Consts.INSTANCE
            java.lang.String r3 = r3.getON_UK()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 != 0) goto L_0x0255
            ru.unicorn.ujin.data.realm.profile.Apartment r2 = r11.getCurrentApartment()
            if (r2 == 0) goto L_0x00ed
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r2 = r2.getApartmentRequest()
            if (r2 == 0) goto L_0x00ed
            java.lang.String r2 = r2.getStatus()
            goto L_0x00ee
        L_0x00ed:
            r2 = r0
        L_0x00ee:
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts r3 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.Consts.INSTANCE
            java.lang.String r3 = r3.getREJECTED()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x00fc
            goto L_0x0255
        L_0x00fc:
            r2 = 2131886218(0x7f12008a, float:1.9407009E38)
            java.lang.String r3 = r11.getString(r2)
            android.content.SharedPreferences r3 = r11.getSharedPreferences(r3, r1)
            java.lang.String r6 = "launchFromTerms"
            boolean r3 = r3.getBoolean(r6, r1)
            if (r3 == 0) goto L_0x0141
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = r11.getCurrentApartment()
            if (r3 == 0) goto L_0x0120
            java.lang.Integer r3 = r3.getAcceptingEnabled()
            if (r3 == 0) goto L_0x0120
            int r3 = r3.intValue()
            goto L_0x0121
        L_0x0120:
            r3 = -1
        L_0x0121:
            if (r3 != r9) goto L_0x0141
            java.lang.String r12 = r11.getString(r2)
            android.content.SharedPreferences r12 = r11.getSharedPreferences(r12, r1)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r6, r1)
            r12.apply()
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.Companion
            java.lang.String r12 = r12.getCURRENT_APARTMENT()
            r11.navigateProfile(r12, r1)
            goto L_0x0258
        L_0x0141:
            ru.unicorn.ujin.enums.Flavor r2 = r11.flavor
            boolean r2 = r2.isUkAddingAvailable()
            if (r2 == 0) goto L_0x0156
            android.content.SharedPreferences r2 = r11.sharedPreferences
            if (r2 != 0) goto L_0x0150
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0150:
            boolean r2 = r2.getBoolean(r7, r1)
            if (r2 != 0) goto L_0x015c
        L_0x0156:
            boolean r2 = r11.isRegistrationFinished()
            if (r2 != 0) goto L_0x017d
        L_0x015c:
            android.content.SharedPreferences r12 = r11.sharedPreferences
            if (r12 != 0) goto L_0x0163
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0163:
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r7, r1)
            r12.apply()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment.Companion
            ru.unicorn.ujin.view.fragments.profile.Mode r0 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_LOGIN
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment r12 = r12.newInstance(r0)
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            r11.onNextFragment(r12, r1, r4)
            goto L_0x0258
        L_0x017d:
            ru.unicorn.ujin.data.profile.ProfileViewModel r2 = r11.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r2 = r2.getUser()
            boolean r2 = r2.isCurrentCommerce()
            java.lang.String r3 = "apartmentClick"
            if (r2 != 0) goto L_0x01c9
            ru.unicorn.ujin.data.realm.profile.Apartment r2 = r11.getCurrentApartment()
            if (r2 == 0) goto L_0x0195
            java.lang.Boolean r0 = r2.isBottomNavigationVisible()
        L_0x0195:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r12.getBooleanExtra(r3, r1)
            if (r0 == r9) goto L_0x01c9
            ru.unicorn.ujin.enums.Flavor r0 = r11.flavor
            java.lang.String r0 = r0.getAppName()
            java.lang.String r2 = "morionDigital"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x01c9
            ru.unicorn.ujin.enums.Flavor r0 = r11.flavor
            java.lang.String r0 = r0.getAppName()
            java.lang.String r2 = "pass"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x01c9
            r11.setSmartflatChecked(r1)
            goto L_0x0258
        L_0x01c9:
            java.lang.String r0 = "chat"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x01d4
            r11.setChatsChecked()
        L_0x01d4:
            java.lang.String r0 = "market"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x01df
            r11.setMarketChecked()
        L_0x01df:
            java.lang.String r0 = "selectOwnFlat"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x01ea
            r11.showMyFlatFragment()
        L_0x01ea:
            java.lang.String r0 = p035ru.unicorn.ujin.ReactConst.SERVICE
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0206
            java.lang.String r0 = "kortros"
            java.lang.String r2 = "lakewood"
            if (r0 != r2) goto L_0x01fe
            java.lang.String r0 = p035ru.unicorn.ujin.ReactConst.SERVICE
            r11.showReactSmartFlatFragment(r0)
            goto L_0x0201
        L_0x01fe:
            r11.setServicesChecked()
        L_0x0201:
            java.lang.String r0 = p035ru.unicorn.ujin.ReactConst.SERVICE
            r12.removeExtra(r0)
        L_0x0206:
            java.lang.String r0 = "security"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0222
            java.lang.String r0 = "kortros"
            java.lang.String r2 = "lakewood"
            if (r0 != r2) goto L_0x021a
            java.lang.String r0 = p035ru.unicorn.ujin.ReactConst.SECURITY
            r11.showReactSmartFlatFragment(r0)
            goto L_0x021d
        L_0x021a:
            r11.setSecurityChecked()
        L_0x021d:
            java.lang.String r0 = "security"
            r12.removeExtra(r0)
        L_0x0222:
            java.lang.String r0 = "cabinet"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x022d
            r11.setCabinetChecked()
        L_0x022d:
            java.lang.String r0 = p035ru.unicorn.ujin.ReactConst.SMARTFLAT
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0238
            r11.setSmartflatChecked(r1)
        L_0x0238:
            boolean r0 = r12.getBooleanExtra(r3, r1)
            if (r0 == 0) goto L_0x0258
            r11.isChoosingApartmentVisible = r9
            r12.removeExtra(r3)
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment.Companion
            ru.unicorn.ujin.view.fragments.profile.Mode r0 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_LOGIN
            java.lang.String r2 = "Выберите объект недвижимости"
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r12 = r12.newInstance(r2, r0)
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            java.lang.String r0 = "fragmentApartmentList"
            r11.onNextFragment(r12, r9, r0)
            goto L_0x0258
        L_0x0255:
            r11.showProfile(r0)
        L_0x0258:
            boolean r12 = r11.hasBottomSheet()
            if (r12 == 0) goto L_0x026e
            ru.unicorn.ujin.enums.Flavor$Companion r12 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r12 = r12.current()
            boolean r12 = r12.isBottomHotkeysVisible()
            if (r12 == 0) goto L_0x026e
            r11.initBottomSheet()
            goto L_0x0271
        L_0x026e:
            r11.hideHotKeys()
        L_0x0271:
            r12 = r11
            androidx.fragment.app.FragmentActivity r12 = (androidx.fragment.app.FragmentActivity) r12
            androidx.lifecycle.ViewModelProvider r12 = androidx.lifecycle.ViewModelProviders.m12of((androidx.fragment.app.FragmentActivity) r12)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel.class
            androidx.lifecycle.ViewModel r12 = r12.get(r0)
            java.lang.String r0 = "ViewModelProviders.of(th…pleViewModel::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r12 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel) r12
            androidx.lifecycle.MutableLiveData r12 = r12.getSchemasMutableLiveData()
            r0 = r11
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$onCreate$1 r2 = new ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$onCreate$1
            r2.<init>(r11)
            androidx.lifecycle.Observer r2 = (androidx.lifecycle.Observer) r2
            r12.observe(r0, r2)
            r11.showLinphoneTutorialIfNeeded()
            r11.startLocationServiceChecker()
            goto L_0x0399
        L_0x029e:
            android.content.Intent r12 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r5)
            android.os.Bundle r0 = r12.getExtras()
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r3 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r3 = r3.getEVENT_KEY()
            java.lang.String r12 = r12.getStringExtra(r3)
            if (r12 == 0) goto L_0x02e3
            android.content.Intent r12 = r11.getIntent()
            if (r12 == 0) goto L_0x02da
            android.content.Intent r12 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x02da
            android.content.Intent r12 = r11.getIntent()
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r0 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r0 = r0.getEVENT_KEY()
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x02da
            r12 = 1
            goto L_0x02db
        L_0x02da:
            r12 = 0
        L_0x02db:
            if (r12 == 0) goto L_0x0309
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            r11.makeRouteToAppByEvent(r12)
            goto L_0x0309
        L_0x02e3:
            if (r0 == 0) goto L_0x02f7
            java.lang.String r12 = "apartmentid"
            java.lang.String r12 = r0.getString(r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = org.apache.commons.lang3.StringUtils.isNotEmpty(r12)
            if (r12 == 0) goto L_0x02f7
            r11.showChatsFragment()
            goto L_0x0309
        L_0x02f7:
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.development.DeveloperFragment.Companion
            java.lang.String r0 = r11.currentComplexId
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            ru.unicorn.ujin.view.fragments.development.DeveloperFragment r12 = r12.newInstance(r0)
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            java.lang.String r0 = "fragmentDevelopment"
            r11.onNextFragment(r12, r9, r0)
        L_0x0309:
            r11.hideHotKeys()
            goto L_0x0399
        L_0x030e:
            android.content.Intent r12 = r11.getIntent()
            r0 = 2131363070(0x7f0a04fe, float:1.8345938E38)
            r11.setBottomItemClick(r0)
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r0 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r0 = r0.getEVENT_KEY()
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x0352
            android.content.Intent r12 = r11.getIntent()
            if (r12 == 0) goto L_0x0349
            android.content.Intent r12 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x0349
            android.content.Intent r12 = r11.getIntent()
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r0 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            java.lang.String r0 = r0.getEVENT_KEY()
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x0349
            r12 = 1
            goto L_0x034a
        L_0x0349:
            r12 = 0
        L_0x034a:
            if (r12 == 0) goto L_0x0396
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            r11.makeRouteToAppByEvent(r12)
            goto L_0x0396
        L_0x0352:
            ru.unicorn.ujin.enums.Flavor r12 = r11.flavor
            boolean r12 = r12.isUkAddingAvailable()
            if (r12 == 0) goto L_0x0367
            android.content.SharedPreferences r12 = r11.sharedPreferences
            if (r12 != 0) goto L_0x0361
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0361:
            boolean r12 = r12.getBoolean(r7, r1)
            if (r12 != 0) goto L_0x036d
        L_0x0367:
            boolean r12 = r11.isRegistrationFinished()
            if (r12 != 0) goto L_0x038d
        L_0x036d:
            android.content.SharedPreferences r12 = r11.sharedPreferences
            if (r12 != 0) goto L_0x0374
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0374:
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r7, r1)
            r12.apply()
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment.Companion
            ru.unicorn.ujin.view.fragments.profile.Mode r0 = p035ru.unicorn.ujin.view.fragments.profile.Mode.FROM_LOGIN
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment r12 = r12.newInstance(r0)
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            r11.onNextFragment(r12, r1, r4)
            goto L_0x0396
        L_0x038d:
            ru.unicorn.ujin.enums.Flavor r12 = r11.flavor
            ru.unicorn.ujin.enums.Flavor r0 = p035ru.unicorn.ujin.enums.Flavor.KORTROS
            if (r12 != r0) goto L_0x0396
            r11.showSearchFragment()
        L_0x0396:
            r11.hideHotKeys()
        L_0x0399:
            ru.unicorn.ujin.data.profile.ProfileViewModel r12 = r11.profileViewModel
            r12.loadSplashscreen()
            android.content.Intent r12 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r5)
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x03c3
            java.lang.String r0 = "profile"
            boolean r12 = r12.getBoolean(r0, r1)
            if (r12 != r9) goto L_0x03c3
            android.content.Intent r12 = r11.getIntent()
            r12.removeExtra(r0)
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$Companion r12 = p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.Companion
            java.lang.String r12 = r12.getCURRENT_APARTMENT()
            r11.navigateProfile(r12, r1)
        L_0x03c3:
            android.content.SharedPreferences r12 = r11.sharedPreferences
            if (r12 != 0) goto L_0x03ca
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x03ca:
            java.lang.String r0 = "firstTime"
            boolean r12 = r12.getBoolean(r0, r9)
            if (r12 == 0) goto L_0x0418
            android.content.res.Resources r12 = r11.getResources()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r2 = r11.appStage
            int r2 = r2.getTutorialId()
            int[] r12 = r12.getIntArray(r2)
            java.lang.String r2 = "resources.getIntArray(appStage.tutorialId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            int r12 = r12.length
            if (r12 != 0) goto L_0x03ea
            r12 = 1
            goto L_0x03eb
        L_0x03ea:
            r12 = 0
        L_0x03eb:
            r12 = r12 ^ r9
            if (r12 == 0) goto L_0x0418
            android.content.Intent r12 = new android.content.Intent
            r2 = r11
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialActivity> r3 = p035ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialActivity.class
            r12.<init>(r2, r3)
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r2 = r11.appStage
            int r2 = r2.getTutorialId()
            java.lang.String r3 = "arg_array_id"
            r12.putExtra(r3, r2)
            r11.startActivity(r12)
            android.content.SharedPreferences r12 = r11.sharedPreferences
            if (r12 != 0) goto L_0x040d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x040d:
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r0, r1)
            r12.apply()
        L_0x0418:
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r12 < r0) goto L_0x044c
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            if (r12 != r0) goto L_0x044c
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r12 = r11.profileLocalRepository
            io.realm.RealmList r12 = r12.getCommerceList()
            if (r12 == 0) goto L_0x044c
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r9
            if (r12 == 0) goto L_0x044c
            ru.unicorn.ujin.data.profile.ProfileViewModel r12 = r11.profileViewModel
            r12.loadMyPass()
            ru.unicorn.ujin.data.profile.ProfileViewModel r12 = r11.profileViewModel
            androidx.lifecycle.MutableLiveData r12 = r12.getMyPass()
            androidx.lifecycle.LiveData r12 = (androidx.lifecycle.LiveData) r12
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$onCreate$$inlined$let$lambda$1 r0 = new ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$onCreate$$inlined$let$lambda$1
            r0.<init>(r11)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            p035ru.unicorn.ujin.view.extensions.ExtensionKt.observe((androidx.appcompat.app.AppCompatActivity) r11, r12, r0)
        L_0x044c:
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r12 = r11.appStage
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r12 == r0) goto L_0x045e
            ru.unicorn.ujin.data.profile.ProfileViewModel r12 = r11.profileViewModel
            boolean r12 = r12.isUserLoggedIn()
            if (r12 == 0) goto L_0x0461
            boolean r12 = r11.isChoosingApartmentVisible
            if (r12 != 0) goto L_0x0461
        L_0x045e:
            r11.checkVersionUpdates()
        L_0x0461:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity.onCreate(android.os.Bundle):void");
    }

    private final void navigateProfile(String str, boolean z) {
        if (Intrinsics.areEqual((Object) this.flavor.getAppName(), (Object) Flavor.PAN.getAppName())) {
            Apartment currentApartment = getCurrentApartment();
            Intrinsics.checkNotNullExpressionValue(currentApartment, "currentApartment");
            Boolean isBottomNavigationVisible = currentApartment.isBottomNavigationVisible();
            Intrinsics.checkNotNullExpressionValue(isBottomNavigationVisible, "currentApartment.isBottomNavigationVisible");
            if (isBottomNavigationVisible.booleanValue()) {
                BottomNavigationView bottomNavigationView = this.bottomNavigationView;
                Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottomNavigationView");
                bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new StageActivity$navigateProfile$1(this, str));
                return;
            }
            return;
        }
        showProfile(str, z);
    }

    private final void makeRouteToAppByEvent(AppStage appStage2) {
        String stringExtra = getIntent().getStringExtra(Enums.PushClickEventType.Companion.getEVENT_KEY());
        if (stringExtra == null) {
            stringExtra = Enums.PushClickEventType.DEFAULT.name();
        }
        String str = stringExtra;
        Intrinsics.checkNotNullExpressionValue(str, "intent.getStringExtra(En…ickEventType.DEFAULT.name");
        Enums.PushClickEventType eventByValue = Enums.PushClickEventType.Companion.getEventByValue(str);
        String eventTypeID = eventByValue.getEventTypeID();
        String secondEventTypeID = eventByValue.getSecondEventTypeID();
        String stringExtra2 = getIntent().getStringExtra(eventTypeID);
        String str2 = stringExtra2 != null ? stringExtra2 : "";
        String stringExtra3 = getIntent().getStringExtra(secondEventTypeID);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        getIntent().removeExtra(Enums.PushClickEventType.Companion.getEVENT_KEY());
        makeRouteToApp(str, str2, stringExtra3, appStage2, true, getIntent());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c2, code lost:
        r3 = r3.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void makeRouteToApp(java.lang.String r14, java.lang.String r15, java.lang.String r16, p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r17, boolean r18, android.content.Intent r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            java.lang.String r6 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r6)
            java.lang.String r6 = "sectionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r6)
            java.lang.String r6 = "secondSectionID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "appStage"
            r7 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r6 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            ru.unicorn.ujin.data.Enums$PushClickEventType r1 = r6.getEventByValue(r14)
            int[] r6 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity.WhenMappings.$EnumSwitchMapping$2
            int r1 = r1.ordinal()
            r1 = r6[r1]
            java.lang.String r6 = "fragmentMarketPlace"
            r8 = 2131363066(0x7f0a04fa, float:1.834593E38)
            r9 = 2131363072(0x7f0a0500, float:1.8345942E38)
            r10 = 1
            java.lang.String r11 = ""
            r12 = 0
            switch(r1) {
                case 1: goto L_0x01df;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01d9;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01b3;
                case 6: goto L_0x019f;
                case 7: goto L_0x017b;
                case 8: goto L_0x0161;
                case 9: goto L_0x0157;
                case 10: goto L_0x0143;
                case 11: goto L_0x012b;
                case 12: goto L_0x0118;
                case 13: goto L_0x0102;
                case 14: goto L_0x0092;
                case 15: goto L_0x0074;
                case 16: goto L_0x0054;
                case 17: goto L_0x0049;
                case 18: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0209
        L_0x003e:
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$Companion r1 = p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.Companion
            java.lang.String r1 = r1.getAPARTMENT_LIST()
            r13.navigateProfile(r1, r10)
            goto L_0x0209
        L_0x0049:
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$Companion r1 = p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.Companion
            java.lang.String r1 = r1.getCURRENT_APARTMENT()
            r13.navigateProfile(r1, r10)
            goto L_0x0209
        L_0x0054:
            r1 = r0
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.m12of((androidx.fragment.app.FragmentActivity) r1)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel.class
            androidx.lifecycle.ViewModel r1 = r1.get(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel) r1
            r1.getSchema(r12)
            r1 = 2
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment.start(r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = "fragmentSecurity"
            r13.showFragment(r1, r2, r10)
            goto L_0x0209
        L_0x0074:
            ru.unicorn.ujin.data.profile.ProfileViewModel r1 = r0.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r1 = r1.getUser()
            boolean r1 = r1.isCurrentCommerce()
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "security"
            goto L_0x0089
        L_0x0083:
            ru.unicorn.ujin.enums.Flavor r1 = r0.flavor
            java.lang.String r1 = r1.getStage3DefaultScreen()
        L_0x0089:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r13.startStageThree(r1, r2)
            goto L_0x0209
        L_0x0092:
            if (r4 == 0) goto L_0x0097
            r13.setBottomItemClick(r9)
        L_0x0097:
            ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment r1 = new ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment
            r1.<init>()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r3 = "fragmentTickets"
            r13.onNextFragment(r1, r12, r3)
            if (r5 == 0) goto L_0x00ae
            java.lang.String r1 = "account_id"
            java.lang.String r1 = r5.getStringExtra(r1)
            if (r1 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r1 = "0"
        L_0x00b0:
            java.lang.String r3 = "pushIntent?.getStringExtra(\"account_id\") ?: \"0\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r3 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r3 = r3.getInstance()
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = r3.getCurrentApartment()
            r4 = 0
            if (r3 == 0) goto L_0x00d1
            java.lang.Integer r3 = r3.getId()
            if (r3 == 0) goto L_0x00d1
            int r3 = r3.intValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x00d2
        L_0x00d1:
            r3 = r4
        L_0x00d2:
            if (r5 == 0) goto L_0x00da
            java.lang.String r4 = "apartment_id"
            java.lang.String r4 = r5.getStringExtra(r4)
        L_0x00da:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0209
            int r1 = java.lang.Integer.parseInt(r1)
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r14 = r15
            r15 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r3
            ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketDetailFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketDetailFragment.start(r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = "fragmentTicketInfo"
            r13.onNextFragment(r1, r12, r2)
            goto L_0x0209
        L_0x0102:
            if (r4 == 0) goto L_0x010a
            r1 = 2131363071(0x7f0a04ff, float:1.834594E38)
            r13.setBottomItemClick(r1)
        L_0x010a:
            ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment r1 = new ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment
            r1.<init>()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = "fragmentMyPass"
            r13.onNextFragment(r1, r12, r2)
            goto L_0x0209
        L_0x0118:
            if (r4 == 0) goto L_0x0120
            r1 = 2131363060(0x7f0a04f4, float:1.8345918E38)
            r13.setBottomItemClick(r1)
        L_0x0120:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaFragment.start(r10)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            goto L_0x0209
        L_0x012b:
            if (r4 == 0) goto L_0x0130
            r13.setBottomItemClick(r8)
        L_0x0130:
            ru.unicorn.ujin.market.offer.OfferFragment$Companion r1 = p035ru.unicorn.ujin.market.offer.OfferFragment.Companion
            ru.unicorn.ujin.metrics.MetricsKeys r3 = p035ru.unicorn.ujin.metrics.MetricsKeys.productPush
            java.lang.String r3 = r3.getValue()
            ru.unicorn.ujin.market.offer.OfferFragment r1 = r1.newInstance(r15, r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r6)
            goto L_0x0209
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r13.setBottomItemClick(r8)
        L_0x0148:
            ru.unicorn.ujin.market.category.CategoryFragment$Companion r1 = p035ru.unicorn.ujin.market.category.CategoryFragment.Companion
            java.lang.String r3 = " "
            ru.unicorn.ujin.market.category.CategoryFragment r1 = r1.newInstance(r15, r11, r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r6)
            goto L_0x0209
        L_0x0157:
            if (r4 == 0) goto L_0x015c
            r13.setBottomItemClick(r8)
        L_0x015c:
            r13.showMarketFragment()
            goto L_0x0209
        L_0x0161:
            if (r4 == 0) goto L_0x0166
            r13.setBottomItemClick(r8)
        L_0x0166:
            ru.unicorn.ujin.market.offer.OfferListFragment$Companion r1 = p035ru.unicorn.ujin.market.offer.OfferListFragment.Companion
            ru.unicorn.ujin.metrics.MetricsKeys r3 = p035ru.unicorn.ujin.metrics.MetricsKeys.companyProductsPush
            java.lang.String r3 = r3.getValue()
            java.lang.String r4 = "company"
            ru.unicorn.ujin.market.offer.OfferListFragment r1 = r1.newInstance(r15, r4, r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r6)
            goto L_0x0209
        L_0x017b:
            if (r4 == 0) goto L_0x0183
            r1 = 2131363062(0x7f0a04f6, float:1.8345922E38)
            r13.setBottomItemClick(r1)
        L_0x0183:
            ru.unicorn.ujin.view.fragments.chats.ChatFragment$Companion r1 = p035ru.unicorn.ujin.view.fragments.chats.ChatFragment.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r3 = r0.profileLocalRepository
            ru.unicorn.ujin.data.realm.profile.User r3 = r3.getUser()
            long r5 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            ru.unicorn.ujin.view.fragments.chats.ChatFragment r1 = r1.newInstance(r15, r3, r10)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = "fragmentChat"
            r13.onNextFragment(r1, r4, r2)
            goto L_0x0209
        L_0x019f:
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment.start()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment r1 = new ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment
            r1.<init>()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            goto L_0x0209
        L_0x01b3:
            if (r4 == 0) goto L_0x01b8
            r13.setBottomItemClick(r9)
        L_0x01b8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment.start(r15, r3, r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            goto L_0x0209
        L_0x01c6:
            if (r4 == 0) goto L_0x01cb
            r13.setBottomItemClick(r9)
        L_0x01cb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketFragment r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment.start(r15, r11, r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            goto L_0x0209
        L_0x01d9:
            java.lang.String r1 = p035ru.unicorn.ujin.ReactConst.SMARTFLAT
            r13.showReactSmartFlatFragment(r1)
            goto L_0x0209
        L_0x01df:
            int[] r1 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity.WhenMappings.$EnumSwitchMapping$1
            int r3 = r17.ordinal()
            r1 = r1[r3]
            if (r1 == r10) goto L_0x01fb
            if (r4 == 0) goto L_0x01f1
            r1 = 2131363069(0x7f0a04fd, float:1.8345936E38)
            r13.setBottomItemClick(r1)
        L_0x01f1:
            ru.unicorn.ujin.view.fragments.news.NewspieceFragment r1 = p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment.newInstance(r15, r4)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
            goto L_0x0209
        L_0x01fb:
            if (r4 == 0) goto L_0x0200
            r13.setBottomItemClick(r9)
        L_0x0200:
            ru.unicorn.ujin.view.fragments.news.NewspieceFragment r1 = p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment.newInstance(r15, r4)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r13.onNextFragment(r1, r12, r11)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity.makeRouteToApp(java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage, boolean, android.content.Intent):void");
    }

    private final void showLinphoneTutorialIfNeeded() {
        boolean z = getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).getBoolean(CallMaker.CALL_STARTED, false) && !getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).getBoolean(CallMaker.VIEW_SHOWN, false);
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "Build.MANUFACTURER");
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            boolean equals = lowerCase.equals("xiaomi");
            if (z && equals) {
                getSharedPreferences(SharedHelper.APP_PREFERENCES, 0).edit().putBoolean(CallMaker.CALL_STARTED, false).apply();
                showAlert();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final void showAlert() {
        CallAttentionDialog callAttentionDialog = new CallAttentionDialog();
        callAttentionDialog.show(getSupportFragmentManager(), "");
        callAttentionDialog.setListener(new StageActivity$showAlert$$inlined$apply$lambda$1(callAttentionDialog, this));
    }

    private final void selectDummy() {
        View findViewById = this.bottomNavigationView.findViewById(R.id.navigation_market);
        if (findViewById != null) {
            findViewById.performClick();
        }
    }

    /* access modifiers changed from: private */
    public final void onGetSchema(Schemas schemas) {
        RealmList<Schema> hotkeys = schemas.getHotkeys();
        boolean z = false;
        if (hotkeys != null && !hotkeys.isEmpty()) {
            z = true;
        }
        this.hasHotkeys = z;
        if (this.appStage != AppStage.SMARTFLAT || !this.hasHotkeys || !Flavor.Companion.current().isBottomHotkeysVisible() || this.isBottomSheetInitialized) {
            hideHotKeys();
        } else {
            initBottomSheet();
            this.isBottomSheetInitialized = true;
        }
        onBackStackChanged();
    }

    private final void initBottomSheet() {
        LinearLayout linearLayout = this.llBottomSheet;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llBottomSheet");
        linearLayout.setVisibility(0);
        this.mainFrame.setPadding(0, 0, 0, AppUtils.dpToPx(getApplicationContext(), 35));
        getSupportFragmentManager().addOnBackStackChangedListener(this);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.bottom_frame, SmartNavFragment.start(6));
        beginTransaction.setTransition(4097);
        beginTransaction.commit();
        this.bottomSheetBehavior = BottomSheetBehavior.from(this.llBottomSheet);
        this.bottomSheetBehavior.addBottomSheetCallback(new StageActivity$initBottomSheet$1(this));
    }

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return this.appStage.getBottomNavigationId();
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
        showChatsFragment(5);
    }

    public final void showChatsFragment(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$3[this.appStage.ordinal()];
        if (i2 == 1) {
            ViewModel viewModel = ViewModelProviders.m12of((FragmentActivity) this).get(ChatsViewModel.class);
            Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…atsViewModel::class.java)");
            ChatsViewModel chatsViewModel = (ChatsViewModel) viewModel;
            chatsViewModel.getChatListMutableLiveData().observe(this, new StageActivity$showChatsFragment$1(this));
            chatsViewModel.requestChatList(0, 200, Integer.valueOf(i));
        } else if (i2 == 2 || i2 == 3) {
            onNextFragment(ChatListFragment.Companion.newInstance(), true, BaseActivity.FRAGMENT_CHATS);
        }
    }

    public boolean hasBottomSheet() {
        if (this.appStage == AppStage.SMARTFLAT && this.hasHotkeys && Flavor.Companion.current().isBottomHotkeysVisible()) {
            Apartment currentApartment = getCurrentApartment();
            if (Intrinsics.areEqual((Object) currentApartment != null ? currentApartment.isBottomNavigationVisible() : null, (Object) true)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void handleChatEvent(ChatListEvent chatListEvent) {
        Object obj;
        if (chatListEvent.getSuccess()) {
            Iterator it = chatListEvent.getChatList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Chat) obj).getServiceType(), (Object) String.valueOf(5))) {
                    break;
                }
            }
            Chat chat = (Chat) obj;
            if (chat != null) {
                showChatFragment(chat, chatListEvent.getUserId(), Intrinsics.areEqual((Object) "kortros", (Object) Flavors.PAN));
            } else {
                showMessage((int) R.string.chats_on_reconstruction);
            }
        } else {
            showMessage(chatListEvent.getMessage());
        }
    }

    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.reactPermissionListener = permissionListener;
        if (strArr != null) {
            requestPermissions(strArr, i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        PermissionListener permissionListener = this.reactPermissionListener;
        if (permissionListener != null) {
            permissionListener.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ((intent != null ? intent.getStringExtra(Enums.PushClickEventType.Companion.getEVENT_KEY()) : null) != null) {
            makeRouteToAppByEvent(AppStage.SMARTFLAT);
        }
    }

    private final void initAppShortCut(List<MyPassIn> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class);
            Context context = this;
            ShortcutInfo.Builder icon = new ShortcutInfo.Builder(context, "superID").setShortLabel(getString(R.string.label_short_my_pass_shortcut)).setIcon(Icon.createWithResource(context, R.drawable.ic_svg_qr));
            Intent intent = new Intent(context, TermsActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(Enums.PushClickEventType.Companion.getEVENT_KEY(), Enums.PushClickEventType.PASS_SHOW_MY.getEventValue());
            Unit unit = Unit.INSTANCE;
            ShortcutInfo build = icon.setIntent(intent).build();
            Intrinsics.checkNotNullExpressionValue(build, "ShortcutInfo.Builder(thi…                 .build()");
            if (list == null) {
                return;
            }
            if (!(!list.isEmpty())) {
                shortcutManager.removeAllDynamicShortcuts();
            } else if (shortcutManager != null) {
                shortcutManager.addDynamicShortcuts(Collections.singletonList(build));
            }
        }
    }

    private final void startLocationServiceChecker() {
        SharedPreferences.Editor putBoolean;
        WorkRequest build = ((PeriodicWorkRequest.Builder) new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ServiceRunningChecker.class, 30, TimeUnit.MINUTES).addTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO)).build();
        Intrinsics.checkNotNullExpressionValue(build, "PeriodicWorkRequest\n    …\n                .build()");
        PeriodicWorkRequest periodicWorkRequest = (PeriodicWorkRequest) build;
        SharedPreferences sharedPreferences2 = getApplicationContext().getSharedPreferences(getApplicationContext().getString(R.string.app_name), 0);
        if (sharedPreferences2 == null || !sharedPreferences2.getBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, false)) {
            Intrinsics.checkNotNullExpressionValue(WorkManager.getInstance().cancelAllWorkByTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO), "WorkManager.getInstance(…NABLE_START_SERVICE_AUTO)");
        } else if (!Flavor.Companion.current().getHasBeaconsSupport()) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            if (!(edit == null || (putBoolean = edit.putBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, false)) == null)) {
                putBoolean.apply();
            }
            WorkManager.getInstance().cancelAllWorkByTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO);
            ServiceHelper.stopLocationService(this);
        } else {
            Intrinsics.checkNotNullExpressionValue(WorkManager.getInstance().enqueue((WorkRequest) periodicWorkRequest), "WorkManager\n            …        .enqueue(request)");
        }
    }

    private final void checkVersionUpdates() {
        Task<AppUpdateInfo> appUpdateInfo;
        Calendar instance = Calendar.getInstance();
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        long j = sharedPreferences2.getLong(CHECKING_VERSION_TIME, 0);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0) {
            Intrinsics.checkNotNullExpressionValue(instance, "lastCalendar");
            instance.setTimeInMillis(j);
        }
        if (i == 0 || DateUtils.isPastDate(instance)) {
            this.appUpdateManager = AppUpdateManagerFactory.create(getApplicationContext());
            AppUpdateManager appUpdateManager2 = this.appUpdateManager;
            if (appUpdateManager2 != null && (appUpdateInfo = appUpdateManager2.getAppUpdateInfo()) != null) {
                appUpdateInfo.addOnSuccessListener(new StageActivity$checkVersionUpdates$1(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showUpdatingAvailableDialog() {
        new AlertDialog.Builder(this).setTitle((CharSequence) "Доступно обновление приложения").setMessage((CharSequence) "Обновите приложение, чтобы пользоваться всеми доступными функциями").setPositiveButton((CharSequence) "Перейти в Play Market", (DialogInterface.OnClickListener) new StageActivity$showUpdatingAvailableDialog$1(this)).setNegativeButton((CharSequence) "Отмена", (DialogInterface.OnClickListener) StageActivity$showUpdatingAvailableDialog$2.INSTANCE).show();
    }
}
