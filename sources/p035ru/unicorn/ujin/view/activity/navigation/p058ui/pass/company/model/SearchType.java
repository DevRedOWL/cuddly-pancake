package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/SearchType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ANY", "ALL", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.SearchType */
/* compiled from: SearchBodyOut.kt */
public enum SearchType {
    ANY("any"),
    ALL("all");
    
    private final String type;

    private SearchType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
