package p046io.realm;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.QrCodeForSave;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData;
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.data.realm.AcceptanceDate;
import p035ru.unicorn.ujin.data.realm.Action;
import p035ru.unicorn.ujin.data.realm.Address;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p035ru.unicorn.ujin.data.realm.Bank;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.BeaconActionDescription;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.CardAdress;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.ChatListResponseData;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.CityTitle;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Coordinates;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.data.realm.Feature;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.FileMeta;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.FlatButtons;
import p035ru.unicorn.ujin.data.realm.FlatInfo;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.ImageSize;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.IntercomVal;
import p035ru.unicorn.ujin.data.realm.Layout;
import p035ru.unicorn.ujin.data.realm.Meta;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Pamyatka;
import p035ru.unicorn.ujin.data.realm.PassCard;
import p035ru.unicorn.ujin.data.realm.PassCardUno;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Price;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.data.realm.RealmString;
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p035ru.unicorn.ujin.data.realm.Size;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.data.realm.UnreadBadge;
import p035ru.unicorn.ujin.data.realm.Wifi;
import p035ru.unicorn.ujin.data.realm.company.CompanyApplication;
import p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact;
import p035ru.unicorn.ujin.data.realm.marketplace.Component;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.CouponImage;
import p035ru.unicorn.ujin.data.realm.marketplace.Field;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Order;
import p035ru.unicorn.ujin.data.realm.marketplace.OrderAction;
import p035ru.unicorn.ujin.data.realm.marketplace.OrderItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Parameter;
import p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.data.realm.marketplace.Property;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate;
import p035ru.unicorn.ujin.data.realm.marketplace.SampleWork;
import p035ru.unicorn.ujin.data.realm.marketplace.SearchItem;
import p035ru.unicorn.ujin.data.realm.marketplace.SelectValue;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationData;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;
import p035ru.unicorn.ujin.data.realm.profile.RentBuilding;
import p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress;
import p035ru.unicorn.ujin.data.realm.profile.RentComplex;
import p035ru.unicorn.ujin.data.realm.profile.RentObject;
import p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.service.location.FavoriteBeacon;
import p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX;
import p035ru.unicorn.ujin.serviceticket.data.TicketDataInX;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote;
import p035ru.unicorn.ujin.view.activity.navigation.entity.Token;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.ActualCountersData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentAttribute;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Ticket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetail;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Status;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p042cz.msebera.android.httpclient.HttpStatus;
import p046io.realm.C4591x4d164271;
import p046io.realm.C4593x1ca69248;
import p046io.realm.C4595x5d0db86d;
import p046io.realm.C4601xb6361989;
import p046io.realm.C4620xe7ed888c;
import p046io.realm.C4626xe255e1e5;
import p046io.realm.C4637x5b79bd5a;
import p046io.realm.C4639x6ab32465;
import p046io.realm.C4642xba9ad755;
import p046io.realm.C4644x8f0def9d;
import p046io.realm.C4646xa509baca;
import p046io.realm.C4648x51014856;
import p046io.realm.C4650xa7ebbdf7;
import p046io.realm.C4652xadba3b3e;
import p046io.realm.C4654x9b0b7455;
import p046io.realm.C4656xbdeaa6ca;
import p046io.realm.C4658x6180a4a3;
import p046io.realm.C4660xccbea62f;
import p046io.realm.C4662xc0a23e3a;
import p046io.realm.C4664x5395ce9a;
import p046io.realm.C4666xdf5d9ae8;
import p046io.realm.C4668xcf375a75;
import p046io.realm.C4670xfcd8d37c;
import p046io.realm.C4672xd5d6cbb2;
import p046io.realm.C4674x1c4fffad;
import p046io.realm.C4676xf1982dca;
import p046io.realm.C4678x5ab6ac5f;
import p046io.realm.C4680x20fc7e06;
import p046io.realm.C4682xb8d394dd;
import p046io.realm.C4684xaab8a0b;
import p046io.realm.C4686xbd7f885e;
import p046io.realm.C4688xf4020777;
import p046io.realm.C4690x83bb1d33;
import p046io.realm.C4692x82b5a23f;
import p046io.realm.C4694x8588f9e4;
import p046io.realm.C4696x936db447;
import p046io.realm.C4698x9da95c4a;
import p046io.realm.C4700xb5dd9409;
import p046io.realm.C4702x12a70883;
import p046io.realm.C4704x27ddec53;
import p046io.realm.C4706xcf10b813;
import p046io.realm.C4708x7c8648ed;
import p046io.realm.C4710x379415fc;
import p046io.realm.C4712x67ea0478;
import p046io.realm.C4714x6f4f4848;
import p046io.realm.C4716x3c51d27a;
import p046io.realm.C4718xb56c6186;
import p046io.realm.C4720x13bb7c97;
import p046io.realm.C4722x782e3a14;
import p046io.realm.C4724xb050ad75;
import p046io.realm.C4726x470e297;
import p046io.realm.C4728x7291458f;
import p046io.realm.C4730xd31c9f99;
import p046io.realm.C4732xd254b890;
import p046io.realm.C4734x3e5f4d91;
import p046io.realm.C4736x16a117c0;
import p046io.realm.C4738x3e33c9bd;
import p046io.realm.C4740x60e6319b;
import p046io.realm.C4742xdc63beb7;
import p046io.realm.C4744xe660f6a7;
import p046io.realm.C4746x72770240;
import p046io.realm.C4748x5c024f21;
import p046io.realm.C4750xebfdbb8f;
import p046io.realm.C4752xf2aa007e;
import p046io.realm.C4754xcc2cbaad;
import p046io.realm.C4756x99acf311;
import p046io.realm.C4758xdaf4d606;
import p046io.realm.C4760xfaafb8e9;
import p046io.realm.C4762x65e9722d;
import p046io.realm.C4764xd43a5daf;
import p046io.realm.C4766x7a38e7a6;
import p046io.realm.C4768x32c48847;
import p046io.realm.C4770xc85b1268;
import p046io.realm.C4772xa5d8f71d;
import p046io.realm.C4774x33c567d4;
import p046io.realm.C4776x6ae644c3;
import p046io.realm.C4778x8713e227;
import p046io.realm.C4780xf0c1c3b9;
import p046io.realm.C4782x594eae38;
import p046io.realm.C4784x85418d2d;
import p046io.realm.C4786xba887464;
import p046io.realm.C4788xc3a2b227;
import p046io.realm.C4790xe661e44a;
import p046io.realm.C4792xa984038c;
import p046io.realm.C4794x165b0474;
import p046io.realm.C4796x4009dee4;
import p046io.realm.C4798x7bd56e2e;
import p046io.realm.C4800x8b5430f6;
import p046io.realm.C4802x9a8f8638;
import p046io.realm.C4804xd885bb4;
import p046io.realm.C4806xa0f8f737;
import p046io.realm.C4808x39dc6d46;
import p046io.realm.C4810xdea6d8e5;
import p046io.realm.C4812xdb358b15;
import p046io.realm.C4814x4a38c7d7;
import p046io.realm.C4816xc56fdf8f;
import p046io.realm.C4818xb7a5caf9;
import p046io.realm.C4820x447e431f;
import p046io.realm.C4822xab1ed299;
import p046io.realm.C4824xe6f53cf6;
import p046io.realm.C4826x725684ea;
import p046io.realm.C4828xbbcd96af;
import p046io.realm.C4830x6d8ab071;
import p046io.realm.C4832x38c73bbc;
import p046io.realm.C4834x9fbcbe06;
import p046io.realm.C4836xc7389ad5;
import p046io.realm.C4838xc3cde83a;
import p046io.realm.annotations.RealmModule;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.RealmProxyMediator;
import p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy;
import p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy;
import p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy;
import p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy;
import p046io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy;

@RealmModule
/* renamed from: io.realm.DefaultRealmModuleMediator */
class DefaultRealmModuleMediator extends RealmProxyMediator {
    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;

    public boolean transformerApplied() {
        return true;
    }

    DefaultRealmModuleMediator() {
    }

    static {
        HashSet hashSet = new HashSet(HttpStatus.SC_PARTIAL_CONTENT);
        hashSet.add(AvailablePassType.class);
        hashSet.add(BleKeyData.class);
        hashSet.add(BleReader.class);
        hashSet.add(RentConfirmCodeData.class);
        hashSet.add(RentConfirmCodeResponse.class);
        hashSet.add(RedeemCodeResponseData.class);
        hashSet.add(SubAccount.class);
        hashSet.add(Author.class);
        hashSet.add(QrCodeForSave.class);
        hashSet.add(AcceptanceDate.class);
        hashSet.add(Address.class);
        hashSet.add(ApartmentState.class);
        hashSet.add(Bank.class);
        hashSet.add(Building.class);
        hashSet.add(Camera.class);
        hashSet.add(CompanyApplication.class);
        hashSet.add(EnterpriseApplication.class);
        hashSet.add(ContextBanner.class);
        hashSet.add(Feature.class);
        hashSet.add(FileData.class);
        hashSet.add(FileMeta.class);
        hashSet.add(FlatButtons.class);
        hashSet.add(Layout.class);
        hashSet.add(Banner.class);
        hashSet.add(CartCompany.class);
        hashSet.add(CartItem.class);
        hashSet.add(CartOffer.class);
        hashSet.add(CartTotal.class);
        hashSet.add(Category.class);
        hashSet.add(CategoryItem.class);
        hashSet.add(Comment.class);
        hashSet.add(Company.class);
        hashSet.add(CompanyContact.class);
        hashSet.add(Component.class);
        hashSet.add(Coupon.class);
        hashSet.add(CouponImage.class);
        hashSet.add(Field.class);
        hashSet.add(Offer.class);
        hashSet.add(Order.class);
        hashSet.add(OrderAction.class);
        hashSet.add(OrderItem.class);
        hashSet.add(Parameter.class);
        hashSet.add(PreviewImage.class);
        hashSet.add(Promotion.class);
        hashSet.add(Property.class);
        hashSet.add(RedeemedCode.class);
        hashSet.add(RedeemedCodeDate.class);
        hashSet.add(SampleWork.class);
        hashSet.add(SearchItem.class);
        hashSet.add(SelectValue.class);
        hashSet.add(Tag.class);
        hashSet.add(Meta.class);
        hashSet.add(MyBeacon.class);
        hashSet.add(News.class);
        hashSet.add(Notification.class);
        hashSet.add(NotificationData.class);
        hashSet.add(Pamyatka.class);
        hashSet.add(Point.class);
        hashSet.add(ApartmentRequest.class);
        hashSet.add(DemoUser.class);
        hashSet.add(RentBuilding.class);
        hashSet.add(RentBuildingAddress.class);
        hashSet.add(RentComplex.class);
        hashSet.add(RentObject.class);
        hashSet.add(RentObjectBuilding.class);
        hashSet.add(User.class);
        hashSet.add(ProviderCity.class);
        hashSet.add(RealmString.class);
        hashSet.add(Splashscreen.class);
        hashSet.add(TimeSlot.class);
        hashSet.add(Wifi.class);
        hashSet.add(AllTicketDataInX.class);
        hashSet.add(TicketDataInX.class);
        hashSet.add(Schemas.class);
        hashSet.add(C5788Video.class);
        hashSet.add(ProfileAdress.class);
        hashSet.add(ProfileData.class);
        hashSet.add(UserCompany.class);
        hashSet.add(UserData.class);
        hashSet.add(UserProfile.class);
        hashSet.add(UserVehicle.class);
        hashSet.add(ContactData.class);
        hashSet.add(ContactDataList.class);
        hashSet.add(TicketPropertyObject.class);
        hashSet.add(Appointment.class);
        hashSet.add(ExecutorsIn.class);
        hashSet.add(FromUser.class);
        hashSet.add(Status.class);
        hashSet.add(ToUser.class);
        hashSet.add(BusinessBuildings.class);
        hashSet.add(BusinessBuildingsList.class);
        hashSet.add(BusinessCenterDTO.class);
        hashSet.add(CityDTO.class);
        hashSet.add(SearchBuildingDTO.class);
        hashSet.add(SearchComplex.class);
        hashSet.add(Action.class);
        hashSet.add(BeaconAction.class);
        hashSet.add(BeaconActionDescription.class);
        hashSet.add(CardAdress.class);
        hashSet.add(CardData.class);
        hashSet.add(Chat.class);
        hashSet.add(ChatListResponseData.class);
        hashSet.add(City.class);
        hashSet.add(CityTitle.class);
        hashSet.add(Complex.class);
        hashSet.add(ComplexInfo.class);
        hashSet.add(Coordinates.class);
        hashSet.add(Favourite.class);
        hashSet.add(Flat.class);
        hashSet.add(FlatInfo.class);
        hashSet.add(GetFlatsResponseData.class);
        hashSet.add(ImageData.class);
        hashSet.add(ImageSize.class);
        hashSet.add(Intercom.class);
        hashSet.add(IntercomVal.class);
        hashSet.add(Mortrage.class);
        hashSet.add(PassCard.class);
        hashSet.add(PassCardUno.class);
        hashSet.add(Price.class);
        hashSet.add(Apartment.class);
        hashSet.add(SipOpenDoorParam.class);
        hashSet.add(SipParametrs.class);
        hashSet.add(SipPreviewParams.class);
        hashSet.add(Size.class);
        hashSet.add(UnreadBadge.class);
        hashSet.add(FavoriteBeacon.class);
        hashSet.add(DeviceModel.class);
        hashSet.add(SignalRemote.class);
        hashSet.add(Hardware.class);
        hashSet.add(HardwareSignal.class);
        hashSet.add(ManagementType.class);
        hashSet.add(RoomInfo.class);
        hashSet.add(Intellect.class);
        hashSet.add(AudioUrl.class);
        hashSet.add(Scenario.class);
        hashSet.add(State.class);
        hashSet.add(DialogButtons.class);
        hashSet.add(Guard.class);
        hashSet.add(MinVersion.class);
        hashSet.add(Schema.class);
        hashSet.add(SchemaCallback.class);
        hashSet.add(SchemaItem.class);
        hashSet.add(Services.class);
        hashSet.add(Token.class);
        hashSet.add(Device.class);
        hashSet.add(ClassDevice.class);
        hashSet.add(BMSInfo.class);
        hashSet.add(Devices.class);
        hashSet.add(FilesUrl.class);
        hashSet.add(ServiceData.class);
        hashSet.add(ServiceFieldItems.class);
        hashSet.add(ServiceStatus.class);
        hashSet.add(DomServiceCategory.class);
        hashSet.add(DomServiceIndicator.class);
        hashSet.add(DomServicesList.class);
        hashSet.add(DomServiceTariff.class);
        hashSet.add(ServiceFile.class);
        hashSet.add(ServiceMessages.class);
        hashSet.add(ServiceTicket.class);
        hashSet.add(ServiceTicketType.class);
        hashSet.add(TicketAccountsList.class);
        hashSet.add(TicketApartment.class);
        hashSet.add(TicketApplicant.class);
        hashSet.add(TicketChatData.class);
        hashSet.add(TicketInfo.class);
        hashSet.add(TicketObject.class);
        hashSet.add(TicketPerformer.class);
        hashSet.add(TicketRating.class);
        hashSet.add(Tickets.class);
        hashSet.add(TicketState.class);
        hashSet.add(TicketUrgency.class);
        hashSet.add(Rooms.class);
        hashSet.add(MoreIconsInfo.class);
        hashSet.add(ActualCountersData.class);
        hashSet.add(RentCompany.class);
        hashSet.add(AttrRenta.class);
        hashSet.add(PropertyRenta.class);
        hashSet.add(RentAttribute.class);
        hashSet.add(RentInfo.class);
        hashSet.add(RentInfoObject.class);
        hashSet.add(RentPermissions.class);
        hashSet.add(RentType.class);
        hashSet.add(RentTypeAttr.class);
        hashSet.add(StateRenta.class);
        hashSet.add(TimeSlotHuman.class);
        hashSet.add(TimeSlotHumanValue.class);
        hashSet.add(TypeRent.class);
        hashSet.add(ManagePermissions.class);
        hashSet.add(Rent.class);
        hashSet.add(RentChildren.class);
        hashSet.add(Renters.class);
        hashSet.add(RentState.class);
        hashSet.add(TalkingInfo.class);
        hashSet.add(TalkingPhotos.class);
        hashSet.add(TalkingPhotosFile.class);
        hashSet.add(RentAttributes.class);
        hashSet.add(ApartmentScenarioOptionAdd.class);
        hashSet.add(Options.class);
        hashSet.add(OptionsList.class);
        hashSet.add(Ticket.class);
        hashSet.add(TicketDescription.class);
        hashSet.add(TicketDetail.class);
        hashSet.add(VideoDates.class);
        hashSet.add(VideoEvents.class);
        hashSet.add(VideoEventsList.class);
        hashSet.add(VideoUrl.class);
        MODEL_CLASSES = Collections.unmodifiableSet(hashSet);
    }

    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap hashMap = new HashMap(HttpStatus.SC_PARTIAL_CONTENT);
        hashMap.put(AvailablePassType.class, ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BleKeyData.class, ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BleReader.class, ru_unicorn_ujin_ble_data_BleReaderRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentConfirmCodeData.class, C4591x4d164271.getExpectedObjectSchemaInfo());
        hashMap.put(RentConfirmCodeResponse.class, C4593x1ca69248.getExpectedObjectSchemaInfo());
        hashMap.put(RedeemCodeResponseData.class, C4595x5d0db86d.getExpectedObjectSchemaInfo());
        hashMap.put(SubAccount.class, ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Author.class, ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(QrCodeForSave.class, ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(AcceptanceDate.class, ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Address.class, ru_unicorn_ujin_data_realm_AddressRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ApartmentState.class, ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Bank.class, ru_unicorn_ujin_data_realm_BankRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Building.class, ru_unicorn_ujin_data_realm_BuildingRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Camera.class, ru_unicorn_ujin_data_realm_CameraRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CompanyApplication.class, ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(EnterpriseApplication.class, C4601xb6361989.getExpectedObjectSchemaInfo());
        hashMap.put(ContextBanner.class, ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Feature.class, ru_unicorn_ujin_data_realm_FeatureRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(FileData.class, ru_unicorn_ujin_data_realm_FileDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(FileMeta.class, ru_unicorn_ujin_data_realm_FileMetaRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(FlatButtons.class, ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Layout.class, ru_unicorn_ujin_data_realm_LayoutRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Banner.class, ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CartCompany.class, ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CartItem.class, ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CartOffer.class, ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CartTotal.class, ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Category.class, ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CategoryItem.class, ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Comment.class, ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Company.class, ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CompanyContact.class, ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Component.class, ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Coupon.class, ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CouponImage.class, ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Field.class, ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Offer.class, ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Order.class, ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(OrderAction.class, ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(OrderItem.class, ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Parameter.class, ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(PreviewImage.class, ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Promotion.class, ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Property.class, ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RedeemedCode.class, ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RedeemedCodeDate.class, C4620xe7ed888c.getExpectedObjectSchemaInfo());
        hashMap.put(SampleWork.class, ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(SearchItem.class, ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(SelectValue.class, ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Tag.class, ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Meta.class, ru_unicorn_ujin_data_realm_MetaRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(MyBeacon.class, ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(News.class, ru_unicorn_ujin_data_realm_NewsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Notification.class, ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(NotificationData.class, C4626xe255e1e5.getExpectedObjectSchemaInfo());
        hashMap.put(Pamyatka.class, ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Point.class, ru_unicorn_ujin_data_realm_PointRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ApartmentRequest.class, ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(DemoUser.class, ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentBuilding.class, ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentBuildingAddress.class, ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentComplex.class, ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentObject.class, ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RentObjectBuilding.class, ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(User.class, ru_unicorn_ujin_data_realm_profile_UserRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ProviderCity.class, ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(RealmString.class, ru_unicorn_ujin_data_realm_RealmStringRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Splashscreen.class, ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(TimeSlot.class, ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Wifi.class, ru_unicorn_ujin_data_realm_WifiRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(AllTicketDataInX.class, ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(TicketDataInX.class, ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Schemas.class, C4670xfcd8d37c.getExpectedObjectSchemaInfo());
        hashMap.put(C5788Video.class, C4674x1c4fffad.getExpectedObjectSchemaInfo());
        hashMap.put(ProfileAdress.class, C4682xb8d394dd.getExpectedObjectSchemaInfo());
        hashMap.put(ProfileData.class, C4780xf0c1c3b9.getExpectedObjectSchemaInfo());
        hashMap.put(UserCompany.class, C4782x594eae38.getExpectedObjectSchemaInfo());
        hashMap.put(UserData.class, C4784x85418d2d.getExpectedObjectSchemaInfo());
        hashMap.put(UserProfile.class, C4786xba887464.getExpectedObjectSchemaInfo());
        hashMap.put(UserVehicle.class, C4788xc3a2b227.getExpectedObjectSchemaInfo());
        hashMap.put(ContactData.class, C4792xa984038c.getExpectedObjectSchemaInfo());
        hashMap.put(ContactDataList.class, C4790xe661e44a.getExpectedObjectSchemaInfo());
        hashMap.put(TicketPropertyObject.class, C4796x4009dee4.getExpectedObjectSchemaInfo());
        hashMap.put(Appointment.class, C4818xb7a5caf9.getExpectedObjectSchemaInfo());
        hashMap.put(ExecutorsIn.class, C4820x447e431f.getExpectedObjectSchemaInfo());
        hashMap.put(FromUser.class, C4822xab1ed299.getExpectedObjectSchemaInfo());
        hashMap.put(Status.class, C4824xe6f53cf6.getExpectedObjectSchemaInfo());
        hashMap.put(ToUser.class, C4826x725684ea.getExpectedObjectSchemaInfo());
        hashMap.put(BusinessBuildings.class, C4830x6d8ab071.getExpectedObjectSchemaInfo());
        hashMap.put(BusinessBuildingsList.class, C4828xbbcd96af.getExpectedObjectSchemaInfo());
        hashMap.put(BusinessCenterDTO.class, C4832x38c73bbc.getExpectedObjectSchemaInfo());
        hashMap.put(CityDTO.class, C4834x9fbcbe06.getExpectedObjectSchemaInfo());
        hashMap.put(SearchBuildingDTO.class, C4836xc7389ad5.getExpectedObjectSchemaInfo());
        hashMap.put(SearchComplex.class, C4838xc3cde83a.getExpectedObjectSchemaInfo());
        hashMap.put(Action.class, ru_unicorn_ujin_data_realm_ActionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BeaconAction.class, ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BeaconActionDescription.class, ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CardAdress.class, ru_unicorn_ujin_data_realm_CardAdressRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CardData.class, ru_unicorn_ujin_data_realm_CardDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Chat.class, ru_unicorn_ujin_data_realm_ChatRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ChatListResponseData.class, ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(City.class, ru_unicorn_ujin_data_realm_CityRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CityTitle.class, ru_unicorn_ujin_data_realm_CityTitleRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Complex.class, ru_unicorn_ujin_data_realm_ComplexRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ComplexInfo.class, ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Coordinates.class, ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Favourite.class, ru_unicorn_ujin_data_realm_FavouriteRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Flat.class, ru_unicorn_ujin_data_realm_FlatRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(FlatInfo.class, ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(GetFlatsResponseData.class, ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ImageData.class, ru_unicorn_ujin_data_realm_ImageDataRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ImageSize.class, ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Intercom.class, ru_unicorn_ujin_data_realm_IntercomRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(IntercomVal.class, ru_unicorn_ujin_data_realm_IntercomValRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Mortrage.class, ru_unicorn_ujin_data_realm_MortrageRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(PassCard.class, ru_unicorn_ujin_data_realm_PassCardRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(PassCardUno.class, ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Price.class, ru_unicorn_ujin_data_realm_PriceRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Apartment.class, ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(SipOpenDoorParam.class, ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(SipParametrs.class, ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(SipPreviewParams.class, ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Size.class, ru_unicorn_ujin_data_realm_SizeRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(UnreadBadge.class, ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(FavoriteBeacon.class, ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(DeviceModel.class, C4637x5b79bd5a.getExpectedObjectSchemaInfo());
        hashMap.put(SignalRemote.class, C4639x6ab32465.getExpectedObjectSchemaInfo());
        hashMap.put(Hardware.class, C4642xba9ad755.getExpectedObjectSchemaInfo());
        hashMap.put(HardwareSignal.class, C4644x8f0def9d.getExpectedObjectSchemaInfo());
        hashMap.put(ManagementType.class, C4646xa509baca.getExpectedObjectSchemaInfo());
        hashMap.put(RoomInfo.class, C4648x51014856.getExpectedObjectSchemaInfo());
        hashMap.put(Intellect.class, C4650xa7ebbdf7.getExpectedObjectSchemaInfo());
        hashMap.put(AudioUrl.class, C4652xadba3b3e.getExpectedObjectSchemaInfo());
        hashMap.put(Scenario.class, C4654x9b0b7455.getExpectedObjectSchemaInfo());
        hashMap.put(State.class, C4656xbdeaa6ca.getExpectedObjectSchemaInfo());
        hashMap.put(DialogButtons.class, C4658x6180a4a3.getExpectedObjectSchemaInfo());
        hashMap.put(Guard.class, C4660xccbea62f.getExpectedObjectSchemaInfo());
        hashMap.put(MinVersion.class, C4662xc0a23e3a.getExpectedObjectSchemaInfo());
        hashMap.put(Schema.class, C4668xcf375a75.getExpectedObjectSchemaInfo());
        hashMap.put(SchemaCallback.class, C4664x5395ce9a.getExpectedObjectSchemaInfo());
        hashMap.put(SchemaItem.class, C4666xdf5d9ae8.getExpectedObjectSchemaInfo());
        hashMap.put(Services.class, C4672xd5d6cbb2.getExpectedObjectSchemaInfo());
        hashMap.put(Token.class, ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Device.class, C4676xf1982dca.getExpectedObjectSchemaInfo());
        hashMap.put(ClassDevice.class, C4678x5ab6ac5f.getExpectedObjectSchemaInfo());
        hashMap.put(BMSInfo.class, C4680x20fc7e06.getExpectedObjectSchemaInfo());
        hashMap.put(Devices.class, C4684xaab8a0b.getExpectedObjectSchemaInfo());
        hashMap.put(FilesUrl.class, C4686xbd7f885e.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceData.class, C4688xf4020777.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceFieldItems.class, C4690x83bb1d33.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceStatus.class, C4692x82b5a23f.getExpectedObjectSchemaInfo());
        hashMap.put(DomServiceCategory.class, C4694x8588f9e4.getExpectedObjectSchemaInfo());
        hashMap.put(DomServiceIndicator.class, C4696x936db447.getExpectedObjectSchemaInfo());
        hashMap.put(DomServicesList.class, C4700xb5dd9409.getExpectedObjectSchemaInfo());
        hashMap.put(DomServiceTariff.class, C4698x9da95c4a.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceFile.class, C4702x12a70883.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceMessages.class, C4704x27ddec53.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceTicket.class, C4706xcf10b813.getExpectedObjectSchemaInfo());
        hashMap.put(ServiceTicketType.class, C4708x7c8648ed.getExpectedObjectSchemaInfo());
        hashMap.put(TicketAccountsList.class, C4710x379415fc.getExpectedObjectSchemaInfo());
        hashMap.put(TicketApartment.class, C4712x67ea0478.getExpectedObjectSchemaInfo());
        hashMap.put(TicketApplicant.class, C4714x6f4f4848.getExpectedObjectSchemaInfo());
        hashMap.put(TicketChatData.class, C4716x3c51d27a.getExpectedObjectSchemaInfo());
        hashMap.put(TicketInfo.class, C4718xb56c6186.getExpectedObjectSchemaInfo());
        hashMap.put(TicketObject.class, C4720x13bb7c97.getExpectedObjectSchemaInfo());
        hashMap.put(TicketPerformer.class, C4722x782e3a14.getExpectedObjectSchemaInfo());
        hashMap.put(TicketRating.class, C4724xb050ad75.getExpectedObjectSchemaInfo());
        hashMap.put(Tickets.class, C4730xd31c9f99.getExpectedObjectSchemaInfo());
        hashMap.put(TicketState.class, C4726x470e297.getExpectedObjectSchemaInfo());
        hashMap.put(TicketUrgency.class, C4728x7291458f.getExpectedObjectSchemaInfo());
        hashMap.put(Rooms.class, C4732xd254b890.getExpectedObjectSchemaInfo());
        hashMap.put(MoreIconsInfo.class, C4734x3e5f4d91.getExpectedObjectSchemaInfo());
        hashMap.put(ActualCountersData.class, C4736x16a117c0.getExpectedObjectSchemaInfo());
        hashMap.put(RentCompany.class, C4738x3e33c9bd.getExpectedObjectSchemaInfo());
        hashMap.put(AttrRenta.class, C4740x60e6319b.getExpectedObjectSchemaInfo());
        hashMap.put(PropertyRenta.class, C4742xdc63beb7.getExpectedObjectSchemaInfo());
        hashMap.put(RentAttribute.class, C4744xe660f6a7.getExpectedObjectSchemaInfo());
        hashMap.put(RentInfo.class, C4748x5c024f21.getExpectedObjectSchemaInfo());
        hashMap.put(RentInfoObject.class, C4746x72770240.getExpectedObjectSchemaInfo());
        hashMap.put(RentPermissions.class, C4750xebfdbb8f.getExpectedObjectSchemaInfo());
        hashMap.put(RentType.class, C4754xcc2cbaad.getExpectedObjectSchemaInfo());
        hashMap.put(RentTypeAttr.class, C4752xf2aa007e.getExpectedObjectSchemaInfo());
        hashMap.put(StateRenta.class, C4756x99acf311.getExpectedObjectSchemaInfo());
        hashMap.put(TimeSlotHuman.class, C4758xdaf4d606.getExpectedObjectSchemaInfo());
        hashMap.put(TimeSlotHumanValue.class, C4760xfaafb8e9.getExpectedObjectSchemaInfo());
        hashMap.put(TypeRent.class, C4762x65e9722d.getExpectedObjectSchemaInfo());
        hashMap.put(ManagePermissions.class, C4764xd43a5daf.getExpectedObjectSchemaInfo());
        hashMap.put(Rent.class, C4768x32c48847.getExpectedObjectSchemaInfo());
        hashMap.put(RentChildren.class, C4766x7a38e7a6.getExpectedObjectSchemaInfo());
        hashMap.put(Renters.class, C4772xa5d8f71d.getExpectedObjectSchemaInfo());
        hashMap.put(RentState.class, C4770xc85b1268.getExpectedObjectSchemaInfo());
        hashMap.put(TalkingInfo.class, C4774x33c567d4.getExpectedObjectSchemaInfo());
        hashMap.put(TalkingPhotos.class, C4778x8713e227.getExpectedObjectSchemaInfo());
        hashMap.put(TalkingPhotosFile.class, C4776x6ae644c3.getExpectedObjectSchemaInfo());
        hashMap.put(RentAttributes.class, C4794x165b0474.getExpectedObjectSchemaInfo());
        hashMap.put(ApartmentScenarioOptionAdd.class, C4798x7bd56e2e.getExpectedObjectSchemaInfo());
        hashMap.put(Options.class, C4802x9a8f8638.getExpectedObjectSchemaInfo());
        hashMap.put(OptionsList.class, C4800x8b5430f6.getExpectedObjectSchemaInfo());
        hashMap.put(Ticket.class, C4808x39dc6d46.getExpectedObjectSchemaInfo());
        hashMap.put(TicketDescription.class, C4804xd885bb4.getExpectedObjectSchemaInfo());
        hashMap.put(TicketDetail.class, C4806xa0f8f737.getExpectedObjectSchemaInfo());
        hashMap.put(VideoDates.class, C4810xdea6d8e5.getExpectedObjectSchemaInfo());
        hashMap.put(VideoEvents.class, C4814x4a38c7d7.getExpectedObjectSchemaInfo());
        hashMap.put(VideoEventsList.class, C4812xdb358b15.getExpectedObjectSchemaInfo());
        hashMap.put(VideoUrl.class, C4816xc56fdf8f.getExpectedObjectSchemaInfo());
        return hashMap;
    }

    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        checkClass(cls);
        if (cls.equals(AvailablePassType.class)) {
            return ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BleKeyData.class)) {
            return ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BleReader.class)) {
            return ru_unicorn_ujin_ble_data_BleReaderRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentConfirmCodeData.class)) {
            return C4591x4d164271.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentConfirmCodeResponse.class)) {
            return C4593x1ca69248.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RedeemCodeResponseData.class)) {
            return C4595x5d0db86d.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SubAccount.class)) {
            return ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Author.class)) {
            return ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(QrCodeForSave.class)) {
            return ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(AcceptanceDate.class)) {
            return ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Address.class)) {
            return ru_unicorn_ujin_data_realm_AddressRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ApartmentState.class)) {
            return ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Bank.class)) {
            return ru_unicorn_ujin_data_realm_BankRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Building.class)) {
            return ru_unicorn_ujin_data_realm_BuildingRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Camera.class)) {
            return ru_unicorn_ujin_data_realm_CameraRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CompanyApplication.class)) {
            return ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(EnterpriseApplication.class)) {
            return C4601xb6361989.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ContextBanner.class)) {
            return ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Feature.class)) {
            return ru_unicorn_ujin_data_realm_FeatureRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FileData.class)) {
            return ru_unicorn_ujin_data_realm_FileDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FileMeta.class)) {
            return ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FlatButtons.class)) {
            return ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Layout.class)) {
            return ru_unicorn_ujin_data_realm_LayoutRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Banner.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CartCompany.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CartItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CartOffer.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CartTotal.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Category.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CategoryItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Comment.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Company.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CompanyContact.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Component.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Coupon.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CouponImage.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Field.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Offer.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Order.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(OrderAction.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(OrderItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Parameter.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(PreviewImage.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Promotion.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Property.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RedeemedCode.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RedeemedCodeDate.class)) {
            return C4620xe7ed888c.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SampleWork.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SearchItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SelectValue.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Tag.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Meta.class)) {
            return ru_unicorn_ujin_data_realm_MetaRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(MyBeacon.class)) {
            return ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(News.class)) {
            return ru_unicorn_ujin_data_realm_NewsRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Notification.class)) {
            return ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(NotificationData.class)) {
            return C4626xe255e1e5.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Pamyatka.class)) {
            return ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Point.class)) {
            return ru_unicorn_ujin_data_realm_PointRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ApartmentRequest.class)) {
            return ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DemoUser.class)) {
            return ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentBuilding.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentBuildingAddress.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentComplex.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentObject.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentObjectBuilding.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(User.class)) {
            return ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ProviderCity.class)) {
            return ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RealmString.class)) {
            return ru_unicorn_ujin_data_realm_RealmStringRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Splashscreen.class)) {
            return ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TimeSlot.class)) {
            return ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Wifi.class)) {
            return ru_unicorn_ujin_data_realm_WifiRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(AllTicketDataInX.class)) {
            return ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketDataInX.class)) {
            return ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Schemas.class)) {
            return C4670xfcd8d37c.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(C5788Video.class)) {
            return C4674x1c4fffad.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ProfileAdress.class)) {
            return C4682xb8d394dd.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ProfileData.class)) {
            return C4780xf0c1c3b9.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(UserCompany.class)) {
            return C4782x594eae38.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(UserData.class)) {
            return C4784x85418d2d.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(UserProfile.class)) {
            return C4786xba887464.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(UserVehicle.class)) {
            return C4788xc3a2b227.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ContactData.class)) {
            return C4792xa984038c.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ContactDataList.class)) {
            return C4790xe661e44a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketPropertyObject.class)) {
            return C4796x4009dee4.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Appointment.class)) {
            return C4818xb7a5caf9.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ExecutorsIn.class)) {
            return C4820x447e431f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FromUser.class)) {
            return C4822xab1ed299.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Status.class)) {
            return C4824xe6f53cf6.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ToUser.class)) {
            return C4826x725684ea.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BusinessBuildings.class)) {
            return C4830x6d8ab071.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BusinessBuildingsList.class)) {
            return C4828xbbcd96af.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BusinessCenterDTO.class)) {
            return C4832x38c73bbc.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CityDTO.class)) {
            return C4834x9fbcbe06.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SearchBuildingDTO.class)) {
            return C4836xc7389ad5.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SearchComplex.class)) {
            return C4838xc3cde83a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Action.class)) {
            return ru_unicorn_ujin_data_realm_ActionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BeaconAction.class)) {
            return ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BeaconActionDescription.class)) {
            return ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CardAdress.class)) {
            return ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CardData.class)) {
            return ru_unicorn_ujin_data_realm_CardDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Chat.class)) {
            return ru_unicorn_ujin_data_realm_ChatRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ChatListResponseData.class)) {
            return ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(City.class)) {
            return ru_unicorn_ujin_data_realm_CityRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CityTitle.class)) {
            return ru_unicorn_ujin_data_realm_CityTitleRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Complex.class)) {
            return ru_unicorn_ujin_data_realm_ComplexRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ComplexInfo.class)) {
            return ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Coordinates.class)) {
            return ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Favourite.class)) {
            return ru_unicorn_ujin_data_realm_FavouriteRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Flat.class)) {
            return ru_unicorn_ujin_data_realm_FlatRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FlatInfo.class)) {
            return ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(GetFlatsResponseData.class)) {
            return ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ImageData.class)) {
            return ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ImageSize.class)) {
            return ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Intercom.class)) {
            return ru_unicorn_ujin_data_realm_IntercomRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(IntercomVal.class)) {
            return ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Mortrage.class)) {
            return ru_unicorn_ujin_data_realm_MortrageRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(PassCard.class)) {
            return ru_unicorn_ujin_data_realm_PassCardRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(PassCardUno.class)) {
            return ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Price.class)) {
            return ru_unicorn_ujin_data_realm_PriceRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Apartment.class)) {
            return ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SipOpenDoorParam.class)) {
            return ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SipParametrs.class)) {
            return ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SipPreviewParams.class)) {
            return ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Size.class)) {
            return ru_unicorn_ujin_data_realm_SizeRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(UnreadBadge.class)) {
            return ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FavoriteBeacon.class)) {
            return ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DeviceModel.class)) {
            return C4637x5b79bd5a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SignalRemote.class)) {
            return C4639x6ab32465.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Hardware.class)) {
            return C4642xba9ad755.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(HardwareSignal.class)) {
            return C4644x8f0def9d.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ManagementType.class)) {
            return C4646xa509baca.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RoomInfo.class)) {
            return C4648x51014856.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Intellect.class)) {
            return C4650xa7ebbdf7.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(AudioUrl.class)) {
            return C4652xadba3b3e.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Scenario.class)) {
            return C4654x9b0b7455.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(State.class)) {
            return C4656xbdeaa6ca.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DialogButtons.class)) {
            return C4658x6180a4a3.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Guard.class)) {
            return C4660xccbea62f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(MinVersion.class)) {
            return C4662xc0a23e3a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Schema.class)) {
            return C4668xcf375a75.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SchemaCallback.class)) {
            return C4664x5395ce9a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(SchemaItem.class)) {
            return C4666xdf5d9ae8.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Services.class)) {
            return C4672xd5d6cbb2.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Token.class)) {
            return ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Device.class)) {
            return C4676xf1982dca.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ClassDevice.class)) {
            return C4678x5ab6ac5f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(BMSInfo.class)) {
            return C4680x20fc7e06.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Devices.class)) {
            return C4684xaab8a0b.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(FilesUrl.class)) {
            return C4686xbd7f885e.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceData.class)) {
            return C4688xf4020777.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceFieldItems.class)) {
            return C4690x83bb1d33.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceStatus.class)) {
            return C4692x82b5a23f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DomServiceCategory.class)) {
            return C4694x8588f9e4.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DomServiceIndicator.class)) {
            return C4696x936db447.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DomServicesList.class)) {
            return C4700xb5dd9409.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(DomServiceTariff.class)) {
            return C4698x9da95c4a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceFile.class)) {
            return C4702x12a70883.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceMessages.class)) {
            return C4704x27ddec53.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceTicket.class)) {
            return C4706xcf10b813.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ServiceTicketType.class)) {
            return C4708x7c8648ed.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketAccountsList.class)) {
            return C4710x379415fc.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketApartment.class)) {
            return C4712x67ea0478.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketApplicant.class)) {
            return C4714x6f4f4848.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketChatData.class)) {
            return C4716x3c51d27a.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketInfo.class)) {
            return C4718xb56c6186.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketObject.class)) {
            return C4720x13bb7c97.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketPerformer.class)) {
            return C4722x782e3a14.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketRating.class)) {
            return C4724xb050ad75.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Tickets.class)) {
            return C4730xd31c9f99.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketState.class)) {
            return C4726x470e297.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketUrgency.class)) {
            return C4728x7291458f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Rooms.class)) {
            return C4732xd254b890.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(MoreIconsInfo.class)) {
            return C4734x3e5f4d91.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ActualCountersData.class)) {
            return C4736x16a117c0.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentCompany.class)) {
            return C4738x3e33c9bd.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(AttrRenta.class)) {
            return C4740x60e6319b.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(PropertyRenta.class)) {
            return C4742xdc63beb7.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentAttribute.class)) {
            return C4744xe660f6a7.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentInfo.class)) {
            return C4748x5c024f21.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentInfoObject.class)) {
            return C4746x72770240.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentPermissions.class)) {
            return C4750xebfdbb8f.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentType.class)) {
            return C4754xcc2cbaad.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentTypeAttr.class)) {
            return C4752xf2aa007e.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(StateRenta.class)) {
            return C4756x99acf311.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TimeSlotHuman.class)) {
            return C4758xdaf4d606.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TimeSlotHumanValue.class)) {
            return C4760xfaafb8e9.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TypeRent.class)) {
            return C4762x65e9722d.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ManagePermissions.class)) {
            return C4764xd43a5daf.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Rent.class)) {
            return C4768x32c48847.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentChildren.class)) {
            return C4766x7a38e7a6.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Renters.class)) {
            return C4772xa5d8f71d.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentState.class)) {
            return C4770xc85b1268.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TalkingInfo.class)) {
            return C4774x33c567d4.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TalkingPhotos.class)) {
            return C4778x8713e227.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TalkingPhotosFile.class)) {
            return C4776x6ae644c3.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(RentAttributes.class)) {
            return C4794x165b0474.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ApartmentScenarioOptionAdd.class)) {
            return C4798x7bd56e2e.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Options.class)) {
            return C4802x9a8f8638.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(OptionsList.class)) {
            return C4800x8b5430f6.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Ticket.class)) {
            return C4808x39dc6d46.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketDescription.class)) {
            return C4804xd885bb4.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(TicketDetail.class)) {
            return C4806xa0f8f737.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(VideoDates.class)) {
            return C4810xdea6d8e5.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(VideoEvents.class)) {
            return C4814x4a38c7d7.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(VideoEventsList.class)) {
            return C4812xdb358b15.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(VideoUrl.class)) {
            return C4816xc56fdf8f.createColumnInfo(osSchemaInfo);
        }
        throw getMissingProxyClassException(cls);
    }

    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        checkClass(cls);
        if (cls.equals(AvailablePassType.class)) {
            return ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BleKeyData.class)) {
            return ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BleReader.class)) {
            return ru_unicorn_ujin_ble_data_BleReaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentConfirmCodeData.class)) {
            return C4591x4d164271.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentConfirmCodeResponse.class)) {
            return C4593x1ca69248.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RedeemCodeResponseData.class)) {
            return C4595x5d0db86d.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SubAccount.class)) {
            return ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Author.class)) {
            return ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(QrCodeForSave.class)) {
            return ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(AcceptanceDate.class)) {
            return ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Address.class)) {
            return ru_unicorn_ujin_data_realm_AddressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ApartmentState.class)) {
            return ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Bank.class)) {
            return ru_unicorn_ujin_data_realm_BankRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Building.class)) {
            return ru_unicorn_ujin_data_realm_BuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Camera.class)) {
            return ru_unicorn_ujin_data_realm_CameraRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CompanyApplication.class)) {
            return ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(EnterpriseApplication.class)) {
            return C4601xb6361989.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ContextBanner.class)) {
            return ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Feature.class)) {
            return ru_unicorn_ujin_data_realm_FeatureRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FileData.class)) {
            return ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FileMeta.class)) {
            return ru_unicorn_ujin_data_realm_FileMetaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FlatButtons.class)) {
            return ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Layout.class)) {
            return ru_unicorn_ujin_data_realm_LayoutRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Banner.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CartCompany.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CartItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CartOffer.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CartTotal.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Category.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CategoryItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Comment.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Company.class)) {
            return "Company";
        }
        if (cls.equals(CompanyContact.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Component.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Coupon.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CouponImage.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Field.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Offer.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Order.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(OrderAction.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(OrderItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Parameter.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(PreviewImage.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Promotion.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Property.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RedeemedCode.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RedeemedCodeDate.class)) {
            return C4620xe7ed888c.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SampleWork.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SearchItem.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SelectValue.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Tag.class)) {
            return ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Meta.class)) {
            return ru_unicorn_ujin_data_realm_MetaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(MyBeacon.class)) {
            return ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(News.class)) {
            return ru_unicorn_ujin_data_realm_NewsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Notification.class)) {
            return ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(NotificationData.class)) {
            return C4626xe255e1e5.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Pamyatka.class)) {
            return ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Point.class)) {
            return ru_unicorn_ujin_data_realm_PointRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ApartmentRequest.class)) {
            return ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DemoUser.class)) {
            return ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentBuilding.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentBuildingAddress.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentComplex.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentObject.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentObjectBuilding.class)) {
            return ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(User.class)) {
            return ru_unicorn_ujin_data_realm_profile_UserRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ProviderCity.class)) {
            return ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RealmString.class)) {
            return ru_unicorn_ujin_data_realm_RealmStringRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Splashscreen.class)) {
            return ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TimeSlot.class)) {
            return ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Wifi.class)) {
            return ru_unicorn_ujin_data_realm_WifiRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(AllTicketDataInX.class)) {
            return ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketDataInX.class)) {
            return ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Schemas.class)) {
            return C4670xfcd8d37c.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(C5788Video.class)) {
            return C4674x1c4fffad.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ProfileAdress.class)) {
            return C4682xb8d394dd.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ProfileData.class)) {
            return C4780xf0c1c3b9.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(UserCompany.class)) {
            return C4782x594eae38.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(UserData.class)) {
            return C4784x85418d2d.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(UserProfile.class)) {
            return C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(UserVehicle.class)) {
            return C4788xc3a2b227.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ContactData.class)) {
            return C4792xa984038c.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ContactDataList.class)) {
            return C4790xe661e44a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketPropertyObject.class)) {
            return C4796x4009dee4.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Appointment.class)) {
            return C4818xb7a5caf9.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ExecutorsIn.class)) {
            return C4820x447e431f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FromUser.class)) {
            return C4822xab1ed299.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Status.class)) {
            return C4824xe6f53cf6.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ToUser.class)) {
            return C4826x725684ea.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BusinessBuildings.class)) {
            return C4830x6d8ab071.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BusinessBuildingsList.class)) {
            return C4828xbbcd96af.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BusinessCenterDTO.class)) {
            return C4832x38c73bbc.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CityDTO.class)) {
            return C4834x9fbcbe06.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SearchBuildingDTO.class)) {
            return C4836xc7389ad5.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SearchComplex.class)) {
            return C4838xc3cde83a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Action.class)) {
            return ru_unicorn_ujin_data_realm_ActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BeaconAction.class)) {
            return ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BeaconActionDescription.class)) {
            return ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CardAdress.class)) {
            return ru_unicorn_ujin_data_realm_CardAdressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CardData.class)) {
            return ru_unicorn_ujin_data_realm_CardDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Chat.class)) {
            return ru_unicorn_ujin_data_realm_ChatRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ChatListResponseData.class)) {
            return ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(City.class)) {
            return ru_unicorn_ujin_data_realm_CityRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CityTitle.class)) {
            return ru_unicorn_ujin_data_realm_CityTitleRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Complex.class)) {
            return ru_unicorn_ujin_data_realm_ComplexRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ComplexInfo.class)) {
            return ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Coordinates.class)) {
            return ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Favourite.class)) {
            return ru_unicorn_ujin_data_realm_FavouriteRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Flat.class)) {
            return ru_unicorn_ujin_data_realm_FlatRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FlatInfo.class)) {
            return ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(GetFlatsResponseData.class)) {
            return ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ImageData.class)) {
            return ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ImageSize.class)) {
            return ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Intercom.class)) {
            return ru_unicorn_ujin_data_realm_IntercomRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(IntercomVal.class)) {
            return ru_unicorn_ujin_data_realm_IntercomValRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Mortrage.class)) {
            return ru_unicorn_ujin_data_realm_MortrageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(PassCard.class)) {
            return ru_unicorn_ujin_data_realm_PassCardRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(PassCardUno.class)) {
            return ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Price.class)) {
            return ru_unicorn_ujin_data_realm_PriceRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Apartment.class)) {
            return ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SipOpenDoorParam.class)) {
            return ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SipParametrs.class)) {
            return ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SipPreviewParams.class)) {
            return ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Size.class)) {
            return ru_unicorn_ujin_data_realm_SizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(UnreadBadge.class)) {
            return ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FavoriteBeacon.class)) {
            return ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DeviceModel.class)) {
            return C4637x5b79bd5a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SignalRemote.class)) {
            return C4639x6ab32465.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Hardware.class)) {
            return C4642xba9ad755.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(HardwareSignal.class)) {
            return C4644x8f0def9d.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ManagementType.class)) {
            return C4646xa509baca.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RoomInfo.class)) {
            return C4648x51014856.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Intellect.class)) {
            return C4650xa7ebbdf7.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(AudioUrl.class)) {
            return C4652xadba3b3e.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Scenario.class)) {
            return C4654x9b0b7455.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(State.class)) {
            return C4656xbdeaa6ca.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DialogButtons.class)) {
            return C4658x6180a4a3.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Guard.class)) {
            return C4660xccbea62f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(MinVersion.class)) {
            return C4662xc0a23e3a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Schema.class)) {
            return C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SchemaCallback.class)) {
            return C4664x5395ce9a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(SchemaItem.class)) {
            return C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Services.class)) {
            return C4672xd5d6cbb2.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Token.class)) {
            return ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Device.class)) {
            return C4676xf1982dca.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ClassDevice.class)) {
            return C4678x5ab6ac5f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(BMSInfo.class)) {
            return C4680x20fc7e06.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Devices.class)) {
            return C4684xaab8a0b.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(FilesUrl.class)) {
            return C4686xbd7f885e.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceData.class)) {
            return C4688xf4020777.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceFieldItems.class)) {
            return C4690x83bb1d33.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceStatus.class)) {
            return C4692x82b5a23f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DomServiceCategory.class)) {
            return C4694x8588f9e4.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DomServiceIndicator.class)) {
            return C4696x936db447.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DomServicesList.class)) {
            return C4700xb5dd9409.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(DomServiceTariff.class)) {
            return C4698x9da95c4a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceFile.class)) {
            return C4702x12a70883.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceMessages.class)) {
            return C4704x27ddec53.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceTicket.class)) {
            return C4706xcf10b813.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ServiceTicketType.class)) {
            return C4708x7c8648ed.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketAccountsList.class)) {
            return C4710x379415fc.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketApartment.class)) {
            return C4712x67ea0478.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketApplicant.class)) {
            return C4714x6f4f4848.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketChatData.class)) {
            return C4716x3c51d27a.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketInfo.class)) {
            return C4718xb56c6186.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketObject.class)) {
            return C4720x13bb7c97.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketPerformer.class)) {
            return C4722x782e3a14.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketRating.class)) {
            return C4724xb050ad75.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Tickets.class)) {
            return C4730xd31c9f99.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketState.class)) {
            return C4726x470e297.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketUrgency.class)) {
            return C4728x7291458f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Rooms.class)) {
            return C4732xd254b890.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(MoreIconsInfo.class)) {
            return C4734x3e5f4d91.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ActualCountersData.class)) {
            return C4736x16a117c0.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentCompany.class)) {
            return C4738x3e33c9bd.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(AttrRenta.class)) {
            return C4740x60e6319b.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(PropertyRenta.class)) {
            return C4742xdc63beb7.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentAttribute.class)) {
            return C4744xe660f6a7.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentInfo.class)) {
            return C4748x5c024f21.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentInfoObject.class)) {
            return C4746x72770240.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentPermissions.class)) {
            return C4750xebfdbb8f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentType.class)) {
            return C4754xcc2cbaad.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentTypeAttr.class)) {
            return C4752xf2aa007e.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(StateRenta.class)) {
            return C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TimeSlotHuman.class)) {
            return C4758xdaf4d606.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TimeSlotHumanValue.class)) {
            return C4760xfaafb8e9.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TypeRent.class)) {
            return C4762x65e9722d.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ManagePermissions.class)) {
            return C4764xd43a5daf.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Rent.class)) {
            return C4768x32c48847.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentChildren.class)) {
            return C4766x7a38e7a6.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Renters.class)) {
            return C4772xa5d8f71d.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentState.class)) {
            return C4770xc85b1268.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TalkingInfo.class)) {
            return C4774x33c567d4.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TalkingPhotos.class)) {
            return C4778x8713e227.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TalkingPhotosFile.class)) {
            return C4776x6ae644c3.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(RentAttributes.class)) {
            return C4794x165b0474.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ApartmentScenarioOptionAdd.class)) {
            return C4798x7bd56e2e.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Options.class)) {
            return C4802x9a8f8638.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(OptionsList.class)) {
            return C4800x8b5430f6.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Ticket.class)) {
            return C4808x39dc6d46.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketDescription.class)) {
            return C4804xd885bb4.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(TicketDetail.class)) {
            return C4806xa0f8f737.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(VideoDates.class)) {
            return C4810xdea6d8e5.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(VideoEvents.class)) {
            return C4814x4a38c7d7.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(VideoEventsList.class)) {
            return C4812xdb358b15.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(VideoUrl.class)) {
            return C4816xc56fdf8f.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        throw getMissingProxyClassException(cls);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Class, java.lang.Object, java.lang.Class<E>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends p046io.realm.RealmModel> E newInstance(java.lang.Class<E> r8, java.lang.Object r9, p046io.realm.internal.Row r10, p046io.realm.internal.ColumnInfo r11, boolean r12, java.util.List<java.lang.String> r13) {
        /*
            r7 = this;
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            r2 = r9
            io.realm.BaseRealm r2 = (p046io.realm.BaseRealm) r2     // Catch:{ all -> 0x129d }
            r1 = r0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x129d }
            checkClass(r8)     // Catch:{ all -> 0x129d }
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r9 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x002d
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy r9 = new io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x002d:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r9 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0044
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0044:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r9 = p035ru.unicorn.ujin.ble.data.BleReader.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x005b
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy r9 = new io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x005b:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData> r9 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0072
            io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0072:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse> r9 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0089
            io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0089:
            java.lang.Class<ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData> r9 = p035ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x00a0
            io.realm.ru_unicorn_ujin_data_api_response_marketplace_RedeemCodeResponseDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_api_response_marketplace_RedeemCodeResponseDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x00a0:
            java.lang.Class<ru.unicorn.ujin.data.api.response.SubAccount> r9 = p035ru.unicorn.ujin.data.api.response.SubAccount.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x00b7
            io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x00b7:
            java.lang.Class<ru.unicorn.ujin.data.entities.chats.Author> r9 = p035ru.unicorn.ujin.data.entities.chats.Author.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x00ce
            io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x00ce:
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r9 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x00e5
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x00e5:
            java.lang.Class<ru.unicorn.ujin.data.realm.AcceptanceDate> r9 = p035ru.unicorn.ujin.data.realm.AcceptanceDate.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x00fc
            io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x00fc:
            java.lang.Class<ru.unicorn.ujin.data.realm.Address> r9 = p035ru.unicorn.ujin.data.realm.Address.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0113
            io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0113:
            java.lang.Class<ru.unicorn.ujin.data.realm.ApartmentState> r9 = p035ru.unicorn.ujin.data.realm.ApartmentState.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x012a
            io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x012a:
            java.lang.Class<ru.unicorn.ujin.data.realm.Bank> r9 = p035ru.unicorn.ujin.data.realm.Bank.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0141
            io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0141:
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r9 = p035ru.unicorn.ujin.data.realm.Building.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0158
            io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0158:
            java.lang.Class<ru.unicorn.ujin.data.realm.Camera> r9 = p035ru.unicorn.ujin.data.realm.Camera.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x016f
            io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x016f:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.CompanyApplication> r9 = p035ru.unicorn.ujin.data.realm.company.CompanyApplication.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0186
            io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0186:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.EnterpriseApplication> r9 = p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x019d
            io.realm.ru_unicorn_ujin_data_realm_company_EnterpriseApplicationRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_company_EnterpriseApplicationRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x019d:
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r9 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x01b4
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x01b4:
            java.lang.Class<ru.unicorn.ujin.data.realm.Feature> r9 = p035ru.unicorn.ujin.data.realm.Feature.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x01cb
            io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x01cb:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r9 = p035ru.unicorn.ujin.data.realm.FileData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x01e2
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x01e2:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileMeta> r9 = p035ru.unicorn.ujin.data.realm.FileMeta.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x01f9
            io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x01f9:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatButtons> r9 = p035ru.unicorn.ujin.data.realm.FlatButtons.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0210
            io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0210:
            java.lang.Class<ru.unicorn.ujin.data.realm.Layout> r9 = p035ru.unicorn.ujin.data.realm.Layout.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0227
            io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0227:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x023e
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x023e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0255
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0255:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x026c
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x026c:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0283
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0283:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartTotal> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CartTotal.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x029a
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x029a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x02b1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x02b1:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x02c8
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x02c8:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x02df
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x02df:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x02f6
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x02f6:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CompanyContact> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x030d
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x030d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Component> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Component.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0324
            io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0324:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x033b
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x033b:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CouponImage> r9 = p035ru.unicorn.ujin.data.realm.marketplace.CouponImage.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0352
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0352:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Field> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Field.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0369
            io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0369:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0380
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0380:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0397
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0397:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderAction> r9 = p035ru.unicorn.ujin.data.realm.marketplace.OrderAction.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x03ae
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x03ae:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r9 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x03c5
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x03c5:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Parameter> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Parameter.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x03dc
            io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x03dc:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.PreviewImage> r9 = p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x03f3
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x03f3:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x040a
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x040a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Property> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Property.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0421
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0421:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r9 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0438
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0438:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate> r9 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x044f
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeDateRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeDateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x044f:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SampleWork> r9 = p035ru.unicorn.ujin.data.realm.marketplace.SampleWork.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0466
            io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0466:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SearchItem> r9 = p035ru.unicorn.ujin.data.realm.marketplace.SearchItem.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x047d
            io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x047d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SelectValue> r9 = p035ru.unicorn.ujin.data.realm.marketplace.SelectValue.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0494
            io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0494:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Tag> r9 = p035ru.unicorn.ujin.data.realm.marketplace.Tag.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x04ab
            io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x04ab:
            java.lang.Class<ru.unicorn.ujin.data.realm.Meta> r9 = p035ru.unicorn.ujin.data.realm.Meta.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x04c2
            io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x04c2:
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r9 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x04d9
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x04d9:
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r9 = p035ru.unicorn.ujin.data.realm.News.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x04f0
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x04f0:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r9 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0507
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0507:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.NotificationData> r9 = p035ru.unicorn.ujin.data.realm.notification.NotificationData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x051e
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_notification_NotificationDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x051e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Pamyatka> r9 = p035ru.unicorn.ujin.data.realm.Pamyatka.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0535
            io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0535:
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r9 = p035ru.unicorn.ujin.data.realm.Point.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x054c
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x054c:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.ApartmentRequest> r9 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0563
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0563:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r9 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x057a
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x057a:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r9 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0591
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0591:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuildingAddress> r9 = p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x05a8
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x05a8:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r9 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x05bf
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x05bf:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r9 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x05d6
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x05d6:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r9 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x05ed
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x05ed:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r9 = p035ru.unicorn.ujin.data.realm.profile.User.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0604
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0604:
            java.lang.Class<ru.unicorn.ujin.data.realm.ProviderCity> r9 = p035ru.unicorn.ujin.data.realm.ProviderCity.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x061b
            io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x061b:
            java.lang.Class<ru.unicorn.ujin.data.realm.RealmString> r9 = p035ru.unicorn.ujin.data.realm.RealmString.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0632
            io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0632:
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r9 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0649
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0649:
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r9 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0660
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0660:
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r9 = p035ru.unicorn.ujin.data.realm.Wifi.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0677
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0677:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r9 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x068e
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy r9 = new io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x068e:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r9 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x06a5
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy r9 = new io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x06a5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x06bc
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x06bc:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.video.Video> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x06d3
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_video_VideoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_video_VideoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x06d3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x06ea
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x06ea:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0701
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0701:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0718
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserCompanyRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserCompanyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0718:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x072f
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x072f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0746
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0746:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x075d
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserVehicleRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserVehicleRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x075d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0774
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0774:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x078b
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x078b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyObject> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x07a2
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_TicketPropertyObjectRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_TicketPropertyObjectRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x07a2:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r9 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x07b9
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x07b9:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r9 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x07d0
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x07d0:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.FromUser> r9 = p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x07e7
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_FromUserRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_FromUserRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x07e7:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Status> r9 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Status.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x07fe
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_StatusRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_StatusRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x07fe:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ToUser> r9 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0815
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ToUserRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ToUserRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0815:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x082c
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x082c:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0843
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0843:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x085a
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x085a:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0871
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0871:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0888
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchBuildingDTORealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchBuildingDTORealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0888:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex> r9 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x089f
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchComplexRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchComplexRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x089f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Action> r9 = p035ru.unicorn.ujin.data.realm.Action.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x08b6
            io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x08b6:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconAction> r9 = p035ru.unicorn.ujin.data.realm.BeaconAction.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x08cd
            io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x08cd:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconActionDescription> r9 = p035ru.unicorn.ujin.data.realm.BeaconActionDescription.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x08e4
            io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x08e4:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardAdress> r9 = p035ru.unicorn.ujin.data.realm.CardAdress.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x08fb
            io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x08fb:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardData> r9 = p035ru.unicorn.ujin.data.realm.CardData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0912
            io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0912:
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r9 = p035ru.unicorn.ujin.data.realm.Chat.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0929
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0929:
            java.lang.Class<ru.unicorn.ujin.data.realm.ChatListResponseData> r9 = p035ru.unicorn.ujin.data.realm.ChatListResponseData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0940
            io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0940:
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r9 = p035ru.unicorn.ujin.data.realm.City.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0957
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0957:
            java.lang.Class<ru.unicorn.ujin.data.realm.CityTitle> r9 = p035ru.unicorn.ujin.data.realm.CityTitle.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x096e
            io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x096e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r9 = p035ru.unicorn.ujin.data.realm.Complex.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0985
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0985:
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r9 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x099c
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x099c:
            java.lang.Class<ru.unicorn.ujin.data.realm.Coordinates> r9 = p035ru.unicorn.ujin.data.realm.Coordinates.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x09b3
            io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x09b3:
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r9 = p035ru.unicorn.ujin.data.realm.Favourite.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x09ca
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x09ca:
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r9 = p035ru.unicorn.ujin.data.realm.Flat.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x09e1
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x09e1:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatInfo> r9 = p035ru.unicorn.ujin.data.realm.FlatInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x09f8
            io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x09f8:
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r9 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a0f
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a0f:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageData> r9 = p035ru.unicorn.ujin.data.realm.ImageData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a26
            io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a26:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageSize> r9 = p035ru.unicorn.ujin.data.realm.ImageSize.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a3d
            io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a3d:
            java.lang.Class<ru.unicorn.ujin.data.realm.Intercom> r9 = p035ru.unicorn.ujin.data.realm.Intercom.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a54
            io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a54:
            java.lang.Class<ru.unicorn.ujin.data.realm.IntercomVal> r9 = p035ru.unicorn.ujin.data.realm.IntercomVal.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a6b
            io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a6b:
            java.lang.Class<ru.unicorn.ujin.data.realm.Mortrage> r9 = p035ru.unicorn.ujin.data.realm.Mortrage.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a82
            io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a82:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCard> r9 = p035ru.unicorn.ujin.data.realm.PassCard.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0a99
            io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0a99:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCardUno> r9 = p035ru.unicorn.ujin.data.realm.PassCardUno.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ab0
            io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ab0:
            java.lang.Class<ru.unicorn.ujin.data.realm.Price> r9 = p035ru.unicorn.ujin.data.realm.Price.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ac7
            io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ac7:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r9 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ade
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ade:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipOpenDoorParam> r9 = p035ru.unicorn.ujin.data.realm.SipOpenDoorParam.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0af5
            io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0af5:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r9 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b0c
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b0c:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipPreviewParams> r9 = p035ru.unicorn.ujin.data.realm.SipPreviewParams.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b23
            io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b23:
            java.lang.Class<ru.unicorn.ujin.data.realm.Size> r9 = p035ru.unicorn.ujin.data.realm.Size.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b3a
            io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b3a:
            java.lang.Class<ru.unicorn.ujin.data.realm.UnreadBadge> r9 = p035ru.unicorn.ujin.data.realm.UnreadBadge.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b51
            io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b51:
            java.lang.Class<ru.unicorn.ujin.data.service.location.FavoriteBeacon> r9 = p035ru.unicorn.ujin.data.service.location.FavoriteBeacon.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b68
            io.realm.ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy r9 = new io.realm.ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b68:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.DeviceModel> r9 = p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b7f
            io.realm.ru_unicorn_ujin_view_activity_navigation_api_DeviceModelRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_api_DeviceModelRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b7f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.SignalRemote> r9 = p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0b96
            io.realm.ru_unicorn_ujin_view_activity_navigation_api_SignalRemoteRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_api_SignalRemoteRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0b96:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0bad
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0bad:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0bc4
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareSignalRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareSignalRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0bc4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0bdb
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_ManagementTypeRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_ManagementTypeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0bdb:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0bf2
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0bf2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c09
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c09:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c20
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_AudioUrlRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_AudioUrlRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c20:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c37
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c37:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.State> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c4e
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_StateRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_StateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c4e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c65
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_DialogButtonsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_DialogButtonsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c65:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c7c
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_GuardRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_GuardRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c7c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0c93
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_MinVersionRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_MinVersionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0c93:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0caa
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0caa:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0cc1
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaCallbackRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaCallbackRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0cc1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0cd8
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaItemRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaItemRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0cd8:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Services> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0cef
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_ServicesRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_ServicesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0cef:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.Token> r9 = p035ru.unicorn.ujin.view.activity.navigation.entity.Token.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d06
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d06:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r9 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d1d
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d1d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d34
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_addhardware_ClassDeviceRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_addhardware_ClassDeviceRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d34:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d4b
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d4b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d62
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d62:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d79
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_FilesUrlRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_FilesUrlRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d79:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0d90
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0d90:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0da7
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceFieldItemsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceFieldItemsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0da7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0dbe
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceStatusRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceStatusRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0dbe:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0dd5
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceCategoryRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceCategoryRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0dd5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0dec
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceIndicatorRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceIndicatorRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0dec:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e03
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServicesListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServicesListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e03:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e1a
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e1a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e31
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e31:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e48
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e48:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e5f
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e5f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e76
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e76:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0e8d
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketAccountsListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketAccountsListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0e8d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ea4
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApartmentRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApartmentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ea4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ebb
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApplicantRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApplicantRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ebb:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ed2
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketChatDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketChatDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ed2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ee9
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ee9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f00
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketObjectRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketObjectRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f00:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f17
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketPerformerRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketPerformerRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f17:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f2e
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f2e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f45
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f45:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f5c
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketStateRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketStateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f5c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f73
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketUrgencyRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketUrgencyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f73:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0f8a
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_RoomsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_RoomsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0f8a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0fa1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_MoreIconsInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_MoreIconsInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0fa1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.ActualCountersData.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0fb8
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_measures_ActualCountersDataRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_measures_ActualCountersDataRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0fb8:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0fcf
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0fcf:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0fe6
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_AttrRentaRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_AttrRentaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0fe6:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x0ffd
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x0ffd:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentAttribute.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1014
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentAttributeRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentAttributeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1014:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x102b
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x102b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1042
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1042:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1059
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentPermissionsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentPermissionsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1059:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1070
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1070:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1087
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1087:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x109e
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x109e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x10b5
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x10b5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x10cc
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanValueRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanValueRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x10cc:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x10e3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TypeRentRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TypeRentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x10e3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x10fa
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_ManagePermissionsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_ManagePermissionsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x10fa:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1111
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1111:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1128
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1128:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x113f
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x113f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1156
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentStateRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentStateRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1156:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x116d
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x116d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1184
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1184:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x119b
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x119b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x11b2
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_RentAttributesRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_RentAttributesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x11b2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x11c9
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_ApartmentScenarioOptionAddRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_ApartmentScenarioOptionAddRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x11c9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x11e0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x11e0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x11f7
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x11f7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Ticket.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x120e
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x120e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1225
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDescriptionRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDescriptionRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1225:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetail.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x123c
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x123c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1253
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoDatesRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoDatesRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1253:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x126a
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x126a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1281
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsListRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsListRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1281:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl> r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl.class
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x129d }
            if (r9 == 0) goto L_0x1298
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoUrlRealmProxy r9 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoUrlRealmProxy     // Catch:{ all -> 0x129d }
            r9.<init>()     // Catch:{ all -> 0x129d }
            java.lang.Object r8 = r8.cast(r9)     // Catch:{ all -> 0x129d }
            io.realm.RealmModel r8 = (p046io.realm.RealmModel) r8     // Catch:{ all -> 0x129d }
            r0.clear()
            return r8
        L_0x1298:
            io.realm.exceptions.RealmException r8 = getMissingProxyClassException((java.lang.Class<? extends p046io.realm.RealmModel>) r8)     // Catch:{ all -> 0x129d }
            throw r8     // Catch:{ all -> 0x129d }
        L_0x129d:
            r8 = move-exception
            r0.clear()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.DefaultRealmModuleMediator.newInstance(java.lang.Class, java.lang.Object, io.realm.internal.Row, io.realm.internal.ColumnInfo, boolean, java.util.List):io.realm.RealmModel");
    }

    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class superclass = e instanceof RealmObjectProxy ? e.getClass().getSuperclass() : e.getClass();
        if (superclass.equals(AvailablePassType.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.AvailablePassTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class), (AvailablePassType) e, z, map, set));
        } else if (superclass.equals(BleKeyData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.BleKeyDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class), (BleKeyData) e, z, map, set));
        } else if (superclass.equals(BleReader.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_BleReaderRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_ble_data_BleReaderRealmProxy.BleReaderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class), (BleReader) e, z, map, set));
        } else if (superclass.equals(RentConfirmCodeData.class)) {
            return (RealmModel) superclass.cast(C4591x4d164271.copyOrUpdate(realm, (C4591x4d164271.RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class), (RentConfirmCodeData) e, z, map, set));
        } else if (superclass.equals(RentConfirmCodeResponse.class)) {
            return (RealmModel) superclass.cast(C4593x1ca69248.copyOrUpdate(realm, (C4593x1ca69248.RentConfirmCodeResponseColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class), (RentConfirmCodeResponse) e, z, map, set));
        } else if (superclass.equals(RedeemCodeResponseData.class)) {
            return (RealmModel) superclass.cast(C4595x5d0db86d.copyOrUpdate(realm, (C4595x5d0db86d.RedeemCodeResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class), (RedeemCodeResponseData) e, z, map, set));
        } else if (superclass.equals(SubAccount.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class), (SubAccount) e, z, map, set));
        } else if (superclass.equals(Author.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class), (Author) e, z, map, set));
        } else if (superclass.equals(QrCodeForSave.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.QrCodeForSaveColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class), (QrCodeForSave) e, z, map, set));
        } else if (superclass.equals(AcceptanceDate.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.AcceptanceDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AcceptanceDate.class), (AcceptanceDate) e, z, map, set));
        } else if (superclass.equals(Address.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_AddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_AddressRealmProxy.AddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Address.class), (Address) e, z, map, set));
        } else if (superclass.equals(ApartmentState.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.ApartmentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentState.class), (ApartmentState) e, z, map, set));
        } else if (superclass.equals(Bank.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BankRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BankRealmProxy.BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class), (Bank) e, z, map, set));
        } else if (superclass.equals(Building.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BuildingRealmProxy.BuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Building.class), (Building) e, z, map, set));
        } else if (superclass.equals(Camera.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CameraRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CameraRealmProxy.CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class), (Camera) e, z, map, set));
        } else if (superclass.equals(CompanyApplication.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.CompanyApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class), (CompanyApplication) e, z, map, set));
        } else if (superclass.equals(EnterpriseApplication.class)) {
            return (RealmModel) superclass.cast(C4601xb6361989.copyOrUpdate(realm, (C4601xb6361989.EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class), (EnterpriseApplication) e, z, map, set));
        } else if (superclass.equals(ContextBanner.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.ContextBannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class), (ContextBanner) e, z, map, set));
        } else if (superclass.equals(Feature.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FeatureRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FeatureRealmProxy.FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class), (Feature) e, z, map, set));
        } else if (superclass.equals(FileData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), (FileData) e, z, map, set));
        } else if (superclass.equals(FileMeta.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileMetaRealmProxy.FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class), (FileMeta) e, z, map, set));
        } else if (superclass.equals(FlatButtons.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class), (FlatButtons) e, z, map, set));
        } else if (superclass.equals(Layout.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_LayoutRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_LayoutRealmProxy.LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class), (Layout) e, z, map, set));
        } else if (superclass.equals(Banner.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.BannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class), (Banner) e, z, map, set));
        } else if (superclass.equals(CartCompany.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class), (CartCompany) e, z, map, set));
        } else if (superclass.equals(CartItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.CartItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class), (CartItem) e, z, map, set));
        } else if (superclass.equals(CartOffer.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class), (CartOffer) e, z, map, set));
        } else if (superclass.equals(CartTotal.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class), (CartTotal) e, z, map, set));
        } else if (superclass.equals(Category.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class), (Category) e, z, map, set));
        } else if (superclass.equals(CategoryItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.CategoryItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class), (CategoryItem) e, z, map, set));
        } else if (superclass.equals(Comment.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.CommentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class), (Comment) e, z, map, set));
        } else if (superclass.equals(Company.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.CompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class), (Company) e, z, map, set));
        } else if (superclass.equals(CompanyContact.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class), (CompanyContact) e, z, map, set));
        } else if (superclass.equals(Component.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.ComponentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Component.class), (Component) e, z, map, set));
        } else if (superclass.equals(Coupon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.CouponColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class), (Coupon) e, z, map, set));
        } else if (superclass.equals(CouponImage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class), (CouponImage) e, z, map, set));
        } else if (superclass.equals(Field.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Field.class), (Field) e, z, map, set));
        } else if (superclass.equals(Offer.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class), (Offer) e, z, map, set));
        } else if (superclass.equals(Order.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.OrderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class), (Order) e, z, map, set));
        } else if (superclass.equals(OrderAction.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.OrderActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class), (OrderAction) e, z, map, set));
        } else if (superclass.equals(OrderItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.OrderItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class), (OrderItem) e, z, map, set));
        } else if (superclass.equals(Parameter.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.ParameterColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Parameter.class), (Parameter) e, z, map, set));
        } else if (superclass.equals(PreviewImage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class), (PreviewImage) e, z, map, set));
        } else if (superclass.equals(Promotion.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.PromotionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class), (Promotion) e, z, map, set));
        } else if (superclass.equals(Property.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.PropertyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Property.class), (Property) e, z, map, set));
        } else if (superclass.equals(RedeemedCode.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class), (RedeemedCode) e, z, map, set));
        } else if (superclass.equals(RedeemedCodeDate.class)) {
            return (RealmModel) superclass.cast(C4620xe7ed888c.copyOrUpdate(realm, (C4620xe7ed888c.RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class), (RedeemedCodeDate) e, z, map, set));
        } else if (superclass.equals(SampleWork.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.SampleWorkColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class), (SampleWork) e, z, map, set));
        } else if (superclass.equals(SearchItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.SearchItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class), (SearchItem) e, z, map, set));
        } else if (superclass.equals(SelectValue.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class), (SelectValue) e, z, map, set));
        } else if (superclass.equals(Tag.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.TagColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class), (Tag) e, z, map, set));
        } else if (superclass.equals(Meta.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MetaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MetaRealmProxy.MetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class), (Meta) e, z, map, set));
        } else if (superclass.equals(MyBeacon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class), (MyBeacon) e, z, map, set));
        } else if (superclass.equals(News.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_NewsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_NewsRealmProxy.NewsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class), (News) e, z, map, set));
        } else if (superclass.equals(Notification.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.NotificationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class), (Notification) e, z, map, set));
        } else if (superclass.equals(NotificationData.class)) {
            return (RealmModel) superclass.cast(C4626xe255e1e5.copyOrUpdate(realm, (C4626xe255e1e5.NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class), (NotificationData) e, z, map, set));
        } else if (superclass.equals(Pamyatka.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class), (Pamyatka) e, z, map, set));
        } else if (superclass.equals(Point.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PointRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PointRealmProxy.PointColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class), (Point) e, z, map, set));
        } else if (superclass.equals(ApartmentRequest.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class), (ApartmentRequest) e, z, map, set));
        } else if (superclass.equals(DemoUser.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.DemoUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class), (DemoUser) e, z, map, set));
        } else if (superclass.equals(RentBuilding.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class), (RentBuilding) e, z, map, set));
        } else if (superclass.equals(RentBuildingAddress.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class), (RentBuildingAddress) e, z, map, set));
        } else if (superclass.equals(RentComplex.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class), (RentComplex) e, z, map, set));
        } else if (superclass.equals(RentObject.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.RentObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObject.class), (RentObject) e, z, map, set));
        } else if (superclass.equals(RentObjectBuilding.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class), (RentObjectBuilding) e, z, map, set));
        } else if (superclass.equals(User.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class), (User) e, z, map, set));
        } else if (superclass.equals(ProviderCity.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.ProviderCityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProviderCity.class), (ProviderCity) e, z, map, set));
        } else if (superclass.equals(RealmString.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_RealmStringRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_RealmStringRealmProxy.RealmStringColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RealmString.class), (RealmString) e, z, map, set));
        } else if (superclass.equals(Splashscreen.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.SplashscreenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class), (Splashscreen) e, z, map, set));
        } else if (superclass.equals(TimeSlot.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.TimeSlotColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class), (TimeSlot) e, z, map, set));
        } else if (superclass.equals(Wifi.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_WifiRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_WifiRealmProxy.WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class), (Wifi) e, z, map, set));
        } else if (superclass.equals(AllTicketDataInX.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.AllTicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class), (AllTicketDataInX) e, z, map, set));
        } else if (superclass.equals(TicketDataInX.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class), (TicketDataInX) e, z, map, set));
        } else if (superclass.equals(Schemas.class)) {
            return (RealmModel) superclass.cast(C4670xfcd8d37c.copyOrUpdate(realm, (C4670xfcd8d37c.SchemasColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class), (Schemas) e, z, map, set));
        } else if (superclass.equals(C5788Video.class)) {
            return (RealmModel) superclass.cast(C4674x1c4fffad.copyOrUpdate(realm, (C4674x1c4fffad.VideoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class), (C5788Video) e, z, map, set));
        } else if (superclass.equals(ProfileAdress.class)) {
            return (RealmModel) superclass.cast(C4682xb8d394dd.copyOrUpdate(realm, (C4682xb8d394dd.ProfileAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class), (ProfileAdress) e, z, map, set));
        } else if (superclass.equals(ProfileData.class)) {
            return (RealmModel) superclass.cast(C4780xf0c1c3b9.copyOrUpdate(realm, (C4780xf0c1c3b9.ProfileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class), (ProfileData) e, z, map, set));
        } else if (superclass.equals(UserCompany.class)) {
            return (RealmModel) superclass.cast(C4782x594eae38.copyOrUpdate(realm, (C4782x594eae38.UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class), (UserCompany) e, z, map, set));
        } else if (superclass.equals(UserData.class)) {
            return (RealmModel) superclass.cast(C4784x85418d2d.copyOrUpdate(realm, (C4784x85418d2d.UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class), (UserData) e, z, map, set));
        } else if (superclass.equals(UserProfile.class)) {
            return (RealmModel) superclass.cast(C4786xba887464.copyOrUpdate(realm, (C4786xba887464.UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), (UserProfile) e, z, map, set));
        } else if (superclass.equals(UserVehicle.class)) {
            return (RealmModel) superclass.cast(C4788xc3a2b227.copyOrUpdate(realm, (C4788xc3a2b227.UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class), (UserVehicle) e, z, map, set));
        } else if (superclass.equals(ContactData.class)) {
            return (RealmModel) superclass.cast(C4792xa984038c.copyOrUpdate(realm, (C4792xa984038c.ContactDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class), (ContactData) e, z, map, set));
        } else if (superclass.equals(ContactDataList.class)) {
            return (RealmModel) superclass.cast(C4790xe661e44a.copyOrUpdate(realm, (C4790xe661e44a.ContactDataListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class), (ContactDataList) e, z, map, set));
        } else if (superclass.equals(TicketPropertyObject.class)) {
            return (RealmModel) superclass.cast(C4796x4009dee4.copyOrUpdate(realm, (C4796x4009dee4.TicketPropertyObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class), (TicketPropertyObject) e, z, map, set));
        } else if (superclass.equals(Appointment.class)) {
            return (RealmModel) superclass.cast(C4818xb7a5caf9.copyOrUpdate(realm, (C4818xb7a5caf9.AppointmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class), (Appointment) e, z, map, set));
        } else if (superclass.equals(ExecutorsIn.class)) {
            return (RealmModel) superclass.cast(C4820x447e431f.copyOrUpdate(realm, (C4820x447e431f.ExecutorsInColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class), (ExecutorsIn) e, z, map, set));
        } else if (superclass.equals(FromUser.class)) {
            return (RealmModel) superclass.cast(C4822xab1ed299.copyOrUpdate(realm, (C4822xab1ed299.FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class), (FromUser) e, z, map, set));
        } else if (superclass.equals(Status.class)) {
            return (RealmModel) superclass.cast(C4824xe6f53cf6.copyOrUpdate(realm, (C4824xe6f53cf6.StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class), (Status) e, z, map, set));
        } else if (superclass.equals(ToUser.class)) {
            return (RealmModel) superclass.cast(C4826x725684ea.copyOrUpdate(realm, (C4826x725684ea.ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class), (ToUser) e, z, map, set));
        } else if (superclass.equals(BusinessBuildings.class)) {
            return (RealmModel) superclass.cast(C4830x6d8ab071.copyOrUpdate(realm, (C4830x6d8ab071.BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), (BusinessBuildings) e, z, map, set));
        } else if (superclass.equals(BusinessBuildingsList.class)) {
            return (RealmModel) superclass.cast(C4828xbbcd96af.copyOrUpdate(realm, (C4828xbbcd96af.BusinessBuildingsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class), (BusinessBuildingsList) e, z, map, set));
        } else if (superclass.equals(BusinessCenterDTO.class)) {
            return (RealmModel) superclass.cast(C4832x38c73bbc.copyOrUpdate(realm, (C4832x38c73bbc.BusinessCenterDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class), (BusinessCenterDTO) e, z, map, set));
        } else if (superclass.equals(CityDTO.class)) {
            return (RealmModel) superclass.cast(C4834x9fbcbe06.copyOrUpdate(realm, (C4834x9fbcbe06.CityDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class), (CityDTO) e, z, map, set));
        } else if (superclass.equals(SearchBuildingDTO.class)) {
            return (RealmModel) superclass.cast(C4836xc7389ad5.copyOrUpdate(realm, (C4836xc7389ad5.SearchBuildingDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class), (SearchBuildingDTO) e, z, map, set));
        } else if (superclass.equals(SearchComplex.class)) {
            return (RealmModel) superclass.cast(C4838xc3cde83a.copyOrUpdate(realm, (C4838xc3cde83a.SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class), (SearchComplex) e, z, map, set));
        } else if (superclass.equals(Action.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ActionRealmProxy.ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class), (Action) e, z, map, set));
        } else if (superclass.equals(BeaconAction.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class), (BeaconAction) e, z, map, set));
        } else if (superclass.equals(BeaconActionDescription.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.BeaconActionDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconActionDescription.class), (BeaconActionDescription) e, z, map, set));
        } else if (superclass.equals(CardAdress.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CardAdressRealmProxy.CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class), (CardAdress) e, z, map, set));
        } else if (superclass.equals(CardData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CardDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CardDataRealmProxy.CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class), (CardData) e, z, map, set));
        } else if (superclass.equals(Chat.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ChatRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ChatRealmProxy.ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class), (Chat) e, z, map, set));
        } else if (superclass.equals(ChatListResponseData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.ChatListResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class), (ChatListResponseData) e, z, map, set));
        } else if (superclass.equals(City.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CityRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CityRealmProxy.CityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class), (City) e, z, map, set));
        } else if (superclass.equals(CityTitle.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CityTitleRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CityTitleRealmProxy.CityTitleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class), (CityTitle) e, z, map, set));
        } else if (superclass.equals(Complex.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ComplexRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ComplexRealmProxy.ComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class), (Complex) e, z, map, set));
        } else if (superclass.equals(ComplexInfo.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.ComplexInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class), (ComplexInfo) e, z, map, set));
        } else if (superclass.equals(Coordinates.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), (Coordinates) e, z, map, set));
        } else if (superclass.equals(Favourite.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FavouriteRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FavouriteRealmProxy.FavouriteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class), (Favourite) e, z, map, set));
        } else if (superclass.equals(Flat.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatRealmProxy.FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class), (Flat) e, z, map, set));
        } else if (superclass.equals(FlatInfo.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class), (FlatInfo) e, z, map, set));
        } else if (superclass.equals(GetFlatsResponseData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.GetFlatsResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class), (GetFlatsResponseData) e, z, map, set));
        } else if (superclass.equals(ImageData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), (ImageData) e, z, map, set));
        } else if (superclass.equals(ImageSize.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class), (ImageSize) e, z, map, set));
        } else if (superclass.equals(Intercom.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_IntercomRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_IntercomRealmProxy.IntercomColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class), (Intercom) e, z, map, set));
        } else if (superclass.equals(IntercomVal.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_IntercomValRealmProxy.IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class), (IntercomVal) e, z, map, set));
        } else if (superclass.equals(Mortrage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MortrageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MortrageRealmProxy.MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class), (Mortrage) e, z, map, set));
        } else if (superclass.equals(PassCard.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PassCardRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PassCardRealmProxy.PassCardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class), (PassCard) e, z, map, set));
        } else if (superclass.equals(PassCardUno.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.PassCardUnoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class), (PassCardUno) e, z, map, set));
        } else if (superclass.equals(Price.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PriceRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PriceRealmProxy.PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class), (Price) e, z, map, set));
        } else if (superclass.equals(Apartment.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), (Apartment) e, z, map, set));
        } else if (superclass.equals(SipOpenDoorParam.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class), (SipOpenDoorParam) e, z, map, set));
        } else if (superclass.equals(SipParametrs.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.SipParametrsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class), (SipParametrs) e, z, map, set));
        } else if (superclass.equals(SipPreviewParams.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class), (SipPreviewParams) e, z, map, set));
        } else if (superclass.equals(Size.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SizeRealmProxy.SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class), (Size) e, z, map, set));
        } else if (superclass.equals(UnreadBadge.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.UnreadBadgeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UnreadBadge.class), (UnreadBadge) e, z, map, set));
        } else if (superclass.equals(FavoriteBeacon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.FavoriteBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FavoriteBeacon.class), (FavoriteBeacon) e, z, map, set));
        } else if (superclass.equals(DeviceModel.class)) {
            return (RealmModel) superclass.cast(C4637x5b79bd5a.copyOrUpdate(realm, (C4637x5b79bd5a.DeviceModelColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class), (DeviceModel) e, z, map, set));
        } else if (superclass.equals(SignalRemote.class)) {
            return (RealmModel) superclass.cast(C4639x6ab32465.copyOrUpdate(realm, (C4639x6ab32465.SignalRemoteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class), (SignalRemote) e, z, map, set));
        } else if (superclass.equals(Hardware.class)) {
            return (RealmModel) superclass.cast(C4642xba9ad755.copyOrUpdate(realm, (C4642xba9ad755.HardwareColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Hardware.class), (Hardware) e, z, map, set));
        } else if (superclass.equals(HardwareSignal.class)) {
            return (RealmModel) superclass.cast(C4644x8f0def9d.copyOrUpdate(realm, (C4644x8f0def9d.HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class), (HardwareSignal) e, z, map, set));
        } else if (superclass.equals(ManagementType.class)) {
            return (RealmModel) superclass.cast(C4646xa509baca.copyOrUpdate(realm, (C4646xa509baca.ManagementTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagementType.class), (ManagementType) e, z, map, set));
        } else if (superclass.equals(RoomInfo.class)) {
            return (RealmModel) superclass.cast(C4648x51014856.copyOrUpdate(realm, (C4648x51014856.RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class), (RoomInfo) e, z, map, set));
        } else if (superclass.equals(Intellect.class)) {
            return (RealmModel) superclass.cast(C4650xa7ebbdf7.copyOrUpdate(realm, (C4650xa7ebbdf7.IntellectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class), (Intellect) e, z, map, set));
        } else if (superclass.equals(AudioUrl.class)) {
            return (RealmModel) superclass.cast(C4652xadba3b3e.copyOrUpdate(realm, (C4652xadba3b3e.AudioUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class), (AudioUrl) e, z, map, set));
        } else if (superclass.equals(Scenario.class)) {
            return (RealmModel) superclass.cast(C4654x9b0b7455.copyOrUpdate(realm, (C4654x9b0b7455.ScenarioColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class), (Scenario) e, z, map, set));
        } else if (superclass.equals(State.class)) {
            return (RealmModel) superclass.cast(C4656xbdeaa6ca.copyOrUpdate(realm, (C4656xbdeaa6ca.StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class), (State) e, z, map, set));
        } else if (superclass.equals(DialogButtons.class)) {
            return (RealmModel) superclass.cast(C4658x6180a4a3.copyOrUpdate(realm, (C4658x6180a4a3.DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class), (DialogButtons) e, z, map, set));
        } else if (superclass.equals(Guard.class)) {
            return (RealmModel) superclass.cast(C4660xccbea62f.copyOrUpdate(realm, (C4660xccbea62f.GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class), (Guard) e, z, map, set));
        } else if (superclass.equals(MinVersion.class)) {
            return (RealmModel) superclass.cast(C4662xc0a23e3a.copyOrUpdate(realm, (C4662xc0a23e3a.MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class), (MinVersion) e, z, map, set));
        } else if (superclass.equals(Schema.class)) {
            return (RealmModel) superclass.cast(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), (Schema) e, z, map, set));
        } else if (superclass.equals(SchemaCallback.class)) {
            return (RealmModel) superclass.cast(C4664x5395ce9a.copyOrUpdate(realm, (C4664x5395ce9a.SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class), (SchemaCallback) e, z, map, set));
        } else if (superclass.equals(SchemaItem.class)) {
            return (RealmModel) superclass.cast(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), (SchemaItem) e, z, map, set));
        } else if (superclass.equals(Services.class)) {
            return (RealmModel) superclass.cast(C4672xd5d6cbb2.copyOrUpdate(realm, (C4672xd5d6cbb2.ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class), (Services) e, z, map, set));
        } else if (superclass.equals(Token.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.TokenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class), (Token) e, z, map, set));
        } else if (superclass.equals(Device.class)) {
            return (RealmModel) superclass.cast(C4676xf1982dca.copyOrUpdate(realm, (C4676xf1982dca.DeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class), (Device) e, z, map, set));
        } else if (superclass.equals(ClassDevice.class)) {
            return (RealmModel) superclass.cast(C4678x5ab6ac5f.copyOrUpdate(realm, (C4678x5ab6ac5f.ClassDeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class), (ClassDevice) e, z, map, set));
        } else if (superclass.equals(BMSInfo.class)) {
            return (RealmModel) superclass.cast(C4680x20fc7e06.copyOrUpdate(realm, (C4680x20fc7e06.BMSInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class), (BMSInfo) e, z, map, set));
        } else if (superclass.equals(Devices.class)) {
            return (RealmModel) superclass.cast(C4684xaab8a0b.copyOrUpdate(realm, (C4684xaab8a0b.DevicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class), (Devices) e, z, map, set));
        } else if (superclass.equals(FilesUrl.class)) {
            return (RealmModel) superclass.cast(C4686xbd7f885e.copyOrUpdate(realm, (C4686xbd7f885e.FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class), (FilesUrl) e, z, map, set));
        } else if (superclass.equals(ServiceData.class)) {
            return (RealmModel) superclass.cast(C4688xf4020777.copyOrUpdate(realm, (C4688xf4020777.ServiceDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class), (ServiceData) e, z, map, set));
        } else if (superclass.equals(ServiceFieldItems.class)) {
            return (RealmModel) superclass.cast(C4690x83bb1d33.copyOrUpdate(realm, (C4690x83bb1d33.ServiceFieldItemsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFieldItems.class), (ServiceFieldItems) e, z, map, set));
        } else if (superclass.equals(ServiceStatus.class)) {
            return (RealmModel) superclass.cast(C4692x82b5a23f.copyOrUpdate(realm, (C4692x82b5a23f.ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class), (ServiceStatus) e, z, map, set));
        } else if (superclass.equals(DomServiceCategory.class)) {
            return (RealmModel) superclass.cast(C4694x8588f9e4.copyOrUpdate(realm, (C4694x8588f9e4.DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class), (DomServiceCategory) e, z, map, set));
        } else if (superclass.equals(DomServiceIndicator.class)) {
            return (RealmModel) superclass.cast(C4696x936db447.copyOrUpdate(realm, (C4696x936db447.DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class), (DomServiceIndicator) e, z, map, set));
        } else if (superclass.equals(DomServicesList.class)) {
            return (RealmModel) superclass.cast(C4700xb5dd9409.copyOrUpdate(realm, (C4700xb5dd9409.DomServicesListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class), (DomServicesList) e, z, map, set));
        } else if (superclass.equals(DomServiceTariff.class)) {
            return (RealmModel) superclass.cast(C4698x9da95c4a.copyOrUpdate(realm, (C4698x9da95c4a.DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class), (DomServiceTariff) e, z, map, set));
        } else if (superclass.equals(ServiceFile.class)) {
            return (RealmModel) superclass.cast(C4702x12a70883.copyOrUpdate(realm, (C4702x12a70883.ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class), (ServiceFile) e, z, map, set));
        } else if (superclass.equals(ServiceMessages.class)) {
            return (RealmModel) superclass.cast(C4704x27ddec53.copyOrUpdate(realm, (C4704x27ddec53.ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class), (ServiceMessages) e, z, map, set));
        } else if (superclass.equals(ServiceTicket.class)) {
            return (RealmModel) superclass.cast(C4706xcf10b813.copyOrUpdate(realm, (C4706xcf10b813.ServiceTicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class), (ServiceTicket) e, z, map, set));
        } else if (superclass.equals(ServiceTicketType.class)) {
            return (RealmModel) superclass.cast(C4708x7c8648ed.copyOrUpdate(realm, (C4708x7c8648ed.ServiceTicketTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class), (ServiceTicketType) e, z, map, set));
        } else if (superclass.equals(TicketAccountsList.class)) {
            return (RealmModel) superclass.cast(C4710x379415fc.copyOrUpdate(realm, (C4710x379415fc.TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class), (TicketAccountsList) e, z, map, set));
        } else if (superclass.equals(TicketApartment.class)) {
            return (RealmModel) superclass.cast(C4712x67ea0478.copyOrUpdate(realm, (C4712x67ea0478.TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class), (TicketApartment) e, z, map, set));
        } else if (superclass.equals(TicketApplicant.class)) {
            return (RealmModel) superclass.cast(C4714x6f4f4848.copyOrUpdate(realm, (C4714x6f4f4848.TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class), (TicketApplicant) e, z, map, set));
        } else if (superclass.equals(TicketChatData.class)) {
            return (RealmModel) superclass.cast(C4716x3c51d27a.copyOrUpdate(realm, (C4716x3c51d27a.TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class), (TicketChatData) e, z, map, set));
        } else if (superclass.equals(TicketInfo.class)) {
            return (RealmModel) superclass.cast(C4718xb56c6186.copyOrUpdate(realm, (C4718xb56c6186.TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class), (TicketInfo) e, z, map, set));
        } else if (superclass.equals(TicketObject.class)) {
            return (RealmModel) superclass.cast(C4720x13bb7c97.copyOrUpdate(realm, (C4720x13bb7c97.TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class), (TicketObject) e, z, map, set));
        } else if (superclass.equals(TicketPerformer.class)) {
            return (RealmModel) superclass.cast(C4722x782e3a14.copyOrUpdate(realm, (C4722x782e3a14.TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class), (TicketPerformer) e, z, map, set));
        } else if (superclass.equals(TicketRating.class)) {
            return (RealmModel) superclass.cast(C4724xb050ad75.copyOrUpdate(realm, (C4724xb050ad75.TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class), (TicketRating) e, z, map, set));
        } else if (superclass.equals(Tickets.class)) {
            return (RealmModel) superclass.cast(C4730xd31c9f99.copyOrUpdate(realm, (C4730xd31c9f99.TicketsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class), (Tickets) e, z, map, set));
        } else if (superclass.equals(TicketState.class)) {
            return (RealmModel) superclass.cast(C4726x470e297.copyOrUpdate(realm, (C4726x470e297.TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class), (TicketState) e, z, map, set));
        } else if (superclass.equals(TicketUrgency.class)) {
            return (RealmModel) superclass.cast(C4728x7291458f.copyOrUpdate(realm, (C4728x7291458f.TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class), (TicketUrgency) e, z, map, set));
        } else if (superclass.equals(Rooms.class)) {
            return (RealmModel) superclass.cast(C4732xd254b890.copyOrUpdate(realm, (C4732xd254b890.RoomsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rooms.class), (Rooms) e, z, map, set));
        } else if (superclass.equals(MoreIconsInfo.class)) {
            return (RealmModel) superclass.cast(C4734x3e5f4d91.copyOrUpdate(realm, (C4734x3e5f4d91.MoreIconsInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class), (MoreIconsInfo) e, z, map, set));
        } else if (superclass.equals(ActualCountersData.class)) {
            return (RealmModel) superclass.cast(C4736x16a117c0.copyOrUpdate(realm, (C4736x16a117c0.ActualCountersDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class), (ActualCountersData) e, z, map, set));
        } else if (superclass.equals(RentCompany.class)) {
            return (RealmModel) superclass.cast(C4738x3e33c9bd.copyOrUpdate(realm, (C4738x3e33c9bd.RentCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class), (RentCompany) e, z, map, set));
        } else if (superclass.equals(AttrRenta.class)) {
            return (RealmModel) superclass.cast(C4740x60e6319b.copyOrUpdate(realm, (C4740x60e6319b.AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class), (AttrRenta) e, z, map, set));
        } else if (superclass.equals(PropertyRenta.class)) {
            return (RealmModel) superclass.cast(C4742xdc63beb7.copyOrUpdate(realm, (C4742xdc63beb7.PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), (PropertyRenta) e, z, map, set));
        } else if (superclass.equals(RentAttribute.class)) {
            return (RealmModel) superclass.cast(C4744xe660f6a7.copyOrUpdate(realm, (C4744xe660f6a7.RentAttributeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class), (RentAttribute) e, z, map, set));
        } else if (superclass.equals(RentInfo.class)) {
            return (RealmModel) superclass.cast(C4748x5c024f21.copyOrUpdate(realm, (C4748x5c024f21.RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class), (RentInfo) e, z, map, set));
        } else if (superclass.equals(RentInfoObject.class)) {
            return (RealmModel) superclass.cast(C4746x72770240.copyOrUpdate(realm, (C4746x72770240.RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class), (RentInfoObject) e, z, map, set));
        } else if (superclass.equals(RentPermissions.class)) {
            return (RealmModel) superclass.cast(C4750xebfdbb8f.copyOrUpdate(realm, (C4750xebfdbb8f.RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class), (RentPermissions) e, z, map, set));
        } else if (superclass.equals(RentType.class)) {
            return (RealmModel) superclass.cast(C4754xcc2cbaad.copyOrUpdate(realm, (C4754xcc2cbaad.RentTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class), (RentType) e, z, map, set));
        } else if (superclass.equals(RentTypeAttr.class)) {
            return (RealmModel) superclass.cast(C4752xf2aa007e.copyOrUpdate(realm, (C4752xf2aa007e.RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class), (RentTypeAttr) e, z, map, set));
        } else if (superclass.equals(StateRenta.class)) {
            return (RealmModel) superclass.cast(C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), (StateRenta) e, z, map, set));
        } else if (superclass.equals(TimeSlotHuman.class)) {
            return (RealmModel) superclass.cast(C4758xdaf4d606.copyOrUpdate(realm, (C4758xdaf4d606.TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class), (TimeSlotHuman) e, z, map, set));
        } else if (superclass.equals(TimeSlotHumanValue.class)) {
            return (RealmModel) superclass.cast(C4760xfaafb8e9.copyOrUpdate(realm, (C4760xfaafb8e9.TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class), (TimeSlotHumanValue) e, z, map, set));
        } else if (superclass.equals(TypeRent.class)) {
            return (RealmModel) superclass.cast(C4762x65e9722d.copyOrUpdate(realm, (C4762x65e9722d.TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class), (TypeRent) e, z, map, set));
        } else if (superclass.equals(ManagePermissions.class)) {
            return (RealmModel) superclass.cast(C4764xd43a5daf.copyOrUpdate(realm, (C4764xd43a5daf.ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), (ManagePermissions) e, z, map, set));
        } else if (superclass.equals(Rent.class)) {
            return (RealmModel) superclass.cast(C4768x32c48847.copyOrUpdate(realm, (C4768x32c48847.RentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class), (Rent) e, z, map, set));
        } else if (superclass.equals(RentChildren.class)) {
            return (RealmModel) superclass.cast(C4766x7a38e7a6.copyOrUpdate(realm, (C4766x7a38e7a6.RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class), (RentChildren) e, z, map, set));
        } else if (superclass.equals(Renters.class)) {
            return (RealmModel) superclass.cast(C4772xa5d8f71d.copyOrUpdate(realm, (C4772xa5d8f71d.RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), (Renters) e, z, map, set));
        } else if (superclass.equals(RentState.class)) {
            return (RealmModel) superclass.cast(C4770xc85b1268.copyOrUpdate(realm, (C4770xc85b1268.RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class), (RentState) e, z, map, set));
        } else if (superclass.equals(TalkingInfo.class)) {
            return (RealmModel) superclass.cast(C4774x33c567d4.copyOrUpdate(realm, (C4774x33c567d4.TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class), (TalkingInfo) e, z, map, set));
        } else if (superclass.equals(TalkingPhotos.class)) {
            return (RealmModel) superclass.cast(C4778x8713e227.copyOrUpdate(realm, (C4778x8713e227.TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class), (TalkingPhotos) e, z, map, set));
        } else if (superclass.equals(TalkingPhotosFile.class)) {
            return (RealmModel) superclass.cast(C4776x6ae644c3.copyOrUpdate(realm, (C4776x6ae644c3.TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), (TalkingPhotosFile) e, z, map, set));
        } else if (superclass.equals(RentAttributes.class)) {
            return (RealmModel) superclass.cast(C4794x165b0474.copyOrUpdate(realm, (C4794x165b0474.RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class), (RentAttributes) e, z, map, set));
        } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
            return (RealmModel) superclass.cast(C4798x7bd56e2e.copyOrUpdate(realm, (C4798x7bd56e2e.ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class), (ApartmentScenarioOptionAdd) e, z, map, set));
        } else if (superclass.equals(Options.class)) {
            return (RealmModel) superclass.cast(C4802x9a8f8638.copyOrUpdate(realm, (C4802x9a8f8638.OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class), (Options) e, z, map, set));
        } else if (superclass.equals(OptionsList.class)) {
            return (RealmModel) superclass.cast(C4800x8b5430f6.copyOrUpdate(realm, (C4800x8b5430f6.OptionsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class), (OptionsList) e, z, map, set));
        } else if (superclass.equals(Ticket.class)) {
            return (RealmModel) superclass.cast(C4808x39dc6d46.copyOrUpdate(realm, (C4808x39dc6d46.TicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class), (Ticket) e, z, map, set));
        } else if (superclass.equals(TicketDescription.class)) {
            return (RealmModel) superclass.cast(C4804xd885bb4.copyOrUpdate(realm, (C4804xd885bb4.TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class), (TicketDescription) e, z, map, set));
        } else if (superclass.equals(TicketDetail.class)) {
            return (RealmModel) superclass.cast(C4806xa0f8f737.copyOrUpdate(realm, (C4806xa0f8f737.TicketDetailColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class), (TicketDetail) e, z, map, set));
        } else if (superclass.equals(VideoDates.class)) {
            return (RealmModel) superclass.cast(C4810xdea6d8e5.copyOrUpdate(realm, (C4810xdea6d8e5.VideoDatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class), (VideoDates) e, z, map, set));
        } else if (superclass.equals(VideoEvents.class)) {
            return (RealmModel) superclass.cast(C4814x4a38c7d7.copyOrUpdate(realm, (C4814x4a38c7d7.VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class), (VideoEvents) e, z, map, set));
        } else if (superclass.equals(VideoEventsList.class)) {
            return (RealmModel) superclass.cast(C4812xdb358b15.copyOrUpdate(realm, (C4812xdb358b15.VideoEventsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class), (VideoEventsList) e, z, map, set));
        } else if (superclass.equals(VideoUrl.class)) {
            return (RealmModel) superclass.cast(C4816xc56fdf8f.copyOrUpdate(realm, (C4816xc56fdf8f.VideoUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class), (VideoUrl) e, z, map, set));
        } else {
            throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
    }

    public void insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(AvailablePassType.class)) {
            ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insert(realm, (AvailablePassType) realmModel, map);
        } else if (superclass.equals(BleKeyData.class)) {
            ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insert(realm, (BleKeyData) realmModel, map);
        } else if (superclass.equals(BleReader.class)) {
            ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insert(realm, (BleReader) realmModel, map);
        } else if (superclass.equals(RentConfirmCodeData.class)) {
            C4591x4d164271.insert(realm, (RentConfirmCodeData) realmModel, map);
        } else if (superclass.equals(RentConfirmCodeResponse.class)) {
            C4593x1ca69248.insert(realm, (RentConfirmCodeResponse) realmModel, map);
        } else if (superclass.equals(RedeemCodeResponseData.class)) {
            C4595x5d0db86d.insert(realm, (RedeemCodeResponseData) realmModel, map);
        } else if (superclass.equals(SubAccount.class)) {
            ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm, (SubAccount) realmModel, map);
        } else if (superclass.equals(Author.class)) {
            ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insert(realm, (Author) realmModel, map);
        } else if (superclass.equals(QrCodeForSave.class)) {
            ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insert(realm, (QrCodeForSave) realmModel, map);
        } else if (superclass.equals(AcceptanceDate.class)) {
            ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insert(realm, (AcceptanceDate) realmModel, map);
        } else if (superclass.equals(Address.class)) {
            ru_unicorn_ujin_data_realm_AddressRealmProxy.insert(realm, (Address) realmModel, map);
        } else if (superclass.equals(ApartmentState.class)) {
            ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insert(realm, (ApartmentState) realmModel, map);
        } else if (superclass.equals(Bank.class)) {
            ru_unicorn_ujin_data_realm_BankRealmProxy.insert(realm, (Bank) realmModel, map);
        } else if (superclass.equals(Building.class)) {
            ru_unicorn_ujin_data_realm_BuildingRealmProxy.insert(realm, (Building) realmModel, map);
        } else if (superclass.equals(Camera.class)) {
            ru_unicorn_ujin_data_realm_CameraRealmProxy.insert(realm, (Camera) realmModel, map);
        } else if (superclass.equals(CompanyApplication.class)) {
            ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insert(realm, (CompanyApplication) realmModel, map);
        } else if (superclass.equals(EnterpriseApplication.class)) {
            C4601xb6361989.insert(realm, (EnterpriseApplication) realmModel, map);
        } else if (superclass.equals(ContextBanner.class)) {
            ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insert(realm, (ContextBanner) realmModel, map);
        } else if (superclass.equals(Feature.class)) {
            ru_unicorn_ujin_data_realm_FeatureRealmProxy.insert(realm, (Feature) realmModel, map);
        } else if (superclass.equals(FileData.class)) {
            ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm, (FileData) realmModel, map);
        } else if (superclass.equals(FileMeta.class)) {
            ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insert(realm, (FileMeta) realmModel, map);
        } else if (superclass.equals(FlatButtons.class)) {
            ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insert(realm, (FlatButtons) realmModel, map);
        } else if (superclass.equals(Layout.class)) {
            ru_unicorn_ujin_data_realm_LayoutRealmProxy.insert(realm, (Layout) realmModel, map);
        } else if (superclass.equals(Banner.class)) {
            ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insert(realm, (Banner) realmModel, map);
        } else if (superclass.equals(CartCompany.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insert(realm, (CartCompany) realmModel, map);
        } else if (superclass.equals(CartItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insert(realm, (CartItem) realmModel, map);
        } else if (superclass.equals(CartOffer.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insert(realm, (CartOffer) realmModel, map);
        } else if (superclass.equals(CartTotal.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insert(realm, (CartTotal) realmModel, map);
        } else if (superclass.equals(Category.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insert(realm, (Category) realmModel, map);
        } else if (superclass.equals(CategoryItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insert(realm, (CategoryItem) realmModel, map);
        } else if (superclass.equals(Comment.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insert(realm, (Comment) realmModel, map);
        } else if (superclass.equals(Company.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insert(realm, (Company) realmModel, map);
        } else if (superclass.equals(CompanyContact.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insert(realm, (CompanyContact) realmModel, map);
        } else if (superclass.equals(Component.class)) {
            ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insert(realm, (Component) realmModel, map);
        } else if (superclass.equals(Coupon.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insert(realm, (Coupon) realmModel, map);
        } else if (superclass.equals(CouponImage.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insert(realm, (CouponImage) realmModel, map);
        } else if (superclass.equals(Field.class)) {
            ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insert(realm, (Field) realmModel, map);
        } else if (superclass.equals(Offer.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insert(realm, (Offer) realmModel, map);
        } else if (superclass.equals(Order.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insert(realm, (Order) realmModel, map);
        } else if (superclass.equals(OrderAction.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insert(realm, (OrderAction) realmModel, map);
        } else if (superclass.equals(OrderItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insert(realm, (OrderItem) realmModel, map);
        } else if (superclass.equals(Parameter.class)) {
            ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insert(realm, (Parameter) realmModel, map);
        } else if (superclass.equals(PreviewImage.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insert(realm, (PreviewImage) realmModel, map);
        } else if (superclass.equals(Promotion.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insert(realm, (Promotion) realmModel, map);
        } else if (superclass.equals(Property.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insert(realm, (Property) realmModel, map);
        } else if (superclass.equals(RedeemedCode.class)) {
            ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm, (RedeemedCode) realmModel, map);
        } else if (superclass.equals(RedeemedCodeDate.class)) {
            C4620xe7ed888c.insert(realm, (RedeemedCodeDate) realmModel, map);
        } else if (superclass.equals(SampleWork.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insert(realm, (SampleWork) realmModel, map);
        } else if (superclass.equals(SearchItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insert(realm, (SearchItem) realmModel, map);
        } else if (superclass.equals(SelectValue.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insert(realm, (SelectValue) realmModel, map);
        } else if (superclass.equals(Tag.class)) {
            ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insert(realm, (Tag) realmModel, map);
        } else if (superclass.equals(Meta.class)) {
            ru_unicorn_ujin_data_realm_MetaRealmProxy.insert(realm, (Meta) realmModel, map);
        } else if (superclass.equals(MyBeacon.class)) {
            ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insert(realm, (MyBeacon) realmModel, map);
        } else if (superclass.equals(News.class)) {
            ru_unicorn_ujin_data_realm_NewsRealmProxy.insert(realm, (News) realmModel, map);
        } else if (superclass.equals(Notification.class)) {
            ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insert(realm, (Notification) realmModel, map);
        } else if (superclass.equals(NotificationData.class)) {
            C4626xe255e1e5.insert(realm, (NotificationData) realmModel, map);
        } else if (superclass.equals(Pamyatka.class)) {
            ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insert(realm, (Pamyatka) realmModel, map);
        } else if (superclass.equals(Point.class)) {
            ru_unicorn_ujin_data_realm_PointRealmProxy.insert(realm, (Point) realmModel, map);
        } else if (superclass.equals(ApartmentRequest.class)) {
            ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insert(realm, (ApartmentRequest) realmModel, map);
        } else if (superclass.equals(DemoUser.class)) {
            ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insert(realm, (DemoUser) realmModel, map);
        } else if (superclass.equals(RentBuilding.class)) {
            ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insert(realm, (RentBuilding) realmModel, map);
        } else if (superclass.equals(RentBuildingAddress.class)) {
            ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insert(realm, (RentBuildingAddress) realmModel, map);
        } else if (superclass.equals(RentComplex.class)) {
            ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insert(realm, (RentComplex) realmModel, map);
        } else if (superclass.equals(RentObject.class)) {
            ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insert(realm, (RentObject) realmModel, map);
        } else if (superclass.equals(RentObjectBuilding.class)) {
            ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insert(realm, (RentObjectBuilding) realmModel, map);
        } else if (superclass.equals(User.class)) {
            ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insert(realm, (User) realmModel, map);
        } else if (superclass.equals(ProviderCity.class)) {
            ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insert(realm, (ProviderCity) realmModel, map);
        } else if (superclass.equals(RealmString.class)) {
            ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insert(realm, (RealmString) realmModel, map);
        } else if (superclass.equals(Splashscreen.class)) {
            ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insert(realm, (Splashscreen) realmModel, map);
        } else if (superclass.equals(TimeSlot.class)) {
            ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insert(realm, (TimeSlot) realmModel, map);
        } else if (superclass.equals(Wifi.class)) {
            ru_unicorn_ujin_data_realm_WifiRealmProxy.insert(realm, (Wifi) realmModel, map);
        } else if (superclass.equals(AllTicketDataInX.class)) {
            ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insert(realm, (AllTicketDataInX) realmModel, map);
        } else if (superclass.equals(TicketDataInX.class)) {
            ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insert(realm, (TicketDataInX) realmModel, map);
        } else if (superclass.equals(Schemas.class)) {
            C4670xfcd8d37c.insert(realm, (Schemas) realmModel, map);
        } else if (superclass.equals(C5788Video.class)) {
            C4674x1c4fffad.insert(realm, (C5788Video) realmModel, map);
        } else if (superclass.equals(ProfileAdress.class)) {
            C4682xb8d394dd.insert(realm, (ProfileAdress) realmModel, map);
        } else if (superclass.equals(ProfileData.class)) {
            C4780xf0c1c3b9.insert(realm, (ProfileData) realmModel, map);
        } else if (superclass.equals(UserCompany.class)) {
            C4782x594eae38.insert(realm, (UserCompany) realmModel, map);
        } else if (superclass.equals(UserData.class)) {
            C4784x85418d2d.insert(realm, (UserData) realmModel, map);
        } else if (superclass.equals(UserProfile.class)) {
            C4786xba887464.insert(realm, (UserProfile) realmModel, map);
        } else if (superclass.equals(UserVehicle.class)) {
            C4788xc3a2b227.insert(realm, (UserVehicle) realmModel, map);
        } else if (superclass.equals(ContactData.class)) {
            C4792xa984038c.insert(realm, (ContactData) realmModel, map);
        } else if (superclass.equals(ContactDataList.class)) {
            C4790xe661e44a.insert(realm, (ContactDataList) realmModel, map);
        } else if (superclass.equals(TicketPropertyObject.class)) {
            C4796x4009dee4.insert(realm, (TicketPropertyObject) realmModel, map);
        } else if (superclass.equals(Appointment.class)) {
            C4818xb7a5caf9.insert(realm, (Appointment) realmModel, map);
        } else if (superclass.equals(ExecutorsIn.class)) {
            C4820x447e431f.insert(realm, (ExecutorsIn) realmModel, map);
        } else if (superclass.equals(FromUser.class)) {
            C4822xab1ed299.insert(realm, (FromUser) realmModel, map);
        } else if (superclass.equals(Status.class)) {
            C4824xe6f53cf6.insert(realm, (Status) realmModel, map);
        } else if (superclass.equals(ToUser.class)) {
            C4826x725684ea.insert(realm, (ToUser) realmModel, map);
        } else if (superclass.equals(BusinessBuildings.class)) {
            C4830x6d8ab071.insert(realm, (BusinessBuildings) realmModel, map);
        } else if (superclass.equals(BusinessBuildingsList.class)) {
            C4828xbbcd96af.insert(realm, (BusinessBuildingsList) realmModel, map);
        } else if (superclass.equals(BusinessCenterDTO.class)) {
            C4832x38c73bbc.insert(realm, (BusinessCenterDTO) realmModel, map);
        } else if (superclass.equals(CityDTO.class)) {
            C4834x9fbcbe06.insert(realm, (CityDTO) realmModel, map);
        } else if (superclass.equals(SearchBuildingDTO.class)) {
            C4836xc7389ad5.insert(realm, (SearchBuildingDTO) realmModel, map);
        } else if (superclass.equals(SearchComplex.class)) {
            C4838xc3cde83a.insert(realm, (SearchComplex) realmModel, map);
        } else if (superclass.equals(Action.class)) {
            ru_unicorn_ujin_data_realm_ActionRealmProxy.insert(realm, (Action) realmModel, map);
        } else if (superclass.equals(BeaconAction.class)) {
            ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insert(realm, (BeaconAction) realmModel, map);
        } else if (superclass.equals(BeaconActionDescription.class)) {
            ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm, (BeaconActionDescription) realmModel, map);
        } else if (superclass.equals(CardAdress.class)) {
            ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insert(realm, (CardAdress) realmModel, map);
        } else if (superclass.equals(CardData.class)) {
            ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, (CardData) realmModel, map);
        } else if (superclass.equals(Chat.class)) {
            ru_unicorn_ujin_data_realm_ChatRealmProxy.insert(realm, (Chat) realmModel, map);
        } else if (superclass.equals(ChatListResponseData.class)) {
            ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insert(realm, (ChatListResponseData) realmModel, map);
        } else if (superclass.equals(City.class)) {
            ru_unicorn_ujin_data_realm_CityRealmProxy.insert(realm, (City) realmModel, map);
        } else if (superclass.equals(CityTitle.class)) {
            ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insert(realm, (CityTitle) realmModel, map);
        } else if (superclass.equals(Complex.class)) {
            ru_unicorn_ujin_data_realm_ComplexRealmProxy.insert(realm, (Complex) realmModel, map);
        } else if (superclass.equals(ComplexInfo.class)) {
            ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insert(realm, (ComplexInfo) realmModel, map);
        } else if (superclass.equals(Coordinates.class)) {
            ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm, (Coordinates) realmModel, map);
        } else if (superclass.equals(Favourite.class)) {
            ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insert(realm, (Favourite) realmModel, map);
        } else if (superclass.equals(Flat.class)) {
            ru_unicorn_ujin_data_realm_FlatRealmProxy.insert(realm, (Flat) realmModel, map);
        } else if (superclass.equals(FlatInfo.class)) {
            ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insert(realm, (FlatInfo) realmModel, map);
        } else if (superclass.equals(GetFlatsResponseData.class)) {
            ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insert(realm, (GetFlatsResponseData) realmModel, map);
        } else if (superclass.equals(ImageData.class)) {
            ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm, (ImageData) realmModel, map);
        } else if (superclass.equals(ImageSize.class)) {
            ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insert(realm, (ImageSize) realmModel, map);
        } else if (superclass.equals(Intercom.class)) {
            ru_unicorn_ujin_data_realm_IntercomRealmProxy.insert(realm, (Intercom) realmModel, map);
        } else if (superclass.equals(IntercomVal.class)) {
            ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insert(realm, (IntercomVal) realmModel, map);
        } else if (superclass.equals(Mortrage.class)) {
            ru_unicorn_ujin_data_realm_MortrageRealmProxy.insert(realm, (Mortrage) realmModel, map);
        } else if (superclass.equals(PassCard.class)) {
            ru_unicorn_ujin_data_realm_PassCardRealmProxy.insert(realm, (PassCard) realmModel, map);
        } else if (superclass.equals(PassCardUno.class)) {
            ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insert(realm, (PassCardUno) realmModel, map);
        } else if (superclass.equals(Price.class)) {
            ru_unicorn_ujin_data_realm_PriceRealmProxy.insert(realm, (Price) realmModel, map);
        } else if (superclass.equals(Apartment.class)) {
            ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm, (Apartment) realmModel, map);
        } else if (superclass.equals(SipOpenDoorParam.class)) {
            ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insert(realm, (SipOpenDoorParam) realmModel, map);
        } else if (superclass.equals(SipParametrs.class)) {
            ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insert(realm, (SipParametrs) realmModel, map);
        } else if (superclass.equals(SipPreviewParams.class)) {
            ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insert(realm, (SipPreviewParams) realmModel, map);
        } else if (superclass.equals(Size.class)) {
            ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm, (Size) realmModel, map);
        } else if (superclass.equals(UnreadBadge.class)) {
            ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insert(realm, (UnreadBadge) realmModel, map);
        } else if (superclass.equals(FavoriteBeacon.class)) {
            ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insert(realm, (FavoriteBeacon) realmModel, map);
        } else if (superclass.equals(DeviceModel.class)) {
            C4637x5b79bd5a.insert(realm, (DeviceModel) realmModel, map);
        } else if (superclass.equals(SignalRemote.class)) {
            C4639x6ab32465.insert(realm, (SignalRemote) realmModel, map);
        } else if (superclass.equals(Hardware.class)) {
            C4642xba9ad755.insert(realm, (Hardware) realmModel, map);
        } else if (superclass.equals(HardwareSignal.class)) {
            C4644x8f0def9d.insert(realm, (HardwareSignal) realmModel, map);
        } else if (superclass.equals(ManagementType.class)) {
            C4646xa509baca.insert(realm, (ManagementType) realmModel, map);
        } else if (superclass.equals(RoomInfo.class)) {
            C4648x51014856.insert(realm, (RoomInfo) realmModel, map);
        } else if (superclass.equals(Intellect.class)) {
            C4650xa7ebbdf7.insert(realm, (Intellect) realmModel, map);
        } else if (superclass.equals(AudioUrl.class)) {
            C4652xadba3b3e.insert(realm, (AudioUrl) realmModel, map);
        } else if (superclass.equals(Scenario.class)) {
            C4654x9b0b7455.insert(realm, (Scenario) realmModel, map);
        } else if (superclass.equals(State.class)) {
            C4656xbdeaa6ca.insert(realm, (State) realmModel, map);
        } else if (superclass.equals(DialogButtons.class)) {
            C4658x6180a4a3.insert(realm, (DialogButtons) realmModel, map);
        } else if (superclass.equals(Guard.class)) {
            C4660xccbea62f.insert(realm, (Guard) realmModel, map);
        } else if (superclass.equals(MinVersion.class)) {
            C4662xc0a23e3a.insert(realm, (MinVersion) realmModel, map);
        } else if (superclass.equals(Schema.class)) {
            C4668xcf375a75.insert(realm, (Schema) realmModel, map);
        } else if (superclass.equals(SchemaCallback.class)) {
            C4664x5395ce9a.insert(realm, (SchemaCallback) realmModel, map);
        } else if (superclass.equals(SchemaItem.class)) {
            C4666xdf5d9ae8.insert(realm, (SchemaItem) realmModel, map);
        } else if (superclass.equals(Services.class)) {
            C4672xd5d6cbb2.insert(realm, (Services) realmModel, map);
        } else if (superclass.equals(Token.class)) {
            ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insert(realm, (Token) realmModel, map);
        } else if (superclass.equals(Device.class)) {
            C4676xf1982dca.insert(realm, (Device) realmModel, map);
        } else if (superclass.equals(ClassDevice.class)) {
            C4678x5ab6ac5f.insert(realm, (ClassDevice) realmModel, map);
        } else if (superclass.equals(BMSInfo.class)) {
            C4680x20fc7e06.insert(realm, (BMSInfo) realmModel, map);
        } else if (superclass.equals(Devices.class)) {
            C4684xaab8a0b.insert(realm, (Devices) realmModel, map);
        } else if (superclass.equals(FilesUrl.class)) {
            C4686xbd7f885e.insert(realm, (FilesUrl) realmModel, map);
        } else if (superclass.equals(ServiceData.class)) {
            C4688xf4020777.insert(realm, (ServiceData) realmModel, map);
        } else if (superclass.equals(ServiceFieldItems.class)) {
            C4690x83bb1d33.insert(realm, (ServiceFieldItems) realmModel, map);
        } else if (superclass.equals(ServiceStatus.class)) {
            C4692x82b5a23f.insert(realm, (ServiceStatus) realmModel, map);
        } else if (superclass.equals(DomServiceCategory.class)) {
            C4694x8588f9e4.insert(realm, (DomServiceCategory) realmModel, map);
        } else if (superclass.equals(DomServiceIndicator.class)) {
            C4696x936db447.insert(realm, (DomServiceIndicator) realmModel, map);
        } else if (superclass.equals(DomServicesList.class)) {
            C4700xb5dd9409.insert(realm, (DomServicesList) realmModel, map);
        } else if (superclass.equals(DomServiceTariff.class)) {
            C4698x9da95c4a.insert(realm, (DomServiceTariff) realmModel, map);
        } else if (superclass.equals(ServiceFile.class)) {
            C4702x12a70883.insert(realm, (ServiceFile) realmModel, map);
        } else if (superclass.equals(ServiceMessages.class)) {
            C4704x27ddec53.insert(realm, (ServiceMessages) realmModel, map);
        } else if (superclass.equals(ServiceTicket.class)) {
            C4706xcf10b813.insert(realm, (ServiceTicket) realmModel, map);
        } else if (superclass.equals(ServiceTicketType.class)) {
            C4708x7c8648ed.insert(realm, (ServiceTicketType) realmModel, map);
        } else if (superclass.equals(TicketAccountsList.class)) {
            C4710x379415fc.insert(realm, (TicketAccountsList) realmModel, map);
        } else if (superclass.equals(TicketApartment.class)) {
            C4712x67ea0478.insert(realm, (TicketApartment) realmModel, map);
        } else if (superclass.equals(TicketApplicant.class)) {
            C4714x6f4f4848.insert(realm, (TicketApplicant) realmModel, map);
        } else if (superclass.equals(TicketChatData.class)) {
            C4716x3c51d27a.insert(realm, (TicketChatData) realmModel, map);
        } else if (superclass.equals(TicketInfo.class)) {
            C4718xb56c6186.insert(realm, (TicketInfo) realmModel, map);
        } else if (superclass.equals(TicketObject.class)) {
            C4720x13bb7c97.insert(realm, (TicketObject) realmModel, map);
        } else if (superclass.equals(TicketPerformer.class)) {
            C4722x782e3a14.insert(realm, (TicketPerformer) realmModel, map);
        } else if (superclass.equals(TicketRating.class)) {
            C4724xb050ad75.insert(realm, (TicketRating) realmModel, map);
        } else if (superclass.equals(Tickets.class)) {
            C4730xd31c9f99.insert(realm, (Tickets) realmModel, map);
        } else if (superclass.equals(TicketState.class)) {
            C4726x470e297.insert(realm, (TicketState) realmModel, map);
        } else if (superclass.equals(TicketUrgency.class)) {
            C4728x7291458f.insert(realm, (TicketUrgency) realmModel, map);
        } else if (superclass.equals(Rooms.class)) {
            C4732xd254b890.insert(realm, (Rooms) realmModel, map);
        } else if (superclass.equals(MoreIconsInfo.class)) {
            C4734x3e5f4d91.insert(realm, (MoreIconsInfo) realmModel, map);
        } else if (superclass.equals(ActualCountersData.class)) {
            C4736x16a117c0.insert(realm, (ActualCountersData) realmModel, map);
        } else if (superclass.equals(RentCompany.class)) {
            C4738x3e33c9bd.insert(realm, (RentCompany) realmModel, map);
        } else if (superclass.equals(AttrRenta.class)) {
            C4740x60e6319b.insert(realm, (AttrRenta) realmModel, map);
        } else if (superclass.equals(PropertyRenta.class)) {
            C4742xdc63beb7.insert(realm, (PropertyRenta) realmModel, map);
        } else if (superclass.equals(RentAttribute.class)) {
            C4744xe660f6a7.insert(realm, (RentAttribute) realmModel, map);
        } else if (superclass.equals(RentInfo.class)) {
            C4748x5c024f21.insert(realm, (RentInfo) realmModel, map);
        } else if (superclass.equals(RentInfoObject.class)) {
            C4746x72770240.insert(realm, (RentInfoObject) realmModel, map);
        } else if (superclass.equals(RentPermissions.class)) {
            C4750xebfdbb8f.insert(realm, (RentPermissions) realmModel, map);
        } else if (superclass.equals(RentType.class)) {
            C4754xcc2cbaad.insert(realm, (RentType) realmModel, map);
        } else if (superclass.equals(RentTypeAttr.class)) {
            C4752xf2aa007e.insert(realm, (RentTypeAttr) realmModel, map);
        } else if (superclass.equals(StateRenta.class)) {
            C4756x99acf311.insert(realm, (StateRenta) realmModel, map);
        } else if (superclass.equals(TimeSlotHuman.class)) {
            C4758xdaf4d606.insert(realm, (TimeSlotHuman) realmModel, map);
        } else if (superclass.equals(TimeSlotHumanValue.class)) {
            C4760xfaafb8e9.insert(realm, (TimeSlotHumanValue) realmModel, map);
        } else if (superclass.equals(TypeRent.class)) {
            C4762x65e9722d.insert(realm, (TypeRent) realmModel, map);
        } else if (superclass.equals(ManagePermissions.class)) {
            C4764xd43a5daf.insert(realm, (ManagePermissions) realmModel, map);
        } else if (superclass.equals(Rent.class)) {
            C4768x32c48847.insert(realm, (Rent) realmModel, map);
        } else if (superclass.equals(RentChildren.class)) {
            C4766x7a38e7a6.insert(realm, (RentChildren) realmModel, map);
        } else if (superclass.equals(Renters.class)) {
            C4772xa5d8f71d.insert(realm, (Renters) realmModel, map);
        } else if (superclass.equals(RentState.class)) {
            C4770xc85b1268.insert(realm, (RentState) realmModel, map);
        } else if (superclass.equals(TalkingInfo.class)) {
            C4774x33c567d4.insert(realm, (TalkingInfo) realmModel, map);
        } else if (superclass.equals(TalkingPhotos.class)) {
            C4778x8713e227.insert(realm, (TalkingPhotos) realmModel, map);
        } else if (superclass.equals(TalkingPhotosFile.class)) {
            C4776x6ae644c3.insert(realm, (TalkingPhotosFile) realmModel, map);
        } else if (superclass.equals(RentAttributes.class)) {
            C4794x165b0474.insert(realm, (RentAttributes) realmModel, map);
        } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
            C4798x7bd56e2e.insert(realm, (ApartmentScenarioOptionAdd) realmModel, map);
        } else if (superclass.equals(Options.class)) {
            C4802x9a8f8638.insert(realm, (Options) realmModel, map);
        } else if (superclass.equals(OptionsList.class)) {
            C4800x8b5430f6.insert(realm, (OptionsList) realmModel, map);
        } else if (superclass.equals(Ticket.class)) {
            C4808x39dc6d46.insert(realm, (Ticket) realmModel, map);
        } else if (superclass.equals(TicketDescription.class)) {
            C4804xd885bb4.insert(realm, (TicketDescription) realmModel, map);
        } else if (superclass.equals(TicketDetail.class)) {
            C4806xa0f8f737.insert(realm, (TicketDetail) realmModel, map);
        } else if (superclass.equals(VideoDates.class)) {
            C4810xdea6d8e5.insert(realm, (VideoDates) realmModel, map);
        } else if (superclass.equals(VideoEvents.class)) {
            C4814x4a38c7d7.insert(realm, (VideoEvents) realmModel, map);
        } else if (superclass.equals(VideoEventsList.class)) {
            C4812xdb358b15.insert(realm, (VideoEventsList) realmModel, map);
        } else if (superclass.equals(VideoUrl.class)) {
            C4816xc56fdf8f.insert(realm, (VideoUrl) realmModel, map);
        } else {
            throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
    }

    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            if (superclass.equals(AvailablePassType.class)) {
                ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insert(realm, (AvailablePassType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleKeyData.class)) {
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insert(realm, (BleKeyData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleReader.class)) {
                ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insert(realm, (BleReader) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeData.class)) {
                C4591x4d164271.insert(realm, (RentConfirmCodeData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeResponse.class)) {
                C4593x1ca69248.insert(realm, (RentConfirmCodeResponse) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemCodeResponseData.class)) {
                C4595x5d0db86d.insert(realm, (RedeemCodeResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SubAccount.class)) {
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm, (SubAccount) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Author.class)) {
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insert(realm, (Author) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(QrCodeForSave.class)) {
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insert(realm, (QrCodeForSave) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AcceptanceDate.class)) {
                ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insert(realm, (AcceptanceDate) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Address.class)) {
                ru_unicorn_ujin_data_realm_AddressRealmProxy.insert(realm, (Address) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentState.class)) {
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insert(realm, (ApartmentState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Bank.class)) {
                ru_unicorn_ujin_data_realm_BankRealmProxy.insert(realm, (Bank) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Building.class)) {
                ru_unicorn_ujin_data_realm_BuildingRealmProxy.insert(realm, (Building) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Camera.class)) {
                ru_unicorn_ujin_data_realm_CameraRealmProxy.insert(realm, (Camera) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyApplication.class)) {
                ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insert(realm, (CompanyApplication) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(EnterpriseApplication.class)) {
                C4601xb6361989.insert(realm, (EnterpriseApplication) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContextBanner.class)) {
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insert(realm, (ContextBanner) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Feature.class)) {
                ru_unicorn_ujin_data_realm_FeatureRealmProxy.insert(realm, (Feature) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileData.class)) {
                ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm, (FileData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileMeta.class)) {
                ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insert(realm, (FileMeta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatButtons.class)) {
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insert(realm, (FlatButtons) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Layout.class)) {
                ru_unicorn_ujin_data_realm_LayoutRealmProxy.insert(realm, (Layout) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Banner.class)) {
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insert(realm, (Banner) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartCompany.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insert(realm, (CartCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insert(realm, (CartItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartOffer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insert(realm, (CartOffer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartTotal.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insert(realm, (CartTotal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Category.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insert(realm, (Category) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CategoryItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insert(realm, (CategoryItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Comment.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insert(realm, (Comment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Company.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insert(realm, (Company) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyContact.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insert(realm, (CompanyContact) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Component.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insert(realm, (Component) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coupon.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insert(realm, (Coupon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CouponImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insert(realm, (CouponImage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Field.class)) {
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insert(realm, (Field) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Offer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insert(realm, (Offer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Order.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insert(realm, (Order) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderAction.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insert(realm, (OrderAction) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insert(realm, (OrderItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Parameter.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insert(realm, (Parameter) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PreviewImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insert(realm, (PreviewImage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Promotion.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insert(realm, (Promotion) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Property.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insert(realm, (Property) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCode.class)) {
                ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm, (RedeemedCode) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCodeDate.class)) {
                C4620xe7ed888c.insert(realm, (RedeemedCodeDate) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SampleWork.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insert(realm, (SampleWork) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insert(realm, (SearchItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SelectValue.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insert(realm, (SelectValue) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tag.class)) {
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insert(realm, (Tag) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Meta.class)) {
                ru_unicorn_ujin_data_realm_MetaRealmProxy.insert(realm, (Meta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MyBeacon.class)) {
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insert(realm, (MyBeacon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(News.class)) {
                ru_unicorn_ujin_data_realm_NewsRealmProxy.insert(realm, (News) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Notification.class)) {
                ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insert(realm, (Notification) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(NotificationData.class)) {
                C4626xe255e1e5.insert(realm, (NotificationData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Pamyatka.class)) {
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insert(realm, (Pamyatka) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Point.class)) {
                ru_unicorn_ujin_data_realm_PointRealmProxy.insert(realm, (Point) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentRequest.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insert(realm, (ApartmentRequest) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DemoUser.class)) {
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insert(realm, (DemoUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insert(realm, (RentBuilding) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuildingAddress.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insert(realm, (RentBuildingAddress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentComplex.class)) {
                ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insert(realm, (RentComplex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObject.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insert(realm, (RentObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObjectBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insert(realm, (RentObjectBuilding) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(User.class)) {
                ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insert(realm, (User) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProviderCity.class)) {
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insert(realm, (ProviderCity) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RealmString.class)) {
                ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insert(realm, (RealmString) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Splashscreen.class)) {
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insert(realm, (Splashscreen) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlot.class)) {
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insert(realm, (TimeSlot) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Wifi.class)) {
                ru_unicorn_ujin_data_realm_WifiRealmProxy.insert(realm, (Wifi) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AllTicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insert(realm, (AllTicketDataInX) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insert(realm, (TicketDataInX) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schemas.class)) {
                C4670xfcd8d37c.insert(realm, (Schemas) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(C5788Video.class)) {
                C4674x1c4fffad.insert(realm, (C5788Video) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileAdress.class)) {
                C4682xb8d394dd.insert(realm, (ProfileAdress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileData.class)) {
                C4780xf0c1c3b9.insert(realm, (ProfileData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserCompany.class)) {
                C4782x594eae38.insert(realm, (UserCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserData.class)) {
                C4784x85418d2d.insert(realm, (UserData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserProfile.class)) {
                C4786xba887464.insert(realm, (UserProfile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserVehicle.class)) {
                C4788xc3a2b227.insert(realm, (UserVehicle) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactData.class)) {
                C4792xa984038c.insert(realm, (ContactData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactDataList.class)) {
                C4790xe661e44a.insert(realm, (ContactDataList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPropertyObject.class)) {
                C4796x4009dee4.insert(realm, (TicketPropertyObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Appointment.class)) {
                C4818xb7a5caf9.insert(realm, (Appointment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ExecutorsIn.class)) {
                C4820x447e431f.insert(realm, (ExecutorsIn) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FromUser.class)) {
                C4822xab1ed299.insert(realm, (FromUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Status.class)) {
                C4824xe6f53cf6.insert(realm, (Status) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ToUser.class)) {
                C4826x725684ea.insert(realm, (ToUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildings.class)) {
                C4830x6d8ab071.insert(realm, (BusinessBuildings) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildingsList.class)) {
                C4828xbbcd96af.insert(realm, (BusinessBuildingsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessCenterDTO.class)) {
                C4832x38c73bbc.insert(realm, (BusinessCenterDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityDTO.class)) {
                C4834x9fbcbe06.insert(realm, (CityDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchBuildingDTO.class)) {
                C4836xc7389ad5.insert(realm, (SearchBuildingDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchComplex.class)) {
                C4838xc3cde83a.insert(realm, (SearchComplex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Action.class)) {
                ru_unicorn_ujin_data_realm_ActionRealmProxy.insert(realm, (Action) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconAction.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insert(realm, (BeaconAction) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconActionDescription.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm, (BeaconActionDescription) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardAdress.class)) {
                ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insert(realm, (CardAdress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardData.class)) {
                ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, (CardData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Chat.class)) {
                ru_unicorn_ujin_data_realm_ChatRealmProxy.insert(realm, (Chat) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ChatListResponseData.class)) {
                ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insert(realm, (ChatListResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(City.class)) {
                ru_unicorn_ujin_data_realm_CityRealmProxy.insert(realm, (City) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityTitle.class)) {
                ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insert(realm, (CityTitle) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Complex.class)) {
                ru_unicorn_ujin_data_realm_ComplexRealmProxy.insert(realm, (Complex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ComplexInfo.class)) {
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insert(realm, (ComplexInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coordinates.class)) {
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm, (Coordinates) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Favourite.class)) {
                ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insert(realm, (Favourite) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Flat.class)) {
                ru_unicorn_ujin_data_realm_FlatRealmProxy.insert(realm, (Flat) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatInfo.class)) {
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insert(realm, (FlatInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(GetFlatsResponseData.class)) {
                ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insert(realm, (GetFlatsResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageData.class)) {
                ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm, (ImageData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageSize.class)) {
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insert(realm, (ImageSize) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intercom.class)) {
                ru_unicorn_ujin_data_realm_IntercomRealmProxy.insert(realm, (Intercom) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(IntercomVal.class)) {
                ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insert(realm, (IntercomVal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Mortrage.class)) {
                ru_unicorn_ujin_data_realm_MortrageRealmProxy.insert(realm, (Mortrage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCard.class)) {
                ru_unicorn_ujin_data_realm_PassCardRealmProxy.insert(realm, (PassCard) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCardUno.class)) {
                ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insert(realm, (PassCardUno) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Price.class)) {
                ru_unicorn_ujin_data_realm_PriceRealmProxy.insert(realm, (Price) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Apartment.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm, (Apartment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipOpenDoorParam.class)) {
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insert(realm, (SipOpenDoorParam) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipParametrs.class)) {
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insert(realm, (SipParametrs) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipPreviewParams.class)) {
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insert(realm, (SipPreviewParams) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Size.class)) {
                ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm, (Size) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UnreadBadge.class)) {
                ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insert(realm, (UnreadBadge) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FavoriteBeacon.class)) {
                ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insert(realm, (FavoriteBeacon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DeviceModel.class)) {
                C4637x5b79bd5a.insert(realm, (DeviceModel) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SignalRemote.class)) {
                C4639x6ab32465.insert(realm, (SignalRemote) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Hardware.class)) {
                C4642xba9ad755.insert(realm, (Hardware) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(HardwareSignal.class)) {
                C4644x8f0def9d.insert(realm, (HardwareSignal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagementType.class)) {
                C4646xa509baca.insert(realm, (ManagementType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RoomInfo.class)) {
                C4648x51014856.insert(realm, (RoomInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intellect.class)) {
                C4650xa7ebbdf7.insert(realm, (Intellect) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AudioUrl.class)) {
                C4652xadba3b3e.insert(realm, (AudioUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Scenario.class)) {
                C4654x9b0b7455.insert(realm, (Scenario) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(State.class)) {
                C4656xbdeaa6ca.insert(realm, (State) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DialogButtons.class)) {
                C4658x6180a4a3.insert(realm, (DialogButtons) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Guard.class)) {
                C4660xccbea62f.insert(realm, (Guard) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MinVersion.class)) {
                C4662xc0a23e3a.insert(realm, (MinVersion) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schema.class)) {
                C4668xcf375a75.insert(realm, (Schema) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaCallback.class)) {
                C4664x5395ce9a.insert(realm, (SchemaCallback) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaItem.class)) {
                C4666xdf5d9ae8.insert(realm, (SchemaItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Services.class)) {
                C4672xd5d6cbb2.insert(realm, (Services) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Token.class)) {
                ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insert(realm, (Token) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Device.class)) {
                C4676xf1982dca.insert(realm, (Device) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ClassDevice.class)) {
                C4678x5ab6ac5f.insert(realm, (ClassDevice) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BMSInfo.class)) {
                C4680x20fc7e06.insert(realm, (BMSInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Devices.class)) {
                C4684xaab8a0b.insert(realm, (Devices) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FilesUrl.class)) {
                C4686xbd7f885e.insert(realm, (FilesUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceData.class)) {
                C4688xf4020777.insert(realm, (ServiceData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFieldItems.class)) {
                C4690x83bb1d33.insert(realm, (ServiceFieldItems) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceStatus.class)) {
                C4692x82b5a23f.insert(realm, (ServiceStatus) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceCategory.class)) {
                C4694x8588f9e4.insert(realm, (DomServiceCategory) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceIndicator.class)) {
                C4696x936db447.insert(realm, (DomServiceIndicator) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServicesList.class)) {
                C4700xb5dd9409.insert(realm, (DomServicesList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceTariff.class)) {
                C4698x9da95c4a.insert(realm, (DomServiceTariff) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFile.class)) {
                C4702x12a70883.insert(realm, (ServiceFile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceMessages.class)) {
                C4704x27ddec53.insert(realm, (ServiceMessages) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicket.class)) {
                C4706xcf10b813.insert(realm, (ServiceTicket) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicketType.class)) {
                C4708x7c8648ed.insert(realm, (ServiceTicketType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketAccountsList.class)) {
                C4710x379415fc.insert(realm, (TicketAccountsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApartment.class)) {
                C4712x67ea0478.insert(realm, (TicketApartment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApplicant.class)) {
                C4714x6f4f4848.insert(realm, (TicketApplicant) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketChatData.class)) {
                C4716x3c51d27a.insert(realm, (TicketChatData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketInfo.class)) {
                C4718xb56c6186.insert(realm, (TicketInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketObject.class)) {
                C4720x13bb7c97.insert(realm, (TicketObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPerformer.class)) {
                C4722x782e3a14.insert(realm, (TicketPerformer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketRating.class)) {
                C4724xb050ad75.insert(realm, (TicketRating) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tickets.class)) {
                C4730xd31c9f99.insert(realm, (Tickets) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketState.class)) {
                C4726x470e297.insert(realm, (TicketState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketUrgency.class)) {
                C4728x7291458f.insert(realm, (TicketUrgency) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rooms.class)) {
                C4732xd254b890.insert(realm, (Rooms) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MoreIconsInfo.class)) {
                C4734x3e5f4d91.insert(realm, (MoreIconsInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ActualCountersData.class)) {
                C4736x16a117c0.insert(realm, (ActualCountersData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentCompany.class)) {
                C4738x3e33c9bd.insert(realm, (RentCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AttrRenta.class)) {
                C4740x60e6319b.insert(realm, (AttrRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PropertyRenta.class)) {
                C4742xdc63beb7.insert(realm, (PropertyRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttribute.class)) {
                C4744xe660f6a7.insert(realm, (RentAttribute) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfo.class)) {
                C4748x5c024f21.insert(realm, (RentInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfoObject.class)) {
                C4746x72770240.insert(realm, (RentInfoObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentPermissions.class)) {
                C4750xebfdbb8f.insert(realm, (RentPermissions) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentType.class)) {
                C4754xcc2cbaad.insert(realm, (RentType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentTypeAttr.class)) {
                C4752xf2aa007e.insert(realm, (RentTypeAttr) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(StateRenta.class)) {
                C4756x99acf311.insert(realm, (StateRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHuman.class)) {
                C4758xdaf4d606.insert(realm, (TimeSlotHuman) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHumanValue.class)) {
                C4760xfaafb8e9.insert(realm, (TimeSlotHumanValue) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TypeRent.class)) {
                C4762x65e9722d.insert(realm, (TypeRent) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagePermissions.class)) {
                C4764xd43a5daf.insert(realm, (ManagePermissions) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rent.class)) {
                C4768x32c48847.insert(realm, (Rent) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentChildren.class)) {
                C4766x7a38e7a6.insert(realm, (RentChildren) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Renters.class)) {
                C4772xa5d8f71d.insert(realm, (Renters) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentState.class)) {
                C4770xc85b1268.insert(realm, (RentState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingInfo.class)) {
                C4774x33c567d4.insert(realm, (TalkingInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotos.class)) {
                C4778x8713e227.insert(realm, (TalkingPhotos) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotosFile.class)) {
                C4776x6ae644c3.insert(realm, (TalkingPhotosFile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttributes.class)) {
                C4794x165b0474.insert(realm, (RentAttributes) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
                C4798x7bd56e2e.insert(realm, (ApartmentScenarioOptionAdd) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Options.class)) {
                C4802x9a8f8638.insert(realm, (Options) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OptionsList.class)) {
                C4800x8b5430f6.insert(realm, (OptionsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Ticket.class)) {
                C4808x39dc6d46.insert(realm, (Ticket) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDescription.class)) {
                C4804xd885bb4.insert(realm, (TicketDescription) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDetail.class)) {
                C4806xa0f8f737.insert(realm, (TicketDetail) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoDates.class)) {
                C4810xdea6d8e5.insert(realm, (VideoDates) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEvents.class)) {
                C4814x4a38c7d7.insert(realm, (VideoEvents) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEventsList.class)) {
                C4812xdb358b15.insert(realm, (VideoEventsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoUrl.class)) {
                C4816xc56fdf8f.insert(realm, (VideoUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else {
                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (!it.hasNext()) {
                return;
            }
            if (superclass.equals(AvailablePassType.class)) {
                ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleKeyData.class)) {
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleReader.class)) {
                ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeData.class)) {
                C4591x4d164271.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeResponse.class)) {
                C4593x1ca69248.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemCodeResponseData.class)) {
                C4595x5d0db86d.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SubAccount.class)) {
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Author.class)) {
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(QrCodeForSave.class)) {
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AcceptanceDate.class)) {
                ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Address.class)) {
                ru_unicorn_ujin_data_realm_AddressRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentState.class)) {
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Bank.class)) {
                ru_unicorn_ujin_data_realm_BankRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Building.class)) {
                ru_unicorn_ujin_data_realm_BuildingRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Camera.class)) {
                ru_unicorn_ujin_data_realm_CameraRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyApplication.class)) {
                ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(EnterpriseApplication.class)) {
                C4601xb6361989.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContextBanner.class)) {
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Feature.class)) {
                ru_unicorn_ujin_data_realm_FeatureRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileData.class)) {
                ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileMeta.class)) {
                ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatButtons.class)) {
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Layout.class)) {
                ru_unicorn_ujin_data_realm_LayoutRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Banner.class)) {
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartCompany.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartOffer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartTotal.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Category.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CategoryItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Comment.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Company.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyContact.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Component.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coupon.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CouponImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Field.class)) {
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Offer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Order.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderAction.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Parameter.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PreviewImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Promotion.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Property.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCode.class)) {
                ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCodeDate.class)) {
                C4620xe7ed888c.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SampleWork.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SelectValue.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tag.class)) {
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Meta.class)) {
                ru_unicorn_ujin_data_realm_MetaRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MyBeacon.class)) {
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(News.class)) {
                ru_unicorn_ujin_data_realm_NewsRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Notification.class)) {
                ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(NotificationData.class)) {
                C4626xe255e1e5.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Pamyatka.class)) {
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Point.class)) {
                ru_unicorn_ujin_data_realm_PointRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentRequest.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DemoUser.class)) {
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuildingAddress.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentComplex.class)) {
                ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObject.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObjectBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(User.class)) {
                ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProviderCity.class)) {
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RealmString.class)) {
                ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Splashscreen.class)) {
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlot.class)) {
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Wifi.class)) {
                ru_unicorn_ujin_data_realm_WifiRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AllTicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schemas.class)) {
                C4670xfcd8d37c.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(C5788Video.class)) {
                C4674x1c4fffad.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileAdress.class)) {
                C4682xb8d394dd.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileData.class)) {
                C4780xf0c1c3b9.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserCompany.class)) {
                C4782x594eae38.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserData.class)) {
                C4784x85418d2d.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserProfile.class)) {
                C4786xba887464.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserVehicle.class)) {
                C4788xc3a2b227.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactData.class)) {
                C4792xa984038c.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactDataList.class)) {
                C4790xe661e44a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPropertyObject.class)) {
                C4796x4009dee4.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Appointment.class)) {
                C4818xb7a5caf9.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ExecutorsIn.class)) {
                C4820x447e431f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FromUser.class)) {
                C4822xab1ed299.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Status.class)) {
                C4824xe6f53cf6.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ToUser.class)) {
                C4826x725684ea.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildings.class)) {
                C4830x6d8ab071.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildingsList.class)) {
                C4828xbbcd96af.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessCenterDTO.class)) {
                C4832x38c73bbc.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityDTO.class)) {
                C4834x9fbcbe06.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchBuildingDTO.class)) {
                C4836xc7389ad5.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchComplex.class)) {
                C4838xc3cde83a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Action.class)) {
                ru_unicorn_ujin_data_realm_ActionRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconAction.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconActionDescription.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardAdress.class)) {
                ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardData.class)) {
                ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Chat.class)) {
                ru_unicorn_ujin_data_realm_ChatRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ChatListResponseData.class)) {
                ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(City.class)) {
                ru_unicorn_ujin_data_realm_CityRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityTitle.class)) {
                ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Complex.class)) {
                ru_unicorn_ujin_data_realm_ComplexRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ComplexInfo.class)) {
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coordinates.class)) {
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Favourite.class)) {
                ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Flat.class)) {
                ru_unicorn_ujin_data_realm_FlatRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatInfo.class)) {
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(GetFlatsResponseData.class)) {
                ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageData.class)) {
                ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageSize.class)) {
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intercom.class)) {
                ru_unicorn_ujin_data_realm_IntercomRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(IntercomVal.class)) {
                ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Mortrage.class)) {
                ru_unicorn_ujin_data_realm_MortrageRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCard.class)) {
                ru_unicorn_ujin_data_realm_PassCardRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCardUno.class)) {
                ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Price.class)) {
                ru_unicorn_ujin_data_realm_PriceRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Apartment.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipOpenDoorParam.class)) {
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipParametrs.class)) {
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipPreviewParams.class)) {
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Size.class)) {
                ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UnreadBadge.class)) {
                ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FavoriteBeacon.class)) {
                ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DeviceModel.class)) {
                C4637x5b79bd5a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SignalRemote.class)) {
                C4639x6ab32465.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Hardware.class)) {
                C4642xba9ad755.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(HardwareSignal.class)) {
                C4644x8f0def9d.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagementType.class)) {
                C4646xa509baca.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RoomInfo.class)) {
                C4648x51014856.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intellect.class)) {
                C4650xa7ebbdf7.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AudioUrl.class)) {
                C4652xadba3b3e.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Scenario.class)) {
                C4654x9b0b7455.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(State.class)) {
                C4656xbdeaa6ca.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DialogButtons.class)) {
                C4658x6180a4a3.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Guard.class)) {
                C4660xccbea62f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MinVersion.class)) {
                C4662xc0a23e3a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schema.class)) {
                C4668xcf375a75.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaCallback.class)) {
                C4664x5395ce9a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaItem.class)) {
                C4666xdf5d9ae8.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Services.class)) {
                C4672xd5d6cbb2.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Token.class)) {
                ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Device.class)) {
                C4676xf1982dca.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ClassDevice.class)) {
                C4678x5ab6ac5f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BMSInfo.class)) {
                C4680x20fc7e06.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Devices.class)) {
                C4684xaab8a0b.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FilesUrl.class)) {
                C4686xbd7f885e.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceData.class)) {
                C4688xf4020777.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFieldItems.class)) {
                C4690x83bb1d33.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceStatus.class)) {
                C4692x82b5a23f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceCategory.class)) {
                C4694x8588f9e4.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceIndicator.class)) {
                C4696x936db447.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServicesList.class)) {
                C4700xb5dd9409.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceTariff.class)) {
                C4698x9da95c4a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFile.class)) {
                C4702x12a70883.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceMessages.class)) {
                C4704x27ddec53.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicket.class)) {
                C4706xcf10b813.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicketType.class)) {
                C4708x7c8648ed.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketAccountsList.class)) {
                C4710x379415fc.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApartment.class)) {
                C4712x67ea0478.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApplicant.class)) {
                C4714x6f4f4848.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketChatData.class)) {
                C4716x3c51d27a.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketInfo.class)) {
                C4718xb56c6186.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketObject.class)) {
                C4720x13bb7c97.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPerformer.class)) {
                C4722x782e3a14.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketRating.class)) {
                C4724xb050ad75.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tickets.class)) {
                C4730xd31c9f99.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketState.class)) {
                C4726x470e297.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketUrgency.class)) {
                C4728x7291458f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rooms.class)) {
                C4732xd254b890.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MoreIconsInfo.class)) {
                C4734x3e5f4d91.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ActualCountersData.class)) {
                C4736x16a117c0.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentCompany.class)) {
                C4738x3e33c9bd.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AttrRenta.class)) {
                C4740x60e6319b.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PropertyRenta.class)) {
                C4742xdc63beb7.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttribute.class)) {
                C4744xe660f6a7.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfo.class)) {
                C4748x5c024f21.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfoObject.class)) {
                C4746x72770240.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentPermissions.class)) {
                C4750xebfdbb8f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentType.class)) {
                C4754xcc2cbaad.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentTypeAttr.class)) {
                C4752xf2aa007e.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(StateRenta.class)) {
                C4756x99acf311.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHuman.class)) {
                C4758xdaf4d606.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHumanValue.class)) {
                C4760xfaafb8e9.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TypeRent.class)) {
                C4762x65e9722d.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagePermissions.class)) {
                C4764xd43a5daf.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rent.class)) {
                C4768x32c48847.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentChildren.class)) {
                C4766x7a38e7a6.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Renters.class)) {
                C4772xa5d8f71d.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentState.class)) {
                C4770xc85b1268.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingInfo.class)) {
                C4774x33c567d4.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotos.class)) {
                C4778x8713e227.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotosFile.class)) {
                C4776x6ae644c3.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttributes.class)) {
                C4794x165b0474.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
                C4798x7bd56e2e.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Options.class)) {
                C4802x9a8f8638.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OptionsList.class)) {
                C4800x8b5430f6.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Ticket.class)) {
                C4808x39dc6d46.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDescription.class)) {
                C4804xd885bb4.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDetail.class)) {
                C4806xa0f8f737.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoDates.class)) {
                C4810xdea6d8e5.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEvents.class)) {
                C4814x4a38c7d7.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEventsList.class)) {
                C4812xdb358b15.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoUrl.class)) {
                C4816xc56fdf8f.insert(realm, it, (Map<RealmModel, Long>) hashMap);
            } else {
                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
        }
    }

    public void insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(AvailablePassType.class)) {
            ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insertOrUpdate(realm, (AvailablePassType) realmModel, map);
        } else if (superclass.equals(BleKeyData.class)) {
            ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insertOrUpdate(realm, (BleKeyData) realmModel, map);
        } else if (superclass.equals(BleReader.class)) {
            ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insertOrUpdate(realm, (BleReader) realmModel, map);
        } else if (superclass.equals(RentConfirmCodeData.class)) {
            C4591x4d164271.insertOrUpdate(realm, (RentConfirmCodeData) realmModel, map);
        } else if (superclass.equals(RentConfirmCodeResponse.class)) {
            C4593x1ca69248.insertOrUpdate(realm, (RentConfirmCodeResponse) realmModel, map);
        } else if (superclass.equals(RedeemCodeResponseData.class)) {
            C4595x5d0db86d.insertOrUpdate(realm, (RedeemCodeResponseData) realmModel, map);
        } else if (superclass.equals(SubAccount.class)) {
            ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm, (SubAccount) realmModel, map);
        } else if (superclass.equals(Author.class)) {
            ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm, (Author) realmModel, map);
        } else if (superclass.equals(QrCodeForSave.class)) {
            ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insertOrUpdate(realm, (QrCodeForSave) realmModel, map);
        } else if (superclass.equals(AcceptanceDate.class)) {
            ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insertOrUpdate(realm, (AcceptanceDate) realmModel, map);
        } else if (superclass.equals(Address.class)) {
            ru_unicorn_ujin_data_realm_AddressRealmProxy.insertOrUpdate(realm, (Address) realmModel, map);
        } else if (superclass.equals(ApartmentState.class)) {
            ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insertOrUpdate(realm, (ApartmentState) realmModel, map);
        } else if (superclass.equals(Bank.class)) {
            ru_unicorn_ujin_data_realm_BankRealmProxy.insertOrUpdate(realm, (Bank) realmModel, map);
        } else if (superclass.equals(Building.class)) {
            ru_unicorn_ujin_data_realm_BuildingRealmProxy.insertOrUpdate(realm, (Building) realmModel, map);
        } else if (superclass.equals(Camera.class)) {
            ru_unicorn_ujin_data_realm_CameraRealmProxy.insertOrUpdate(realm, (Camera) realmModel, map);
        } else if (superclass.equals(CompanyApplication.class)) {
            ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insertOrUpdate(realm, (CompanyApplication) realmModel, map);
        } else if (superclass.equals(EnterpriseApplication.class)) {
            C4601xb6361989.insertOrUpdate(realm, (EnterpriseApplication) realmModel, map);
        } else if (superclass.equals(ContextBanner.class)) {
            ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insertOrUpdate(realm, (ContextBanner) realmModel, map);
        } else if (superclass.equals(Feature.class)) {
            ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm, (Feature) realmModel, map);
        } else if (superclass.equals(FileData.class)) {
            ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm, (FileData) realmModel, map);
        } else if (superclass.equals(FileMeta.class)) {
            ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insertOrUpdate(realm, (FileMeta) realmModel, map);
        } else if (superclass.equals(FlatButtons.class)) {
            ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insertOrUpdate(realm, (FlatButtons) realmModel, map);
        } else if (superclass.equals(Layout.class)) {
            ru_unicorn_ujin_data_realm_LayoutRealmProxy.insertOrUpdate(realm, (Layout) realmModel, map);
        } else if (superclass.equals(Banner.class)) {
            ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insertOrUpdate(realm, (Banner) realmModel, map);
        } else if (superclass.equals(CartCompany.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insertOrUpdate(realm, (CartCompany) realmModel, map);
        } else if (superclass.equals(CartItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insertOrUpdate(realm, (CartItem) realmModel, map);
        } else if (superclass.equals(CartOffer.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm, (CartOffer) realmModel, map);
        } else if (superclass.equals(CartTotal.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insertOrUpdate(realm, (CartTotal) realmModel, map);
        } else if (superclass.equals(Category.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm, (Category) realmModel, map);
        } else if (superclass.equals(CategoryItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insertOrUpdate(realm, (CategoryItem) realmModel, map);
        } else if (superclass.equals(Comment.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insertOrUpdate(realm, (Comment) realmModel, map);
        } else if (superclass.equals(Company.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insertOrUpdate(realm, (Company) realmModel, map);
        } else if (superclass.equals(CompanyContact.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm, (CompanyContact) realmModel, map);
        } else if (superclass.equals(Component.class)) {
            ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insertOrUpdate(realm, (Component) realmModel, map);
        } else if (superclass.equals(Coupon.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insertOrUpdate(realm, (Coupon) realmModel, map);
        } else if (superclass.equals(CouponImage.class)) {
            ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insertOrUpdate(realm, (CouponImage) realmModel, map);
        } else if (superclass.equals(Field.class)) {
            ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm, (Field) realmModel, map);
        } else if (superclass.equals(Offer.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insertOrUpdate(realm, (Offer) realmModel, map);
        } else if (superclass.equals(Order.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insertOrUpdate(realm, (Order) realmModel, map);
        } else if (superclass.equals(OrderAction.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insertOrUpdate(realm, (OrderAction) realmModel, map);
        } else if (superclass.equals(OrderItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insertOrUpdate(realm, (OrderItem) realmModel, map);
        } else if (superclass.equals(Parameter.class)) {
            ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insertOrUpdate(realm, (Parameter) realmModel, map);
        } else if (superclass.equals(PreviewImage.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insertOrUpdate(realm, (PreviewImage) realmModel, map);
        } else if (superclass.equals(Promotion.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insertOrUpdate(realm, (Promotion) realmModel, map);
        } else if (superclass.equals(Property.class)) {
            ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insertOrUpdate(realm, (Property) realmModel, map);
        } else if (superclass.equals(RedeemedCode.class)) {
            ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm, (RedeemedCode) realmModel, map);
        } else if (superclass.equals(RedeemedCodeDate.class)) {
            C4620xe7ed888c.insertOrUpdate(realm, (RedeemedCodeDate) realmModel, map);
        } else if (superclass.equals(SampleWork.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insertOrUpdate(realm, (SampleWork) realmModel, map);
        } else if (superclass.equals(SearchItem.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insertOrUpdate(realm, (SearchItem) realmModel, map);
        } else if (superclass.equals(SelectValue.class)) {
            ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm, (SelectValue) realmModel, map);
        } else if (superclass.equals(Tag.class)) {
            ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insertOrUpdate(realm, (Tag) realmModel, map);
        } else if (superclass.equals(Meta.class)) {
            ru_unicorn_ujin_data_realm_MetaRealmProxy.insertOrUpdate(realm, (Meta) realmModel, map);
        } else if (superclass.equals(MyBeacon.class)) {
            ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm, (MyBeacon) realmModel, map);
        } else if (superclass.equals(News.class)) {
            ru_unicorn_ujin_data_realm_NewsRealmProxy.insertOrUpdate(realm, (News) realmModel, map);
        } else if (superclass.equals(Notification.class)) {
            ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insertOrUpdate(realm, (Notification) realmModel, map);
        } else if (superclass.equals(NotificationData.class)) {
            C4626xe255e1e5.insertOrUpdate(realm, (NotificationData) realmModel, map);
        } else if (superclass.equals(Pamyatka.class)) {
            ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insertOrUpdate(realm, (Pamyatka) realmModel, map);
        } else if (superclass.equals(Point.class)) {
            ru_unicorn_ujin_data_realm_PointRealmProxy.insertOrUpdate(realm, (Point) realmModel, map);
        } else if (superclass.equals(ApartmentRequest.class)) {
            ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insertOrUpdate(realm, (ApartmentRequest) realmModel, map);
        } else if (superclass.equals(DemoUser.class)) {
            ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insertOrUpdate(realm, (DemoUser) realmModel, map);
        } else if (superclass.equals(RentBuilding.class)) {
            ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insertOrUpdate(realm, (RentBuilding) realmModel, map);
        } else if (superclass.equals(RentBuildingAddress.class)) {
            ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insertOrUpdate(realm, (RentBuildingAddress) realmModel, map);
        } else if (superclass.equals(RentComplex.class)) {
            ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insertOrUpdate(realm, (RentComplex) realmModel, map);
        } else if (superclass.equals(RentObject.class)) {
            ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insertOrUpdate(realm, (RentObject) realmModel, map);
        } else if (superclass.equals(RentObjectBuilding.class)) {
            ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insertOrUpdate(realm, (RentObjectBuilding) realmModel, map);
        } else if (superclass.equals(User.class)) {
            ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insertOrUpdate(realm, (User) realmModel, map);
        } else if (superclass.equals(ProviderCity.class)) {
            ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insertOrUpdate(realm, (ProviderCity) realmModel, map);
        } else if (superclass.equals(RealmString.class)) {
            ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insertOrUpdate(realm, (RealmString) realmModel, map);
        } else if (superclass.equals(Splashscreen.class)) {
            ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insertOrUpdate(realm, (Splashscreen) realmModel, map);
        } else if (superclass.equals(TimeSlot.class)) {
            ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insertOrUpdate(realm, (TimeSlot) realmModel, map);
        } else if (superclass.equals(Wifi.class)) {
            ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm, (Wifi) realmModel, map);
        } else if (superclass.equals(AllTicketDataInX.class)) {
            ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insertOrUpdate(realm, (AllTicketDataInX) realmModel, map);
        } else if (superclass.equals(TicketDataInX.class)) {
            ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insertOrUpdate(realm, (TicketDataInX) realmModel, map);
        } else if (superclass.equals(Schemas.class)) {
            C4670xfcd8d37c.insertOrUpdate(realm, (Schemas) realmModel, map);
        } else if (superclass.equals(C5788Video.class)) {
            C4674x1c4fffad.insertOrUpdate(realm, (C5788Video) realmModel, map);
        } else if (superclass.equals(ProfileAdress.class)) {
            C4682xb8d394dd.insertOrUpdate(realm, (ProfileAdress) realmModel, map);
        } else if (superclass.equals(ProfileData.class)) {
            C4780xf0c1c3b9.insertOrUpdate(realm, (ProfileData) realmModel, map);
        } else if (superclass.equals(UserCompany.class)) {
            C4782x594eae38.insertOrUpdate(realm, (UserCompany) realmModel, map);
        } else if (superclass.equals(UserData.class)) {
            C4784x85418d2d.insertOrUpdate(realm, (UserData) realmModel, map);
        } else if (superclass.equals(UserProfile.class)) {
            C4786xba887464.insertOrUpdate(realm, (UserProfile) realmModel, map);
        } else if (superclass.equals(UserVehicle.class)) {
            C4788xc3a2b227.insertOrUpdate(realm, (UserVehicle) realmModel, map);
        } else if (superclass.equals(ContactData.class)) {
            C4792xa984038c.insertOrUpdate(realm, (ContactData) realmModel, map);
        } else if (superclass.equals(ContactDataList.class)) {
            C4790xe661e44a.insertOrUpdate(realm, (ContactDataList) realmModel, map);
        } else if (superclass.equals(TicketPropertyObject.class)) {
            C4796x4009dee4.insertOrUpdate(realm, (TicketPropertyObject) realmModel, map);
        } else if (superclass.equals(Appointment.class)) {
            C4818xb7a5caf9.insertOrUpdate(realm, (Appointment) realmModel, map);
        } else if (superclass.equals(ExecutorsIn.class)) {
            C4820x447e431f.insertOrUpdate(realm, (ExecutorsIn) realmModel, map);
        } else if (superclass.equals(FromUser.class)) {
            C4822xab1ed299.insertOrUpdate(realm, (FromUser) realmModel, map);
        } else if (superclass.equals(Status.class)) {
            C4824xe6f53cf6.insertOrUpdate(realm, (Status) realmModel, map);
        } else if (superclass.equals(ToUser.class)) {
            C4826x725684ea.insertOrUpdate(realm, (ToUser) realmModel, map);
        } else if (superclass.equals(BusinessBuildings.class)) {
            C4830x6d8ab071.insertOrUpdate(realm, (BusinessBuildings) realmModel, map);
        } else if (superclass.equals(BusinessBuildingsList.class)) {
            C4828xbbcd96af.insertOrUpdate(realm, (BusinessBuildingsList) realmModel, map);
        } else if (superclass.equals(BusinessCenterDTO.class)) {
            C4832x38c73bbc.insertOrUpdate(realm, (BusinessCenterDTO) realmModel, map);
        } else if (superclass.equals(CityDTO.class)) {
            C4834x9fbcbe06.insertOrUpdate(realm, (CityDTO) realmModel, map);
        } else if (superclass.equals(SearchBuildingDTO.class)) {
            C4836xc7389ad5.insertOrUpdate(realm, (SearchBuildingDTO) realmModel, map);
        } else if (superclass.equals(SearchComplex.class)) {
            C4838xc3cde83a.insertOrUpdate(realm, (SearchComplex) realmModel, map);
        } else if (superclass.equals(Action.class)) {
            ru_unicorn_ujin_data_realm_ActionRealmProxy.insertOrUpdate(realm, (Action) realmModel, map);
        } else if (superclass.equals(BeaconAction.class)) {
            ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insertOrUpdate(realm, (BeaconAction) realmModel, map);
        } else if (superclass.equals(BeaconActionDescription.class)) {
            ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm, (BeaconActionDescription) realmModel, map);
        } else if (superclass.equals(CardAdress.class)) {
            ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insertOrUpdate(realm, (CardAdress) realmModel, map);
        } else if (superclass.equals(CardData.class)) {
            ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, (CardData) realmModel, map);
        } else if (superclass.equals(Chat.class)) {
            ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm, (Chat) realmModel, map);
        } else if (superclass.equals(ChatListResponseData.class)) {
            ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insertOrUpdate(realm, (ChatListResponseData) realmModel, map);
        } else if (superclass.equals(City.class)) {
            ru_unicorn_ujin_data_realm_CityRealmProxy.insertOrUpdate(realm, (City) realmModel, map);
        } else if (superclass.equals(CityTitle.class)) {
            ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insertOrUpdate(realm, (CityTitle) realmModel, map);
        } else if (superclass.equals(Complex.class)) {
            ru_unicorn_ujin_data_realm_ComplexRealmProxy.insertOrUpdate(realm, (Complex) realmModel, map);
        } else if (superclass.equals(ComplexInfo.class)) {
            ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insertOrUpdate(realm, (ComplexInfo) realmModel, map);
        } else if (superclass.equals(Coordinates.class)) {
            ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm, (Coordinates) realmModel, map);
        } else if (superclass.equals(Favourite.class)) {
            ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insertOrUpdate(realm, (Favourite) realmModel, map);
        } else if (superclass.equals(Flat.class)) {
            ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm, (Flat) realmModel, map);
        } else if (superclass.equals(FlatInfo.class)) {
            ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm, (FlatInfo) realmModel, map);
        } else if (superclass.equals(GetFlatsResponseData.class)) {
            ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insertOrUpdate(realm, (GetFlatsResponseData) realmModel, map);
        } else if (superclass.equals(ImageData.class)) {
            ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm, (ImageData) realmModel, map);
        } else if (superclass.equals(ImageSize.class)) {
            ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insertOrUpdate(realm, (ImageSize) realmModel, map);
        } else if (superclass.equals(Intercom.class)) {
            ru_unicorn_ujin_data_realm_IntercomRealmProxy.insertOrUpdate(realm, (Intercom) realmModel, map);
        } else if (superclass.equals(IntercomVal.class)) {
            ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm, (IntercomVal) realmModel, map);
        } else if (superclass.equals(Mortrage.class)) {
            ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm, (Mortrage) realmModel, map);
        } else if (superclass.equals(PassCard.class)) {
            ru_unicorn_ujin_data_realm_PassCardRealmProxy.insertOrUpdate(realm, (PassCard) realmModel, map);
        } else if (superclass.equals(PassCardUno.class)) {
            ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insertOrUpdate(realm, (PassCardUno) realmModel, map);
        } else if (superclass.equals(Price.class)) {
            ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm, (Price) realmModel, map);
        } else if (superclass.equals(Apartment.class)) {
            ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm, (Apartment) realmModel, map);
        } else if (superclass.equals(SipOpenDoorParam.class)) {
            ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insertOrUpdate(realm, (SipOpenDoorParam) realmModel, map);
        } else if (superclass.equals(SipParametrs.class)) {
            ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insertOrUpdate(realm, (SipParametrs) realmModel, map);
        } else if (superclass.equals(SipPreviewParams.class)) {
            ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insertOrUpdate(realm, (SipPreviewParams) realmModel, map);
        } else if (superclass.equals(Size.class)) {
            ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm, (Size) realmModel, map);
        } else if (superclass.equals(UnreadBadge.class)) {
            ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insertOrUpdate(realm, (UnreadBadge) realmModel, map);
        } else if (superclass.equals(FavoriteBeacon.class)) {
            ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insertOrUpdate(realm, (FavoriteBeacon) realmModel, map);
        } else if (superclass.equals(DeviceModel.class)) {
            C4637x5b79bd5a.insertOrUpdate(realm, (DeviceModel) realmModel, map);
        } else if (superclass.equals(SignalRemote.class)) {
            C4639x6ab32465.insertOrUpdate(realm, (SignalRemote) realmModel, map);
        } else if (superclass.equals(Hardware.class)) {
            C4642xba9ad755.insertOrUpdate(realm, (Hardware) realmModel, map);
        } else if (superclass.equals(HardwareSignal.class)) {
            C4644x8f0def9d.insertOrUpdate(realm, (HardwareSignal) realmModel, map);
        } else if (superclass.equals(ManagementType.class)) {
            C4646xa509baca.insertOrUpdate(realm, (ManagementType) realmModel, map);
        } else if (superclass.equals(RoomInfo.class)) {
            C4648x51014856.insertOrUpdate(realm, (RoomInfo) realmModel, map);
        } else if (superclass.equals(Intellect.class)) {
            C4650xa7ebbdf7.insertOrUpdate(realm, (Intellect) realmModel, map);
        } else if (superclass.equals(AudioUrl.class)) {
            C4652xadba3b3e.insertOrUpdate(realm, (AudioUrl) realmModel, map);
        } else if (superclass.equals(Scenario.class)) {
            C4654x9b0b7455.insertOrUpdate(realm, (Scenario) realmModel, map);
        } else if (superclass.equals(State.class)) {
            C4656xbdeaa6ca.insertOrUpdate(realm, (State) realmModel, map);
        } else if (superclass.equals(DialogButtons.class)) {
            C4658x6180a4a3.insertOrUpdate(realm, (DialogButtons) realmModel, map);
        } else if (superclass.equals(Guard.class)) {
            C4660xccbea62f.insertOrUpdate(realm, (Guard) realmModel, map);
        } else if (superclass.equals(MinVersion.class)) {
            C4662xc0a23e3a.insertOrUpdate(realm, (MinVersion) realmModel, map);
        } else if (superclass.equals(Schema.class)) {
            C4668xcf375a75.insertOrUpdate(realm, (Schema) realmModel, map);
        } else if (superclass.equals(SchemaCallback.class)) {
            C4664x5395ce9a.insertOrUpdate(realm, (SchemaCallback) realmModel, map);
        } else if (superclass.equals(SchemaItem.class)) {
            C4666xdf5d9ae8.insertOrUpdate(realm, (SchemaItem) realmModel, map);
        } else if (superclass.equals(Services.class)) {
            C4672xd5d6cbb2.insertOrUpdate(realm, (Services) realmModel, map);
        } else if (superclass.equals(Token.class)) {
            ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insertOrUpdate(realm, (Token) realmModel, map);
        } else if (superclass.equals(Device.class)) {
            C4676xf1982dca.insertOrUpdate(realm, (Device) realmModel, map);
        } else if (superclass.equals(ClassDevice.class)) {
            C4678x5ab6ac5f.insertOrUpdate(realm, (ClassDevice) realmModel, map);
        } else if (superclass.equals(BMSInfo.class)) {
            C4680x20fc7e06.insertOrUpdate(realm, (BMSInfo) realmModel, map);
        } else if (superclass.equals(Devices.class)) {
            C4684xaab8a0b.insertOrUpdate(realm, (Devices) realmModel, map);
        } else if (superclass.equals(FilesUrl.class)) {
            C4686xbd7f885e.insertOrUpdate(realm, (FilesUrl) realmModel, map);
        } else if (superclass.equals(ServiceData.class)) {
            C4688xf4020777.insertOrUpdate(realm, (ServiceData) realmModel, map);
        } else if (superclass.equals(ServiceFieldItems.class)) {
            C4690x83bb1d33.insertOrUpdate(realm, (ServiceFieldItems) realmModel, map);
        } else if (superclass.equals(ServiceStatus.class)) {
            C4692x82b5a23f.insertOrUpdate(realm, (ServiceStatus) realmModel, map);
        } else if (superclass.equals(DomServiceCategory.class)) {
            C4694x8588f9e4.insertOrUpdate(realm, (DomServiceCategory) realmModel, map);
        } else if (superclass.equals(DomServiceIndicator.class)) {
            C4696x936db447.insertOrUpdate(realm, (DomServiceIndicator) realmModel, map);
        } else if (superclass.equals(DomServicesList.class)) {
            C4700xb5dd9409.insertOrUpdate(realm, (DomServicesList) realmModel, map);
        } else if (superclass.equals(DomServiceTariff.class)) {
            C4698x9da95c4a.insertOrUpdate(realm, (DomServiceTariff) realmModel, map);
        } else if (superclass.equals(ServiceFile.class)) {
            C4702x12a70883.insertOrUpdate(realm, (ServiceFile) realmModel, map);
        } else if (superclass.equals(ServiceMessages.class)) {
            C4704x27ddec53.insertOrUpdate(realm, (ServiceMessages) realmModel, map);
        } else if (superclass.equals(ServiceTicket.class)) {
            C4706xcf10b813.insertOrUpdate(realm, (ServiceTicket) realmModel, map);
        } else if (superclass.equals(ServiceTicketType.class)) {
            C4708x7c8648ed.insertOrUpdate(realm, (ServiceTicketType) realmModel, map);
        } else if (superclass.equals(TicketAccountsList.class)) {
            C4710x379415fc.insertOrUpdate(realm, (TicketAccountsList) realmModel, map);
        } else if (superclass.equals(TicketApartment.class)) {
            C4712x67ea0478.insertOrUpdate(realm, (TicketApartment) realmModel, map);
        } else if (superclass.equals(TicketApplicant.class)) {
            C4714x6f4f4848.insertOrUpdate(realm, (TicketApplicant) realmModel, map);
        } else if (superclass.equals(TicketChatData.class)) {
            C4716x3c51d27a.insertOrUpdate(realm, (TicketChatData) realmModel, map);
        } else if (superclass.equals(TicketInfo.class)) {
            C4718xb56c6186.insertOrUpdate(realm, (TicketInfo) realmModel, map);
        } else if (superclass.equals(TicketObject.class)) {
            C4720x13bb7c97.insertOrUpdate(realm, (TicketObject) realmModel, map);
        } else if (superclass.equals(TicketPerformer.class)) {
            C4722x782e3a14.insertOrUpdate(realm, (TicketPerformer) realmModel, map);
        } else if (superclass.equals(TicketRating.class)) {
            C4724xb050ad75.insertOrUpdate(realm, (TicketRating) realmModel, map);
        } else if (superclass.equals(Tickets.class)) {
            C4730xd31c9f99.insertOrUpdate(realm, (Tickets) realmModel, map);
        } else if (superclass.equals(TicketState.class)) {
            C4726x470e297.insertOrUpdate(realm, (TicketState) realmModel, map);
        } else if (superclass.equals(TicketUrgency.class)) {
            C4728x7291458f.insertOrUpdate(realm, (TicketUrgency) realmModel, map);
        } else if (superclass.equals(Rooms.class)) {
            C4732xd254b890.insertOrUpdate(realm, (Rooms) realmModel, map);
        } else if (superclass.equals(MoreIconsInfo.class)) {
            C4734x3e5f4d91.insertOrUpdate(realm, (MoreIconsInfo) realmModel, map);
        } else if (superclass.equals(ActualCountersData.class)) {
            C4736x16a117c0.insertOrUpdate(realm, (ActualCountersData) realmModel, map);
        } else if (superclass.equals(RentCompany.class)) {
            C4738x3e33c9bd.insertOrUpdate(realm, (RentCompany) realmModel, map);
        } else if (superclass.equals(AttrRenta.class)) {
            C4740x60e6319b.insertOrUpdate(realm, (AttrRenta) realmModel, map);
        } else if (superclass.equals(PropertyRenta.class)) {
            C4742xdc63beb7.insertOrUpdate(realm, (PropertyRenta) realmModel, map);
        } else if (superclass.equals(RentAttribute.class)) {
            C4744xe660f6a7.insertOrUpdate(realm, (RentAttribute) realmModel, map);
        } else if (superclass.equals(RentInfo.class)) {
            C4748x5c024f21.insertOrUpdate(realm, (RentInfo) realmModel, map);
        } else if (superclass.equals(RentInfoObject.class)) {
            C4746x72770240.insertOrUpdate(realm, (RentInfoObject) realmModel, map);
        } else if (superclass.equals(RentPermissions.class)) {
            C4750xebfdbb8f.insertOrUpdate(realm, (RentPermissions) realmModel, map);
        } else if (superclass.equals(RentType.class)) {
            C4754xcc2cbaad.insertOrUpdate(realm, (RentType) realmModel, map);
        } else if (superclass.equals(RentTypeAttr.class)) {
            C4752xf2aa007e.insertOrUpdate(realm, (RentTypeAttr) realmModel, map);
        } else if (superclass.equals(StateRenta.class)) {
            C4756x99acf311.insertOrUpdate(realm, (StateRenta) realmModel, map);
        } else if (superclass.equals(TimeSlotHuman.class)) {
            C4758xdaf4d606.insertOrUpdate(realm, (TimeSlotHuman) realmModel, map);
        } else if (superclass.equals(TimeSlotHumanValue.class)) {
            C4760xfaafb8e9.insertOrUpdate(realm, (TimeSlotHumanValue) realmModel, map);
        } else if (superclass.equals(TypeRent.class)) {
            C4762x65e9722d.insertOrUpdate(realm, (TypeRent) realmModel, map);
        } else if (superclass.equals(ManagePermissions.class)) {
            C4764xd43a5daf.insertOrUpdate(realm, (ManagePermissions) realmModel, map);
        } else if (superclass.equals(Rent.class)) {
            C4768x32c48847.insertOrUpdate(realm, (Rent) realmModel, map);
        } else if (superclass.equals(RentChildren.class)) {
            C4766x7a38e7a6.insertOrUpdate(realm, (RentChildren) realmModel, map);
        } else if (superclass.equals(Renters.class)) {
            C4772xa5d8f71d.insertOrUpdate(realm, (Renters) realmModel, map);
        } else if (superclass.equals(RentState.class)) {
            C4770xc85b1268.insertOrUpdate(realm, (RentState) realmModel, map);
        } else if (superclass.equals(TalkingInfo.class)) {
            C4774x33c567d4.insertOrUpdate(realm, (TalkingInfo) realmModel, map);
        } else if (superclass.equals(TalkingPhotos.class)) {
            C4778x8713e227.insertOrUpdate(realm, (TalkingPhotos) realmModel, map);
        } else if (superclass.equals(TalkingPhotosFile.class)) {
            C4776x6ae644c3.insertOrUpdate(realm, (TalkingPhotosFile) realmModel, map);
        } else if (superclass.equals(RentAttributes.class)) {
            C4794x165b0474.insertOrUpdate(realm, (RentAttributes) realmModel, map);
        } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
            C4798x7bd56e2e.insertOrUpdate(realm, (ApartmentScenarioOptionAdd) realmModel, map);
        } else if (superclass.equals(Options.class)) {
            C4802x9a8f8638.insertOrUpdate(realm, (Options) realmModel, map);
        } else if (superclass.equals(OptionsList.class)) {
            C4800x8b5430f6.insertOrUpdate(realm, (OptionsList) realmModel, map);
        } else if (superclass.equals(Ticket.class)) {
            C4808x39dc6d46.insertOrUpdate(realm, (Ticket) realmModel, map);
        } else if (superclass.equals(TicketDescription.class)) {
            C4804xd885bb4.insertOrUpdate(realm, (TicketDescription) realmModel, map);
        } else if (superclass.equals(TicketDetail.class)) {
            C4806xa0f8f737.insertOrUpdate(realm, (TicketDetail) realmModel, map);
        } else if (superclass.equals(VideoDates.class)) {
            C4810xdea6d8e5.insertOrUpdate(realm, (VideoDates) realmModel, map);
        } else if (superclass.equals(VideoEvents.class)) {
            C4814x4a38c7d7.insertOrUpdate(realm, (VideoEvents) realmModel, map);
        } else if (superclass.equals(VideoEventsList.class)) {
            C4812xdb358b15.insertOrUpdate(realm, (VideoEventsList) realmModel, map);
        } else if (superclass.equals(VideoUrl.class)) {
            C4816xc56fdf8f.insertOrUpdate(realm, (VideoUrl) realmModel, map);
        } else {
            throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
    }

    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            if (superclass.equals(AvailablePassType.class)) {
                ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insertOrUpdate(realm, (AvailablePassType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleKeyData.class)) {
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insertOrUpdate(realm, (BleKeyData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleReader.class)) {
                ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insertOrUpdate(realm, (BleReader) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeData.class)) {
                C4591x4d164271.insertOrUpdate(realm, (RentConfirmCodeData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeResponse.class)) {
                C4593x1ca69248.insertOrUpdate(realm, (RentConfirmCodeResponse) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemCodeResponseData.class)) {
                C4595x5d0db86d.insertOrUpdate(realm, (RedeemCodeResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SubAccount.class)) {
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm, (SubAccount) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Author.class)) {
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm, (Author) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(QrCodeForSave.class)) {
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insertOrUpdate(realm, (QrCodeForSave) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AcceptanceDate.class)) {
                ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insertOrUpdate(realm, (AcceptanceDate) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Address.class)) {
                ru_unicorn_ujin_data_realm_AddressRealmProxy.insertOrUpdate(realm, (Address) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentState.class)) {
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insertOrUpdate(realm, (ApartmentState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Bank.class)) {
                ru_unicorn_ujin_data_realm_BankRealmProxy.insertOrUpdate(realm, (Bank) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Building.class)) {
                ru_unicorn_ujin_data_realm_BuildingRealmProxy.insertOrUpdate(realm, (Building) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Camera.class)) {
                ru_unicorn_ujin_data_realm_CameraRealmProxy.insertOrUpdate(realm, (Camera) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyApplication.class)) {
                ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insertOrUpdate(realm, (CompanyApplication) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(EnterpriseApplication.class)) {
                C4601xb6361989.insertOrUpdate(realm, (EnterpriseApplication) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContextBanner.class)) {
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insertOrUpdate(realm, (ContextBanner) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Feature.class)) {
                ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm, (Feature) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileData.class)) {
                ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm, (FileData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileMeta.class)) {
                ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insertOrUpdate(realm, (FileMeta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatButtons.class)) {
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insertOrUpdate(realm, (FlatButtons) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Layout.class)) {
                ru_unicorn_ujin_data_realm_LayoutRealmProxy.insertOrUpdate(realm, (Layout) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Banner.class)) {
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insertOrUpdate(realm, (Banner) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartCompany.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insertOrUpdate(realm, (CartCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insertOrUpdate(realm, (CartItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartOffer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm, (CartOffer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartTotal.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insertOrUpdate(realm, (CartTotal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Category.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm, (Category) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CategoryItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insertOrUpdate(realm, (CategoryItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Comment.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insertOrUpdate(realm, (Comment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Company.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insertOrUpdate(realm, (Company) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyContact.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm, (CompanyContact) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Component.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insertOrUpdate(realm, (Component) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coupon.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insertOrUpdate(realm, (Coupon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CouponImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insertOrUpdate(realm, (CouponImage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Field.class)) {
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm, (Field) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Offer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insertOrUpdate(realm, (Offer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Order.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insertOrUpdate(realm, (Order) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderAction.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insertOrUpdate(realm, (OrderAction) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insertOrUpdate(realm, (OrderItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Parameter.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insertOrUpdate(realm, (Parameter) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PreviewImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insertOrUpdate(realm, (PreviewImage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Promotion.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insertOrUpdate(realm, (Promotion) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Property.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insertOrUpdate(realm, (Property) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCode.class)) {
                ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm, (RedeemedCode) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCodeDate.class)) {
                C4620xe7ed888c.insertOrUpdate(realm, (RedeemedCodeDate) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SampleWork.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insertOrUpdate(realm, (SampleWork) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insertOrUpdate(realm, (SearchItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SelectValue.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm, (SelectValue) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tag.class)) {
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insertOrUpdate(realm, (Tag) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Meta.class)) {
                ru_unicorn_ujin_data_realm_MetaRealmProxy.insertOrUpdate(realm, (Meta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MyBeacon.class)) {
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm, (MyBeacon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(News.class)) {
                ru_unicorn_ujin_data_realm_NewsRealmProxy.insertOrUpdate(realm, (News) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Notification.class)) {
                ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insertOrUpdate(realm, (Notification) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(NotificationData.class)) {
                C4626xe255e1e5.insertOrUpdate(realm, (NotificationData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Pamyatka.class)) {
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insertOrUpdate(realm, (Pamyatka) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Point.class)) {
                ru_unicorn_ujin_data_realm_PointRealmProxy.insertOrUpdate(realm, (Point) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentRequest.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insertOrUpdate(realm, (ApartmentRequest) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DemoUser.class)) {
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insertOrUpdate(realm, (DemoUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insertOrUpdate(realm, (RentBuilding) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuildingAddress.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insertOrUpdate(realm, (RentBuildingAddress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentComplex.class)) {
                ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insertOrUpdate(realm, (RentComplex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObject.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insertOrUpdate(realm, (RentObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObjectBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insertOrUpdate(realm, (RentObjectBuilding) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(User.class)) {
                ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insertOrUpdate(realm, (User) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProviderCity.class)) {
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insertOrUpdate(realm, (ProviderCity) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RealmString.class)) {
                ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insertOrUpdate(realm, (RealmString) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Splashscreen.class)) {
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insertOrUpdate(realm, (Splashscreen) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlot.class)) {
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insertOrUpdate(realm, (TimeSlot) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Wifi.class)) {
                ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm, (Wifi) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AllTicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insertOrUpdate(realm, (AllTicketDataInX) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insertOrUpdate(realm, (TicketDataInX) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schemas.class)) {
                C4670xfcd8d37c.insertOrUpdate(realm, (Schemas) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(C5788Video.class)) {
                C4674x1c4fffad.insertOrUpdate(realm, (C5788Video) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileAdress.class)) {
                C4682xb8d394dd.insertOrUpdate(realm, (ProfileAdress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileData.class)) {
                C4780xf0c1c3b9.insertOrUpdate(realm, (ProfileData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserCompany.class)) {
                C4782x594eae38.insertOrUpdate(realm, (UserCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserData.class)) {
                C4784x85418d2d.insertOrUpdate(realm, (UserData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserProfile.class)) {
                C4786xba887464.insertOrUpdate(realm, (UserProfile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserVehicle.class)) {
                C4788xc3a2b227.insertOrUpdate(realm, (UserVehicle) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactData.class)) {
                C4792xa984038c.insertOrUpdate(realm, (ContactData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactDataList.class)) {
                C4790xe661e44a.insertOrUpdate(realm, (ContactDataList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPropertyObject.class)) {
                C4796x4009dee4.insertOrUpdate(realm, (TicketPropertyObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Appointment.class)) {
                C4818xb7a5caf9.insertOrUpdate(realm, (Appointment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ExecutorsIn.class)) {
                C4820x447e431f.insertOrUpdate(realm, (ExecutorsIn) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FromUser.class)) {
                C4822xab1ed299.insertOrUpdate(realm, (FromUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Status.class)) {
                C4824xe6f53cf6.insertOrUpdate(realm, (Status) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ToUser.class)) {
                C4826x725684ea.insertOrUpdate(realm, (ToUser) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildings.class)) {
                C4830x6d8ab071.insertOrUpdate(realm, (BusinessBuildings) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildingsList.class)) {
                C4828xbbcd96af.insertOrUpdate(realm, (BusinessBuildingsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessCenterDTO.class)) {
                C4832x38c73bbc.insertOrUpdate(realm, (BusinessCenterDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityDTO.class)) {
                C4834x9fbcbe06.insertOrUpdate(realm, (CityDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchBuildingDTO.class)) {
                C4836xc7389ad5.insertOrUpdate(realm, (SearchBuildingDTO) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchComplex.class)) {
                C4838xc3cde83a.insertOrUpdate(realm, (SearchComplex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Action.class)) {
                ru_unicorn_ujin_data_realm_ActionRealmProxy.insertOrUpdate(realm, (Action) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconAction.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insertOrUpdate(realm, (BeaconAction) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconActionDescription.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm, (BeaconActionDescription) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardAdress.class)) {
                ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insertOrUpdate(realm, (CardAdress) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardData.class)) {
                ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, (CardData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Chat.class)) {
                ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm, (Chat) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ChatListResponseData.class)) {
                ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insertOrUpdate(realm, (ChatListResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(City.class)) {
                ru_unicorn_ujin_data_realm_CityRealmProxy.insertOrUpdate(realm, (City) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityTitle.class)) {
                ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insertOrUpdate(realm, (CityTitle) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Complex.class)) {
                ru_unicorn_ujin_data_realm_ComplexRealmProxy.insertOrUpdate(realm, (Complex) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ComplexInfo.class)) {
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insertOrUpdate(realm, (ComplexInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coordinates.class)) {
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm, (Coordinates) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Favourite.class)) {
                ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insertOrUpdate(realm, (Favourite) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Flat.class)) {
                ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm, (Flat) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatInfo.class)) {
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm, (FlatInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(GetFlatsResponseData.class)) {
                ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insertOrUpdate(realm, (GetFlatsResponseData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageData.class)) {
                ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm, (ImageData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageSize.class)) {
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insertOrUpdate(realm, (ImageSize) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intercom.class)) {
                ru_unicorn_ujin_data_realm_IntercomRealmProxy.insertOrUpdate(realm, (Intercom) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(IntercomVal.class)) {
                ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm, (IntercomVal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Mortrage.class)) {
                ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm, (Mortrage) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCard.class)) {
                ru_unicorn_ujin_data_realm_PassCardRealmProxy.insertOrUpdate(realm, (PassCard) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCardUno.class)) {
                ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insertOrUpdate(realm, (PassCardUno) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Price.class)) {
                ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm, (Price) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Apartment.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm, (Apartment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipOpenDoorParam.class)) {
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insertOrUpdate(realm, (SipOpenDoorParam) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipParametrs.class)) {
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insertOrUpdate(realm, (SipParametrs) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipPreviewParams.class)) {
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insertOrUpdate(realm, (SipPreviewParams) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Size.class)) {
                ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm, (Size) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UnreadBadge.class)) {
                ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insertOrUpdate(realm, (UnreadBadge) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FavoriteBeacon.class)) {
                ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insertOrUpdate(realm, (FavoriteBeacon) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DeviceModel.class)) {
                C4637x5b79bd5a.insertOrUpdate(realm, (DeviceModel) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SignalRemote.class)) {
                C4639x6ab32465.insertOrUpdate(realm, (SignalRemote) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Hardware.class)) {
                C4642xba9ad755.insertOrUpdate(realm, (Hardware) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(HardwareSignal.class)) {
                C4644x8f0def9d.insertOrUpdate(realm, (HardwareSignal) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagementType.class)) {
                C4646xa509baca.insertOrUpdate(realm, (ManagementType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RoomInfo.class)) {
                C4648x51014856.insertOrUpdate(realm, (RoomInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intellect.class)) {
                C4650xa7ebbdf7.insertOrUpdate(realm, (Intellect) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AudioUrl.class)) {
                C4652xadba3b3e.insertOrUpdate(realm, (AudioUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Scenario.class)) {
                C4654x9b0b7455.insertOrUpdate(realm, (Scenario) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(State.class)) {
                C4656xbdeaa6ca.insertOrUpdate(realm, (State) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DialogButtons.class)) {
                C4658x6180a4a3.insertOrUpdate(realm, (DialogButtons) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Guard.class)) {
                C4660xccbea62f.insertOrUpdate(realm, (Guard) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MinVersion.class)) {
                C4662xc0a23e3a.insertOrUpdate(realm, (MinVersion) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schema.class)) {
                C4668xcf375a75.insertOrUpdate(realm, (Schema) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaCallback.class)) {
                C4664x5395ce9a.insertOrUpdate(realm, (SchemaCallback) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaItem.class)) {
                C4666xdf5d9ae8.insertOrUpdate(realm, (SchemaItem) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Services.class)) {
                C4672xd5d6cbb2.insertOrUpdate(realm, (Services) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Token.class)) {
                ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insertOrUpdate(realm, (Token) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Device.class)) {
                C4676xf1982dca.insertOrUpdate(realm, (Device) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ClassDevice.class)) {
                C4678x5ab6ac5f.insertOrUpdate(realm, (ClassDevice) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BMSInfo.class)) {
                C4680x20fc7e06.insertOrUpdate(realm, (BMSInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Devices.class)) {
                C4684xaab8a0b.insertOrUpdate(realm, (Devices) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FilesUrl.class)) {
                C4686xbd7f885e.insertOrUpdate(realm, (FilesUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceData.class)) {
                C4688xf4020777.insertOrUpdate(realm, (ServiceData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFieldItems.class)) {
                C4690x83bb1d33.insertOrUpdate(realm, (ServiceFieldItems) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceStatus.class)) {
                C4692x82b5a23f.insertOrUpdate(realm, (ServiceStatus) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceCategory.class)) {
                C4694x8588f9e4.insertOrUpdate(realm, (DomServiceCategory) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceIndicator.class)) {
                C4696x936db447.insertOrUpdate(realm, (DomServiceIndicator) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServicesList.class)) {
                C4700xb5dd9409.insertOrUpdate(realm, (DomServicesList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceTariff.class)) {
                C4698x9da95c4a.insertOrUpdate(realm, (DomServiceTariff) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFile.class)) {
                C4702x12a70883.insertOrUpdate(realm, (ServiceFile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceMessages.class)) {
                C4704x27ddec53.insertOrUpdate(realm, (ServiceMessages) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicket.class)) {
                C4706xcf10b813.insertOrUpdate(realm, (ServiceTicket) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicketType.class)) {
                C4708x7c8648ed.insertOrUpdate(realm, (ServiceTicketType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketAccountsList.class)) {
                C4710x379415fc.insertOrUpdate(realm, (TicketAccountsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApartment.class)) {
                C4712x67ea0478.insertOrUpdate(realm, (TicketApartment) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApplicant.class)) {
                C4714x6f4f4848.insertOrUpdate(realm, (TicketApplicant) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketChatData.class)) {
                C4716x3c51d27a.insertOrUpdate(realm, (TicketChatData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketInfo.class)) {
                C4718xb56c6186.insertOrUpdate(realm, (TicketInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketObject.class)) {
                C4720x13bb7c97.insertOrUpdate(realm, (TicketObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPerformer.class)) {
                C4722x782e3a14.insertOrUpdate(realm, (TicketPerformer) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketRating.class)) {
                C4724xb050ad75.insertOrUpdate(realm, (TicketRating) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tickets.class)) {
                C4730xd31c9f99.insertOrUpdate(realm, (Tickets) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketState.class)) {
                C4726x470e297.insertOrUpdate(realm, (TicketState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketUrgency.class)) {
                C4728x7291458f.insertOrUpdate(realm, (TicketUrgency) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rooms.class)) {
                C4732xd254b890.insertOrUpdate(realm, (Rooms) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MoreIconsInfo.class)) {
                C4734x3e5f4d91.insertOrUpdate(realm, (MoreIconsInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ActualCountersData.class)) {
                C4736x16a117c0.insertOrUpdate(realm, (ActualCountersData) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentCompany.class)) {
                C4738x3e33c9bd.insertOrUpdate(realm, (RentCompany) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AttrRenta.class)) {
                C4740x60e6319b.insertOrUpdate(realm, (AttrRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PropertyRenta.class)) {
                C4742xdc63beb7.insertOrUpdate(realm, (PropertyRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttribute.class)) {
                C4744xe660f6a7.insertOrUpdate(realm, (RentAttribute) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfo.class)) {
                C4748x5c024f21.insertOrUpdate(realm, (RentInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfoObject.class)) {
                C4746x72770240.insertOrUpdate(realm, (RentInfoObject) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentPermissions.class)) {
                C4750xebfdbb8f.insertOrUpdate(realm, (RentPermissions) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentType.class)) {
                C4754xcc2cbaad.insertOrUpdate(realm, (RentType) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentTypeAttr.class)) {
                C4752xf2aa007e.insertOrUpdate(realm, (RentTypeAttr) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(StateRenta.class)) {
                C4756x99acf311.insertOrUpdate(realm, (StateRenta) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHuman.class)) {
                C4758xdaf4d606.insertOrUpdate(realm, (TimeSlotHuman) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHumanValue.class)) {
                C4760xfaafb8e9.insertOrUpdate(realm, (TimeSlotHumanValue) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TypeRent.class)) {
                C4762x65e9722d.insertOrUpdate(realm, (TypeRent) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagePermissions.class)) {
                C4764xd43a5daf.insertOrUpdate(realm, (ManagePermissions) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rent.class)) {
                C4768x32c48847.insertOrUpdate(realm, (Rent) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentChildren.class)) {
                C4766x7a38e7a6.insertOrUpdate(realm, (RentChildren) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Renters.class)) {
                C4772xa5d8f71d.insertOrUpdate(realm, (Renters) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentState.class)) {
                C4770xc85b1268.insertOrUpdate(realm, (RentState) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingInfo.class)) {
                C4774x33c567d4.insertOrUpdate(realm, (TalkingInfo) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotos.class)) {
                C4778x8713e227.insertOrUpdate(realm, (TalkingPhotos) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotosFile.class)) {
                C4776x6ae644c3.insertOrUpdate(realm, (TalkingPhotosFile) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttributes.class)) {
                C4794x165b0474.insertOrUpdate(realm, (RentAttributes) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
                C4798x7bd56e2e.insertOrUpdate(realm, (ApartmentScenarioOptionAdd) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Options.class)) {
                C4802x9a8f8638.insertOrUpdate(realm, (Options) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OptionsList.class)) {
                C4800x8b5430f6.insertOrUpdate(realm, (OptionsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Ticket.class)) {
                C4808x39dc6d46.insertOrUpdate(realm, (Ticket) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDescription.class)) {
                C4804xd885bb4.insertOrUpdate(realm, (TicketDescription) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDetail.class)) {
                C4806xa0f8f737.insertOrUpdate(realm, (TicketDetail) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoDates.class)) {
                C4810xdea6d8e5.insertOrUpdate(realm, (VideoDates) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEvents.class)) {
                C4814x4a38c7d7.insertOrUpdate(realm, (VideoEvents) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEventsList.class)) {
                C4812xdb358b15.insertOrUpdate(realm, (VideoEventsList) realmModel, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoUrl.class)) {
                C4816xc56fdf8f.insertOrUpdate(realm, (VideoUrl) realmModel, (Map<RealmModel, Long>) hashMap);
            } else {
                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (!it.hasNext()) {
                return;
            }
            if (superclass.equals(AvailablePassType.class)) {
                ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleKeyData.class)) {
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BleReader.class)) {
                ru_unicorn_ujin_ble_data_BleReaderRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeData.class)) {
                C4591x4d164271.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentConfirmCodeResponse.class)) {
                C4593x1ca69248.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemCodeResponseData.class)) {
                C4595x5d0db86d.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SubAccount.class)) {
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Author.class)) {
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(QrCodeForSave.class)) {
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AcceptanceDate.class)) {
                ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Address.class)) {
                ru_unicorn_ujin_data_realm_AddressRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentState.class)) {
                ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Bank.class)) {
                ru_unicorn_ujin_data_realm_BankRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Building.class)) {
                ru_unicorn_ujin_data_realm_BuildingRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Camera.class)) {
                ru_unicorn_ujin_data_realm_CameraRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyApplication.class)) {
                ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(EnterpriseApplication.class)) {
                C4601xb6361989.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContextBanner.class)) {
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Feature.class)) {
                ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileData.class)) {
                ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FileMeta.class)) {
                ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatButtons.class)) {
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Layout.class)) {
                ru_unicorn_ujin_data_realm_LayoutRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Banner.class)) {
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartCompany.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartOffer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CartTotal.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Category.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CategoryItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Comment.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Company.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CompanyContact.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Component.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coupon.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CouponImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Field.class)) {
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Offer.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Order.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderAction.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OrderItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Parameter.class)) {
                ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PreviewImage.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Promotion.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Property.class)) {
                ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCode.class)) {
                ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RedeemedCodeDate.class)) {
                C4620xe7ed888c.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SampleWork.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchItem.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SelectValue.class)) {
                ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tag.class)) {
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Meta.class)) {
                ru_unicorn_ujin_data_realm_MetaRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MyBeacon.class)) {
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(News.class)) {
                ru_unicorn_ujin_data_realm_NewsRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Notification.class)) {
                ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(NotificationData.class)) {
                C4626xe255e1e5.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Pamyatka.class)) {
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Point.class)) {
                ru_unicorn_ujin_data_realm_PointRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentRequest.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DemoUser.class)) {
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentBuildingAddress.class)) {
                ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentComplex.class)) {
                ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObject.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentObjectBuilding.class)) {
                ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(User.class)) {
                ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProviderCity.class)) {
                ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RealmString.class)) {
                ru_unicorn_ujin_data_realm_RealmStringRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Splashscreen.class)) {
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlot.class)) {
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Wifi.class)) {
                ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AllTicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDataInX.class)) {
                ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schemas.class)) {
                C4670xfcd8d37c.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(C5788Video.class)) {
                C4674x1c4fffad.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileAdress.class)) {
                C4682xb8d394dd.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ProfileData.class)) {
                C4780xf0c1c3b9.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserCompany.class)) {
                C4782x594eae38.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserData.class)) {
                C4784x85418d2d.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserProfile.class)) {
                C4786xba887464.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UserVehicle.class)) {
                C4788xc3a2b227.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactData.class)) {
                C4792xa984038c.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ContactDataList.class)) {
                C4790xe661e44a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPropertyObject.class)) {
                C4796x4009dee4.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Appointment.class)) {
                C4818xb7a5caf9.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ExecutorsIn.class)) {
                C4820x447e431f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FromUser.class)) {
                C4822xab1ed299.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Status.class)) {
                C4824xe6f53cf6.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ToUser.class)) {
                C4826x725684ea.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildings.class)) {
                C4830x6d8ab071.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessBuildingsList.class)) {
                C4828xbbcd96af.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BusinessCenterDTO.class)) {
                C4832x38c73bbc.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityDTO.class)) {
                C4834x9fbcbe06.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchBuildingDTO.class)) {
                C4836xc7389ad5.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SearchComplex.class)) {
                C4838xc3cde83a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Action.class)) {
                ru_unicorn_ujin_data_realm_ActionRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconAction.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BeaconActionDescription.class)) {
                ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardAdress.class)) {
                ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CardData.class)) {
                ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Chat.class)) {
                ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ChatListResponseData.class)) {
                ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(City.class)) {
                ru_unicorn_ujin_data_realm_CityRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(CityTitle.class)) {
                ru_unicorn_ujin_data_realm_CityTitleRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Complex.class)) {
                ru_unicorn_ujin_data_realm_ComplexRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ComplexInfo.class)) {
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Coordinates.class)) {
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Favourite.class)) {
                ru_unicorn_ujin_data_realm_FavouriteRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Flat.class)) {
                ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FlatInfo.class)) {
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(GetFlatsResponseData.class)) {
                ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageData.class)) {
                ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ImageSize.class)) {
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intercom.class)) {
                ru_unicorn_ujin_data_realm_IntercomRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(IntercomVal.class)) {
                ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Mortrage.class)) {
                ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCard.class)) {
                ru_unicorn_ujin_data_realm_PassCardRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PassCardUno.class)) {
                ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Price.class)) {
                ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Apartment.class)) {
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipOpenDoorParam.class)) {
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipParametrs.class)) {
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SipPreviewParams.class)) {
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Size.class)) {
                ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(UnreadBadge.class)) {
                ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FavoriteBeacon.class)) {
                ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DeviceModel.class)) {
                C4637x5b79bd5a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SignalRemote.class)) {
                C4639x6ab32465.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Hardware.class)) {
                C4642xba9ad755.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(HardwareSignal.class)) {
                C4644x8f0def9d.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagementType.class)) {
                C4646xa509baca.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RoomInfo.class)) {
                C4648x51014856.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Intellect.class)) {
                C4650xa7ebbdf7.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AudioUrl.class)) {
                C4652xadba3b3e.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Scenario.class)) {
                C4654x9b0b7455.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(State.class)) {
                C4656xbdeaa6ca.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DialogButtons.class)) {
                C4658x6180a4a3.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Guard.class)) {
                C4660xccbea62f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MinVersion.class)) {
                C4662xc0a23e3a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Schema.class)) {
                C4668xcf375a75.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaCallback.class)) {
                C4664x5395ce9a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(SchemaItem.class)) {
                C4666xdf5d9ae8.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Services.class)) {
                C4672xd5d6cbb2.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Token.class)) {
                ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Device.class)) {
                C4676xf1982dca.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ClassDevice.class)) {
                C4678x5ab6ac5f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(BMSInfo.class)) {
                C4680x20fc7e06.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Devices.class)) {
                C4684xaab8a0b.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(FilesUrl.class)) {
                C4686xbd7f885e.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceData.class)) {
                C4688xf4020777.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFieldItems.class)) {
                C4690x83bb1d33.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceStatus.class)) {
                C4692x82b5a23f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceCategory.class)) {
                C4694x8588f9e4.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceIndicator.class)) {
                C4696x936db447.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServicesList.class)) {
                C4700xb5dd9409.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(DomServiceTariff.class)) {
                C4698x9da95c4a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceFile.class)) {
                C4702x12a70883.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceMessages.class)) {
                C4704x27ddec53.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicket.class)) {
                C4706xcf10b813.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ServiceTicketType.class)) {
                C4708x7c8648ed.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketAccountsList.class)) {
                C4710x379415fc.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApartment.class)) {
                C4712x67ea0478.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketApplicant.class)) {
                C4714x6f4f4848.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketChatData.class)) {
                C4716x3c51d27a.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketInfo.class)) {
                C4718xb56c6186.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketObject.class)) {
                C4720x13bb7c97.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketPerformer.class)) {
                C4722x782e3a14.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketRating.class)) {
                C4724xb050ad75.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Tickets.class)) {
                C4730xd31c9f99.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketState.class)) {
                C4726x470e297.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketUrgency.class)) {
                C4728x7291458f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rooms.class)) {
                C4732xd254b890.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(MoreIconsInfo.class)) {
                C4734x3e5f4d91.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ActualCountersData.class)) {
                C4736x16a117c0.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentCompany.class)) {
                C4738x3e33c9bd.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(AttrRenta.class)) {
                C4740x60e6319b.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(PropertyRenta.class)) {
                C4742xdc63beb7.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttribute.class)) {
                C4744xe660f6a7.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfo.class)) {
                C4748x5c024f21.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentInfoObject.class)) {
                C4746x72770240.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentPermissions.class)) {
                C4750xebfdbb8f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentType.class)) {
                C4754xcc2cbaad.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentTypeAttr.class)) {
                C4752xf2aa007e.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(StateRenta.class)) {
                C4756x99acf311.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHuman.class)) {
                C4758xdaf4d606.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TimeSlotHumanValue.class)) {
                C4760xfaafb8e9.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TypeRent.class)) {
                C4762x65e9722d.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ManagePermissions.class)) {
                C4764xd43a5daf.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Rent.class)) {
                C4768x32c48847.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentChildren.class)) {
                C4766x7a38e7a6.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Renters.class)) {
                C4772xa5d8f71d.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentState.class)) {
                C4770xc85b1268.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingInfo.class)) {
                C4774x33c567d4.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotos.class)) {
                C4778x8713e227.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TalkingPhotosFile.class)) {
                C4776x6ae644c3.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(RentAttributes.class)) {
                C4794x165b0474.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
                C4798x7bd56e2e.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Options.class)) {
                C4802x9a8f8638.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(OptionsList.class)) {
                C4800x8b5430f6.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(Ticket.class)) {
                C4808x39dc6d46.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDescription.class)) {
                C4804xd885bb4.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(TicketDetail.class)) {
                C4806xa0f8f737.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoDates.class)) {
                C4810xdea6d8e5.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEvents.class)) {
                C4814x4a38c7d7.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoEventsList.class)) {
                C4812xdb358b15.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else if (superclass.equals(VideoUrl.class)) {
                C4816xc56fdf8f.insertOrUpdate(realm, it, (Map<RealmModel, Long>) hashMap);
            } else {
                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class, java.lang.Object, java.lang.Class<E>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends p046io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> r2, p046io.realm.Realm r3, org.json.JSONObject r4, boolean r5) throws org.json.JSONException {
        /*
            r1 = this;
            checkClass(r2)
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r0 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            ru.unicorn.ujin.ble.data.AvailablePassType r3 = p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0016:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r0 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            ru.unicorn.ujin.ble.data.BleKeyData r3 = p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0029:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r0 = p035ru.unicorn.ujin.ble.data.BleReader.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003c
            ru.unicorn.ujin.ble.data.BleReader r3 = p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x003c:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData> r0 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData r3 = p046io.realm.C4591x4d164271.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x004f:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse> r0 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0062
            ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse r3 = p046io.realm.C4593x1ca69248.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0062:
            java.lang.Class<ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData> r0 = p035ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0075
            ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData r3 = p046io.realm.C4595x5d0db86d.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0075:
            java.lang.Class<ru.unicorn.ujin.data.api.response.SubAccount> r0 = p035ru.unicorn.ujin.data.api.response.SubAccount.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0088
            ru.unicorn.ujin.data.api.response.SubAccount r3 = p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0088:
            java.lang.Class<ru.unicorn.ujin.data.entities.chats.Author> r0 = p035ru.unicorn.ujin.data.entities.chats.Author.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009b
            ru.unicorn.ujin.data.entities.chats.Author r3 = p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x009b:
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r0 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ae
            ru.unicorn.ujin.data.QrCodeForSave r3 = p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00ae:
            java.lang.Class<ru.unicorn.ujin.data.realm.AcceptanceDate> r0 = p035ru.unicorn.ujin.data.realm.AcceptanceDate.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c1
            ru.unicorn.ujin.data.realm.AcceptanceDate r3 = p046io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00c1:
            java.lang.Class<ru.unicorn.ujin.data.realm.Address> r0 = p035ru.unicorn.ujin.data.realm.Address.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d4
            ru.unicorn.ujin.data.realm.Address r3 = p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00d4:
            java.lang.Class<ru.unicorn.ujin.data.realm.ApartmentState> r0 = p035ru.unicorn.ujin.data.realm.ApartmentState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00e7
            ru.unicorn.ujin.data.realm.ApartmentState r3 = p046io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00e7:
            java.lang.Class<ru.unicorn.ujin.data.realm.Bank> r0 = p035ru.unicorn.ujin.data.realm.Bank.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00fa
            ru.unicorn.ujin.data.realm.Bank r3 = p046io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00fa:
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r0 = p035ru.unicorn.ujin.data.realm.Building.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010d
            ru.unicorn.ujin.data.realm.Building r3 = p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x010d:
            java.lang.Class<ru.unicorn.ujin.data.realm.Camera> r0 = p035ru.unicorn.ujin.data.realm.Camera.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0120
            ru.unicorn.ujin.data.realm.Camera r3 = p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0120:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.CompanyApplication> r0 = p035ru.unicorn.ujin.data.realm.company.CompanyApplication.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0133
            ru.unicorn.ujin.data.realm.company.CompanyApplication r3 = p046io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0133:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.EnterpriseApplication> r0 = p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0146
            ru.unicorn.ujin.data.realm.company.EnterpriseApplication r3 = p046io.realm.C4601xb6361989.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0146:
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r0 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0159
            ru.unicorn.ujin.data.realm.ContextBanner r3 = p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0159:
            java.lang.Class<ru.unicorn.ujin.data.realm.Feature> r0 = p035ru.unicorn.ujin.data.realm.Feature.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016c
            ru.unicorn.ujin.data.realm.Feature r3 = p046io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x016c:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r0 = p035ru.unicorn.ujin.data.realm.FileData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x017f
            ru.unicorn.ujin.data.realm.FileData r3 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x017f:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileMeta> r0 = p035ru.unicorn.ujin.data.realm.FileMeta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0192
            ru.unicorn.ujin.data.realm.FileMeta r3 = p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0192:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatButtons> r0 = p035ru.unicorn.ujin.data.realm.FlatButtons.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01a5
            ru.unicorn.ujin.data.realm.FlatButtons r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01a5:
            java.lang.Class<ru.unicorn.ujin.data.realm.Layout> r0 = p035ru.unicorn.ujin.data.realm.Layout.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01b8
            ru.unicorn.ujin.data.realm.Layout r3 = p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01b8:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01cb
            ru.unicorn.ujin.data.realm.marketplace.Banner r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01cb:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01de
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01de:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f1
            ru.unicorn.ujin.data.realm.marketplace.CartItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01f1:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0204
            ru.unicorn.ujin.data.realm.marketplace.CartOffer r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0204:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartTotal> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartTotal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0217
            ru.unicorn.ujin.data.realm.marketplace.CartTotal r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0217:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x022a
            ru.unicorn.ujin.data.realm.marketplace.Category r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x022a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023d
            ru.unicorn.ujin.data.realm.marketplace.CategoryItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x023d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0250
            ru.unicorn.ujin.data.realm.marketplace.Comment r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0250:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0263
            ru.unicorn.ujin.data.realm.marketplace.Company r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0263:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CompanyContact> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0276
            ru.unicorn.ujin.data.realm.marketplace.CompanyContact r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0276:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Component> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Component.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0289
            ru.unicorn.ujin.data.realm.marketplace.Component r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0289:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x029c
            ru.unicorn.ujin.data.realm.marketplace.Coupon r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x029c:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CouponImage> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CouponImage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02af
            ru.unicorn.ujin.data.realm.marketplace.CouponImage r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02af:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Field> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Field.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c2
            ru.unicorn.ujin.data.realm.marketplace.Field r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02c2:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02d5
            ru.unicorn.ujin.data.realm.marketplace.Offer r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02d5:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02e8
            ru.unicorn.ujin.data.realm.marketplace.Order r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02e8:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderAction> r0 = p035ru.unicorn.ujin.data.realm.marketplace.OrderAction.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02fb
            ru.unicorn.ujin.data.realm.marketplace.OrderAction r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02fb:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x030e
            ru.unicorn.ujin.data.realm.marketplace.OrderItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x030e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Parameter> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Parameter.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0321
            ru.unicorn.ujin.data.realm.marketplace.Parameter r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0321:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.PreviewImage> r0 = p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0334
            ru.unicorn.ujin.data.realm.marketplace.PreviewImage r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0334:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0347
            ru.unicorn.ujin.data.realm.marketplace.Promotion r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0347:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Property> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Property.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x035a
            ru.unicorn.ujin.data.realm.marketplace.Property r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x035a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r0 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x036d
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x036d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate> r0 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0380
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate r3 = p046io.realm.C4620xe7ed888c.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0380:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SampleWork> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SampleWork.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0393
            ru.unicorn.ujin.data.realm.marketplace.SampleWork r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0393:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SearchItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SearchItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03a6
            ru.unicorn.ujin.data.realm.marketplace.SearchItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03a6:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SelectValue> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SelectValue.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03b9
            ru.unicorn.ujin.data.realm.marketplace.SelectValue r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03b9:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Tag> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Tag.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03cc
            ru.unicorn.ujin.data.realm.marketplace.Tag r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03cc:
            java.lang.Class<ru.unicorn.ujin.data.realm.Meta> r0 = p035ru.unicorn.ujin.data.realm.Meta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03df
            ru.unicorn.ujin.data.realm.Meta r3 = p046io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03df:
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r0 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03f2
            ru.unicorn.ujin.data.realm.MyBeacon r3 = p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03f2:
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r0 = p035ru.unicorn.ujin.data.realm.News.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0405
            ru.unicorn.ujin.data.realm.News r3 = p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0405:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r0 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0418
            ru.unicorn.ujin.data.realm.notification.Notification r3 = p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0418:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.NotificationData> r0 = p035ru.unicorn.ujin.data.realm.notification.NotificationData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042b
            ru.unicorn.ujin.data.realm.notification.NotificationData r3 = p046io.realm.C4626xe255e1e5.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x042b:
            java.lang.Class<ru.unicorn.ujin.data.realm.Pamyatka> r0 = p035ru.unicorn.ujin.data.realm.Pamyatka.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x043e
            ru.unicorn.ujin.data.realm.Pamyatka r3 = p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x043e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r0 = p035ru.unicorn.ujin.data.realm.Point.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0451
            ru.unicorn.ujin.data.realm.Point r3 = p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0451:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.ApartmentRequest> r0 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0464
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0464:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r0 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0477
            ru.unicorn.ujin.data.realm.profile.DemoUser r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0477:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r0 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x048a
            ru.unicorn.ujin.data.realm.profile.RentBuilding r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x048a:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuildingAddress> r0 = p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x049d
            ru.unicorn.ujin.data.realm.profile.RentBuildingAddress r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x049d:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r0 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04b0
            ru.unicorn.ujin.data.realm.profile.RentComplex r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04b0:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r0 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04c3
            ru.unicorn.ujin.data.realm.profile.RentObject r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04c3:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r0 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04d6
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04d6:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r0 = p035ru.unicorn.ujin.data.realm.profile.User.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04e9
            ru.unicorn.ujin.data.realm.profile.User r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04e9:
            java.lang.Class<ru.unicorn.ujin.data.realm.ProviderCity> r0 = p035ru.unicorn.ujin.data.realm.ProviderCity.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04fc
            ru.unicorn.ujin.data.realm.ProviderCity r3 = p046io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04fc:
            java.lang.Class<ru.unicorn.ujin.data.realm.RealmString> r0 = p035ru.unicorn.ujin.data.realm.RealmString.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x050f
            ru.unicorn.ujin.data.realm.RealmString r3 = p046io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x050f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r0 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0522
            ru.unicorn.ujin.data.realm.Splashscreen r3 = p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0522:
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r0 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0535
            ru.unicorn.ujin.data.realm.TimeSlot r3 = p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0535:
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r0 = p035ru.unicorn.ujin.data.realm.Wifi.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0548
            ru.unicorn.ujin.data.realm.Wifi r3 = p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0548:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r0 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x055b
            ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r3 = p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x055b:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r0 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x056e
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r3 = p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x056e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0581
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r3 = p046io.realm.C4670xfcd8d37c.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0581:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.video.Video> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0594
            ru.unicorn.ujin.view.activity.navigation.entity.video.Video r3 = p046io.realm.C4674x1c4fffad.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0594:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05a7
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r3 = p046io.realm.C4682xb8d394dd.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05a7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05ba
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData r3 = p046io.realm.C4780xf0c1c3b9.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05ba:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05cd
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany r3 = p046io.realm.C4782x594eae38.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05cd:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05e0
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r3 = p046io.realm.C4784x85418d2d.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05e0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05f3
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r3 = p046io.realm.C4786xba887464.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05f3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0606
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle r3 = p046io.realm.C4788xc3a2b227.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0606:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0619
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData r3 = p046io.realm.C4792xa984038c.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0619:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x062c
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList r3 = p046io.realm.C4790xe661e44a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x062c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x063f
            ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyObject r3 = p046io.realm.C4796x4009dee4.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x063f:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0652
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r3 = p046io.realm.C4818xb7a5caf9.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0652:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0665
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r3 = p046io.realm.C4820x447e431f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0665:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.FromUser> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0678
            ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r3 = p046io.realm.C4822xab1ed299.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0678:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Status> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Status.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x068b
            ru.unicorn.ujin.view.fragments.makearecord.model.Status r3 = p046io.realm.C4824xe6f53cf6.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x068b:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ToUser> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x069e
            ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r3 = p046io.realm.C4826x725684ea.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x069e:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06b1
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r3 = p046io.realm.C4830x6d8ab071.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06b1:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06c4
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList r3 = p046io.realm.C4828xbbcd96af.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06c4:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06d7
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r3 = p046io.realm.C4832x38c73bbc.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06d7:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06ea
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r3 = p046io.realm.C4834x9fbcbe06.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06ea:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06fd
            ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO r3 = p046io.realm.C4836xc7389ad5.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06fd:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0710
            ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex r3 = p046io.realm.C4838xc3cde83a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0710:
            java.lang.Class<ru.unicorn.ujin.data.realm.Action> r0 = p035ru.unicorn.ujin.data.realm.Action.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0723
            ru.unicorn.ujin.data.realm.Action r3 = p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0723:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconAction> r0 = p035ru.unicorn.ujin.data.realm.BeaconAction.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0736
            ru.unicorn.ujin.data.realm.BeaconAction r3 = p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0736:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconActionDescription> r0 = p035ru.unicorn.ujin.data.realm.BeaconActionDescription.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0749
            ru.unicorn.ujin.data.realm.BeaconActionDescription r3 = p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0749:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardAdress> r0 = p035ru.unicorn.ujin.data.realm.CardAdress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x075c
            ru.unicorn.ujin.data.realm.CardAdress r3 = p046io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x075c:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardData> r0 = p035ru.unicorn.ujin.data.realm.CardData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x076f
            ru.unicorn.ujin.data.realm.CardData r3 = p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x076f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r0 = p035ru.unicorn.ujin.data.realm.Chat.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0782
            ru.unicorn.ujin.data.realm.Chat r3 = p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0782:
            java.lang.Class<ru.unicorn.ujin.data.realm.ChatListResponseData> r0 = p035ru.unicorn.ujin.data.realm.ChatListResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0795
            ru.unicorn.ujin.data.realm.ChatListResponseData r3 = p046io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0795:
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r0 = p035ru.unicorn.ujin.data.realm.City.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07a8
            ru.unicorn.ujin.data.realm.City r3 = p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07a8:
            java.lang.Class<ru.unicorn.ujin.data.realm.CityTitle> r0 = p035ru.unicorn.ujin.data.realm.CityTitle.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07bb
            ru.unicorn.ujin.data.realm.CityTitle r3 = p046io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07bb:
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r0 = p035ru.unicorn.ujin.data.realm.Complex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07ce
            ru.unicorn.ujin.data.realm.Complex r3 = p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07ce:
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r0 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07e1
            ru.unicorn.ujin.data.realm.ComplexInfo r3 = p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07e1:
            java.lang.Class<ru.unicorn.ujin.data.realm.Coordinates> r0 = p035ru.unicorn.ujin.data.realm.Coordinates.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07f4
            ru.unicorn.ujin.data.realm.Coordinates r3 = p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07f4:
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r0 = p035ru.unicorn.ujin.data.realm.Favourite.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0807
            ru.unicorn.ujin.data.realm.Favourite r3 = p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0807:
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r0 = p035ru.unicorn.ujin.data.realm.Flat.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x081a
            ru.unicorn.ujin.data.realm.Flat r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x081a:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatInfo> r0 = p035ru.unicorn.ujin.data.realm.FlatInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x082d
            ru.unicorn.ujin.data.realm.FlatInfo r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x082d:
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r0 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0840
            ru.unicorn.ujin.data.realm.GetFlatsResponseData r3 = p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0840:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageData> r0 = p035ru.unicorn.ujin.data.realm.ImageData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0853
            ru.unicorn.ujin.data.realm.ImageData r3 = p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0853:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageSize> r0 = p035ru.unicorn.ujin.data.realm.ImageSize.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0866
            ru.unicorn.ujin.data.realm.ImageSize r3 = p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0866:
            java.lang.Class<ru.unicorn.ujin.data.realm.Intercom> r0 = p035ru.unicorn.ujin.data.realm.Intercom.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0879
            ru.unicorn.ujin.data.realm.Intercom r3 = p046io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0879:
            java.lang.Class<ru.unicorn.ujin.data.realm.IntercomVal> r0 = p035ru.unicorn.ujin.data.realm.IntercomVal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x088c
            ru.unicorn.ujin.data.realm.IntercomVal r3 = p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x088c:
            java.lang.Class<ru.unicorn.ujin.data.realm.Mortrage> r0 = p035ru.unicorn.ujin.data.realm.Mortrage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x089f
            ru.unicorn.ujin.data.realm.Mortrage r3 = p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x089f:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCard> r0 = p035ru.unicorn.ujin.data.realm.PassCard.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08b2
            ru.unicorn.ujin.data.realm.PassCard r3 = p046io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08b2:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCardUno> r0 = p035ru.unicorn.ujin.data.realm.PassCardUno.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08c5
            ru.unicorn.ujin.data.realm.PassCardUno r3 = p046io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08c5:
            java.lang.Class<ru.unicorn.ujin.data.realm.Price> r0 = p035ru.unicorn.ujin.data.realm.Price.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08d8
            ru.unicorn.ujin.data.realm.Price r3 = p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08d8:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r0 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08eb
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08eb:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipOpenDoorParam> r0 = p035ru.unicorn.ujin.data.realm.SipOpenDoorParam.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08fe
            ru.unicorn.ujin.data.realm.SipOpenDoorParam r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08fe:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r0 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0911
            ru.unicorn.ujin.data.realm.SipParametrs r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0911:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipPreviewParams> r0 = p035ru.unicorn.ujin.data.realm.SipPreviewParams.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0924
            ru.unicorn.ujin.data.realm.SipPreviewParams r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0924:
            java.lang.Class<ru.unicorn.ujin.data.realm.Size> r0 = p035ru.unicorn.ujin.data.realm.Size.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0937
            ru.unicorn.ujin.data.realm.Size r3 = p046io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0937:
            java.lang.Class<ru.unicorn.ujin.data.realm.UnreadBadge> r0 = p035ru.unicorn.ujin.data.realm.UnreadBadge.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x094a
            ru.unicorn.ujin.data.realm.UnreadBadge r3 = p046io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x094a:
            java.lang.Class<ru.unicorn.ujin.data.service.location.FavoriteBeacon> r0 = p035ru.unicorn.ujin.data.service.location.FavoriteBeacon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x095d
            ru.unicorn.ujin.data.service.location.FavoriteBeacon r3 = p046io.realm.ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x095d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.DeviceModel> r0 = p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0970
            ru.unicorn.ujin.view.activity.navigation.api.DeviceModel r3 = p046io.realm.C4637x5b79bd5a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0970:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.SignalRemote> r0 = p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0983
            ru.unicorn.ujin.view.activity.navigation.api.SignalRemote r3 = p046io.realm.C4639x6ab32465.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0983:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0996
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r3 = p046io.realm.C4642xba9ad755.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0996:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09a9
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal r3 = p046io.realm.C4644x8f0def9d.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09a9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09bc
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType r3 = p046io.realm.C4646xa509baca.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09bc:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09cf
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r3 = p046io.realm.C4648x51014856.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09cf:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09e2
            ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r3 = p046io.realm.C4650xa7ebbdf7.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09e2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09f5
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl r3 = p046io.realm.C4652xadba3b3e.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09f5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a08
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r3 = p046io.realm.C4654x9b0b7455.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a08:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.State> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a1b
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.State r3 = p046io.realm.C4656xbdeaa6ca.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a1b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a2e
            ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons r3 = p046io.realm.C4658x6180a4a3.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a2e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a41
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard r3 = p046io.realm.C4660xccbea62f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a41:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a54
            ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion r3 = p046io.realm.C4662xc0a23e3a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a54:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a67
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r3 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a67:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a7a
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r3 = p046io.realm.C4664x5395ce9a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a7a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a8d
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem r3 = p046io.realm.C4666xdf5d9ae8.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a8d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Services> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aa0
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Services r3 = p046io.realm.C4672xd5d6cbb2.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aa0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.Token> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.Token.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ab3
            ru.unicorn.ujin.view.activity.navigation.entity.Token r3 = p046io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ab3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r0 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ac6
            ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r3 = p046io.realm.C4676xf1982dca.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ac6:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ad9
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice r3 = p046io.realm.C4678x5ab6ac5f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ad9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aec
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo r3 = p046io.realm.C4680x20fc7e06.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aec:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aff
            ru.unicorn.ujin.view.activity.navigation.ui.device.Devices r3 = p046io.realm.C4684xaab8a0b.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aff:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b12
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl r3 = p046io.realm.C4686xbd7f885e.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b12:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b25
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData r3 = p046io.realm.C4688xf4020777.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b25:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b38
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems r3 = p046io.realm.C4690x83bb1d33.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b38:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b4b
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus r3 = p046io.realm.C4692x82b5a23f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b4b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b5e
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory r3 = p046io.realm.C4694x8588f9e4.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b5e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b71
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator r3 = p046io.realm.C4696x936db447.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b71:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b84
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList r3 = p046io.realm.C4700xb5dd9409.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b84:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b97
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff r3 = p046io.realm.C4698x9da95c4a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b97:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0baa
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r3 = p046io.realm.C4702x12a70883.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0baa:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bbd
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r3 = p046io.realm.C4704x27ddec53.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bbd:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bd0
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r3 = p046io.realm.C4706xcf10b813.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bd0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0be3
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType r3 = p046io.realm.C4708x7c8648ed.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0be3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bf6
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList r3 = p046io.realm.C4710x379415fc.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bf6:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c09
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment r3 = p046io.realm.C4712x67ea0478.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c09:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c1c
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant r3 = p046io.realm.C4714x6f4f4848.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c1c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c2f
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData r3 = p046io.realm.C4716x3c51d27a.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c2f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c42
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r3 = p046io.realm.C4718xb56c6186.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c42:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c55
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject r3 = p046io.realm.C4720x13bb7c97.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c55:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c68
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer r3 = p046io.realm.C4722x782e3a14.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c68:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c7b
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r3 = p046io.realm.C4724xb050ad75.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c7b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c8e
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets r3 = p046io.realm.C4730xd31c9f99.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c8e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ca1
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState r3 = p046io.realm.C4726x470e297.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ca1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cb4
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency r3 = p046io.realm.C4728x7291458f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cb4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cc7
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms r3 = p046io.realm.C4732xd254b890.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cc7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cda
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo r3 = p046io.realm.C4734x3e5f4d91.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cda:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.ActualCountersData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ced
            ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData r3 = p046io.realm.C4736x16a117c0.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ced:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d00
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r3 = p046io.realm.C4738x3e33c9bd.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d00:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d13
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r3 = p046io.realm.C4740x60e6319b.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d13:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d26
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r3 = p046io.realm.C4742xdc63beb7.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d26:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentAttribute.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d39
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute r3 = p046io.realm.C4744xe660f6a7.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d39:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d4c
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r3 = p046io.realm.C4748x5c024f21.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d4c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d5f
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject r3 = p046io.realm.C4746x72770240.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d5f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d72
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions r3 = p046io.realm.C4750xebfdbb8f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d72:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d85
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType r3 = p046io.realm.C4754xcc2cbaad.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d85:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d98
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r3 = p046io.realm.C4752xf2aa007e.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d98:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dab
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r3 = p046io.realm.C4756x99acf311.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dab:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dbe
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman r3 = p046io.realm.C4758xdaf4d606.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dbe:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dd1
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue r3 = p046io.realm.C4760xfaafb8e9.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dd1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0de4
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r3 = p046io.realm.C4762x65e9722d.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0de4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0df7
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r3 = p046io.realm.C4764xd43a5daf.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0df7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e0a
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r3 = p046io.realm.C4768x32c48847.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e0a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e1d
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r3 = p046io.realm.C4766x7a38e7a6.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e1d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e30
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r3 = p046io.realm.C4772xa5d8f71d.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e30:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e43
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState r3 = p046io.realm.C4770xc85b1268.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e43:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e56
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r3 = p046io.realm.C4774x33c567d4.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e56:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e69
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r3 = p046io.realm.C4778x8713e227.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e69:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e7c
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r3 = p046io.realm.C4776x6ae644c3.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e7c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e8f
            ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes r3 = p046io.realm.C4794x165b0474.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e8f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ea2
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd r3 = p046io.realm.C4798x7bd56e2e.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ea2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eb5
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r3 = p046io.realm.C4802x9a8f8638.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0eb5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ec8
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList r3 = p046io.realm.C4800x8b5430f6.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ec8:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Ticket.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0edb
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket r3 = p046io.realm.C4808x39dc6d46.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0edb:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eee
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription r3 = p046io.realm.C4804xd885bb4.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0eee:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetail.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f01
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail r3 = p046io.realm.C4806xa0f8f737.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f01:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f14
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates r3 = p046io.realm.C4810xdea6d8e5.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f14:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f27
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents r3 = p046io.realm.C4814x4a38c7d7.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f27:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f3a
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList r3 = p046io.realm.C4812xdb358b15.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f3a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f4d
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl r3 = p046io.realm.C4816xc56fdf8f.createOrUpdateUsingJsonObject(r3, r4, r5)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f4d:
            io.realm.exceptions.RealmException r2 = getMissingProxyClassException((java.lang.Class<? extends p046io.realm.RealmModel>) r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.DefaultRealmModuleMediator.createOrUpdateUsingJsonObject(java.lang.Class, io.realm.Realm, org.json.JSONObject, boolean):io.realm.RealmModel");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class, java.lang.Object, java.lang.Class<E>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends p046io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> r2, p046io.realm.Realm r3, android.util.JsonReader r4) throws java.io.IOException {
        /*
            r1 = this;
            checkClass(r2)
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r0 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            ru.unicorn.ujin.ble.data.AvailablePassType r3 = p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0016:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r0 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0029
            ru.unicorn.ujin.ble.data.BleKeyData r3 = p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0029:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r0 = p035ru.unicorn.ujin.ble.data.BleReader.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003c
            ru.unicorn.ujin.ble.data.BleReader r3 = p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x003c:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData> r0 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004f
            ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData r3 = p046io.realm.C4591x4d164271.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x004f:
            java.lang.Class<ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse> r0 = p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0062
            ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse r3 = p046io.realm.C4593x1ca69248.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0062:
            java.lang.Class<ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData> r0 = p035ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0075
            ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData r3 = p046io.realm.C4595x5d0db86d.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0075:
            java.lang.Class<ru.unicorn.ujin.data.api.response.SubAccount> r0 = p035ru.unicorn.ujin.data.api.response.SubAccount.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0088
            ru.unicorn.ujin.data.api.response.SubAccount r3 = p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0088:
            java.lang.Class<ru.unicorn.ujin.data.entities.chats.Author> r0 = p035ru.unicorn.ujin.data.entities.chats.Author.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009b
            ru.unicorn.ujin.data.entities.chats.Author r3 = p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x009b:
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r0 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ae
            ru.unicorn.ujin.data.QrCodeForSave r3 = p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00ae:
            java.lang.Class<ru.unicorn.ujin.data.realm.AcceptanceDate> r0 = p035ru.unicorn.ujin.data.realm.AcceptanceDate.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c1
            ru.unicorn.ujin.data.realm.AcceptanceDate r3 = p046io.realm.ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00c1:
            java.lang.Class<ru.unicorn.ujin.data.realm.Address> r0 = p035ru.unicorn.ujin.data.realm.Address.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d4
            ru.unicorn.ujin.data.realm.Address r3 = p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00d4:
            java.lang.Class<ru.unicorn.ujin.data.realm.ApartmentState> r0 = p035ru.unicorn.ujin.data.realm.ApartmentState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00e7
            ru.unicorn.ujin.data.realm.ApartmentState r3 = p046io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00e7:
            java.lang.Class<ru.unicorn.ujin.data.realm.Bank> r0 = p035ru.unicorn.ujin.data.realm.Bank.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00fa
            ru.unicorn.ujin.data.realm.Bank r3 = p046io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x00fa:
            java.lang.Class<ru.unicorn.ujin.data.realm.Building> r0 = p035ru.unicorn.ujin.data.realm.Building.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010d
            ru.unicorn.ujin.data.realm.Building r3 = p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x010d:
            java.lang.Class<ru.unicorn.ujin.data.realm.Camera> r0 = p035ru.unicorn.ujin.data.realm.Camera.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0120
            ru.unicorn.ujin.data.realm.Camera r3 = p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0120:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.CompanyApplication> r0 = p035ru.unicorn.ujin.data.realm.company.CompanyApplication.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0133
            ru.unicorn.ujin.data.realm.company.CompanyApplication r3 = p046io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0133:
            java.lang.Class<ru.unicorn.ujin.data.realm.company.EnterpriseApplication> r0 = p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0146
            ru.unicorn.ujin.data.realm.company.EnterpriseApplication r3 = p046io.realm.C4601xb6361989.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0146:
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r0 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0159
            ru.unicorn.ujin.data.realm.ContextBanner r3 = p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0159:
            java.lang.Class<ru.unicorn.ujin.data.realm.Feature> r0 = p035ru.unicorn.ujin.data.realm.Feature.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016c
            ru.unicorn.ujin.data.realm.Feature r3 = p046io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x016c:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r0 = p035ru.unicorn.ujin.data.realm.FileData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x017f
            ru.unicorn.ujin.data.realm.FileData r3 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x017f:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileMeta> r0 = p035ru.unicorn.ujin.data.realm.FileMeta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0192
            ru.unicorn.ujin.data.realm.FileMeta r3 = p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0192:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatButtons> r0 = p035ru.unicorn.ujin.data.realm.FlatButtons.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01a5
            ru.unicorn.ujin.data.realm.FlatButtons r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01a5:
            java.lang.Class<ru.unicorn.ujin.data.realm.Layout> r0 = p035ru.unicorn.ujin.data.realm.Layout.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01b8
            ru.unicorn.ujin.data.realm.Layout r3 = p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01b8:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01cb
            ru.unicorn.ujin.data.realm.marketplace.Banner r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01cb:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01de
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01de:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f1
            ru.unicorn.ujin.data.realm.marketplace.CartItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x01f1:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0204
            ru.unicorn.ujin.data.realm.marketplace.CartOffer r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0204:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartTotal> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CartTotal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0217
            ru.unicorn.ujin.data.realm.marketplace.CartTotal r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0217:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x022a
            ru.unicorn.ujin.data.realm.marketplace.Category r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x022a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x023d
            ru.unicorn.ujin.data.realm.marketplace.CategoryItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x023d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0250
            ru.unicorn.ujin.data.realm.marketplace.Comment r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0250:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0263
            ru.unicorn.ujin.data.realm.marketplace.Company r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0263:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CompanyContact> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0276
            ru.unicorn.ujin.data.realm.marketplace.CompanyContact r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0276:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Component> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Component.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0289
            ru.unicorn.ujin.data.realm.marketplace.Component r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0289:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x029c
            ru.unicorn.ujin.data.realm.marketplace.Coupon r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x029c:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CouponImage> r0 = p035ru.unicorn.ujin.data.realm.marketplace.CouponImage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02af
            ru.unicorn.ujin.data.realm.marketplace.CouponImage r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02af:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Field> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Field.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c2
            ru.unicorn.ujin.data.realm.marketplace.Field r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02c2:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02d5
            ru.unicorn.ujin.data.realm.marketplace.Offer r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02d5:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02e8
            ru.unicorn.ujin.data.realm.marketplace.Order r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02e8:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderAction> r0 = p035ru.unicorn.ujin.data.realm.marketplace.OrderAction.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02fb
            ru.unicorn.ujin.data.realm.marketplace.OrderAction r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x02fb:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x030e
            ru.unicorn.ujin.data.realm.marketplace.OrderItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x030e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Parameter> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Parameter.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0321
            ru.unicorn.ujin.data.realm.marketplace.Parameter r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0321:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.PreviewImage> r0 = p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0334
            ru.unicorn.ujin.data.realm.marketplace.PreviewImage r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0334:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0347
            ru.unicorn.ujin.data.realm.marketplace.Promotion r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0347:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Property> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Property.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x035a
            ru.unicorn.ujin.data.realm.marketplace.Property r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x035a:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r0 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x036d
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x036d:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate> r0 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0380
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate r3 = p046io.realm.C4620xe7ed888c.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0380:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SampleWork> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SampleWork.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0393
            ru.unicorn.ujin.data.realm.marketplace.SampleWork r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0393:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SearchItem> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SearchItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03a6
            ru.unicorn.ujin.data.realm.marketplace.SearchItem r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03a6:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.SelectValue> r0 = p035ru.unicorn.ujin.data.realm.marketplace.SelectValue.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03b9
            ru.unicorn.ujin.data.realm.marketplace.SelectValue r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03b9:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Tag> r0 = p035ru.unicorn.ujin.data.realm.marketplace.Tag.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03cc
            ru.unicorn.ujin.data.realm.marketplace.Tag r3 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03cc:
            java.lang.Class<ru.unicorn.ujin.data.realm.Meta> r0 = p035ru.unicorn.ujin.data.realm.Meta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03df
            ru.unicorn.ujin.data.realm.Meta r3 = p046io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03df:
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r0 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x03f2
            ru.unicorn.ujin.data.realm.MyBeacon r3 = p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x03f2:
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r0 = p035ru.unicorn.ujin.data.realm.News.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0405
            ru.unicorn.ujin.data.realm.News r3 = p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0405:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r0 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0418
            ru.unicorn.ujin.data.realm.notification.Notification r3 = p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0418:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.NotificationData> r0 = p035ru.unicorn.ujin.data.realm.notification.NotificationData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042b
            ru.unicorn.ujin.data.realm.notification.NotificationData r3 = p046io.realm.C4626xe255e1e5.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x042b:
            java.lang.Class<ru.unicorn.ujin.data.realm.Pamyatka> r0 = p035ru.unicorn.ujin.data.realm.Pamyatka.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x043e
            ru.unicorn.ujin.data.realm.Pamyatka r3 = p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x043e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r0 = p035ru.unicorn.ujin.data.realm.Point.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0451
            ru.unicorn.ujin.data.realm.Point r3 = p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0451:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.ApartmentRequest> r0 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0464
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0464:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r0 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0477
            ru.unicorn.ujin.data.realm.profile.DemoUser r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0477:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r0 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x048a
            ru.unicorn.ujin.data.realm.profile.RentBuilding r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x048a:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuildingAddress> r0 = p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x049d
            ru.unicorn.ujin.data.realm.profile.RentBuildingAddress r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x049d:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r0 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04b0
            ru.unicorn.ujin.data.realm.profile.RentComplex r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04b0:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObject> r0 = p035ru.unicorn.ujin.data.realm.profile.RentObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04c3
            ru.unicorn.ujin.data.realm.profile.RentObject r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04c3:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r0 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04d6
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04d6:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r0 = p035ru.unicorn.ujin.data.realm.profile.User.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04e9
            ru.unicorn.ujin.data.realm.profile.User r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04e9:
            java.lang.Class<ru.unicorn.ujin.data.realm.ProviderCity> r0 = p035ru.unicorn.ujin.data.realm.ProviderCity.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04fc
            ru.unicorn.ujin.data.realm.ProviderCity r3 = p046io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x04fc:
            java.lang.Class<ru.unicorn.ujin.data.realm.RealmString> r0 = p035ru.unicorn.ujin.data.realm.RealmString.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x050f
            ru.unicorn.ujin.data.realm.RealmString r3 = p046io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x050f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r0 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0522
            ru.unicorn.ujin.data.realm.Splashscreen r3 = p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0522:
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r0 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0535
            ru.unicorn.ujin.data.realm.TimeSlot r3 = p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0535:
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r0 = p035ru.unicorn.ujin.data.realm.Wifi.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0548
            ru.unicorn.ujin.data.realm.Wifi r3 = p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0548:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r0 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x055b
            ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r3 = p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x055b:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r0 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x056e
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r3 = p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x056e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0581
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r3 = p046io.realm.C4670xfcd8d37c.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0581:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.video.Video> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0594
            ru.unicorn.ujin.view.activity.navigation.entity.video.Video r3 = p046io.realm.C4674x1c4fffad.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0594:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05a7
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r3 = p046io.realm.C4682xb8d394dd.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05a7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05ba
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData r3 = p046io.realm.C4780xf0c1c3b9.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05ba:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05cd
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany r3 = p046io.realm.C4782x594eae38.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05cd:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05e0
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r3 = p046io.realm.C4784x85418d2d.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05e0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x05f3
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r3 = p046io.realm.C4786xba887464.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x05f3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0606
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle r3 = p046io.realm.C4788xc3a2b227.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0606:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0619
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactData r3 = p046io.realm.C4792xa984038c.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0619:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x062c
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.ContactDataList r3 = p046io.realm.C4790xe661e44a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x062c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x063f
            ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyObject r3 = p046io.realm.C4796x4009dee4.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x063f:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0652
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r3 = p046io.realm.C4818xb7a5caf9.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0652:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0665
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r3 = p046io.realm.C4820x447e431f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0665:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.FromUser> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0678
            ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r3 = p046io.realm.C4822xab1ed299.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0678:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Status> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Status.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x068b
            ru.unicorn.ujin.view.fragments.makearecord.model.Status r3 = p046io.realm.C4824xe6f53cf6.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x068b:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ToUser> r0 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x069e
            ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r3 = p046io.realm.C4826x725684ea.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x069e:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06b1
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r3 = p046io.realm.C4830x6d8ab071.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06b1:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06c4
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList r3 = p046io.realm.C4828xbbcd96af.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06c4:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06d7
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r3 = p046io.realm.C4832x38c73bbc.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06d7:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06ea
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r3 = p046io.realm.C4834x9fbcbe06.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06ea:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06fd
            ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO r3 = p046io.realm.C4836xc7389ad5.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x06fd:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex> r0 = p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0710
            ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex r3 = p046io.realm.C4838xc3cde83a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0710:
            java.lang.Class<ru.unicorn.ujin.data.realm.Action> r0 = p035ru.unicorn.ujin.data.realm.Action.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0723
            ru.unicorn.ujin.data.realm.Action r3 = p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0723:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconAction> r0 = p035ru.unicorn.ujin.data.realm.BeaconAction.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0736
            ru.unicorn.ujin.data.realm.BeaconAction r3 = p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0736:
            java.lang.Class<ru.unicorn.ujin.data.realm.BeaconActionDescription> r0 = p035ru.unicorn.ujin.data.realm.BeaconActionDescription.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0749
            ru.unicorn.ujin.data.realm.BeaconActionDescription r3 = p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0749:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardAdress> r0 = p035ru.unicorn.ujin.data.realm.CardAdress.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x075c
            ru.unicorn.ujin.data.realm.CardAdress r3 = p046io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x075c:
            java.lang.Class<ru.unicorn.ujin.data.realm.CardData> r0 = p035ru.unicorn.ujin.data.realm.CardData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x076f
            ru.unicorn.ujin.data.realm.CardData r3 = p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x076f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r0 = p035ru.unicorn.ujin.data.realm.Chat.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0782
            ru.unicorn.ujin.data.realm.Chat r3 = p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0782:
            java.lang.Class<ru.unicorn.ujin.data.realm.ChatListResponseData> r0 = p035ru.unicorn.ujin.data.realm.ChatListResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0795
            ru.unicorn.ujin.data.realm.ChatListResponseData r3 = p046io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0795:
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r0 = p035ru.unicorn.ujin.data.realm.City.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07a8
            ru.unicorn.ujin.data.realm.City r3 = p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07a8:
            java.lang.Class<ru.unicorn.ujin.data.realm.CityTitle> r0 = p035ru.unicorn.ujin.data.realm.CityTitle.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07bb
            ru.unicorn.ujin.data.realm.CityTitle r3 = p046io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07bb:
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r0 = p035ru.unicorn.ujin.data.realm.Complex.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07ce
            ru.unicorn.ujin.data.realm.Complex r3 = p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07ce:
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r0 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07e1
            ru.unicorn.ujin.data.realm.ComplexInfo r3 = p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07e1:
            java.lang.Class<ru.unicorn.ujin.data.realm.Coordinates> r0 = p035ru.unicorn.ujin.data.realm.Coordinates.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07f4
            ru.unicorn.ujin.data.realm.Coordinates r3 = p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x07f4:
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r0 = p035ru.unicorn.ujin.data.realm.Favourite.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0807
            ru.unicorn.ujin.data.realm.Favourite r3 = p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0807:
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r0 = p035ru.unicorn.ujin.data.realm.Flat.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x081a
            ru.unicorn.ujin.data.realm.Flat r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x081a:
            java.lang.Class<ru.unicorn.ujin.data.realm.FlatInfo> r0 = p035ru.unicorn.ujin.data.realm.FlatInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x082d
            ru.unicorn.ujin.data.realm.FlatInfo r3 = p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x082d:
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r0 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0840
            ru.unicorn.ujin.data.realm.GetFlatsResponseData r3 = p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0840:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageData> r0 = p035ru.unicorn.ujin.data.realm.ImageData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0853
            ru.unicorn.ujin.data.realm.ImageData r3 = p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0853:
            java.lang.Class<ru.unicorn.ujin.data.realm.ImageSize> r0 = p035ru.unicorn.ujin.data.realm.ImageSize.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0866
            ru.unicorn.ujin.data.realm.ImageSize r3 = p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0866:
            java.lang.Class<ru.unicorn.ujin.data.realm.Intercom> r0 = p035ru.unicorn.ujin.data.realm.Intercom.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0879
            ru.unicorn.ujin.data.realm.Intercom r3 = p046io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0879:
            java.lang.Class<ru.unicorn.ujin.data.realm.IntercomVal> r0 = p035ru.unicorn.ujin.data.realm.IntercomVal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x088c
            ru.unicorn.ujin.data.realm.IntercomVal r3 = p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x088c:
            java.lang.Class<ru.unicorn.ujin.data.realm.Mortrage> r0 = p035ru.unicorn.ujin.data.realm.Mortrage.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x089f
            ru.unicorn.ujin.data.realm.Mortrage r3 = p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x089f:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCard> r0 = p035ru.unicorn.ujin.data.realm.PassCard.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08b2
            ru.unicorn.ujin.data.realm.PassCard r3 = p046io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08b2:
            java.lang.Class<ru.unicorn.ujin.data.realm.PassCardUno> r0 = p035ru.unicorn.ujin.data.realm.PassCardUno.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08c5
            ru.unicorn.ujin.data.realm.PassCardUno r3 = p046io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08c5:
            java.lang.Class<ru.unicorn.ujin.data.realm.Price> r0 = p035ru.unicorn.ujin.data.realm.Price.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08d8
            ru.unicorn.ujin.data.realm.Price r3 = p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08d8:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r0 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08eb
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08eb:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipOpenDoorParam> r0 = p035ru.unicorn.ujin.data.realm.SipOpenDoorParam.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08fe
            ru.unicorn.ujin.data.realm.SipOpenDoorParam r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x08fe:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r0 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0911
            ru.unicorn.ujin.data.realm.SipParametrs r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0911:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipPreviewParams> r0 = p035ru.unicorn.ujin.data.realm.SipPreviewParams.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0924
            ru.unicorn.ujin.data.realm.SipPreviewParams r3 = p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0924:
            java.lang.Class<ru.unicorn.ujin.data.realm.Size> r0 = p035ru.unicorn.ujin.data.realm.Size.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0937
            ru.unicorn.ujin.data.realm.Size r3 = p046io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0937:
            java.lang.Class<ru.unicorn.ujin.data.realm.UnreadBadge> r0 = p035ru.unicorn.ujin.data.realm.UnreadBadge.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x094a
            ru.unicorn.ujin.data.realm.UnreadBadge r3 = p046io.realm.ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x094a:
            java.lang.Class<ru.unicorn.ujin.data.service.location.FavoriteBeacon> r0 = p035ru.unicorn.ujin.data.service.location.FavoriteBeacon.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x095d
            ru.unicorn.ujin.data.service.location.FavoriteBeacon r3 = p046io.realm.ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x095d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.DeviceModel> r0 = p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0970
            ru.unicorn.ujin.view.activity.navigation.api.DeviceModel r3 = p046io.realm.C4637x5b79bd5a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0970:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.api.SignalRemote> r0 = p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0983
            ru.unicorn.ujin.view.activity.navigation.api.SignalRemote r3 = p046io.realm.C4639x6ab32465.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0983:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0996
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware r3 = p046io.realm.C4642xba9ad755.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0996:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09a9
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal r3 = p046io.realm.C4644x8f0def9d.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09a9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09bc
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.ManagementType r3 = p046io.realm.C4646xa509baca.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09bc:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09cf
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r3 = p046io.realm.C4648x51014856.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09cf:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09e2
            ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r3 = p046io.realm.C4650xa7ebbdf7.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09e2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x09f5
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl r3 = p046io.realm.C4652xadba3b3e.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x09f5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a08
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r3 = p046io.realm.C4654x9b0b7455.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a08:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.State> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a1b
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.State r3 = p046io.realm.C4656xbdeaa6ca.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a1b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a2e
            ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons r3 = p046io.realm.C4658x6180a4a3.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a2e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a41
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard r3 = p046io.realm.C4660xccbea62f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a41:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a54
            ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion r3 = p046io.realm.C4662xc0a23e3a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a54:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a67
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r3 = p046io.realm.C4668xcf375a75.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a67:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a7a
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r3 = p046io.realm.C4664x5395ce9a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a7a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a8d
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem r3 = p046io.realm.C4666xdf5d9ae8.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0a8d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Services> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aa0
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Services r3 = p046io.realm.C4672xd5d6cbb2.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aa0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.Token> r0 = p035ru.unicorn.ujin.view.activity.navigation.entity.Token.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ab3
            ru.unicorn.ujin.view.activity.navigation.entity.Token r3 = p046io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ab3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r0 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ac6
            ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r3 = p046io.realm.C4676xf1982dca.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ac6:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ad9
            ru.unicorn.ujin.view.activity.navigation.ui.addhardware.ClassDevice r3 = p046io.realm.C4678x5ab6ac5f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ad9:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aec
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo r3 = p046io.realm.C4680x20fc7e06.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aec:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0aff
            ru.unicorn.ujin.view.activity.navigation.ui.device.Devices r3 = p046io.realm.C4684xaab8a0b.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0aff:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b12
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.FilesUrl r3 = p046io.realm.C4686xbd7f885e.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b12:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b25
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceData r3 = p046io.realm.C4688xf4020777.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b25:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFieldItems.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b38
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceFieldItems r3 = p046io.realm.C4690x83bb1d33.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b38:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b4b
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ServiceStatus r3 = p046io.realm.C4692x82b5a23f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b4b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b5e
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceCategory r3 = p046io.realm.C4694x8588f9e4.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b5e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b71
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceIndicator r3 = p046io.realm.C4696x936db447.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b71:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b84
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicesList r3 = p046io.realm.C4700xb5dd9409.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b84:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0b97
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceTariff r3 = p046io.realm.C4698x9da95c4a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0b97:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0baa
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r3 = p046io.realm.C4702x12a70883.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0baa:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bbd
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r3 = p046io.realm.C4704x27ddec53.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bbd:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bd0
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r3 = p046io.realm.C4706xcf10b813.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bd0:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0be3
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType r3 = p046io.realm.C4708x7c8648ed.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0be3:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0bf6
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList r3 = p046io.realm.C4710x379415fc.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0bf6:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c09
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment r3 = p046io.realm.C4712x67ea0478.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c09:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c1c
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant r3 = p046io.realm.C4714x6f4f4848.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c1c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c2f
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData r3 = p046io.realm.C4716x3c51d27a.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c2f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c42
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r3 = p046io.realm.C4718xb56c6186.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c42:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c55
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject r3 = p046io.realm.C4720x13bb7c97.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c55:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c68
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer r3 = p046io.realm.C4722x782e3a14.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c68:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c7b
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r3 = p046io.realm.C4724xb050ad75.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c7b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0c8e
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets r3 = p046io.realm.C4730xd31c9f99.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0c8e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ca1
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState r3 = p046io.realm.C4726x470e297.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ca1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cb4
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency r3 = p046io.realm.C4728x7291458f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cb4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cc7
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.Rooms r3 = p046io.realm.C4732xd254b890.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cc7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0cda
            ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.MoreIconsInfo r3 = p046io.realm.C4734x3e5f4d91.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0cda:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.ActualCountersData.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ced
            ru.unicorn.ujin.view.activity.navigation.ui.measures.ActualCountersData r3 = p046io.realm.C4736x16a117c0.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ced:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d00
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r3 = p046io.realm.C4738x3e33c9bd.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d00:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d13
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r3 = p046io.realm.C4740x60e6319b.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d13:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d26
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r3 = p046io.realm.C4742xdc63beb7.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d26:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentAttribute.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d39
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentAttribute r3 = p046io.realm.C4744xe660f6a7.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d39:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d4c
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r3 = p046io.realm.C4748x5c024f21.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d4c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d5f
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject r3 = p046io.realm.C4746x72770240.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d5f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d72
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentPermissions r3 = p046io.realm.C4750xebfdbb8f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d72:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d85
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType r3 = p046io.realm.C4754xcc2cbaad.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d85:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0d98
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r3 = p046io.realm.C4752xf2aa007e.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0d98:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dab
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r3 = p046io.realm.C4756x99acf311.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dab:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dbe
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHuman r3 = p046io.realm.C4758xdaf4d606.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dbe:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0dd1
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlotHumanValue r3 = p046io.realm.C4760xfaafb8e9.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0dd1:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0de4
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r3 = p046io.realm.C4762x65e9722d.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0de4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0df7
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r3 = p046io.realm.C4764xd43a5daf.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0df7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e0a
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r3 = p046io.realm.C4768x32c48847.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e0a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e1d
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r3 = p046io.realm.C4766x7a38e7a6.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e1d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e30
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r3 = p046io.realm.C4772xa5d8f71d.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e30:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e43
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState r3 = p046io.realm.C4770xc85b1268.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e43:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e56
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r3 = p046io.realm.C4774x33c567d4.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e56:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e69
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r3 = p046io.realm.C4778x8713e227.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e69:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e7c
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r3 = p046io.realm.C4776x6ae644c3.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e7c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0e8f
            ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes r3 = p046io.realm.C4794x165b0474.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0e8f:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ea2
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd r3 = p046io.realm.C4798x7bd56e2e.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ea2:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eb5
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r3 = p046io.realm.C4802x9a8f8638.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0eb5:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ec8
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList r3 = p046io.realm.C4800x8b5430f6.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0ec8:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Ticket.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0edb
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.Ticket r3 = p046io.realm.C4808x39dc6d46.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0edb:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0eee
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDescription r3 = p046io.realm.C4804xd885bb4.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0eee:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetail.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f01
            ru.unicorn.ujin.view.activity.navigation.ui.ticket.TicketDetail r3 = p046io.realm.C4806xa0f8f737.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f01:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f14
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoDates r3 = p046io.realm.C4810xdea6d8e5.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f14:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f27
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEvents r3 = p046io.realm.C4814x4a38c7d7.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f27:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f3a
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoEventsList r3 = p046io.realm.C4812xdb358b15.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f3a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl> r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f4d
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoUrl r3 = p046io.realm.C4816xc56fdf8f.createUsingJsonStream(r3, r4)
            java.lang.Object r2 = r2.cast(r3)
            io.realm.RealmModel r2 = (p046io.realm.RealmModel) r2
            return r2
        L_0x0f4d:
            io.realm.exceptions.RealmException r2 = getMissingProxyClassException((java.lang.Class<? extends p046io.realm.RealmModel>) r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.DefaultRealmModuleMediator.createUsingJsonStream(java.lang.Class, io.realm.Realm, android.util.JsonReader):io.realm.RealmModel");
    }

    public <E extends RealmModel> E createDetachedCopy(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Class superclass = e.getClass().getSuperclass();
        if (superclass.equals(AvailablePassType.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.createDetachedCopy((AvailablePassType) e, 0, i, map));
        }
        if (superclass.equals(BleKeyData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.createDetachedCopy((BleKeyData) e, 0, i, map));
        }
        if (superclass.equals(BleReader.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_ble_data_BleReaderRealmProxy.createDetachedCopy((BleReader) e, 0, i, map));
        }
        if (superclass.equals(RentConfirmCodeData.class)) {
            return (RealmModel) superclass.cast(C4591x4d164271.createDetachedCopy((RentConfirmCodeData) e, 0, i, map));
        }
        if (superclass.equals(RentConfirmCodeResponse.class)) {
            return (RealmModel) superclass.cast(C4593x1ca69248.createDetachedCopy((RentConfirmCodeResponse) e, 0, i, map));
        }
        if (superclass.equals(RedeemCodeResponseData.class)) {
            return (RealmModel) superclass.cast(C4595x5d0db86d.createDetachedCopy((RedeemCodeResponseData) e, 0, i, map));
        }
        if (superclass.equals(SubAccount.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createDetachedCopy((SubAccount) e, 0, i, map));
        }
        if (superclass.equals(Author.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createDetachedCopy((Author) e, 0, i, map));
        }
        if (superclass.equals(QrCodeForSave.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.createDetachedCopy((QrCodeForSave) e, 0, i, map));
        }
        if (superclass.equals(AcceptanceDate.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_AcceptanceDateRealmProxy.createDetachedCopy((AcceptanceDate) e, 0, i, map));
        }
        if (superclass.equals(Address.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_AddressRealmProxy.createDetachedCopy((Address) e, 0, i, map));
        }
        if (superclass.equals(ApartmentState.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ApartmentStateRealmProxy.createDetachedCopy((ApartmentState) e, 0, i, map));
        }
        if (superclass.equals(Bank.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BankRealmProxy.createDetachedCopy((Bank) e, 0, i, map));
        }
        if (superclass.equals(Building.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BuildingRealmProxy.createDetachedCopy((Building) e, 0, i, map));
        }
        if (superclass.equals(Camera.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CameraRealmProxy.createDetachedCopy((Camera) e, 0, i, map));
        }
        if (superclass.equals(CompanyApplication.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy.createDetachedCopy((CompanyApplication) e, 0, i, map));
        }
        if (superclass.equals(EnterpriseApplication.class)) {
            return (RealmModel) superclass.cast(C4601xb6361989.createDetachedCopy((EnterpriseApplication) e, 0, i, map));
        }
        if (superclass.equals(ContextBanner.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.createDetachedCopy((ContextBanner) e, 0, i, map));
        }
        if (superclass.equals(Feature.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FeatureRealmProxy.createDetachedCopy((Feature) e, 0, i, map));
        }
        if (superclass.equals(FileData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy((FileData) e, 0, i, map));
        }
        if (superclass.equals(FileMeta.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createDetachedCopy((FileMeta) e, 0, i, map));
        }
        if (superclass.equals(FlatButtons.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createDetachedCopy((FlatButtons) e, 0, i, map));
        }
        if (superclass.equals(Layout.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_LayoutRealmProxy.createDetachedCopy((Layout) e, 0, i, map));
        }
        if (superclass.equals(Banner.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.createDetachedCopy((Banner) e, 0, i, map));
        }
        if (superclass.equals(CartCompany.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createDetachedCopy((CartCompany) e, 0, i, map));
        }
        if (superclass.equals(CartItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy.createDetachedCopy((CartItem) e, 0, i, map));
        }
        if (superclass.equals(CartOffer.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createDetachedCopy((CartOffer) e, 0, i, map));
        }
        if (superclass.equals(CartTotal.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createDetachedCopy((CartTotal) e, 0, i, map));
        }
        if (superclass.equals(Category.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createDetachedCopy((Category) e, 0, i, map));
        }
        if (superclass.equals(CategoryItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.createDetachedCopy((CategoryItem) e, 0, i, map));
        }
        if (superclass.equals(Comment.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.createDetachedCopy((Comment) e, 0, i, map));
        }
        if (superclass.equals(Company.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.createDetachedCopy((Company) e, 0, i, map));
        }
        if (superclass.equals(CompanyContact.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createDetachedCopy((CompanyContact) e, 0, i, map));
        }
        if (superclass.equals(Component.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_ComponentRealmProxy.createDetachedCopy((Component) e, 0, i, map));
        }
        if (superclass.equals(Coupon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.createDetachedCopy((Coupon) e, 0, i, map));
        }
        if (superclass.equals(CouponImage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createDetachedCopy((CouponImage) e, 0, i, map));
        }
        if (superclass.equals(Field.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createDetachedCopy((Field) e, 0, i, map));
        }
        if (superclass.equals(Offer.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createDetachedCopy((Offer) e, 0, i, map));
        }
        if (superclass.equals(Order.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.createDetachedCopy((Order) e, 0, i, map));
        }
        if (superclass.equals(OrderAction.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy.createDetachedCopy((OrderAction) e, 0, i, map));
        }
        if (superclass.equals(OrderItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.createDetachedCopy((OrderItem) e, 0, i, map));
        }
        if (superclass.equals(Parameter.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_ParameterRealmProxy.createDetachedCopy((Parameter) e, 0, i, map));
        }
        if (superclass.equals(PreviewImage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createDetachedCopy((PreviewImage) e, 0, i, map));
        }
        if (superclass.equals(Promotion.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.createDetachedCopy((Promotion) e, 0, i, map));
        }
        if (superclass.equals(Property.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_PropertyRealmProxy.createDetachedCopy((Property) e, 0, i, map));
        }
        if (superclass.equals(RedeemedCode.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createDetachedCopy((RedeemedCode) e, 0, i, map));
        }
        if (superclass.equals(RedeemedCodeDate.class)) {
            return (RealmModel) superclass.cast(C4620xe7ed888c.createDetachedCopy((RedeemedCodeDate) e, 0, i, map));
        }
        if (superclass.equals(SampleWork.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy.createDetachedCopy((SampleWork) e, 0, i, map));
        }
        if (superclass.equals(SearchItem.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy.createDetachedCopy((SearchItem) e, 0, i, map));
        }
        if (superclass.equals(SelectValue.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createDetachedCopy((SelectValue) e, 0, i, map));
        }
        if (superclass.equals(Tag.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy.createDetachedCopy((Tag) e, 0, i, map));
        }
        if (superclass.equals(Meta.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MetaRealmProxy.createDetachedCopy((Meta) e, 0, i, map));
        }
        if (superclass.equals(MyBeacon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createDetachedCopy((MyBeacon) e, 0, i, map));
        }
        if (superclass.equals(News.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_NewsRealmProxy.createDetachedCopy((News) e, 0, i, map));
        }
        if (superclass.equals(Notification.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.createDetachedCopy((Notification) e, 0, i, map));
        }
        if (superclass.equals(NotificationData.class)) {
            return (RealmModel) superclass.cast(C4626xe255e1e5.createDetachedCopy((NotificationData) e, 0, i, map));
        }
        if (superclass.equals(Pamyatka.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createDetachedCopy((Pamyatka) e, 0, i, map));
        }
        if (superclass.equals(Point.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PointRealmProxy.createDetachedCopy((Point) e, 0, i, map));
        }
        if (superclass.equals(ApartmentRequest.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createDetachedCopy((ApartmentRequest) e, 0, i, map));
        }
        if (superclass.equals(DemoUser.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.createDetachedCopy((DemoUser) e, 0, i, map));
        }
        if (superclass.equals(RentBuilding.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createDetachedCopy((RentBuilding) e, 0, i, map));
        }
        if (superclass.equals(RentBuildingAddress.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createDetachedCopy((RentBuildingAddress) e, 0, i, map));
        }
        if (superclass.equals(RentComplex.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createDetachedCopy((RentComplex) e, 0, i, map));
        }
        if (superclass.equals(RentObject.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxy.createDetachedCopy((RentObject) e, 0, i, map));
        }
        if (superclass.equals(RentObjectBuilding.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createDetachedCopy((RentObjectBuilding) e, 0, i, map));
        }
        if (superclass.equals(User.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createDetachedCopy((User) e, 0, i, map));
        }
        if (superclass.equals(ProviderCity.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ProviderCityRealmProxy.createDetachedCopy((ProviderCity) e, 0, i, map));
        }
        if (superclass.equals(RealmString.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_RealmStringRealmProxy.createDetachedCopy((RealmString) e, 0, i, map));
        }
        if (superclass.equals(Splashscreen.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.createDetachedCopy((Splashscreen) e, 0, i, map));
        }
        if (superclass.equals(TimeSlot.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.createDetachedCopy((TimeSlot) e, 0, i, map));
        }
        if (superclass.equals(Wifi.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_WifiRealmProxy.createDetachedCopy((Wifi) e, 0, i, map));
        }
        if (superclass.equals(AllTicketDataInX.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.createDetachedCopy((AllTicketDataInX) e, 0, i, map));
        }
        if (superclass.equals(TicketDataInX.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createDetachedCopy((TicketDataInX) e, 0, i, map));
        }
        if (superclass.equals(Schemas.class)) {
            return (RealmModel) superclass.cast(C4670xfcd8d37c.createDetachedCopy((Schemas) e, 0, i, map));
        }
        if (superclass.equals(C5788Video.class)) {
            return (RealmModel) superclass.cast(C4674x1c4fffad.createDetachedCopy((C5788Video) e, 0, i, map));
        }
        if (superclass.equals(ProfileAdress.class)) {
            return (RealmModel) superclass.cast(C4682xb8d394dd.createDetachedCopy((ProfileAdress) e, 0, i, map));
        }
        if (superclass.equals(ProfileData.class)) {
            return (RealmModel) superclass.cast(C4780xf0c1c3b9.createDetachedCopy((ProfileData) e, 0, i, map));
        }
        if (superclass.equals(UserCompany.class)) {
            return (RealmModel) superclass.cast(C4782x594eae38.createDetachedCopy((UserCompany) e, 0, i, map));
        }
        if (superclass.equals(UserData.class)) {
            return (RealmModel) superclass.cast(C4784x85418d2d.createDetachedCopy((UserData) e, 0, i, map));
        }
        if (superclass.equals(UserProfile.class)) {
            return (RealmModel) superclass.cast(C4786xba887464.createDetachedCopy((UserProfile) e, 0, i, map));
        }
        if (superclass.equals(UserVehicle.class)) {
            return (RealmModel) superclass.cast(C4788xc3a2b227.createDetachedCopy((UserVehicle) e, 0, i, map));
        }
        if (superclass.equals(ContactData.class)) {
            return (RealmModel) superclass.cast(C4792xa984038c.createDetachedCopy((ContactData) e, 0, i, map));
        }
        if (superclass.equals(ContactDataList.class)) {
            return (RealmModel) superclass.cast(C4790xe661e44a.createDetachedCopy((ContactDataList) e, 0, i, map));
        }
        if (superclass.equals(TicketPropertyObject.class)) {
            return (RealmModel) superclass.cast(C4796x4009dee4.createDetachedCopy((TicketPropertyObject) e, 0, i, map));
        }
        if (superclass.equals(Appointment.class)) {
            return (RealmModel) superclass.cast(C4818xb7a5caf9.createDetachedCopy((Appointment) e, 0, i, map));
        }
        if (superclass.equals(ExecutorsIn.class)) {
            return (RealmModel) superclass.cast(C4820x447e431f.createDetachedCopy((ExecutorsIn) e, 0, i, map));
        }
        if (superclass.equals(FromUser.class)) {
            return (RealmModel) superclass.cast(C4822xab1ed299.createDetachedCopy((FromUser) e, 0, i, map));
        }
        if (superclass.equals(Status.class)) {
            return (RealmModel) superclass.cast(C4824xe6f53cf6.createDetachedCopy((Status) e, 0, i, map));
        }
        if (superclass.equals(ToUser.class)) {
            return (RealmModel) superclass.cast(C4826x725684ea.createDetachedCopy((ToUser) e, 0, i, map));
        }
        if (superclass.equals(BusinessBuildings.class)) {
            return (RealmModel) superclass.cast(C4830x6d8ab071.createDetachedCopy((BusinessBuildings) e, 0, i, map));
        }
        if (superclass.equals(BusinessBuildingsList.class)) {
            return (RealmModel) superclass.cast(C4828xbbcd96af.createDetachedCopy((BusinessBuildingsList) e, 0, i, map));
        }
        if (superclass.equals(BusinessCenterDTO.class)) {
            return (RealmModel) superclass.cast(C4832x38c73bbc.createDetachedCopy((BusinessCenterDTO) e, 0, i, map));
        }
        if (superclass.equals(CityDTO.class)) {
            return (RealmModel) superclass.cast(C4834x9fbcbe06.createDetachedCopy((CityDTO) e, 0, i, map));
        }
        if (superclass.equals(SearchBuildingDTO.class)) {
            return (RealmModel) superclass.cast(C4836xc7389ad5.createDetachedCopy((SearchBuildingDTO) e, 0, i, map));
        }
        if (superclass.equals(SearchComplex.class)) {
            return (RealmModel) superclass.cast(C4838xc3cde83a.createDetachedCopy((SearchComplex) e, 0, i, map));
        }
        if (superclass.equals(Action.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ActionRealmProxy.createDetachedCopy((Action) e, 0, i, map));
        }
        if (superclass.equals(BeaconAction.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createDetachedCopy((BeaconAction) e, 0, i, map));
        }
        if (superclass.equals(BeaconActionDescription.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createDetachedCopy((BeaconActionDescription) e, 0, i, map));
        }
        if (superclass.equals(CardAdress.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createDetachedCopy((CardAdress) e, 0, i, map));
        }
        if (superclass.equals(CardData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createDetachedCopy((CardData) e, 0, i, map));
        }
        if (superclass.equals(Chat.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ChatRealmProxy.createDetachedCopy((Chat) e, 0, i, map));
        }
        if (superclass.equals(ChatListResponseData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy.createDetachedCopy((ChatListResponseData) e, 0, i, map));
        }
        if (superclass.equals(City.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CityRealmProxy.createDetachedCopy((City) e, 0, i, map));
        }
        if (superclass.equals(CityTitle.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CityTitleRealmProxy.createDetachedCopy((CityTitle) e, 0, i, map));
        }
        if (superclass.equals(Complex.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ComplexRealmProxy.createDetachedCopy((Complex) e, 0, i, map));
        }
        if (superclass.equals(ComplexInfo.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.createDetachedCopy((ComplexInfo) e, 0, i, map));
        }
        if (superclass.equals(Coordinates.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createDetachedCopy((Coordinates) e, 0, i, map));
        }
        if (superclass.equals(Favourite.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FavouriteRealmProxy.createDetachedCopy((Favourite) e, 0, i, map));
        }
        if (superclass.equals(Flat.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatRealmProxy.createDetachedCopy((Flat) e, 0, i, map));
        }
        if (superclass.equals(FlatInfo.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createDetachedCopy((FlatInfo) e, 0, i, map));
        }
        if (superclass.equals(GetFlatsResponseData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.createDetachedCopy((GetFlatsResponseData) e, 0, i, map));
        }
        if (superclass.equals(ImageData.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createDetachedCopy((ImageData) e, 0, i, map));
        }
        if (superclass.equals(ImageSize.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createDetachedCopy((ImageSize) e, 0, i, map));
        }
        if (superclass.equals(Intercom.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_IntercomRealmProxy.createDetachedCopy((Intercom) e, 0, i, map));
        }
        if (superclass.equals(IntercomVal.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createDetachedCopy((IntercomVal) e, 0, i, map));
        }
        if (superclass.equals(Mortrage.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_MortrageRealmProxy.createDetachedCopy((Mortrage) e, 0, i, map));
        }
        if (superclass.equals(PassCard.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PassCardRealmProxy.createDetachedCopy((PassCard) e, 0, i, map));
        }
        if (superclass.equals(PassCardUno.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy.createDetachedCopy((PassCardUno) e, 0, i, map));
        }
        if (superclass.equals(Price.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_PriceRealmProxy.createDetachedCopy((Price) e, 0, i, map));
        }
        if (superclass.equals(Apartment.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createDetachedCopy((Apartment) e, 0, i, map));
        }
        if (superclass.equals(SipOpenDoorParam.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createDetachedCopy((SipOpenDoorParam) e, 0, i, map));
        }
        if (superclass.equals(SipParametrs.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.createDetachedCopy((SipParametrs) e, 0, i, map));
        }
        if (superclass.equals(SipPreviewParams.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createDetachedCopy((SipPreviewParams) e, 0, i, map));
        }
        if (superclass.equals(Size.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_SizeRealmProxy.createDetachedCopy((Size) e, 0, i, map));
        }
        if (superclass.equals(UnreadBadge.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_realm_UnreadBadgeRealmProxy.createDetachedCopy((UnreadBadge) e, 0, i, map));
        }
        if (superclass.equals(FavoriteBeacon.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_data_service_location_FavoriteBeaconRealmProxy.createDetachedCopy((FavoriteBeacon) e, 0, i, map));
        }
        if (superclass.equals(DeviceModel.class)) {
            return (RealmModel) superclass.cast(C4637x5b79bd5a.createDetachedCopy((DeviceModel) e, 0, i, map));
        }
        if (superclass.equals(SignalRemote.class)) {
            return (RealmModel) superclass.cast(C4639x6ab32465.createDetachedCopy((SignalRemote) e, 0, i, map));
        }
        if (superclass.equals(Hardware.class)) {
            return (RealmModel) superclass.cast(C4642xba9ad755.createDetachedCopy((Hardware) e, 0, i, map));
        }
        if (superclass.equals(HardwareSignal.class)) {
            return (RealmModel) superclass.cast(C4644x8f0def9d.createDetachedCopy((HardwareSignal) e, 0, i, map));
        }
        if (superclass.equals(ManagementType.class)) {
            return (RealmModel) superclass.cast(C4646xa509baca.createDetachedCopy((ManagementType) e, 0, i, map));
        }
        if (superclass.equals(RoomInfo.class)) {
            return (RealmModel) superclass.cast(C4648x51014856.createDetachedCopy((RoomInfo) e, 0, i, map));
        }
        if (superclass.equals(Intellect.class)) {
            return (RealmModel) superclass.cast(C4650xa7ebbdf7.createDetachedCopy((Intellect) e, 0, i, map));
        }
        if (superclass.equals(AudioUrl.class)) {
            return (RealmModel) superclass.cast(C4652xadba3b3e.createDetachedCopy((AudioUrl) e, 0, i, map));
        }
        if (superclass.equals(Scenario.class)) {
            return (RealmModel) superclass.cast(C4654x9b0b7455.createDetachedCopy((Scenario) e, 0, i, map));
        }
        if (superclass.equals(State.class)) {
            return (RealmModel) superclass.cast(C4656xbdeaa6ca.createDetachedCopy((State) e, 0, i, map));
        }
        if (superclass.equals(DialogButtons.class)) {
            return (RealmModel) superclass.cast(C4658x6180a4a3.createDetachedCopy((DialogButtons) e, 0, i, map));
        }
        if (superclass.equals(Guard.class)) {
            return (RealmModel) superclass.cast(C4660xccbea62f.createDetachedCopy((Guard) e, 0, i, map));
        }
        if (superclass.equals(MinVersion.class)) {
            return (RealmModel) superclass.cast(C4662xc0a23e3a.createDetachedCopy((MinVersion) e, 0, i, map));
        }
        if (superclass.equals(Schema.class)) {
            return (RealmModel) superclass.cast(C4668xcf375a75.createDetachedCopy((Schema) e, 0, i, map));
        }
        if (superclass.equals(SchemaCallback.class)) {
            return (RealmModel) superclass.cast(C4664x5395ce9a.createDetachedCopy((SchemaCallback) e, 0, i, map));
        }
        if (superclass.equals(SchemaItem.class)) {
            return (RealmModel) superclass.cast(C4666xdf5d9ae8.createDetachedCopy((SchemaItem) e, 0, i, map));
        }
        if (superclass.equals(Services.class)) {
            return (RealmModel) superclass.cast(C4672xd5d6cbb2.createDetachedCopy((Services) e, 0, i, map));
        }
        if (superclass.equals(Token.class)) {
            return (RealmModel) superclass.cast(ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy.createDetachedCopy((Token) e, 0, i, map));
        }
        if (superclass.equals(Device.class)) {
            return (RealmModel) superclass.cast(C4676xf1982dca.createDetachedCopy((Device) e, 0, i, map));
        }
        if (superclass.equals(ClassDevice.class)) {
            return (RealmModel) superclass.cast(C4678x5ab6ac5f.createDetachedCopy((ClassDevice) e, 0, i, map));
        }
        if (superclass.equals(BMSInfo.class)) {
            return (RealmModel) superclass.cast(C4680x20fc7e06.createDetachedCopy((BMSInfo) e, 0, i, map));
        }
        if (superclass.equals(Devices.class)) {
            return (RealmModel) superclass.cast(C4684xaab8a0b.createDetachedCopy((Devices) e, 0, i, map));
        }
        if (superclass.equals(FilesUrl.class)) {
            return (RealmModel) superclass.cast(C4686xbd7f885e.createDetachedCopy((FilesUrl) e, 0, i, map));
        }
        if (superclass.equals(ServiceData.class)) {
            return (RealmModel) superclass.cast(C4688xf4020777.createDetachedCopy((ServiceData) e, 0, i, map));
        }
        if (superclass.equals(ServiceFieldItems.class)) {
            return (RealmModel) superclass.cast(C4690x83bb1d33.createDetachedCopy((ServiceFieldItems) e, 0, i, map));
        }
        if (superclass.equals(ServiceStatus.class)) {
            return (RealmModel) superclass.cast(C4692x82b5a23f.createDetachedCopy((ServiceStatus) e, 0, i, map));
        }
        if (superclass.equals(DomServiceCategory.class)) {
            return (RealmModel) superclass.cast(C4694x8588f9e4.createDetachedCopy((DomServiceCategory) e, 0, i, map));
        }
        if (superclass.equals(DomServiceIndicator.class)) {
            return (RealmModel) superclass.cast(C4696x936db447.createDetachedCopy((DomServiceIndicator) e, 0, i, map));
        }
        if (superclass.equals(DomServicesList.class)) {
            return (RealmModel) superclass.cast(C4700xb5dd9409.createDetachedCopy((DomServicesList) e, 0, i, map));
        }
        if (superclass.equals(DomServiceTariff.class)) {
            return (RealmModel) superclass.cast(C4698x9da95c4a.createDetachedCopy((DomServiceTariff) e, 0, i, map));
        }
        if (superclass.equals(ServiceFile.class)) {
            return (RealmModel) superclass.cast(C4702x12a70883.createDetachedCopy((ServiceFile) e, 0, i, map));
        }
        if (superclass.equals(ServiceMessages.class)) {
            return (RealmModel) superclass.cast(C4704x27ddec53.createDetachedCopy((ServiceMessages) e, 0, i, map));
        }
        if (superclass.equals(ServiceTicket.class)) {
            return (RealmModel) superclass.cast(C4706xcf10b813.createDetachedCopy((ServiceTicket) e, 0, i, map));
        }
        if (superclass.equals(ServiceTicketType.class)) {
            return (RealmModel) superclass.cast(C4708x7c8648ed.createDetachedCopy((ServiceTicketType) e, 0, i, map));
        }
        if (superclass.equals(TicketAccountsList.class)) {
            return (RealmModel) superclass.cast(C4710x379415fc.createDetachedCopy((TicketAccountsList) e, 0, i, map));
        }
        if (superclass.equals(TicketApartment.class)) {
            return (RealmModel) superclass.cast(C4712x67ea0478.createDetachedCopy((TicketApartment) e, 0, i, map));
        }
        if (superclass.equals(TicketApplicant.class)) {
            return (RealmModel) superclass.cast(C4714x6f4f4848.createDetachedCopy((TicketApplicant) e, 0, i, map));
        }
        if (superclass.equals(TicketChatData.class)) {
            return (RealmModel) superclass.cast(C4716x3c51d27a.createDetachedCopy((TicketChatData) e, 0, i, map));
        }
        if (superclass.equals(TicketInfo.class)) {
            return (RealmModel) superclass.cast(C4718xb56c6186.createDetachedCopy((TicketInfo) e, 0, i, map));
        }
        if (superclass.equals(TicketObject.class)) {
            return (RealmModel) superclass.cast(C4720x13bb7c97.createDetachedCopy((TicketObject) e, 0, i, map));
        }
        if (superclass.equals(TicketPerformer.class)) {
            return (RealmModel) superclass.cast(C4722x782e3a14.createDetachedCopy((TicketPerformer) e, 0, i, map));
        }
        if (superclass.equals(TicketRating.class)) {
            return (RealmModel) superclass.cast(C4724xb050ad75.createDetachedCopy((TicketRating) e, 0, i, map));
        }
        if (superclass.equals(Tickets.class)) {
            return (RealmModel) superclass.cast(C4730xd31c9f99.createDetachedCopy((Tickets) e, 0, i, map));
        }
        if (superclass.equals(TicketState.class)) {
            return (RealmModel) superclass.cast(C4726x470e297.createDetachedCopy((TicketState) e, 0, i, map));
        }
        if (superclass.equals(TicketUrgency.class)) {
            return (RealmModel) superclass.cast(C4728x7291458f.createDetachedCopy((TicketUrgency) e, 0, i, map));
        }
        if (superclass.equals(Rooms.class)) {
            return (RealmModel) superclass.cast(C4732xd254b890.createDetachedCopy((Rooms) e, 0, i, map));
        }
        if (superclass.equals(MoreIconsInfo.class)) {
            return (RealmModel) superclass.cast(C4734x3e5f4d91.createDetachedCopy((MoreIconsInfo) e, 0, i, map));
        }
        if (superclass.equals(ActualCountersData.class)) {
            return (RealmModel) superclass.cast(C4736x16a117c0.createDetachedCopy((ActualCountersData) e, 0, i, map));
        }
        if (superclass.equals(RentCompany.class)) {
            return (RealmModel) superclass.cast(C4738x3e33c9bd.createDetachedCopy((RentCompany) e, 0, i, map));
        }
        if (superclass.equals(AttrRenta.class)) {
            return (RealmModel) superclass.cast(C4740x60e6319b.createDetachedCopy((AttrRenta) e, 0, i, map));
        }
        if (superclass.equals(PropertyRenta.class)) {
            return (RealmModel) superclass.cast(C4742xdc63beb7.createDetachedCopy((PropertyRenta) e, 0, i, map));
        }
        if (superclass.equals(RentAttribute.class)) {
            return (RealmModel) superclass.cast(C4744xe660f6a7.createDetachedCopy((RentAttribute) e, 0, i, map));
        }
        if (superclass.equals(RentInfo.class)) {
            return (RealmModel) superclass.cast(C4748x5c024f21.createDetachedCopy((RentInfo) e, 0, i, map));
        }
        if (superclass.equals(RentInfoObject.class)) {
            return (RealmModel) superclass.cast(C4746x72770240.createDetachedCopy((RentInfoObject) e, 0, i, map));
        }
        if (superclass.equals(RentPermissions.class)) {
            return (RealmModel) superclass.cast(C4750xebfdbb8f.createDetachedCopy((RentPermissions) e, 0, i, map));
        }
        if (superclass.equals(RentType.class)) {
            return (RealmModel) superclass.cast(C4754xcc2cbaad.createDetachedCopy((RentType) e, 0, i, map));
        }
        if (superclass.equals(RentTypeAttr.class)) {
            return (RealmModel) superclass.cast(C4752xf2aa007e.createDetachedCopy((RentTypeAttr) e, 0, i, map));
        }
        if (superclass.equals(StateRenta.class)) {
            return (RealmModel) superclass.cast(C4756x99acf311.createDetachedCopy((StateRenta) e, 0, i, map));
        }
        if (superclass.equals(TimeSlotHuman.class)) {
            return (RealmModel) superclass.cast(C4758xdaf4d606.createDetachedCopy((TimeSlotHuman) e, 0, i, map));
        }
        if (superclass.equals(TimeSlotHumanValue.class)) {
            return (RealmModel) superclass.cast(C4760xfaafb8e9.createDetachedCopy((TimeSlotHumanValue) e, 0, i, map));
        }
        if (superclass.equals(TypeRent.class)) {
            return (RealmModel) superclass.cast(C4762x65e9722d.createDetachedCopy((TypeRent) e, 0, i, map));
        }
        if (superclass.equals(ManagePermissions.class)) {
            return (RealmModel) superclass.cast(C4764xd43a5daf.createDetachedCopy((ManagePermissions) e, 0, i, map));
        }
        if (superclass.equals(Rent.class)) {
            return (RealmModel) superclass.cast(C4768x32c48847.createDetachedCopy((Rent) e, 0, i, map));
        }
        if (superclass.equals(RentChildren.class)) {
            return (RealmModel) superclass.cast(C4766x7a38e7a6.createDetachedCopy((RentChildren) e, 0, i, map));
        }
        if (superclass.equals(Renters.class)) {
            return (RealmModel) superclass.cast(C4772xa5d8f71d.createDetachedCopy((Renters) e, 0, i, map));
        }
        if (superclass.equals(RentState.class)) {
            return (RealmModel) superclass.cast(C4770xc85b1268.createDetachedCopy((RentState) e, 0, i, map));
        }
        if (superclass.equals(TalkingInfo.class)) {
            return (RealmModel) superclass.cast(C4774x33c567d4.createDetachedCopy((TalkingInfo) e, 0, i, map));
        }
        if (superclass.equals(TalkingPhotos.class)) {
            return (RealmModel) superclass.cast(C4778x8713e227.createDetachedCopy((TalkingPhotos) e, 0, i, map));
        }
        if (superclass.equals(TalkingPhotosFile.class)) {
            return (RealmModel) superclass.cast(C4776x6ae644c3.createDetachedCopy((TalkingPhotosFile) e, 0, i, map));
        }
        if (superclass.equals(RentAttributes.class)) {
            return (RealmModel) superclass.cast(C4794x165b0474.createDetachedCopy((RentAttributes) e, 0, i, map));
        }
        if (superclass.equals(ApartmentScenarioOptionAdd.class)) {
            return (RealmModel) superclass.cast(C4798x7bd56e2e.createDetachedCopy((ApartmentScenarioOptionAdd) e, 0, i, map));
        }
        if (superclass.equals(Options.class)) {
            return (RealmModel) superclass.cast(C4802x9a8f8638.createDetachedCopy((Options) e, 0, i, map));
        }
        if (superclass.equals(OptionsList.class)) {
            return (RealmModel) superclass.cast(C4800x8b5430f6.createDetachedCopy((OptionsList) e, 0, i, map));
        }
        if (superclass.equals(Ticket.class)) {
            return (RealmModel) superclass.cast(C4808x39dc6d46.createDetachedCopy((Ticket) e, 0, i, map));
        }
        if (superclass.equals(TicketDescription.class)) {
            return (RealmModel) superclass.cast(C4804xd885bb4.createDetachedCopy((TicketDescription) e, 0, i, map));
        }
        if (superclass.equals(TicketDetail.class)) {
            return (RealmModel) superclass.cast(C4806xa0f8f737.createDetachedCopy((TicketDetail) e, 0, i, map));
        }
        if (superclass.equals(VideoDates.class)) {
            return (RealmModel) superclass.cast(C4810xdea6d8e5.createDetachedCopy((VideoDates) e, 0, i, map));
        }
        if (superclass.equals(VideoEvents.class)) {
            return (RealmModel) superclass.cast(C4814x4a38c7d7.createDetachedCopy((VideoEvents) e, 0, i, map));
        }
        if (superclass.equals(VideoEventsList.class)) {
            return (RealmModel) superclass.cast(C4812xdb358b15.createDetachedCopy((VideoEventsList) e, 0, i, map));
        }
        if (superclass.equals(VideoUrl.class)) {
            return (RealmModel) superclass.cast(C4816xc56fdf8f.createDetachedCopy((VideoUrl) e, 0, i, map));
        }
        throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }
}
