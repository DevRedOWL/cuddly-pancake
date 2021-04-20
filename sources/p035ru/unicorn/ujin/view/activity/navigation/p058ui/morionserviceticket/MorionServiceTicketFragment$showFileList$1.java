package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "serviceFile", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceFile;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showFileList$1 */
/* compiled from: MorionServiceTicketFragment.kt */
final class MorionServiceTicketFragment$showFileList$1<T> implements Consumer<ServiceFile> {
    final /* synthetic */ MorionServiceTicketFragment this$0;

    MorionServiceTicketFragment$showFileList$1(MorionServiceTicketFragment morionServiceTicketFragment) {
        this.this$0 = morionServiceTicketFragment;
    }

    public final void accept(ServiceFile serviceFile) {
        Intrinsics.checkNotNullParameter(serviceFile, "serviceFile");
        this.this$0.onDownloadClick(serviceFile);
    }
}
