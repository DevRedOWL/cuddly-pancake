package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0014\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "data", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "onResultClickListener", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "mResults", "", "getOnResultClickListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;", "setOnResultClickListener$app_kortrosRelease", "(Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;)V", "addItem", "", "item", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "view", "parent", "Landroid/view/ViewGroup;", "setItems", "items", "OnResultClickListener", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchAutoCompleteAdapter */
/* compiled from: SearchAutoCompleteAdapter.kt */
public final class SearchAutoCompleteAdapter extends BaseAdapter implements Filterable {
    private List<SearchBuildingDTO> data;
    /* access modifiers changed from: private */
    public List<? extends SearchBuildingDTO> mResults;
    private OnResultClickListener onResultClickListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;", "", "onResultClicked", "", "item", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchAutoCompleteAdapter$OnResultClickListener */
    /* compiled from: SearchAutoCompleteAdapter.kt */
    public interface OnResultClickListener {
        void onResultClicked(SearchBuildingDTO searchBuildingDTO);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public final List<SearchBuildingDTO> getData() {
        return this.data;
    }

    public final void setData(List<SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public SearchAutoCompleteAdapter(List<SearchBuildingDTO> list, OnResultClickListener onResultClickListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onResultClickListener2, "onResultClickListener");
        this.data = list;
        this.onResultClickListener = onResultClickListener2;
    }

    public final OnResultClickListener getOnResultClickListener$app_kortrosRelease() {
        return this.onResultClickListener;
    }

    public final void setOnResultClickListener$app_kortrosRelease(OnResultClickListener onResultClickListener2) {
        Intrinsics.checkNotNullParameter(onResultClickListener2, "<set-?>");
        this.onResultClickListener = onResultClickListener2;
    }

    public final void setItems(List<SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(SearchBuildingDTO searchBuildingDTO) {
        Intrinsics.checkNotNullParameter(searchBuildingDTO, "item");
        this.data.add(searchBuildingDTO);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_building_result, viewGroup, false);
        SearchBuildingDTO searchBuildingDTO = this.data.get(i);
        Intrinsics.checkNotNullExpressionValue(inflate, "itemView");
        TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
        BusinessBuildings building = searchBuildingDTO.getBuilding();
        String str = null;
        textView.setText(building != null ? building.getTitle() : null);
        TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvSubTitle);
        Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvSubTitle");
        SearchComplex complex = searchBuildingDTO.getComplex();
        if (complex != null) {
            str = complex.getTitle();
        }
        textView2.setText(str);
        inflate.setOnClickListener(new SearchAutoCompleteAdapter$getView$1(this, searchBuildingDTO));
        return inflate;
    }

    public SearchBuildingDTO getItem(int i) {
        return this.data.get(i);
    }

    public int getCount() {
        return this.data.size();
    }

    public Filter getFilter() {
        return new SearchAutoCompleteAdapter$getFilter$1(this);
    }
}
