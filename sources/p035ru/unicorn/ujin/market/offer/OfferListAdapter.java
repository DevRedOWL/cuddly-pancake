package p035ru.unicorn.ujin.market.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.market.enums.OfferType;
import p035ru.unicorn.ujin.market.offer.BaseOfferViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0014\u0010!\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "tagList", "", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "onOfferClickListener", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "(Ljava/util/List;Ljava/util/List;Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getTagList", "setTagList", "addItem", "", "item", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListAdapter */
/* compiled from: OfferListAdapter.kt */
public final class OfferListAdapter extends RecyclerView.Adapter<BaseOfferViewHolder> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PRODUCT_VIEW_TYPE = 0;
    public static final int SERVICE_VIEW_TYPE = 1;
    private Context context;
    private List<Offer> data;
    private BaseOfferViewHolder.OnOfferClickListener onOfferClickListener;
    private List<? extends Tag> tagList;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferListAdapter$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[OfferType.values().length];

        static {
            $EnumSwitchMapping$0[OfferType.PRODUCT.ordinal()] = 1;
            $EnumSwitchMapping$0[OfferType.SERVICE.ordinal()] = 2;
        }
    }

    public final List<Offer> getData() {
        return this.data;
    }

    public final List<Tag> getTagList() {
        return this.tagList;
    }

    public final void setData(List<Offer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setTagList(List<? extends Tag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagList = list;
    }

    public OfferListAdapter(List<Offer> list, List<? extends Tag> list2, BaseOfferViewHolder.OnOfferClickListener onOfferClickListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(list2, "tagList");
        Intrinsics.checkNotNullParameter(onOfferClickListener2, "onOfferClickListener");
        this.data = list;
        this.tagList = list2;
        this.onOfferClickListener = onOfferClickListener2;
    }

    public BaseOfferViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        if (i != 0) {
            Context context3 = this.context;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            View inflate = LayoutInflater.from(context3).inflate(R.layout.item_service, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…m_service, parent, false)");
            return new ServiceViewHolder(inflate, this.tagList, this.onOfferClickListener);
        }
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate2 = LayoutInflater.from(context4).inflate(R.layout.item_offer, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(cont…tem_offer, parent, false)");
        return new ProductViewHolder(inflate2, this.tagList, this.onOfferClickListener);
    }

    public int getItemViewType(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[OfferType.Companion.getType(this.data.get(i).getType()).ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(BaseOfferViewHolder baseOfferViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseOfferViewHolder, "holder");
        baseOfferViewHolder.bind(this.data.get(i));
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<Offer> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(Offer offer) {
        Intrinsics.checkNotNullParameter(offer, "item");
        this.data.add(offer);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferListAdapter$Companion;", "", "()V", "PRODUCT_VIEW_TYPE", "", "SERVICE_VIEW_TYPE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferListAdapter$Companion */
    /* compiled from: OfferListAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
