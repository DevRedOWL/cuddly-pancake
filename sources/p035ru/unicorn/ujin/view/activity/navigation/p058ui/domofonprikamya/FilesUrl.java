package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4687x4dd88e7b;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl */
public class FilesUrl extends RealmObject implements Diffable<FilesUrl>, C4687x4dd88e7b {
    @SerializedName("name")
    String fileName;

    public boolean areContentsTheSame(FilesUrl filesUrl) {
        return false;
    }

    public boolean areItemsTheSame(FilesUrl filesUrl) {
        return false;
    }

    public String realmGet$fileName() {
        return this.fileName;
    }

    public void realmSet$fileName(String str) {
        this.fileName = str;
    }

    public FilesUrl() {
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
}
