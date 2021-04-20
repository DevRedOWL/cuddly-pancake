package p035ru.unicorn.ujin.view.activity.navigation.entity;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.FlatContract */
public class FlatContract implements Diffable<FlatContract> {
    public boolean areContentsTheSame(FlatContract flatContract) {
        return false;
    }

    public boolean areItemsTheSame(FlatContract flatContract) {
        return false;
    }
}
