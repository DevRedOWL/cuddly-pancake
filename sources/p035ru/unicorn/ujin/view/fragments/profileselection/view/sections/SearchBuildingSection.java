package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001,B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ.\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0014J\u0014\u0010!\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u0004\u0018\u00010\u0002J\u0012\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010#H\u0016J\u0014\u0010(\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fJ\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0002H\u0002R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "labelId", "", "hintId", "(II)V", "getHintId", "()I", "getLabelId", "onTextChanged", "Lio/reactivex/subjects/PublishSubject;", "", "getOnTextChanged", "()Lio/reactivex/subjects/PublishSubject;", "onValueChanged", "getOnValueChanged", "searchAutoCompleteAdapter", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter;", "getSearchAutoCompleteAdapter", "()Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter;", "setSearchAutoCompleteAdapter", "(Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter;)V", "selectedValue", "bindViewHolder", "", "vh", "data", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "getSelectedValue", "onClick", "v", "setSearchData", "resultList", "setSelectedValue", "value", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection */
/* compiled from: SearchBuildingSection.kt */
public final class SearchBuildingSection extends SingleSection<SearchBuildingDTO, ViewHolder> implements View.OnClickListener {
    private final int hintId;
    private final int labelId;
    private final PublishSubject<String> onTextChanged;
    private final PublishSubject<SearchBuildingDTO> onValueChanged;
    public SearchAutoCompleteAdapter searchAutoCompleteAdapter;
    /* access modifiers changed from: private */
    public SearchBuildingDTO selectedValue;

    public int getLayoutId() {
        return R.layout.item_search_building;
    }

    public void onClick(View view) {
    }

    public final int getHintId() {
        return this.hintId;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    public SearchBuildingSection(int i, int i2) {
        this.labelId = i;
        this.hintId = i2;
        PublishSubject<SearchBuildingDTO> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.onValueChanged = create;
        PublishSubject<String> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "PublishSubject.create()");
        this.onTextChanged = create2;
    }

    public final PublishSubject<SearchBuildingDTO> getOnValueChanged() {
        return this.onValueChanged;
    }

    public final PublishSubject<String> getOnTextChanged() {
        return this.onTextChanged;
    }

    public final SearchAutoCompleteAdapter getSearchAutoCompleteAdapter() {
        SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = this.searchAutoCompleteAdapter;
        if (searchAutoCompleteAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchAutoCompleteAdapter");
        }
        return searchAutoCompleteAdapter2;
    }

    public final void setSearchAutoCompleteAdapter(SearchAutoCompleteAdapter searchAutoCompleteAdapter2) {
        Intrinsics.checkNotNullParameter(searchAutoCompleteAdapter2, "<set-?>");
        this.searchAutoCompleteAdapter = searchAutoCompleteAdapter2;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, SearchBuildingDTO searchBuildingDTO, List<Object> list) {
        Intrinsics.checkNotNullParameter(searchBuildingDTO, "data");
        if (viewHolder != null) {
            viewHolder.bind(searchBuildingDTO);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "editTextWatcher", "Landroid/text/TextWatcher;", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "showSearchVisibility", "isShowing", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder */
    /* compiled from: SearchBuildingSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */
        public TextWatcher editTextWatcher = new SearchBuildingSection$ViewHolder$editTextWatcher$1(this);
        final /* synthetic */ SearchBuildingSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SearchBuildingSection searchBuildingSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = searchBuildingSection;
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }

        public final void bind(SearchBuildingDTO searchBuildingDTO) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.labelSection);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.labelSection");
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            textView.setText(view2.getResources().getString(this.this$0.getLabelId()));
            this.this$0.setSearchAutoCompleteAdapter(new SearchAutoCompleteAdapter(new ArrayList(), new SearchBuildingSection$ViewHolder$bind$1(this)));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ((MaterialAutoCompleteTextView) view3.findViewById(C5619R.C5622id.tvSearch)).removeTextChangedListener(this.editTextWatcher);
            String str = null;
            showSearchVisibility((searchBuildingDTO != null ? searchBuildingDTO.getBuilding() : null) == null);
            if ((searchBuildingDTO != null ? searchBuildingDTO.getBuilding() : null) != null) {
                this.this$0.setSelectedValue(searchBuildingDTO);
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) view4.findViewById(C5619R.C5622id.tvSearch);
                BusinessBuildings building = searchBuildingDTO.getBuilding();
                if (building != null) {
                    str = building.getTitle();
                }
                materialAutoCompleteTextView.setText(str, false);
            } else {
                this.this$0.setSelectedValue(new SearchBuildingDTO((SearchComplex) null, (BusinessBuildings) null, 3, (DefaultConstructorMarker) null));
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                ((MaterialAutoCompleteTextView) view5.findViewById(C5619R.C5622id.tvSearch)).setText("", false);
                this.this$0.getSearchAutoCompleteAdapter().setItems(new ArrayList());
            }
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) view6.findViewById(C5619R.C5622id.tvSearch);
            View view7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
            materialAutoCompleteTextView2.setHint(view7.getResources().getString(this.this$0.getHintId()));
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            materialAutoCompleteTextView2.setDropDownBackgroundDrawable(view8.getResources().getDrawable(R.drawable.autocomplete_dropdown));
            materialAutoCompleteTextView2.setAdapter(this.this$0.getSearchAutoCompleteAdapter());
            materialAutoCompleteTextView2.addTextChangedListener(this.editTextWatcher);
            materialAutoCompleteTextView2.setOnClickListener(new SearchBuildingSection$ViewHolder$bind$$inlined$apply$lambda$1(materialAutoCompleteTextView2, this));
            View view9 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view9, "itemView");
            ((ImageView) view9.findViewById(C5619R.C5622id.ivClose)).setOnClickListener(new SearchBuildingSection$ViewHolder$bind$3(this));
            View view10 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view10, "itemView");
            View view11 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "itemView");
            Context context = view11.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            ((ImageView) view10.findViewById(C5619R.C5622id.ivSearch)).setColorFilter(context.getResources().getColor(R.color.tutorial_text_color));
            View view12 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view12, "itemView");
            View view13 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view13, "itemView");
            Context context2 = view13.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            ((ImageView) view12.findViewById(C5619R.C5622id.ivClose)).setColorFilter(context2.getResources().getColor(R.color.tutorial_text_color));
        }

        /* access modifiers changed from: private */
        public final void showSearchVisibility(boolean z) {
            if (z) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.ivClose);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivClose");
                imageView.setVisibility(4);
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                ImageView imageView2 = (ImageView) view2.findViewById(C5619R.C5622id.ivSearch);
                Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.ivSearch");
                imageView2.setVisibility(0);
                return;
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ImageView imageView3 = (ImageView) view3.findViewById(C5619R.C5622id.ivSearch);
            Intrinsics.checkNotNullExpressionValue(imageView3, "itemView.ivSearch");
            imageView3.setVisibility(4);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ImageView imageView4 = (ImageView) view4.findViewById(C5619R.C5622id.ivClose);
            Intrinsics.checkNotNullExpressionValue(imageView4, "itemView.ivClose");
            imageView4.setVisibility(0);
        }
    }

    public final void setSearchData(List<SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, "resultList");
        SearchAutoCompleteAdapter searchAutoCompleteAdapter2 = this.searchAutoCompleteAdapter;
        if (searchAutoCompleteAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchAutoCompleteAdapter");
        }
        searchAutoCompleteAdapter2.setItems(list);
    }

    public final SearchBuildingDTO getSelectedValue() {
        return this.selectedValue;
    }

    /* access modifiers changed from: private */
    public final void setSelectedValue(SearchBuildingDTO searchBuildingDTO) {
        this.selectedValue = searchBuildingDTO;
        this.onValueChanged.onNext(searchBuildingDTO);
    }
}
