package p035ru.unicorn.ujin.market.exampleOfWork;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.SampleWork;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.util.LoaderUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u001c\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u001e\u0010!\u001a\u00020\u00142\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00050#j\b\u0012\u0004\u0012\u00020\u0005`$J\u0014\u0010!\u001a\u00020\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/market/exampleOfWork/ExampleHorizontalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/exampleOfWork/ExampleHorizontalAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/SampleWork;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "showExampleGalleryFragment", "Lkotlin/Function1;", "", "", "getShowExampleGalleryFragment", "()Lkotlin/jvm/functions/Function1;", "setShowExampleGalleryFragment", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.exampleOfWork.ExampleHorizontalAdapter */
/* compiled from: ExampleHorizontalAdapter.kt */
public final class ExampleHorizontalAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<? extends SampleWork> data;
    private Function1<? super Integer, Unit> showExampleGalleryFragment = ExampleHorizontalAdapter$showExampleGalleryFragment$1.INSTANCE;

    public ExampleHorizontalAdapter(List<? extends SampleWork> list, Context context2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.data = list;
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<SampleWork> getData() {
        return this.data;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setData(List<? extends SampleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final Function1<Integer, Unit> getShowExampleGalleryFragment() {
        return this.showExampleGalleryFragment;
    }

    public final void setShowExampleGalleryFragment(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.showExampleGalleryFragment = function1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.item_example, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…m_example, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public final void setItems(ArrayList<SampleWork> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, FirebaseAnalytics.Param.ITEMS);
        this.data = arrayList;
        notifyDataSetChanged();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/exampleOfWork/ExampleHorizontalAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/exampleOfWork/ExampleHorizontalAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.exampleOfWork.ExampleHorizontalAdapter$ViewHolder */
    /* compiled from: ExampleHorizontalAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ExampleHorizontalAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ExampleHorizontalAdapter exampleHorizontalAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = exampleHorizontalAdapter;
        }

        public final void bind(int i) {
            SampleWork sampleWork = this.this$0.getData().get(i);
            if (sampleWork.getImage() != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                GlideRequest load = GlideApp.with((View) (AppCompatImageView) view.findViewById(C5619R.C5622id.ivExample)).load(sampleWork.getImage());
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                GlideRequest diskCacheStrategy = load.placeholder((Drawable) LoaderUtils.getImageLoader(context)).diskCacheStrategy(DiskCacheStrategy.ALL);
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                diskCacheStrategy.into((ImageView) (AppCompatImageView) view3.findViewById(C5619R.C5622id.ivExample));
            }
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((CardView) view4.findViewById(C5619R.C5622id.exampleLayout)).setOnClickListener(new ExampleHorizontalAdapter$ViewHolder$bind$2(this, i));
        }
    }

    public final void setItems(List<? extends SampleWork> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }
}
