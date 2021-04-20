package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0014J\u0014\u0010\u0016\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/activity/navigation/entity/scenario/SomeString;", "Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection$TextHolder;", "isBold", "", "fontSize", "", "(ZI)V", "textAlligment", "getTextAlligment", "()Ljava/lang/Integer;", "setTextAlligment", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bindViewHolder", "", "textHolder", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "TextHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TextSection */
/* compiled from: TextSection.kt */
public final class TextSection extends SingleSection<SomeString, TextHolder> {
    private int fontSize;
    private boolean isBold;
    private Integer textAlligment;

    public int getLayoutId() {
        return R.layout.item_text_section;
    }

    public TextSection(boolean z, int i) {
        this.isBold = z;
        this.fontSize = i;
    }

    public final Integer getTextAlligment() {
        return this.textAlligment;
    }

    public final void setTextAlligment(Integer num) {
        this.textAlligment = num;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(TextHolder textHolder, SomeString someString, List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(textHolder, "textHolder");
        Intrinsics.checkNotNullParameter(someString, "data");
        Intrinsics.checkNotNullParameter(list, "payloads");
        textHolder.getText().setTextSize((float) this.fontSize);
        if (this.isBold) {
            textHolder.getText().setTypeface((Typeface) null, 1);
        }
        Integer num = this.textAlligment;
        if (num != null) {
            textHolder.getText().setTextAlignment(num.intValue());
        }
        textHolder.getText().setText(someString.getSomeString());
    }

    /* access modifiers changed from: protected */
    public TextHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new TextHolder(this, view);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection$TextHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/tickets/TextSection;Landroid/view/View;)V", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.TextSection$TextHolder */
    /* compiled from: TextSection.kt */
    public final class TextHolder extends RecyclerView.ViewHolder {
        @BindView(2131363552)
        private TextView text;
        final /* synthetic */ TextSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextHolder(TextSection textSection, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = textSection;
            ButterKnife.bind((Object) this, view);
            View findViewById = view.findViewById(R.id.text);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.text)");
            this.text = (TextView) findViewById;
        }

        public final TextView getText() {
            return this.text;
        }

        public final void setText(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.text = textView;
        }
    }
}
