package org.linphone.purchase;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.linphone.C5321R;
import org.linphone.LinphonePreferences;
import org.linphone.mediastream.Log;
import org.linphone.xmlrpc.XmlRpcHelper;
import org.linphone.xmlrpc.XmlRpcListenerBase;

public class InAppPurchaseActivity extends Activity implements InAppPurchaseListener, View.OnClickListener {
    private static InAppPurchaseActivity instance;
    private ImageView back;
    private ImageView cancel;
    private Fragment fragment;
    private InAppPurchaseHelper inAppPurchaseHelper;
    /* access modifiers changed from: private */
    public ProgressBar inProgress;
    private Handler mHandler = new Handler();
    private List<Purchasable> purchasedItems;

    public void onRecoverAccountSuccessful(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.inAppPurchaseHelper = new InAppPurchaseHelper(this, this);
        setContentView(C5321R.layout.in_app);
        this.inProgress = (ProgressBar) findViewById(C5321R.C5324id.purchaseItemsFetchInProgress);
        this.inProgress.setVisibility(0);
        this.back = (ImageView) findViewById(C5321R.C5324id.back);
        this.back.setOnClickListener(this);
        this.back.setVisibility(4);
        this.cancel = (ImageView) findViewById(C5321R.C5324id.cancel);
        this.cancel.setOnClickListener(this);
        instance = this;
    }

    private void changeFragment(Fragment fragment2) {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C5321R.C5324id.fragment_container, fragment2);
        beginTransaction.commitAllowingStateLoss();
    }

    public void displayInappList() {
        this.fragment = new InAppPurchaseListFragment();
        changeFragment(this.fragment);
    }

    public void displayPurchase(Purchasable purchasable) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, purchasable.getId());
        this.fragment = new InAppPurchaseFragment();
        this.fragment.setArguments(bundle);
        changeFragment(this.fragment);
    }

    public void buyInapp(String str, Purchasable purchasable) {
        LinphonePreferences.instance().setInAppPurchasedItem(purchasable);
        this.inAppPurchaseHelper.purchaseItemAsync(purchasable.getId(), str);
    }

    public String getGmailAccount() {
        return this.inAppPurchaseHelper.getGmailAccount();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        instance = null;
        this.inAppPurchaseHelper.destroy();
        super.onDestroy();
    }

    public List<Purchasable> getPurchasedItems() {
        List<Purchasable> list = this.purchasedItems;
        if (list == null || list.size() == 0) {
            Log.m6907w("nul");
        }
        return this.purchasedItems;
    }

    public Purchasable getPurchasedItem(String str) {
        for (Purchasable next : this.purchasedItems) {
            if (next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static InAppPurchaseActivity instance() {
        return instance;
    }

    public void onServiceAvailableForQueries() {
        this.inAppPurchaseHelper.getAvailableItemsForPurchaseAsync();
    }

    public void onAvailableItemsForPurchaseQueryFinished(ArrayList<Purchasable> arrayList) {
        this.inProgress.setVisibility(8);
        this.purchasedItems = new ArrayList();
        Iterator<Purchasable> it = arrayList.iterator();
        while (it.hasNext()) {
            this.purchasedItems.add(it.next());
        }
        displayInappList();
    }

    public void onPurchasedItemsQueryFinished(ArrayList<Purchasable> arrayList) {
        this.purchasedItems = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            this.inAppPurchaseHelper.getAvailableItemsForPurchaseAsync();
            return;
        }
        for (Purchasable expireDate : this.purchasedItems) {
            Log.m6901d("[In-app purchase] Found already bought item, expires " + expireDate.getExpireDate());
        }
    }

    public void onPurchasedItemConfirmationQueryFinished(boolean z) {
        if (z) {
            XmlRpcHelper xmlRpcHelper = new XmlRpcHelper();
            Purchasable inAppPurchasedItem = LinphonePreferences.instance().getInAppPurchasedItem();
            xmlRpcHelper.updateAccountExpireAsync(new XmlRpcListenerBase() {
                public void onAccountExpireUpdated(String str) {
                }
            }, LinphonePreferences.instance().getAccountUsername(0), LinphonePreferences.instance().getAccountHa1(0), getString(C5321R.string.default_domain), inAppPurchasedItem.getPayload(), inAppPurchasedItem.getPayloadSignature());
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C5321R.C5324id.cancel) {
            finish();
        } else if (id == C5321R.C5324id.back) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.inAppPurchaseHelper.parseAndVerifyPurchaseItemResultAsync(i, i2, intent);
    }

    public void onError(final String str) {
        Log.m6903e(str);
        this.mHandler.post(new Runnable() {
            public void run() {
                InAppPurchaseActivity.this.inProgress.setVisibility(8);
                Toast.makeText(InAppPurchaseActivity.this, str, 1).show();
            }
        });
    }

    public void onActivateAccountSuccessful(boolean z) {
        if (z) {
            Log.m6901d("[In-app purchase] Account activated");
        }
    }
}
