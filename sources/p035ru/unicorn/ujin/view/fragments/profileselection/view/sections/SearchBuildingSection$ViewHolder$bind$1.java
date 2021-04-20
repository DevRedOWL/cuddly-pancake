package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchAutoCompleteAdapter;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection$ViewHolder$bind$1", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$OnResultClickListener;", "onResultClicked", "", "item", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder$bind$1 */
/* compiled from: SearchBuildingSection.kt */
public final class SearchBuildingSection$ViewHolder$bind$1 implements SearchAutoCompleteAdapter.OnResultClickListener {
    final /* synthetic */ SearchBuildingSection.ViewHolder this$0;

    SearchBuildingSection$ViewHolder$bind$1(SearchBuildingSection.ViewHolder viewHolder) {
        this.this$0 = viewHolder;
    }

    public void onResultClicked(SearchBuildingDTO searchBuildingDTO) {
        Intrinsics.checkNotNullParameter(searchBuildingDTO, "item");
        new Handler().postDelayed(new SearchBuildingSection$ViewHolder$bind$1$onResultClicked$1(this, searchBuildingDTO), 500);
    }
}
