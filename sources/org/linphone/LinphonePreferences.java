package org.linphone;

import android.content.Context;
import com.google.android.gcm.GCMConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAuthInfo;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneNatPolicy;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.LpConfig;
import org.linphone.core.TunnelConfig;
import org.linphone.mediastream.Log;
import org.linphone.purchase.Purchasable;
import p035ru.unicorn.ujin.data.service.FCM;

public class LinphonePreferences {
    private static final int LINPHONE_CORE_RANDOM_PORT = -1;
    private static LinphonePreferences instance;
    private String basePath;
    private Context mContext;
    private TunnelConfig tunnelConfig = null;

    public boolean shouldAutomaticallyAcceptFriendsRequests() {
        return false;
    }

    public boolean shouldAutomaticallyAcceptVideoRequests() {
        return true;
    }

    public static final synchronized LinphonePreferences instance() {
        LinphonePreferences linphonePreferences;
        synchronized (LinphonePreferences.class) {
            if (instance == null) {
                instance = new LinphonePreferences();
            }
            linphonePreferences = instance;
        }
        return linphonePreferences;
    }

    private LinphonePreferences() {
    }

    public void setContext(Context context) {
        this.mContext = context;
        this.basePath = this.mContext.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: private */
    public String getString(int i) {
        if (this.mContext == null && LinphoneManager.isInstanciated()) {
            this.mContext = LinphoneManager.getInstance().getContext();
        }
        return this.mContext.getString(i);
    }

    private LinphoneCore getLc() {
        if (!LinphoneManager.isInstanciated()) {
            return null;
        }
        return LinphoneManager.getLcIfManagerNotDestroyedOrNull();
    }

    public LpConfig getConfig() {
        LinphoneCore lc = getLc();
        if (lc != null) {
            return lc.getConfig();
        }
        if (LinphoneManager.isInstanciated()) {
            return LinphoneCoreFactory.instance().createLpConfig(LinphoneManager.getInstance().mLinphoneConfigFile);
        }
        File file = new File(this.basePath + "/.linphonerc");
        if (file.exists()) {
            return LinphoneCoreFactory.instance().createLpConfig(file.getAbsolutePath());
        }
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(C5321R.raw.linphonerc_default)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append(10);
            } catch (IOException e) {
                Log.m6903e(e);
            }
        }
        return LinphoneCoreFactory.instance().createLpConfigFromString(sb.toString());
    }

    public void removePreviousVersionAuthInfoRemoval() {
        getConfig().setBool(FCM.SIP, "store_auth_info", true);
    }

    public boolean isFirstLaunch() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "first_launch", true);
    }

    public void firstLaunchSuccessful() {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "first_launch", false);
    }

    public String getRingtone(String str) {
        String string = getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "ringtone", str);
        return (string == null || string.length() == 0) ? str : string;
    }

    public void setRingtone(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "ringtone", str);
    }

    private LinphoneProxyConfig getProxyConfig(int i) {
        LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
        if (i < 0 || i >= proxyConfigList.length) {
            return null;
        }
        return proxyConfigList[i];
    }

    private LinphoneAuthInfo getAuthInfo(int i) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        if (proxyConfig == null) {
            return null;
        }
        try {
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(proxyConfig.getIdentity());
            return getLc().findAuthInfo(createLinphoneAddress.getUserName(), (String) null, createLinphoneAddress.getDomain());
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
            return null;
        }
    }

    private LinphoneAuthInfo getClonedAuthInfo(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        LinphoneAuthInfo clone = authInfo.clone();
        getLc().removeAuthInfo(authInfo);
        return clone;
    }

    private void saveAuthInfo(LinphoneAuthInfo linphoneAuthInfo) {
        getLc().addAuthInfo(linphoneAuthInfo);
    }

    public static class AccountBuilder {

        /* renamed from: lc */
        private LinphoneCore f6320lc;
        private boolean tempAvpfEnabled = false;
        private int tempAvpfRRInterval = 0;
        private String tempContactsParams;
        private String tempDisplayName;
        private String tempDomain;
        private boolean tempEnabled = true;
        private String tempExpire;
        private String tempHa1;
        private boolean tempNoDefault = false;
        private boolean tempOutboundProxy;
        private String tempPassword;
        private String tempPrefix;
        private String tempProxy;
        private String tempQualityReportingCollector;
        private boolean tempQualityReportingEnabled = false;
        private int tempQualityReportingInterval = 0;
        private String tempRealm;
        private LinphoneAddress.TransportType tempTransport;
        private String tempUserId;
        private String tempUsername;

        public AccountBuilder(LinphoneCore linphoneCore) {
            this.f6320lc = linphoneCore;
        }

        public AccountBuilder setTransport(LinphoneAddress.TransportType transportType) {
            this.tempTransport = transportType;
            return this;
        }

        public AccountBuilder setUsername(String str) {
            this.tempUsername = str;
            return this;
        }

        public AccountBuilder setDisplayName(String str) {
            this.tempDisplayName = str;
            return this;
        }

        public AccountBuilder setPassword(String str) {
            this.tempPassword = str;
            return this;
        }

        public AccountBuilder setHa1(String str) {
            this.tempHa1 = str;
            return this;
        }

        public AccountBuilder setDomain(String str) {
            this.tempDomain = str;
            return this;
        }

        public AccountBuilder setProxy(String str) {
            this.tempProxy = str;
            return this;
        }

        public AccountBuilder setOutboundProxyEnabled(boolean z) {
            this.tempOutboundProxy = z;
            return this;
        }

        public AccountBuilder setContactParameters(String str) {
            this.tempContactsParams = str;
            return this;
        }

        public AccountBuilder setExpires(String str) {
            this.tempExpire = str;
            return this;
        }

        public AccountBuilder setUserId(String str) {
            this.tempUserId = str;
            return this;
        }

        public AccountBuilder setAvpfEnabled(boolean z) {
            this.tempAvpfEnabled = z;
            return this;
        }

        public AccountBuilder setAvpfRRInterval(int i) {
            this.tempAvpfRRInterval = i;
            return this;
        }

        public AccountBuilder setRealm(String str) {
            this.tempRealm = str;
            return this;
        }

        public AccountBuilder setQualityReportingCollector(String str) {
            this.tempQualityReportingCollector = str;
            return this;
        }

        public AccountBuilder setPrefix(String str) {
            this.tempPrefix = str;
            return this;
        }

        public AccountBuilder setQualityReportingEnabled(boolean z) {
            this.tempQualityReportingEnabled = z;
            return this;
        }

        public AccountBuilder setQualityReportingInterval(int i) {
            this.tempQualityReportingInterval = i;
            return this;
        }

        public AccountBuilder setEnabled(boolean z) {
            this.tempEnabled = z;
            return this;
        }

        public AccountBuilder setNoDefault(boolean z) {
            this.tempNoDefault = z;
            return this;
        }

        public void saveNewAccount() throws LinphoneCoreException {
            String str;
            String str2;
            String str3 = this.tempUsername;
            if (str3 == null || str3.length() < 1 || (str = this.tempDomain) == null || str.length() < 1) {
                Log.m6907w("Skipping account save: username or domain not provided");
                return;
            }
            String str4 = "sip:" + this.tempUsername + "@" + this.tempDomain;
            String str5 = this.tempProxy;
            if (str5 == null) {
                str2 = "sip:" + this.tempDomain;
            } else if (str5.startsWith("sip:") || this.tempProxy.startsWith("<sip:") || this.tempProxy.startsWith("sips:") || this.tempProxy.startsWith("<sips:")) {
                str2 = this.tempProxy;
            } else {
                str2 = "sip:" + this.tempProxy;
            }
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(str2);
            LinphoneAddress createLinphoneAddress2 = LinphoneCoreFactory.instance().createLinphoneAddress(str4);
            String str6 = this.tempDisplayName;
            if (str6 != null) {
                createLinphoneAddress2.setDisplayName(str6);
            }
            LinphoneAddress.TransportType transportType = this.tempTransport;
            if (transportType != null) {
                createLinphoneAddress.setTransport(transportType);
            }
            LinphoneProxyConfig createProxyConfig = this.f6320lc.createProxyConfig(createLinphoneAddress2.asString(), createLinphoneAddress.asStringUriOnly(), this.tempOutboundProxy ? createLinphoneAddress.asStringUriOnly() : null, this.tempEnabled);
            String str7 = this.tempContactsParams;
            if (str7 != null) {
                createProxyConfig.setContactUriParameters(str7);
            }
            String str8 = this.tempExpire;
            if (str8 != null) {
                try {
                    createProxyConfig.setExpires(Integer.parseInt(str8));
                } catch (NumberFormatException e) {
                    throw new LinphoneCoreException((Throwable) e);
                }
            }
            createProxyConfig.enableAvpf(this.tempAvpfEnabled);
            createProxyConfig.setAvpfRRInterval(this.tempAvpfRRInterval);
            createProxyConfig.enableQualityReporting(this.tempQualityReportingEnabled);
            createProxyConfig.setQualityReportingCollector(this.tempQualityReportingCollector);
            createProxyConfig.setQualityReportingInterval(this.tempQualityReportingInterval);
            String pushNotificationRegistrationID = LinphonePreferences.instance().getPushNotificationRegistrationID();
            String access$000 = LinphonePreferences.instance().getString(C5321R.string.push_sender_id);
            if (pushNotificationRegistrationID != null && LinphonePreferences.instance().isPushNotificationEnabled()) {
                "app-id=" + access$000 + ";pn-type=" + LinphonePreferences.instance().getString(C5321R.string.push_type) + ";pn-tok=" + pushNotificationRegistrationID + ";pn-silent=1";
            }
            String str9 = this.tempPrefix;
            if (str9 != null) {
                createProxyConfig.setDialPrefix(str9);
            }
            String str10 = this.tempRealm;
            if (str10 != null) {
                createProxyConfig.setRealm(str10);
            }
            LinphoneAuthInfo createAuthInfo = LinphoneCoreFactory.instance().createAuthInfo(this.tempUsername, this.tempUserId, this.tempPassword, this.tempHa1, this.tempRealm, this.tempDomain);
            this.f6320lc.addProxyConfig(createProxyConfig);
            this.f6320lc.addAuthInfo(createAuthInfo);
            if (!this.tempNoDefault) {
                this.f6320lc.setDefaultProxyConfig(createProxyConfig);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[Catch:{ LinphoneCoreException -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[Catch:{ LinphoneCoreException -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAccountTransport(int r6, java.lang.String r7) {
        /*
            r5 = this;
            org.linphone.core.LinphoneProxyConfig r0 = r5.getProxyConfig(r6)
            if (r0 == 0) goto L_0x0081
            if (r7 == 0) goto L_0x0081
            r1 = 0
            r2 = 1
            org.linphone.core.LinphoneCoreFactory r3 = org.linphone.core.LinphoneCoreFactory.instance()     // Catch:{ LinphoneCoreException -> 0x0079 }
            java.lang.String r4 = r0.getProxy()     // Catch:{ LinphoneCoreException -> 0x0079 }
            org.linphone.core.LinphoneAddress r3 = r3.createLinphoneAddress(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            int r4 = org.linphone.C5321R.string.pref_transport_udp_key     // Catch:{ LinphoneCoreException -> 0x0079 }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            boolean r4 = r7.equals(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            if (r4 == 0) goto L_0x0028
            org.linphone.core.LinphoneAddress$TransportType r7 = org.linphone.core.LinphoneAddress.TransportType.LinphoneTransportUdp     // Catch:{ LinphoneCoreException -> 0x0079 }
            r3.setTransport(r7)     // Catch:{ LinphoneCoreException -> 0x0079 }
            goto L_0x004e
        L_0x0028:
            int r4 = org.linphone.C5321R.string.pref_transport_tcp_key     // Catch:{ LinphoneCoreException -> 0x0079 }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            boolean r4 = r7.equals(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            if (r4 == 0) goto L_0x003a
            org.linphone.core.LinphoneAddress$TransportType r7 = org.linphone.core.LinphoneAddress.TransportType.LinphoneTransportTcp     // Catch:{ LinphoneCoreException -> 0x0079 }
            r3.setTransport(r7)     // Catch:{ LinphoneCoreException -> 0x0079 }
            goto L_0x004e
        L_0x003a:
            int r4 = org.linphone.C5321R.string.pref_transport_tls_key     // Catch:{ LinphoneCoreException -> 0x0079 }
            java.lang.String r4 = r5.getString(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            boolean r7 = r7.equals(r4)     // Catch:{ LinphoneCoreException -> 0x0079 }
            if (r7 == 0) goto L_0x004e
            org.linphone.core.LinphoneAddress$TransportType r7 = org.linphone.core.LinphoneAddress.TransportType.LinphoneTransportTls     // Catch:{ LinphoneCoreException -> 0x0079 }
            r3.setTransport(r7)     // Catch:{ LinphoneCoreException -> 0x0079 }
            r7 = 5223(0x1467, float:7.319E-42)
            goto L_0x004f
        L_0x004e:
            r7 = 0
        L_0x004f:
            java.lang.String r4 = "sip.linphone.org"
            java.lang.String r0 = r0.getDomain()     // Catch:{ LinphoneCoreException -> 0x0079 }
            boolean r0 = r4.equals(r0)     // Catch:{ LinphoneCoreException -> 0x0079 }
            if (r0 == 0) goto L_0x005e
            r3.setPort(r7)     // Catch:{ LinphoneCoreException -> 0x0079 }
        L_0x005e:
            org.linphone.core.LinphoneProxyConfig r7 = r5.getProxyConfig(r6)     // Catch:{ LinphoneCoreException -> 0x0079 }
            r7.edit()     // Catch:{ LinphoneCoreException -> 0x0079 }
            java.lang.String r0 = r3.asStringUriOnly()     // Catch:{ LinphoneCoreException -> 0x0079 }
            r7.setProxy(r0)     // Catch:{ LinphoneCoreException -> 0x0079 }
            r7.done()     // Catch:{ LinphoneCoreException -> 0x0079 }
            boolean r7 = r5.isAccountOutboundProxySet(r6)     // Catch:{ LinphoneCoreException -> 0x0079 }
            if (r7 == 0) goto L_0x0081
            r5.setAccountOutboundProxyEnabled(r6, r2)     // Catch:{ LinphoneCoreException -> 0x0079 }
            goto L_0x0081
        L_0x0079:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            org.linphone.mediastream.Log.m6903e((java.lang.Object[]) r7)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphonePreferences.setAccountTransport(int, java.lang.String):void");
    }

    public LinphoneAddress.TransportType getAccountTransport(int i) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        if (proxyConfig != null) {
            try {
                return LinphoneCoreFactory.instance().createLinphoneAddress(proxyConfig.getProxy()).getTransport();
            } catch (LinphoneCoreException e) {
                Log.m6903e(e);
            }
        }
        return null;
    }

    public String getAccountTransportKey(int i) {
        LinphoneAddress.TransportType accountTransport = getAccountTransport(i);
        String string = getString(C5321R.string.pref_transport_udp_key);
        if (accountTransport == null || accountTransport != LinphoneAddress.TransportType.LinphoneTransportTcp) {
            return (accountTransport == null || accountTransport != LinphoneAddress.TransportType.LinphoneTransportTls) ? string : getString(C5321R.string.pref_transport_tls_key);
        }
        return getString(C5321R.string.pref_transport_tcp_key);
    }

    public String getAccountTransportString(int i) {
        LinphoneAddress.TransportType accountTransport = getAccountTransport(i);
        if (accountTransport != null && accountTransport == LinphoneAddress.TransportType.LinphoneTransportTcp) {
            return getString(C5321R.string.pref_transport_tcp);
        }
        if (accountTransport == null || accountTransport != LinphoneAddress.TransportType.LinphoneTransportTls) {
            return getString(C5321R.string.pref_transport_udp);
        }
        return getString(C5321R.string.pref_transport_tls);
    }

    public void setAccountUsername(int i, String str) {
        String str2 = "sip:" + str + "@" + getAccountDomain(i);
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            if (proxyConfig == null) {
                Log.m6903e("Error, no proxy config at index " + i);
                return;
            }
            proxyConfig.edit();
            proxyConfig.setIdentity(str2);
            proxyConfig.enableRegister(true);
            proxyConfig.done();
            if (authInfo != null) {
                LinphoneAuthInfo clone = authInfo.clone();
                getLc().removeAuthInfo(authInfo);
                clone.setUsername(str);
                saveAuthInfo(clone);
            }
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    public String getAccountUsername(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        return authInfo.getUsername();
    }

    public void setAccountDisplayName(int i, String str) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(proxyConfig.getIdentity());
            createLinphoneAddress.setDisplayName(str);
            proxyConfig.edit();
            proxyConfig.setIdentity(createLinphoneAddress.asString());
            proxyConfig.done();
        } catch (Exception e) {
            Log.m6903e(e);
        }
    }

    public String getAccountDisplayName(int i) {
        if (getProxyConfig(i) == null || getProxyConfig(i).getAddress() == null) {
            return null;
        }
        return getProxyConfig(i).getAddress().getDisplayName();
    }

    public void setAccountUserId(int i, String str) {
        LinphoneAuthInfo clonedAuthInfo = getClonedAuthInfo(i);
        if (clonedAuthInfo != null) {
            clonedAuthInfo.setUserId(str);
            saveAuthInfo(clonedAuthInfo);
        }
    }

    public String getAccountUserId(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        return authInfo.getUserId();
    }

    public String getAccountRealm(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        return authInfo.getRealm();
    }

    public void setAccountPassword(int i, String str) {
        setAccountPassword(i, str, (String) null);
    }

    public void setAccountHa1(int i, String str) {
        setAccountPassword(i, (String) null, str);
    }

    private void setAccountPassword(int i, String str, String str2) {
        String str3;
        String accountUsername = getAccountUsername(i);
        String accountDomain = getAccountDomain(i);
        if (accountUsername != null && accountDomain != null) {
            String str4 = null;
            if (LinphoneManager.getLc().getAuthInfosList().length <= i || LinphoneManager.getLc().getAuthInfosList()[i] == null) {
                str3 = null;
            } else {
                String accountUserId = getAccountUserId(i);
                String accountRealm = getAccountRealm(i);
                LinphoneManager.getLc().removeAuthInfo(LinphoneManager.getLc().getAuthInfosList()[i]);
                str3 = accountRealm;
                str4 = accountUserId;
            }
            LinphoneManager.getLc().addAuthInfo(LinphoneCoreFactory.instance().createAuthInfo(accountUsername, str4, str, str2, str3, accountDomain));
        }
    }

    public String getAccountPassword(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        return authInfo.getPassword();
    }

    public String getAccountHa1(int i) {
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo == null) {
            return null;
        }
        return authInfo.getHa1();
    }

    public void setAccountIce(int i, boolean z) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            proxyConfig.getNatPolicy().enableIce(z);
            proxyConfig.done();
        } catch (Exception e) {
            Log.m6903e(e);
        }
    }

    public boolean getAccountIce(int i) {
        if (getProxyConfig(i) == null || getProxyConfig(i).getNatPolicy() == null) {
            return false;
        }
        return getProxyConfig(i).getNatPolicy().iceEnabled();
    }

    public void setAccountStunServer(int i, String str) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            LinphoneNatPolicy natPolicy = proxyConfig.getNatPolicy();
            natPolicy.setStunServer(str);
            natPolicy.enableStun(str != null);
            proxyConfig.done();
        } catch (Exception e) {
            Log.m6903e(e);
        }
    }

    public String getAccountStunServer(int i) {
        return (getProxyConfig(i) == null || getProxyConfig(i).getNatPolicy() == null) ? "" : getProxyConfig(i).getNatPolicy().getStunServer();
    }

    public void setAccountDomain(int i, String str) {
        String str2 = "sip:" + getAccountUsername(i) + "@" + str;
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            proxyConfig.setIdentity(str2);
            proxyConfig.enableRegister(true);
            proxyConfig.done();
            if (authInfo != null) {
                LinphoneAuthInfo clone = authInfo.clone();
                getLc().removeAuthInfo(authInfo);
                clone.setDomain(str);
                saveAuthInfo(clone);
            }
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    public String getAccountDomain(int i) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        return proxyConfig != null ? proxyConfig.getDomain() : "";
    }

    public void setAccountProxy(int i, String str) {
        if (str == null || str.length() <= 0) {
            str = getAccountDomain(i);
        }
        if (!str.contains("sip:")) {
            str = "sip:" + str;
        }
        try {
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(str);
            if (!str.contains("transport=")) {
                createLinphoneAddress.setTransport(getAccountTransport(i));
            }
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            proxyConfig.setProxy(createLinphoneAddress.asStringUriOnly());
            proxyConfig.done();
            if (isAccountOutboundProxySet(i)) {
                setAccountOutboundProxyEnabled(i, true);
            }
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    public String getAccountProxy(int i) {
        return getProxyConfig(i).getProxy();
    }

    public void setAccountOutboundProxyEnabled(int i, boolean z) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            if (z) {
                proxyConfig.setRoute(proxyConfig.getProxy());
            } else {
                proxyConfig.setRoute((String) null);
            }
            proxyConfig.done();
        } catch (LinphoneCoreException e) {
            Log.m6903e(e);
        }
    }

    public boolean isAccountOutboundProxySet(int i) {
        return getProxyConfig(i).getRoute() != null;
    }

    public void setAccountContactParameters(int i, String str) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        proxyConfig.edit();
        proxyConfig.setContactUriParameters(str);
        proxyConfig.done();
    }

    public String getExpires(int i) {
        return String.valueOf(getProxyConfig(i).getExpires());
    }

    public void setExpires(int i, String str) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            proxyConfig.setExpires(Integer.parseInt(str));
            proxyConfig.done();
        } catch (NumberFormatException unused) {
        }
    }

    public String getPrefix(int i) {
        return getProxyConfig(i).getDialPrefix();
    }

    public void setPrefix(int i, String str) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        proxyConfig.edit();
        proxyConfig.setDialPrefix(str);
        proxyConfig.done();
    }

    public boolean avpfEnabled(int i) {
        return getProxyConfig(i).avpfEnabled();
    }

    public void enableAvpf(int i, boolean z) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        proxyConfig.edit();
        proxyConfig.enableAvpf(z);
        proxyConfig.done();
    }

    public String getAvpfRRInterval(int i) {
        return String.valueOf(getProxyConfig(i).getAvpfRRInterval());
    }

    public void setAvpfRRInterval(int i, String str) {
        try {
            LinphoneProxyConfig proxyConfig = getProxyConfig(i);
            proxyConfig.edit();
            proxyConfig.setAvpfRRInterval(Integer.parseInt(str));
            proxyConfig.done();
        } catch (NumberFormatException unused) {
        }
    }

    public boolean getReplacePlusByZeroZero(int i) {
        return getProxyConfig(i).getDialEscapePlus();
    }

    public void setReplacePlusByZeroZero(int i, boolean z) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        proxyConfig.edit();
        proxyConfig.setDialEscapePlus(z);
        proxyConfig.done();
    }

    public boolean isFriendlistsubscriptionEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "friendlist_subscription_enabled", false);
    }

    public void enabledFriendlistSubscription(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "friendlist_subscription_enabled", z);
    }

    public void setDefaultAccount(int i) {
        LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
        if (i >= 0 && i < proxyConfigList.length) {
            getLc().setDefaultProxyConfig(proxyConfigList[i]);
        }
    }

    public int getDefaultAccountIndex() {
        LinphoneProxyConfig defaultProxyConfig;
        if (getLc() == null || (defaultProxyConfig = getLc().getDefaultProxyConfig()) == null) {
            return -1;
        }
        LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
        for (int i = 0; i < proxyConfigList.length; i++) {
            if (defaultProxyConfig.getIdentity().equals(proxyConfigList[i].getIdentity())) {
                return i;
            }
        }
        return -1;
    }

    public int getAccountCount() {
        if (getLc() == null || getLc().getProxyConfigList() == null) {
            return 0;
        }
        return getLc().getProxyConfigList().length;
    }

    public void setAccountEnabled(int i, boolean z) {
        int length;
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        if (proxyConfig == null) {
            LinphoneUtils.displayErrorAlert(getString(C5321R.string.error), this.mContext);
            return;
        }
        proxyConfig.edit();
        proxyConfig.enableRegister(z);
        proxyConfig.done();
        if (!z && getLc().getDefaultProxyConfig().getIdentity().equals(proxyConfig.getIdentity()) && (length = getLc().getProxyConfigList().length) > 1) {
            for (int i2 = 0; i2 < length; i2++) {
                if (isAccountEnabled(i2)) {
                    getLc().setDefaultProxyConfig(getProxyConfig(i2));
                    return;
                }
            }
        }
    }

    public boolean isAccountEnabled(int i) {
        return getProxyConfig(i).registerEnabled();
    }

    public void resetDefaultProxyConfig() {
        int length = getLc().getProxyConfigList().length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (isAccountEnabled(i)) {
                getLc().setDefaultProxyConfig(getProxyConfig(i));
                break;
            } else {
                i++;
            }
        }
        if (getLc().getDefaultProxyConfig() == null) {
            getLc().setDefaultProxyConfig(getProxyConfig(0));
        }
    }

    public void deleteAccount(int i) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        if (proxyConfig != null) {
            getLc().removeProxyConfig(proxyConfig);
        }
        if (getLc().getProxyConfigList().length != 0) {
            resetDefaultProxyConfig();
        } else {
            getLc().setDefaultProxyConfig((LinphoneProxyConfig) null);
        }
        LinphoneAuthInfo authInfo = getAuthInfo(i);
        if (authInfo != null) {
            getLc().removeAuthInfo(authInfo);
        }
        getLc().refreshRegisters();
    }

    public void setEchoCancellation(boolean z) {
        getLc().enableEchoCancellation(z);
    }

    public boolean isEchoCancellationEnabled() {
        return getLc().isEchoCancellationEnabled();
    }

    public int getEchoCalibration() {
        return getConfig().getInt("sound", "ec_delay", -1);
    }

    public boolean isEchoConfigurationUpdated() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "ec_updated", false);
    }

    public void echoConfigurationUpdated() {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "ec_updated", true);
    }

    public boolean useFrontCam() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "front_camera_default", true);
    }

    public void setFrontCamAsDefault(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "front_camera_default", z);
    }

    public boolean isVideoEnabled() {
        return getLc().isVideoSupported() && getLc().isVideoEnabled();
    }

    public void enableVideo(boolean z) {
        getLc().enableVideo(z, z);
    }

    public boolean shouldInitiateVideoCall() {
        return getLc().getVideoAutoInitiatePolicy();
    }

    public void setInitiateVideoCall(boolean z) {
        getLc().setVideoPolicy(z, shouldAutomaticallyAcceptVideoRequests());
    }

    public void setAutomaticallyAcceptVideoRequests(boolean z) {
        getLc().setVideoPolicy(shouldInitiateVideoCall(), z);
    }

    public String getVideoPreset() {
        String videoPreset = getLc().getVideoPreset();
        return videoPreset == null ? "default" : videoPreset;
    }

    public void setVideoPreset(String str) {
        if (str.equals("default")) {
            str = null;
        }
        getLc().setVideoPreset(str);
        if (!getVideoPreset().equals("custom")) {
            getLc().setPreferredFramerate(0.0f);
        }
        setPreferredVideoSize(getPreferredVideoSize());
    }

    public String getPreferredVideoSize() {
        return getConfig().getString("video", "size", "qvga");
    }

    public void setPreferredVideoSize(String str) {
        getLc().setPreferredVideoSizeByName(str);
    }

    public int getPreferredVideoFps() {
        return (int) getLc().getPreferredFramerate();
    }

    public void setPreferredVideoFps(int i) {
        getLc().setPreferredFramerate((float) i);
    }

    public int getBandwidthLimit() {
        return getLc().getDownloadBandwidth();
    }

    public void setBandwidthLimit(int i) {
        getLc().setUploadBandwidth(i);
        getLc().setDownloadBandwidth(i);
    }

    public boolean useRfc2833Dtmfs() {
        return getLc().getUseRfc2833ForDtmfs();
    }

    public void sendDtmfsAsRfc2833(boolean z) {
        getLc().setUseRfc2833ForDtmfs(z);
    }

    public boolean useSipInfoDtmfs() {
        return getLc().getUseSipInfoForDtmfs();
    }

    public void sendDTMFsAsSipInfo(boolean z) {
        getLc().setUseSipInfoForDtmfs(z);
    }

    public int getIncTimeout() {
        return getLc().getIncomingTimeout();
    }

    public void setIncTimeout(int i) {
        getLc().setIncomingTimeout(i);
    }

    public int getInCallTimeout() {
        return getLc().getInCallTimeout();
    }

    public void setInCallTimeout(int i) {
        getLc().setInCallTimeout(i);
    }

    public String getVoiceMailUri() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "voice_mail", (String) null);
    }

    public void setVoiceMailUri(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "voice_mail", str);
    }

    public boolean getNativeDialerCall() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "native_dialer_call", false);
    }

    public void setNativeDialerCall(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "native_dialer_call", z);
    }

    public void setWifiOnlyEnabled(Boolean bool) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "wifi_only", bool.booleanValue());
    }

    public boolean isWifiOnlyEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "wifi_only", false);
    }

    public void useRandomPort(boolean z) {
        useRandomPort(z, true);
    }

    public void useRandomPort(boolean z, boolean z2) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "random_port", z);
        if (!z2) {
            return;
        }
        if (z) {
            setSipPort(-1);
        } else {
            setSipPort(5060);
        }
    }

    public boolean isUsingRandomPort() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "random_port", true);
    }

    public String getSipPort() {
        int i;
        LinphoneCore.Transports signalingTransportPorts = getLc().getSignalingTransportPorts();
        if (signalingTransportPorts.udp > 0) {
            i = signalingTransportPorts.udp;
        } else {
            i = signalingTransportPorts.tcp;
        }
        return String.valueOf(i);
    }

    public void setSipPort(int i) {
        LinphoneCore.Transports signalingTransportPorts = getLc().getSignalingTransportPorts();
        signalingTransportPorts.udp = i;
        signalingTransportPorts.tcp = i;
        signalingTransportPorts.tls = -1;
        getLc().setSignalingTransportPorts(signalingTransportPorts);
    }

    private LinphoneNatPolicy getOrCreateNatPolicy() {
        LinphoneNatPolicy natPolicy = getLc().getNatPolicy();
        return natPolicy == null ? getLc().createNatPolicy() : natPolicy;
    }

    public String getStunServer() {
        return getOrCreateNatPolicy().getStunServer();
    }

    public void setStunServer(String str) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        orCreateNatPolicy.setStunServer(str);
        if (str != null && !str.isEmpty()) {
            orCreateNatPolicy.enableStun(true);
        }
        getLc().setNatPolicy(orCreateNatPolicy);
    }

    public void setIceEnabled(boolean z) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        orCreateNatPolicy.enableIce(z);
        getLc().setNatPolicy(orCreateNatPolicy);
    }

    public void setTurnEnabled(boolean z) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        orCreateNatPolicy.enableTurn(z);
        getLc().setNatPolicy(orCreateNatPolicy);
    }

    public void setUpnpEnabled(boolean z) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        orCreateNatPolicy.enableUpnp(z);
        getLc().setNatPolicy(orCreateNatPolicy);
    }

    public boolean isUpnpEnabled() {
        return getOrCreateNatPolicy().upnpEnabled();
    }

    public boolean isIceEnabled() {
        return getOrCreateNatPolicy().iceEnabled();
    }

    public boolean isTurnEnabled() {
        return getOrCreateNatPolicy().turnEnabled();
    }

    public String getTurnUsername() {
        return getOrCreateNatPolicy().getStunServerUsername();
    }

    public void setTurnUsername(String str) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        LinphoneAuthInfo findAuthInfo = getLc().findAuthInfo(orCreateNatPolicy.getStunServerUsername(), (String) null, (String) null);
        if (findAuthInfo != null) {
            LinphoneAuthInfo clone = findAuthInfo.clone();
            getLc().removeAuthInfo(findAuthInfo);
            clone.setUsername(str);
            clone.setUserId(str);
            getLc().addAuthInfo(clone);
        } else {
            getLc().addAuthInfo(LinphoneCoreFactory.instance().createAuthInfo(str, str, (String) null, (String) null, (String) null, (String) null));
        }
        orCreateNatPolicy.setStunServerUsername(str);
        getLc().setNatPolicy(orCreateNatPolicy);
    }

    public void setTurnPassword(String str) {
        LinphoneNatPolicy orCreateNatPolicy = getOrCreateNatPolicy();
        LinphoneAuthInfo findAuthInfo = getLc().findAuthInfo(orCreateNatPolicy.getStunServerUsername(), (String) null, (String) null);
        if (findAuthInfo != null) {
            LinphoneAuthInfo clone = findAuthInfo.clone();
            getLc().removeAuthInfo(findAuthInfo);
            clone.setPassword(str);
            getLc().addAuthInfo(clone);
            return;
        }
        getLc().addAuthInfo(LinphoneCoreFactory.instance().createAuthInfo(orCreateNatPolicy.getStunServerUsername(), orCreateNatPolicy.getStunServerUsername(), str, (String) null, (String) null, (String) null));
    }

    public LinphoneCore.MediaEncryption getMediaEncryption() {
        return getLc().getMediaEncryption();
    }

    public void setMediaEncryption(LinphoneCore.MediaEncryption mediaEncryption) {
        if (mediaEncryption != null) {
            getLc().setMediaEncryption(mediaEncryption);
        }
    }

    public void setPushNotificationEnabled(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "push_notification", z);
        LinphoneCore lc = getLc();
        if (lc != null) {
            if (z) {
                String pushNotificationRegistrationID = getPushNotificationRegistrationID();
                String string = getString(C5321R.string.push_sender_id);
                if (pushNotificationRegistrationID != null && lc.getProxyConfigList().length > 0) {
                    for (LinphoneProxyConfig linphoneProxyConfig : lc.getProxyConfigList()) {
                        String str = "app-id=" + string + ";pn-type=" + getString(C5321R.string.push_type) + ";pn-tok=" + pushNotificationRegistrationID + ";pn-silent=1";
                        String contactParameters = linphoneProxyConfig.getContactParameters();
                        if (contactParameters == null || contactParameters.compareTo(str) != 0) {
                            linphoneProxyConfig.edit();
                            linphoneProxyConfig.setContactUriParameters(str);
                            linphoneProxyConfig.done();
                            Log.m6901d("Push notif infos added to proxy config " + linphoneProxyConfig.getIdentity());
                        }
                    }
                    lc.refreshRegisters();
                }
            } else if (lc.getProxyConfigList().length > 0) {
                for (LinphoneProxyConfig linphoneProxyConfig2 : lc.getProxyConfigList()) {
                    linphoneProxyConfig2.edit();
                    linphoneProxyConfig2.setContactUriParameters((String) null);
                    linphoneProxyConfig2.done();
                    Log.m6901d("Push notif infos removed from proxy config " + linphoneProxyConfig2.getAddress().asStringUriOnly());
                }
                lc.refreshRegisters();
            }
        }
    }

    public boolean isPushNotificationEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "push_notification", false);
    }

    public void setPushNotificationRegistrationID(String str) {
        if (getConfig() != null) {
            LpConfig config = getConfig();
            if (str == null) {
                str = "";
            }
            config.setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "push_notification_regid", str);
        }
    }

    public String getPushNotificationRegistrationID() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "push_notification_regid", (String) null);
    }

    public void useIpv6(Boolean bool) {
        getLc().enableIpv6(bool.booleanValue());
    }

    public boolean isUsingIpv6() {
        return getLc().isIpv6Enabled();
    }

    public void setDebugEnabled(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, BuildConfig.BUILD_TYPE, z);
        LinphoneCoreFactory.instance().enableLogCollection(z);
        LinphoneCoreFactory.instance().setDebugMode(z, getString(C5321R.string.app_name));
    }

    public boolean isDebugEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, BuildConfig.BUILD_TYPE, false);
    }

    public void setBackgroundModeEnabled(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "background_mode", z);
    }

    public boolean isBackgroundModeEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "background_mode", true);
    }

    public boolean isAutoStartEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_start", false);
    }

    public void setAutoStart(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_start", z);
    }

    public String getSharingPictureServerUrl() {
        return getLc().getFileTransferServer();
    }

    public void setSharingPictureServerUrl(String str) {
        getLc().setFileTransferServer(str);
    }

    public void setRemoteProvisioningUrl(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        getLc().setProvisioningUri(str);
    }

    public String getRemoteProvisioningUrl() {
        return getLc().getProvisioningUri();
    }

    public void setDefaultDisplayName(String str) {
        getLc().setPrimaryContact(str, getDefaultUsername());
    }

    public String getDefaultDisplayName() {
        return getLc().getPrimaryContactDisplayName();
    }

    public void setDefaultUsername(String str) {
        getLc().setPrimaryContact(getDefaultDisplayName(), str);
    }

    public String getDefaultUsername() {
        return getLc().getPrimaryContactUsername();
    }

    public TunnelConfig getTunnelConfig() {
        if (!getLc().isTunnelAvailable()) {
            return null;
        }
        if (this.tunnelConfig == null) {
            TunnelConfig[] tunnelGetServers = getLc().tunnelGetServers();
            if (tunnelGetServers.length > 0) {
                this.tunnelConfig = tunnelGetServers[0];
            } else {
                this.tunnelConfig = LinphoneCoreFactory.instance().createTunnelConfig();
            }
        }
        return this.tunnelConfig;
    }

    public String getTunnelHost() {
        TunnelConfig tunnelConfig2 = getTunnelConfig();
        if (tunnelConfig2 != null) {
            return tunnelConfig2.getHost();
        }
        return null;
    }

    public void setTunnelHost(String str) {
        TunnelConfig tunnelConfig2 = getTunnelConfig();
        if (tunnelConfig2 != null) {
            tunnelConfig2.setHost(str);
            LinphoneManager.getInstance().initTunnelFromConf();
        }
    }

    public int getTunnelPort() {
        TunnelConfig tunnelConfig2 = getTunnelConfig();
        if (tunnelConfig2 != null) {
            return tunnelConfig2.getPort();
        }
        return -1;
    }

    public void setTunnelPort(int i) {
        TunnelConfig tunnelConfig2 = getTunnelConfig();
        if (tunnelConfig2 != null) {
            tunnelConfig2.setPort(i);
            LinphoneManager.getInstance().initTunnelFromConf();
        }
    }

    public String getTunnelMode() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "tunnel", (String) null);
    }

    public void setTunnelMode(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "tunnel", str);
        LinphoneManager.getInstance().initTunnelFromConf();
    }

    public boolean isProvisioningLoginViewEnabled() {
        if (getConfig() != null) {
            return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "show_login_view", false);
        }
        return false;
    }

    public void disableProvisioningLoginView() {
        if (isProvisioningLoginViewEnabled()) {
            getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "show_login_view", false);
            return;
        }
        Log.m6907w("Remote provisioning login view wasn't enabled, ignoring");
    }

    public void firstRemoteProvisioningSuccessful() {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "first_remote_provisioning", false);
    }

    public boolean isFirstRemoteProvisioning() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "first_remote_provisioning", true);
    }

    public boolean isAdaptiveRateControlEnabled() {
        return getLc().isAdaptiveRateControlEnabled();
    }

    public void enableAdaptiveRateControl(boolean z) {
        getLc().enableAdaptiveRateControl(z);
    }

    public LinphoneCore.AdaptiveRateAlgorithm getAdaptiveRateAlgorithm() {
        return getLc().getAdaptiveRateAlgorithm();
    }

    public void setAdaptiveRateAlgorithm(LinphoneCore.AdaptiveRateAlgorithm adaptiveRateAlgorithm) {
        getLc().setAdaptiveRateAlgorithm(adaptiveRateAlgorithm);
    }

    public int getCodecBitrateLimit() {
        return getConfig().getInt("audio", "codec_bitrate_limit", 36);
    }

    public void setCodecBitrateLimit(int i) {
        getConfig().setInt("audio", "codec_bitrate_limit", i);
    }

    public void contactsMigrationDone() {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "contacts_migration_done", true);
    }

    public boolean isContactsMigrationDone() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "contacts_migration_done", false);
    }

    public String getInAppPurchaseValidatingServerUrl() {
        return getConfig().getString("in-app-purchase", "server_url", (String) null);
    }

    public Purchasable getInAppPurchasedItem() {
        String string = getConfig().getString("in-app-purchase", "purchase_item_id", (String) null);
        String string2 = getConfig().getString("in-app-purchase", "purchase_item_payload", (String) null);
        String string3 = getConfig().getString("in-app-purchase", "purchase_item_signature", (String) null);
        return new Purchasable(string).setPayloadAndSignature(string2, string3).setUserData(getConfig().getString("in-app-purchase", "purchase_item_username", (String) null));
    }

    public void setInAppPurchasedItem(Purchasable purchasable) {
        if (purchasable != null) {
            getConfig().setString("in-app-purchase", "purchase_item_id", purchasable.getId());
            getConfig().setString("in-app-purchase", "purchase_item_payload", purchasable.getPayload());
            getConfig().setString("in-app-purchase", "purchase_item_signature", purchasable.getPayloadSignature());
            getConfig().setString("in-app-purchase", "purchase_item_username", purchasable.getUserData());
        }
    }

    public ArrayList<String> getInAppPurchasables() {
        ArrayList<String> arrayList = new ArrayList<>();
        String string = getConfig().getString("in-app-purchase", "purchasable_items_ids", (String) null);
        if (string != null) {
            for (String str : string.split(";")) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public String getXmlrpcUrl() {
        return getConfig().getString("assistant", "xmlrpc_url", (String) null);
    }

    public void setXmlrpcUrl(String str) {
        getConfig().setString("assistant", "xmlrpc_url", str);
    }

    public String getInappPopupTime() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "inapp_popup_time", (String) null);
    }

    public void setInappPopupTime(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "inapp_popup_time", str);
    }

    public void setLinkPopupTime(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "link_popup_time", str);
    }

    public String getLinkPopupTime() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "link_popup_time", (String) null);
    }

    public String getXmlRpcServerUrl() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "server_url", (String) null);
    }

    public String getDebugPopupAddress() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "debug_popup_magic", (String) null);
    }

    public String getActivityToLaunchOnIncomingReceived() {
        return getConfig().getString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "incoming_call_activity", "org.linphone.LinphoneActivity");
    }

    public void setActivityToLaunchOnIncomingReceived(String str) {
        getConfig().setString(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "incoming_call_activity", str);
    }

    public boolean getServiceNotificationVisibility() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "show_service_notification", true);
    }

    public void setServiceNotificationVisibility(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "show_service_notification", z);
    }

    public boolean isOverlayEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "display_overlay", false);
    }

    public void enableOverlay(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "display_overlay", z);
    }

    public LinphoneCore.LinphoneLimeState getLimeEncryption() {
        return getLc().getLimeEncryption();
    }

    public void setLimeEncryption(LinphoneCore.LinphoneLimeState linphoneLimeState) {
        getLc().setLimeEncryption(linphoneLimeState);
    }

    public boolean firstTimeAskingForPermission(String str) {
        return firstTimeAskingForPermission(str, true);
    }

    public boolean firstTimeAskingForPermission(String str, boolean z) {
        boolean bool = getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, str, true);
        if (z) {
            permissionHasBeenAsked(str);
        }
        return bool;
    }

    public void permissionHasBeenAsked(String str) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, str, false);
    }

    public boolean isDeviceRingtoneEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "device_ringtone", true) && this.mContext.getPackageManager().checkPermission("android.permission.READ_EXTERNAL_STORAGE", this.mContext.getPackageName()) == 0;
    }

    public void enableDeviceRingtone(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "device_ringtone", z);
    }

    public boolean isBisFeatureEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "bis_feature", true);
    }

    public void enableBisFeature(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "bis_feature", z);
    }

    public boolean isAutoAnswerEnabled() {
        return getConfig().getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_answer", false);
    }

    public void enableAutoAnswer(boolean z) {
        getConfig().setBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_answer", z);
    }

    public void setAutoAnswerTime(int i) {
        getConfig().setInt(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_answer_delay", i);
    }

    public int getAutoAnswerTime() {
        return getConfig().getInt(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_answer_delay", 0);
    }

    public int getCodeLength() {
        return getConfig().getInt(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "activation_code_length", 0);
    }

    public void disableFriendsStorage() {
        getConfig().setBool("misc", "store_friends", false);
    }

    public void enableFriendsStorage() {
        getConfig().setBool("misc", "store_friends", true);
    }

    public boolean isFriendsStorageEnabled() {
        return getConfig().getBool("misc", "store_friends", true);
    }
}
