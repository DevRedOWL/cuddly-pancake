package p035ru.unicorn.ujin.market.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyResponseData;
import p035ru.unicorn.ujin.data.realm.ErrorData;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getCompanyDetails$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getCompanyDetails$1<T> implements Consumer<CompanyResponse> {
    final /* synthetic */ MarketRemoteRepository this$0;

    MarketRemoteRepository$getCompanyDetails$1(MarketRemoteRepository marketRemoteRepository) {
        this.this$0 = marketRemoteRepository;
    }

    public final void accept(CompanyResponse companyResponse) {
        String str;
        List list;
        RealmList<Company> companies;
        CompanyResponseData data;
        RealmList<Company> companies2;
        if (!(companyResponse.getService().getError() != null || (data = companyResponse.getData()) == null || (companies2 = data.getCompanies()) == null)) {
            Iterator<Company> it = companies2.iterator();
            while (it.hasNext()) {
                this.this$0.getRealm().executeTransaction(new MarketRemoteRepository$getCompanyDetails$1$1$1(it.next()));
            }
        }
        PublishSubject<CompanyEvent> companySubject = this.this$0.getCompanySubject();
        boolean z = companyResponse.getService().getError() == null;
        ErrorData error = companyResponse.getService().getError();
        if (error == null || (str = error.getMessage()) == null) {
            str = "";
        }
        CompanyResponseData data2 = companyResponse.getData();
        if (data2 == null || (companies = data2.getCompanies()) == null) {
            list = new ArrayList();
        } else {
            list = companies;
        }
        companySubject.onNext(new CompanyEvent(z, str, list));
    }
}
