package p035ru.unicorn.ujin.view.fragments.base.attach;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/AttachableButtonSettings;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "areContentsTheSame", "", "other", "areItemsTheSame", "getButtonText", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachableButtonSettings */
/* compiled from: AttachableButtonSettings.kt */
public interface AttachableButtonSettings extends Diffable<AttachableButtonSettings> {

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachableButtonSettings$DefaultImpls */
    /* compiled from: AttachableButtonSettings.kt */
    public static final class DefaultImpls {
        public static boolean areContentsTheSame(AttachableButtonSettings attachableButtonSettings, AttachableButtonSettings attachableButtonSettings2) {
            return true;
        }

        public static boolean areItemsTheSame(AttachableButtonSettings attachableButtonSettings, AttachableButtonSettings attachableButtonSettings2) {
            return true;
        }
    }

    boolean areContentsTheSame(AttachableButtonSettings attachableButtonSettings);

    boolean areItemsTheSame(AttachableButtonSettings attachableButtonSettings);

    String getButtonText();
}
