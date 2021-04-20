package p035ru.unicorn.ujin.view.fragments.base.attach.section;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p059rx.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0005J6\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0014J\u0018\u0010\u0014\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016R5\u0010\u0006\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection$VH;", "Landroid/view/View$OnClickListener;", "()V", "onClickSubject", "Lrx/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getOnClickSubject", "()Lrx/subjects/PublishSubject;", "bindViewHolder", "", "viewHolder", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.ShowAttachSection */
/* compiled from: ShowAttachSection.kt */
public final class ShowAttachSection extends MultiSection<AttachablePreview, C6003VH> implements View.OnClickListener {
    private final PublishSubject<AttachablePreview> onClickSubject = PublishSubject.create();

    public int getLayoutId() {
        return R.layout.item_attach_preview_citygate;
    }

    public final PublishSubject<AttachablePreview> getOnClickSubject() {
        return this.onClickSubject;
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if (view != null) {
            Object tag = view.getTag();
            if (tag != null) {
                C6003VH vh = (C6003VH) tag;
                if (vh != null && (adapterPositionForViewHolder = getAdapterPositionForViewHolder(vh)) > -1) {
                    List data = getData();
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    if (!data.isEmpty()) {
                        AttachablePreview attachablePreview = (AttachablePreview) getData(adapterPositionForViewHolder);
                        if (view.getId() == R.id.close) {
                            this.onClickSubject.onNext(attachablePreview);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.base.attach.section.ShowAttachSection.VH");
        }
    }

    /* access modifiers changed from: protected */
    public C6003VH createViewHolder(View view) {
        if (view != null) {
            return new C6003VH(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C6003VH vh, AttachablePreview attachablePreview, int i, List<Object> list) {
        Intrinsics.checkNotNullParameter(attachablePreview, "data");
        if (vh != null) {
            vh.bind(attachablePreview, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.ShowAttachSection$VH */
    /* compiled from: ShowAttachSection.kt */
    public final class C6003VH extends RecyclerView.ViewHolder {
        final /* synthetic */ ShowAttachSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6003VH(ShowAttachSection showAttachSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = showAttachSection;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
            ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.close);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.close");
            imageView.setTag(this);
            ((ImageView) view.findViewById(C5619R.C5622id.close)).setOnClickListener(onClickListener);
        }

        public final void bind(AttachablePreview attachablePreview, int i) {
            Intrinsics.checkNotNullParameter(attachablePreview, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RequestBuilder<Drawable> load = Glide.with(view.getContext()).load(new File(attachablePreview.imageUrl()));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            load.into((ImageView) view2.findViewById(C5619R.C5622id.preview));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(C5619R.C5622id.filename);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.filename");
            textView.setText(attachablePreview.fileName());
        }
    }
}
