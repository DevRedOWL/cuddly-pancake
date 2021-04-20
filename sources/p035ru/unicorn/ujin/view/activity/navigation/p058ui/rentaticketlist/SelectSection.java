package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p046io.reactivex.processors.PublishProcessor;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0005J4\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0014J\u0014\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SelectSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SelectSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "isArrowVisible", "", "specialClick", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "bindViewHolder", "", "vh", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "setArrowVisibility", "specialClicks", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.SelectSection */
/* compiled from: SelectSection.kt */
public final class SelectSection extends MultiSection<IKeyValueData, ViewHolder> implements View.OnClickListener {
    /* access modifiers changed from: private */
    public boolean isArrowVisible;
    private final PublishProcessor<IKeyValueData> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_select_section;
    }

    public final PublishProcessor<IKeyValueData> specialClicks() {
        return this.specialClick;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) tag);
            if (adapterPositionForViewHolder > -1) {
                this.specialClick.onNext(getData(adapterPositionForViewHolder));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.SelectSection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, IKeyValueData iKeyValueData, int i, List<Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "vh");
        Intrinsics.checkNotNullParameter(iKeyValueData, "data");
        viewHolder.bind(iKeyValueData);
    }

    public final void setArrowVisibility(boolean z) {
        this.isArrowVisible = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SelectSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SelectSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.SelectSection$ViewHolder */
    /* compiled from: SelectSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ SelectSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SelectSection selectSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = selectSection;
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }

        public final void bind(IKeyValueData iKeyValueData) {
            Intrinsics.checkNotNullParameter(iKeyValueData, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.arrow);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.arrow");
            imageView.setVisibility(this.this$0.isArrowVisible ? 0 : 8);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(iKeyValueData.getValue().toString());
        }
    }
}
