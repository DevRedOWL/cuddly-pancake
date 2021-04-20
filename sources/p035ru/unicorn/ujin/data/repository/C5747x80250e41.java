package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.ComplexInfoResponse;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/repository/RealmRepository$requestUpdateComplexInfo$1$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateComplexInfo$1$$special$$inlined$run$lambda$1 */
/* compiled from: RealmRepository.kt */
final class C5747x80250e41 implements Realm.Transaction {
    final /* synthetic */ ComplexInfo $complexInfo;
    final /* synthetic */ ComplexInfoResponse $response$inlined;

    C5747x80250e41(ComplexInfo complexInfo, ComplexInfoResponse complexInfoResponse) {
        this.$complexInfo = complexInfo;
        this.$response$inlined = complexInfoResponse;
    }

    public final void execute(Realm realm) {
        this.$complexInfo.setId(this.$response$inlined.getData().getCompexIdData().getId());
        realm.insertOrUpdate((RealmModel) this.$complexInfo);
    }
}
