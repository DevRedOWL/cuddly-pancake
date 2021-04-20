package p035ru.unicorn.ujin.market.comment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.CommentListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0014J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "commentListAdapter", "Lru/unicorn/ujin/market/comment/CommentListAdapter;", "offset", "", "threadId", "", "threadType", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/CommentListEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentListFragment */
/* compiled from: CommentListFragment.kt */
public final class CommentListFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LIMIT = 10;
    public static final String THREAD_ID = "threadId";
    public static final String THREAD_TYPE = "threadType";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public CommentListAdapter commentListAdapter;
    /* access modifiers changed from: private */
    public int offset;
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

    public static final /* synthetic */ CommentListAdapter access$getCommentListAdapter$p(CommentListFragment commentListFragment) {
        CommentListAdapter commentListAdapter2 = commentListFragment.commentListAdapter;
        if (commentListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentListAdapter");
        }
        return commentListAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getResources().getString(R.string.commentList));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…t_list, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        this.threadId = arguments != null ? arguments.getString("threadId") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("threadType");
        }
        this.threadType = str;
        this.commentListAdapter = new CommentListAdapter(getMarketViewModel().getCommentList(this.threadId, this.threadType));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvCommentList);
        CommentListAdapter commentListAdapter2 = this.commentListAdapter;
        if (commentListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentListAdapter");
        }
        recyclerView.setAdapter(commentListAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.commentListScrollView)).setOnScrollChangeListener(new CommentListFragment$onViewCreated$2(this));
        getMarketViewModel().getCommentListLiveData().observe(this, new CommentListFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CommentListEvent commentListEvent) {
        if (commentListEvent.getSuccess()) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.smallProgressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "smallProgressBar");
            progressBar.setVisibility(8);
            for (Comment next : commentListEvent.getCommentList()) {
                CommentListAdapter commentListAdapter2 = this.commentListAdapter;
                if (commentListAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("commentListAdapter");
                }
                commentListAdapter2.addItem(next);
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentListFragment$Companion;", "", "()V", "LIMIT", "", "THREAD_ID", "", "THREAD_TYPE", "newInstance", "Lru/unicorn/ujin/market/comment/CommentListFragment;", "id", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.comment.CommentListFragment$Companion */
    /* compiled from: CommentListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CommentListFragment newInstance(String str, String str2) {
            CommentListFragment commentListFragment = new CommentListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("threadId", str);
            bundle.putString("threadType", str2);
            Unit unit = Unit.INSTANCE;
            commentListFragment.setArguments(bundle);
            return commentListFragment;
        }
    }
}
