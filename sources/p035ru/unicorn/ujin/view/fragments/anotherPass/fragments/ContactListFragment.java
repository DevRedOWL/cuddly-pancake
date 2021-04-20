package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/ContactListFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$ContactListAdapterListener;", "()V", "contactListAdapter", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter;", "getContactList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/Contact;", "Lkotlin/collections/ArrayList;", "metricsScreenName", "", "onContactSelected", "", "contact", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "LoadContacts", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.ContactListFragment */
/* compiled from: ContactListFragment.kt */
public final class ContactListFragment extends BaseAnotherPassFragment implements ContactListAdapter.ContactListAdapterListener {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ContactListAdapter contactListAdapter;

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
        return "Экран списка контактов";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.add_contact));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_contact_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        new LoadContacts().execute(new ContactListFragment[]{this});
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0014¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/ContactListFragment$LoadContacts;", "Landroid/os/AsyncTask;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/ContactListFragment;", "", "(Lru/unicorn/ujin/view/fragments/anotherPass/fragments/ContactListFragment;)V", "doInBackground", "params", "", "([Lru/unicorn/ujin/view/fragments/anotherPass/fragments/ContactListFragment;)V", "onPostExecute", "result", "(Lkotlin/Unit;)V", "onPreExecute", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.ContactListFragment$LoadContacts */
    /* compiled from: ContactListFragment.kt */
    public final class LoadContacts extends AsyncTask<ContactListFragment, Unit, Unit> {
        public LoadContacts() {
        }

        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            doInBackground((ContactListFragment[]) objArr);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            ContactListFragment.this.showLoader(true, (ProgressBar) ContactListFragment.this._$_findCachedViewById(C5619R.C5622id.pbLoading));
        }

        /* access modifiers changed from: protected */
        public void doInBackground(ContactListFragment... contactListFragmentArr) {
            Intrinsics.checkNotNullParameter(contactListFragmentArr, "params");
            ContactListFragment contactListFragment = ContactListFragment.this;
            ContactListFragment contactListFragment2 = contactListFragmentArr[0];
            contactListFragment.contactListAdapter = contactListFragment2 != null ? new ContactListAdapter(contactListFragment.getContactList(), contactListFragment2) : null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Unit unit) {
            super.onPostExecute(unit);
            ContactListFragment.this.showLoader(false, (ProgressBar) ContactListFragment.this._$_findCachedViewById(C5619R.C5622id.pbLoading));
            RecyclerView recyclerView = (RecyclerView) ContactListFragment.this._$_findCachedViewById(C5619R.C5622id.rvContactList);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(ContactListFragment.this.contactListAdapter);
            ((EditText) ContactListFragment.this._$_findCachedViewById(C5619R.C5622id.etSearch)).addTextChangedListener(new ContactListFragment$LoadContacts$onPostExecute$2(this));
        }
    }

    public void onContactSelected(Contact contact) {
        getPassViewModel().getChooseContactObservable().postValue(contact);
        getBaseActivity().onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003e, code lost:
        r18 = r8.getContentResolver();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact> getContactList() {
        /*
            r30 = this;
            java.lang.String r0 = "data1"
            java.lang.String r1 = "vnd.android.cursor.item/email_v2"
            java.lang.String r2 = "vnd.android.cursor.item/name"
            java.lang.String r3 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r4 = "XXX BTN "
            java.lang.String r5 = "ContactList"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.util.LongSparseArray r7 = new android.util.LongSparseArray
            r7.<init>()
            java.lang.String r8 = "mimetype"
            java.lang.String r9 = "contact_id"
            java.lang.String r10 = "display_name"
            java.lang.String r11 = "data1"
            java.lang.String r12 = "data2"
            java.lang.String r13 = "data2"
            java.lang.String r14 = "data3"
            java.lang.String r15 = "data5"
            java.lang.String r16 = "data1"
            java.lang.String r17 = "data2"
            java.lang.String[] r20 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            android.net.Uri r19 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r21 = "mimetype in (?, ?, ?)"
            java.lang.String[] r22 = new java.lang.String[]{r3, r2, r1}     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r23 = "sort_key_alt"
            android.content.Context r8 = r30.getContext()     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            if (r8 == 0) goto L_0x0049
            android.content.ContentResolver r18 = r8.getContentResolver()     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            if (r18 == 0) goto L_0x0049
            android.database.Cursor r8 = r18.query(r19, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            if (r8 == 0) goto L_0x012a
            int r9 = r8.getCount()     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            if (r9 <= 0) goto L_0x012a
            java.lang.String r9 = "mimetype"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r10 = "contact_id"
            int r10 = r8.getColumnIndex(r10)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            int r11 = r8.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r12 = "data2"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r13 = "data3"
            int r13 = r8.getColumnIndex(r13)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r14 = "data5"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            int r0 = r8.getColumnIndex(r0)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            java.lang.String r15 = "display_name"
            int r15 = r8.getColumnIndex(r15)     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
        L_0x007e:
            boolean r16 = r8.moveToNext()     // Catch:{ RemoteException -> 0x0160, Exception -> 0x013c }
            if (r16 == 0) goto L_0x012a
            r16 = r4
            r17 = r5
            long r4 = r8.getLong(r10)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            java.lang.Object r18 = r7.get(r4)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact r18 = (p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact) r18     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            if (r18 != 0) goto L_0x00bf
            r29 = r10
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact r10 = new ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 127(0x7f, float:1.78E-43)
            r28 = 0
            r19 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r19 = r0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setId(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r7.put(r4, r10)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r6.add(r10)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            goto L_0x00c5
        L_0x00bf:
            r19 = r0
            r29 = r10
            r10 = r18
        L_0x00c5:
            java.lang.String r0 = r8.getString(r9)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            if (r0 != 0) goto L_0x00ce
        L_0x00cb:
            r0 = r19
            goto L_0x0122
        L_0x00ce:
            int r4 = r0.hashCode()     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r5 = -1569536764(0xffffffffa272c504, float:-3.2901415E-18)
            if (r4 == r5) goto L_0x0113
            r5 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r4 == r5) goto L_0x00f0
            r5 = 684173810(0x28c7a9f2, float:2.216714E-14)
            if (r4 == r5) goto L_0x00e2
            goto L_0x00cb
        L_0x00e2:
            boolean r0 = r0.equals(r3)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r8.getString(r11)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setPhone(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            goto L_0x00cb
        L_0x00f0:
            boolean r0 = r0.equals(r2)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r8.getString(r12)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setName(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            java.lang.String r0 = r8.getString(r13)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setSurname(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            java.lang.String r0 = r8.getString(r14)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setPatronymic(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            java.lang.String r0 = r8.getString(r15)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setDisplayName(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            goto L_0x00cb
        L_0x0113:
            boolean r0 = r0.equals(r1)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            if (r0 == 0) goto L_0x00cb
            r0 = r19
            java.lang.String r4 = r8.getString(r0)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            r10.setEmail(r4)     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
        L_0x0122:
            r4 = r16
            r5 = r17
            r10 = r29
            goto L_0x007e
        L_0x012a:
            r16 = r4
            r17 = r5
            if (r8 == 0) goto L_0x017d
            r8.close()     // Catch:{ RemoteException -> 0x0136, Exception -> 0x0134 }
            goto L_0x017d
        L_0x0134:
            r0 = move-exception
            goto L_0x0141
        L_0x0136:
            r0 = move-exception
            r2 = r16
            r3 = r17
            goto L_0x0163
        L_0x013c:
            r0 = move-exception
            r16 = r4
            r17 = r5
        L_0x0141:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r16
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r3 = r17
            android.util.Log.d(r3, r1)
            r0.printStackTrace()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x017d
        L_0x0160:
            r0 = move-exception
            r2 = r4
            r3 = r5
        L_0x0163:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
            r0.printStackTrace()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x017d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.ContactListFragment.getContactList():java.util.ArrayList");
    }
}
