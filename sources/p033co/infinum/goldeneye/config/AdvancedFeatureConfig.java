package p033co.infinum.goldeneye.config;

import java.util.List;
import kotlin.Metadata;
import p033co.infinum.goldeneye.models.AntibandingMode;
import p033co.infinum.goldeneye.models.ColorEffectMode;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0017\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, mo51343d2 = {"Lco/infinum/goldeneye/config/AdvancedFeatureConfig;", "", "antibandingMode", "Lco/infinum/goldeneye/models/AntibandingMode;", "getAntibandingMode", "()Lco/infinum/goldeneye/models/AntibandingMode;", "setAntibandingMode", "(Lco/infinum/goldeneye/models/AntibandingMode;)V", "colorEffectMode", "Lco/infinum/goldeneye/models/ColorEffectMode;", "getColorEffectMode", "()Lco/infinum/goldeneye/models/ColorEffectMode;", "setColorEffectMode", "(Lco/infinum/goldeneye/models/ColorEffectMode;)V", "supportedAntibandingModes", "", "getSupportedAntibandingModes", "()Ljava/util/List;", "supportedColorEffectModes", "getSupportedColorEffectModes", "supportedWhiteBalanceModes", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "getSupportedWhiteBalanceModes", "whiteBalanceMode", "getWhiteBalanceMode", "()Lco/infinum/goldeneye/models/WhiteBalanceMode;", "setWhiteBalanceMode", "(Lco/infinum/goldeneye/models/WhiteBalanceMode;)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.AdvancedFeatureConfig */
/* compiled from: AdvancedFeatureConfig.kt */
public interface AdvancedFeatureConfig {
    AntibandingMode getAntibandingMode();

    ColorEffectMode getColorEffectMode();

    List<AntibandingMode> getSupportedAntibandingModes();

    List<ColorEffectMode> getSupportedColorEffectModes();

    List<WhiteBalanceMode> getSupportedWhiteBalanceModes();

    WhiteBalanceMode getWhiteBalanceMode();

    void setAntibandingMode(AntibandingMode antibandingMode);

    void setColorEffectMode(ColorEffectMode colorEffectMode);

    void setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode);
}
