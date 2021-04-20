package p035ru.unicorn.ujin.view.activity.navigation.entity;

import java.util.Map;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl */
public class IKeyValueDataImpl implements IKeyValueData {
    private String key;
    private Map<IKeyValueData.OPTIONS, Object> optionsObjectMap;
    private Object value;

    public Integer getDataId() {
        return null;
    }

    public IKeyValueDataImpl(String str, Object obj) {
        this.key = str;
        this.value = obj;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public Map<IKeyValueData.OPTIONS, Object> getOptions() {
        return this.optionsObjectMap;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    public void setOptionsObjectMap(Map<IKeyValueData.OPTIONS, Object> map) {
        this.optionsObjectMap = map;
    }

    public boolean areItemsTheSame(IKeyValueData iKeyValueData) {
        return this.key.equals(iKeyValueData.getKey());
    }

    public boolean areContentsTheSame(IKeyValueData iKeyValueData) {
        return (this.value == null || iKeyValueData.getValue() == null || !this.value.equals(iKeyValueData.getValue())) ? false : true;
    }
}
