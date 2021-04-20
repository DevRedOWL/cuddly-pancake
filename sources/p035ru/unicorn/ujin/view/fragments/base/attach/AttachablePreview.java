package p035ru.unicorn.ujin.view.fragments.base.attach;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "fileName", "", "imageUrl", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview */
/* compiled from: AttachablePreview.kt */
public interface AttachablePreview extends Diffable<AttachablePreview> {
    String fileName();

    String imageUrl();

    String type();
}
