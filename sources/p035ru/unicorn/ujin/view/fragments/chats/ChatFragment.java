package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.IOUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import net.alhazmy13.mediapicker.Image.ImagePicker;
import net.alhazmy13.mediapicker.Video.VideoPicker;
import org.mobileid.access.key.NetworkKey;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.entities.chats.Attachment;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.entities.chats.Poll;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.enums.OptionsType;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.activity.VideoPlayerActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.TextDrawable;
import p035ru.unicorn.ujin.view.dialogs.OptionsDialog;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.PreviewAdapter;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomIncomingMessageViewHolder;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomOutcomingMessageViewHolder;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.ChatsViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.ChatEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.FileUploadEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.MessageDeleteEvent;
import p035ru.unicorn.ujin.viewModel.events.chats.MessageListUpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00015\u0018\u0000 ®\u00012\u00020\u0001:\u0002®\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\bH\u0002J\u0006\u0010]\u001a\u00020ZJ\u0010\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020`H\u0002J\u0006\u0010a\u001a\u00020ZJ\u0018\u0010b\u001a\n c*\u0004\u0018\u00010\u00160\u00162\u0006\u0010d\u001a\u00020eH\u0002J\u0018\u0010f\u001a\u0012\u0012\u0004\u0012\u00020g0\u0004j\b\u0012\u0004\u0012\u00020g`\u0006H\u0002J\u0010\u0010h\u001a\u00020\u00162\u0006\u0010i\u001a\u00020`H\u0002J\u0010\u0010j\u001a\u00020\u00162\u0006\u0010k\u001a\u00020CH\u0002J*\u0010l\u001a\b\u0012\u0004\u0012\u00020C0m2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0m2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020C0mH\u0002J\"\u0010o\u001a\u0012\u0012\u0004\u0012\u00020p0\u0004j\b\u0012\u0004\u0012\u00020p`\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010q\u001a\u00020ZH\u0002J\b\u0010r\u001a\u00020ZH\u0002J\u0010\u0010s\u001a\u00020Z2\u0006\u0010t\u001a\u00020uH\u0002J\u0010\u0010v\u001a\u00020Z2\u0006\u0010t\u001a\u00020uH\u0002J\u0010\u0010w\u001a\u00020Z2\u0006\u0010t\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020Z2\u0006\u0010t\u001a\u00020zH\u0002J\u0010\u0010{\u001a\u00020Z2\u0006\u0010t\u001a\u00020|H\u0002J\u0010\u0010}\u001a\u00020Z2\u0006\u0010~\u001a\u00020H\u0002J\u0011\u0010\u0001\u001a\u00020Z2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\t\u0010\u0001\u001a\u00020\bH\u0002J\t\u0010\u0001\u001a\u00020\u0016H\u0014J'\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020`2\u0007\u0010\u0001\u001a\u00020`2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020Z2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0015\u0010\u0001\u001a\u00020Z2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J+\u0010\u0001\u001a\u00020g2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020ZH\u0016J\u0013\u0010\u0001\u001a\u00020Z2\b\u0010k\u001a\u0004\u0018\u00010CH\u0002J\t\u0010\u0001\u001a\u00020ZH\u0016J\t\u0010\u0001\u001a\u00020ZH\u0016J\u001e\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020g2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u0010i\u001a\u00020`H\u0002J\u0007\u0010\u0001\u001a\u00020ZJ\t\u0010\u0001\u001a\u00020ZH\u0002J\t\u0010\u0001\u001a\u00020ZH\u0002J\u0012\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020`H\u0002J\t\u0010\u0001\u001a\u00020ZH\u0002J\u0011\u0010 \u0001\u001a\u00020Z2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010¡\u0001\u001a\u00020ZH\u0002J\u0013\u0010¢\u0001\u001a\u00020Z2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0002J\t\u0010¥\u0001\u001a\u00020ZH\u0014J\u0012\u0010¦\u0001\u001a\u00020Z2\u0007\u0010§\u0001\u001a\u00020\bH\u0002J\t\u0010¨\u0001\u001a\u00020ZH\u0002J\u0013\u0010©\u0001\u001a\u00020Z2\n\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001J\u001a\u0010¬\u0001\u001a\u00020Z2\u0007\u0010­\u0001\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u000205X\u0004¢\u0006\u0004\n\u0002\u00106R\u000e\u00107\u001a\u000203X\u000e¢\u0006\u0002\n\u0000R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u0012\u0012\u0004\u0012\u00020C0\u0004j\b\u0012\u0004\u0012\u00020C`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX.¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\n\"\u0004\bI\u0010\fR\u001a\u0010J\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u0010\u001aR\u001a\u0010M\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010\u001aR\u001a\u0010P\u001a\u00020QX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0018\"\u0004\bX\u0010\u001a¨\u0006¯\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatFragment;", "Lru/unicorn/ujin/view/fragments/chats/ChatBaseFragment;", "()V", "attachmentList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/chats/Attachment;", "Lkotlin/collections/ArrayList;", "backButton", "", "getBackButton", "()Z", "setBackButton", "(Z)V", "bottomNavigationVisible", "getBottomNavigationVisible", "chat", "Lru/unicorn/ujin/data/realm/Chat;", "getChat", "()Lru/unicorn/ujin/data/realm/Chat;", "setChat", "(Lru/unicorn/ujin/data/realm/Chat;)V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "etMessage", "Lcom/stfalcon/chatkit/messages/MessageInput;", "fcmToken", "getFcmToken", "setFcmToken", "fileType", "Lru/unicorn/ujin/view/fragments/chats/AttachmentType;", "getFileType", "()Lru/unicorn/ujin/view/fragments/chats/AttachmentType;", "setFileType", "(Lru/unicorn/ujin/view/fragments/chats/AttachmentType;)V", "imageLoader", "Lcom/stfalcon/chatkit/commons/ImageLoader;", "getImageLoader", "()Lcom/stfalcon/chatkit/commons/ImageLoader;", "setImageLoader", "(Lcom/stfalcon/chatkit/commons/ImageLoader;)V", "latitude", "", "locationListener", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$locationListener$1", "Lru/unicorn/ujin/view/fragments/chats/ChatFragment$locationListener$1;", "longitude", "mMessageReceiver", "Landroid/content/BroadcastReceiver;", "getMMessageReceiver", "()Landroid/content/BroadcastReceiver;", "messageAdapter", "Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;", "getMessageAdapter", "()Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;", "setMessageAdapter", "(Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;)V", "messageList", "Lru/unicorn/ujin/data/entities/chats/Message;", "messagesList", "Lcom/stfalcon/chatkit/messages/MessagesList;", "serviceMessage", "ticketClosed", "getTicketClosed", "setTicketClosed", "ticketComment", "getTicketComment", "setTicketComment", "ticketId", "getTicketId", "setTicketId", "ticketRating", "", "getTicketRating", "()F", "setTicketRating", "(F)V", "userId", "getUserId", "setUserId", "afterChatSettingsChanged", "", "changeMessagingVisibility", "isVisible", "copySelectedMessages", "deleteAttachFromList", "position", "", "deleteSelectedMessages", "formatDate", "kotlin.jvm.PlatformType", "createdAt", "Ljava/util/Date;", "getButtonsList", "Landroid/view/View;", "getChatParticipantsCountText", "participantsCount", "getMessageAsString", "message", "getNewMessages", "", "serverMessageList", "getOptionsList", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "getPhoto", "getVideo", "handleChatDelete", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleChatExit", "handleChatLoaded", "Lru/unicorn/ujin/viewModel/events/chats/ChatEvent;", "handleFileUpload", "Lru/unicorn/ujin/viewModel/events/chats/FileUploadEvent;", "handleMessageDelete", "Lru/unicorn/ujin/viewModel/events/chats/MessageDeleteEvent;", "handleMessageListUpdateEvent", "messageListUpdateEvent", "Lru/unicorn/ujin/viewModel/events/chats/MessageListUpdateEvent;", "initChat", "isMarketVisit", "metricsScreenName", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onMessageClickListener", "onPause", "onResume", "onViewCreated", "view", "pluralForm", "removeSelection", "save", "selectAttachment", "selectionListener", "count", "sendMessage", "showOptionsDialog", "showParticipants", "showThanksDialog", "ratingBar", "Landroid/widget/RatingBar;", "showToolbar", "toggleProgressVisibility", "visible", "updateButtonSendEnablabilityWUT", "updatePoll", "poll", "Lru/unicorn/ujin/data/entities/chats/Poll;", "uploadFile", "path", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment */
/* compiled from: ChatFragment.kt */
public final class ChatFragment extends ChatBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LOAD_MESSAGE_COUNT = 18;
    public static final int MAX_TITLE_LENGTH = 18;
    public static final long RELOAD_MESSAGE_TIMER = 5000;
    private HashMap _$_findViewCache;
    private final ArrayList<Attachment> attachmentList = new ArrayList<>();
    private boolean backButton = true;
    private final boolean bottomNavigationVisible;
    private Chat chat;
    public String chatId;
    private CountDownTimer countDownTimer;
    private MessageInput etMessage;
    public String fcmToken;
    private AttachmentType fileType = AttachmentType.PHOTO;
    public ImageLoader imageLoader;
    /* access modifiers changed from: private */
    public double latitude;
    private final ChatFragment$locationListener$1 locationListener = new ChatFragment$locationListener$1(this);
    /* access modifiers changed from: private */
    public double longitude;
    private final BroadcastReceiver mMessageReceiver = new ChatFragment$mMessageReceiver$1(this);
    public CustomMessagesListAdapter messageAdapter;
    /* access modifiers changed from: private */
    public ArrayList<Message> messageList = new ArrayList<>();
    private MessagesList messagesList;
    /* access modifiers changed from: private */
    public String serviceMessage;
    private boolean ticketClosed;
    private String ticketComment = "";
    private String ticketId = "";
    private float ticketRating;
    private String userId = "";

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[AttachmentType.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[AttachmentType.values().length];

        static {
            $EnumSwitchMapping$0[AttachmentType.VIDEO.ordinal()] = 1;
            $EnumSwitchMapping$0[AttachmentType.PHOTO.ordinal()] = 2;
            $EnumSwitchMapping$1[AttachmentType.VIDEO.ordinal()] = 1;
            $EnumSwitchMapping$1[AttachmentType.PHOTO.ordinal()] = 2;
        }
    }

    @JvmStatic
    public static final ChatFragment newInstance(String str, String str2, String str3, boolean z, float f, String str4, boolean z2) {
        return Companion.newInstance(str, str2, str3, z, f, str4, z2);
    }

    @JvmStatic
    public static final ChatFragment newInstance(String str, String str2, boolean z) {
        return Companion.newInstance(str, str2, z);
    }

    @JvmStatic
    public static final ChatFragment newInstance(String str, String str2, boolean z, String str3) {
        return Companion.newInstance(str, str2, z, str3);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final boolean getBottomNavigationVisible() {
        return this.bottomNavigationVisible;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r0 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String metricsScreenName() {
        /*
            r3 = this;
            ru.unicorn.ujin.data.realm.Chat r0 = r3.chat
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r0.getServiceType()
            if (r1 != 0) goto L_0x000b
            goto L_0x0053
        L_0x000b:
            int r2 = r1.hashCode()
            switch(r2) {
                case 49: goto L_0x0043;
                case 50: goto L_0x0033;
                case 51: goto L_0x0023;
                case 52: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0053
        L_0x0013:
            java.lang.String r2 = "4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r0 = 2131887359(0x7f1204ff, float:1.9409323E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0069
        L_0x0023:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r0 = 2131887358(0x7f1204fe, float:1.940932E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0069
        L_0x0033:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r0 = 2131887357(0x7f1204fd, float:1.9409319E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0069
        L_0x0043:
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0053
            r0 = 2131887356(0x7f1204fc, float:1.9409317E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0069
        L_0x0053:
            int r0 = r0.getParticipantsCount()
            r1 = 2
            if (r0 <= r1) goto L_0x0062
            r0 = 2131887354(0x7f1204fa, float:1.9409313E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0069
        L_0x0062:
            r0 = 2131887352(0x7f1204f8, float:1.9409309E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            java.lang.String r0 = ""
        L_0x006e:
            java.lang.String r1 = "chat?.let {\n            …    }\n            } ?: \"\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.chats.ChatFragment.metricsScreenName():java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (((p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r0).getAppStage() == p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showToolbar() {
        /*
            r4 = this;
            boolean r0 = r4.backButton
            java.lang.String r1 = "kortros"
            if (r0 == 0) goto L_0x0010
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r4.getBaseActivity()
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r2 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            r0.setToolbarLeft(r2)
            goto L_0x0023
        L_0x0010:
            java.lang.String r0 = "morionDigital"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0023
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r4.getBaseActivity()
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r2 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.PROFILE
            r0.setToolbarLeft(r2)
        L_0x0023:
            ru.unicorn.ujin.data.realm.Chat r0 = r4.chat
            if (r0 == 0) goto L_0x005a
            int r2 = r0.getParticipantsCount()
            r3 = 2
            if (r2 <= r3) goto L_0x004e
            java.lang.String r2 = r0.getServiceType()
            java.lang.String r3 = "0"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x004e
            ru.unicorn.ujin.view.activity.BaseActivity r2 = r4.getBaseActivity()
            java.lang.String r3 = r0.getTitle()
            int r0 = r0.getParticipantsCount()
            java.lang.String r0 = r4.getChatParticipantsCountText(r0)
            r2.setToolbarCenter(r3, r0)
            goto L_0x006b
        L_0x004e:
            ru.unicorn.ujin.view.activity.BaseActivity r2 = r4.getBaseActivity()
            java.lang.String r0 = r0.getTitle()
            r2.setTextTitle(r0)
            goto L_0x006b
        L_0x005a:
            r0 = r4
            ru.unicorn.ujin.view.fragments.chats.ChatFragment r0 = (p035ru.unicorn.ujin.view.fragments.chats.ChatFragment) r0
            ru.unicorn.ujin.view.activity.BaseActivity r2 = r0.getBaseActivity()
            r3 = 2131886474(0x7f12018a, float:1.9407528E38)
            java.lang.String r0 = r0.getString(r3)
            r2.setTextTitle(r0)
        L_0x006b:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r4.getBaseActivity()
            java.util.ArrayList r2 = r4.getButtonsList()
            r0.setToolbarRight(r2)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            boolean r0 = r0 instanceof p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity
            if (r0 == 0) goto L_0x0097
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x008f
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r0 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r0
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r0 = r0.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r2 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.NEW_FLAT
            if (r0 != r2) goto L_0x009f
            goto L_0x0097
        L_0x008f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            r0.<init>(r1)
            throw r0
        L_0x0097:
            java.lang.String r0 = "pan"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x00a6
        L_0x009f:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r4.getBaseActivity()
            r0.hideBottomNavigation()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.chats.ChatFragment.showToolbar():void");
    }

    private final ArrayList<View> getButtonsList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_36dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            Chat chat2 = this.chat;
            if (chat2 != null) {
                String dialogPhoto = chat2.getDialogPhoto();
                Intrinsics.checkNotNullExpressionValue(dialogPhoto, "chat.dialogPhoto");
                if (StringsKt.startsWith$default(dialogPhoto, "https://", false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(GlideApp.with((View) imageButton).load(chat2.getDialogPhoto()).into((ImageView) imageButton), "GlideApp.with(chatAvatar…  .into(chatAvatarButton)");
                } else {
                    imageButton.setImageDrawable(new TextDrawable(getContext(), chat2.getDialogName().subSequence(0, 1)));
                }
                imageButton.setOnClickListener(new ChatFragment$getButtonsList$$inlined$let$lambda$1(chat2, this, imageButton, arrayList));
                arrayList.add(imageButton);
            }
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    private final String getChatParticipantsCountText(int i) {
        return i + ' ' + pluralForm(i);
    }

    private final String pluralForm(int i) {
        int abs = Math.abs(i) % 100;
        int i2 = abs % 10;
        if (11 <= abs && 19 >= abs) {
            return "участников";
        }
        if (2 <= i2 && 4 >= i2) {
            return "участника";
        }
        return i2 == 1 ? "участник" : "участников";
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J@\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/ChatFragment$Companion;", "", "()V", "LOAD_MESSAGE_COUNT", "", "MAX_TITLE_LENGTH", "RELOAD_MESSAGE_TIMER", "", "newInstance", "Lru/unicorn/ujin/view/fragments/chats/ChatFragment;", "chatId", "", "userId", "backButton", "", "message", "ticketId", "ticketClosed", "ticketRating", "", "ticketComment", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$Companion */
    /* compiled from: ChatFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ChatFragment newInstance(String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "chatId");
            Intrinsics.checkNotNullParameter(str2, "userId");
            ChatFragment chatFragment = new ChatFragment();
            chatFragment.setChatId(str);
            chatFragment.setUserId(str2);
            chatFragment.setBackButton(z);
            return chatFragment;
        }

        @JvmStatic
        public final ChatFragment newInstance(String str, String str2, boolean z, String str3) {
            Intrinsics.checkNotNullParameter(str, "chatId");
            Intrinsics.checkNotNullParameter(str2, "userId");
            Intrinsics.checkNotNullParameter(str3, "message");
            ChatFragment chatFragment = new ChatFragment();
            chatFragment.setChatId(str);
            chatFragment.setUserId(str2);
            chatFragment.setBackButton(z);
            chatFragment.serviceMessage = str3;
            return chatFragment;
        }

        @JvmStatic
        public final ChatFragment newInstance(String str, String str2, String str3, boolean z, float f, String str4, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "chatId");
            Intrinsics.checkNotNullParameter(str2, "userId");
            Intrinsics.checkNotNullParameter(str3, "ticketId");
            Intrinsics.checkNotNullParameter(str4, "ticketComment");
            ChatFragment chatFragment = new ChatFragment();
            chatFragment.setChatId(str);
            chatFragment.setUserId(str2);
            chatFragment.setTicketId(str3);
            chatFragment.setBackButton(z2);
            chatFragment.setTicketClosed(z);
            chatFragment.setTicketRating(f);
            chatFragment.setTicketComment(str4);
            return chatFragment;
        }
    }

    public final AttachmentType getFileType() {
        return this.fileType;
    }

    public final void setFileType(AttachmentType attachmentType) {
        Intrinsics.checkNotNullParameter(attachmentType, "<set-?>");
        this.fileType = attachmentType;
    }

    public final CountDownTimer getCountDownTimer() {
        return this.countDownTimer;
    }

    public final void setCountDownTimer(CountDownTimer countDownTimer2) {
        this.countDownTimer = countDownTimer2;
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public final String getChatId() {
        String str = this.chatId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        return str;
    }

    public final void setChatId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chatId = str;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final boolean getBackButton() {
        return this.backButton;
    }

    public final void setBackButton(boolean z) {
        this.backButton = z;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final void setTicketId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ticketId = str;
    }

    public final boolean getTicketClosed() {
        return this.ticketClosed;
    }

    public final void setTicketClosed(boolean z) {
        this.ticketClosed = z;
    }

    public final float getTicketRating() {
        return this.ticketRating;
    }

    public final void setTicketRating(float f) {
        this.ticketRating = f;
    }

    public final String getTicketComment() {
        return this.ticketComment;
    }

    public final void setTicketComment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ticketComment = str;
    }

    public final String getFcmToken() {
        String str = this.fcmToken;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fcmToken");
        }
        return str;
    }

    public final void setFcmToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fcmToken = str;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader2 = this.imageLoader;
        if (imageLoader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        }
        return imageLoader2;
    }

    public final void setImageLoader(ImageLoader imageLoader2) {
        Intrinsics.checkNotNullParameter(imageLoader2, "<set-?>");
        this.imageLoader = imageLoader2;
    }

    public final CustomMessagesListAdapter getMessageAdapter() {
        CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
        if (customMessagesListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
        }
        return customMessagesListAdapter;
    }

    public final void setMessageAdapter(CustomMessagesListAdapter customMessagesListAdapter) {
        Intrinsics.checkNotNullParameter(customMessagesListAdapter, "<set-?>");
        this.messageAdapter = customMessagesListAdapter;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
        instance.getInstanceId().addOnCompleteListener(new ChatFragment$onCreate$1(this));
        Object systemService = getBaseActivity().getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            if (Build.VERSION.SDK_INT >= 23 && (getBaseActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || getBaseActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                locationManager.requestLocationUpdates(NetworkKey.DEFAULT_STORAGE_ID, 2000, 10.0f, this.locationListener);
            }
            this.imageLoader = new ChatFragment$onCreate$2(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat, viewGroup, false);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.etMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.etMessage)");
        this.etMessage = (MessageInput) findViewById;
        View findViewById2 = view.findViewById(R.id.messagesList);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.messagesList)");
        this.messagesList = (MessagesList) findViewById2;
        ChatsViewModel chatViewModel = getChatViewModel();
        String str = this.chatId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        this.chat = chatViewModel.getChatById(str);
        getChatViewModel().getMessageListEvent().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$1(this));
        getChatViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$2(this));
        getChatViewModel().getChatDeleteLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$3(this));
        getChatViewModel().getFileUploadMutableLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$4(this));
        getChatViewModel().getMessageDeleteMutableLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$5(this));
        getChatViewModel().getChatExitMutableLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$6(this));
        getChatViewModel().getChatMutableLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$7(this));
        getChatViewModel().getPollMutableLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$8(this));
        getChatViewModel().getChatErrorMessageLiveData().observe(getViewLifecycleOwner(), new ChatFragment$onViewCreated$9(this));
        Chat chat2 = this.chat;
        if (chat2 != null) {
            initChat(chat2);
            ChatsViewModel chatViewModel2 = getChatViewModel();
            String str2 = this.chatId;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            chatViewModel2.requestChatById(str2);
            return;
        }
        ChatFragment chatFragment = this;
        ChatsViewModel chatViewModel3 = chatFragment.getChatViewModel();
        String str3 = chatFragment.chatId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        chatViewModel3.requestMessageList(str3, 18, 0, true);
    }

    private final void initChat(Chat chat2) {
        String str;
        toggleProgressVisibility(true);
        this.countDownTimer = new ChatFragment$initChat$1(this, 5000, 1000);
        CountDownTimer countDownTimer2 = this.countDownTimer;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
        MessageHolders messageHolders = new MessageHolders();
        messageHolders.setIncomingTextConfig(CustomIncomingMessageViewHolder.class, R.layout.item_message_incoming);
        messageHolders.setOutcomingTextConfig(CustomOutcomingMessageViewHolder.class, R.layout.item_message_outcoming);
        Unit unit = Unit.INSTANCE;
        ImageLoader imageLoader2 = this.imageLoader;
        if (imageLoader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        }
        CustomMessagesListAdapter customMessagesListAdapter = new CustomMessagesListAdapter("1", messageHolders, imageLoader2, new ChatFragment$initChat$3(this));
        customMessagesListAdapter.setOnMessageClickListener(new ChatFragment$initChat$$inlined$apply$lambda$1(this, chat2));
        customMessagesListAdapter.enableSelectionMode(new ChatFragment$initChat$$inlined$apply$lambda$2(this, chat2));
        customMessagesListAdapter.setLoadMoreListener(new ChatFragment$initChat$$inlined$apply$lambda$3(customMessagesListAdapter, this, chat2));
        Unit unit2 = Unit.INSTANCE;
        this.messageAdapter = customMessagesListAdapter;
        MessagesList messagesList2 = this.messagesList;
        if (messagesList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messagesList");
        }
        CustomMessagesListAdapter customMessagesListAdapter2 = this.messageAdapter;
        if (customMessagesListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
        }
        messagesList2.setAdapter(customMessagesListAdapter2);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvAttachPreview);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(new PreviewAdapter(this.attachmentList, new ChatFragment$initChat$$inlined$apply$lambda$4(this)));
        ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivSend)).setOnClickListener(new ChatFragment$initChat$6(this));
        updateButtonSendEnablabilityWUT();
        MessageInput messageInput = this.etMessage;
        if (messageInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMessage");
        }
        messageInput.setAttachmentsListener(new ChatFragment$initChat$7(this));
        MessageInput messageInput2 = this.etMessage;
        if (messageInput2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMessage");
        }
        messageInput2.getInputEditText().addTextChangedListener(new ChatFragment$initChat$8(this));
        changeMessagingVisibility(chat2.getReadOnly() != 1 && !this.ticketClosed);
        ChatsViewModel chatViewModel = getChatViewModel();
        String id = chat2.getId();
        Intrinsics.checkNotNullExpressionValue(id, "chat.id");
        chatViewModel.requestMessageList(id, 18, 0, true);
        if (this.fcmToken != null && (str = this.serviceMessage) != null && (!StringsKt.isBlank(str))) {
            ChatsViewModel chatViewModel2 = getChatViewModel();
            String str2 = this.chatId;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            double d = this.latitude;
            double d2 = this.longitude;
            String str3 = this.fcmToken;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fcmToken");
            }
            chatViewModel2.requestSendMessage(str2, str, d, d2, str3, "");
        }
    }

    private final void changeMessagingVisibility(boolean z) {
        MessageInput messageInput = this.etMessage;
        if (messageInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMessage");
        }
        int i = 4;
        messageInput.setVisibility(z ? 0 : 4);
        MessageInput messageInput2 = this.etMessage;
        if (messageInput2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMessage");
        }
        int i2 = -2;
        messageInput2.getLayoutParams().height = z ? -2 : 0;
        ImageView imageView = (ImageView) _$_findCachedViewById(C5619R.C5622id.ivSend);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivSend");
        if (z) {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(C5619R.C5622id.ivSend);
        Intrinsics.checkNotNullExpressionValue(imageView2, "ivSend");
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (!z) {
            i2 = 0;
        }
        layoutParams.height = i2;
    }

    /* access modifiers changed from: private */
    public final void handleChatLoaded(ChatEvent chatEvent) {
        Chat chat2;
        if (chatEvent.getSuccess() && (chat2 = chatEvent.getChat()) != null) {
            if (this.chat == null) {
                this.chat = chat2;
                showToolbar();
                initChat(chat2);
                return;
            }
            this.chat = chat2;
        }
    }

    /* access modifiers changed from: private */
    public final void handleChatExit(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            getBaseActivity().showChatListFragmentAfterDelete();
        } else {
            Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
        }
    }

    public void afterChatSettingsChanged() {
        Chat chat2 = this.chat;
        if (chat2 != null) {
            ChatsViewModel chatViewModel = getChatViewModel();
            String id = chat2.getId();
            Intrinsics.checkNotNullExpressionValue(id, "it.id");
            chatViewModel.requestChatById(id);
        }
    }

    /* access modifiers changed from: private */
    public final void handleMessageDelete(MessageDeleteEvent messageDeleteEvent) {
        if (messageDeleteEvent.getSuccess()) {
            Message messageEntity = messageDeleteEvent.getMessageEntity();
            if (messageEntity != null) {
                messageEntity.setDeleted(true);
                messageEntity.setFileList((List<Attachment>) null);
                messageEntity.setMessage(getString(R.string.this_message_was_deleted));
                CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
                if (customMessagesListAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                }
                customMessagesListAdapter.update(messageEntity);
                return;
            }
            return;
        }
        Toast.makeText(getContext(), messageDeleteEvent.getMessage(), 1).show();
    }

    public void onPause() {
        getBaseActivity().setTitleClickListener((View.OnClickListener) null);
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getCurrentFocus() == null)) {
            Context activity2 = getActivity();
            MessageInput messageInput = this.etMessage;
            if (messageInput == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etMessage");
            }
            UIHelper.hideKeyboard(activity2, messageInput);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.chat != null) {
            ChatsViewModel chatViewModel = getChatViewModel();
            String str = this.chatId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            chatViewModel.requestMessageList(str, 18, 0, true);
        }
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(this.mMessageReceiver, new IntentFilter("chatUpdate"));
    }

    public void onDetach() {
        CountDownTimer countDownTimer2 = this.countDownTimer;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(this.mMessageReceiver);
        super.onDetach();
    }

    public final BroadcastReceiver getMMessageReceiver() {
        return this.mMessageReceiver;
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void handleMessageListUpdateEvent(MessageListUpdateEvent messageListUpdateEvent) {
        if (this.chat != null) {
            if (messageListUpdateEvent.getSuccess()) {
                CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
                if (customMessagesListAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                }
                if (customMessagesListAdapter.getItemCount() == 0) {
                    this.messageList.clear();
                    List<Message> messageList2 = messageListUpdateEvent.getMessageList();
                    if (messageList2 != null) {
                        this.messageList.addAll(messageList2);
                        CustomMessagesListAdapter customMessagesListAdapter2 = this.messageAdapter;
                        if (customMessagesListAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                        }
                        customMessagesListAdapter2.addToEnd(messageList2, false);
                        CustomMessagesListAdapter customMessagesListAdapter3 = this.messageAdapter;
                        if (customMessagesListAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                        }
                        customMessagesListAdapter3.notifyDataSetChanged();
                    }
                } else if (messageListUpdateEvent.getNewMessages()) {
                    List<Message> messageList3 = messageListUpdateEvent.getMessageList();
                    if (messageList3 != null) {
                        Iterable<Message> reversed = CollectionsKt.reversed(getNewMessages(this.messageList, messageList3));
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(reversed, 10));
                        for (Message message : reversed) {
                            this.messageList.add(message);
                            CustomMessagesListAdapter customMessagesListAdapter4 = this.messageAdapter;
                            if (customMessagesListAdapter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                            }
                            customMessagesListAdapter4.addToStart(message, true);
                            arrayList.add(Unit.INSTANCE);
                        }
                        List list = (List) arrayList;
                    }
                } else {
                    List<Message> messageList4 = messageListUpdateEvent.getMessageList();
                    if (messageList4 != null) {
                        List<Message> newMessages = getNewMessages(this.messageList, messageList4);
                        this.messageList.addAll(newMessages);
                        CustomMessagesListAdapter customMessagesListAdapter5 = this.messageAdapter;
                        if (customMessagesListAdapter5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
                        }
                        customMessagesListAdapter5.addToEnd(newMessages, false);
                    }
                }
            }
            ChatsViewModel chatViewModel = getChatViewModel();
            String str = this.chatId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatId");
            }
            chatViewModel.requestMarkChatAsRead(str);
            return;
        }
        ChatFragment chatFragment = this;
        ChatsViewModel chatViewModel2 = chatFragment.getChatViewModel();
        String str2 = chatFragment.chatId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        chatViewModel2.requestChatById(str2);
    }

    private final List<Message> getNewMessages(List<Message> list, List<Message> list2) {
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterable<Message> iterable = list2;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Message message : iterable) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Message) obj).getId() == message.getId()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Object obj2 = (Message) obj;
            if (obj2 == null) {
                ChatFragment chatFragment = this;
                obj2 = Boolean.valueOf(arrayList.add(message));
            }
            arrayList2.add(obj2);
        }
        List list3 = (List) arrayList2;
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void handleChatDelete(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            getBaseActivity().showChatListFragmentAfterDelete();
        } else {
            Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
        }
    }

    public void showOptionsDialog(Chat chat2) {
        Intrinsics.checkNotNullParameter(chat2, ReactConst.CHAT);
        OptionsDialog newInstance = OptionsDialog.Companion.newInstance(chat2.getTitle(), getOptionsList(chat2));
        FragmentManager fragmentManager = getFragmentManager();
        Intrinsics.checkNotNull(fragmentManager);
        newInstance.show(fragmentManager, ChatBaseFragment.OPTIONS_DIALOG_TAG);
    }

    public ArrayList<OptionsItem> getOptionsList(Chat chat2) {
        if (chat2 == null) {
            return new ArrayList<>();
        }
        ArrayList<OptionsItem> baseOptionList = getBaseOptionList(chat2, this.userId);
        if (chat2.getParticipantsCount() > 2 && Intrinsics.areEqual((Object) chat2.getServiceType(), (Object) "0")) {
            String optionsType = OptionsType.TEXT.toString();
            if (optionsType != null) {
                String lowerCase = optionsType.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                String string = getString(R.string.chatGroupInformation);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chatGroupInformation)");
                baseOptionList.add(0, new OptionsItem(lowerCase, string, "", new ChatFragment$getOptionsList$$inlined$let$lambda$1(this, chat2)));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return baseOptionList;
    }

    /* access modifiers changed from: private */
    public final void showParticipants() {
        getBaseActivity().showParticipantsFragment(this.chat, this.userId);
    }

    /* access modifiers changed from: private */
    public final void selectionListener(int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
            if (customMessagesListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
            }
            ArrayList selectedMessages = customMessagesListAdapter.getSelectedMessages();
            Intrinsics.checkNotNullExpressionValue(selectedMessages, "messageAdapter.selectedMessages");
            Collection arrayList2 = new ArrayList();
            Iterator it = selectedMessages.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Message) next).getMy() != 1) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            if (((List) arrayList2).isEmpty()) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
                if (inflate != null) {
                    ImageButton imageButton = (ImageButton) inflate;
                    imageButton.setImageResource(R.drawable.icon_delete);
                    imageButton.setOnClickListener(new ChatFragment$selectionListener$2(this));
                    arrayList.add(imageButton);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                }
            }
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
            if (inflate2 != null) {
                ImageButton imageButton2 = (ImageButton) inflate2;
                imageButton2.setImageResource(R.drawable.icon_copy);
                imageButton2.setOnClickListener(new ChatFragment$selectionListener$3(this));
                arrayList.add(imageButton2);
                getBaseActivity().resetToolbar();
                getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
                getBaseActivity().ivLeft.setOnClickListener(new ChatFragment$selectionListener$4(this));
                BaseActivity baseActivity = getBaseActivity();
                baseActivity.setTextTitle(getString(R.string.chat_messages_chosen) + " " + String.valueOf(i));
                getBaseActivity().setToolbarRight(arrayList);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        getBaseActivity().resetToolbar();
        showToolbar();
    }

    /* access modifiers changed from: private */
    public final void sendMessage() {
        Chat chat2 = this.chat;
        if (chat2 != null) {
            Iterable<Attachment> iterable = this.attachmentList;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Attachment attachment : iterable) {
                ChatsViewModel chatViewModel = getChatViewModel();
                String id = chat2.getId();
                Intrinsics.checkNotNullExpressionValue(id, "chat.id");
                double d = this.latitude;
                double d2 = this.longitude;
                String str = this.fcmToken;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fcmToken");
                }
                chatViewModel.requestSendMessage(id, "", d, d2, str, attachment.getId());
                arrayList.add(Unit.INSTANCE);
            }
            List list = (List) arrayList;
            this.attachmentList.clear();
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvAttachPreview);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvAttachPreview");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            updateButtonSendEnablabilityWUT();
            MessageInput messageInput = this.etMessage;
            if (messageInput == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etMessage");
            }
            EditText inputEditText = messageInput.getInputEditText();
            Intrinsics.checkNotNullExpressionValue(inputEditText, "etMessage.inputEditText");
            if (inputEditText.getText().toString().length() > 0) {
                ChatsViewModel chatViewModel2 = getChatViewModel();
                String id2 = chat2.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "chat.id");
                MessageInput messageInput2 = this.etMessage;
                if (messageInput2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etMessage");
                }
                EditText inputEditText2 = messageInput2.getInputEditText();
                Intrinsics.checkNotNullExpressionValue(inputEditText2, "etMessage.inputEditText");
                String obj = inputEditText2.getText().toString();
                double d3 = this.latitude;
                double d4 = this.longitude;
                String str2 = this.fcmToken;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fcmToken");
                }
                chatViewModel2.requestSendMessage(id2, obj, d3, d4, str2, "");
            }
            MessageInput messageInput3 = this.etMessage;
            if (messageInput3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etMessage");
            }
            messageInput3.getInputEditText().setText("");
        }
    }

    /* access modifiers changed from: private */
    public final void selectAttachment() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        new AlertDialog.Builder(activity).setTitle((int) R.string.media_picker_what_to_attach).setPositiveButton((int) R.string.media_picker_photo, (DialogInterface.OnClickListener) new ChatFragment$selectAttachment$1(this)).setNeutralButton((int) R.string.cancel, (DialogInterface.OnClickListener) ChatFragment$selectAttachment$2.INSTANCE).show();
    }

    private final void getVideo() {
        new VideoPicker.Builder(getActivity()).mode(VideoPicker.Mode.CAMERA_AND_GALLERY).directory(VideoPicker.Directory.DEFAULT).extension(VideoPicker.Extension.MP4).enableDebuggingMode(true).build();
    }

    /* access modifiers changed from: private */
    public final void getPhoto() {
        new ImagePicker.Builder(getActivity()).mode(ImagePicker.Mode.CAMERA_AND_GALLERY).compressLevel(ImagePicker.ComperesLevel.MEDIUM).directory(ImagePicker.Directory.DEFAULT).extension(ImagePicker.Extension.JPG).scale(600, 600).allowMultipleImages(false).enableDebuggingMode(true).build();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AttachmentType attachmentType;
        ArrayList<String> stringArrayListExtra;
        ArrayList<String> stringArrayListExtra2;
        super.onActivityResult(i, i2, intent);
        if ((i == 53213 || i == 42141) && i2 == -1) {
            if (i == 42141) {
                attachmentType = AttachmentType.PHOTO;
            } else if (i != 53213) {
                attachmentType = AttachmentType.PHOTO;
            } else {
                attachmentType = AttachmentType.VIDEO;
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[attachmentType.ordinal()];
            String str = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (!(intent == null || (stringArrayListExtra2 = intent.getStringArrayListExtra(ImagePicker.EXTRA_IMAGE_PATH)) == null)) {
                    str = stringArrayListExtra2.get(0);
                }
            } else if (!(intent == null || (stringArrayListExtra = intent.getStringArrayListExtra(VideoPicker.EXTRA_VIDEO_PATH)) == null)) {
                str = stringArrayListExtra.get(0);
            }
            if (str != null) {
                this.attachmentList.add(new Attachment(str, attachmentType, ""));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvAttachPreview);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rvAttachPreview");
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                updateButtonSendEnablabilityWUT();
                uploadFile(str, attachmentType);
            }
            MessageInput messageInput = this.etMessage;
            if (messageInput == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etMessage");
            }
            messageInput.setInputListener(ChatFragment$onActivityResult$2.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public final void deleteAttachFromList(int i) {
        this.attachmentList.remove(i);
        updateButtonSendEnablabilityWUT();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvAttachPreview);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvAttachPreview");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void updateButtonSendEnablabilityWUT() {
        boolean z;
        Collection arrayList = new ArrayList();
        Iterator it = this.attachmentList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Attachment) next).getId().length() == 0) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        boolean isEmpty = ((List) arrayList).isEmpty();
        ImageView imageView = (ImageView) _$_findCachedViewById(C5619R.C5622id.ivSend);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivSend");
        MessageInput messageInput = this.etMessage;
        if (messageInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etMessage");
        }
        EditText inputEditText = messageInput.getInputEditText();
        Intrinsics.checkNotNullExpressionValue(inputEditText, "etMessage.inputEditText");
        if ((!StringsKt.isBlank(inputEditText.getText().toString())) || isEmpty) {
            z = true;
        }
        imageView.setEnabled(z);
    }

    private final void uploadFile(String str, AttachmentType attachmentType) {
        byte[] bArr;
        int i = WhenMappings.$EnumSwitchMapping$1[attachmentType.ordinal()];
        if (i == 1) {
            bArr = IOUtils.toByteArray(new FileInputStream(str));
        } else if (i == 2) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "Base64.encodeToString(byteArray, Base64.DEFAULT)");
        String replace$default = StringsKt.replace$default(encodeToString, "\n", "", false, 4, (Object) null);
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        ChatsViewModel chatViewModel = getChatViewModel();
        chatViewModel.requestUploadFile(replace$default, String.valueOf(new Date().getTime()) + "." + ((String) split$default.get(split$default.size() - 1)), str);
    }

    /* access modifiers changed from: private */
    public final void handleFileUpload(FileUploadEvent fileUploadEvent) {
        Collection arrayList = new ArrayList();
        for (Object next : this.attachmentList) {
            if (((Attachment) next).getPath().equals(fileUploadEvent.getPath())) {
                arrayList.add(next);
            }
        }
        Iterable<Attachment> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Attachment id : iterable) {
            id.setId(fileUploadEvent.getId());
            arrayList2.add(Unit.INSTANCE);
        }
        List list = (List) arrayList2;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvAttachPreview);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvAttachPreview");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        updateButtonSendEnablabilityWUT();
    }

    /* access modifiers changed from: private */
    public final void onMessageClickListener(Message message) {
        List<Attachment> fileList;
        Attachment attachment;
        String name;
        Attachment attachment2;
        String name2;
        Attachment attachment3;
        String name3;
        if (message != null && message.getImageUrl() != null) {
            List<Attachment> fileList2 = message.getFileList();
            if ((fileList2 == null || (attachment3 = fileList2.get(0)) == null || (name3 = attachment3.getName()) == null || !StringsKt.endsWith$default(name3, "jpg", false, 2, (Object) null)) && ((fileList = message.getFileList()) == null || (attachment2 = fileList.get(0)) == null || (name2 = attachment2.getName()) == null || !StringsKt.endsWith$default(name2, "png", false, 2, (Object) null))) {
                List<Attachment> fileList3 = message.getFileList();
                if (fileList3 != null && (attachment = fileList3.get(0)) != null && (name = attachment.getName()) != null && StringsKt.endsWith$default(name, "mp4", false, 2, (Object) null)) {
                    Intent intent = new Intent(getActivity(), VideoPlayerActivity.class);
                    List<Attachment> fileList4 = message.getFileList();
                    if (fileList4 != null) {
                        intent.putExtra(VideoPlayerActivity.VIDEO_URL, fileList4.get(0).getUrl());
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<Attachment> fileList5 = message.getFileList();
            if (fileList5 != null) {
                arrayList.add(new CarouselPhoto(fileList5.get(0).getUrl(), "", formatDate(message.getCreatedAt())));
            }
            UrlCarouselViewActivity.start(getActivity(), arrayList, (ArrayList<Integer>) null, (String) null, 0, true);
        }
    }

    public final void copySelectedMessages() {
        CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
        if (customMessagesListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
        }
        customMessagesListAdapter.copySelectedMessagesText(getContext(), new C6005x7c3f9c18(new ChatFragment$copySelectedMessages$1(this)), false);
        Toast.makeText(getContext(), getString(R.string.messagesCopied), 1).show();
    }

    public final void deleteSelectedMessages() {
        Context context = getContext();
        if (context != null) {
            new AlertDialog.Builder(context).setMessage((CharSequence) getString(R.string.you_really_want_to_delete_messages)).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) ChatFragment$deleteSelectedMessages$1$1.INSTANCE).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new ChatFragment$deleteSelectedMessages$$inlined$let$lambda$1(this)).show();
        }
    }

    /* access modifiers changed from: private */
    public final String getMessageAsString(Message message) {
        String formatDate = formatDate(message.getCreatedAt());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        Object[] objArr = {message.getUser().getName(), message.getMessage(), formatDate};
        String format = String.format(locale, "%s: %s (%s)", Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    private final String formatDate(Date date) {
        return new SimpleDateFormat("MMM d, EEE HH:mm", Locale.getDefault()).format(date);
    }

    public final void removeSelection() {
        CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
        if (customMessagesListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
        }
        customMessagesListAdapter.unselectAllItems();
        selectionListener(0);
    }

    public final void updatePoll(Poll poll) {
        if (poll != null) {
            CustomMessagesListAdapter customMessagesListAdapter = this.messageAdapter;
            if (customMessagesListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageAdapter");
            }
            customMessagesListAdapter.updatePoll(poll);
        }
    }

    private final void showThanksDialog(RatingBar ratingBar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "";
        if (ratingBar.getRating() <= ((float) 3) || isMarketVisit()) {
            objectRef.element = "Спасибо за отзыв. Вернуться к списку заявок";
            objectRef2.element = "Да";
            objectRef3.element = "";
        } else {
            objectRef.element = "Вам понравилась работа приложения? Хотите оценить его в Google Market?";
            objectRef2.element = "Перейти";
            objectRef3.element = "Позже";
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Ref.ObjectRef objectRef4 = objectRef;
            Ref.ObjectRef objectRef5 = objectRef2;
            RatingBar ratingBar2 = ratingBar;
            Ref.ObjectRef objectRef6 = objectRef3;
            new AlertDialog.Builder(activity).setTitle((CharSequence) getString(R.string.label_thanks)).setMessage((CharSequence) (String) objectRef.element).setPositiveButton((CharSequence) (String) objectRef2.element, (DialogInterface.OnClickListener) new ChatFragment$showThanksDialog$$inlined$let$lambda$1(this, objectRef4, objectRef5, ratingBar2, objectRef6)).setNegativeButton((CharSequence) (String) objectRef3.element, (DialogInterface.OnClickListener) new ChatFragment$showThanksDialog$$inlined$let$lambda$2(this, objectRef4, objectRef5, ratingBar2, objectRef6)).show();
        }
    }

    /* access modifiers changed from: private */
    public final void save() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        FragmentActivity activity = getActivity();
        if (activity != null && (sharedPreferences = activity.getSharedPreferences(getString(R.string.app_name_app), 0)) != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean(Constants.SHOW_GOOGLE_MARKET, true)) != null) {
            putBoolean.apply();
        }
    }

    /* access modifiers changed from: private */
    public final boolean isMarketVisit() {
        SharedPreferences sharedPreferences;
        FragmentActivity activity = getActivity();
        if (activity == null || (sharedPreferences = activity.getSharedPreferences(getString(R.string.app_name_app), 0)) == null) {
            return false;
        }
        return sharedPreferences.getBoolean(Constants.SHOW_GOOGLE_MARKET, false);
    }
}
