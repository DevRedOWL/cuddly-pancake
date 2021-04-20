package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$realm$2 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$realm$2 extends Lambda implements Function0<Realm> {
    public static final RealmRepository$realm$2 INSTANCE = new RealmRepository$realm$2();

    RealmRepository$realm$2() {
        super(0);
    }

    public final Realm invoke() {
        return Realm.getDefaultInstance();
    }
}
