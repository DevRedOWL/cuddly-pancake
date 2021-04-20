package org.linphone.purchase;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Patterns;
import com.android.vending.billing.IInAppBillingService;
import com.google.android.gms.common.internal.AccountType;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.linphone.LinphonePreferences;
import org.linphone.mediastream.Log;
import org.linphone.xmlrpc.XmlRpcHelper;
import org.linphone.xmlrpc.XmlRpcListenerBase;

public class InAppPurchaseHelper {
    public static final int ACTIVITY_RESULT_CODE_PURCHASE_ITEM = 11089;
    public static final int API_VERSION = 3;
    public static final String CLIENT_ERROR_BILLING_SERVICE_UNAVAILABLE = "BILLING_SERVICE_UNAVAILABLE";
    public static final String CLIENT_ERROR_BIND_TO_BILLING_SERVICE_FAILED = "BIND_TO_BILLING_SERVICE_FAILED";
    public static final String CLIENT_ERROR_SUBSCRIPTION_PURCHASE_NOT_AVAILABLE = "SUBSCRIPTION_PURCHASE_NOT_AVAILABLE";
    public static final String ITEM_TYPE_INAPP = "inapp";
    public static final String ITEM_TYPE_SUBS = "subs";
    public static final String PURCHASE_DETAILS_AUTO_RENEWING = "autoRenewing";
    public static final String PURCHASE_DETAILS_ORDER_ID = "orderId";
    public static final String PURCHASE_DETAILS_PAYLOAD = "developerPayload";
    public static final String PURCHASE_DETAILS_PRODUCT_ID = "productId";
    public static final String PURCHASE_DETAILS_PURCHASE_STATE = "purchaseState";
    public static final String PURCHASE_DETAILS_PURCHASE_TIME = "purchaseTime";
    public static final String PURCHASE_DETAILS_PURCHASE_TOKEN = "purchaseToken";
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    public static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    public static final int RESPONSE_RESULT_OK = 0;
    public static final int RESULT_BILLING_UNAVAILABLE = 3;
    public static final int RESULT_DEVELOPER_ERROR = 5;
    public static final int RESULT_ERROR = 6;
    public static final int RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int RESULT_ITEM_NOT_OWNED = 8;
    public static final int RESULT_ITEM_UNAVAILABLE = 4;
    public static final int RESULT_SERVICE_UNAVAILABLE = 2;
    public static final int RESULT_USER_CANCELED = 1;
    public static final String SKU_DETAILS_DESC = "description";
    public static final String SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    public static final String SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String SKU_DETAILS_PRICE = "price";
    public static final String SKU_DETAILS_PRODUCT_ID = "productId";
    public static final String SKU_DETAILS_TITLE = "title";
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public String mGmailAccount;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public InAppPurchaseListener mListener;
    /* access modifiers changed from: private */
    public IInAppBillingService mService;
    private ServiceConnection mServiceConn;

    interface VerifiedSignatureListener {
        void onParsedAndVerifiedSignatureQueryFinished(Purchasable purchasable);
    }

    /* access modifiers changed from: private */
    public String responseCodeToErrorMessage(int i) {
        switch (i) {
            case 1:
                return "BILLING_RESPONSE_RESULT_USER_CANCELED";
            case 2:
                return "BILLING_RESPONSE_RESULT_SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE";
            case 4:
                return "BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE";
            case 5:
                return "BILLING_RESPONSE_RESULT_DEVELOPER_ERROR";
            case 6:
                return "BILLING_RESPONSE_RESULT_ERROR";
            case 7:
                return "BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED";
            case 8:
                return "BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED";
            default:
                return "UNKNOWN_RESPONSE_CODE";
        }
    }

    /* access modifiers changed from: private */
    public Purchasable verifySignature(String str, String str2) {
        return null;
    }

    public InAppPurchaseHelper(Activity activity, InAppPurchaseListener inAppPurchaseListener) {
        this.mContext = activity;
        this.mListener = inAppPurchaseListener;
        this.mGmailAccount = getGmailAccount();
        Log.m6901d("[In-app purchase] creating InAppPurchaseHelper for context " + activity.getLocalClassName());
        this.mServiceConn = new ServiceConnection() {
            public void onServiceDisconnected(ComponentName componentName) {
                Log.m6901d("[In-app purchase] onServiceDisconnected!");
                IInAppBillingService unused = InAppPurchaseHelper.this.mService = null;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Log.m6901d("[In-app purchase] onServiceConnected!");
                IInAppBillingService unused = InAppPurchaseHelper.this.mService = IInAppBillingService.Stub.asInterface(iBinder);
                try {
                    if (InAppPurchaseHelper.this.mService.isBillingSupported(3, InAppPurchaseHelper.this.mContext.getPackageName(), InAppPurchaseHelper.ITEM_TYPE_SUBS) == 0) {
                        if (InAppPurchaseHelper.this.mGmailAccount != null) {
                            InAppPurchaseHelper.this.mListener.onServiceAvailableForQueries();
                            return;
                        }
                    }
                    Log.m6903e("[In-app purchase] Error: Subscriptions aren't supported!");
                    InAppPurchaseHelper.this.mListener.onError(InAppPurchaseHelper.CLIENT_ERROR_SUBSCRIPTION_PURCHASE_NOT_AVAILABLE);
                } catch (RemoteException e) {
                    Log.m6903e(e);
                }
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        if (this.mContext.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            Log.m6903e("[In-app purchase] Error: Billing service unavailable on device.");
            this.mListener.onError(CLIENT_ERROR_BILLING_SERVICE_UNAVAILABLE);
        } else if (!this.mContext.bindService(intent, this.mServiceConn, 1)) {
            Log.m6903e("[In-app purchase] Error: Bind service failed");
            this.mListener.onError(CLIENT_ERROR_BIND_TO_BILLING_SERVICE_FAILED);
        }
    }

    /* access modifiers changed from: private */
    public ArrayList<Purchasable> getAvailableItemsForPurchase() {
        Bundle bundle;
        ArrayList<Purchasable> arrayList = new ArrayList<>();
        ArrayList<String> inAppPurchasables = LinphonePreferences.instance().getInAppPurchasables();
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList(SKU_DETAILS_ITEM_LIST, inAppPurchasables);
        try {
            bundle = this.mService.getSkuDetails(3, this.mContext.getPackageName(), ITEM_TYPE_SUBS, bundle2);
        } catch (RemoteException e) {
            Log.m6903e(e);
            bundle = null;
        }
        if (bundle != null) {
            int i = bundle.getInt(RESPONSE_CODE);
            if (i == 0) {
                Iterator<String> it = bundle.getStringArrayList(SKU_DETAILS_LIST).iterator();
                while (it.hasNext()) {
                    try {
                        JSONObject jSONObject = new JSONObject(it.next());
                        String string = jSONObject.getString("productId");
                        String string2 = jSONObject.getString("price");
                        String string3 = jSONObject.getString("title");
                        Purchasable price = new Purchasable(string).setTitle(string3).setDescription(jSONObject.getString("description")).setPrice(string2);
                        Log.m6907w("Purchasable item " + price.getDescription());
                        arrayList.add(price);
                    } catch (JSONException e2) {
                        Log.m6903e(e2);
                    }
                }
            } else {
                Log.m6903e("[In-app purchase] Error: responde code is not ok: " + responseCodeToErrorMessage(i));
                this.mListener.onError(responseCodeToErrorMessage(i));
            }
        }
        return arrayList;
    }

    public void getAvailableItemsForPurchaseAsync() {
        new Thread(new Runnable() {
            public void run() {
                final ArrayList access$400 = InAppPurchaseHelper.this.getAvailableItemsForPurchase();
                if (InAppPurchaseHelper.this.mHandler != null && InAppPurchaseHelper.this.mListener != null) {
                    InAppPurchaseHelper.this.mHandler.post(new Runnable() {
                        public void run() {
                            InAppPurchaseHelper.this.mListener.onAvailableItemsForPurchaseQueryFinished(access$400);
                        }
                    });
                }
            }
        }).start();
    }

    public void getPurchasedItemsAsync() {
        new Thread(new Runnable() {
            public void run() {
                Bundle bundle;
                final ArrayList arrayList = new ArrayList();
                String str = null;
                do {
                    try {
                        bundle = InAppPurchaseHelper.this.mService.getPurchases(3, InAppPurchaseHelper.this.mContext.getPackageName(), InAppPurchaseHelper.ITEM_TYPE_SUBS, str);
                    } catch (RemoteException e) {
                        Log.m6903e(e);
                        bundle = null;
                    }
                    if (bundle != null) {
                        int i = bundle.getInt(InAppPurchaseHelper.RESPONSE_CODE);
                        if (i == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList(InAppPurchaseHelper.RESPONSE_INAPP_PURCHASE_DATA_LIST);
                            ArrayList<String> stringArrayList2 = bundle.getStringArrayList(InAppPurchaseHelper.RESPONSE_INAPP_SIGNATURE_LIST);
                            String string = bundle.getString(InAppPurchaseHelper.RESPONSE_INAPP_CONTINUATION_TOKEN);
                            for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                                String str2 = stringArrayList.get(i2);
                                Log.m6901d("[In-app purchase] " + str2);
                                Purchasable access$600 = InAppPurchaseHelper.this.verifySignature(str2, stringArrayList2.get(i2));
                                if (access$600 != null) {
                                    arrayList.add(access$600);
                                }
                            }
                            str = string;
                            continue;
                        } else {
                            Log.m6903e("[In-app purchase] Error: responde code is not ok: " + InAppPurchaseHelper.this.responseCodeToErrorMessage(i));
                            InAppPurchaseHelper.this.mListener.onError(InAppPurchaseHelper.this.responseCodeToErrorMessage(i));
                            continue;
                        }
                    }
                } while (str != null);
                if (InAppPurchaseHelper.this.mHandler != null && InAppPurchaseHelper.this.mListener != null) {
                    InAppPurchaseHelper.this.mHandler.post(new Runnable() {
                        public void run() {
                            InAppPurchaseHelper.this.mListener.onPurchasedItemsQueryFinished(arrayList);
                        }
                    });
                }
            }
        }).start();
    }

    public void parseAndVerifyPurchaseItemResultAsync(int i, int i2, Intent intent) {
        if (i == 11089) {
            int intExtra = intent.getIntExtra(RESPONSE_CODE, 0);
            if (i2 == -1 && intExtra == 0) {
                String stringExtra = intent.getStringExtra(RESPONSE_INAPP_PURCHASE_DATA);
                String stringExtra2 = intent.getStringExtra(RESPONSE_INAPP_SIGNATURE);
                Purchasable inAppPurchasedItem = LinphonePreferences.instance().getInAppPurchasedItem();
                inAppPurchasedItem.setPayloadAndSignature(stringExtra, stringExtra2);
                LinphonePreferences.instance().setInAppPurchasedItem(inAppPurchasedItem);
                new XmlRpcHelper().verifySignatureAsync(new XmlRpcListenerBase() {
                    public void onSignatureVerified(boolean z) {
                        InAppPurchaseHelper.this.mListener.onPurchasedItemConfirmationQueryFinished(z);
                    }
                }, stringExtra, stringExtra2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void purchaseItem(String str, String str2) {
        Bundle bundle;
        PendingIntent pendingIntent;
        try {
            bundle = this.mService.getBuyIntent(3, this.mContext.getPackageName(), str, ITEM_TYPE_SUBS, str2);
        } catch (RemoteException e) {
            Log.m6903e(e);
            bundle = null;
        }
        if (bundle != null && (pendingIntent = (PendingIntent) bundle.getParcelable(RESPONSE_BUY_INTENT)) != null) {
            try {
                ((Activity) this.mContext).startIntentSenderForResult(pendingIntent.getIntentSender(), ACTIVITY_RESULT_CODE_PURCHASE_ITEM, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                Log.m6903e(e2);
            }
        }
    }

    public void purchaseItemAsync(final String str, final String str2) {
        new Thread(new Runnable() {
            public void run() {
                InAppPurchaseHelper.this.purchaseItem(str, str2);
            }
        }).start();
    }

    public void destroy() {
        this.mContext.unbindService(this.mServiceConn);
    }

    public String getGmailAccount() {
        for (Account account : AccountManager.get(this.mContext).getAccountsByType(AccountType.GOOGLE)) {
            if (isEmailCorrect(account.name)) {
                return account.name;
            }
        }
        return null;
    }

    private boolean isEmailCorrect(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
