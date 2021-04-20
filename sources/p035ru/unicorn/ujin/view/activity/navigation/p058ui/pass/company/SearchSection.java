package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p059rx.subjects.BehaviorSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J0\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0014J\u0014\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\fH\u0016J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/activity/navigation/entity/scenario/SomeString;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection$VH;", "()V", "hint", "", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "inputType", "", "getInputType", "()Ljava/lang/Integer;", "setInputType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "subject", "Lrx/subjects/BehaviorSubject;", "getSubject", "()Lrx/subjects/BehaviorSubject;", "bindViewHolder", "", "vh", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "setCustomHint", "typeClassNumber", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchSection */
/* compiled from: SearchSection.kt */
public final class SearchSection extends SingleSection<SomeString, C5905VH> {
    private String hint;
    private Integer inputType;
    private final BehaviorSubject<String> subject;

    public int getLayoutId() {
        return R.layout.item_search_section;
    }

    public SearchSection() {
        BehaviorSubject<String> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "BehaviorSubject.create()");
        this.subject = create;
    }

    public final BehaviorSubject<String> getSubject() {
        return this.subject;
    }

    public final String getHint() {
        return this.hint;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final Integer getInputType() {
        return this.inputType;
    }

    public final void setInputType(Integer num) {
        this.inputType = num;
    }

    /* access modifiers changed from: protected */
    public C5905VH createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new C5905VH(this, view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C5905VH vh, SomeString someString, List<Object> list) {
        if (vh != null) {
            vh.bind();
        }
    }

    public final void setCustomHint(String str) {
        Intrinsics.checkNotNullParameter(str, "hint");
        this.hint = str;
    }

    public final void setInputType(int i) {
        this.inputType = Integer.valueOf(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0006\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection;Landroid/view/View;)V", "editTextWatcher", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection$VH$editTextWatcher$1", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchSection$VH$editTextWatcher$1;", "bind", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchSection$VH */
    /* compiled from: SearchSection.kt */
    public final class C5905VH extends RecyclerView.ViewHolder {
        private final SearchSection$VH$editTextWatcher$1 editTextWatcher = new SearchSection$VH$editTextWatcher$1(this);
        final /* synthetic */ SearchSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5905VH(SearchSection searchSection, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = searchSection;
        }

        public final void bind() {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ((EditText) view.findViewById(C5619R.C5622id.f6511et)).addTextChangedListener(this.editTextWatcher);
            String hint = this.this$0.getHint();
            if (hint != null) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                EditText editText = (EditText) view2.findViewById(C5619R.C5622id.f6511et);
                Intrinsics.checkNotNullExpressionValue(editText, "itemView.et");
                editText.setHint(hint);
            }
            Integer inputType = this.this$0.getInputType();
            if (inputType != null) {
                int intValue = inputType.intValue();
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                EditText editText2 = (EditText) view3.findViewById(C5619R.C5622id.f6511et);
                Intrinsics.checkNotNullExpressionValue(editText2, "itemView.et");
                editText2.setInputType(intValue);
            }
            SomeString someString = (SomeString) this.this$0.getData();
            Intrinsics.checkNotNullExpressionValue(someString, "data");
            if (!StringsKt.isBlank(someString.getSomeString().toString())) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ((EditText) view4.findViewById(C5619R.C5622id.f6511et)).removeTextChangedListener(this.editTextWatcher);
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                SomeString someString2 = (SomeString) this.this$0.getData();
                Intrinsics.checkNotNullExpressionValue(someString2, "data");
                ((EditText) view5.findViewById(C5619R.C5622id.f6511et)).setText(someString2.getSomeString().toString());
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                ((EditText) view6.findViewById(C5619R.C5622id.f6511et)).clearFocus();
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                ((EditText) view7.findViewById(C5619R.C5622id.f6511et)).addTextChangedListener(this.editTextWatcher);
            }
        }
    }
}
