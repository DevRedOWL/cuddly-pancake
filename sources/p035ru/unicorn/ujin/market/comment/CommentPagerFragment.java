package p035ru.unicorn.ujin.market.comment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.viewModel.events.market.CommentListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentPagerFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "commentPagerAdapter", "Lru/unicorn/ujin/market/comment/CommentPagerAdapter;", "threadId", "", "threadType", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CommentListEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentPagerFragment */
/* compiled from: CommentPagerFragment.kt */
public final class CommentPagerFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LIMIT = 10;
    public static final String THREAD_ID = "threadId";
    public static final String THREAD_TYPE = "threadType";
    private HashMap _$_findViewCache;
    private CommentPagerAdapter commentPagerAdapter;
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
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_comment_pager, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        Bundle arguments = getArguments();
        String str2 = null;
        this.threadId = arguments != null ? arguments.getString("threadId") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("threadType");
        }
        this.threadType = str2;
        List emptyList = CollectionsKt.emptyList();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.commentPagerAdapter = new CommentPagerAdapter(emptyList, context);
        CommentPagerAdapter commentPagerAdapter2 = this.commentPagerAdapter;
        if (commentPagerAdapter2 != null) {
            commentPagerAdapter2.setShowCommentFragment(new CommentPagerFragment$onViewCreated$1(this));
        }
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.commentViewPager);
        viewPager.setAdapter(this.commentPagerAdapter);
        viewPager.setPageMargin(viewPager.getResources().getDimensionPixelOffset(R.dimen.smallPadding));
        viewPager.setClipToPadding(false);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvShowAll)).setOnClickListener(new CommentPagerFragment$onViewCreated$3(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnWriteComment)).setOnClickListener(new CommentPagerFragment$onViewCreated$4(this));
        String str3 = this.threadId;
        if (str3 != null && (!StringsKt.isBlank(str3)) && (str = this.threadType) != null && (!StringsKt.isBlank(str))) {
            getMarketViewModel().loadCommentList(this.threadId, this.threadType, 10, 0);
            getMarketViewModel().getCommentListLiveData().observe(this, new CommentPagerFragment$onViewCreated$5(this));
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CommentListEvent commentListEvent) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (commentListEvent.getSuccess()) {
            List<Comment> commentList = commentListEvent.getCommentList();
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvCommentCount);
            Intrinsics.checkNotNullExpressionValue(textView, "tvCommentCount");
            boolean z = true;
            textView.setText(getResources().getString(R.string.total_count, new Object[]{commentListEvent.getTotalCount()}));
            Collection collection = commentList;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvShowAll);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvShowAll");
                textView2.setVisibility(8);
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoCommentMessage);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvNoCommentMessage");
                textView3.setVisibility(0);
                TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoCommentMessage);
                Intrinsics.checkNotNullExpressionValue(textView4, "tvNoCommentMessage");
                String str = this.threadType;
                if (str != null && str.hashCode() == 3242771 && str.equals("item")) {
                    charSequence2 = getResources().getString(R.string.message_no_offer_comments);
                } else {
                    charSequence2 = getResources().getString(R.string.message_no_company_comments);
                }
                textView4.setText(charSequence2);
            } else {
                ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.commentViewPager);
                Intrinsics.checkNotNullExpressionValue(viewPager, "commentViewPager");
                viewPager.setVisibility(0);
                CommentPagerAdapter commentPagerAdapter2 = this.commentPagerAdapter;
                if (commentPagerAdapter2 != null) {
                    commentPagerAdapter2.setItems(commentList);
                }
            }
        } else {
            TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvShowAll);
            Intrinsics.checkNotNullExpressionValue(textView5, "tvShowAll");
            textView5.setVisibility(8);
            TextView textView6 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoCommentMessage);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvNoCommentMessage");
            textView6.setVisibility(0);
            TextView textView7 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoCommentMessage);
            Intrinsics.checkNotNullExpressionValue(textView7, "tvNoCommentMessage");
            String str2 = this.threadType;
            if (str2 != null && str2.hashCode() == 3242771 && str2.equals("item")) {
                charSequence = getResources().getString(R.string.message_no_offer_comments);
            } else {
                charSequence = getResources().getString(R.string.message_no_company_comments);
            }
            textView7.setText(charSequence);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.commentPagerLayout);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "commentPagerLayout");
        constraintLayout.setVisibility(0);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentPagerFragment$Companion;", "", "()V", "LIMIT", "", "THREAD_ID", "", "THREAD_TYPE", "newInstance", "Lru/unicorn/ujin/market/comment/CommentPagerFragment;", "id", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.comment.CommentPagerFragment$Companion */
    /* compiled from: CommentPagerFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CommentPagerFragment newInstance(String str, String str2) {
            CommentPagerFragment commentPagerFragment = new CommentPagerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("threadId", str);
            bundle.putString("threadType", str2);
            Unit unit = Unit.INSTANCE;
            commentPagerFragment.setArguments(bundle);
            return commentPagerFragment;
        }
    }
}
