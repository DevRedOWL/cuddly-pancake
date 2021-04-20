package p035ru.unicorn.ujin.market.comment;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "commentId", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentFragment */
/* compiled from: CommentFragment.kt */
public final class CommentFragment extends MarketBaseFragment {
    public static final String COMMENT_ID = "commentId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private String commentId;

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
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getResources().getString(R.string.commentList));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.commentId = arguments != null ? arguments.getString(COMMENT_ID) : null;
        View inflate = layoutInflater.inflate(R.layout.fragment_comment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…omment, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String vote;
        String date;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Comment comment = getMarketViewModel().getComment(this.commentId);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvAuthor);
        Intrinsics.checkNotNullExpressionValue(textView, "tvAuthor");
        String str = null;
        textView.setText(comment != null ? comment.getAuthorName() : null);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvDescription");
        if (comment != null) {
            str = comment.getMessage();
        }
        textView2.setText(str);
        if (!(comment == null || (date = comment.getDate()) == null)) {
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDate);
            Intrinsics.checkNotNullExpressionValue(textView3, "tvDate");
            textView3.setText(DateUtils.formatDateFromUnix(date));
        }
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
            Drawable drawable2 = layerDrawable.getDrawable(0);
            Intrinsics.checkNotNullExpressionValue(drawable2, "starsLayer.getDrawable(0)");
            drawable2.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.ratingBarColorDark), PorterDuff.Mode.SRC_ATOP));
            Drawable drawable3 = layerDrawable.getDrawable(1);
            Intrinsics.checkNotNullExpressionValue(drawable3, "starsLayer.getDrawable(1)");
            drawable3.setColorFilter(colorFilter);
            RatingBar ratingBar2 = (RatingBar) _$_findCachedViewById(C5619R.C5622id.ratingBar);
            Intrinsics.checkNotNullExpressionValue(ratingBar2, "ratingBar");
            ratingBar2.setRating((comment == null || (vote = comment.getVote()) == null) ? 0.0f : Float.parseFloat(vote));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentFragment$Companion;", "", "()V", "COMMENT_ID", "", "newInstance", "Lru/unicorn/ujin/market/comment/CommentFragment;", "commentId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.comment.CommentFragment$Companion */
    /* compiled from: CommentFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CommentFragment newInstance(String str) {
            CommentFragment commentFragment = new CommentFragment();
            Bundle bundle = new Bundle();
            bundle.putString(CommentFragment.COMMENT_ID, str);
            Unit unit = Unit.INSTANCE;
            commentFragment.setArguments(bundle);
            return commentFragment;
        }
    }
}
