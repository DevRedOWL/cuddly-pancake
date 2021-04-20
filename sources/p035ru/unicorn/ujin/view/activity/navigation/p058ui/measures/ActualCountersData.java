package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4737x34252d59;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData */
public class ActualCountersData extends RealmObject implements C4737x34252d59 {
    @SerializedName("buttonName")
    @Expose
    private String buttonName;
    @SerializedName("error_message")
    @Expose
    private String errorMessage;
    @SerializedName("hasAutomatedCommercialAccountingSystem")
    @Expose
    private boolean hasAutomatedCommercialAccountingSystem;
    @SerializedName("notification")
    @Expose
    private String notification;
    @SerializedName("showButton")
    @Expose
    private boolean showButton;

    public String realmGet$buttonName() {
        return this.buttonName;
    }

    public String realmGet$errorMessage() {
        return this.errorMessage;
    }

    public boolean realmGet$hasAutomatedCommercialAccountingSystem() {
        return this.hasAutomatedCommercialAccountingSystem;
    }

    public String realmGet$notification() {
        return this.notification;
    }

    public boolean realmGet$showButton() {
        return this.showButton;
    }

    public void realmSet$buttonName(String str) {
        this.buttonName = str;
    }

    public void realmSet$errorMessage(String str) {
        this.errorMessage = str;
    }

    public void realmSet$hasAutomatedCommercialAccountingSystem(boolean z) {
        this.hasAutomatedCommercialAccountingSystem = z;
    }

    public void realmSet$notification(String str) {
        this.notification = str;
    }

    public void realmSet$showButton(boolean z) {
        this.showButton = z;
    }

    public ActualCountersData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean isShowButton() {
        return realmGet$showButton();
    }

    public void setShowButton(boolean z) {
        realmSet$showButton(z);
    }

    public String getButtonName() {
        return realmGet$buttonName();
    }

    public void setButtonName(String str) {
        realmSet$buttonName(str);
    }

    public boolean isHasAutomatedCommercialAccountingSystem() {
        return realmGet$hasAutomatedCommercialAccountingSystem();
    }

    public void setHasAutomatedCommercialAccountingSystem(boolean z) {
        realmSet$hasAutomatedCommercialAccountingSystem(z);
    }

    public String getErrorMessage() {
        return realmGet$errorMessage();
    }

    public String getNotification() {
        return realmGet$notification();
    }
}
