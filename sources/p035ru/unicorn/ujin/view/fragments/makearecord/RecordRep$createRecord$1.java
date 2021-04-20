package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Status;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser;
import p046io.reactivex.functions.Function;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "kotlin.jvm.PlatformType", "data", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$createRecord$1 */
/* compiled from: RecordRep.kt */
final class RecordRep$createRecord$1<T, R> implements Function<Resource<Appointment>, Resource<Appointment>> {
    public static final RecordRep$createRecord$1 INSTANCE = new RecordRep$createRecord$1();

    RecordRep$createRecord$1() {
    }

    public final Resource<Appointment> apply(Resource<Appointment> resource) {
        Intrinsics.checkNotNullParameter(resource, "data");
        Integer error = resource.getError();
        String message = resource.getMessage();
        Appointment data = resource.getData();
        if (data == null) {
            data = new Appointment((Integer) null, (RealmList) null, (String) null, (String) null, (Status) null, (String) null, (String) null, (String) null, (ToUser) null, (Integer) null, (FromUser) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }
        return Resource.success(error, message, data);
    }
}
