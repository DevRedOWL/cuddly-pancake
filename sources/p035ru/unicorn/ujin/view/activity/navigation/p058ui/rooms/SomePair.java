package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.SomePair */
public class SomePair implements Diffable<SomePair> {
    private int count;

    /* renamed from: id */
    private Integer f6865id;
    private String title;

    public SomePair(String str, int i, Integer num) {
        this.title = str;
        this.count = i;
        this.f6865id = num;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public boolean areItemsTheSame(SomePair somePair) {
        return this.title.equals(somePair.title);
    }

    public boolean areContentsTheSame(SomePair somePair) {
        return this.title.equals(somePair.title) && this.count == somePair.count;
    }

    public Integer getId() {
        return this.f6865id;
    }
}
