package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.acceptance.AcceptanceStateResponse;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/repository/RealmRepository$getAcceptanceState$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$getAcceptanceState$1$$special$$inlined$run$lambda$1 */
/* compiled from: RealmRepository.kt */
final class C5742xa1b9cda3 implements Realm.Transaction {
    final /* synthetic */ AcceptanceStateResponse $response$inlined;
    final /* synthetic */ RealmRepository$getAcceptanceState$1 this$0;

    C5742xa1b9cda3(RealmRepository$getAcceptanceState$1 realmRepository$getAcceptanceState$1, AcceptanceStateResponse acceptanceStateResponse) {
        this.this$0 = realmRepository$getAcceptanceState$1;
        this.$response$inlined = acceptanceStateResponse;
    }

    public final void execute(Realm realm) {
        realm.delete(ApartmentState.class);
        realm.insertOrUpdate((RealmModel) this.$response$inlined.getData());
    }
}
