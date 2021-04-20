package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "parkingViewModel", "Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "getParkingViewModel", "()Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "parkingViewModel$delegate", "Lkotlin/Lazy;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "metricsScreenName", "returnToParkingList", "", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingBaseFragment */
/* compiled from: ParkingBaseFragment.kt */
public class ParkingBaseFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private final Lazy parkingViewModel$delegate = LazyKt.lazy(new ParkingBaseFragment$parkingViewModel$2(this));
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
    public final ParkingViewModel getParkingViewModel() {
        return (ParkingViewModel) this.parkingViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Экран аренды парковок";
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

    public final void returnToParkingList() {
        removeFragmentFromBackStack(BaseActivity.FRAGMENT_PARKING_NEW_RENT);
        removeFragmentFromBackStack(BaseActivity.FRAGMENT_PARKING_NEW_RENT_SLOTS);
        removeFragmentFromBackStack(BaseActivity.FRAGMENT_PARKING_RENT_SLOT);
        removeFragmentFromBackStack(BaseActivity.FRAGMENT_PARKING_NEW_RENT_GUEST);
        nextFragment(ParkingListFragment.Companion.newInstance("Парковка"), false, BaseActivity.FRAGMENT_PARKING_RENT);
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
}
