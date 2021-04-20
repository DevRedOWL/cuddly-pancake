package p035ru.unicorn.ujin.data.realm;

import p046io.realm.RealmModel;
import p046io.realm.annotations.RealmClass;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface;

@RealmClass
/* renamed from: ru.unicorn.ujin.data.realm.ImageData */
public class ImageData implements RealmModel, ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface {
    private Integer height;
    private byte[] imageBytes;
    private String img;
    private String source;
    private String thumbnail;
    private String title;
    private Integer width;

    public Integer realmGet$height() {
        return this.height;
    }

    public byte[] realmGet$imageBytes() {
        return this.imageBytes;
    }

    public String realmGet$img() {
        return this.img;
    }

    public String realmGet$source() {
        return this.source;
    }

    public String realmGet$thumbnail() {
        return this.thumbnail;
    }

    public String realmGet$title() {
        return this.title;
    }

    public Integer realmGet$width() {
        return this.width;
    }

    public void realmSet$height(Integer num) {
        this.height = num;
    }

    public void realmSet$imageBytes(byte[] bArr) {
        this.imageBytes = bArr;
    }

    public void realmSet$img(String str) {
        this.img = str;
    }

    public void realmSet$source(String str) {
        this.source = str;
    }

    public void realmSet$thumbnail(String str) {
        this.thumbnail = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$width(Integer num) {
        this.width = num;
    }

    public ImageData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getSource() {
        return realmGet$source();
    }

    public void setSource(String str) {
        realmSet$source(str);
    }

    public Integer getWidth() {
        return realmGet$width();
    }

    public void setWidth(Integer num) {
        realmSet$width(num);
    }

    public Integer getHeight() {
        return realmGet$height();
    }

    public void setHeight(Integer num) {
        realmSet$height(num);
    }

    public byte[] getImageBytes() {
        return realmGet$imageBytes();
    }

    public void setImageBytes(byte[] bArr) {
        realmSet$imageBytes(bArr);
    }

    public String getImg() {
        return realmGet$img();
    }

    public void setImg(String str) {
        realmSet$img(str);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getThumbnail() {
        return realmGet$thumbnail();
    }

    public void setThumbnail(String str) {
        realmSet$thumbnail(str);
    }
}
