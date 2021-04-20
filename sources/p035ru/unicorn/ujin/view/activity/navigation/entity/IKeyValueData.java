package p035ru.unicorn.ujin.view.activity.navigation.entity;

import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData */
public interface IKeyValueData extends Diffable<IKeyValueData> {

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData$OPTIONS */
    public enum OPTIONS {
        ARROW,
        ARROW_DOWN
    }

    Integer getDataId();

    String getKey();

    Map<OPTIONS, Object> getOptions();

    Object getValue();
}
