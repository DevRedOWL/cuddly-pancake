package p035ru.unicorn.ujin.data.developerPage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ru.unicorn.ujin.data.developerPage.DeveloperSchema */
public class DeveloperSchema implements Serializable {
    private ArrayList<DeveloperSchemaButton> buttons;

    public ArrayList<DeveloperSchemaButton> getButtons() {
        return this.buttons;
    }

    public void setButtons(ArrayList<DeveloperSchemaButton> arrayList) {
        this.buttons = arrayList;
    }
}
