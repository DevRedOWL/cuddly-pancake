package p035ru.unicorn.ujin.view.fragments.searchFilter;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/searchFilter/SearchFilterFragment$noCopyPasteCallback$1", "Landroid/view/ActionMode$Callback;", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onPrepareActionMode", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$noCopyPasteCallback$1 */
/* compiled from: SearchFilterFragment.kt */
public final class SearchFilterFragment$noCopyPasteCallback$1 implements ActionMode.Callback {
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menuItem, "item");
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Intrinsics.checkNotNullParameter(actionMode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    SearchFilterFragment$noCopyPasteCallback$1() {
    }
}
