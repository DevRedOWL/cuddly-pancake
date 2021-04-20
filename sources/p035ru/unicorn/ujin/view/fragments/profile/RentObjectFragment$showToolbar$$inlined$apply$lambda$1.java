package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/profile/RentObjectFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: RentObjectFragment.kt */
final class RentObjectFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ RentObjectFragment this$0;

    RentObjectFragment$showToolbar$$inlined$apply$lambda$1(RentObjectFragment rentObjectFragment) {
        this.this$0 = rentObjectFragment;
    }

    public final void onClick(View view) {
        Object obj;
        String str;
        RentObjectFragment rentObjectFragment = this.this$0;
        RecyclerView recyclerView = (RecyclerView) rentObjectFragment._$_findCachedViewById(C5619R.C5622id.rvDynamic);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvDynamic");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            String str2 = ((DataEntryAdapter) adapter).getParamsMap(0).get(RentObjectFragment.DATE_PICKER_FIELD);
            if (str2 == null) {
                str2 = "";
            }
            rentObjectFragment.startDate = str2;
            RentObjectFragment rentObjectFragment2 = this.this$0;
            RecyclerView recyclerView2 = (RecyclerView) rentObjectFragment2._$_findCachedViewById(C5619R.C5622id.rvDynamic);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvDynamic");
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                int i = 1;
                String str3 = ((DataEntryAdapter) adapter2).getParamsMap(1).get(RentObjectFragment.SPINNER_FIELD);
                if (str3 != null) {
                    i = Integer.parseInt(str3);
                }
                rentObjectFragment2.monthValue = i;
                RentObjectFragment rentObjectFragment3 = this.this$0;
                Iterator it = rentObjectFragment3.monthList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((SelectValue) obj).getValue(), (Object) String.valueOf(this.this$0.monthValue))) {
                        break;
                    }
                }
                SelectValue selectValue = (SelectValue) obj;
                if (selectValue == null || (str = selectValue.getText()) == null) {
                    str = "1 месяц";
                }
                rentObjectFragment3.monthText = str;
                this.this$0.nextFragment(RentObjectListFragment.Companion.newInstance(this.this$0.startDate, this.this$0.monthValue), false, BaseActivity.FRAGMENT_RENT_OBJECT_LIST);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
    }
}
