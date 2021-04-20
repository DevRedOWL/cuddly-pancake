package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.UpdateFavouriteResponse;
import p035ru.unicorn.ujin.data.realm.Flat;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/repository/RealmRepository$requestUpdateFlatFavourite$2$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateFlatFavourite$2$$special$$inlined$run$lambda$1 */
/* compiled from: RealmRepository.kt */
final class C5749x1626e96e implements Realm.Transaction {
    final /* synthetic */ UpdateFavouriteResponse $response$inlined;
    final /* synthetic */ RealmRepository$requestUpdateFlatFavourite$2 this$0;

    C5749x1626e96e(RealmRepository$requestUpdateFlatFavourite$2 realmRepository$requestUpdateFlatFavourite$2, UpdateFavouriteResponse updateFavouriteResponse) {
        this.this$0 = realmRepository$requestUpdateFlatFavourite$2;
        this.$response$inlined = updateFavouriteResponse;
    }

    public final void execute(Realm realm) {
        Flat flat = (Flat) realm.where(Flat.class).equalTo(Flat.Fields.f6655id, this.this$0.$flatId).findFirst();
        if (flat != null) {
            flat.setFavorites(Integer.valueOf(this.this$0.$favouriteFlag ? 1 : 0));
        }
        realm.insertOrUpdate((RealmModel) flat);
    }
}
