package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel */
public class VideoViewModel extends ViewModel {
    private MutableLiveData<Integer> activePosition = new MutableLiveData<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<Resource<VideoDates>> datesMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Resource<VideoEventsList>> eventsMutableLiveData = new MutableLiveData<>();
    private SingleLiveEvent<Resource<Hardware>> getHardwareSingleEvent = new SingleLiveEvent<>();
    private LocalRepository localRepository = LocalRepository.getInstance();
    private RemoteRepository remoteRepository = new RemoteRepository();
    private SingleLiveEvent<Resource<Void>> sendDynamiceRequest = new SingleLiveEvent<>();
    private SingleLiveEvent<Resource<SomeData>> sendSignalSingleEvent = new SingleLiveEvent<>();
    private MutableLiveData<String> showUrl = new MutableLiveData<>();
    private MutableLiveData<Long> time = new MutableLiveData<>();
    private MutableLiveData<String> title = new SingleLiveEvent();
    private MutableLiveData<Resource<VideoUrl>> urlMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getActivePosition() {
        return this.activePosition;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        if (!this.compositeDisposable.isDisposed()) {
            this.compositeDisposable.dispose();
        }
    }

    public LiveData<Resource<List<C5788Video>>> getVideoPreview() {
        return LiveDataReactiveStreams.fromPublisher(this.remoteRepository.getVideoPreview().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()));
    }

    public MutableLiveData<String> getTitle() {
        return this.title;
    }

    public void sendDynamicRequest(String str) {
        this.compositeDisposable.add(this.remoteRepository.senDynamicRequest(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                VideoViewModel.this.lambda$sendDynamicRequest$0$VideoViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$sendDynamicRequest$0$VideoViewModel(Resource resource) throws Exception {
        this.sendDynamiceRequest.setValue(resource);
    }

    public SingleLiveEvent<Resource<Void>> getSendDynamiceRequest() {
        return this.sendDynamiceRequest;
    }

    public void getAvailableVideoDate(String str, String str2) {
        this.compositeDisposable.add(this.remoteRepository.getAvailableDate(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                VideoViewModel.this.lambda$getAvailableVideoDate$1$VideoViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getAvailableVideoDate$1$VideoViewModel(Resource resource) throws Exception {
        this.datesMutableLiveData.setValue(resource);
    }

    public MutableLiveData<Resource<VideoDates>> getDatesMutableLiveData() {
        return this.datesMutableLiveData;
    }

    public void getArchiveDateEvents(String str, String str2, String str3) {
        this.compositeDisposable.add(this.remoteRepository.getArchiveDateEvents(str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                VideoViewModel.this.lambda$getArchiveDateEvents$2$VideoViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getArchiveDateEvents$2$VideoViewModel(Resource resource) throws Exception {
        this.eventsMutableLiveData.setValue(resource);
    }

    public MutableLiveData<Resource<VideoEventsList>> getEventsMutableLiveData() {
        return this.eventsMutableLiveData;
    }

    public void getArchiveStreamUrl(String str, String str2, String str3) {
        this.compositeDisposable.add(this.remoteRepository.getArchiveStream(str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            public final void accept(Object obj) {
                VideoViewModel.this.lambda$getArchiveStreamUrl$3$VideoViewModel((Resource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$getArchiveStreamUrl$3$VideoViewModel(Resource resource) throws Exception {
        this.urlMutableLiveData.setValue(resource);
    }

    public MutableLiveData<Resource<VideoUrl>> getUrlMutableLiveData() {
        return this.urlMutableLiveData;
    }

    public MutableLiveData<String> getShowUrl() {
        return this.showUrl;
    }
}
