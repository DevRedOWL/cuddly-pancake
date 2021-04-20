package p035ru.unicorn.fragments.development;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.repository.BaseLocalRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t2\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/fragments/development/DeveloperLocalRepository;", "Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "()V", "getComplexById", "Lru/unicorn/ujin/data/realm/Complex;", "complexId", "", "getComplexList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cityId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperLocalRepository */
/* compiled from: DeveloperLocalRepository.kt */
public final class DeveloperLocalRepository extends BaseLocalRepository {
    public final ArrayList<Complex> getComplexList(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        ArrayList<Complex> arrayList = new ArrayList<>();
        getRealm().executeTransaction(new DeveloperLocalRepository$getComplexList$$inlined$apply$lambda$1(arrayList, this, str));
        return arrayList;
    }

    public final Complex getComplexById(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (Complex) null;
        getRealm().executeTransaction(new DeveloperLocalRepository$getComplexById$1(str, objectRef));
        return (Complex) objectRef.element;
    }
}
