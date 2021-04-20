package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ContactsField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "contactList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Contact;", "(Ljava/util/ArrayList;)V", "getContactList", "()Ljava/util/ArrayList;", "setContactList", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField */
/* compiled from: DataEntryItem.kt */
public final class ContactsField extends Field {
    private ArrayList<Contact> contactList;

    public final ArrayList<Contact> getContactList() {
        return this.contactList;
    }

    public final void setContactList(ArrayList<Contact> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.contactList = arrayList;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ContactsField$JsonFields;", "", "()V", "contactList", "", "fieldName", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String contactList = "contacts";
        public static final String fieldName = "contacts";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactsField(ArrayList<Contact> arrayList) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(arrayList, "contactList");
        this.contactList = arrayList;
    }
}
