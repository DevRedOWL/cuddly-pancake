package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\r"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profile/subAccounts/NewSubAccountFragment$handleStatus$2", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "pos", "", "id", "", "onNothingSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$handleStatus$2 */
/* compiled from: NewSubAccountFragment.kt */
public final class NewSubAccountFragment$handleStatus$2 implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ArrayList $selectValueList;
    final /* synthetic */ NewSubAccountFragment this$0;

    public void onNothingSelected(AdapterView<?> adapterView) {
        Intrinsics.checkNotNullParameter(adapterView, CategoryItem.Fields.parent);
    }

    NewSubAccountFragment$handleStatus$2(NewSubAccountFragment newSubAccountFragment, ArrayList arrayList) {
        this.this$0 = newSubAccountFragment;
        this.$selectValueList = arrayList;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(adapterView, CategoryItem.Fields.parent);
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName));
        NewSubAccountFragment newSubAccountFragment = this.this$0;
        Object obj = this.$selectValueList.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "selectValueList[pos]");
        newSubAccountFragment.selectedValue = (SelectValue) obj;
    }
}
