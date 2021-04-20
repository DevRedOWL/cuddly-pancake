package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.SmsConfirmationFragment;
import p035ru.unicorn.ujin.view.fragments.oss.OssViewModel;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssBaseFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "ossViewModel", "Lru/unicorn/ujin/view/fragments/oss/OssViewModel;", "getOssViewModel", "()Lru/unicorn/ujin/view/fragments/oss/OssViewModel;", "ossViewModel$delegate", "Lkotlin/Lazy;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "metricsScreenName", "showSmsConfirmation", "", "oss", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssBaseFragment */
/* compiled from: OssBaseFragment.kt */
public class OssBaseFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private final Lazy ossViewModel$delegate = LazyKt.lazy(new OssBaseFragment$ossViewModel$2(this));
    public String title;

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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final OssViewModel getOssViewModel() {
        return (OssViewModel) this.ossViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Экран голосований";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        String str = this.title;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        baseActivity.setTextTitle(str);
    }

    public final String getTitle() {
        String str = this.title;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        return str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void showSmsConfirmation(Oss oss) {
        String str;
        String str2;
        SmsConfirmationFragment.Companion companion = SmsConfirmationFragment.Companion;
        String str3 = this.title;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        if (oss == null || (str = oss.getTitle()) == null) {
            str = "";
        }
        Function0 ossBaseFragment$showSmsConfirmation$1 = new OssBaseFragment$showSmsConfirmation$1(this, oss);
        Function1 ossBaseFragment$showSmsConfirmation$2 = new OssBaseFragment$showSmsConfirmation$2(this, oss);
        SingleLiveEvent<UpdateEvent> ossSmsSentLiveData = getOssViewModel().getOssSmsSentLiveData();
        SingleLiveEvent<UpdateEvent> ossConfirmationSentLiveData = getOssViewModel().getOssConfirmationSentLiveData();
        SingleLiveEvent singleLiveEvent = getOssViewModel().showLoader;
        Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "ossViewModel.showLoader");
        MutableLiveData mutableLiveData = singleLiveEvent;
        String string = getString(R.string.oss_sms_confirmation_success_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.oss_s…nfirmation_success_title)");
        StringBuilder sb = new StringBuilder();
        sb.append("Благодарим вас за участие в принятии важных  решений!");
        sb.append("\n\n");
        if (oss != null) {
            str2 = oss.getTitle();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(10);
        sb.append("будет перенесено в архив автоматически после окончания срока голосования");
        nextFragment(companion.newInstance(str3, str, ossBaseFragment$showSmsConfirmation$1, ossBaseFragment$showSmsConfirmation$2, ossSmsSentLiveData, ossConfirmationSentLiveData, mutableLiveData, string, sb.toString()), false, BaseActivity.FRAGMENT_OSS_SMS);
    }
}
