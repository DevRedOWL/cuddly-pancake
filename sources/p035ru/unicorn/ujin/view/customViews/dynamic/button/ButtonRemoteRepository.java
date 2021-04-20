package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.api.request.AuthBody;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.ButtonRemoteRepository */
public class ButtonRemoteRepository extends BaseRemoteRepository {
    public Flowable<ResourceV2<Object>> sendDynamicRequestV2(String str, Map<String, String> map, HashMap<String, Object> hashMap) {
        HashMap<String, Object> parseEntrySet = parseEntrySet(hashMap.entrySet(), map);
        parseEntrySet.put("auth", new AuthBody("api-token", getToken()));
        Pro100Api api = getApi();
        return api.sendDynamicFormRequestV2("https://api-product.mysmartflat.ru/api/" + str, getToken(), getAppName(), parseEntrySet).map($$Lambda$ButtonRemoteRepository$ClDSPO7DoIRC4Xd5RPsH5tDDCec.INSTANCE).onErrorReturn(new Function() {
            public final Object apply(Object obj) {
                return ButtonRemoteRepository.this.lambda$sendDynamicRequestV2$1$ButtonRemoteRepository((Throwable) obj);
            }
        }).startWith(ResourceV2.Companion.loading()).subscribeOn(Schedulers.m6765io());
    }

    public /* synthetic */ ResourceV2 lambda$sendDynamicRequestV2$1$ButtonRemoteRepository(Throwable th) throws Exception {
        return ResourceV2.Companion.error(new ResourceV2.ResourceV2Service(new ResourceV2.ResponseV2Error("", formatMessage(th.getMessage()))));
    }

    public Flowable<Resource<Object>> sendDynamicRequestV1(String str, Map<String, String> map, HashMap<String, Object> hashMap) {
        HashMap<String, Object> parseEntrySet = parseEntrySet(hashMap.entrySet(), map);
        parseEntrySet.put("auth", new AuthBody("api-token", getToken()));
        Pro100Api api = getApi();
        return api.sendDynamicFormRequestV1("https://api-product.mysmartflat.ru/api/" + str, getToken(), getAppName(), parseEntrySet).map($$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE.INSTANCE).onErrorReturn(new Function() {
            public final Object apply(Object obj) {
                return ButtonRemoteRepository.this.lambda$sendDynamicRequestV1$3$ButtonRemoteRepository((Throwable) obj);
            }
        }).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public /* synthetic */ Resource lambda$sendDynamicRequestV1$3$ButtonRemoteRepository(Throwable th) throws Exception {
        return Resource.error(formatMessage(th.getMessage()));
    }

    private HashMap<String, Object> parseEntrySet(Set<Map.Entry<String, Object>> set, Map<String, String> map) {
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry next : set) {
            if ((next.getValue() instanceof String) && next.getValue().equals("")) {
                hashMap.put(next.getKey(), map.get(next.getKey()));
            } else if (next.getValue() instanceof HashMap) {
                hashMap.put(next.getKey(), parseEntrySet(((HashMap) next.getValue()).entrySet(), map));
            }
        }
        return hashMap;
    }

    private String formatMessage(String str) {
        return str.contains("500") ? "Произошла ошибка, проверьте правильность введенных данных" : str;
    }
}
