package p035ru.unicorn.ujin.view.fragments.anotherPass.events;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherArchivePassListEvent;", "", "success", "", "message", "", "passList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "Lkotlin/collections/ArrayList;", "(ZLjava/lang/String;Ljava/util/ArrayList;)V", "getMessage", "()Ljava/lang/String;", "getPassList", "()Ljava/util/ArrayList;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherArchivePassListEvent */
/* compiled from: AnotherArchivePassListEvent.kt */
public final class AnotherArchivePassListEvent {
    private final String message;
    private final ArrayList<Passe> passList;
    private final boolean success;

    public AnotherArchivePassListEvent(boolean z, String str, ArrayList<Passe> arrayList) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.passList = arrayList;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<Passe> getPassList() {
        return this.passList;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
