package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4703xdbbe67f6;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile */
public class ServiceFile extends RealmObject implements Diffable<ServiceFile>, C4703xdbbe67f6 {
    @SerializedName("file_id")
    @PrimaryKey
    @Expose
    private String fileId;
    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("file_size")
    @Expose
    private String fileSize;
    @SerializedName("file_url")
    @Expose
    private String fileUrl;
    @SerializedName("message_id")
    @Expose
    private String messageId;

    public boolean areContentsTheSame(ServiceFile serviceFile) {
        return false;
    }

    public boolean areItemsTheSame(ServiceFile serviceFile) {
        return false;
    }

    public String realmGet$fileId() {
        return this.fileId;
    }

    public String realmGet$fileName() {
        return this.fileName;
    }

    public String realmGet$fileSize() {
        return this.fileSize;
    }

    public String realmGet$fileUrl() {
        return this.fileUrl;
    }

    public String realmGet$messageId() {
        return this.messageId;
    }

    public void realmSet$fileId(String str) {
        this.fileId = str;
    }

    public void realmSet$fileName(String str) {
        this.fileName = str;
    }

    public void realmSet$fileSize(String str) {
        this.fileSize = str;
    }

    public void realmSet$fileUrl(String str) {
        this.fileUrl = str;
    }

    public void realmSet$messageId(String str) {
        this.messageId = str;
    }

    public ServiceFile() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getFileName() {
        return realmGet$fileName();
    }

    public void setFileName(String str) {
        realmSet$fileName(str);
    }

    public String getFileSize() {
        return realmGet$fileSize();
    }

    public void setFileSize(String str) {
        realmSet$fileSize(str);
    }

    public String getFileId() {
        return realmGet$fileId();
    }

    public void setFileId(String str) {
        realmSet$fileId(str);
    }

    public String getMessageId() {
        return realmGet$messageId();
    }

    public void setMessageId(String str) {
        realmSet$messageId(str);
    }

    public String getFileUrl() {
        return realmGet$fileUrl();
    }

    public void setFileUrl(String str) {
        realmSet$fileUrl(str);
    }
}
