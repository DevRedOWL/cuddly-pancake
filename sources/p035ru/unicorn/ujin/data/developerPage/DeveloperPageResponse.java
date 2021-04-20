package p035ru.unicorn.ujin.data.developerPage;

/* renamed from: ru.unicorn.ujin.data.developerPage.DeveloperPageResponse */
public class DeveloperPageResponse {
    private String command;
    private DeveloperPageData data;
    private int error;
    private String fromdomain;
    private String ghost_token;
    private String message;
    private String token;
    private String worktime;

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public int getError() {
        return this.error;
    }

    public void setError(int i) {
        this.error = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public DeveloperPageData getData() {
        return this.data;
    }

    public void setData(DeveloperPageData developerPageData) {
        this.data = developerPageData;
    }

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

    public String getFromdomain() {
        return this.fromdomain;
    }

    public void setFromdomain(String str) {
        this.fromdomain = str;
    }

    public String getWorktime() {
        return this.worktime;
    }

    public void setWorktime(String str) {
        this.worktime = str;
    }
}
