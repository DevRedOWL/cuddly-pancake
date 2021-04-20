package p035ru.unicorn.fragments.development;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Complex;
import p046io.realm.Realm;
import p046io.realm.RealmResults;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/fragments/development/DeveloperLocalRepository$getComplexList$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperLocalRepository$getComplexList$$inlined$apply$lambda$1 */
/* compiled from: DeveloperLocalRepository.kt */
final class DeveloperLocalRepository$getComplexList$$inlined$apply$lambda$1 implements Realm.Transaction {
    final /* synthetic */ String $cityId$inlined;
    final /* synthetic */ ArrayList $this_apply;
    final /* synthetic */ DeveloperLocalRepository this$0;

    DeveloperLocalRepository$getComplexList$$inlined$apply$lambda$1(ArrayList arrayList, DeveloperLocalRepository developerLocalRepository, String str) {
        this.$this_apply = arrayList;
        this.this$0 = developerLocalRepository;
        this.$cityId$inlined = str;
    }

    public final void execute(Realm realm) {
        RealmResults<E> findAll = realm.where(Complex.class).equalTo(Complex.Fields.cityId, this.$cityId$inlined).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "it.where(Complex::class.…cityId, cityId).findAll()");
        Iterable<Complex> iterable = findAll;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Complex add : iterable) {
            arrayList.add(Boolean.valueOf(this.$this_apply.add(add)));
        }
        List list = (List) arrayList;
    }
}
