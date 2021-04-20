package p035ru.unicorn.ujin.data.developerPage;

import java.io.Serializable;

/* renamed from: ru.unicorn.ujin.data.developerPage.CarouselPhoto */
public class CarouselPhoto implements Serializable {
    private String img;
    private String thumbnail;
    private String title;

    public CarouselPhoto(String str, String str2, String str3) {
        this.img = str;
        this.thumbnail = str2;
        this.title = str3;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }
}
