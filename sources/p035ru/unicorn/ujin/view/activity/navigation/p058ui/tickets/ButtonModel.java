package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.ButtonModel */
public class ButtonModel implements Diffable<ButtonModel> {
    private Integer key;
    private String title;

    public Integer getKey() {
        return this.key;
    }

    public void setKey(Integer num) {
        this.key = num;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean areItemsTheSame(ButtonModel buttonModel) {
        return this.key.equals(buttonModel.key);
    }

    public boolean areContentsTheSame(ButtonModel buttonModel) {
        return this.key.equals(buttonModel.key);
    }

    public ButtonModel(Integer num, String str) {
        this.key = num;
        this.title = str;
    }

    public ButtonModel() {
    }
}
