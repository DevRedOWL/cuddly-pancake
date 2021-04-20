package p035ru.unicorn.ujin.view.fragments.makearecord.sections;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p059rx.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0005J6\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0014J\u0018\u0010\u0013\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/RecordSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "Lru/unicorn/ujin/view/fragments/makearecord/sections/RecordSection$VH;", "Landroid/view/View$OnClickListener;", "()V", "clickSubject", "Lrx/subjects/PublishSubject;", "getClickSubject", "()Lrx/subjects/PublishSubject;", "bindViewHolder", "", "viewHolder", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.RecordSection */
/* compiled from: RecordSection.kt */
public final class RecordSection extends MultiSection<Appointment, C6032VH> implements View.OnClickListener {
    private final PublishSubject<Appointment> clickSubject;

    public int getLayoutId() {
        return R.layout.item_record_appointment;
    }

    public RecordSection() {
        PublishSubject<Appointment> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.clickSubject = create;
    }

    public final PublishSubject<Appointment> getClickSubject() {
        return this.clickSubject;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder((C6032VH) tag);
            if (adapterPositionForViewHolder > -1) {
                this.clickSubject.onNext(getData(adapterPositionForViewHolder));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.makearecord.sections.RecordSection.VH");
    }

    /* access modifiers changed from: protected */
    public C6032VH createViewHolder(View view) {
        if (view != null) {
            return new C6032VH(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C6032VH vh, Appointment appointment, int i, List<Object> list) {
        Intrinsics.checkNotNullParameter(appointment, "data");
        if (vh != null) {
            vh.bind(appointment, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/RecordSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/RecordSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.RecordSection$VH */
    /* compiled from: RecordSection.kt */
    public final class C6032VH extends RecyclerView.ViewHolder {
        final /* synthetic */ RecordSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6032VH(RecordSection recordSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = recordSection;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }

        public final void bind(Appointment appointment, int i) {
            Intrinsics.checkNotNullParameter(appointment, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(appointment.getDescription());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.executor);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.executor");
            textView2.setText(appointment.getTitle());
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.date);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.date");
            textView3.setText(appointment.getDate() + " в " + appointment.getTimeStart());
        }
    }
}
