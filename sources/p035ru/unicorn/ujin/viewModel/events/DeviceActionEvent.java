package p035ru.unicorn.ujin.viewModel.events;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/DeviceActionEvent;", "", "success", "", "hasDevice", "(ZZ)V", "getHasDevice", "()Z", "getSuccess", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.DeviceActionEvent */
/* compiled from: DeviceActionEvent.kt */
public final class DeviceActionEvent {
    private final boolean hasDevice;
    private final boolean success;

    public DeviceActionEvent(boolean z, boolean z2) {
        this.success = z;
        this.hasDevice = z2;
    }

    public final boolean getHasDevice() {
        return this.hasDevice;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
