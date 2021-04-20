package p035ru.unicorn.ujin.viewModel.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/UpdateSearchFavouriteFlatEvent;", "", "success", "", "message", "", "flatId", "position", "", "(ZLjava/lang/String;Ljava/lang/String;I)V", "getFlatId", "()Ljava/lang/String;", "getMessage", "getPosition", "()I", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.UpdateSearchFavouriteFlatEvent */
/* compiled from: UpdateSearchFavoriteFlatEvent.kt */
public final class UpdateSearchFavouriteFlatEvent {
    private final String flatId;
    private final String message;
    private final int position;
    private final boolean success;

    public UpdateSearchFavouriteFlatEvent(boolean z, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "flatId");
        this.success = z;
        this.message = str;
        this.flatId = str2;
        this.position = i;
    }

    public final String getFlatId() {
        return this.flatId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
