package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Actions;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TextField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TitleField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField;
import p035ru.unicorn.ujin.view.fragments.oss.OssViewModel;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssAnswer;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssData;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssQuestion;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssVoteAnswer;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000bH\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001eH\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u0010.\u001a\u000201H\u0002J\b\u00102\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0002J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eXD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006A"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssQuestionFragment;", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssBaseFragment;", "()V", "oss", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "getOss", "()Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "setOss", "(Lru/unicorn/ujin/view/fragments/oss/response/Oss;)V", "ossAnswerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "Lkotlin/collections/ArrayList;", "getOssAnswerList", "()Ljava/util/ArrayList;", "setOssAnswerList", "(Ljava/util/ArrayList;)V", "ossData", "Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "getOssData", "()Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "setOssData", "(Lru/unicorn/ujin/view/fragments/oss/response/OssData;)V", "questionNumber", "", "getQuestionNumber", "()I", "setQuestionNumber", "(I)V", "radioField", "", "getRadioField", "()Ljava/lang/String;", "showSmsConfirmation", "", "getShowSmsConfirmation", "()Z", "setShowSmsConfirmation", "(Z)V", "addOrReplaceAnswer", "", "ossVoteAnswer", "getDefaultAnswer", "handleButtonNextClick", "name", "handleOssData", "event", "Lru/unicorn/ujin/view/fragments/oss/events/OssDataEvent;", "handleVote", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "loadQuestion", "nextQuestion", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showError", "message", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment */
/* compiled from: OssQuestionFragment.kt */
public final class OssQuestionFragment extends OssBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Oss oss;
    private ArrayList<OssVoteAnswer> ossAnswerList = new ArrayList<>();
    private OssData ossData;
    private int questionNumber = -1;
    private final String radioField = "radioField";
    private boolean showSmsConfirmation;

    @JvmStatic
    public static final OssQuestionFragment newInstance(String str, Oss oss2, OssData ossData2, int i, ArrayList<OssVoteAnswer> arrayList, boolean z) {
        return Companion.newInstance(str, oss2, ossData2, i, arrayList, z);
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

    public final OssData getOssData() {
        return this.ossData;
    }

    public final void setOssData(OssData ossData2) {
        this.ossData = ossData2;
    }

    public final int getQuestionNumber() {
        return this.questionNumber;
    }

    public final void setQuestionNumber(int i) {
        this.questionNumber = i;
    }

    public final Oss getOss() {
        Oss oss2 = this.oss;
        if (oss2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SmartNavFragment.OSS);
        }
        return oss2;
    }

    public final void setOss(Oss oss2) {
        Intrinsics.checkNotNullParameter(oss2, "<set-?>");
        this.oss = oss2;
    }

    public final ArrayList<OssVoteAnswer> getOssAnswerList() {
        return this.ossAnswerList;
    }

    public final void setOssAnswerList(ArrayList<OssVoteAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.ossAnswerList = arrayList;
    }

    public final boolean getShowSmsConfirmation() {
        return this.showSmsConfirmation;
    }

    public final void setShowSmsConfirmation(boolean z) {
        this.showSmsConfirmation = z;
    }

    public final String getRadioField() {
        return this.radioField;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_dynamic, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getOssViewModel().showLoader.observe(getViewLifecycleOwner(), new OssQuestionFragment$onViewCreated$1(this));
        if (this.questionNumber == -1 || this.showSmsConfirmation) {
            getOssViewModel().getOssDataMutableLiveData().observe(getViewLifecycleOwner(), new OssQuestionFragment$onViewCreated$2(this));
            OssViewModel ossViewModel = getOssViewModel();
            Oss oss2 = this.oss;
            if (oss2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SmartNavFragment.OSS);
            }
            ossViewModel.requestCurrentOssQuestions(oss2.getId());
            return;
        }
        getOssViewModel().getOssVoteLiveData().observe(getViewLifecycleOwner(), new OssQuestionFragment$onViewCreated$3(this));
        loadQuestion();
    }

    /* access modifiers changed from: private */
    public final void handleVote(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.oss_make_vote_dialog_title)).setMessage((CharSequence) getString(R.string.oss_make_vote_dialog_message)).setPositiveButton((CharSequence) getString(R.string.ok), (DialogInterface.OnClickListener) new OssQuestionFragment$handleVote$1(this)).show();
        } else {
            showMessage(updateEvent.getMessage());
        }
    }

    private final void loadQuestion() {
        ArrayList<OssQuestion> questionList;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        OssData ossData2 = this.ossData;
        if (ossData2 != null) {
            ArrayList arrayList = new ArrayList();
            String str = "<br>";
            arrayList.addAll(CollectionsKt.listOf(new TitleField("<br>" + ossData2.getTitle(), (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), new TextField("<br>Вопрос №" + (this.questionNumber + 1) + str, "secondary", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new TextField(ossData2.getQuestionList().get(this.questionNumber).getQuestion(), (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)));
            String proposal = ossData2.getQuestionList().get(this.questionNumber).getProposal();
            if (proposal != null) {
                if (proposal.length() > 0) {
                    String string = getString(R.string.oss_question_proposed);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.oss_question_proposed)");
                    arrayList.add(new TextField(string, "secondary", (String) null, (String) null, 12, (DefaultConstructorMarker) null));
                    arrayList.add(new TextField(ossData2.getQuestionList().get(this.questionNumber).getProposal() + str, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null));
                }
            }
            Field[] fieldArr = new Field[3];
            String defaultAnswer = getDefaultAnswer();
            ArrayList arrayList2 = new ArrayList();
            Iterable<OssAnswer> answerList = ossData2.getQuestionList().get(this.questionNumber).getAnswerList();
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(answerList, 10));
            for (OssAnswer ossAnswer : answerList) {
                arrayList3.add(Boolean.valueOf(arrayList2.add(new SelectValue(String.valueOf(ossAnswer.getId()), ossAnswer.getValue()))));
            }
            List list = (List) arrayList3;
            Unit unit = Unit.INSTANCE;
            RadioButtonsField radioButtonsField = new RadioButtonsField("", defaultAnswer, arrayList2, RadioButtonsField.Type.INSTANCE.getRtl(), RadioButtonsField.Style.INSTANCE.getUnderlined());
            radioButtonsField.setName(this.radioField);
            Unit unit2 = Unit.INSTANCE;
            fieldArr[0] = radioButtonsField;
            StringBuilder sb = new StringBuilder();
            sb.append("<br>Вопрос ");
            sb.append(this.questionNumber + 1);
            sb.append(" из ");
            OssData ossData3 = this.ossData;
            sb.append((ossData3 == null || (questionList = ossData3.getQuestionList()) == null) ? null : Integer.valueOf(questionList.size()));
            sb.append(str);
            fieldArr[1] = new TextField(sb.toString(), "secondary", "center", (String) null, 8, (DefaultConstructorMarker) null);
            fieldArr[2] = new TwoButtonsField(new ButtonField(getString(R.string.oss_question_back), ButtonField.Type.styleStroked, "", new Actions(new ClickAction(ClickAction.Type.customClick, (ClickActionData) null)), new OssQuestionFragment$loadQuestion$$inlined$apply$lambda$1(recyclerView, this), OssQuestionFragment$loadQuestion$1$1$4.INSTANCE, OssQuestionFragment$loadQuestion$1$1$5.INSTANCE), new ButtonField(getString(R.string.oss_question_next), ButtonField.Type.styleFilled, "", new Actions(new ClickAction(ClickAction.Type.customClick, (ClickActionData) null)), new OssQuestionFragment$loadQuestion$$inlined$apply$lambda$2(recyclerView, this), OssQuestionFragment$loadQuestion$1$1$7.INSTANCE, OssQuestionFragment$loadQuestion$1$1$8.INSTANCE));
            arrayList.addAll(CollectionsKt.listOf(fieldArr));
            recyclerView.setAdapter(new DataEntryAdapter(arrayList));
        }
    }

    private final String getDefaultAnswer() {
        ArrayList<OssQuestion> questionList;
        OssQuestion ossQuestion;
        String str = null;
        int size = this.ossAnswerList.size();
        for (int i = 0; i < size; i++) {
            int questionId = this.ossAnswerList.get(i).getQuestionId();
            OssData ossData2 = this.ossData;
            if (ossData2 != null && (questionList = ossData2.getQuestionList()) != null && (ossQuestion = questionList.get(this.questionNumber)) != null && questionId == ossQuestion.getId()) {
                return String.valueOf(this.ossAnswerList.get(i).getAnswerId());
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01f7, code lost:
        if ((r4 != null ? r4.size() : 0) > 0) goto L_0x01f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleOssData(p035ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = r24.getSuccess()
            if (r1 == 0) goto L_0x037a
            ru.unicorn.ujin.view.fragments.oss.response.OssData r1 = r24.getOssData()
            r0.ossData = r1
            int r1 = p035ru.unicorn.C5619R.C5622id.rvDynamic
            android.view.View r1 = r0._$_findCachedViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r1.getContext()
            r4 = 1
            r5 = 0
            r2.<init>(r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r2
            r1.setLayoutManager(r2)
            ru.unicorn.ujin.view.fragments.oss.response.OssData r2 = r0.ossData
            if (r2 == 0) goto L_0x0365
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 5
            ru.unicorn.ujin.view.dialogs.dataEntry.Field[] r6 = new p035ru.unicorn.ujin.view.dialogs.dataEntry.Field[r6]
            ru.unicorn.ujin.view.dialogs.dataEntry.TitleField r14 = new ru.unicorn.ujin.view.dialogs.dataEntry.TitleField
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = "<br>"
            r7.append(r15)
            java.lang.String r8 = r2.getTitle()
            r7.append(r8)
            java.lang.String r8 = r7.toString()
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 14
            r13 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            ru.unicorn.ujin.view.dialogs.dataEntry.Field r14 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r14
            r6[r5] = r14
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r14 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r7 = 2131887518(0x7f12059e, float:1.9409645E38)
            java.lang.String r8 = r0.getString(r7)
            java.lang.String r7 = "getString(R.string.oss_info_time)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r12 = 12
            java.lang.String r9 = "secondary"
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            ru.unicorn.ujin.view.dialogs.dataEntry.Field r14 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r14
            r6[r4] = r14
            r7 = 2
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r16 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "C "
            r8.append(r9)
            java.lang.String r9 = r2.getStartDate()
            r8.append(r9)
            java.lang.String r9 = " по "
            r8.append(r9)
            java.lang.String r9 = r2.getEndDate()
            r8.append(r9)
            r8.append(r15)
            java.lang.String r9 = r8.toString()
            r12 = 0
            r13 = 14
            r14 = 0
            r8 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            ru.unicorn.ujin.view.dialogs.dataEntry.Field r16 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r16
            r6[r7] = r16
            r7 = 3
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r16 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r8 = 2131887517(0x7f12059d, float:1.9409643E38)
            java.lang.String r9 = r0.getString(r8)
            java.lang.String r8 = "getString(R.string.oss_info_theme)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            r13 = 12
            java.lang.String r10 = "secondary"
            r8 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            ru.unicorn.ujin.view.dialogs.dataEntry.Field r16 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r16
            r6[r7] = r16
            r7 = 4
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r16 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r2.getDescription()
            r8.append(r9)
            r8.append(r15)
            java.lang.String r9 = r8.toString()
            r10 = 0
            r13 = 14
            r8 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            ru.unicorn.ujin.view.dialogs.dataEntry.Field r16 = (p035ru.unicorn.ujin.view.dialogs.dataEntry.Field) r16
            r6[r7] = r16
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            java.lang.String r6 = r2.getDetailedDescription()
            if (r6 == 0) goto L_0x0144
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x00fe
            r6 = 1
            goto L_0x00ff
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            if (r6 != r4) goto L_0x0144
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r6 = 2131887514(0x7f12059a, float:1.9409637E38)
            java.lang.String r8 = r0.getString(r6)
            java.lang.String r6 = "getString(R.string.oss_info_detailed_info)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            r10 = 0
            r11 = 0
            r12 = 12
            r13 = 0
            java.lang.String r9 = "secondary"
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3.add(r4)
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.getDetailedDescription()
            r6.append(r7)
            r6.append(r15)
            java.lang.String r17 = r6.toString()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3.add(r4)
        L_0x0144:
            boolean r4 = r2.isVoted()
            java.lang.String r6 = "custom_click"
            r7 = 0
            if (r4 != 0) goto L_0x0183
            boolean r4 = r2.isArchived()
            if (r4 != 0) goto L_0x0183
            ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField
            r8 = 2131887516(0x7f12059c, float:1.9409641E38)
            java.lang.String r9 = r0.getString(r8)
            ru.unicorn.ujin.view.dialogs.dataEntry.Actions r12 = new ru.unicorn.ujin.view.dialogs.dataEntry.Actions
            ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction
            r8.<init>(r6, r7)
            r12.<init>(r8)
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$$inlined$apply$lambda$1 r8 = new ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$$inlined$apply$lambda$1
            r8.<init>(r1, r0)
            r13 = r8
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$2 r8 = p035ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$2.INSTANCE
            r14 = r8
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$3 r8 = p035ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$3.INSTANCE
            r15 = r8
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            java.lang.String r10 = "filled"
            java.lang.String r11 = ""
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3.add(r4)
        L_0x0183:
            boolean r4 = r2.isVoted()
            if (r4 == 0) goto L_0x01c9
            boolean r4 = r2.isVerified()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r2.isArchived()
            if (r4 != 0) goto L_0x01c9
            ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField
            android.content.Context r8 = r1.getContext()
            r9 = 2131887515(0x7f12059b, float:1.940964E38)
            java.lang.String r9 = r8.getString(r9)
            ru.unicorn.ujin.view.dialogs.dataEntry.Actions r12 = new ru.unicorn.ujin.view.dialogs.dataEntry.Actions
            ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction
            r8.<init>(r6, r7)
            r12.<init>(r8)
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$$inlined$apply$lambda$2 r6 = new ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$$inlined$apply$lambda$2
            r6.<init>(r1, r0)
            r13 = r6
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$5 r6 = p035ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$5.INSTANCE
            r14 = r6
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$6 r6 = p035ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$6.INSTANCE
            r15 = r6
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            java.lang.String r10 = "filled"
            java.lang.String r11 = ""
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3.add(r4)
        L_0x01c9:
            ru.unicorn.ujin.view.fragments.oss.response.OssDataContacts r2 = r2.getContacts()
            if (r2 == 0) goto L_0x0357
            java.util.ArrayList r4 = r2.getPhoneList()
            if (r4 == 0) goto L_0x01da
            int r4 = r4.size()
            goto L_0x01db
        L_0x01da:
            r4 = 0
        L_0x01db:
            if (r4 > 0) goto L_0x01f9
            java.util.ArrayList r4 = r2.getEmailList()
            if (r4 == 0) goto L_0x01e8
            int r4 = r4.size()
            goto L_0x01e9
        L_0x01e8:
            r4 = 0
        L_0x01e9:
            if (r4 > 0) goto L_0x01f9
            java.util.ArrayList r4 = r2.getSiteList()
            if (r4 == 0) goto L_0x01f6
            int r4 = r4.size()
            goto L_0x01f7
        L_0x01f6:
            r4 = 0
        L_0x01f7:
            if (r4 <= 0) goto L_0x0216
        L_0x01f9:
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r6 = 2131887512(0x7f120598, float:1.9409633E38)
            java.lang.String r9 = r0.getString(r6)
            java.lang.String r6 = "getString(R.string.oss_info_contacts_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            r12 = 0
            r13 = 8
            r14 = 0
            java.lang.String r10 = "secondary"
            java.lang.String r11 = "center"
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r4)
        L_0x0216:
            java.util.ArrayList r4 = r2.getPhoneList()
            r6 = 10
            if (r4 == 0) goto L_0x0281
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0240
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r9 = 2131887511(0x7f120597, float:1.9409631E38)
            java.lang.String r10 = r0.getString(r9)
            java.lang.String r9 = "getString(R.string.oss_info_contacts_phone_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            java.lang.String r11 = "secondary"
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.add(r8)
        L_0x0240:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r6)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r4 = r4.iterator()
        L_0x0251:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x027f
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            ru.unicorn.ujin.view.dialogs.dataEntry.Contact r11 = new ru.unicorn.ujin.view.dialogs.dataEntry.Contact
            java.lang.String r12 = "phone"
            r11.<init>(r12, r9, r7)
            r10.add(r11)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField r9 = new ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField
            r9.<init>(r10)
            boolean r9 = r3.add(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.add(r9)
            goto L_0x0251
        L_0x027f:
            java.util.List r8 = (java.util.List) r8
        L_0x0281:
            java.util.ArrayList r4 = r2.getEmailList()
            if (r4 == 0) goto L_0x02ea
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x02a9
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r8 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            r9 = 2131887510(0x7f120596, float:1.940963E38)
            java.lang.String r10 = r0.getString(r9)
            java.lang.String r9 = "getString(R.string.oss_info_contacts_email_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            java.lang.String r11 = "secondary"
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.add(r8)
        L_0x02a9:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r6)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r4 = r4.iterator()
        L_0x02ba:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x02e8
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            ru.unicorn.ujin.view.dialogs.dataEntry.Contact r11 = new ru.unicorn.ujin.view.dialogs.dataEntry.Contact
            java.lang.String r12 = "email"
            r11.<init>(r12, r9, r7)
            r10.add(r11)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField r9 = new ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField
            r9.<init>(r10)
            boolean r9 = r3.add(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.add(r9)
            goto L_0x02ba
        L_0x02e8:
            java.util.List r8 = (java.util.List) r8
        L_0x02ea:
            java.util.ArrayList r2 = r2.getSiteList()
            if (r2 == 0) goto L_0x0357
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0316
            ru.unicorn.ujin.view.dialogs.dataEntry.TextField r4 = new ru.unicorn.ujin.view.dialogs.dataEntry.TextField
            android.content.Context r8 = r1.getContext()
            r9 = 2131887513(0x7f120599, float:1.9409635E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r8 = "context.getString(R.stri…_info_contacts_url_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            java.lang.String r10 = "secondary"
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r4)
        L_0x0316:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r6)
            r4.<init>(r6)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L_0x0327:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0355
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            ru.unicorn.ujin.view.dialogs.dataEntry.Contact r9 = new ru.unicorn.ujin.view.dialogs.dataEntry.Contact
            java.lang.String r10 = "url"
            r9.<init>(r10, r6, r7)
            r8.add(r9)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField r6 = new ru.unicorn.ujin.view.dialogs.dataEntry.ContactsField
            r6.<init>(r8)
            boolean r6 = r3.add(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.add(r6)
            goto L_0x0327
        L_0x0355:
            java.util.List r4 = (java.util.List) r4
        L_0x0357:
            ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter r2 = new ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter
            java.util.List r3 = (java.util.List) r3
            r2.<init>(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = (androidx.recyclerview.widget.RecyclerView.Adapter) r2
            r1.setAdapter(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0365:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            boolean r1 = r0.showSmsConfirmation
            if (r1 == 0) goto L_0x0381
            r0.showSmsConfirmation = r5
            ru.unicorn.ujin.view.fragments.oss.response.Oss r1 = r0.oss
            if (r1 != 0) goto L_0x0376
            java.lang.String r2 = "oss"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0376:
            r0.showSmsConfirmation(r1)
            goto L_0x0381
        L_0x037a:
            java.lang.String r1 = r24.getMessage()
            r0.showError(r1)
        L_0x0381:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment.handleOssData(ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent):void");
    }

    private final void showError(String str) {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) str).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new OssQuestionFragment$showError$1(this)).show();
    }

    /* access modifiers changed from: private */
    public final void handleButtonNextClick(String str) {
        ArrayList<OssQuestion> questionList;
        ArrayList<OssQuestion> questionList2;
        OssQuestion ossQuestion;
        if (this.questionNumber > -1) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvDynamic");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int i = 0;
                String str2 = ((DataEntryAdapter) adapter).getParamsMap(0).get(this.radioField);
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() > 0) {
                    if (this.questionNumber != -1) {
                        OssData ossData2 = this.ossData;
                        int id = (ossData2 == null || (questionList2 = ossData2.getQuestionList()) == null || (ossQuestion = questionList2.get(this.questionNumber)) == null) ? 0 : ossQuestion.getId();
                        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvDynamic");
                        RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                        if (adapter2 != null) {
                            String str3 = ((DataEntryAdapter) adapter2).getParamsMap(0).get(this.radioField);
                            if (str3 == null) {
                                str3 = "-1";
                            }
                            addOrReplaceAnswer(new OssVoteAnswer(id, Integer.parseInt(str3)));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
                        }
                    }
                    int i2 = this.questionNumber + 1;
                    OssData ossData3 = this.ossData;
                    if (i2 < ((ossData3 == null || (questionList = ossData3.getQuestionList()) == null) ? 0 : questionList.size())) {
                        nextQuestion();
                        return;
                    }
                    OssViewModel ossViewModel = getOssViewModel();
                    OssData ossData4 = this.ossData;
                    if (ossData4 != null) {
                        i = ossData4.getId();
                    }
                    ossViewModel.vote(i, this.ossAnswerList);
                    return;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
            }
        }
        if (this.questionNumber == -1) {
            new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.oss_start_voting_dialog_title)).setMessage((CharSequence) getString(R.string.oss_start_voting_dialog_message)).setPositiveButton((CharSequence) getString(R.string.oss_start_voting_dialog_positive), (DialogInterface.OnClickListener) new OssQuestionFragment$handleButtonNextClick$1(this)).setNegativeButton((CharSequence) getString(R.string.oss_start_voting_dialog_negative), (DialogInterface.OnClickListener) OssQuestionFragment$handleButtonNextClick$2.INSTANCE).show();
        } else {
            showMessage(getString(R.string.oss_voting_choose_answer));
        }
    }

    /* access modifiers changed from: private */
    public final void nextQuestion() {
        Companion companion = Companion;
        String title = getTitle();
        Oss oss2 = this.oss;
        if (oss2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SmartNavFragment.OSS);
        }
        nextFragment(companion.newInstance(title, oss2, this.ossData, this.questionNumber + 1, this.ossAnswerList, false), false, BaseActivity.FRAGMENT_OSS_QUESTION + (this.questionNumber + 1));
    }

    private final void addOrReplaceAnswer(OssVoteAnswer ossVoteAnswer) {
        int size = this.ossAnswerList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (this.ossAnswerList.get(i).getQuestionId() == ossVoteAnswer.getQuestionId()) {
                this.ossAnswerList.get(i).setAnswerId(ossVoteAnswer.getAnswerId());
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            this.ossAnswerList.add(ossVoteAnswer);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssQuestionFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssQuestionFragment;", "title", "", "oss", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "ossData", "Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "questionNumber", "", "ossAnswerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "Lkotlin/collections/ArrayList;", "showSmsConfirmation", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$Companion */
    /* compiled from: OssQuestionFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OssQuestionFragment newInstance(String str, Oss oss, OssData ossData, int i, ArrayList<OssVoteAnswer> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(oss, SmartNavFragment.OSS);
            Intrinsics.checkNotNullParameter(arrayList, "ossAnswerList");
            OssQuestionFragment ossQuestionFragment = new OssQuestionFragment();
            ossQuestionFragment.setTitle(str);
            ossQuestionFragment.setOss(oss);
            ossQuestionFragment.setOssData(ossData);
            ossQuestionFragment.setQuestionNumber(i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            Unit unit = Unit.INSTANCE;
            ossQuestionFragment.setOssAnswerList(arrayList2);
            ossQuestionFragment.setShowSmsConfirmation(z);
            return ossQuestionFragment;
        }
    }
}
