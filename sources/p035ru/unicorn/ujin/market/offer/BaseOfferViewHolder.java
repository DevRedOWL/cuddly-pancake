package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/BaseOfferViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "tagList", "", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "onOfferClickListener", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "(Landroid/view/View;Ljava/util/List;Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;)V", "getOnOfferClickListener$app_kortrosRelease", "()Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "setOnOfferClickListener$app_kortrosRelease", "(Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;)V", "getTagList$app_kortrosRelease", "()Ljava/util/List;", "setTagList$app_kortrosRelease", "(Ljava/util/List;)V", "bind", "", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "OnOfferClickListener", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.BaseOfferViewHolder */
/* compiled from: BaseOfferViewHolder.kt */
public abstract class BaseOfferViewHolder extends RecyclerView.ViewHolder {
    private OnOfferClickListener onOfferClickListener;
    private List<? extends Tag> tagList;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "", "onDescriptionClicked", "", "id", "", "onOrderClicked", "onToCartClicked", "count", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.BaseOfferViewHolder$OnOfferClickListener */
    /* compiled from: BaseOfferViewHolder.kt */
    public interface OnOfferClickListener {
        void onDescriptionClicked(String str);

        void onOrderClicked(String str);

        void onToCartClicked(String str, int i);
    }

    public abstract void bind(Offer offer);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseOfferViewHolder(View view, List<? extends Tag> list, OnOfferClickListener onOfferClickListener2) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(list, "tagList");
        Intrinsics.checkNotNullParameter(onOfferClickListener2, "onOfferClickListener");
        this.tagList = list;
        this.onOfferClickListener = onOfferClickListener2;
    }

    public final OnOfferClickListener getOnOfferClickListener$app_kortrosRelease() {
        return this.onOfferClickListener;
    }

    public final List<Tag> getTagList$app_kortrosRelease() {
        return this.tagList;
    }

    public final void setOnOfferClickListener$app_kortrosRelease(OnOfferClickListener onOfferClickListener2) {
        Intrinsics.checkNotNullParameter(onOfferClickListener2, "<set-?>");
        this.onOfferClickListener = onOfferClickListener2;
    }

    public final void setTagList$app_kortrosRelease(List<? extends Tag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagList = list;
    }
}
