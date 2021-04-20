package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.app.Dialog;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/RateTicketDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "evaluateFinishedListener", "Lkotlin/Function0;", "", "helpDeskViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "getHelpDeskViewModel", "()Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "helpDeskViewModel$delegate", "Lkotlin/Lazy;", "ticketId", "", "handleEvaluateTicket", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/CreateTicket;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog */
/* compiled from: RateTicketDialog.kt */
public final class RateTicketDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Function0<Unit> evaluateFinishedListener;
    private final Lazy helpDeskViewModel$delegate = LazyKt.lazy(new RateTicketDialog$helpDeskViewModel$2(this));
    /* access modifiers changed from: private */
    public String ticketId;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final HelpDeskViewModel getHelpDeskViewModel() {
        return (HelpDeskViewModel) this.helpDeskViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final RateTicketDialog newInstance(String str, Function0<Unit> function0) {
        return Companion.newInstance(str, function0);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Function0 access$getEvaluateFinishedListener$p(RateTicketDialog rateTicketDialog) {
        Function0<Unit> function0 = rateTicketDialog.evaluateFinishedListener;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("evaluateFinishedListener");
        }
        return function0;
    }

    public static final /* synthetic */ String access$getTicketId$p(RateTicketDialog rateTicketDialog) {
        String str = rateTicketDialog.ticketId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketId");
        }
        return str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/RateTicketDialog$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/RateTicketDialog;", "ticketId", "", "evaluateFinishedListener", "Lkotlin/Function0;", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog$Companion */
    /* compiled from: RateTicketDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RateTicketDialog newInstance(String str, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "ticketId");
            Intrinsics.checkNotNullParameter(function0, "evaluateFinishedListener");
            RateTicketDialog rateTicketDialog = new RateTicketDialog();
            rateTicketDialog.ticketId = str;
            rateTicketDialog.evaluateFinishedListener = function0;
            return rateTicketDialog;
        }
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_ticket_rating, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RatingBar ratingBar = (RatingBar) _$_findCachedViewById(C5619R.C5622id.ratingBar);
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        Drawable progressDrawable = ratingBar.getProgressDrawable();
        if (progressDrawable != null) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getResources().getColor(R.color.ratingBarColor), PorterDuff.Mode.SRC_ATOP);
            Drawable drawable = layerDrawable.getDrawable(2);
            Intrinsics.checkNotNullExpressionValue(drawable, "starsLayer.getDrawable(2)");
            ColorFilter colorFilter = porterDuffColorFilter;
            drawable.setColorFilter(colorFilter);
            Drawable drawable2 = layerDrawable.getDrawable(1);
            Intrinsics.checkNotNullExpressionValue(drawable2, "starsLayer.getDrawable(1)");
            drawable2.setColorFilter(colorFilter);
            Drawable drawable3 = layerDrawable.getDrawable(0);
            Intrinsics.checkNotNullExpressionValue(drawable3, "starsLayer.getDrawable(0)");
            drawable3.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.ratingBarColorDark), PorterDuff.Mode.SRC_IN));
            RatingBar ratingBar2 = (RatingBar) _$_findCachedViewById(C5619R.C5622id.ratingBar);
            Intrinsics.checkNotNullExpressionValue(ratingBar2, "ratingBar");
            ratingBar2.setOnRatingBarChangeListener(new RateTicketDialog$onViewCreated$1(this));
            HelpDeskViewModel helpDeskViewModel = getHelpDeskViewModel();
            Intrinsics.checkNotNullExpressionValue(helpDeskViewModel, "helpDeskViewModel");
            helpDeskViewModel.getEvaluateTicketLiveData().observe(getViewLifecycleOwner(), new RateTicketDialog$onViewCreated$2(this));
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnEvaluateTicket)).setOnClickListener(new RateTicketDialog$onViewCreated$3(this));
            ((TextView) _$_findCachedViewById(C5619R.C5622id.tvCancel)).setOnClickListener(new RateTicketDialog$onViewCreated$4(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    /* access modifiers changed from: private */
    public final void handleEvaluateTicket(Resource<CreateTicket> resource) {
        Resource.Status status;
        if (resource != null && resource.getStatus() != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                Toast.makeText(getContext(), getResources().getString(R.string.label_thanks), 1).show();
                Function0<Unit> function0 = this.evaluateFinishedListener;
                if (function0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("evaluateFinishedListener");
                }
                function0.invoke();
                dismiss();
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(8);
                DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnEvaluateTicket);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnEvaluateTicket");
                dynamicBackgroundButton.setEnabled(true);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }
}
