package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyAttachment;", "kotlin.jvm.PlatformType", "uploadedFile", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$4 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$4$4<T, R> implements Function<Resource<AttachFileData>, NewCompanyAttachment> {
    public static final PassCompanyVM$createCompany$4$4 INSTANCE = new PassCompanyVM$createCompany$4$4();

    PassCompanyVM$createCompany$4$4() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r1.getFile();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment apply(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "uploadedFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyAttachment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyAttachment
            java.lang.Object r1 = r3.getData()
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData r1 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData) r1
            if (r1 == 0) goto L_0x001a
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFile r1 = r1.getFile()
            if (r1 == 0) goto L_0x001a
            int r1 = r1.getId()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.Object r3 = r3.getData()
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData r3 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData) r3
            if (r3 == 0) goto L_0x0030
            ru.unicorn.ujin.view.fragments.makearecord.model.AttachFile r3 = r3.getFile()
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.getType()
            if (r3 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = ""
        L_0x0032:
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM$createCompany$4$4.apply(ru.unicorn.ujin.data.realm.Resource):ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyAttachment");
    }
}
