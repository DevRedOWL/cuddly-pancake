package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ButtonProps */
public class ButtonProps {
    private int backgroundRes;
    private boolean isEnable = true;
    private String title;
    private DynamicBackgroundButton.Type type;

    public ButtonProps() {
    }

    public ButtonProps(String str) {
        this.title = str;
        this.isEnable = true;
    }

    public ButtonProps(String str, boolean z) {
        this.title = str;
        this.isEnable = z;
    }

    public ButtonProps(String str, DynamicBackgroundButton.Type type2) {
        this.title = str;
        this.type = type2;
        this.isEnable = true;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }

    public int getBackgroundRes() {
        return this.backgroundRes;
    }

    public void setBackgroundRes(int i) {
        this.backgroundRes = i;
    }

    public DynamicBackgroundButton.Type getType() {
        return this.type;
    }

    public void setType(DynamicBackgroundButton.Type type2) {
        this.type = type2;
    }
}
