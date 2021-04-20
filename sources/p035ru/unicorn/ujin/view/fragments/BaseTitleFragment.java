package p035ru.unicorn.ujin.view.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H&J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "profileViewModel$delegate", "Lkotlin/Lazy;", "simpleViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "getSimpleViewModel", "()Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "simpleViewModel$delegate", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getLayoutRes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showToolbar", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.BaseTitleFragment */
/* compiled from: BaseTitleFragment.kt */
public abstract class BaseTitleFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private final Lazy profileViewModel$delegate = LazyKt.lazy(new BaseTitleFragment$profileViewModel$2(this));
    private final Lazy simpleViewModel$delegate = LazyKt.lazy(new BaseTitleFragment$simpleViewModel$2(this));
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

    public abstract int getLayoutRes();

    public final ProfileViewModel getProfileViewModel() {
        return (ProfileViewModel) this.profileViewModel$delegate.getValue();
    }

    public final SimpleViewModel getSimpleViewModel() {
        return (SimpleViewModel) this.simpleViewModel$delegate.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        String str = this.title;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        baseActivity.setTextTitle(str);
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(getLayoutRes(), viewGroup, false);
    }
}
