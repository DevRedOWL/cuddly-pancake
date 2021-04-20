package p035ru.unicorn.ujin.viewModel;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.AcceptanceDate;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.data.repository.RealmRepository;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceDatesEvent;
import p035ru.unicorn.ujin.viewModel.events.AcceptanceStateEvent;
import p035ru.unicorn.ujin.viewModel.events.DeviceActionEvent;
import p035ru.unicorn.ujin.viewModel.events.GetHardwareCountEvent;
import p035ru.unicorn.ujin.viewModel.events.NewsListEvent;
import p035ru.unicorn.ujin.viewModel.events.OnAddSDeviceActionEvent;
import p035ru.unicorn.ujin.viewModel.events.ProfileDeleteEvent;
import p035ru.unicorn.ujin.viewModel.events.ProfileSubAccountUpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.ProfileUpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateFavouriteEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateSearchFavouriteFlatEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmResults;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0!J0\u0010S\u001a\u00020N2\b\u0010T\u001a\u0004\u0018\u00010P2\b\u0010U\u001a\u0004\u0018\u00010P2\u0014\u0010V\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P\u0018\u00010WJ\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0!J\u000e\u0010Z\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u0016\u0010[\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010\\\u001a\u00020]J\b\u0010^\u001a\u0004\u0018\u00010_J\u0010\u0010`\u001a\u0004\u0018\u00010\"2\u0006\u0010a\u001a\u00020PJ\u0010\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020PJ\u001c\u0010e\u001a\u0010\u0012\f\u0012\n g*\u0004\u0018\u00010f0f0!2\u0006\u0010d\u001a\u00020PJ\u0016\u0010h\u001a\u0012\u0012\u0004\u0012\u00020c0ij\b\u0012\u0004\u0012\u00020c`jJ\u0006\u0010k\u001a\u00020PJ\u0010\u0010l\u001a\u0004\u0018\u00010f2\u0006\u0010T\u001a\u00020PJ\u0010\u0010m\u001a\u0004\u0018\u00010n2\u0006\u0010T\u001a\u00020PJ\u0016\u0010o\u001a\u00020N2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020P0iH\u0007J\f\u0010q\u001a\b\u0012\u0004\u0012\u00020R0!J\u0016\u0010q\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010r\u001a\u00020PJ\f\u0010s\u001a\b\u0012\u0004\u0012\u00020t0!J\b\u0010u\u001a\u0004\u0018\u00010vJ\u0010\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010y\u001a\u00020PJ\u0018\u0010z\u001a\u0004\u0018\u00010v2\u0006\u0010T\u001a\u00020P2\u0006\u0010{\u001a\u00020|J\b\u0010}\u001a\u0004\u0018\u00010~J\u0012\u0010\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020PJ\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010!J\u0010\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010!J\t\u0010\u0001\u001a\u00020NH\u0002J\u0017\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010\\\u001a\u00020]J\u0018\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020PJ2\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\t\u0010\u0001\u001a\u0004\u0018\u00010|¢\u0006\u0003\u0010\u0001J\u000f\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ \u0001\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010T\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020PJ\u000f\u0010 \u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u0018\u0010¡\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020PJ\u0018\u0010¢\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020PJ\u000f\u0010£\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u0017\u0010¤\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010d\u001a\u00020PJ\u000f\u0010¥\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\"\u0010¦\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010T\u001a\u00020P2\t\u0010\u0001\u001a\u0004\u0018\u00010PJ\u000f\u0010§\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020PJ\u0017\u0010¨\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010y\u001a\u00020PJ*\u0010©\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010y\u001a\u00020P2\b\u0010ª\u0001\u001a\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020|J\u001f\u0010­\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010T\u001a\u00020P2\u0006\u0010{\u001a\u00020|J$\u0010®\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0013\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0WJx\u0010°\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\t\u0010±\u0001\u001a\u0004\u0018\u00010P2\t\u0010²\u0001\u001a\u0004\u0018\u00010P2\t\u0010³\u0001\u001a\u0004\u0018\u00010P2\t\u0010´\u0001\u001a\u0004\u0018\u00010P2\t\u0010µ\u0001\u001a\u0004\u0018\u00010P2\t\u0010¶\u0001\u001a\u0004\u0018\u00010|2\t\u0010·\u0001\u001a\u0004\u0018\u00010P2\t\u0010¸\u0001\u001a\u0004\u0018\u00010P2\t\u0010¹\u0001\u001a\u0004\u0018\u00010P¢\u0006\u0003\u0010º\u0001J\u0018\u0010»\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020PJ!\u0010¼\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\b\u0010a\u001a\u0004\u0018\u00010P2\u0006\u0010\\\u001a\u00020]J\u0010\u0010½\u0001\u001a\u00020N2\u0007\u0010¾\u0001\u001a\u00020nJ\"\u0010¿\u0001\u001a\u00020N2\u0006\u0010T\u001a\u00020P2\u0007\u0010¬\u0001\u001a\u00020|2\b\u0010À\u0001\u001a\u00030Á\u0001J#\u0010Â\u0001\u001a\u00020N2\u0007\u0010¾\u0001\u001a\u00020n2\u0007\u0010¬\u0001\u001a\u00020|2\b\u0010À\u0001\u001a\u00030Á\u0001J\u0010\u0010Ã\u0001\u001a\u00020N2\u0007\u0010Ä\u0001\u001a\u00020tJ\u001a\u0010Å\u0001\u001a\u00020N2\u0007\u0010Ä\u0001\u001a\u00020t2\b\u0010À\u0001\u001a\u00030Á\u0001J\u001a\u0010Æ\u0001\u001a\u00020N2\u0007\u0010Ç\u0001\u001a\u00020x2\b\u0010À\u0001\u001a\u00030Á\u0001J\u001a\u0010È\u0001\u001a\u00020N2\u0007\u0010Ç\u0001\u001a\u00020x2\b\u0010À\u0001\u001a\u00030Á\u0001J\u001b\u0010É\u0001\u001a\u00020N2\b\u0010Ê\u0001\u001a\u00030\u00012\b\u0010À\u0001\u001a\u00030Á\u0001J\u0012\u0010Ë\u0001\u001a\u00020N2\u0007\u0010Ì\u0001\u001a\u000202H\u0002J!\u0010Í\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\b\u0010a\u001a\u0004\u0018\u00010P2\u0006\u0010\\\u001a\u00020]R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR%\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\fR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\fR\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\fR\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\fR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0019R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\fR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0019R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\fR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\fR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\fR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\fR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0019¨\u0006Î\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/RealmViewModel;", "", "realmRepository", "Lru/unicorn/ujin/data/repository/RealmRepository;", "context", "Landroid/content/Context;", "(Lru/unicorn/ujin/data/repository/RealmRepository;Landroid/content/Context;)V", "applyMortgageLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "getApplyMortgageLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "cityListUpdateMutableLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getCityListUpdateMutableLiveData", "complexListUpdateMutableLiveData", "getComplexListUpdateMutableLiveData", "favouriteFlatUpdateMutableLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateFavouriteEvent;", "getFavouriteFlatUpdateMutableLiveData", "getHardwareMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/unicorn/ujin/viewModel/events/GetHardwareCountEvent;", "getGetHardwareMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "localRepository", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "getLocalRepository", "()Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "modelUpdateMutableLiveData", "getModelUpdateMutableLiveData", "mortgageListLiveData", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "getMortgageListLiveData", "newsListMutableLiveData", "Lru/unicorn/ujin/viewModel/events/NewsListEvent;", "getNewsListMutableLiveData", "profileDeleteMutableLiveData", "Lru/unicorn/ujin/viewModel/events/ProfileDeleteEvent;", "getProfileDeleteMutableLiveData", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getProfileLocalRepository", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "profileUpdateMutableLiveData", "Lru/unicorn/ujin/viewModel/events/ProfileUpdateEvent;", "getProfileUpdateMutableLiveData", "profileUpdateSubAccountMutableLiveData", "Lru/unicorn/ujin/viewModel/events/ProfileSubAccountUpdateEvent;", "getProfileUpdateSubAccountMutableLiveData", "requestAcceptanceDatesMutableLiveData", "Lru/unicorn/ujin/viewModel/events/AcceptanceDatesEvent;", "getRequestAcceptanceDatesMutableLiveData", "requestAcceptanceStateMutableLiveData", "Lru/unicorn/ujin/viewModel/events/AcceptanceStateEvent;", "getRequestAcceptanceStateMutableLiveData", "requestAddDeviceActionMutableLiveData", "Lru/unicorn/ujin/viewModel/events/OnAddSDeviceActionEvent;", "getRequestAddDeviceActionMutableLiveData", "requestBookFlatMutableLiveData", "getRequestBookFlatMutableLiveData", "requestDeviceActionMutableLiveData", "Lru/unicorn/ujin/viewModel/events/DeviceActionEvent;", "getRequestDeviceActionMutableLiveData", "requestRentFlatMutableLiveData", "getRequestRentFlatMutableLiveData", "requestSellFlatMutableLiveData", "getRequestSellFlatMutableLiveData", "requestVisitFlatMutableLiveData", "getRequestVisitFlatMutableLiveData", "searchFavouriteFlatUpdateMutableLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateSearchFavouriteFlatEvent;", "getSearchFavouriteFlatUpdateMutableLiveData", "subAccountsErrorsMutableLiveData", "getSubAccountsErrorsMutableLiveData", "addDevice", "", "token", "", "devices", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "applyForMortgage", "complexId", "mortgageId", "form", "", "getAcceptanceDates", "Lru/unicorn/ujin/data/realm/AcceptanceDate;", "getAcceptanceState", "getAcceptanceTimeSlots", "date", "Ljava/util/Date;", "getApartmentState", "Lru/unicorn/ujin/data/realm/ApartmentState;", "getBannerById", "id", "getCityById", "Lru/unicorn/ujin/data/realm/City;", "cityId", "getCityComplexList", "Lru/unicorn/ujin/data/realm/Complex;", "kotlin.jvm.PlatformType", "getCityList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCityTitle", "getComplexById", "getComplexInfoById", "Lru/unicorn/ujin/data/realm/ComplexInfo;", "getContextBannerList", "contexts", "getDevice", "deviceClass", "getFavouritesList", "Lru/unicorn/ujin/data/realm/Favourite;", "getFilterFlatList", "Lru/unicorn/ujin/data/realm/GetFlatsResponseData;", "getFlatById", "Lru/unicorn/ujin/data/realm/Flat;", "flatId", "getFlatList", "roomCount", "", "getManagerChat", "Lru/unicorn/ujin/data/realm/Chat;", "getNewsById", "Lru/unicorn/ujin/data/realm/News;", "newsId", "getNewsList", "getTimeSlots", "Lru/unicorn/ujin/data/realm/TimeSlot;", "pushSubscribe", "removeTime", "requestBookFlat", "uid", "requestChatList", "offset", "limit", "serviceType", "(Ljava/lang/String;IILjava/lang/Integer;)V", "requestDeleteUser", "requestFilterFlatList", "studia", "one", "two", "three", "four", "buildingId", "sectionId", "squareMin", "squareMax", "floorMin", "floorMax", "priceMin", "", "priceMax", "sales", "finish", "requestHardware", "requestRentFlat", "requestSellFlat", "requestUpdateAcceptanceDates", "requestUpdateCityComplexList", "requestUpdateCityList", "requestUpdateComplexInfo", "requestUpdateFavouritesList", "requestUpdateFlatById", "requestUpdateFlatFavourite", "favouriteFlag", "", "position", "requestUpdateFlatList", "requestUpdatePartProfile", "params", "requestUpdateProfile", "surname", "name", "patronimic", "phone", "mail", "profilePrivacy", "inputname", "base64", "birthday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "requestVisitFlat", "reserveTime", "updateComplexInfoByteImageList", "complexInfo", "updateComplexInfoMortrageImage", "bytes", "", "updateComplexInfoPicture", "updateFavourite", "favourite", "updateFavouriteSmallPic", "updateFlatBigPic", "flat", "updateFlatSmallImage", "updateNewspiecePicture", "newspiece", "updateSubAccountList", "event", "updateTime", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.RealmViewModel */
/* compiled from: RealmViewModel.kt */
public final class RealmViewModel {
    private final SingleLiveEvent<Resource<SimpleResponse>> applyMortgageLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> cityListUpdateMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> complexListUpdateMutableLiveData = new SingleLiveEvent<>();
    private final Context context;
    private final SingleLiveEvent<UpdateFavouriteEvent> favouriteFlatUpdateMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<GetHardwareCountEvent> getHardwareMutableLiveData = new MutableLiveData<>();
    private final LocalRepository localRepository;
    private final SingleLiveEvent<UpdateEvent> modelUpdateMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<List<ContextBanner>>> mortgageListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<NewsListEvent> newsListMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<ProfileDeleteEvent> profileDeleteMutableLiveData = new MutableLiveData<>();
    private final ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private final SingleLiveEvent<ProfileUpdateEvent> profileUpdateMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<ProfileSubAccountUpdateEvent> profileUpdateSubAccountMutableLiveData = new MutableLiveData<>();
    private final RealmRepository realmRepository;
    private final SingleLiveEvent<AcceptanceDatesEvent> requestAcceptanceDatesMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<AcceptanceStateEvent> requestAcceptanceStateMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<OnAddSDeviceActionEvent> requestAddDeviceActionMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<UpdateEvent> requestBookFlatMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<DeviceActionEvent> requestDeviceActionMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<UpdateEvent> requestRentFlatMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> requestSellFlatMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> requestVisitFlatMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateSearchFavouriteFlatEvent> searchFavouriteFlatUpdateMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<UpdateEvent> subAccountsErrorsMutableLiveData = new MutableLiveData<>();

    public final void getDevice(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "deviceClass");
    }

    public RealmViewModel(RealmRepository realmRepository2, Context context2) {
        Intrinsics.checkNotNullParameter(realmRepository2, "realmRepository");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.realmRepository = realmRepository2;
        this.context = context2;
        LocalRepository instance = LocalRepository.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "LocalRepository.getInstance()");
        this.localRepository = instance;
        this.realmRepository.getModelSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getModelUpdateMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getCityListSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getCityListUpdateMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getComplexListSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getComplexListUpdateMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getGhostRegisterSubject().subscribe(new Consumer<RegisterGhostEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(RegisterGhostEvent registerGhostEvent) {
                this.this$0.getProfileLocalRepository().registerGhostUser(registerGhostEvent.getToken());
            }
        });
        this.realmRepository.getProfileUpdateSubject().subscribe(new Consumer<ProfileUpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ProfileUpdateEvent profileUpdateEvent) {
                this.this$0.getProfileUpdateMutableLiveData().setValue(profileUpdateEvent);
            }
        });
        this.realmRepository.getProfileDeleteSubject().subscribe(new Consumer<ProfileDeleteEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ProfileDeleteEvent profileDeleteEvent) {
                this.this$0.getProfileDeleteMutableLiveData().setValue(profileDeleteEvent);
            }
        });
        this.realmRepository.getProfileSubAccountUpdateSubject().subscribe(new Consumer<ProfileSubAccountUpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ProfileSubAccountUpdateEvent profileSubAccountUpdateEvent) {
                RealmViewModel realmViewModel = this.this$0;
                Intrinsics.checkNotNullExpressionValue(profileSubAccountUpdateEvent, "event");
                realmViewModel.updateSubAccountList(profileSubAccountUpdateEvent);
            }
        });
        this.realmRepository.getSubAccountErrorsSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getSubAccountsErrorsMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getModelFavouriteSubject().subscribe(new Consumer<UpdateFavouriteEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateFavouriteEvent updateFavouriteEvent) {
                this.this$0.getFavouriteFlatUpdateMutableLiveData().setValue(updateFavouriteEvent);
            }
        });
        this.realmRepository.getModelSearchFavouriteSubject().subscribe(new Consumer<UpdateSearchFavouriteFlatEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateSearchFavouriteFlatEvent updateSearchFavouriteFlatEvent) {
                this.this$0.getSearchFavouriteFlatUpdateMutableLiveData().setValue(updateSearchFavouriteFlatEvent);
            }
        });
        this.realmRepository.getBookFlatSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getRequestBookFlatMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getVisitFlatSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getRequestVisitFlatMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getAcceptanceStateSubject().subscribe(new Consumer<AcceptanceStateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(AcceptanceStateEvent acceptanceStateEvent) {
                this.this$0.getRequestAcceptanceStateMutableLiveData().setValue(acceptanceStateEvent);
            }
        });
        this.realmRepository.getAcceptanceDatesSubject().subscribe(new Consumer<AcceptanceDatesEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(AcceptanceDatesEvent acceptanceDatesEvent) {
                this.this$0.getRequestAcceptanceDatesMutableLiveData().setValue(acceptanceDatesEvent);
            }
        });
        this.realmRepository.getDeviceSubject().subscribe(new Consumer<DeviceActionEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(DeviceActionEvent deviceActionEvent) {
                this.this$0.getRequestDeviceActionMutableLiveData().setValue(deviceActionEvent);
            }
        });
        this.realmRepository.getAdDDeviceSubject().subscribe(new Consumer<OnAddSDeviceActionEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(OnAddSDeviceActionEvent onAddSDeviceActionEvent) {
                this.this$0.getRequestAddDeviceActionMutableLiveData().setValue(onAddSDeviceActionEvent);
            }
        });
        this.realmRepository.getGetHardwareSubject().subscribe(new Consumer<GetHardwareCountEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(GetHardwareCountEvent getHardwareCountEvent) {
                this.this$0.getGetHardwareMutableLiveData().setValue(getHardwareCountEvent);
            }
        });
        this.realmRepository.getNewsListSubject().subscribe(new Consumer<NewsListEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(NewsListEvent newsListEvent) {
                this.this$0.getNewsListMutableLiveData().setValue(newsListEvent);
            }
        });
        this.realmRepository.getSellFlatSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getRequestSellFlatMutableLiveData().setValue(updateEvent);
            }
        });
        this.realmRepository.getRentFlatSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ RealmViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                this.this$0.getRequestRentFlatMutableLiveData().setValue(updateEvent);
            }
        });
    }

    public final SingleLiveEvent<UpdateEvent> getModelUpdateMutableLiveData() {
        return this.modelUpdateMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getCityListUpdateMutableLiveData() {
        return this.cityListUpdateMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getComplexListUpdateMutableLiveData() {
        return this.complexListUpdateMutableLiveData;
    }

    public final MutableLiveData<ProfileSubAccountUpdateEvent> getProfileUpdateSubAccountMutableLiveData() {
        return this.profileUpdateSubAccountMutableLiveData;
    }

    public final SingleLiveEvent<ProfileUpdateEvent> getProfileUpdateMutableLiveData() {
        return this.profileUpdateMutableLiveData;
    }

    public final MutableLiveData<ProfileDeleteEvent> getProfileDeleteMutableLiveData() {
        return this.profileDeleteMutableLiveData;
    }

    public final SingleLiveEvent<UpdateFavouriteEvent> getFavouriteFlatUpdateMutableLiveData() {
        return this.favouriteFlatUpdateMutableLiveData;
    }

    public final SingleLiveEvent<UpdateSearchFavouriteFlatEvent> getSearchFavouriteFlatUpdateMutableLiveData() {
        return this.searchFavouriteFlatUpdateMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getRequestBookFlatMutableLiveData() {
        return this.requestBookFlatMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getRequestVisitFlatMutableLiveData() {
        return this.requestVisitFlatMutableLiveData;
    }

    public final SingleLiveEvent<AcceptanceStateEvent> getRequestAcceptanceStateMutableLiveData() {
        return this.requestAcceptanceStateMutableLiveData;
    }

    public final SingleLiveEvent<AcceptanceDatesEvent> getRequestAcceptanceDatesMutableLiveData() {
        return this.requestAcceptanceDatesMutableLiveData;
    }

    public final MutableLiveData<DeviceActionEvent> getRequestDeviceActionMutableLiveData() {
        return this.requestDeviceActionMutableLiveData;
    }

    public final MutableLiveData<OnAddSDeviceActionEvent> getRequestAddDeviceActionMutableLiveData() {
        return this.requestAddDeviceActionMutableLiveData;
    }

    public final MutableLiveData<GetHardwareCountEvent> getGetHardwareMutableLiveData() {
        return this.getHardwareMutableLiveData;
    }

    public final MutableLiveData<UpdateEvent> getSubAccountsErrorsMutableLiveData() {
        return this.subAccountsErrorsMutableLiveData;
    }

    public final SingleLiveEvent<NewsListEvent> getNewsListMutableLiveData() {
        return this.newsListMutableLiveData;
    }

    public final SingleLiveEvent<Resource<List<ContextBanner>>> getMortgageListLiveData() {
        return this.mortgageListLiveData;
    }

    public final SingleLiveEvent<Resource<SimpleResponse>> getApplyMortgageLiveData() {
        return this.applyMortgageLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getRequestSellFlatMutableLiveData() {
        return this.requestSellFlatMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getRequestRentFlatMutableLiveData() {
        return this.requestRentFlatMutableLiveData;
    }

    public final ProfileLocalRepository getProfileLocalRepository() {
        return this.profileLocalRepository;
    }

    public final LocalRepository getLocalRepository() {
        return this.localRepository;
    }

    private final void pushSubscribe() {
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
        instance.getInstanceId().addOnCompleteListener(RealmViewModel$pushSubscribe$1.INSTANCE);
    }

    public final List<News> getNewsList() {
        return CollectionsKt.sortedWith(this.realmRepository.getNewsList(), new RealmViewModel$getNewsList$1());
    }

    public final void updateNewspiecePicture(News news, byte[] bArr) {
        Intrinsics.checkNotNullParameter(news, "newspiece");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateNewspiecePicture(news, bArr);
    }

    public final String getCityTitle() {
        return this.realmRepository.getCityTitle();
    }

    public final News getNewsById(String str) {
        Intrinsics.checkNotNullParameter(str, NewspieceFragment.NEWS_ID);
        return this.realmRepository.getNewspieceById(str);
    }

    public final List<Favourite> getFavouritesList() {
        return CollectionsKt.toList(this.realmRepository.getFavouritesList());
    }

    public final void requestUpdateFavouritesList(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestUpdateFavouritesList(str);
    }

    public final void updateFavourite(Favourite favourite) {
        Intrinsics.checkNotNullParameter(favourite, "favourite");
        this.realmRepository.updateFavourite(favourite);
    }

    public final void updateFavouriteSmallPic(Favourite favourite, byte[] bArr) {
        Intrinsics.checkNotNullParameter(favourite, "favourite");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateFavouriteSmallPic(favourite, bArr);
    }

    public final Flat getFlatById(String str) {
        Intrinsics.checkNotNullParameter(str, "flatId");
        return this.realmRepository.getFlatById(str);
    }

    public final void requestUpdateFlatById(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "flatId");
        this.realmRepository.requestUpdateFlatById(str, str2);
    }

    public final void requestUpdateFlatFavourite(String str, String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "flatId");
        this.realmRepository.requestUpdateFlatFavourite(str, str2, z, i);
    }

    public final void requestUpdateCityList(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestUpdateCityList(str);
    }

    public final ArrayList<City> getCityList() {
        return this.realmRepository.getCityList();
    }

    public final City getCityById(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        return this.realmRepository.getCityById(str);
    }

    public final void requestUpdateCityComplexList(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, Complex.Fields.cityId);
        this.realmRepository.requestUpdateCityComplexList(str, str2);
    }

    public final List<Complex> getCityComplexList(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        RealmResults<Complex> cityComplexList = this.realmRepository.getCityComplexList(str);
        Intrinsics.checkNotNullExpressionValue(cityComplexList, "realmRepository.getCityComplexList(cityId)");
        return CollectionsKt.toList(cityComplexList);
    }

    public final Complex getComplexById(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        return this.realmRepository.getComplexById(str);
    }

    public final ComplexInfo getComplexInfoById(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        return this.realmRepository.getComplexInfoById(str);
    }

    public final void updateComplexInfoPicture(ComplexInfo complexInfo, int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(complexInfo, "complexInfo");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateComplexInfoPicture(complexInfo, i, bArr);
    }

    public final void requestUpdateComplexInfo(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        this.realmRepository.requestUpdateComplexInfo(str, str2, str3);
    }

    public final void updateComplexInfoByteImageList(ComplexInfo complexInfo) {
        Intrinsics.checkNotNullParameter(complexInfo, "complexInfo");
        this.realmRepository.updateComplexInfoByteImageList(complexInfo);
    }

    public final void updateComplexInfoMortrageImage(String str, int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateComplexInfoMortrageImage(str, i, bArr);
    }

    public final void requestUpdateFlatList(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        this.realmRepository.requestUpdateFlatList(str, str2, i);
    }

    public final GetFlatsResponseData getFlatList(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        return this.realmRepository.getFlatList(str, i);
    }

    public final void updateFlatSmallImage(Flat flat, byte[] bArr) {
        Intrinsics.checkNotNullParameter(flat, "flat");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateFlatSmallImage(flat, bArr);
    }

    public final void updateFlatBigPic(Flat flat, byte[] bArr) {
        Intrinsics.checkNotNullParameter(flat, "flat");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.realmRepository.updateFlatBigImage(flat, bArr);
    }

    public final void requestFilterFlatList(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, int i6, int i7, int i8, int i9, long j, long j2, String str5, String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        Intrinsics.checkNotNullParameter(str3, "buildingId");
        Intrinsics.checkNotNullParameter(str4, "sectionId");
        Intrinsics.checkNotNullParameter(str5, "sales");
        Intrinsics.checkNotNullParameter(str6, "finish");
        this.realmRepository.requestFilterFlatList(str7, str2, i, i2, i3, i4, i5, str3, str4, i6, i7, i8, i9, j, j2, str5, str6);
    }

    public final GetFlatsResponseData getFilterFlatList() {
        return this.realmRepository.getFilterFlatList();
    }

    public final void requestChatList(String str, int i, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestChatList(str, i, i2, num);
    }

    public final Chat getManagerChat() {
        return this.realmRepository.getManagertChat();
    }

    public final void requestBookFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        this.realmRepository.bookFlat(str, str2);
    }

    public final void requestVisitFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        this.realmRepository.visitFlat(str, str2);
    }

    public final void requestSellFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        this.realmRepository.sellFlat(str, str2);
    }

    public final void requestRentFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        this.realmRepository.rentFlat(str, str2);
    }

    /* access modifiers changed from: private */
    public final void updateSubAccountList(ProfileSubAccountUpdateEvent profileSubAccountUpdateEvent) {
        if (profileSubAccountUpdateEvent.getSuccess()) {
            this.profileLocalRepository.setSubAccounts(profileSubAccountUpdateEvent.getSubAccountList());
        }
        this.profileUpdateSubAccountMutableLiveData.setValue(profileSubAccountUpdateEvent);
    }

    public final void getAcceptanceState(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.getAcceptanceState(str);
    }

    public final ApartmentState getApartmentState() {
        return this.realmRepository.getApartmentState();
    }

    public final void getAcceptanceTimeSlots(String str, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        this.realmRepository.getAcceptanceTimeSlots(str, date);
    }

    public final List<TimeSlot> getTimeSlots() {
        return this.realmRepository.getTimeSlots();
    }

    public final void removeTime(String str, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        this.realmRepository.removeTime(str, date);
    }

    public final void reserveTime(String str, String str2, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        this.realmRepository.reserveTime(str, str2, date);
    }

    public final void updateTime(String str, String str2, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        this.realmRepository.updateTime(str, str2, date);
    }

    public final void requestUpdateAcceptanceDates(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestUpdateAcceptanceDates(str);
    }

    public final List<AcceptanceDate> getAcceptanceDates() {
        return this.realmRepository.getAcceptanceDates();
    }

    public final void requestUpdateProfile(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestUpdateProfile(str, str2, str3, str4, str5, str6, num, str7, str8, str9);
    }

    public final void requestUpdatePartProfile(String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(map, "params");
        this.realmRepository.requestUpdatePartProfile(str, map);
    }

    public final void requestDeleteUser(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestDeleteUser(str);
    }

    public final List<DeviceModel> getDevice() {
        return this.realmRepository.getDevicesUnmanaged();
    }

    public final void addDevice(String str, List<? extends DeviceModel> list) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(list, "devices");
        this.realmRepository.addDeviceList(str, list);
    }

    public final void requestHardware(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.realmRepository.requestHardware(str);
    }

    public final void getContextBannerList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "contexts");
        this.realmRepository.getContextBannerList(this.profileLocalRepository.getUserToken(), arrayList).doOnNext(new RealmViewModel$getContextBannerList$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmViewModel$getContextBannerList$2(this));
    }

    public final ContextBanner getBannerById(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return this.realmRepository.getBannerById(str);
    }

    public final void applyForMortgage(String str, String str2, Map<String, String> map) {
        this.realmRepository.applyForMortgage(this.profileLocalRepository.getUserToken(), str, str2, map).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmViewModel$applyForMortgage$1(this));
    }
}
