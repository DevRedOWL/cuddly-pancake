package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.util.GlideRequests;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/newSmartNav/SmartNewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/newSmartNav/SmartNewsAdapter$ViewHolder;", "data", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/News;", "Lkotlin/collections/ArrayList;", "onClickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.SmartNewsAdapter */
/* compiled from: SmartNewsAdapter.kt */
public final class SmartNewsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final ArrayList<News> data;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/newSmartNav/SmartNewsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "news", "Lru/unicorn/ujin/data/realm/News;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.SmartNewsAdapter$ViewHolder */
    /* compiled from: SmartNewsAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(News news) {
            Intrinsics.checkNotNullParameter(news, "news");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            GlideRequests with = GlideApp.with((View) (ImageView) view.findViewById(C5619R.C5622id.ivNewsImage));
            ImageData imageData = news.getImageData();
            GlideRequest load = with.load(imageData != null ? imageData.getSource() : null);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            load.into((ImageView) view2.findViewById(C5619R.C5622id.ivNewsImage));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(C5619R.C5622id.tvNewsTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvNewsTitle");
            textView.setText(news.getTitle());
        }
    }

    public SmartNewsAdapter(ArrayList<News> arrayList, Function1<? super News, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.data = arrayList;
    }

    public final ArrayList<News> getData() {
        return this.data;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_smart_news, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…mart_news, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        News news = this.data.get(i);
        Intrinsics.checkNotNullExpressionValue(news, "data[position]");
        viewHolder.bind(news);
    }
}
