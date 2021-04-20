package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFifthFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFifthFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: AnotherPathFifthFragment.kt */
final class AnotherPassFifthFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ AnotherPassFifthFragment this$0;

    AnotherPassFifthFragment$showToolbar$$inlined$apply$lambda$1(AnotherPassFifthFragment anotherPassFifthFragment) {
        this.this$0 = anotherPassFifthFragment;
    }

    public final void onClick(View view) {
        String str;
        Object obj;
        String str2 = "";
        if (!this.this$0.companyList.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.rvDynamic);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvDynamic");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                str = ((DataEntryAdapter) adapter).getParamsMap(0).get("company");
                if (str == null) {
                    str = str2;
                }
                RecyclerView recyclerView2 = (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.rvDynamic);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvDynamic");
                RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    String str3 = ((DataEntryAdapter) adapter2).getParamsMap(1).get(AnotherPassFifthFragment.OFFICE_FIELD);
                    if (str3 != null) {
                        str2 = str3;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
            }
        } else {
            str = str2;
        }
        if (this.this$0.companyList.isEmpty()) {
            this.this$0.showMessage("Вы можете создать гостевой пропуск только при наличии компании");
        } else if (StringsKt.isBlank(str2) || StringsKt.isBlank(str)) {
            this.this$0.showMessage("Укажите компанию и офис");
        } else {
            CreateAnotherPassRequestBody createAnotherPassBody = this.this$0.getPassViewModel().getCreateAnotherPassBody();
            createAnotherPassBody.setEnterpriseId(str);
            createAnotherPassBody.setComment(str2);
            Iterator it = this.this$0.companyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((SelectValue) obj).getValue(), (Object) str)) {
                    break;
                }
            }
            SelectValue selectValue = (SelectValue) obj;
            if (selectValue != null) {
                String text = selectValue.getText();
            }
            this.this$0.getPassViewModel().getCreateAnotherPassBody();
        }
    }
}
