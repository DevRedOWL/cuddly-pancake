package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.Timetime */
public class Timetime implements Diffable<Timetime> {

    /* renamed from: x */
    private Long f6889x;

    public boolean areContentsTheSame(Timetime timetime) {
        return false;
    }

    public boolean areItemsTheSame(Timetime timetime) {
        return false;
    }

    public Timetime(Long l) {
        this.f6889x = l;
    }

    public Long getX() {
        return this.f6889x;
    }

    public void setX(Long l) {
        this.f6889x = l;
    }
}
