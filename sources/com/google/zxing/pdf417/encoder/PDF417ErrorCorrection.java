package com.google.zxing.pdf417.encoder;

import androidx.core.app.FrameMetricsAggregator;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.imageutils.JfifUtil;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import org.jetbrains.anko.DimensionsKt;
import org.videolan.libvlc.media.MediaPlayer;
import p035ru.unicorn.ujin.ble.TransparentActivityKt;
import p035ru.unicorn.ujin.view.activity.tutorial.BaseTutorialActivity;
import p042cz.msebera.android.httpclient.HttpStatus;

final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, IptcDirectory.TAG_REFERENCE_NUMBER, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, IptcDirectory.TAG_DIGITAL_TIME_CREATED, 922, OlympusMakernoteDirectory.TAG_ORIGINAL_MANUFACTURER_MODEL, 176, 586, 640, 321, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, DimensionsKt.XHDPI, 803, 133, 231, 390, 685, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 63, HttpStatus.SC_GONE}, new int[]{539, HttpStatus.SC_UNPROCESSABLE_ENTITY, 6, 93, 862, 771, 453, 106, 610, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 107, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 733, 877, 381, IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_CODE, 723, 476, 462, NikonType2MakernoteDirectory.TAG_IMAGE_STABILISATION, 430, 609, 858, 822, SanyoMakernoteDirectory.TAG_SCENE_SELECT, IptcDirectory.TAG_ARM_IDENTIFIER, FrameMetricsAggregator.EVERY_DURATION, 400, 672, 762, 283, NikonType2MakernoteDirectory.TAG_FILE_INFO, 440, 35, 519, 31, 460, 594, JfifUtil.MARKER_APP1, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, 517, 352, 605, 158, 651, 201, 488, HttpStatus.SC_BAD_GATEWAY, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, SanyoMakernoteDirectory.TAG_SCENE_SELECT}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 822, 93, JfifUtil.MARKER_EOI, 208, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsEveningSunlight, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, JfifUtil.MARKER_SOFn, OlympusCameraSettingsMakernoteDirectory.TagAfFineTuneAdj, 278, NikonType2MakernoteDirectory.TAG_AF_RESPONSE, 40, 379, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT, 463, 646, OlympusFocusInfoMakernoteDirectory.TagAfPoint, 171, 491, ExifDirectoryBase.TAG_PAGE_NUMBER, 763, NikonType2MakernoteDirectory.TAG_SCENE_ASSIST, 732, 95, 270, 447, 90, HttpStatus.SC_INSUFFICIENT_STORAGE, 48, 228, 821, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 898, 784, IptcDirectory.TAG_AUDIO_SAMPLING_RATE, IptcDirectory.TAG_SOURCE, IptcDirectory.TAG_ARM_VERSION, 382, 262, 380, IptcDirectory.TAG_CITY, 754, IptcDirectory.TAG_TIME_SENT, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, IptcDirectory.TAG_OBJECT_CYCLE, LeicaMakernoteDirectory.TAG_WB_BLUE_LEVEL, 34, 211, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 539, ExifDirectoryBase.TAG_PAGE_NUMBER, 827, 865, 37, 517, 834, ExifDirectoryBase.TAG_ARTIST, IptcDirectory.TAG_EXPIRATION_TIME, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, LeicaMakernoteDirectory.TAG_MEASURED_LV, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, IptcDirectory.TAG_BY_LINE, 668, 353, 859, 370, 694, ExifDirectoryBase.TAG_TILE_BYTE_COUNTS, DimensionsKt.HDPI, JfifUtil.MARKER_SOI, 257, 284, 549, 209, 884, ExifDirectoryBase.TAG_ARTIST, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, IptcDirectory.TAG_ARM_IDENTIFIER, 849, 521, 307, 291, 803, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT, 19, 358, 399, 908, 103, FrameMetricsAggregator.EVERY_DURATION, 51, 8, 517, JfifUtil.MARKER_APP1, 289, 470, IptcDirectory.TAG_RASTERIZED_CAPTION, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, IptcDirectory.TAG_CONTENT_LOCATION_CODE, 906, 90, 2, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, IptcDirectory.TAG_COPYRIGHT_NOTICE, DimensionsKt.XHDPI, 479, 130, 739, 71, 263, ExifDirectoryBase.TAG_WHITE_POINT, 374, 601, JfifUtil.MARKER_SOFn, 605, 142, 673, 687, 234, 722, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 177, 752, IptcDirectory.TAG_PROVINCE_OR_STATE, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, IptcDirectory.TAG_MASTER_DOCUMENT_ID, 755, 756, 60, 231, 773, 434, 421, 726, 528, HttpStatus.SC_SERVICE_UNAVAILABLE, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES, 9, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, IptcDirectory.TAG_EXPIRATION_TIME, 73, 914, ExifDirectoryBase.TAG_TRANSFER_RANGE, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, DimensionsKt.TVDPI, 54, ExifDirectoryBase.TAG_PAGE_NUMBER, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, NikonType2MakernoteDirectory.TAG_UNKNOWN_50, 20, NikonType2MakernoteDirectory.TAG_EXPOSURE_SEQUENCE_NUMBER, 29, 872, 449, 83, HttpStatus.SC_PAYMENT_REQUIRED, 41, 656, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 579, 481, NikonType2MakernoteDirectory.TAG_AF_RESPONSE, 404, 251, 688, 95, 497, BaseTutorialActivity.WATCH_TUTORIAL_REQUEST_CODE, IptcDirectory.TAG_IMAGE_TYPE, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, HttpStatus.SC_GATEWAY_TIMEOUT, 35, 599, 428, HttpStatus.SC_MULTI_STATUS, HttpStatus.SC_CONFLICT, IptcDirectory.TAG_DIGITAL_DATE_CREATED, 118, 498, 285, 380, 350, 492, 197, 265, 920, NikonType2MakernoteDirectory.TAG_UNKNOWN_10, 914, 299, 229, IptcDirectory.TAG_IMAGE_ORIENTATION, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, TransparentActivityKt.REQUEST_ENABLE_BT, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 203, IptcDirectory.TAG_AUDIO_OUTCUE, 249, IptcDirectory.TAG_CODED_CHARACTER_SET, 781, 621, 640, 268, 794, 534, 539, 781, HttpStatus.SC_REQUEST_TIMEOUT, 390, 644, 102, 476, 499, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, IptcDirectory.TAG_CAPTION, 545, 37, 858, 916, IptcDirectory.TAG_SPECIAL_INSTRUCTIONS, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, OlympusRawInfoMakernoteDirectory.TagWbRbLevelsFineWeather, 204, 681, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 855, 85, 99, 62, 482, 180, 20, ExifDirectoryBase.TAG_PAGE_NUMBER, 451, 593, 913, 142, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 684, OlympusImageProcessingMakernoteDirectory.TagWbGLevel, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 561, 76, 653, 899, 729, IptcDirectory.TAG_DATE_CREATED, 744, 390, 513, JfifUtil.MARKER_SOFn, 516, 258, DimensionsKt.HDPI, 518, 794, 395, 768, 848, 51, 610, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, NikonType2MakernoteDirectory.TAG_FLASH_INFO, 190, 826, 328, 596, LeicaMakernoteDirectory.TAG_MEASURED_LV, HttpStatus.SC_SEE_OTHER, 570, 381, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 641, NikonType2MakernoteDirectory.TAG_SCENE_ASSIST, 237, 151, 429, 531, HttpStatus.SC_MULTI_STATUS, 676, 710, 89, NikonType2MakernoteDirectory.TAG_FLASH_INFO, 304, HttpStatus.SC_PAYMENT_REQUIRED, 40, 708, IptcDirectory.TAG_DIGITAL_TIME_CREATED, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, SanyoMakernoteDirectory.TAG_SCENE_SELECT, 152, 729, 771, 95, 248, 361, 578, ExifDirectoryBase.TAG_TILE_LENGTH, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, MediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT, 452, NikonType2MakernoteDirectory.TAG_EXPOSURE_SEQUENCE_NUMBER, ExifDirectoryBase.TAG_TRANSFER_RANGE, 244, NikonType2MakernoteDirectory.TAG_AF_RESPONSE, 35, 463, 651, 51, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, 591, 452, 578, 37, 124, 298, 332, IptcDirectory.TAG_SPECIAL_INSTRUCTIONS, 43, 427, 119, IptcDirectory.TAG_AUDIO_TYPE, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, HttpStatus.SC_METHOD_FAILURE, 245, 288, 594, 394, FrameMetricsAggregator.EVERY_DURATION, 327, 589, 777, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, 688, 43, HttpStatus.SC_REQUEST_TIMEOUT, 842, 383, 721, 521, 560, 644, IptcDirectory.TAG_OBJECT_PREVIEW_DATA, 559, 62, 145, 873, IptcDirectory.TAG_AUDIO_SAMPLING_RATE, IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION, 159, 672, 729, 624, 59, 193, HttpStatus.SC_EXPECTATION_FAILED, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, NikonType2MakernoteDirectory.TAG_UNKNOWN_48, 772, 677, 310, 248, 353, 708, HttpStatus.SC_GONE, 579, 870, IptcDirectory.TAG_HEADLINE, 841, IptcDirectory.TAG_CAPTION, 860, 289, SanyoMakernoteDirectory.TAG_FLICKER_REDUCE, 35, 777, 618, 586, HttpStatus.SC_FAILED_DEPENDENCY, 833, 77, IptcDirectory.TAG_BY_LINE_TITLE, IptcDirectory.TAG_CODED_CHARACTER_SET, 269, 757, IptcDirectory.TAG_CAPTION, 695, 751, 331, 247, NikonType2MakernoteDirectory.TAG_FILE_INFO, 45, LeicaMakernoteDirectory.TAG_APPROXIMATE_F_NUMBER, 680, 18, 66, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 369, 54, 492, 228, IptcDirectory.TAG_COUNTRY_OR_PRIMARY_LOCATION_NAME, 830, 922, 437, 519, 644, 905, 789, HttpStatus.SC_METHOD_FAILURE, 305, 441, HttpStatus.SC_MULTI_STATUS, 300, 892, 827, 141, 537, 381, IptcDirectory.TAG_AUDIO_TYPE, 513, 56, 252, 341, 242, 797, 838, 837, 720, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, 307, 631, 61, 87, 560, 310, 756, IptcDirectory.TAG_AUDIO_DURATION, 397, OlympusFocusInfoMakernoteDirectory.TagAfInfo, 851, 309, 473, 795, IptcDirectory.TAG_ARM_VERSION, 31, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, 915, 459, 806, 590, 731, 425, JfifUtil.MARKER_SOI, SanyoMakernoteDirectory.TAG_SEQUENCE_SHOT_INTERVAL, 249, 321, 881, IptcDirectory.TAG_UNIQUE_DOCUMENT_ID, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, 673, 782, 210, 815, 905, HttpStatus.SC_SEE_OTHER, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, NikonType2MakernoteDirectory.TAG_UNKNOWN_10, HttpStatus.SC_UNPROCESSABLE_ENTITY, 907, LeicaMakernoteDirectory.TAG_CCD_BOARD_VERSION, NikonType2MakernoteDirectory.TAG_UNKNOWN_49, 62, 16, 425, SanyoMakernoteDirectory.TAG_RECORD_SHUTTER_RELEASE, IptcDirectory.TAG_TIME_SENT, 286, 437, 375, 273, 610, 296, NikonType2MakernoteDirectory.TAG_AF_INFO_2, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 5, 39, 923, 311, HttpStatus.SC_FAILED_DEPENDENCY, 242, 749, 321, 54, 669, 316, ExifDirectoryBase.TAG_TRANSFER_RANGE, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, ExifDirectoryBase.TAG_PAGE_NUMBER, 321, 762, 752, 533, NikonType2MakernoteDirectory.TAG_UNKNOWN_30, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, HttpStatus.SC_LENGTH_REQUIRED, 877, 669, 141, 919, 45, 780, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 164, 332, 899, NikonType2MakernoteDirectory.TAG_IMAGE_COUNT, 726, 600, ExifDirectoryBase.TAG_TILE_BYTE_COUNTS, 498, 655, 357, 752, 768, 223, 849, IptcDirectory.TAG_LANGUAGE_IDENTIFIER, 63, 310, 863, 251, 366, 304, 282, 738, 675, HttpStatus.SC_GONE, 389, 244, 31, 121, HttpStatus.SC_SEE_OTHER, 263}};

    private PDF417ErrorCorrection() {
    }

    static int getErrorCorrectionCodewordCount(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else if (i <= 40) {
            return 2;
        } else {
            if (i <= 160) {
                return 3;
            }
            if (i <= 320) {
                return 4;
            }
            if (i <= 863) {
                return 5;
            }
            throw new WriterException("No recommendation possible");
        }
    }

    static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            if (cArr[i4] != 0) {
                cArr[i4] = (char) (929 - cArr[i4]);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }
}
