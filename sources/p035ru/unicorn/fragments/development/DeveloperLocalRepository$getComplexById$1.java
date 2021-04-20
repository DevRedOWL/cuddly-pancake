package p035ru.unicorn.fragments.development;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import p035ru.unicorn.ujin.data.realm.Complex;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperLocalRepository$getComplexById$1 */
/* compiled from: DeveloperLocalRepository.kt */
final class DeveloperLocalRepository$getComplexById$1 implements Realm.Transaction {
    final /* synthetic */ Ref.ObjectRef $complex;
    final /* synthetic */ String $complexId;

    DeveloperLocalRepository$getComplexById$1(String str, Ref.ObjectRef objectRef) {
        this.$complexId = str;
        this.$complex = objectRef;
    }

    public final void execute(Realm realm) {
        Complex complex = (Complex) realm.where(Complex.class).equalTo("id", this.$complexId).findFirst();
        if (complex != null) {
            this.$complex.element = (Complex) realm.copyFromRealm(complex);
        }
    }
}
