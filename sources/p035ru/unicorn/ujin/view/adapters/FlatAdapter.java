package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002()B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u001e\u0010$\u001a\u00020\u001d2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0016\u0010&\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0005R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006*"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/FlatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/FlatAdapter$ViewHolder;", "data", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/Flat;", "Lkotlin/collections/ArrayList;", "viewModel", "Lru/unicorn/ujin/viewModel/RealmViewModel;", "onFlatSelectedListener", "Lru/unicorn/ujin/view/adapters/FlatAdapter$OnFlatSelectedListener;", "(Ljava/util/ArrayList;Lru/unicorn/ujin/viewModel/RealmViewModel;Lru/unicorn/ujin/view/adapters/FlatAdapter$OnFlatSelectedListener;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getOnFlatSelectedListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/adapters/FlatAdapter$OnFlatSelectedListener;", "setOnFlatSelectedListener$app_kortrosRelease", "(Lru/unicorn/ujin/view/adapters/FlatAdapter$OnFlatSelectedListener;)V", "getViewModel", "()Lru/unicorn/ujin/viewModel/RealmViewModel;", "setViewModel", "(Lru/unicorn/ujin/viewModel/RealmViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "updateItem", "item", "OnFlatSelectedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.FlatAdapter */
/* compiled from: FlatAdapter.kt */
public final class FlatAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<Flat> data;
    private OnFlatSelectedListener onFlatSelectedListener;
    private RealmViewModel viewModel;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/FlatAdapter$OnFlatSelectedListener;", "", "onFlatSelected", "", "flatId", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.FlatAdapter$OnFlatSelectedListener */
    /* compiled from: FlatAdapter.kt */
    public interface OnFlatSelectedListener {
        void onFlatSelected(String str, int i);
    }

    public final ArrayList<Flat> getData() {
        return this.data;
    }

    public final OnFlatSelectedListener getOnFlatSelectedListener$app_kortrosRelease() {
        return this.onFlatSelectedListener;
    }

    public final RealmViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setData(ArrayList<Flat> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setOnFlatSelectedListener$app_kortrosRelease(OnFlatSelectedListener onFlatSelectedListener2) {
        Intrinsics.checkNotNullParameter(onFlatSelectedListener2, "<set-?>");
        this.onFlatSelectedListener = onFlatSelectedListener2;
    }

    public final void setViewModel(RealmViewModel realmViewModel) {
        Intrinsics.checkNotNullParameter(realmViewModel, "<set-?>");
        this.viewModel = realmViewModel;
    }

    public FlatAdapter(ArrayList<Flat> arrayList, RealmViewModel realmViewModel, OnFlatSelectedListener onFlatSelectedListener2) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        Intrinsics.checkNotNullParameter(realmViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onFlatSelectedListener2, "onFlatSelectedListener");
        this.data = arrayList;
        this.viewModel = realmViewModel;
        this.onFlatSelectedListener = onFlatSelectedListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.adapter_flats, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…ter_flats, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public final void setItems(ArrayList<Flat> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, FirebaseAnalytics.Param.ITEMS);
        this.data = arrayList;
        notifyDataSetChanged();
    }

    public final void updateItem(int i, Flat flat) {
        Intrinsics.checkNotNullParameter(flat, "item");
        this.data.set(i, flat);
        notifyItemChanged(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/FlatAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/FlatAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.FlatAdapter$ViewHolder */
    /* compiled from: FlatAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ FlatAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(FlatAdapter flatAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = flatAdapter;
        }

        public final void bind(int i) {
            String str;
            Flat flat = this.this$0.getData().get(i);
            Intrinsics.checkNotNullExpressionValue(flat, "data[position]");
            Flat flat2 = flat;
            this.itemView.setOnClickListener(new FlatAdapter$ViewHolder$bind$1(this, flat2, i));
            if (Intrinsics.areEqual((Object) flat2.getRooms(), (Object) "0")) {
                str = "студия";
            } else {
                str = flat2.getRooms() + " ком.";
            }
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvInfo);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvInfo");
            textView.setText(str + " • " + flat2.getSquare() + " м² • " + "этаж " + flat2.getFloor() + "/" + flat2.getFloorTotal());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvFlatInfo);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvFlatInfo");
            textView2.setText(flat2.getDescriptionSmall());
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(flat2.getPrice().longValue()));
            int length = stringBuffer.length();
            if (length > 3) {
                stringBuffer.insert(length - 3, " ");
            }
            if (length > 6) {
                stringBuffer.insert(length - 6, " ");
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvPrice);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvPrice");
            textView3.setText(stringBuffer + " ₽");
            String priceOld = flat2.getPriceOld();
            if (priceOld != null) {
                if (priceOld.length() > 0) {
                    StringBuffer stringBuffer2 = new StringBuffer(priceOld);
                    int length2 = stringBuffer2.length();
                    if (length2 > 3) {
                        stringBuffer2.insert(length2 - 3, " ");
                    }
                    if (length2 > 6) {
                        stringBuffer2.insert(length2 - 6, " ");
                    }
                    View view4 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                    TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvPriceOld);
                    textView4.setText(stringBuffer2 + " ₽");
                    Intrinsics.checkNotNullExpressionValue(textView4, "this");
                    textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                }
            }
            if (Intrinsics.areEqual((Object) flat2.getAction(), (Object) true)) {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view5.findViewById(C5619R.C5622id.ivAction);
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.ivAction");
                appCompatImageView.setVisibility(0);
            }
            Integer favorites = flat2.getFavorites();
            if (favorites != null && favorites.intValue() == 0) {
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                ((ImageView) view6.findViewById(C5619R.C5622id.ivFlatHeart)).setImageResource(R.drawable.icon_favourite_off);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                ImageView imageView = (ImageView) view7.findViewById(C5619R.C5622id.ivFlatHeart);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivFlatHeart");
                imageView.setVisibility(4);
            } else {
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                ((ImageView) view8.findViewById(C5619R.C5622id.ivFlatHeart)).setImageResource(R.drawable.icon_favourite_on);
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                ImageView imageView2 = (ImageView) view9.findViewById(C5619R.C5622id.ivFlatHeart);
                Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.ivFlatHeart");
                imageView2.setVisibility(0);
            }
            String imgSmall = flat2.getImgSmall();
            Intrinsics.checkNotNullExpressionValue(imgSmall, "objFlat.imgSmall");
            if (StringsKt.indexOf$default((CharSequence) imgSmall, "clear.png", 0, false, 6, (Object) null) > 0) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                ((ImageView) view10.findViewById(C5619R.C5622id.ivFlatPlan)).setImageResource(R.drawable.empty_image);
                return;
            }
            if (flat2.getImgSmallBytes() != null) {
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(flat2.getImgSmallBytes(), 0, flat2.getImgSmallBytes().length);
                    View view11 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                    ((ImageView) view11.findViewById(C5619R.C5622id.ivFlatPlan)).setImageBitmap(decodeByteArray);
                } catch (Exception unused) {
                }
            }
            if (flat2.getImgSmallBytes() != null) {
                View view12 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                GlideRequest load = GlideApp.with((View) (ImageView) view12.findViewById(C5619R.C5622id.ivFlatPlan)).load(flat2.getImgSmallBytes());
                View view13 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view13, "itemView");
                load.into((ImageView) view13.findViewById(C5619R.C5622id.ivFlatPlan));
            }
            View view14 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "itemView");
            ImageView imageView3 = (ImageView) view14.findViewById(C5619R.C5622id.ivFlatPlan);
            Intrinsics.checkNotNullExpressionValue(imageView3, "itemView.ivFlatPlan");
            int dpToPx = AppUtils.dpToPx(imageView3.getContext(), 100);
            View view15 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view15, "itemView");
            GlideRequest listener = GlideApp.with((View) (ImageView) view15.findViewById(C5619R.C5622id.ivFlatPlan)).load(flat2.getImgSmall()).override(dpToPx, dpToPx).listener((RequestListener) new FlatAdapter$ViewHolder$bind$3(this, flat2));
            View view16 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view16, "itemView");
            Intrinsics.checkNotNullExpressionValue(listener.into((ImageView) view16.findViewById(C5619R.C5622id.ivFlatPlan)), "GlideApp.with(itemView.i…into(itemView.ivFlatPlan)");
        }
    }
}
