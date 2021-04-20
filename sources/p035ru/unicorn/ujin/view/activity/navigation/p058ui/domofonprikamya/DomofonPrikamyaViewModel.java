package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaViewModel */
public class DomofonPrikamyaViewModel extends BaseViewModel {
    private LocalRepository localRepository = LocalRepository.getInstance();
    private MutableLiveData<Integer> mutableLiveDataPosition = new MutableLiveData<>();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private SingleLiveEvent<Resource<Void>> sendDataResult = new SingleLiveEvent<>();
    private MutableLiveData<Resource<List<ServiceData>>> serviceDataMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Resource<List<ServiceFields>>> serviceFieldsMutableLiveData = new MutableLiveData<>();

    public DomofonPrikamyaViewModel() {
        getServiceList();
    }

    public void getServiceList() {
        this.compositeDisposable.add(this.remoteRepository.getServiceList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomofonPrikamyaViewModel.this.lambda$getServiceList$0$DomofonPrikamyaViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getServiceList$0$DomofonPrikamyaViewModel(Resource resource) throws Exception {
        this.serviceDataMutableLiveData.postValue(resource);
    }

    public void getService(int i) {
        this.compositeDisposable.add(this.remoteRepository.getRequestFields(i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomofonPrikamyaViewModel.this.lambda$getService$1$DomofonPrikamyaViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getService$1$DomofonPrikamyaViewModel(Resource resource) throws Exception {
        this.serviceFieldsMutableLiveData.postValue(resource);
    }

    public MutableLiveData<Resource<List<ServiceData>>> getServiceDataMutableLiveData() {
        return this.serviceDataMutableLiveData;
    }

    public MutableLiveData<Resource<List<ServiceFields>>> getServiceFieldsMutableLiveData() {
        return this.serviceFieldsMutableLiveData;
    }

    public MutableLiveData<Integer> getMutableLiveDataPosition() {
        return this.mutableLiveDataPosition;
    }

    public void sendData(List<ServiceFields> list) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            ServiceFields serviceFields = list.get(i);
            hashMap.put(serviceFields.getId(), serviceFields.getValue() != null ? serviceFields.getValue() : "");
        }
        this.compositeDisposable.add(this.remoteRepository.sendServiceFields(hashMap, 1).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomofonPrikamyaViewModel.this.lambda$sendData$2$DomofonPrikamyaViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$sendData$2$DomofonPrikamyaViewModel(Resource resource) throws Exception {
        this.sendDataResult.postValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> getSendDataResult() {
        return this.sendDataResult;
    }
}
