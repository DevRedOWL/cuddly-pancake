package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "passViewModel", "Lru/unicorn/ujin/view/fragments/anotherPass/AnotherPassViewModel;", "getPassViewModel", "()Lru/unicorn/ujin/view/fragments/anotherPass/AnotherPassViewModel;", "passViewModel$delegate", "Lkotlin/Lazy;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.BaseAnotherPassFragment */
/* compiled from: BaseAnotherPassFragment.kt */
public abstract class BaseAnotherPassFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String FRAGMENT_ANOTHER_PASS_CONTACT_LIST = "fragmentAnotherPassContactList";
    public static final String FRAGMENT_ANOTHER_PASS_FIFTH = "fragmentAnotherPassFifth";
    public static final String FRAGMENT_ANOTHER_PASS_FIRST = "fragmentAnotherPassFirst";
    public static final String FRAGMENT_ANOTHER_PASS_FOURTH = "fragmentAnotherPassFourth";
    public static final String FRAGMENT_ANOTHER_PASS_NEW = "fragmentAnotherPassNew";
    public static final String FRAGMENT_ANOTHER_PASS_SECOND = "fragmentAnotherPassSecond";
    public static final String FRAGMENT_ANOTHER_PASS_THIRD = "fragmentAnotherPassThird";
    private HashMap _$_findViewCache;
    private final Lazy passViewModel$delegate = LazyKt.lazy(new BaseAnotherPassFragment$passViewModel$2(this));

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
    public final AnotherPassViewModel getPassViewModel() {
        return (AnotherPassViewModel) this.passViewModel$delegate.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment$Companion;", "", "()V", "FRAGMENT_ANOTHER_PASS_CONTACT_LIST", "", "FRAGMENT_ANOTHER_PASS_FIFTH", "FRAGMENT_ANOTHER_PASS_FIRST", "FRAGMENT_ANOTHER_PASS_FOURTH", "FRAGMENT_ANOTHER_PASS_NEW", "FRAGMENT_ANOTHER_PASS_SECOND", "FRAGMENT_ANOTHER_PASS_THIRD", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.BaseAnotherPassFragment$Companion */
    /* compiled from: BaseAnotherPassFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
