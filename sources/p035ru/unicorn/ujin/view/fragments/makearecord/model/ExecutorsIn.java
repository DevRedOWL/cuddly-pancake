package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4821x4c295cda;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "getTitle", "setTitle", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn */
/* compiled from: ExecutorsListIn.kt */
public class ExecutorsIn extends RealmObject implements Diffable<ExecutorsIn>, C4821x4c295cda {
    private String description;
    @PrimaryKey

    /* renamed from: id */
    private Integer f6928id;
    private String title;

    public String realmGet$description() {
        return this.description;
    }

    public Integer realmGet$id() {
        return this.f6928id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$id(Integer num) {
        this.f6928id = num;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public ExecutorsIn() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(0);
        realmSet$title("");
        realmSet$description("");
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public boolean areItemsTheSame(ExecutorsIn executorsIn) {
        Integer realmGet$id = realmGet$id();
        if (realmGet$id == null) {
            return false;
        }
        return realmGet$id.equals(executorsIn != null ? executorsIn.realmGet$id() : null);
    }

    public boolean areContentsTheSame(ExecutorsIn executorsIn) {
        String realmGet$title = realmGet$title();
        if (realmGet$title == null) {
            return false;
        }
        return realmGet$title.equals(executorsIn != null ? executorsIn.realmGet$title() : null);
    }
}
