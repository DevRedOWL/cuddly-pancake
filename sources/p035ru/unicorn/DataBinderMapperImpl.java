package p035ru.unicorn;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.facebook.common.util.UriUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.ActivityRegistrationBindingImpl;
import p035ru.unicorn.databinding.Fake1BindingImpl;
import p035ru.unicorn.databinding.Fake2BindingImpl;
import p035ru.unicorn.databinding.FragmentAnotherPassBindingImpl;
import p035ru.unicorn.databinding.FragmentApartmentListBindingImpl;
import p035ru.unicorn.databinding.FragmentApplicationToCompanyBindingImpl;
import p035ru.unicorn.databinding.FragmentBleSettingsBindingImpl;
import p035ru.unicorn.databinding.FragmentConnectToCompanyBindingImpl;
import p035ru.unicorn.databinding.FragmentCoronaCreateCompanyBindingImpl;
import p035ru.unicorn.databinding.FragmentCoronaCreatePass2BindingImpl;
import p035ru.unicorn.databinding.FragmentFifthStageBindingImpl;
import p035ru.unicorn.databinding.FragmentFirstStageBindingImpl;
import p035ru.unicorn.databinding.FragmentFirstStageEditBindingImpl;
import p035ru.unicorn.databinding.FragmentFourthStageBindingImpl;
import p035ru.unicorn.databinding.FragmentGateBindingImpl;
import p035ru.unicorn.databinding.FragmentMorionServiceTicketBindingImpl;
import p035ru.unicorn.databinding.FragmentNewSubaccountBindingImpl;
import p035ru.unicorn.databinding.FragmentPassBleFirstBindingImpl;
import p035ru.unicorn.databinding.FragmentPassBleQrBindingImpl;
import p035ru.unicorn.databinding.FragmentPassBleSecondBindingImpl;
import p035ru.unicorn.databinding.FragmentPassBleZeroBindingImpl;
import p035ru.unicorn.databinding.FragmentPassCardFirstBindingImpl;
import p035ru.unicorn.databinding.FragmentPassDetail2BindingImpl;
import p035ru.unicorn.databinding.FragmentPassDetailBindingImpl;
import p035ru.unicorn.databinding.FragmentPassFaceFirstBindingImpl;
import p035ru.unicorn.databinding.FragmentPassFaceSecondBindingImpl;
import p035ru.unicorn.databinding.FragmentPassFaceThirdBindingImpl;
import p035ru.unicorn.databinding.FragmentPassFingerFirstBindingImpl;
import p035ru.unicorn.databinding.FragmentPassFingerSecondBindingImpl;
import p035ru.unicorn.databinding.FragmentPassProfileBindingImpl;
import p035ru.unicorn.databinding.FragmentPassProfileEditBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsBleBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsCardBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsCardInfoBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsFaceBindingImpl;
import p035ru.unicorn.databinding.FragmentPassSettingsFingerBindingImpl;
import p035ru.unicorn.databinding.FragmentProfileSelectionBindingImpl;
import p035ru.unicorn.databinding.FragmentProfileSelectionStage3BindingImpl;
import p035ru.unicorn.databinding.FragmentProfileSelectionStage4BindingImpl;
import p035ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4BindingImpl;
import p035ru.unicorn.databinding.FragmentReturnTicketBindingImpl;
import p035ru.unicorn.databinding.FragmentShowRecordBindingImpl;
import p035ru.unicorn.databinding.FragmentThirdStageBindingImpl;
import p035ru.unicorn.databinding.ItemAnotherGuestDataTitleBindingImpl;
import p035ru.unicorn.databinding.ItemAnotherPassData2BindingImpl;
import p035ru.unicorn.databinding.ItemAnotherPassDataBindingImpl;
import p035ru.unicorn.databinding.ItemAnotherPassDataWithHintBindingImpl;
import p035ru.unicorn.databinding.ItemAnotherTitleBindingImpl;
import p035ru.unicorn.databinding.ItemApplicationToCompanyBindingImpl;
import p035ru.unicorn.databinding.ItemBleSwitchButtonBindingImpl;
import p035ru.unicorn.databinding.ItemFieldSpinnerBindingImpl;
import p035ru.unicorn.databinding.ItemFinishStageBindingImpl;
import p035ru.unicorn.databinding.ItemIdPassItemsBindingImpl;
import p035ru.unicorn.databinding.ItemIdPassTitleSubtitleBindingImpl;
import p035ru.unicorn.databinding.ItemImageBindingImpl;
import p035ru.unicorn.databinding.ItemLabelUnderlineWithArrow2BindingImpl;
import p035ru.unicorn.databinding.ItemLabelUnderlineWithArrowBindingImpl;
import p035ru.unicorn.databinding.ItemLabelValueBindingImpl;
import p035ru.unicorn.databinding.ItemLabelWithSwitchBindingImpl;
import p035ru.unicorn.databinding.ItemPassArrowBindingImpl;
import p035ru.unicorn.databinding.ItemPassBindingImpl;
import p035ru.unicorn.databinding.ItemPassCard2BindingImpl;
import p035ru.unicorn.databinding.ItemPassCompanyBindingImpl;
import p035ru.unicorn.databinding.ItemPassCompanyInfoBindingImpl;
import p035ru.unicorn.databinding.ItemPassEditableBindingImpl;
import p035ru.unicorn.databinding.ItemPassFinger2BindingImpl;
import p035ru.unicorn.databinding.ItemPassFingerBindingImpl;
import p035ru.unicorn.databinding.ItemPassIdTitleWithImageBindingImpl;
import p035ru.unicorn.databinding.ItemPassProfileBindingImpl;
import p035ru.unicorn.databinding.ItemPassProfileEmptyBindingImpl;
import p035ru.unicorn.databinding.ItemProfileChooserBindingImpl;
import p035ru.unicorn.databinding.ItemProfileChooserStage3BindingImpl;
import p035ru.unicorn.databinding.ItemProfileChooserStage4BindingImpl;
import p035ru.unicorn.databinding.ItemProfileEditable2BindingImpl;
import p035ru.unicorn.databinding.ItemProfileEditableBindingImpl;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.util.Flavors;

/* renamed from: ru.unicorn.DataBinderMapperImpl */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(76);
    private static final int LAYOUT_ACTIVITYREGISTRATION = 1;
    private static final int LAYOUT_FAKE1 = 2;
    private static final int LAYOUT_FAKE2 = 3;
    private static final int LAYOUT_FRAGMENTANOTHERPASS = 4;
    private static final int LAYOUT_FRAGMENTAPARTMENTLIST = 5;
    private static final int LAYOUT_FRAGMENTAPPLICATIONTOCOMPANY = 6;
    private static final int LAYOUT_FRAGMENTBLESETTINGS = 7;
    private static final int LAYOUT_FRAGMENTCONNECTTOCOMPANY = 8;
    private static final int LAYOUT_FRAGMENTCORONACREATECOMPANY = 9;
    private static final int LAYOUT_FRAGMENTCORONACREATEPASS2 = 10;
    private static final int LAYOUT_FRAGMENTFIFTHSTAGE = 11;
    private static final int LAYOUT_FRAGMENTFIRSTSTAGE = 12;
    private static final int LAYOUT_FRAGMENTFIRSTSTAGEEDIT = 13;
    private static final int LAYOUT_FRAGMENTFOURTHSTAGE = 14;
    private static final int LAYOUT_FRAGMENTGATE = 15;
    private static final int LAYOUT_FRAGMENTMORIONSERVICETICKET = 16;
    private static final int LAYOUT_FRAGMENTNEWSUBACCOUNT = 17;
    private static final int LAYOUT_FRAGMENTPASSBLEFIRST = 18;
    private static final int LAYOUT_FRAGMENTPASSBLEQR = 19;
    private static final int LAYOUT_FRAGMENTPASSBLESECOND = 20;
    private static final int LAYOUT_FRAGMENTPASSBLEZERO = 21;
    private static final int LAYOUT_FRAGMENTPASSCARDFIRST = 22;
    private static final int LAYOUT_FRAGMENTPASSDETAIL = 23;
    private static final int LAYOUT_FRAGMENTPASSDETAIL2 = 24;
    private static final int LAYOUT_FRAGMENTPASSFACEFIRST = 25;
    private static final int LAYOUT_FRAGMENTPASSFACESECOND = 26;
    private static final int LAYOUT_FRAGMENTPASSFACETHIRD = 27;
    private static final int LAYOUT_FRAGMENTPASSFINGERFIRST = 28;
    private static final int LAYOUT_FRAGMENTPASSFINGERSECOND = 29;
    private static final int LAYOUT_FRAGMENTPASSPROFILE = 30;
    private static final int LAYOUT_FRAGMENTPASSPROFILEEDIT = 31;
    private static final int LAYOUT_FRAGMENTPASSSETTINGS = 32;
    private static final int LAYOUT_FRAGMENTPASSSETTINGSBLE = 33;
    private static final int LAYOUT_FRAGMENTPASSSETTINGSCARD = 34;
    private static final int LAYOUT_FRAGMENTPASSSETTINGSCARDINFO = 35;
    private static final int LAYOUT_FRAGMENTPASSSETTINGSFACE = 36;
    private static final int LAYOUT_FRAGMENTPASSSETTINGSFINGER = 37;
    private static final int LAYOUT_FRAGMENTPROFILESELECTION = 38;
    private static final int LAYOUT_FRAGMENTPROFILESELECTIONSTAGE3 = 39;
    private static final int LAYOUT_FRAGMENTPROFILESELECTIONSTAGE4 = 40;
    private static final int LAYOUT_FRAGMENTPROFILESELECTIONUKATTACHMENT4 = 41;
    private static final int LAYOUT_FRAGMENTRETURNTICKET = 42;
    private static final int LAYOUT_FRAGMENTSHOWRECORD = 43;
    private static final int LAYOUT_FRAGMENTTHIRDSTAGE = 44;
    private static final int LAYOUT_ITEMANOTHERGUESTDATATITLE = 45;
    private static final int LAYOUT_ITEMANOTHERPASSDATA = 46;
    private static final int LAYOUT_ITEMANOTHERPASSDATA2 = 47;
    private static final int LAYOUT_ITEMANOTHERPASSDATAWITHHINT = 48;
    private static final int LAYOUT_ITEMANOTHERTITLE = 49;
    private static final int LAYOUT_ITEMAPPLICATIONTOCOMPANY = 50;
    private static final int LAYOUT_ITEMBLESWITCHBUTTON = 51;
    private static final int LAYOUT_ITEMFIELDSPINNER = 52;
    private static final int LAYOUT_ITEMFINISHSTAGE = 53;
    private static final int LAYOUT_ITEMIDPASSITEMS = 54;
    private static final int LAYOUT_ITEMIDPASSTITLESUBTITLE = 55;
    private static final int LAYOUT_ITEMIMAGE = 56;
    private static final int LAYOUT_ITEMLABELUNDERLINEWITHARROW = 57;
    private static final int LAYOUT_ITEMLABELUNDERLINEWITHARROW2 = 58;
    private static final int LAYOUT_ITEMLABELVALUE = 59;
    private static final int LAYOUT_ITEMLABELWITHSWITCH = 60;
    private static final int LAYOUT_ITEMPASS = 61;
    private static final int LAYOUT_ITEMPASSARROW = 62;
    private static final int LAYOUT_ITEMPASSCARD2 = 63;
    private static final int LAYOUT_ITEMPASSCOMPANY = 64;
    private static final int LAYOUT_ITEMPASSCOMPANYINFO = 65;
    private static final int LAYOUT_ITEMPASSEDITABLE = 66;
    private static final int LAYOUT_ITEMPASSFINGER = 67;
    private static final int LAYOUT_ITEMPASSFINGER2 = 68;
    private static final int LAYOUT_ITEMPASSIDTITLEWITHIMAGE = 69;
    private static final int LAYOUT_ITEMPASSPROFILE = 70;
    private static final int LAYOUT_ITEMPASSPROFILEEMPTY = 71;
    private static final int LAYOUT_ITEMPROFILECHOOSER = 72;
    private static final int LAYOUT_ITEMPROFILECHOOSERSTAGE3 = 73;
    private static final int LAYOUT_ITEMPROFILECHOOSERSTAGE4 = 74;
    private static final int LAYOUT_ITEMPROFILEEDITABLE = 75;
    private static final int LAYOUT_ITEMPROFILEEDITABLE2 = 76;

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_registration, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fake_1, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fake_2, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_another_pass, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_apartment_list, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_application_to_company, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_ble_settings, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_connect_to_company, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_corona_create_company, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_corona_create_pass2, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_fifth_stage, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_first_stage, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_first_stage_edit, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_fourth_stage, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_gate, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_morion_service_ticket, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_new_subaccount, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_ble_first, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_ble_qr, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_ble_second, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_ble_zero, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_card_first, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_detail, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_detail2, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_face_first, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_face_second, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_face_third, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_finger_first, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_finger_second, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_profile, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_profile_edit, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings_ble, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings_card, 34);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings_card_info, 35);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings_face, 36);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pass_settings_finger, 37);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_profile_selection, 38);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_profile_selection_stage_3, 39);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_profile_selection_stage_4, 40);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_profile_selection_uk_attachment_4, 41);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_return_ticket, 42);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_show_record, 43);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_third_stage, 44);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_another_guest_data_title, 45);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_another_pass_data, 46);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_another_pass_data_2, 47);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_another_pass_data_with_hint, 48);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_another_title, 49);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_application_to_company, 50);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_ble_switch_button, 51);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_field_spinner, 52);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_finish_stage, 53);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_id_pass_items, 54);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_id_pass_title_subtitle, 55);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_image, 56);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_label_underline_with_arrow, 57);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_label_underline_with_arrow_2, 58);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_label_value, 59);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_label_with_switch, 60);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass, 61);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_arrow, 62);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_card_2, 63);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_company, 64);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_company_info, 65);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_editable, 66);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_finger, 67);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_finger_2, 68);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_id_title_with_image, 69);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_profile, 70);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_pass_profile_empty, 71);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_profile_chooser, 72);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_profile_chooser_stage_3, 73);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_profile_chooser_stage_4, 74);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_profile_editable, 75);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_profile_editable2, 76);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_registration_0".equals(obj)) {
                    return new ActivityRegistrationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_registration is invalid. Received: " + obj);
            case 2:
                if ("layout/fake_1_0".equals(obj)) {
                    return new Fake1BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fake_1 is invalid. Received: " + obj);
            case 3:
                if ("layout/fake_2_0".equals(obj)) {
                    return new Fake2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fake_2 is invalid. Received: " + obj);
            case 4:
                if ("layout/fragment_another_pass_0".equals(obj)) {
                    return new FragmentAnotherPassBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_another_pass is invalid. Received: " + obj);
            case 5:
                if ("layout/fragment_apartment_list_0".equals(obj)) {
                    return new FragmentApartmentListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_apartment_list is invalid. Received: " + obj);
            case 6:
                if ("layout/fragment_application_to_company_0".equals(obj)) {
                    return new FragmentApplicationToCompanyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_application_to_company is invalid. Received: " + obj);
            case 7:
                if ("layout/fragment_ble_settings_0".equals(obj)) {
                    return new FragmentBleSettingsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_ble_settings is invalid. Received: " + obj);
            case 8:
                if ("layout/fragment_connect_to_company_0".equals(obj)) {
                    return new FragmentConnectToCompanyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_connect_to_company is invalid. Received: " + obj);
            case 9:
                if ("layout/fragment_corona_create_company_0".equals(obj)) {
                    return new FragmentCoronaCreateCompanyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_corona_create_company is invalid. Received: " + obj);
            case 10:
                if ("layout/fragment_corona_create_pass2_0".equals(obj)) {
                    return new FragmentCoronaCreatePass2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_corona_create_pass2 is invalid. Received: " + obj);
            case 11:
                if ("layout/fragment_fifth_stage_0".equals(obj)) {
                    return new FragmentFifthStageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_fifth_stage is invalid. Received: " + obj);
            case 12:
                if ("layout/fragment_first_stage_0".equals(obj)) {
                    return new FragmentFirstStageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_first_stage is invalid. Received: " + obj);
            case 13:
                if ("layout/fragment_first_stage_edit_0".equals(obj)) {
                    return new FragmentFirstStageEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_first_stage_edit is invalid. Received: " + obj);
            case 14:
                if ("layout/fragment_fourth_stage_0".equals(obj)) {
                    return new FragmentFourthStageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_fourth_stage is invalid. Received: " + obj);
            case 15:
                if ("layout/fragment_gate_0".equals(obj)) {
                    return new FragmentGateBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_gate is invalid. Received: " + obj);
            case 16:
                if ("layout/fragment_morion_service_ticket_0".equals(obj)) {
                    return new FragmentMorionServiceTicketBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_morion_service_ticket is invalid. Received: " + obj);
            case 17:
                if ("layout/fragment_new_subaccount_0".equals(obj)) {
                    return new FragmentNewSubaccountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_new_subaccount is invalid. Received: " + obj);
            case 18:
                if ("layout/fragment_pass_ble_first_0".equals(obj)) {
                    return new FragmentPassBleFirstBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_ble_first is invalid. Received: " + obj);
            case 19:
                if ("layout/fragment_pass_ble_qr_0".equals(obj)) {
                    return new FragmentPassBleQrBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_ble_qr is invalid. Received: " + obj);
            case 20:
                if ("layout/fragment_pass_ble_second_0".equals(obj)) {
                    return new FragmentPassBleSecondBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_ble_second is invalid. Received: " + obj);
            case 21:
                if ("layout/fragment_pass_ble_zero_0".equals(obj)) {
                    return new FragmentPassBleZeroBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_ble_zero is invalid. Received: " + obj);
            case 22:
                if ("layout/fragment_pass_card_first_0".equals(obj)) {
                    return new FragmentPassCardFirstBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_card_first is invalid. Received: " + obj);
            case 23:
                if ("layout/fragment_pass_detail_0".equals(obj)) {
                    return new FragmentPassDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_detail is invalid. Received: " + obj);
            case 24:
                if ("layout/fragment_pass_detail2_0".equals(obj)) {
                    return new FragmentPassDetail2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_detail2 is invalid. Received: " + obj);
            case 25:
                if ("layout/fragment_pass_face_first_0".equals(obj)) {
                    return new FragmentPassFaceFirstBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_face_first is invalid. Received: " + obj);
            case 26:
                if ("layout/fragment_pass_face_second_0".equals(obj)) {
                    return new FragmentPassFaceSecondBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_face_second is invalid. Received: " + obj);
            case 27:
                if ("layout/fragment_pass_face_third_0".equals(obj)) {
                    return new FragmentPassFaceThirdBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_face_third is invalid. Received: " + obj);
            case 28:
                if ("layout/fragment_pass_finger_first_0".equals(obj)) {
                    return new FragmentPassFingerFirstBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_finger_first is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_pass_finger_second_0".equals(obj)) {
                    return new FragmentPassFingerSecondBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_finger_second is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_pass_profile_0".equals(obj)) {
                    return new FragmentPassProfileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_profile is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_pass_profile_edit_0".equals(obj)) {
                    return new FragmentPassProfileEditBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_profile_edit is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_pass_settings_0".equals(obj)) {
                    return new FragmentPassSettingsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_pass_settings_ble_0".equals(obj)) {
                    return new FragmentPassSettingsBleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings_ble is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_pass_settings_card_0".equals(obj)) {
                    return new FragmentPassSettingsCardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings_card is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_pass_settings_card_info_0".equals(obj)) {
                    return new FragmentPassSettingsCardInfoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings_card_info is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_pass_settings_face_0".equals(obj)) {
                    return new FragmentPassSettingsFaceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings_face is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_pass_settings_finger_0".equals(obj)) {
                    return new FragmentPassSettingsFingerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pass_settings_finger is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_profile_selection_0".equals(obj)) {
                    return new FragmentProfileSelectionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile_selection is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_profile_selection_stage_3_0".equals(obj)) {
                    return new FragmentProfileSelectionStage3BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile_selection_stage_3 is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_profile_selection_stage_4_0".equals(obj)) {
                    return new FragmentProfileSelectionStage4BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile_selection_stage_4 is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_profile_selection_uk_attachment_4_0".equals(obj)) {
                    return new FragmentProfileSelectionUkAttachment4BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile_selection_uk_attachment_4 is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_return_ticket_0".equals(obj)) {
                    return new FragmentReturnTicketBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_return_ticket is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_show_record_0".equals(obj)) {
                    return new FragmentShowRecordBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_show_record is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_third_stage_0".equals(obj)) {
                    return new FragmentThirdStageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_third_stage is invalid. Received: " + obj);
            case 45:
                if ("layout/item_another_guest_data_title_0".equals(obj)) {
                    return new ItemAnotherGuestDataTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_another_guest_data_title is invalid. Received: " + obj);
            case 46:
                if ("layout/item_another_pass_data_0".equals(obj)) {
                    return new ItemAnotherPassDataBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_another_pass_data is invalid. Received: " + obj);
            case 47:
                if ("layout/item_another_pass_data_2_0".equals(obj)) {
                    return new ItemAnotherPassData2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_another_pass_data_2 is invalid. Received: " + obj);
            case 48:
                if ("layout/item_another_pass_data_with_hint_0".equals(obj)) {
                    return new ItemAnotherPassDataWithHintBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_another_pass_data_with_hint is invalid. Received: " + obj);
            case 49:
                if ("layout/item_another_title_0".equals(obj)) {
                    return new ItemAnotherTitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_another_title is invalid. Received: " + obj);
            case 50:
                if ("layout/item_application_to_company_0".equals(obj)) {
                    return new ItemApplicationToCompanyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_application_to_company is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/item_ble_switch_button_0".equals(obj)) {
                    return new ItemBleSwitchButtonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_ble_switch_button is invalid. Received: " + obj);
            case 52:
                if ("layout/item_field_spinner_0".equals(obj)) {
                    return new ItemFieldSpinnerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_field_spinner is invalid. Received: " + obj);
            case 53:
                if ("layout/item_finish_stage_0".equals(obj)) {
                    return new ItemFinishStageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_finish_stage is invalid. Received: " + obj);
            case 54:
                if ("layout/item_id_pass_items_0".equals(obj)) {
                    return new ItemIdPassItemsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_id_pass_items is invalid. Received: " + obj);
            case 55:
                if ("layout/item_id_pass_title_subtitle_0".equals(obj)) {
                    return new ItemIdPassTitleSubtitleBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_id_pass_title_subtitle is invalid. Received: " + obj);
            case 56:
                if ("layout/item_image_0".equals(obj)) {
                    return new ItemImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_image is invalid. Received: " + obj);
            case 57:
                if ("layout/item_label_underline_with_arrow_0".equals(obj)) {
                    return new ItemLabelUnderlineWithArrowBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_label_underline_with_arrow is invalid. Received: " + obj);
            case 58:
                if ("layout/item_label_underline_with_arrow_2_0".equals(obj)) {
                    return new ItemLabelUnderlineWithArrow2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_label_underline_with_arrow_2 is invalid. Received: " + obj);
            case 59:
                if ("layout/item_label_value_0".equals(obj)) {
                    return new ItemLabelValueBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_label_value is invalid. Received: " + obj);
            case 60:
                if ("layout/item_label_with_switch_0".equals(obj)) {
                    return new ItemLabelWithSwitchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_label_with_switch is invalid. Received: " + obj);
            case 61:
                if ("layout/item_pass_0".equals(obj)) {
                    return new ItemPassBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass is invalid. Received: " + obj);
            case 62:
                if ("layout/item_pass_arrow_0".equals(obj)) {
                    return new ItemPassArrowBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_arrow is invalid. Received: " + obj);
            case 63:
                if ("layout/item_pass_card_2_0".equals(obj)) {
                    return new ItemPassCard2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_card_2 is invalid. Received: " + obj);
            case 64:
                if ("layout/item_pass_company_0".equals(obj)) {
                    return new ItemPassCompanyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_company is invalid. Received: " + obj);
            case 65:
                if ("layout/item_pass_company_info_0".equals(obj)) {
                    return new ItemPassCompanyInfoBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_company_info is invalid. Received: " + obj);
            case 66:
                if ("layout/item_pass_editable_0".equals(obj)) {
                    return new ItemPassEditableBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_editable is invalid. Received: " + obj);
            case 67:
                if ("layout/item_pass_finger_0".equals(obj)) {
                    return new ItemPassFingerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_finger is invalid. Received: " + obj);
            case 68:
                if ("layout/item_pass_finger_2_0".equals(obj)) {
                    return new ItemPassFinger2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_finger_2 is invalid. Received: " + obj);
            case 69:
                if ("layout/item_pass_id_title_with_image_0".equals(obj)) {
                    return new ItemPassIdTitleWithImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_id_title_with_image is invalid. Received: " + obj);
            case 70:
                if ("layout/item_pass_profile_0".equals(obj)) {
                    return new ItemPassProfileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_profile is invalid. Received: " + obj);
            case 71:
                if ("layout/item_pass_profile_empty_0".equals(obj)) {
                    return new ItemPassProfileEmptyBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_pass_profile_empty is invalid. Received: " + obj);
            case 72:
                if ("layout/item_profile_chooser_0".equals(obj)) {
                    return new ItemProfileChooserBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_chooser is invalid. Received: " + obj);
            case 73:
                if ("layout/item_profile_chooser_stage_3_0".equals(obj)) {
                    return new ItemProfileChooserStage3BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_chooser_stage_3 is invalid. Received: " + obj);
            case 74:
                if ("layout/item_profile_chooser_stage_4_0".equals(obj)) {
                    return new ItemProfileChooserStage4BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_chooser_stage_4 is invalid. Received: " + obj);
            case 75:
                if ("layout/item_profile_editable_0".equals(obj)) {
                    return new ItemProfileEditableBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_editable is invalid. Received: " + obj);
            case 76:
                if ("layout/item_profile_editable2_0".equals(obj)) {
                    return new ItemProfileEditable2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_profile_editable2 is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                return internalGetViewDataBinding0(dataBindingComponent, view, i2, tag);
            }
            if (i3 != 1) {
                return null;
            }
            return internalGetViewDataBinding1(dataBindingComponent, view, i2, tag);
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: ru.unicorn.DataBinderMapperImpl$InnerBrLookup */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys = new SparseArray<>(34);

        private InnerBrLookup() {
        }

        static {
            sKeys.put(0, "_all");
            sKeys.put(1, "isDemoButtonEnabled");
            sKeys.put(2, "visibleArrow");
            sKeys.put(3, "color");
            sKeys.put(4, "arrow");
            sKeys.put(5, "title");
            sKeys.put(6, "result");
            sKeys.put(7, "btnTitle");
            sKeys.put(8, "backIsVisible");
            sKeys.put(9, "enable");
            sKeys.put(10, "inputType");
            sKeys.put(11, "binder");
            sKeys.put(12, "value");
            sKeys.put(13, ReactConst.SELECTED);
            sKeys.put(14, "key");
            sKeys.put(15, "resourc");
            sKeys.put(16, "isRequired");
            sKeys.put(17, UriUtil.LOCAL_RESOURCE_SCHEME);
            sKeys.put(18, ViewProps.VISIBLE);
            sKeys.put(19, "ticket");
            sKeys.put(20, Flavors.PASS);
            sKeys.put(21, "isEditMode");
            sKeys.put(22, "active");
            sKeys.put(23, Constants.ScionAnalytics.PARAM_LABEL);
            sKeys.put(24, "isCheck");
            sKeys.put(25, "size");
            sKeys.put(26, "vm");
            sKeys.put(27, "subtitle");
            sKeys.put(28, "hint");
            sKeys.put(29, "isEnabled");
            sKeys.put(30, "editMode");
            sKeys.put(31, "name");
            sKeys.put(32, "position");
        }
    }

    /* renamed from: ru.unicorn.DataBinderMapperImpl$InnerLayoutIdLookup */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(76);

        private InnerLayoutIdLookup() {
        }

        static {
            sKeys.put("layout/activity_registration_0", Integer.valueOf(R.layout.activity_registration));
            sKeys.put("layout/fake_1_0", Integer.valueOf(R.layout.fake_1));
            sKeys.put("layout/fake_2_0", Integer.valueOf(R.layout.fake_2));
            sKeys.put("layout/fragment_another_pass_0", Integer.valueOf(R.layout.fragment_another_pass));
            sKeys.put("layout/fragment_apartment_list_0", Integer.valueOf(R.layout.fragment_apartment_list));
            sKeys.put("layout/fragment_application_to_company_0", Integer.valueOf(R.layout.fragment_application_to_company));
            sKeys.put("layout/fragment_ble_settings_0", Integer.valueOf(R.layout.fragment_ble_settings));
            sKeys.put("layout/fragment_connect_to_company_0", Integer.valueOf(R.layout.fragment_connect_to_company));
            sKeys.put("layout/fragment_corona_create_company_0", Integer.valueOf(R.layout.fragment_corona_create_company));
            sKeys.put("layout/fragment_corona_create_pass2_0", Integer.valueOf(R.layout.fragment_corona_create_pass2));
            sKeys.put("layout/fragment_fifth_stage_0", Integer.valueOf(R.layout.fragment_fifth_stage));
            sKeys.put("layout/fragment_first_stage_0", Integer.valueOf(R.layout.fragment_first_stage));
            sKeys.put("layout/fragment_first_stage_edit_0", Integer.valueOf(R.layout.fragment_first_stage_edit));
            sKeys.put("layout/fragment_fourth_stage_0", Integer.valueOf(R.layout.fragment_fourth_stage));
            sKeys.put("layout/fragment_gate_0", Integer.valueOf(R.layout.fragment_gate));
            sKeys.put("layout/fragment_morion_service_ticket_0", Integer.valueOf(R.layout.fragment_morion_service_ticket));
            sKeys.put("layout/fragment_new_subaccount_0", Integer.valueOf(R.layout.fragment_new_subaccount));
            sKeys.put("layout/fragment_pass_ble_first_0", Integer.valueOf(R.layout.fragment_pass_ble_first));
            sKeys.put("layout/fragment_pass_ble_qr_0", Integer.valueOf(R.layout.fragment_pass_ble_qr));
            sKeys.put("layout/fragment_pass_ble_second_0", Integer.valueOf(R.layout.fragment_pass_ble_second));
            sKeys.put("layout/fragment_pass_ble_zero_0", Integer.valueOf(R.layout.fragment_pass_ble_zero));
            sKeys.put("layout/fragment_pass_card_first_0", Integer.valueOf(R.layout.fragment_pass_card_first));
            sKeys.put("layout/fragment_pass_detail_0", Integer.valueOf(R.layout.fragment_pass_detail));
            sKeys.put("layout/fragment_pass_detail2_0", Integer.valueOf(R.layout.fragment_pass_detail2));
            sKeys.put("layout/fragment_pass_face_first_0", Integer.valueOf(R.layout.fragment_pass_face_first));
            sKeys.put("layout/fragment_pass_face_second_0", Integer.valueOf(R.layout.fragment_pass_face_second));
            sKeys.put("layout/fragment_pass_face_third_0", Integer.valueOf(R.layout.fragment_pass_face_third));
            sKeys.put("layout/fragment_pass_finger_first_0", Integer.valueOf(R.layout.fragment_pass_finger_first));
            sKeys.put("layout/fragment_pass_finger_second_0", Integer.valueOf(R.layout.fragment_pass_finger_second));
            sKeys.put("layout/fragment_pass_profile_0", Integer.valueOf(R.layout.fragment_pass_profile));
            sKeys.put("layout/fragment_pass_profile_edit_0", Integer.valueOf(R.layout.fragment_pass_profile_edit));
            sKeys.put("layout/fragment_pass_settings_0", Integer.valueOf(R.layout.fragment_pass_settings));
            sKeys.put("layout/fragment_pass_settings_ble_0", Integer.valueOf(R.layout.fragment_pass_settings_ble));
            sKeys.put("layout/fragment_pass_settings_card_0", Integer.valueOf(R.layout.fragment_pass_settings_card));
            sKeys.put("layout/fragment_pass_settings_card_info_0", Integer.valueOf(R.layout.fragment_pass_settings_card_info));
            sKeys.put("layout/fragment_pass_settings_face_0", Integer.valueOf(R.layout.fragment_pass_settings_face));
            sKeys.put("layout/fragment_pass_settings_finger_0", Integer.valueOf(R.layout.fragment_pass_settings_finger));
            sKeys.put("layout/fragment_profile_selection_0", Integer.valueOf(R.layout.fragment_profile_selection));
            sKeys.put("layout/fragment_profile_selection_stage_3_0", Integer.valueOf(R.layout.fragment_profile_selection_stage_3));
            sKeys.put("layout/fragment_profile_selection_stage_4_0", Integer.valueOf(R.layout.fragment_profile_selection_stage_4));
            sKeys.put("layout/fragment_profile_selection_uk_attachment_4_0", Integer.valueOf(R.layout.fragment_profile_selection_uk_attachment_4));
            sKeys.put("layout/fragment_return_ticket_0", Integer.valueOf(R.layout.fragment_return_ticket));
            sKeys.put("layout/fragment_show_record_0", Integer.valueOf(R.layout.fragment_show_record));
            sKeys.put("layout/fragment_third_stage_0", Integer.valueOf(R.layout.fragment_third_stage));
            sKeys.put("layout/item_another_guest_data_title_0", Integer.valueOf(R.layout.item_another_guest_data_title));
            sKeys.put("layout/item_another_pass_data_0", Integer.valueOf(R.layout.item_another_pass_data));
            sKeys.put("layout/item_another_pass_data_2_0", Integer.valueOf(R.layout.item_another_pass_data_2));
            sKeys.put("layout/item_another_pass_data_with_hint_0", Integer.valueOf(R.layout.item_another_pass_data_with_hint));
            sKeys.put("layout/item_another_title_0", Integer.valueOf(R.layout.item_another_title));
            sKeys.put("layout/item_application_to_company_0", Integer.valueOf(R.layout.item_application_to_company));
            sKeys.put("layout/item_ble_switch_button_0", Integer.valueOf(R.layout.item_ble_switch_button));
            sKeys.put("layout/item_field_spinner_0", Integer.valueOf(R.layout.item_field_spinner));
            sKeys.put("layout/item_finish_stage_0", Integer.valueOf(R.layout.item_finish_stage));
            sKeys.put("layout/item_id_pass_items_0", Integer.valueOf(R.layout.item_id_pass_items));
            sKeys.put("layout/item_id_pass_title_subtitle_0", Integer.valueOf(R.layout.item_id_pass_title_subtitle));
            sKeys.put("layout/item_image_0", Integer.valueOf(R.layout.item_image));
            sKeys.put("layout/item_label_underline_with_arrow_0", Integer.valueOf(R.layout.item_label_underline_with_arrow));
            sKeys.put("layout/item_label_underline_with_arrow_2_0", Integer.valueOf(R.layout.item_label_underline_with_arrow_2));
            sKeys.put("layout/item_label_value_0", Integer.valueOf(R.layout.item_label_value));
            sKeys.put("layout/item_label_with_switch_0", Integer.valueOf(R.layout.item_label_with_switch));
            sKeys.put("layout/item_pass_0", Integer.valueOf(R.layout.item_pass));
            sKeys.put("layout/item_pass_arrow_0", Integer.valueOf(R.layout.item_pass_arrow));
            sKeys.put("layout/item_pass_card_2_0", Integer.valueOf(R.layout.item_pass_card_2));
            sKeys.put("layout/item_pass_company_0", Integer.valueOf(R.layout.item_pass_company));
            sKeys.put("layout/item_pass_company_info_0", Integer.valueOf(R.layout.item_pass_company_info));
            sKeys.put("layout/item_pass_editable_0", Integer.valueOf(R.layout.item_pass_editable));
            sKeys.put("layout/item_pass_finger_0", Integer.valueOf(R.layout.item_pass_finger));
            sKeys.put("layout/item_pass_finger_2_0", Integer.valueOf(R.layout.item_pass_finger_2));
            sKeys.put("layout/item_pass_id_title_with_image_0", Integer.valueOf(R.layout.item_pass_id_title_with_image));
            sKeys.put("layout/item_pass_profile_0", Integer.valueOf(R.layout.item_pass_profile));
            sKeys.put("layout/item_pass_profile_empty_0", Integer.valueOf(R.layout.item_pass_profile_empty));
            sKeys.put("layout/item_profile_chooser_0", Integer.valueOf(R.layout.item_profile_chooser));
            sKeys.put("layout/item_profile_chooser_stage_3_0", Integer.valueOf(R.layout.item_profile_chooser_stage_3));
            sKeys.put("layout/item_profile_chooser_stage_4_0", Integer.valueOf(R.layout.item_profile_chooser_stage_4));
            sKeys.put("layout/item_profile_editable_0", Integer.valueOf(R.layout.item_profile_editable));
            sKeys.put("layout/item_profile_editable2_0", Integer.valueOf(R.layout.item_profile_editable2));
        }
    }
}
