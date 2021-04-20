package p035ru.unicorn.ujin.market.comment;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.viewModel.events.market.CreateCommentEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0014J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0014J\f\u0010\u0018\u001a\u00020\t*\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/NewCommentFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "editTextWatcher", "Landroid/text/TextWatcher;", "threadId", "", "threadType", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CreateCommentEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "markRequired", "Lcom/google/android/material/textfield/TextInputLayout;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.NewCommentFragment */
/* compiled from: NewCommentFragment.kt */
public final class NewCommentFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String THREAD_ID = "thread_id";
    public static final String THREAD_TYPE = "thread_type";
    private HashMap _$_findViewCache;
    private TextWatcher editTextWatcher = new NewCommentFragment$editTextWatcher$1(this);
    /* access modifiers changed from: private */
    public String threadId;
    /* access modifiers changed from: private */
    public String threadType;

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
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getResources().getString(R.string.new_comment));
        getBaseActivity().setToolbarRight(initCloseButtonList());
        getBaseActivity().hideBottomNavigation();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        String str = null;
        this.threadId = arguments != null ? arguments.getString(THREAD_ID) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString(THREAD_TYPE);
        }
        this.threadType = str;
        View inflate = layoutInflater.inflate(R.layout.fragment_new_comment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…omment, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilName);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilName");
        markRequired(textInputLayout);
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
            ratingBar2.setOnRatingBarChangeListener(new NewCommentFragment$onViewCreated$1(this));
            ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).addTextChangedListener(this.editTextWatcher);
            ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnSendComment)).setOnClickListener(new NewCommentFragment$onViewCreated$2(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    private final void markRequired(TextInputLayout textInputLayout) {
        StringBuilder sb = new StringBuilder();
        sb.append(textInputLayout.getHint());
        sb.append(Html.fromHtml(textInputLayout.getResources().getString(R.string.required_asterisk)));
        textInputLayout.setHint((CharSequence) sb.toString());
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CreateCommentEvent createCommentEvent) {
        if (createCommentEvent.getSuccess()) {
            showMessage(getResources().getString(R.string.comment_has_sent));
            getBaseActivity().onBackPressed();
            return;
        }
        if (createCommentEvent.getMessage().length() > 0) {
            showMessage(createCommentEvent.getMessage());
        } else {
            showMessage(getResources().getString(R.string.internalError));
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/NewCommentFragment$Companion;", "", "()V", "THREAD_ID", "", "THREAD_TYPE", "newInstance", "Lru/unicorn/ujin/market/comment/NewCommentFragment;", "id", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.comment.NewCommentFragment$Companion */
    /* compiled from: NewCommentFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NewCommentFragment newInstance(String str, String str2) {
            NewCommentFragment newCommentFragment = new NewCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putString(NewCommentFragment.THREAD_ID, str);
            bundle.putString(NewCommentFragment.THREAD_TYPE, str2);
            Unit unit = Unit.INSTANCE;
            newCommentFragment.setArguments(bundle);
            return newCommentFragment;
        }
    }
}
