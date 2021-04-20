package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.ButtonModel */
public class ButtonModel implements IButtonSection {
    private String title;
    private DynamicBackgroundButton.Type type;

    public boolean isClickable() {
        return true;
    }

    public ButtonModel(String str) {
        this.title = str;
        this.type = DynamicBackgroundButton.Type.PRIMARY;
    }

    public ButtonModel(String str, DynamicBackgroundButton.Type type2) {
        this.title = str;
        this.type = type2;
    }

    public void title(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public DynamicBackgroundButton.Type getType() {
        return this.type;
    }
}
