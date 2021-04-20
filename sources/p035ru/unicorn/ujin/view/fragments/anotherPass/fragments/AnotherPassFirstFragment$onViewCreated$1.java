package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.RadioSectionAdapter;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFirstFragment$onViewCreated$1", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$OnSectionSelectedListener;", "onSectionSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFirstFragment$onViewCreated$1 */
/* compiled from: AnotherPassFirstFragment.kt */
public final class AnotherPassFirstFragment$onViewCreated$1 implements RadioSectionAdapter.OnSectionSelectedListener {
    final /* synthetic */ AnotherPassFirstFragment this$0;

    AnotherPassFirstFragment$onViewCreated$1(AnotherPassFirstFragment anotherPassFirstFragment) {
        this.this$0 = anotherPassFirstFragment;
    }

    public void onSectionSelected(int i) {
        String str;
        String str2;
        AnotherPassFirstFragment anotherPassFirstFragment = this.this$0;
        anotherPassFirstFragment.selectValue = AnotherPassFirstFragment.access$getRadioSectionAdapter$p(anotherPassFirstFragment).getItem(i);
        CreateAnotherPassRequestBody createAnotherPassBody = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        SelectValue access$getSelectValue$p = this.this$0.selectValue;
        if (access$getSelectValue$p == null || (str = access$getSelectValue$p.getValue()) == null) {
            str = "";
        }
        createAnotherPassBody.setStrategy(str);
        SelectValue access$getSelectValue$p2 = this.this$0.selectValue;
        if (access$getSelectValue$p2 == null || (str2 = access$getSelectValue$p2.getValue()) == null) {
            str2 = "";
        }
        int hashCode = str2.hashCode();
        if (hashCode != -1320264141) {
            if (hashCode == 1984986705 && str2.equals("temporary")) {
                TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvMessage);
                Intrinsics.checkNotNullExpressionValue(textView, "tvMessage");
                textView.setText(this.this$0.getResources().getString(R.string.anotherPassTypeMessage));
                return;
            }
        } else if (str2.equals("onetime")) {
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvMessage);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvMessage");
            textView2.setText(this.this$0.getResources().getString(R.string.anotherPassOnetimeTypeMessage));
            return;
        }
        TextView textView3 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvMessage);
        Intrinsics.checkNotNullExpressionValue(textView3, "tvMessage");
        textView3.setText(this.this$0.getResources().getString(R.string.anotherPassTypeMessage));
    }
}
