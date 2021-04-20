package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4777xa33ef3b6;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile */
public class TalkingPhotosFile extends RealmObject implements C4777xa33ef3b6 {
    @SerializedName("bytes")
    @Expose
    private long bytes;
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private int f6831id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("preview")
    @Expose
    private TalkingPhotosFile preview;
    @SerializedName("url")
    @Expose
    private String url;

    public long realmGet$bytes() {
        return this.bytes;
    }

    public int realmGet$id() {
        return this.f6831id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public TalkingPhotosFile realmGet$preview() {
        return this.preview;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$bytes(long j) {
        this.bytes = j;
    }

    public void realmSet$id(int i) {
        this.f6831id = i;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$preview(TalkingPhotosFile talkingPhotosFile) {
        this.preview = talkingPhotosFile;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public TalkingPhotosFile() {
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

    public long getBytes() {
        return realmGet$bytes();
    }

    public void setBytes(long j) {
        realmSet$bytes(j);
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public String getUrl() {
        return realmGet$url();
    }

    public void setUrl(String str) {
        realmSet$url(str);
    }

    public TalkingPhotosFile getPreview() {
        return realmGet$preview();
    }

    public void setPreview(TalkingPhotosFile talkingPhotosFile) {
        realmSet$preview(talkingPhotosFile);
    }
}
