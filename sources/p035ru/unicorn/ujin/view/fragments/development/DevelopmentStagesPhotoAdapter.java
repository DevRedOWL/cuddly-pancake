package p035ru.unicorn.ujin.view.fragments.development;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.StagePhotoItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0014\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DevelopmentStagesPhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/StagePhotoItem;", "onItemClickListener", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "addItem", "item", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "Companion", "ImageViewHolder", "TitleViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter */
/* compiled from: DevelopmentStagesPhotoAdapter.kt */
public final class DevelopmentStagesPhotoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int GROUP_TITLE = 0;
    public static final int PHOTO_ITEM = 1;
    /* access modifiers changed from: private */
    public List<StagePhotoItem> data;
    private final Function1<Integer, Unit> onItemClickListener;

    public final Function1<Integer, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public DevelopmentStagesPhotoAdapter(List<StagePhotoItem> list, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
        this.data = list;
        this.onItemClickListener = function1;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        if (i != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_development_stages_photo, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ges_photo, parent, false)");
            return new ImageViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_development_stages_date, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(pare…ages_date, parent, false)");
        return new TitleViewHolder(inflate2);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder.getItemViewType() != 0) {
            ImageViewHolder imageViewHolder = (ImageViewHolder) viewHolder;
            imageViewHolder.itemView.setOnClickListener(new DevelopmentStagesPhotoAdapter$onBindViewHolder$1(this, i));
            imageViewHolder.bind(this.data.get(i));
            return;
        }
        ((TitleViewHolder) viewHolder).bind(this.data.get(i));
    }

    public int getItemViewType(int i) {
        return this.data.get(i).getType();
    }

    public final void setItems(List<StagePhotoItem> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(StagePhotoItem stagePhotoItem) {
        Intrinsics.checkNotNullParameter(stagePhotoItem, "item");
        this.data.add(stagePhotoItem);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DevelopmentStagesPhotoAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/StagePhotoItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter$TitleViewHolder */
    /* compiled from: DevelopmentStagesPhotoAdapter.kt */
    public static final class TitleViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(StagePhotoItem stagePhotoItem) {
            Intrinsics.checkNotNullParameter(stagePhotoItem, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvGroupTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvGroupTitle");
            textView.setText(stagePhotoItem.getTitle());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DevelopmentStagesPhotoAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/data/realm/StagePhotoItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter$ImageViewHolder */
    /* compiled from: DevelopmentStagesPhotoAdapter.kt */
    public static final class ImageViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(StagePhotoItem stagePhotoItem) {
            Intrinsics.checkNotNullParameter(stagePhotoItem, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RequestManager with = Glide.with((View) (ImageView) view.findViewById(C5619R.C5622id.ivPhoto));
            ImageData image = stagePhotoItem.getImage();
            String thumbnail = image != null ? image.getThumbnail() : null;
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((RequestBuilder) ((RequestBuilder) ((RequestBuilder) with.load(thumbnail).diskCacheStrategy(DiskCacheStrategy.ALL)).override(200, 200)).centerCrop()).into((ImageView) view2.findViewById(C5619R.C5622id.ivPhoto));
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/development/DevelopmentStagesPhotoAdapter$Companion;", "", "()V", "GROUP_TITLE", "", "PHOTO_ITEM", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.development.DevelopmentStagesPhotoAdapter$Companion */
    /* compiled from: DevelopmentStagesPhotoAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
