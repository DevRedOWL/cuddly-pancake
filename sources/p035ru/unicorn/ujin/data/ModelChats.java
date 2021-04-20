package p035ru.unicorn.ujin.data;

/* renamed from: ru.unicorn.ujin.data.ModelChats */
public class ModelChats {
    String chat_ID;
    Integer int_readOnly;
    String last_message_dt;
    String str_badge;
    String str_message;
    String str_title;

    public ModelChats(String str, String str2, String str3) {
        this.str_title = str;
        this.str_message = str2;
        this.last_message_dt = str3;
    }

    public ModelChats() {
    }

    public String getChatID() {
        return this.chat_ID;
    }

    public void setChatID(String str) {
        this.chat_ID = str;
    }

    public String getStrTitle() {
        return this.str_title;
    }

    public void setStrTitle(String str) {
        this.str_title = str;
    }

    public String getStrMessage() {
        return this.str_message;
    }

    public void setStrBadge(String str) {
        this.str_badge = str;
    }

    public String getStrBadge() {
        return this.str_badge;
    }

    public void setIntReadOnly(Integer num) {
        this.int_readOnly = num;
    }

    public Integer getIntReadOnly() {
        return this.int_readOnly;
    }

    public String getLastDTMessage() {
        return this.last_message_dt;
    }

    public void setLastDTMessage(String str) {
        this.last_message_dt = str;
    }

    public void setStrMessage(String str) {
        this.str_message = str;
    }
}
