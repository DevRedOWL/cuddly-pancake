package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$1 */
/* compiled from: AnotherPassDetailFragment.kt */
final class AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ AnotherPassDetailFragment this$0;

    AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$1(AnotherPassDetailFragment anotherPassDetailFragment) {
        this.this$0 = anotherPassDetailFragment;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        IdentityDocument identityDocument;
        String issuedDate;
        IdentityDocument identityDocument2;
        IdentityDocument identityDocument3;
        String str4;
        String str5;
        Vehicle vehicle;
        Vehicle vehicle2;
        String id;
        this.this$0.getPassViewModel().initPassBody();
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setStrategy(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getStrategy().getSlug());
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setSurname(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_surname());
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setName(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_name());
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setPatronymic(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_patronymic());
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setPhone(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_phone());
        CreateAnotherPassRequestBody createAnotherPassBody = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        String user_email = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_email();
        String str6 = "";
        if (user_email == null) {
            user_email = str6;
        }
        createAnotherPassBody.setEmail(user_email);
        CreateAnotherPassRequestBody createAnotherPassBody2 = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        String user_company_name = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_company_name();
        if (user_company_name == null) {
            user_company_name = str6;
        }
        createAnotherPassBody2.setCompany(user_company_name);
        CreateAnotherPassRequestBody createAnotherPassBody3 = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        RentCompany enterprise = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getEnterprise();
        if (enterprise == null || (id = enterprise.getId()) == null || (str = id.toString()) == null) {
            str = str6;
        }
        createAnotherPassBody3.setEnterpriseId(str);
        this.this$0.getPassViewModel().getCreateAnotherPassBody().setComment(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getComment());
        CreateAnotherPassRequestBody createAnotherPassBody4 = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        String persons_count = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getPersons_count();
        if (persons_count == null) {
            persons_count = str6;
        }
        createAnotherPassBody4.setPersonsCount(persons_count);
        CreateAnotherPassRequestBody createAnotherPassBody5 = this.this$0.getPassViewModel().getCreateAnotherPassBody();
        String user_birthday = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getUser_birthday();
        if (user_birthday == null) {
            user_birthday = str6;
        }
        createAnotherPassBody5.setBirthday(user_birthday);
        Collection vehicles = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getVehicles();
        boolean z = true;
        if (!(vehicles == null || vehicles.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            List<Vehicle> vehicles2 = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getVehicles();
            if (vehicles2 == null || (vehicle2 = vehicles2.get(0)) == null || (str4 = vehicle2.getBrand()) == null) {
                str4 = str6;
            }
            List<Vehicle> vehicles3 = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getVehicles();
            if (vehicles3 == null || (vehicle = vehicles3.get(0)) == null || (str5 = vehicle.getId_number()) == null) {
                str5 = str6;
            }
            arrayList.add(new VehicleData(str4, str5));
            this.this$0.getPassViewModel().getCreateAnotherPassBody().setVehicles(arrayList);
        }
        Collection identity_documents = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getIdentity_documents();
        if (identity_documents != null && !identity_documents.isEmpty()) {
            z = false;
        }
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            List<IdentityDocument> identity_documents2 = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getIdentity_documents();
            if (identity_documents2 == null || (identityDocument3 = identity_documents2.get(0)) == null || (str2 = identityDocument3.getType()) == null) {
                str2 = str6;
            }
            List<IdentityDocument> identity_documents3 = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getIdentity_documents();
            if (identity_documents3 == null || (identityDocument2 = identity_documents3.get(0)) == null || (str3 = identityDocument2.getNumber()) == null) {
                str3 = str6;
            }
            List<IdentityDocument> identity_documents4 = AnotherPassDetailFragment.access$getPasse$p(this.this$0).getIdentity_documents();
            if (!(identity_documents4 == null || (identityDocument = identity_documents4.get(0)) == null || (issuedDate = identityDocument.getIssuedDate()) == null)) {
                str6 = issuedDate;
            }
            arrayList2.add(new IdentityDocument(str2, str3, str6));
            this.this$0.getPassViewModel().getCreateAnotherPassBody().setIdentityDocuments(arrayList2);
        }
        this.this$0.nextFragment(new AnotherPassNewFragment(), false, BaseAnotherPassFragment.FRAGMENT_ANOTHER_PASS_NEW);
    }
}
