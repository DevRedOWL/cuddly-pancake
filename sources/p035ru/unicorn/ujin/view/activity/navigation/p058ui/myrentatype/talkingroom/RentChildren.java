package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p046io.realm.C4767xc6e1e033;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren */
public class RentChildren extends RealmObject implements Diffable<RentChildren>, C4767xc6e1e033 {
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6825id;
    @SerializedName("is_busy")
    @Expose
    private boolean isBusy;
    @SerializedName("rents")
    @Expose
    private RealmList<RentInfo> rents;
    @SerializedName("title")
    @Expose
    private String title;

    public int realmGet$id() {
        return this.f6825id;
    }

    public boolean realmGet$isBusy() {
        return this.isBusy;
    }

    public RealmList realmGet$rents() {
        return this.rents;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(int i) {
        this.f6825id = i;
    }

    public void realmSet$isBusy(boolean z) {
        this.isBusy = z;
    }

    public void realmSet$rents(RealmList realmList) {
        this.rents = realmList;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public RentChildren() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public boolean isBusy() {
        return realmGet$isBusy();
    }

    public void setBusy(boolean z) {
        realmSet$isBusy(z);
    }

    public RealmList<RentInfo> getRents() {
        return realmGet$rents();
    }

    public void setRents(RealmList<RentInfo> realmList) {
        realmSet$rents(realmList);
    }

    public boolean areItemsTheSame(RentChildren rentChildren) {
        return realmGet$id() == rentChildren.realmGet$id();
    }

    public boolean areContentsTheSame(RentChildren rentChildren) {
        return realmGet$title().equals(rentChildren.realmGet$title()) && realmGet$isBusy() == rentChildren.realmGet$isBusy();
    }

    /* renamed from: to */
    public static List<SomeString> m6929to(Set<RentChildren> set) {
        ArrayList arrayList = new ArrayList();
        for (RentChildren realmGet$title : set) {
            arrayList.add(new SomeString(realmGet$title.realmGet$title()));
        }
        return arrayList;
    }
}
