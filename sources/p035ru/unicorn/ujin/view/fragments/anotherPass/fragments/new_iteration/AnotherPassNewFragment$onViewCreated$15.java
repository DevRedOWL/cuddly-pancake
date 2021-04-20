package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.databinding.ItemFieldSpinnerBinding;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "companyList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$15 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$15<T> implements Observer<List<RentCompany>> {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$15(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void onChanged(List<RentCompany> list) {
        String enterpriseId;
        Integer num;
        Object obj;
        if (list == null) {
            return;
        }
        if (!ProfileLocalRepository.Companion.getInstance().getUser().isCurrentCommerce()) {
            CreateAnotherPassRequestBody createAnotherPassRequestBody = this.$viewModell.getCreateAnotherPassBodyObservable().get();
            if (createAnotherPassRequestBody != null) {
                createAnotherPassRequestBody.setEnterpriseId(list.get(0).getId());
            }
            View _$_findCachedViewById = this.this$0._$_findCachedViewById(C5619R.C5622id.company);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "company");
            _$_findCachedViewById.setVisibility(8);
            View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(C5619R.C5622id.title5);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "title5");
            _$_findCachedViewById2.setVisibility(8);
            View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(C5619R.C5622id.data16);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "data16");
            _$_findCachedViewById3.setVisibility(8);
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (RentCompany next : list) {
                String str = next.getId().toString();
                String title = next.getTitle();
                Intrinsics.checkNotNullExpressionValue(title, "item.title");
                arrayList.add(new SelectValue(str, title));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = arrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "selectValueList[i]");
                arrayList2.add(((SelectValue) obj2).getText());
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.this$0.getBaseActivity(), R.layout.field_spinner_view, arrayList2);
            arrayAdapter.setDropDownViewResource(17367058);
            Spinner spinner = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company.spinner;
            Intrinsics.checkNotNullExpressionValue(spinner, "viewDataBinding.company.spinner");
            spinner.setAdapter(arrayAdapter);
            CreateAnotherPassRequestBody createAnotherPassRequestBody2 = this.$viewModell.getCreateAnotherPassBodyObservable().get();
            if (createAnotherPassRequestBody2 == null || (enterpriseId = createAnotherPassRequestBody2.getEnterpriseId()) == null || !(!StringsKt.isBlank(enterpriseId))) {
                ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company.spinner.setSelection(0);
                ItemFieldSpinnerBinding itemFieldSpinnerBinding = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company;
                Intrinsics.checkNotNullExpressionValue(itemFieldSpinnerBinding, "viewDataBinding.company");
                itemFieldSpinnerBinding.setValue(((SelectValue) arrayList.get(0)).getValue());
                if (createAnotherPassRequestBody2 != null) {
                    createAnotherPassRequestBody2.setEnterpriseId(((SelectValue) arrayList.get(0)).getValue());
                }
            } else {
                Iterator it = CollectionsKt.withIndex(arrayList).iterator();
                while (true) {
                    num = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((SelectValue) ((IndexedValue) obj).getValue()).getValue(), (Object) createAnotherPassRequestBody2.getEnterpriseId())) {
                        break;
                    }
                }
                IndexedValue indexedValue = (IndexedValue) obj;
                if (indexedValue != null) {
                    num = Integer.valueOf(indexedValue.getIndex());
                }
                if (num == null) {
                    ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company.spinner.setSelection(0);
                    ItemFieldSpinnerBinding itemFieldSpinnerBinding2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company;
                    Intrinsics.checkNotNullExpressionValue(itemFieldSpinnerBinding2, "viewDataBinding.company");
                    itemFieldSpinnerBinding2.setValue(((SelectValue) arrayList.get(0)).getValue());
                    createAnotherPassRequestBody2.setEnterpriseId(((SelectValue) arrayList.get(0)).getValue());
                } else {
                    ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company.spinner.setSelection(num.intValue());
                    ItemFieldSpinnerBinding itemFieldSpinnerBinding3 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company;
                    Intrinsics.checkNotNullExpressionValue(itemFieldSpinnerBinding3, "viewDataBinding.company");
                    itemFieldSpinnerBinding3.setValue(((SelectValue) arrayList.get(num.intValue())).getValue());
                }
            }
            Spinner spinner2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).company.spinner;
            Intrinsics.checkNotNullExpressionValue(spinner2, "viewDataBinding.company.spinner");
            spinner2.setOnItemSelectedListener(new C5999x930bdd23(arrayList, createAnotherPassRequestBody2, this));
        }
    }
}
