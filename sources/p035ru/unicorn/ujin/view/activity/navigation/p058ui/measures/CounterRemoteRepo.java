package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterRemoteRepo */
class CounterRemoteRepo extends BaseRemoteRepository {
    public static final int MONTH_VALUE = 1;
    private static final String SORT_MONTH = "month";

    CounterRemoteRepo() {
    }

    public Flowable<Resource<Measures>> getMeasureByDate(Integer num, Integer num2, Long l, Long l2) {
        return getApi().getMeasure(num, num2, l, l2, SORT_MONTH, getAppName(), getToken()).map($$Lambda$CounterRemoteRepo$CjwK_36vLQqGS1TrbyaUEBnGFk.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Measures>> getMeasureV3(String str, Long l, Long l2) {
        return getApi().getMeasure(str, l, l2, getAppName(), getToken()).map($$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8kd9pc.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<MeasuresData>>> getMeasureList() {
        return getApi().getMeasureList(1, SORT_MONTH, getAppName(), getToken()).map($$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ActualCountersData>> getButtonParams() {
        return getApi().getMeasureButtonParam(getAppName(), getToken()).map($$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFAYRDIipeEXM.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1DBXUdbiL4c.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ServiceTicket>> sendMeasureValue(List<MeasuresData> list, Integer num) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrentValue().doubleValue() != -1.0d) {
                arrayList.add(new MeasuresValue(list.get(i).getSignalId(), String.valueOf(list.get(i).getCurrentValue())));
            }
        }
        String json = new Gson().toJson((Object) arrayList);
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getApi().sendMeasureValue(getAppName(), jSONArray, getToken(), num).map($$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<String>> sendMeasureValueString(List<MeasuresData> list, Integer num) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrentValue().doubleValue() != -1.0d) {
                arrayList.add(new MeasuresValue(list.get(i).getSignalId(), String.valueOf(list.get(i).getCurrentValue())));
            }
        }
        String json = new Gson().toJson((Object) arrayList);
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getApi().sendMeasureValueString(getAppName(), jSONArray, getToken(), num).map($$Lambda$CounterRemoteRepo$Yf9MR1gicKlK0KtKl1iWZ2AdGk.INSTANCE).onErrorReturn($$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEfsCZUJo.INSTANCE).subscribeOn(Schedulers.m6765io());
    }
}
