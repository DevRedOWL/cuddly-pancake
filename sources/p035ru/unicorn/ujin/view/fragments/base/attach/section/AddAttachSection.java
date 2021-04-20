package p035ru.unicorn.ujin.view.fragments.base.attach.section;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachableButtonSettings;
import p059rx.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0005J0\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0014J\u0018\u0010\u0012\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachableButtonSettings;", "Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection$VH;", "Landroid/view/View$OnClickListener;", "()V", "clickSubject", "Lrx/subjects/PublishSubject;", "", "getClickSubject", "()Lrx/subjects/PublishSubject;", "bindViewHolder", "", "viewHolder", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "", "initDefaultValue", "onClick", "v", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.AddAttachSection */
/* compiled from: AddAttachSection.kt */
public final class AddAttachSection extends SingleSection<AttachableButtonSettings, C6002VH> implements View.OnClickListener {
    private final PublishSubject<String> clickSubject;

    public int getLayoutId() {
        return R.layout.item_add_attach_section_citygate;
    }

    public AddAttachSection() {
        PublishSubject<String> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.clickSubject = create;
    }

    public final void initDefaultValue() {
        setData(new AddAttachSection$initDefaultValue$initDefaultValue$1());
    }

    public final PublishSubject<String> getClickSubject() {
        return this.clickSubject;
    }

    public void onClick(View view) {
        this.clickSubject.onNext("");
    }

    /* access modifiers changed from: protected */
    public C6002VH createViewHolder(View view) {
        if (view != null) {
            return new C6002VH(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C6002VH vh, AttachableButtonSettings attachableButtonSettings, List<Object> list) {
        if (attachableButtonSettings != null && vh != null) {
            vh.bind(attachableButtonSettings);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/base/attach/AttachableButtonSettings;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.AddAttachSection$VH */
    /* compiled from: AddAttachSection.kt */
    public final class C6002VH extends RecyclerView.ViewHolder {
        final /* synthetic */ AddAttachSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6002VH(AddAttachSection addAttachSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = addAttachSection;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }

        public final void bind(AttachableButtonSettings attachableButtonSettings) {
            Intrinsics.checkNotNullParameter(attachableButtonSettings, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.buttonDescription);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.buttonDescription");
            textView.setText(attachableButtonSettings.getButtonText());
        }
    }
}
