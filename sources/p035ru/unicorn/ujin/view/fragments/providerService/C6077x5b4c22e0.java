package p035ru.unicorn.ujin.view.fragments.providerService;

import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$handleActiveProviderInfo$1$4"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleActiveProviderInfo$$inlined$apply$lambda$1 */
/* compiled from: ProviderServiceFragment.kt */
final class C6077x5b4c22e0 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ActiveProviderInfoEvent $event$inlined;
    final /* synthetic */ ProviderServiceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6077x5b4c22e0(ProviderServiceFragment providerServiceFragment, ActiveProviderInfoEvent activeProviderInfoEvent) {
        super(1);
        this.this$0 = providerServiceFragment;
        this.$event$inlined = activeProviderInfoEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        new AlertDialog.Builder(this.this$0.getBaseActivity()).setMessage("Вы действительно хотите выйти из договора?").setPositiveButton("Да", new DialogInterface.OnClickListener(this) {
            final /* synthetic */ C6077x5b4c22e0 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
                r2 = (r2 = r2.getContract()).getId();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.content.DialogInterface r1, int r2) {
                /*
                    r0 = this;
                    r1.dismiss()
                    ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleActiveProviderInfo$$inlined$apply$lambda$1 r1 = r0.this$0
                    ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment r1 = r1.this$0
                    ru.unicorn.ujin.view.fragments.providerService.ProviderServiceViewModel r1 = r1.getProviderServiceViewModel()
                    ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$handleActiveProviderInfo$$inlined$apply$lambda$1 r2 = r0.this$0
                    ru.unicorn.ujin.view.fragments.providerService.ActiveProviderInfoEvent r2 = r2.$event$inlined
                    ru.unicorn.ujin.view.fragments.providerService.ActiveProviderService r2 = r2.getService()
                    if (r2 == 0) goto L_0x0026
                    ru.unicorn.ujin.view.fragments.providerService.Contract r2 = r2.getContract()
                    if (r2 == 0) goto L_0x0026
                    java.lang.Integer r2 = r2.getId()
                    if (r2 == 0) goto L_0x0026
                    int r2 = r2.intValue()
                    goto L_0x0027
                L_0x0026:
                    r2 = -1
                L_0x0027:
                    r1.requestDeleteActiveProviderServiceInfo(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.providerService.C6077x5b4c22e0.C60781.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton("Отмена", ProviderServiceFragment$handleActiveProviderInfo$1$4$2.INSTANCE).show();
    }
}
