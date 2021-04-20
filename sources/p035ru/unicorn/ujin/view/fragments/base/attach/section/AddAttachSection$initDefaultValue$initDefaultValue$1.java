package p035ru.unicorn.ujin.view.fragments.base.attach.section;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachableButtonSettings;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection$initDefaultValue$initDefaultValue$1", "Lru/unicorn/ujin/view/fragments/base/attach/AttachableButtonSettings;", "getButtonText", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.AddAttachSection$initDefaultValue$initDefaultValue$1 */
/* compiled from: AddAttachSection.kt */
public final class AddAttachSection$initDefaultValue$initDefaultValue$1 implements AttachableButtonSettings {
    public String getButtonText() {
        return "Добавить документ";
    }

    AddAttachSection$initDefaultValue$initDefaultValue$1() {
    }

    public boolean areContentsTheSame(AttachableButtonSettings attachableButtonSettings) {
        return AttachableButtonSettings.DefaultImpls.areContentsTheSame(this, attachableButtonSettings);
    }

    public boolean areItemsTheSame(AttachableButtonSettings attachableButtonSettings) {
        return AttachableButtonSettings.DefaultImpls.areItemsTheSame(this, attachableButtonSettings);
    }
}
