package p035ru.unicorn.ujin.data.developerPage;

/* renamed from: ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton */
public class DeveloperSchemaButton {
    public static String OPEN_URL = "open_url";
    public static String STEPS = "steps";
    public static String VIDEO = "video";
    private DeveloperButtonAction action;
    private String description;
    private String image;
    private String tag;
    private String title;
    private String url;
    private Boolean visible;

    public String getImage() {
        return this.image;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public DeveloperButtonAction getAction() {
        return this.action;
    }

    public void setAction(DeveloperButtonAction developerButtonAction) {
        this.action = developerButtonAction;
    }
}
