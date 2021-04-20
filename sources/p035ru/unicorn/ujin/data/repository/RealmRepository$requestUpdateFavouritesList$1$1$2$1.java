package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateFavouritesList$1$1$2$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$requestUpdateFavouritesList$1$1$2$1 implements Realm.Transaction {
    final /* synthetic */ Favourite $favourite;

    RealmRepository$requestUpdateFavouritesList$1$1$2$1(Favourite favourite) {
        this.$favourite = favourite;
    }

    public final void execute(Realm realm) {
        realm.insertOrUpdate((RealmModel) this.$favourite);
    }
}
