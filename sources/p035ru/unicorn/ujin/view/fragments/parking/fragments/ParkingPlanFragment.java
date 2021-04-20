package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.customViews.TouchImageView;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingPlanFragment;", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingBaseFragment;", "()V", "zone", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingPlanFragment */
/* compiled from: ParkingPlanFragment.kt */
public final class ParkingPlanFragment extends ParkingBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Zone zone;

    @JvmStatic
    public static final ParkingPlanFragment newInstance(Zone zone2) {
        return Companion.newInstance(zone2);
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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Экран плана парковочного места";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Zone access$getZone$p(ParkingPlanFragment parkingPlanFragment) {
        Zone zone2 = parkingPlanFragment.zone;
        if (zone2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zone");
        }
        return zone2;
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingSlotInfoTitle));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_parking_plan, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Zone zone2 = this.zone;
        if (zone2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zone");
        }
        FileData plane = zone2.getPlane();
        if (plane != null) {
            Glide.with((View) (TouchImageView) _$_findCachedViewById(C5619R.C5622id.ivPlan)).load(plane.getUrl()).into((ImageView) (TouchImageView) _$_findCachedViewById(C5619R.C5622id.ivPlan));
        }
        Zone zone3 = this.zone;
        if (zone3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zone");
        }
        FileData schema = zone3.getSchema();
        if (schema != null) {
            Glide.with((View) (ImageView) _$_findCachedViewById(C5619R.C5622id.ivMiniPlan)).load(schema.getUrl()).into((ImageView) _$_findCachedViewById(C5619R.C5622id.ivMiniPlan));
            String url = schema.getUrl();
            CharSequence charSequence = url;
            if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
                ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivMiniPlan)).setOnClickListener(new ParkingPlanFragment$onViewCreated$$inlined$let$lambda$1(url, this));
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingPlanFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/parking/fragments/ParkingPlanFragment;", "zone", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingPlanFragment$Companion */
    /* compiled from: ParkingPlanFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ParkingPlanFragment newInstance(Zone zone) {
            Intrinsics.checkNotNullParameter(zone, "zone");
            ParkingPlanFragment parkingPlanFragment = new ParkingPlanFragment();
            parkingPlanFragment.zone = zone;
            return parkingPlanFragment;
        }
    }
}
