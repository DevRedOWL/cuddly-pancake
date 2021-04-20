package p035ru.unicorn.ujin.data.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.AcceptanceDate;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.CityTitle;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.market.loan.GetBannerRequestBody;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
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
import p035ru.unicorn.ujin.viewModel.events.chats.ChatListEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.Realm;
import p046io.realm.RealmModel;
import p046io.realm.RealmQuery;
import p046io.realm.RealmResults;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MJD\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0P2\u0006\u0010J\u001a\u00020K2\b\u0010S\u001a\u0004\u0018\u00010K2\b\u0010T\u001a\u0004\u0018\u00010K2\u0014\u0010U\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020K\u0018\u00010VJ\u0016\u0010W\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010X\u001a\u00020KJ\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0MJ\u000e\u0010[\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u0016\u0010[\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010\\\u001a\u00020]J\u0016\u0010^\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010\\\u001a\u00020]J\b\u0010_\u001a\u0004\u0018\u00010`J\u0010\u0010a\u001a\u0004\u0018\u00010b2\u0006\u0010c\u001a\u00020KJ\u0014\u0010d\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010e0e0MJ\u0010\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020KJ2\u0010i\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010k0k \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010k0k\u0018\u00010j0j2\u0006\u0010h\u001a\u00020KJ\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020g0mj\b\u0012\u0004\u0012\u00020g`nJ\u0006\u0010o\u001a\u00020KJ\u0010\u0010p\u001a\u0004\u0018\u00010k2\u0006\u0010S\u001a\u00020KJ\u0010\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010S\u001a\u00020KJ:\u0010s\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010b0M0Q0P2\u0006\u0010J\u001a\u00020K2\u0016\u0010t\u001a\u0012\u0012\u0004\u0012\u00020K0mj\b\u0012\u0004\u0012\u00020K`nJ\f\u0010u\u001a\b\u0012\u0004\u0012\u00020N0MJ\f\u0010v\u001a\b\u0012\u0004\u0012\u00020N0MJ\f\u0010w\u001a\b\u0012\u0004\u0012\u00020x0MJ\b\u0010y\u001a\u0004\u0018\u00010zJ\u0010\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010}\u001a\u00020KJ\u0019\u0010~\u001a\u0004\u0018\u00010z2\u0006\u0010S\u001a\u00020K2\u0007\u0010\u001a\u00030\u0001J\t\u0010\u0001\u001a\u0004\u0018\u00010eJ\u0019\u0010\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u00010mj\t\u0012\u0005\u0012\u00030\u0001`nJ\u0013\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020KJ\u0010\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010MJ\u0017\u0010\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010\\\u001a\u00020]J\u0017\u0010\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010X\u001a\u00020KJ5\u0010\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010\u0001J\u000f\u0010\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ©\u0001\u0010\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010S\u001a\u00020K2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020K2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020K2\u0007\u0010 \u0001\u001a\u00020KJ\u000f\u0010¡\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u000f\u0010¢\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u0017\u0010£\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010h\u001a\u00020KJ\u000f\u0010¤\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\"\u0010¥\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010S\u001a\u00020K2\t\u0010\u0001\u001a\u0004\u0018\u00010KJ\u000f\u0010¦\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u0017\u0010§\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010}\u001a\u00020KJ+\u0010¨\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010}\u001a\u00020K2\b\u0010©\u0001\u001a\u00030ª\u00012\b\u0010«\u0001\u001a\u00030\u0001J \u0010¬\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010S\u001a\u00020K2\u0007\u0010\u001a\u00030\u0001J$\u0010­\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0013\u0010®\u0001\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020K0VJy\u0010¯\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\t\u0010°\u0001\u001a\u0004\u0018\u00010K2\t\u0010±\u0001\u001a\u0004\u0018\u00010K2\t\u0010²\u0001\u001a\u0004\u0018\u00010K2\t\u0010³\u0001\u001a\u0004\u0018\u00010K2\t\u0010´\u0001\u001a\u0004\u0018\u00010K2\n\u0010µ\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010¶\u0001\u001a\u0004\u0018\u00010K2\t\u0010·\u0001\u001a\u0004\u0018\u00010K2\t\u0010¸\u0001\u001a\u0004\u0018\u00010K¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ!\u0010»\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010K2\u0006\u0010\\\u001a\u00020]J\u0017\u0010¼\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010X\u001a\u00020KJ\t\u0010½\u0001\u001a\u00020IH\u0002J\u0010\u0010¾\u0001\u001a\u00020I2\u0007\u0010¿\u0001\u001a\u00020rJ#\u0010À\u0001\u001a\u00020I2\u0006\u0010S\u001a\u00020K2\b\u0010Á\u0001\u001a\u00030\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001J$\u0010Ä\u0001\u001a\u00020I2\u0007\u0010¿\u0001\u001a\u00020r2\b\u0010Á\u0001\u001a\u00030\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001J\u0010\u0010Å\u0001\u001a\u00020I2\u0007\u0010Æ\u0001\u001a\u00020xJ\u001a\u0010Ç\u0001\u001a\u00020I2\u0007\u0010Æ\u0001\u001a\u00020x2\b\u0010Â\u0001\u001a\u00030Ã\u0001J\u001a\u0010È\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020|2\b\u0010Â\u0001\u001a\u00030Ã\u0001J\u001a\u0010Ê\u0001\u001a\u00020I2\u0007\u0010É\u0001\u001a\u00020|2\b\u0010Â\u0001\u001a\u00030Ã\u0001J\u001b\u0010Ë\u0001\u001a\u00020I2\b\u0010Ì\u0001\u001a\u00030\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001J!\u0010Í\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\b\u0010c\u001a\u0004\u0018\u00010K2\u0006\u0010\\\u001a\u00020]J\u0017\u0010Î\u0001\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010X\u001a\u00020KR5\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR5\u0010\u000b\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR5\u0010\u000e\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R5\u0010\u0013\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR5\u0010\u0016\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00170\u0017 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR5\u0010\u0019\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR5\u0010\u001b\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR5\u0010\u001d\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u001e0\u001e \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR5\u0010 \u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010!0! \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010!0!\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR5\u0010#\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010$0$ \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010$0$\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR5\u0010&\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010'0' \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010'0'\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR5\u0010)\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010*0* \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010*0*\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR5\u0010,\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\nR5\u0010.\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010/0/ \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010/0/\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR5\u00101\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010202 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010202\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\nR5\u00104\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010505 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010505\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR5\u00107\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010808 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010808\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\nR\u001b\u0010:\u001a\u00020;8BX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=R5\u0010@\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\nR5\u0010B\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\nR5\u0010D\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\nR5\u0010F\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\n¨\u0006Ï\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/RealmRepository;", "", "api", "Lru/unicorn/ujin/data/api/Pro100Api;", "(Lru/unicorn/ujin/data/api/Pro100Api;)V", "acceptanceDatesSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/AcceptanceDatesEvent;", "kotlin.jvm.PlatformType", "getAcceptanceDatesSubject", "()Lio/reactivex/subjects/PublishSubject;", "acceptanceStateSubject", "Lru/unicorn/ujin/viewModel/events/AcceptanceStateEvent;", "getAcceptanceStateSubject", "adDDeviceSubject", "Lru/unicorn/ujin/viewModel/events/OnAddSDeviceActionEvent;", "getAdDDeviceSubject", "getApi", "()Lru/unicorn/ujin/data/api/Pro100Api;", "bookFlatSubject", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getBookFlatSubject", "chatListSubject", "Lru/unicorn/ujin/viewModel/events/chats/ChatListEvent;", "getChatListSubject", "cityListSubject", "getCityListSubject", "complexListSubject", "getComplexListSubject", "deviceSubject", "Lru/unicorn/ujin/viewModel/events/DeviceActionEvent;", "getDeviceSubject", "getHardwareSubject", "Lru/unicorn/ujin/viewModel/events/GetHardwareCountEvent;", "getGetHardwareSubject", "ghostRegisterSubject", "Lru/unicorn/ujin/viewModel/events/RegisterGhostEvent;", "getGhostRegisterSubject", "modelFavouriteSubject", "Lru/unicorn/ujin/viewModel/events/UpdateFavouriteEvent;", "getModelFavouriteSubject", "modelSearchFavouriteSubject", "Lru/unicorn/ujin/viewModel/events/UpdateSearchFavouriteFlatEvent;", "getModelSearchFavouriteSubject", "modelSubject", "getModelSubject", "newsListSubject", "Lru/unicorn/ujin/viewModel/events/NewsListEvent;", "getNewsListSubject", "profileDeleteSubject", "Lru/unicorn/ujin/viewModel/events/ProfileDeleteEvent;", "getProfileDeleteSubject", "profileSubAccountUpdateSubject", "Lru/unicorn/ujin/viewModel/events/ProfileSubAccountUpdateEvent;", "getProfileSubAccountUpdateSubject", "profileUpdateSubject", "Lru/unicorn/ujin/viewModel/events/ProfileUpdateEvent;", "getProfileUpdateSubject", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "realm$delegate", "Lkotlin/Lazy;", "rentFlatSubject", "getRentFlatSubject", "sellFlatSubject", "getSellFlatSubject", "subAccountErrorsSubject", "getSubAccountErrorsSubject", "visitFlatSubject", "getVisitFlatSubject", "addDeviceList", "", "token", "", "devices", "", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "applyForMortgage", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "complexId", "mortgageId", "form", "", "bookFlat", "uid", "getAcceptanceDates", "Lru/unicorn/ujin/data/realm/AcceptanceDate;", "getAcceptanceState", "date", "Ljava/util/Date;", "getAcceptanceTimeSlots", "getApartmentState", "Lru/unicorn/ujin/data/realm/ApartmentState;", "getBannerById", "Lru/unicorn/ujin/data/realm/ContextBanner;", "id", "getChatList", "Lru/unicorn/ujin/data/realm/Chat;", "getCityById", "Lru/unicorn/ujin/data/realm/City;", "cityId", "getCityComplexList", "Lio/realm/RealmResults;", "Lru/unicorn/ujin/data/realm/Complex;", "getCityList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCityTitle", "getComplexById", "getComplexInfoById", "Lru/unicorn/ujin/data/realm/ComplexInfo;", "getContextBannerList", "contexts", "getDevices", "getDevicesUnmanaged", "getFavouritesList", "Lru/unicorn/ujin/data/realm/Favourite;", "getFilterFlatList", "Lru/unicorn/ujin/data/realm/GetFlatsResponseData;", "getFlatById", "Lru/unicorn/ujin/data/realm/Flat;", "flatId", "getFlatList", "roomCount", "", "getManagertChat", "getNewsList", "Lru/unicorn/ujin/data/realm/News;", "getNewspieceById", "newsId", "getTimeSlots", "Lru/unicorn/ujin/data/realm/TimeSlot;", "removeTime", "rentFlat", "requestChatList", "offset", "limit", "serviceType", "(Ljava/lang/String;IILjava/lang/Integer;)V", "requestDeleteUser", "requestFilterFlatList", "studia", "one", "two", "three", "four", "buildingId", "sectionId", "squareMin", "squareMax", "floorMin", "floorMax", "priceMin", "", "priceMax", "sales", "finish", "requestHardware", "requestUpdateAcceptanceDates", "requestUpdateCityComplexList", "requestUpdateCityList", "requestUpdateComplexInfo", "requestUpdateFavouritesList", "requestUpdateFlatById", "requestUpdateFlatFavourite", "favouriteFlag", "", "searchPosition", "requestUpdateFlatList", "requestUpdatePartProfile", "params", "requestUpdateProfile", "surname", "name", "patronimic", "phone", "mail", "profilePrivacy", "inputname", "base64", "birthday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "requestUpdateSubAccounts", "reserveTime", "sellFlat", "showNetworkError", "updateComplexInfoByteImageList", "complexInfo", "updateComplexInfoMortrageImage", "position", "bytes", "", "updateComplexInfoPicture", "updateFavourite", "favourite", "updateFavouriteSmallPic", "updateFlatBigImage", "flat", "updateFlatSmallImage", "updateNewspiecePicture", "newspiece", "updateTime", "visitFlat", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository */
/* compiled from: RealmRepository.kt */
public final class RealmRepository {
    private final PublishSubject<AcceptanceDatesEvent> acceptanceDatesSubject = PublishSubject.create();
    private final PublishSubject<AcceptanceStateEvent> acceptanceStateSubject = PublishSubject.create();
    private final PublishSubject<OnAddSDeviceActionEvent> adDDeviceSubject = PublishSubject.create();
    private final Pro100Api api;
    private final PublishSubject<UpdateEvent> bookFlatSubject = PublishSubject.create();
    private final PublishSubject<ChatListEvent> chatListSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> cityListSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> complexListSubject = PublishSubject.create();
    private final PublishSubject<DeviceActionEvent> deviceSubject = PublishSubject.create();
    private final PublishSubject<GetHardwareCountEvent> getHardwareSubject = PublishSubject.create();
    private final PublishSubject<RegisterGhostEvent> ghostRegisterSubject = PublishSubject.create();
    private final PublishSubject<UpdateFavouriteEvent> modelFavouriteSubject = PublishSubject.create();
    private final PublishSubject<UpdateSearchFavouriteFlatEvent> modelSearchFavouriteSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> modelSubject = PublishSubject.create();
    private final PublishSubject<NewsListEvent> newsListSubject = PublishSubject.create();
    private final PublishSubject<ProfileDeleteEvent> profileDeleteSubject = PublishSubject.create();
    private final PublishSubject<ProfileSubAccountUpdateEvent> profileSubAccountUpdateSubject = PublishSubject.create();
    private final PublishSubject<ProfileUpdateEvent> profileUpdateSubject = PublishSubject.create();
    private final Lazy realm$delegate = LazyKt.lazy(RealmRepository$realm$2.INSTANCE);
    private final PublishSubject<UpdateEvent> rentFlatSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> sellFlatSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> subAccountErrorsSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> visitFlatSubject = PublishSubject.create();

    /* access modifiers changed from: private */
    public final Realm getRealm() {
        return (Realm) this.realm$delegate.getValue();
    }

    public final void addDeviceList(String str, List<? extends DeviceModel> list) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(list, "devices");
    }

    public RealmRepository(Pro100Api pro100Api) {
        Intrinsics.checkNotNullParameter(pro100Api, "api");
        this.api = pro100Api;
    }

    public final Pro100Api getApi() {
        return this.api;
    }

    public final PublishSubject<UpdateEvent> getSubAccountErrorsSubject() {
        return this.subAccountErrorsSubject;
    }

    public final PublishSubject<UpdateEvent> getModelSubject() {
        return this.modelSubject;
    }

    public final PublishSubject<UpdateEvent> getCityListSubject() {
        return this.cityListSubject;
    }

    public final PublishSubject<UpdateEvent> getComplexListSubject() {
        return this.complexListSubject;
    }

    public final PublishSubject<UpdateFavouriteEvent> getModelFavouriteSubject() {
        return this.modelFavouriteSubject;
    }

    public final PublishSubject<UpdateSearchFavouriteFlatEvent> getModelSearchFavouriteSubject() {
        return this.modelSearchFavouriteSubject;
    }

    public final PublishSubject<ChatListEvent> getChatListSubject() {
        return this.chatListSubject;
    }

    public final PublishSubject<ProfileUpdateEvent> getProfileUpdateSubject() {
        return this.profileUpdateSubject;
    }

    public final PublishSubject<ProfileDeleteEvent> getProfileDeleteSubject() {
        return this.profileDeleteSubject;
    }

    public final PublishSubject<ProfileSubAccountUpdateEvent> getProfileSubAccountUpdateSubject() {
        return this.profileSubAccountUpdateSubject;
    }

    public final PublishSubject<RegisterGhostEvent> getGhostRegisterSubject() {
        return this.ghostRegisterSubject;
    }

    public final PublishSubject<UpdateEvent> getBookFlatSubject() {
        return this.bookFlatSubject;
    }

    public final PublishSubject<UpdateEvent> getVisitFlatSubject() {
        return this.visitFlatSubject;
    }

    public final PublishSubject<AcceptanceStateEvent> getAcceptanceStateSubject() {
        return this.acceptanceStateSubject;
    }

    public final PublishSubject<AcceptanceDatesEvent> getAcceptanceDatesSubject() {
        return this.acceptanceDatesSubject;
    }

    public final PublishSubject<DeviceActionEvent> getDeviceSubject() {
        return this.deviceSubject;
    }

    public final PublishSubject<OnAddSDeviceActionEvent> getAdDDeviceSubject() {
        return this.adDDeviceSubject;
    }

    public final PublishSubject<GetHardwareCountEvent> getGetHardwareSubject() {
        return this.getHardwareSubject;
    }

    public final PublishSubject<NewsListEvent> getNewsListSubject() {
        return this.newsListSubject;
    }

    public final PublishSubject<UpdateEvent> getSellFlatSubject() {
        return this.sellFlatSubject;
    }

    public final PublishSubject<UpdateEvent> getRentFlatSubject() {
        return this.rentFlatSubject;
    }

    /* access modifiers changed from: private */
    public final void showNetworkError() {
        this.modelSubject.onNext(new UpdateEvent(false, "Ошибка обновления данных, проверьте доступ в интернет!"));
    }

    public final ArrayList<News> getNewsList() {
        RealmResults<E> findAll = getRealm().where(News.class).findAll();
        if (findAll == null) {
            return new ArrayList<>();
        }
        List copyFromRealm = getRealm().copyFromRealm(findAll);
        if (copyFromRealm != null) {
            return (ArrayList) copyFromRealm;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<ru.unicorn.ujin.data.realm.News> /* = java.util.ArrayList<ru.unicorn.ujin.data.realm.News> */");
    }

    public final void updateNewspiecePicture(News news, byte[] bArr) {
        Intrinsics.checkNotNullParameter(news, "newspiece");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateNewspiecePicture$1(news, bArr));
    }

    public final News getNewspieceById(String str) {
        Intrinsics.checkNotNullParameter(str, NewspieceFragment.NEWS_ID);
        return (News) getRealm().where(News.class).equalTo(News.Fields.INSTANCE.getId(), str).findFirst();
    }

    public final List<Favourite> getFavouritesList() {
        RealmResults<E> findAll = getRealm().where(Favourite.class).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Favourite::class.java).findAll()");
        return findAll;
    }

    public final void requestUpdateFavouritesList(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getFavouritesList(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateFavouritesList$1(this), new RealmRepository$requestUpdateFavouritesList$2(this));
    }

    public final void updateFavourite(Favourite favourite) {
        Intrinsics.checkNotNullParameter(favourite, "favourite");
        getRealm().executeTransaction(new RealmRepository$updateFavourite$1(favourite));
    }

    public final void updateFavouriteSmallPic(Favourite favourite, byte[] bArr) {
        Intrinsics.checkNotNullParameter(favourite, "favourite");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateFavouriteSmallPic$1(favourite, bArr));
    }

    public final Flat getFlatById(String str) {
        Intrinsics.checkNotNullParameter(str, "flatId");
        return (Flat) getRealm().where(Flat.class).equalTo(Flat.Fields.f6655id, str).findFirst();
    }

    public final void requestUpdateFlatById(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "flatId");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getFlatInfo(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateFlatById$1(this), new RealmRepository$requestUpdateFlatById$2(this));
    }

    public final void requestUpdateFlatFavourite(String str, String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "flatId");
        if (!z) {
            getRealm().executeTransaction(new RealmRepository$requestUpdateFlatFavourite$1(str2));
        }
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.updateFlatFavourite(appName, str, str2, z ? 1 : 0).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateFlatFavourite$2(this, str2, z, i), new RealmRepository$requestUpdateFlatFavourite$3(this));
    }

    public final void requestUpdateCityList(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getCityList(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateCityList$1(this), new RealmRepository$requestUpdateCityList$2(this));
    }

    public final ArrayList<City> getCityList() {
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.addAll(getRealm().where(City.class).findAll());
        return arrayList;
    }

    public final City getCityById(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        return (City) getRealm().where(City.class).equalTo("id", str).findFirst();
    }

    public final void requestUpdateCityComplexList(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, Complex.Fields.cityId);
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getComplexList(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateCityComplexList$1(this, str2), new RealmRepository$requestUpdateCityComplexList$2(this));
    }

    public final RealmResults<Complex> getCityComplexList(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        return getRealm().where(Complex.class).equalTo(Complex.Fields.cityId, str).findAll();
    }

    public final Complex getComplexById(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        return (Complex) getRealm().where(Complex.class).equalTo("id", str).findFirst();
    }

    public final ComplexInfo getComplexInfoById(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        return (ComplexInfo) getRealm().where(ComplexInfo.class).equalTo("id", str).findFirst();
    }

    public final void updateComplexInfoPicture(ComplexInfo complexInfo, int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(complexInfo, "complexInfo");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateComplexInfoPicture$1(this, complexInfo, i, bArr));
    }

    public final void requestUpdateComplexInfo(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getComplexInfo(appName, str, str2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateComplexInfo$1(this), new RealmRepository$requestUpdateComplexInfo$2(this));
    }

    public final void updateComplexInfoByteImageList(ComplexInfo complexInfo) {
        Intrinsics.checkNotNullParameter(complexInfo, "complexInfo");
        getRealm().executeTransaction(new RealmRepository$updateComplexInfoByteImageList$1(complexInfo));
    }

    public final void updateComplexInfoMortrageImage(String str, int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateComplexInfoMortrageImage$1(this, str, bArr, i));
    }

    public final void requestUpdateFlatList(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getFlatList(appName, str, str2, i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateFlatList$1(this, str2, i), new RealmRepository$requestUpdateFlatList$2(this));
    }

    public final GetFlatsResponseData getFlatList(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        RealmQuery<E> where = getRealm().where(GetFlatsResponseData.class);
        return (GetFlatsResponseData) where.equalTo("id", str + i).findFirst();
    }

    public final void updateFlatSmallImage(Flat flat, byte[] bArr) {
        Intrinsics.checkNotNullParameter(flat, "flat");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateFlatSmallImage$1(flat, bArr));
    }

    public final void updateFlatBigImage(Flat flat, byte[] bArr) {
        Intrinsics.checkNotNullParameter(flat, "flat");
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        getRealm().executeTransaction(new RealmRepository$updateFlatBigImage$1(flat, bArr));
    }

    public final void requestFilterFlatList(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, int i6, int i7, int i8, int i9, long j, long j2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "complexId");
        Intrinsics.checkNotNullParameter(str3, "buildingId");
        Intrinsics.checkNotNullParameter(str4, "sectionId");
        Intrinsics.checkNotNullParameter(str5, "sales");
        Intrinsics.checkNotNullParameter(str6, "finish");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getFliterFlatList(appName, str, str2, i, i2, i3, i4, i5, str3, str4, i6, i7, i8, i9, j, j2, str5, str6).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestFilterFlatList$1(this), new RealmRepository$requestFilterFlatList$2(this));
    }

    public final GetFlatsResponseData getFilterFlatList() {
        return (GetFlatsResponseData) getRealm().where(GetFlatsResponseData.class).equalTo("id", GetFlatsResponseData.Fields.filter).findFirst();
    }

    public final void requestChatList(String str, int i, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getChatList(appName, str, num).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestChatList$1(this), new RealmRepository$requestChatList$2(this));
    }

    public final List<Chat> getChatList() {
        RealmResults<E> findAll = getRealm().where(Chat.class).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Chat::class.…               .findAll()");
        return CollectionsKt.toList(findAll);
    }

    public final Chat getManagertChat() {
        return (Chat) getRealm().where(Chat.class).equalTo(Chat.Fields.serviceType, "5").findFirst();
    }

    public final void bookFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.bookFlat(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$bookFlat$1(this), new RealmRepository$bookFlat$2(this));
    }

    public final void visitFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.visitFlat(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$visitFlat$1(this), new RealmRepository$visitFlat$2(this));
    }

    public final void sellFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.sellFlat(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$sellFlat$1(this), new RealmRepository$sellFlat$2(this));
    }

    public final void rentFlat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "uid");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.rentFlat(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$rentFlat$1(this), new RealmRepository$rentFlat$2(this));
    }

    public final void requestUpdateSubAccounts(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getSubAccounts(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateSubAccounts$1(this), new RealmRepository$requestUpdateSubAccounts$2(this));
    }

    public final void getAcceptanceState(String str, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getAcceptanceState(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$getAcceptanceState$1(this, str, date), new RealmRepository$getAcceptanceState$2(this));
    }

    public final void getAcceptanceState(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getAcceptanceState(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$getAcceptanceState$3(this), new RealmRepository$getAcceptanceState$4(this));
    }

    public final ApartmentState getApartmentState() {
        return (ApartmentState) getRealm().where(ApartmentState.class).findFirst();
    }

    public final void getAcceptanceTimeSlots(String str, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getAcceptanceTimeSlots(appName, str, date).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$getAcceptanceTimeSlots$1(this), new RealmRepository$getAcceptanceTimeSlots$2(this));
    }

    public final List<TimeSlot> getTimeSlots() {
        RealmResults<E> findAll = getRealm().where(TimeSlot.class).findAll();
        if (findAll != null) {
            return getRealm().copyFromRealm(findAll);
        }
        RealmRepository realmRepository = this;
        return new ArrayList<>();
    }

    public final void removeTime(String str, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.removeTime(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$removeTime$1(this, str, date), new RealmRepository$removeTime$2(this));
    }

    public final void updateTime(String str, String str2, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.removeTime(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$updateTime$1(this, str, str2, date), new RealmRepository$updateTime$2(this));
    }

    public final void reserveTime(String str, String str2, Date date) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(date, "date");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.reserveTime(appName, str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$reserveTime$1(this, str, date), new RealmRepository$reserveTime$2(this));
    }

    public final void requestUpdateAcceptanceDates(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getAcceptanceDates(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateAcceptanceDates$1(this), new RealmRepository$requestUpdateAcceptanceDates$2(this));
    }

    public final List<AcceptanceDate> getAcceptanceDates() {
        RealmResults<E> findAll = getRealm().where(AcceptanceDate.class).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(AcceptanceDate::class.java).findAll()");
        return findAll;
    }

    public final void requestUpdateProfile(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.updateProfile(appName, str, str2, str3, str4, str5, str6, str8, str9).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdateProfile$1(this), new RealmRepository$requestUpdateProfile$2(this));
    }

    public final void requestUpdatePartProfile(String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(map, "params");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.updatePartProfile(appName, str, map).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestUpdatePartProfile$1(this), new RealmRepository$requestUpdatePartProfile$2(this));
    }

    public final void requestDeleteUser(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.deleteUser(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestDeleteUser$1(this), new RealmRepository$requestDeleteUser$2(this));
    }

    public final List<DeviceModel> getDevices() {
        RealmResults<E> findAll = getRealm().where(DeviceModel.class).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(DeviceModel::class.java).findAll()");
        return findAll;
    }

    public final List<DeviceModel> getDevicesUnmanaged() {
        List<DeviceModel> copyFromRealm = getRealm().copyFromRealm(getDevices());
        Intrinsics.checkNotNullExpressionValue(copyFromRealm, "realm.copyFromRealm(getDevices())");
        return copyFromRealm;
    }

    public final void requestHardware(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        pro100Api.getHardwareList(appName, str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RealmRepository$requestHardware$1(this), new RealmRepository$requestHardware$2(this));
    }

    public final String getCityTitle() {
        CityTitle cityTitle = (CityTitle) getRealm().where(CityTitle.class).findFirst();
        if (cityTitle == null) {
            return "";
        }
        RealmModel copyFromRealm = getRealm().copyFromRealm(cityTitle);
        Intrinsics.checkNotNullExpressionValue(copyFromRealm, "(realm.copyFromRealm(it))");
        String title = ((CityTitle) copyFromRealm).getTitle();
        if (title != null) {
            return title;
        }
        return "";
    }

    public final Flowable<Resource<List<ContextBanner>>> getContextBannerList(String str, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(arrayList, "contexts");
        Flowable<R> subscribeOn = this.api.getBannerList(str, new GetBannerRequestBody(arrayList)).map(RealmRepository$getContextBannerList$1.INSTANCE).onErrorReturn(RealmRepository$getContextBannerList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getBannerList(token,…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final ContextBanner getBannerById(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return (ContextBanner) getRealm().where(ContextBanner.class).equalTo("id", str).findFirst();
    }

    public final Flowable<Resource<SimpleResponse>> applyForMortgage(String str, String str2, String str3, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "token");
        Pro100Api pro100Api = this.api;
        String appName = MainApplication.getAppName();
        Intrinsics.checkNotNullExpressionValue(appName, "getAppName()");
        Flowable<R> subscribeOn = pro100Api.applyForMortgage(appName, str, str2, str3, map).map(RealmRepository$applyForMortgage$1.INSTANCE).onErrorReturn(RealmRepository$applyForMortgage$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.applyForMortgage(get…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
