package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$updateComplexInfoMortrageImage$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$updateComplexInfoMortrageImage$1 implements Realm.Transaction {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ String $complexId;
    final /* synthetic */ int $position;
    final /* synthetic */ RealmRepository this$0;

    RealmRepository$updateComplexInfoMortrageImage$1(RealmRepository realmRepository, String str, byte[] bArr, int i) {
        this.this$0 = realmRepository;
        this.$complexId = str;
        this.$bytes = bArr;
        this.$position = i;
    }

    public final void execute(Realm realm) {
        RealmList<Mortrage> mortrageList;
        Mortrage mortrage;
        ComplexInfo complexInfoById = this.this$0.getComplexInfoById(this.$complexId);
        if (!(complexInfoById == null || (mortrageList = complexInfoById.getMortrageList()) == null || (mortrage = mortrageList.get(this.$position)) == null)) {
            mortrage.setImgLogoBytes(this.$bytes);
        }
        Intrinsics.checkNotNull(complexInfoById);
        realm.insertOrUpdate((RealmModel) complexInfoById);
    }
}
