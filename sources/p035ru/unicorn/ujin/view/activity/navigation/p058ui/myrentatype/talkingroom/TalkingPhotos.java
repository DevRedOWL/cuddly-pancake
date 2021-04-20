package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4779x60c226d2;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos */
public class TalkingPhotos extends RealmObject implements C4779x60c226d2 {
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6830id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("file")
    @Expose
    private TalkingPhotosFile url;

    public int realmGet$id() {
        return this.f6830id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public TalkingPhotosFile realmGet$url() {
        return this.url;
    }

    public void realmSet$id(int i) {
        this.f6830id = i;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$url(TalkingPhotosFile talkingPhotosFile) {
        this.url = talkingPhotosFile;
    }

    public TalkingPhotos() {
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

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public TalkingPhotosFile getUrl() {
        return realmGet$url();
    }

    public void setUrl(TalkingPhotosFile talkingPhotosFile) {
        realmSet$url(talkingPhotosFile);
    }
}
