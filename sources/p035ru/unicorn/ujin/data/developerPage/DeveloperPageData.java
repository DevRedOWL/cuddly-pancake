package p035ru.unicorn.ujin.data.developerPage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import p035ru.unicorn.ujin.data.realm.DeveloperDayImageList;

/* renamed from: ru.unicorn.ujin.data.developerPage.DeveloperPageData */
public class DeveloperPageData implements Serializable {
    private ArrayList<DeveloperPageDataDocument> documents;
    private String ghost_token;
    private int need_autorization;
    private DeveloperPageDataPercent progress;
    private DeveloperSchema schema;
    @SerializedName("steps_grouped")
    private ArrayList<DeveloperDayImageList> steps;
    private String text;
    private String title;
    private String token;
    private String video;
    private String videoposter;

    public String getGhost_token() {
        return this.ghost_token;
    }

    public void setGhost_token(String str) {
        this.ghost_token = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public int getNeed_autorization() {
        return this.need_autorization;
    }

    public void setNeed_autorization(int i) {
        this.need_autorization = i;
    }

    public DeveloperPageDataPercent getProgress() {
        return this.progress;
    }

    public void setProgress(DeveloperPageDataPercent developerPageDataPercent) {
        this.progress = developerPageDataPercent;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public String getVideoposter() {
        return this.videoposter;
    }

    public void setVideoposter(String str) {
        this.videoposter = str;
    }

    public ArrayList<DeveloperPageDataDocument> getDocuments() {
        return this.documents;
    }

    public void setDocuments(ArrayList<DeveloperPageDataDocument> arrayList) {
        this.documents = arrayList;
    }

    public ArrayList<DeveloperDayImageList> getSteps() {
        return this.steps;
    }

    public void setSteps(ArrayList<DeveloperDayImageList> arrayList) {
        this.steps = arrayList;
    }

    public DeveloperSchema getSchema() {
        return this.schema;
    }

    public void setSchema(DeveloperSchema developerSchema) {
        this.schema = developerSchema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
