package p035ru.unicorn.ujin.view.activity.navigation.p058ui.radiodialogfragment;

import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioChooserObject */
public class RadioChooserObject implements Diffable<RadioChooserObject> {
    private boolean isActie;
    private String title;

    public boolean areContentsTheSame(RadioChooserObject radioChooserObject) {
        return false;
    }

    public boolean areItemsTheSame(RadioChooserObject radioChooserObject) {
        return false;
    }

    public RadioChooserObject(String str) {
        this.title = str;
    }

    public RadioChooserObject(String str, boolean z) {
        this.title = str;
        this.isActie = z;
    }

    public RadioChooserObject() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isActie() {
        return this.isActie;
    }

    public void setActie(boolean z) {
        this.isActie = z;
    }

    public static List<RadioChooserObject> getData(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new RadioChooserObject(list.get(i)));
        }
        return arrayList;
    }
}
