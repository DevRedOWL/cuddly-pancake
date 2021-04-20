package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.Diffable */
public interface Diffable<T extends Diffable<T>> {
    boolean areContentsTheSame(T t);

    boolean areItemsTheSame(T t);
}
