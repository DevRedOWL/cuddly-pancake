package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssData;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssActiveArchiveFragment;", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssBaseFragment;", "()V", "noOssMessage", "", "getNoOssMessage", "()Ljava/lang/String;", "setNoOssMessage", "(Ljava/lang/String;)V", "ossList", "", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "getOssList", "()Ljava/util/List;", "setOssList", "(Ljava/util/List;)V", "handleOssClick", "", "oss", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssActiveArchiveFragment */
/* compiled from: OssActiveArchiveFragment.kt */
public final class OssActiveArchiveFragment extends OssBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public String noOssMessage;
    public List<Oss> ossList;

    @JvmStatic
    public static final OssActiveArchiveFragment newInstance(String str, List<Oss> list, String str2) {
        return Companion.newInstance(str, list, str2);
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
        return "Экран активных и архивных голосований";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    public final String getNoOssMessage() {
        String str = this.noOssMessage;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOssMessage");
        }
        return str;
    }

    public final void setNoOssMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noOssMessage = str;
    }

    public final List<Oss> getOssList() {
        List<Oss> list = this.ossList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ossList");
        }
        return list;
    }

    public final void setOssList(List<Oss> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.ossList = list;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_oss_active_archive, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        List<Oss> list = this.ossList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ossList");
        }
        if (!list.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOssList);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            List<Oss> list2 = this.ossList;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ossList");
            }
            recyclerView.setAdapter(new OssListAdapter(list2, new OssActiveArchiveFragment$onViewCreated$$inlined$apply$lambda$1(this)));
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoOss);
        Intrinsics.checkNotNullExpressionValue(textView, "tvNoOss");
        String str = this.noOssMessage;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOssMessage");
        }
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoOss);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoOss");
        textView2.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final void handleOssClick(Oss oss) {
        nextFragment(OssQuestionFragment.Companion.newInstance(getTitle(), oss, (OssData) null, -1, new ArrayList(), false), false, BaseActivity.FRAGMENT_OSS_QUESTION);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssActiveArchiveFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssActiveArchiveFragment;", "title", "", "ossList", "", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "noOssMessage", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssActiveArchiveFragment$Companion */
    /* compiled from: OssActiveArchiveFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OssActiveArchiveFragment newInstance(String str, List<Oss> list, String str2) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(list, "ossList");
            Intrinsics.checkNotNullParameter(str2, "noOssMessage");
            OssActiveArchiveFragment ossActiveArchiveFragment = new OssActiveArchiveFragment();
            ossActiveArchiveFragment.setTitle(str);
            ossActiveArchiveFragment.setNoOssMessage(str2);
            ossActiveArchiveFragment.setOssList(list);
            return ossActiveArchiveFragment;
        }
    }
}
