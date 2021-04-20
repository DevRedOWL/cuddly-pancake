package p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.DataObservable */
public interface DataObservable {
    int getLonelyHeight();

    void onItemChanged(int i);

    void onItemMoved(int i, int i2);

    void onItemRangeChanged(int i, int i2, Object obj);

    void onItemRangeInserted(int i, int i2);

    void onItemRangeRemoved(int i, int i2);
}
