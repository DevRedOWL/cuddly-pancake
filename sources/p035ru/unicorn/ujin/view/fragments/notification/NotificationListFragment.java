package p035ru.unicorn.ujin.view.fragments.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.Enums;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationTitle;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\b\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0016\u0010\u001e\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0002J\u0016\u0010!\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\"0\u0019H\u0002J\b\u0010#\u001a\u00020\u0015H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/notification/NotificationListFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "notificationList", "", "Lru/unicorn/ujin/data/realm/notification/Notification;", "notificationListAdapter", "Lru/unicorn/ujin/view/fragments/notification/NotificationListAdapter;", "removeAll", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClicked", "", "item", "onRemovedAll", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "onViewCreated", "view", "removeItem", "id", "removeNotifications", "notifications", "", "showData", "Lru/unicorn/ujin/data/api/response/notification/NotificationListResponse;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListFragment */
/* compiled from: NotificationListFragment.kt */
public final class NotificationListFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private List<Notification> notificationList = new ArrayList();
    private NotificationListAdapter notificationListAdapter;
    private boolean removeAll;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Enums.PushClickEventType.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$2[Enums.PushClickEventType.TICKET_UPDATED.ordinal()] = 1;
            $EnumSwitchMapping$2[Enums.PushClickEventType.NEW_MESSAGE.ordinal()] = 2;
            $EnumSwitchMapping$2[Enums.PushClickEventType.NEWS_PUPLISH.ordinal()] = 3;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET_COMPANY.ordinal()] = 4;
            $EnumSwitchMapping$2[Enums.PushClickEventType.MARKET_OFFER.ordinal()] = 5;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Уведомления";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.notifications));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_notification_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…n_list, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.notificationListAdapter = new NotificationListAdapter(new ArrayList(), new NotificationListFragment$onViewCreated$1(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.notificationListView);
        NotificationListAdapter notificationListAdapter2 = this.notificationListAdapter;
        if (notificationListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationListAdapter");
        }
        recyclerView.setAdapter(notificationListAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        new ItemTouchHelper(new NotificationListFragment$onViewCreated$swipeHandler$1(this, baseActivity)).attachToRecyclerView((RecyclerView) _$_findCachedViewById(C5619R.C5622id.notificationListView));
        ((AppCompatImageButton) _$_findCachedViewById(C5619R.C5622id.btnRemoveAll)).setOnClickListener(new NotificationListFragment$onViewCreated$3(this));
        getBaseActivity().profileViewModel.loadNotificationList(0);
        getBaseActivity().profileViewModel.getNotificationListLiveData().observe(getViewLifecycleOwner(), new NotificationListFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void removeItem(String str) {
        this.removeAll = false;
        List arrayList = new ArrayList();
        arrayList.add(str);
        removeNotifications(arrayList);
    }

    /* access modifiers changed from: private */
    public final void removeAll() {
        this.removeAll = true;
        for (Notification id : this.notificationList) {
            List arrayList = new ArrayList();
            String id2 = id.getId();
            if (id2 != null) {
                arrayList.add(id2);
            }
            removeNotifications(arrayList);
        }
    }

    private final void removeNotifications(List<String> list) {
        getBaseActivity().profileViewModel.removeNotifications(list);
        getBaseActivity().profileViewModel.getRemoveNotificationsLiveData().observe(getViewLifecycleOwner(), new NotificationListFragment$removeNotifications$1(this));
    }

    /* access modifiers changed from: private */
    public final void onRemovedAll(Resource<String> resource) {
        Resource.Status status;
        if (this.removeAll && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.notificationListView);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "notificationListView");
                recyclerView.setVisibility(8);
                CardView cardView = (CardView) _$_findCachedViewById(C5619R.C5622id.cvRemoveAll);
                Intrinsics.checkNotNullExpressionValue(cardView, "cvRemoveAll");
                cardView.setVisibility(8);
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoNotifications);
                Intrinsics.checkNotNullExpressionValue(textView, "tvNoNotifications");
                textView.setVisibility(0);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(8);
                getBaseActivity().showMessage(resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<NotificationListResponse> resource) {
        RealmList<Notification> notifications;
        List<Notification> list;
        RealmList<Notification> notifications2;
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                if (resource.getData() == null || (notifications = resource.getData().getNotifications()) == null || !(!notifications.isEmpty())) {
                    TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoNotifications);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvNoNotifications");
                    textView.setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.notificationListView);
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "notificationListView");
                    recyclerView.setVisibility(8);
                    CardView cardView = (CardView) _$_findCachedViewById(C5619R.C5622id.cvRemoveAll);
                    Intrinsics.checkNotNullExpressionValue(cardView, "cvRemoveAll");
                    cardView.setVisibility(8);
                    return;
                }
                CardView cardView2 = (CardView) _$_findCachedViewById(C5619R.C5622id.cvRemoveAll);
                Intrinsics.checkNotNullExpressionValue(cardView2, "cvRemoveAll");
                cardView2.setVisibility(0);
                NotificationListResponse data = resource.getData();
                if (data == null || (notifications2 = data.getNotifications()) == null || (list = CollectionsKt.toMutableList(notifications2)) == null) {
                    list = new ArrayList<>();
                }
                this.notificationList = list;
                Collection arrayList = new ArrayList();
                for (Object next : this.notificationList) {
                    CharSequence readAt = ((Notification) next).getReadAt();
                    if (readAt == null || StringsKt.isBlank(readAt)) {
                        arrayList.add(next);
                    }
                }
                List<Notification> list2 = (List) arrayList;
                if (!list2.isEmpty()) {
                    NotificationListAdapter notificationListAdapter2 = this.notificationListAdapter;
                    if (notificationListAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("notificationListAdapter");
                    }
                    String string = getResources().getString(R.string.unread_notifications);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.unread_notifications)");
                    notificationListAdapter2.addItem(new NotificationTitle(string));
                    for (Notification notification : list2) {
                        NotificationListAdapter notificationListAdapter3 = this.notificationListAdapter;
                        if (notificationListAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("notificationListAdapter");
                        }
                        notificationListAdapter3.addItem(notification);
                    }
                }
                Collection arrayList2 = new ArrayList();
                for (Object next2 : this.notificationList) {
                    CharSequence readAt2 = ((Notification) next2).getReadAt();
                    if (!(readAt2 == null || StringsKt.isBlank(readAt2))) {
                        arrayList2.add(next2);
                    }
                }
                List<Notification> list3 = (List) arrayList2;
                if (!list3.isEmpty()) {
                    NotificationListAdapter notificationListAdapter4 = this.notificationListAdapter;
                    if (notificationListAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("notificationListAdapter");
                    }
                    String string2 = getResources().getString(R.string.read_notifications);
                    Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.read_notifications)");
                    notificationListAdapter4.addItem(new NotificationTitle(string2));
                    for (Notification notification2 : list3) {
                        NotificationListAdapter notificationListAdapter5 = this.notificationListAdapter;
                        if (notificationListAdapter5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("notificationListAdapter");
                        }
                        notificationListAdapter5.addItem(notification2);
                    }
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(8);
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoNotifications);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvNoNotifications");
                textView2.setVisibility(0);
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.notificationListView);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "notificationListView");
                recyclerView2.setVisibility(8);
                CardView cardView3 = (CardView) _$_findCachedViewById(C5619R.C5622id.cvRemoveAll);
                Intrinsics.checkNotNullExpressionValue(cardView3, "cvRemoveAll");
                cardView3.setVisibility(8);
                getBaseActivity().showMessage(resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClicked(p035ru.unicorn.ujin.data.realm.notification.Notification r9) {
        /*
            r8 = this;
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x00c2
            java.lang.String r2 = r0.getEvent()
            if (r2 == 0) goto L_0x00c2
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.getBaseActivity()
            boolean r0 = r0 instanceof p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity
            if (r0 == 0) goto L_0x00c2
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.getBaseActivity()
            java.lang.String r1 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            if (r0 == 0) goto L_0x00bc
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r0 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r0
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = r0.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r3 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            if (r0 != r3) goto L_0x00c2
            ru.unicorn.ujin.data.Enums$PushClickEventType$Companion r0 = p035ru.unicorn.ujin.data.Enums.PushClickEventType.Companion
            ru.unicorn.ujin.data.Enums$PushClickEventType r0 = r0.getEventByValue(r2)
            int[] r3 = p035ru.unicorn.ujin.view.fragments.notification.NotificationListFragment.WhenMappings.$EnumSwitchMapping$2
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            java.lang.String r4 = ""
            if (r0 == r3) goto L_0x007b
            r3 = 2
            if (r0 == r3) goto L_0x006e
            r3 = 3
            if (r0 == r3) goto L_0x0061
            r3 = 4
            if (r0 == r3) goto L_0x0054
            r3 = 5
            if (r0 == r3) goto L_0x0047
            r3 = r4
            goto L_0x008a
        L_0x0047:
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getMarketId()
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0054:
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getMarketId()
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0061:
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getNewsId()
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x006e:
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getChatid()
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x007b:
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = r9.getData()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r0.getTicketId()
            if (r0 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r0 = r4
        L_0x0089:
            r3 = r0
        L_0x008a:
            java.lang.String r9 = r9.getId()
            if (r9 == 0) goto L_0x00a3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r0.add(r9)
            ru.unicorn.ujin.view.activity.BaseActivity r9 = r8.getBaseActivity()
            ru.unicorn.ujin.data.profile.ProfileViewModel r9 = r9.profileViewModel
            r9.markNotificationsAsRead(r0)
        L_0x00a3:
            ru.unicorn.ujin.view.activity.BaseActivity r9 = r8.getBaseActivity()
            if (r9 == 0) goto L_0x00b6
            r1 = r9
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r1 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r1
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r5 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            r6 = 0
            r7 = 0
            java.lang.String r4 = ""
            r1.makeRouteToApp(r2, r3, r4, r5, r6, r7)
            goto L_0x00c2
        L_0x00b6:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x00bc:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.notification.NotificationListFragment.onItemClicked(ru.unicorn.ujin.data.realm.notification.Notification):void");
    }
}
