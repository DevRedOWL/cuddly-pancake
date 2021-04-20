package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0014J\u0014\u0010\u001c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/activity/navigation/entity/scenario/SomeString;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection$TitleHolder;", "isBold", "", "fontSize", "", "(ZI)V", "btnTitle", "", "getBtnTitle", "()Ljava/lang/String;", "setBtnTitle", "(Ljava/lang/String;)V", "itemClick", "Lio/reactivex/subjects/PublishSubject;", "getItemClick", "()Lio/reactivex/subjects/PublishSubject;", "setItemClick", "(Lio/reactivex/subjects/PublishSubject;)V", "bindViewHolder", "", "titleHolder", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "setButtonTitle", "title", "TitleHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.TitleLineSection */
/* compiled from: TitleLineSection.kt */
public final class TitleLineSection extends SingleSection<SomeString, TitleHolder> {
    private String btnTitle = "";
    /* access modifiers changed from: private */
    public int fontSize;
    /* access modifiers changed from: private */
    public boolean isBold;
    private PublishSubject<SomeString> itemClick;

    public int getLayoutId() {
        return R.layout.item_title_line;
    }

    public TitleLineSection(boolean z, int i) {
        this.isBold = z;
        this.fontSize = i;
        PublishSubject<SomeString> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.itemClick = create;
    }

    public final PublishSubject<SomeString> getItemClick() {
        return this.itemClick;
    }

    public final void setItemClick(PublishSubject<SomeString> publishSubject) {
        Intrinsics.checkNotNullParameter(publishSubject, "<set-?>");
        this.itemClick = publishSubject;
    }

    public final String getBtnTitle() {
        return this.btnTitle;
    }

    public final void setBtnTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.btnTitle = str;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(TitleHolder titleHolder, SomeString someString, List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(titleHolder, "titleHolder");
        Intrinsics.checkNotNullParameter(someString, "data");
        Intrinsics.checkNotNullParameter(list, "payloads");
        titleHolder.bind();
    }

    /* access modifiers changed from: protected */
    public TitleHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new TitleHolder(this, view);
    }

    public final void setButtonTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.btnTitle = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection$TitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection;Landroid/view/View;)V", "bind", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.TitleLineSection$TitleHolder */
    /* compiled from: TitleLineSection.kt */
    public final class TitleHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ TitleLineSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleHolder(TitleLineSection titleLineSection, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = titleLineSection;
        }

        public final void bind() {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            if (this.this$0.isBold) {
                textView.setTypeface((Typeface) null, 1);
            }
            textView.setTextSize((float) this.this$0.fontSize);
            SomeString someString = (SomeString) this.this$0.getData();
            Intrinsics.checkNotNullExpressionValue(someString, "data");
            textView.setText(someString.getSomeString());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvAction);
            if (StringsKt.isBlank(this.this$0.getBtnTitle())) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setVisibility(0);
            textView2.setText(this.this$0.getBtnTitle());
            textView2.setOnClickListener(new TitleLineSection$TitleHolder$bind$$inlined$apply$lambda$1(this));
        }
    }
}
