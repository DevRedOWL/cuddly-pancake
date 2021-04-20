package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingData */
public class TalkingData implements Diffable<TalkingData> {
    private String address;
    private List<String> data;

    /* renamed from: id */
    private int f6828id;
    private boolean isBusy;
    private String position;
    private List<RentChildren> rentChildren;
    private TalkingPhotosFile schema;
    private String title;
    private String type;

    public TalkingData(TalkingInfo talkingInfo) {
        this.f6828id = talkingInfo.getId();
        this.address = talkingInfo.getAdress();
        this.title = talkingInfo.getTitle();
        this.position = talkingInfo.getAdress();
        this.type = talkingInfo.getStateRenta().getName();
        this.isBusy = talkingInfo.isParentIsBusy();
        this.data = getURL(talkingInfo.getImage());
        this.rentChildren = talkingInfo.getRentChildre();
        this.schema = talkingInfo.getSchemaPhoto();
    }

    private List<String> getURL(List<TalkingPhotos> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).getUrl().getUrl());
        }
        return arrayList;
    }

    public boolean areItemsTheSame(TalkingData talkingData) {
        return this.f6828id == talkingData.f6828id;
    }

    public boolean areContentsTheSame(TalkingData talkingData) {
        return this.title.equals(talkingData.title);
    }

    public int getId() {
        return this.f6828id;
    }

    public void setId(int i) {
        this.f6828id = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setData(List<String> list) {
        this.data = list;
    }

    public String getPosition() {
        return this.position;
    }

    public List<String> getData() {
        return this.data;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean isBusy() {
        return this.isBusy;
    }

    public void setBusy(boolean z) {
        this.isBusy = z;
    }

    public void setRentChildren(List<RentChildren> list) {
        this.rentChildren = list;
    }

    public List<RentChildren> getRentChildren() {
        return this.rentChildren;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public TalkingPhotosFile getSchema() {
        return this.schema;
    }
}
