package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "uploadedFile", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "apply", "(Lru/unicorn/ujin/data/realm/Resource;)Ljava/lang/Integer;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$4 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$4<T, R> implements Function<Resource<AttachFileData>, Integer> {
    public static final RecordsViewModel$createRecord$4 INSTANCE = new RecordsViewModel$createRecord$4();

    RecordsViewModel$createRecord$4() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.getFile();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer apply(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "uploadedFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r2 = r2.getData()
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData r2 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData) r2
            if (r2 == 0) goto L_0x0018
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFile r2 = r2.getFile()
            if (r2 == 0) goto L_0x0018
            int r2 = r2.getId()
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$4.apply(ru.unicorn.ujin.data.realm.Resource):java.lang.Integer");
    }
}
