package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$deleteSip$1 */
/* compiled from: ProfileLocalRepository.kt */
final class ProfileLocalRepository$deleteSip$1 implements Realm.Transaction {
    public static final ProfileLocalRepository$deleteSip$1 INSTANCE = new ProfileLocalRepository$deleteSip$1();

    ProfileLocalRepository$deleteSip$1() {
    }

    public final void execute(Realm realm) {
        realm.delete(SipParametrs.class);
    }
}
