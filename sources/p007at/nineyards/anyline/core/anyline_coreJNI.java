package p007at.nineyards.anyline.core;

import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;

/* renamed from: at.nineyards.anyline.core.anyline_coreJNI */
public class anyline_coreJNI {
    public static final native int AnglesOutsideOfTolerance_get();

    public static final native void AnylineCore_enableOptOutDebugReporting(long j, AnylineCore anylineCore, boolean z);

    public static final native long AnylineCore_lineDurations(long j, AnylineCore anylineCore);

    public static final native void AnylineCore_loadCmdFile(long j, AnylineCore anylineCore, String str, String str2) throws ArgumentException, SyntaxException;

    public static final native void AnylineCore_loadScript__SWIG_0(long j, AnylineCore anylineCore, String str, String str2, String str3) throws ArgumentException, SyntaxException;

    public static final native void AnylineCore_loadScript__SWIG_1(long j, AnylineCore anylineCore, String str, String str2) throws ArgumentException, SyntaxException;

    public static final native void AnylineCore_process(long j, AnylineCore anylineCore, long j2, Variable variable, long j3, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable) throws SyntaxException, RunFailure, LicenseException;

    public static final native void AnylineCore_reportIncludeValues(long j, AnylineCore anylineCore, String str);

    public static final native void AnylineCore_reportTriggerScanningCanceled(long j, AnylineCore anylineCore);

    public static final native long ArgumentException_SWIGUpcast(long j);

    public static final native int ArgumentIsEmpty_get();

    public static final native int ArgumentIsNull_get();

    public static final native int ArgumentNotValid_get();

    public static final native int CONTOURS_get();

    public static final native boolean CheckLicense_checkLicense(long j, CheckLicense checkLicense, String str) throws ArgumentException;

    public static final native long CheckLicense_getInstance();

    public static final native boolean CheckLicense_showPopUp(long j, CheckLicense checkLicense);

    public static final native boolean CheckLicense_showWatermark(long j, CheckLicense checkLicense);

    public static final native boolean CheckLicense_wasChecked(long j, CheckLicense checkLicense);

    public static final native int ConfidenceNotReached_get();

    public static final native Rect Contour_boundingRect(long j, Contour contour);

    public static final native long Contour_contour(long j, Contour contour);

    public static final native void Contour_setBoundingRect(long j, Contour contour, Rect rect);

    public static final native void CoreResult_add(long j, CoreResult coreResult, String str, String str2);

    public static final native void CoreResult_addSymbolConfidenceVector(long j, CoreResult coreResult, long j2, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, String str);

    public static final native void CoreResult_addWordConfidence(long j, CoreResult coreResult, int i, String str);

    public static final native int CoreResult_calculateWordConfidenceFromSymbols(long j, CoreResult coreResult, String str);

    public static final native String CoreResult_getResult(long j, CoreResult coreResult, String str);

    public static final native long CoreResult_getSymbolConfidence(long j, CoreResult coreResult, String str);

    public static final native int CoreResult_getWordConfidence(long j, CoreResult coreResult, String str);

    public static final native boolean CoreResult_hasResult(long j, CoreResult coreResult, String str);

    public static final native long CoreResult_identifiers(long j, CoreResult coreResult);

    public static final native void CoreResult_put(long j, CoreResult coreResult, String str, String str2);

    public static final native void CoreResult_putSymbolConfidenceVector(long j, CoreResult coreResult, long j2, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, String str);

    public static final native void CoreResult_putWordConfidence(long j, CoreResult coreResult, int i, String str);

    public static final native void CoreResult_remove(long j, CoreResult coreResult, String str);

    public static final native void CoreResult_removeSymbolConfidenceVector(long j, CoreResult coreResult, String str);

    public static final native void CoreResult_removeWordConfidence(long j, CoreResult coreResult, String str);

    public static final native long CoreResult_resultsByIdentifiers(long j, CoreResult coreResult);

    public static final native void CoreResult_setValid(long j, CoreResult coreResult, boolean z);

    public static final native long CoreResult_symbolConfidenceVectorByIdentifiers(long j, CoreResult coreResult);

    public static final native boolean CoreResult_valid(long j, CoreResult coreResult);

    public static final native long CoreResult_wordConfidenceByIdentifiers(long j, CoreResult coreResult);

    public static final native int DOUBLE_get();

    public static final native int DigitFirstDistanceExceeded_get();

    public static final native int DistanceBetweenDigitsExceeded_get();

    public static final native int DistanceViolationsNotResolved_get();

    public static final native int DocumentBoundsOutsideOfTolerance_get();

    public static final native int DocumentRatioOutsideOfTolerance_get();

    public static final native int GenericCallbackException_get();

    public static final native int INT_get();

    public static final native int ImageColorConvertionProblem_get();

    public static final native int ImageNotSharp_get();

    public static final native int InterpreterNotLoaded_get();

    public static final native int InvalidDataPointIdentifier_get();

    public static final native long LicenseException_SWIGUpcast(long j);

    public static final native int LicenseKeyExpired_get();

    public static final native int LicenseKeyInvalid_get();

    public static final native int LicenseNotInitialized_get();

    public static final native int LineDuration_duration_get(long j, LineDuration lineDuration);

    public static final native void LineDuration_duration_set(long j, LineDuration lineDuration, int i);

    public static final native int LineDuration_lineNumber_get(long j, LineDuration lineDuration);

    public static final native void LineDuration_lineNumber_set(long j, LineDuration lineDuration, int i);

    public static final native String LineDuration_lineText_get(long j, LineDuration lineDuration);

    public static final native void LineDuration_lineText_set(long j, LineDuration lineDuration, String str);

    public static final native int MAT_get();

    public static final native void Map_Integer_Vector_SymbolConfidence_clear(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence);

    public static final native void Map_Integer_Vector_SymbolConfidence_del(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, int i);

    public static final native boolean Map_Integer_Vector_SymbolConfidence_empty(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence);

    public static final native long Map_Integer_Vector_SymbolConfidence_get(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, int i);

    public static final native boolean Map_Integer_Vector_SymbolConfidence_has_key(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, int i);

    public static final native void Map_Integer_Vector_SymbolConfidence_set(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence, int i, long j2, Vector_SymbolConfidence vector_SymbolConfidence);

    public static final native long Map_Integer_Vector_SymbolConfidence_size(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence);

    public static final native void Map_String_Integer_clear(long j, Map_String_Integer map_String_Integer);

    public static final native void Map_String_Integer_del(long j, Map_String_Integer map_String_Integer, String str);

    public static final native boolean Map_String_Integer_empty(long j, Map_String_Integer map_String_Integer);

    public static final native int Map_String_Integer_get(long j, Map_String_Integer map_String_Integer, String str);

    public static final native boolean Map_String_Integer_has_key(long j, Map_String_Integer map_String_Integer, String str);

    public static final native void Map_String_Integer_set(long j, Map_String_Integer map_String_Integer, String str, int i);

    public static final native long Map_String_Integer_size(long j, Map_String_Integer map_String_Integer);

    public static final native void Map_String_Map_Int_Vector_SymbolConfidence_clear(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence);

    public static final native void Map_String_Map_Int_Vector_SymbolConfidence_del(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence, String str);

    public static final native boolean Map_String_Map_Int_Vector_SymbolConfidence_empty(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence);

    public static final native long Map_String_Map_Int_Vector_SymbolConfidence_get(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence, String str);

    public static final native boolean Map_String_Map_Int_Vector_SymbolConfidence_has_key(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence, String str);

    public static final native void Map_String_Map_Int_Vector_SymbolConfidence_set(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence, String str, long j2, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence);

    public static final native long Map_String_Map_Int_Vector_SymbolConfidence_size(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence);

    public static final native void Map_String_Shared_ptr_Variable_clear(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable);

    public static final native void Map_String_Shared_ptr_Variable_del(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable, String str);

    public static final native boolean Map_String_Shared_ptr_Variable_empty(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable);

    public static final native long Map_String_Shared_ptr_Variable_get(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable, String str);

    public static final native boolean Map_String_Shared_ptr_Variable_has_key(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable, String str);

    public static final native void Map_String_Shared_ptr_Variable_set(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable, String str, long j2, Variable variable);

    public static final native long Map_String_Shared_ptr_Variable_size(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable);

    public static final native void Map_String_String_clear(long j, Map_String_String map_String_String);

    public static final native void Map_String_String_del(long j, Map_String_String map_String_String, String str);

    public static final native boolean Map_String_String_empty(long j, Map_String_String map_String_String);

    public static final native String Map_String_String_get(long j, Map_String_String map_String_String, String str);

    public static final native boolean Map_String_String_has_key(long j, Map_String_String map_String_String, String str);

    public static final native void Map_String_String_set(long j, Map_String_String map_String_String, String str, String str2);

    public static final native long Map_String_String_size(long j, Map_String_String map_String_String);

    public static final native int NoGridFound_get();

    public static final native int NoInformationFound_get();

    public static final native int NoLinesFound_get();

    public static final native int NoTextFound_get();

    public static final native int NotEnoughContoursFound_get();

    public static final native int NotEnoughPointsFound_get();

    public static final native int OperationNotFound_get();

    public static final native int OtherConditionNotMet_get();

    public static final native int POLYGON_get();

    public static final native int ParameterInvalid_get();

    public static final native double Polygon_area(long j, Polygon polygon);

    public static final native double Polygon_boundingHeight(long j, Polygon polygon);

    public static final native double Polygon_boundingRatio(long j, Polygon polygon);

    public static final native Rect Polygon_boundingRect(long j, Polygon polygon);

    public static final native double Polygon_boundingWidth(long j, Polygon polygon);

    public static final native double Polygon_boundingX(long j, Polygon polygon);

    public static final native double Polygon_boundingY(long j, Polygon polygon);

    public static final native boolean Polygon_isConvex(long j, Polygon polygon);

    public static final native int Polygon_length(long j, Polygon polygon);

    public static final native long Polygon_points(long j, Polygon polygon);

    public static final native void Polygon_setPoints(long j, Polygon polygon, long j2, Vector_Point vector_Point);

    public static final native int RECT_get();

    public static final native int RESULT_get();

    public static final native int RegionOfInterestOutsideImageBounds_get();

    public static final native long Reporter_getInstance();

    public static final native void Reporter_initReporter(long j, Reporter reporter, String str, String str2);

    public static final native void Reporter_reportCameraParameters(long j, Reporter reporter, String str);

    public static final native int ResultNotValid_get();

    public static final native long RunFailure_SWIGUpcast(long j);

    public static final native int SCALAR_get();

    public static final native int SEVEN_SEGMENT_CONTOURS_get();

    public static final native int SQUARE_get();

    public static final native int STRING_get();

    public static final native long SevenSegmentContour_SWIGSmartPtrUpcast(long j);

    public static final native int SevenSegmentContour_kFullDigit_get();

    public static final native int SevenSegmentContour_kHalfDigit_get();

    public static final native int SevenSegmentContour_kHorizontalSingle_get();

    public static final native int SevenSegmentContour_kInvalid_get();

    public static final native int SevenSegmentContour_kVerticalSingle_get();

    public static final native void SevenSegmentContour_setType(long j, SevenSegmentContour sevenSegmentContour, int i);

    public static final native int SevenSegmentContour_type(long j, SevenSegmentContour sevenSegmentContour);

    public static final native double Square_area(long j, Square square);

    public static final native double Square_boundingHeight(long j, Square square);

    public static final native double Square_boundingWidth(long j, Square square);

    public static final native double Square_boundingX(long j, Square square);

    public static final native double Square_boundingY(long j, Square square);

    public static final native Point Square_downLeft(long j, Square square);

    public static final native Point Square_downRight(long j, Square square);

    public static final native double Square_innerHeight(long j, Square square);

    public static final native double Square_innerWidth(long j, Square square);

    public static final native double Square_innerX(long j, Square square);

    public static final native double Square_innerY(long j, Square square);

    public static final native double Square_leftHeight(long j, Square square);

    public static final native double Square_lowerWidth(long j, Square square);

    public static final native double Square_maxHeight(long j, Square square);

    public static final native double Square_maxWidth(long j, Square square);

    public static final native double Square_ratio(long j, Square square);

    public static final native double Square_rightHeight(long j, Square square);

    public static final native void Square_setDownLeft(long j, Square square, Point point);

    public static final native void Square_setDownRight(long j, Square square, Point point);

    public static final native void Square_setPoints(long j, Square square, Point point, Point point2, Point point3, Point point4);

    public static final native void Square_setUpLeft(long j, Square square, Point point);

    public static final native void Square_setUpRight(long j, Square square, Point point);

    public static final native Point Square_upLeft(long j, Square square);

    public static final native Point Square_upRight(long j, Square square);

    public static final native double Square_upperWidth(long j, Square square);

    public static final native int StackDidNotFoundResult_get();

    public static final native int StringPatternNotMatching_get();

    public static final native float SymbolConfidence_confidence_get(long j, SymbolConfidence symbolConfidence);

    public static final native void SymbolConfidence_confidence_set(long j, SymbolConfidence symbolConfidence, float f);

    public static final native char SymbolConfidence_symbol_get(long j, SymbolConfidence symbolConfidence);

    public static final native void SymbolConfidence_symbol_set(long j, SymbolConfidence symbolConfidence, char c);

    public static final native int SyntaxError_get();

    public static final native long SyntaxException_SWIGUpcast(long j);

    public static final native int TooDark_get();

    public static final native int TooMuchReflections_get();

    public static final native int TypeError_get();

    public static final native int UNDEFINED_get();

    public static final native long Variable_getContoursValue(long j, Variable variable) throws AnylineException;

    public static final native double Variable_getDoubleValue(long j, Variable variable) throws AnylineException;

    public static final native int Variable_getIntValue(long j, Variable variable) throws AnylineException;

    public static final native Rect Variable_getRectValue(long j, Variable variable) throws AnylineException;

    public static final native Scalar Variable_getScalarValue(long j, Variable variable) throws AnylineException;

    public static final native long Variable_getSevenSegmentContoursValue(long j, Variable variable) throws AnylineException;

    public static final native String Variable_getStringValue(long j, Variable variable) throws AnylineException;

    public static final native void Variable_getValue__SWIG_0(long j, Variable variable, int i) throws AnylineException;

    public static final native void Variable_getValue__SWIG_1(long j, Variable variable, double d) throws AnylineException;

    public static final native void Variable_getValue__SWIG_10(long j, Variable variable, long j2, Vector_SevenSegmentContour vector_SevenSegmentContour) throws AnylineException;

    public static final native void Variable_getValue__SWIG_2(long j, Variable variable, long j2) throws AnylineException;

    public static final native void Variable_getValue__SWIG_3(long j, Variable variable, Scalar scalar) throws AnylineException;

    public static final native void Variable_getValue__SWIG_4(long j, Variable variable, Rect rect) throws AnylineException;

    public static final native void Variable_getValue__SWIG_5(long j, Variable variable, long j2, Vector_Contour vector_Contour) throws AnylineException;

    public static final native void Variable_getValue__SWIG_6(long j, Variable variable, String str) throws AnylineException;

    public static final native void Variable_getValue__SWIG_7(long j, Variable variable, long j2, CoreResult coreResult) throws AnylineException;

    public static final native void Variable_getValue__SWIG_8(long j, Variable variable, long j2, Square square) throws AnylineException;

    public static final native void Variable_getValue__SWIG_9(long j, Variable variable, long j2, Polygon polygon) throws AnylineException;

    public static final native long Variable_interpretedVariable(String str);

    public static final native int Variable_type(long j, Variable variable);

    public static final native String Variable_typeAsString(long j, Variable variable);

    public static final native void Vector_Contour_add(long j, Vector_Contour vector_Contour, long j2, Contour contour);

    public static final native long Vector_Contour_capacity(long j, Vector_Contour vector_Contour);

    public static final native void Vector_Contour_clear(long j, Vector_Contour vector_Contour);

    public static final native long Vector_Contour_get(long j, Vector_Contour vector_Contour, int i);

    public static final native boolean Vector_Contour_isEmpty(long j, Vector_Contour vector_Contour);

    public static final native void Vector_Contour_reserve(long j, Vector_Contour vector_Contour, long j2);

    public static final native void Vector_Contour_set(long j, Vector_Contour vector_Contour, int i, long j2, Contour contour);

    public static final native long Vector_Contour_size(long j, Vector_Contour vector_Contour);

    public static final native void Vector_LineDuration_add(long j, Vector_LineDuration vector_LineDuration, long j2, LineDuration lineDuration);

    public static final native long Vector_LineDuration_capacity(long j, Vector_LineDuration vector_LineDuration);

    public static final native void Vector_LineDuration_clear(long j, Vector_LineDuration vector_LineDuration);

    public static final native long Vector_LineDuration_get(long j, Vector_LineDuration vector_LineDuration, int i);

    public static final native boolean Vector_LineDuration_isEmpty(long j, Vector_LineDuration vector_LineDuration);

    public static final native void Vector_LineDuration_reserve(long j, Vector_LineDuration vector_LineDuration, long j2);

    public static final native void Vector_LineDuration_set(long j, Vector_LineDuration vector_LineDuration, int i, long j2, LineDuration lineDuration);

    public static final native long Vector_LineDuration_size(long j, Vector_LineDuration vector_LineDuration);

    public static final native void Vector_Point_add(long j, Vector_Point vector_Point, Point point);

    public static final native long Vector_Point_capacity(long j, Vector_Point vector_Point);

    public static final native void Vector_Point_clear(long j, Vector_Point vector_Point);

    public static final native Point Vector_Point_get(long j, Vector_Point vector_Point, int i);

    public static final native boolean Vector_Point_isEmpty(long j, Vector_Point vector_Point);

    public static final native void Vector_Point_reserve(long j, Vector_Point vector_Point, long j2);

    public static final native void Vector_Point_set(long j, Vector_Point vector_Point, int i, Point point);

    public static final native long Vector_Point_size(long j, Vector_Point vector_Point);

    public static final native void Vector_SevenSegmentContour_add(long j, Vector_SevenSegmentContour vector_SevenSegmentContour, long j2, SevenSegmentContour sevenSegmentContour);

    public static final native long Vector_SevenSegmentContour_capacity(long j, Vector_SevenSegmentContour vector_SevenSegmentContour);

    public static final native void Vector_SevenSegmentContour_clear(long j, Vector_SevenSegmentContour vector_SevenSegmentContour);

    public static final native long Vector_SevenSegmentContour_get(long j, Vector_SevenSegmentContour vector_SevenSegmentContour, int i);

    public static final native boolean Vector_SevenSegmentContour_isEmpty(long j, Vector_SevenSegmentContour vector_SevenSegmentContour);

    public static final native void Vector_SevenSegmentContour_reserve(long j, Vector_SevenSegmentContour vector_SevenSegmentContour, long j2);

    public static final native void Vector_SevenSegmentContour_set(long j, Vector_SevenSegmentContour vector_SevenSegmentContour, int i, long j2, SevenSegmentContour sevenSegmentContour);

    public static final native long Vector_SevenSegmentContour_size(long j, Vector_SevenSegmentContour vector_SevenSegmentContour);

    public static final native void Vector_String_add(long j, Vector_String vector_String, String str);

    public static final native long Vector_String_capacity(long j, Vector_String vector_String);

    public static final native void Vector_String_clear(long j, Vector_String vector_String);

    public static final native String Vector_String_get(long j, Vector_String vector_String, int i);

    public static final native boolean Vector_String_isEmpty(long j, Vector_String vector_String);

    public static final native void Vector_String_reserve(long j, Vector_String vector_String, long j2);

    public static final native void Vector_String_set(long j, Vector_String vector_String, int i, String str);

    public static final native long Vector_String_size(long j, Vector_String vector_String);

    public static final native void Vector_SymbolConfidence_add(long j, Vector_SymbolConfidence vector_SymbolConfidence, long j2, SymbolConfidence symbolConfidence);

    public static final native long Vector_SymbolConfidence_capacity(long j, Vector_SymbolConfidence vector_SymbolConfidence);

    public static final native void Vector_SymbolConfidence_clear(long j, Vector_SymbolConfidence vector_SymbolConfidence);

    public static final native long Vector_SymbolConfidence_get(long j, Vector_SymbolConfidence vector_SymbolConfidence, int i);

    public static final native boolean Vector_SymbolConfidence_isEmpty(long j, Vector_SymbolConfidence vector_SymbolConfidence);

    public static final native void Vector_SymbolConfidence_reserve(long j, Vector_SymbolConfidence vector_SymbolConfidence, long j2);

    public static final native void Vector_SymbolConfidence_set(long j, Vector_SymbolConfidence vector_SymbolConfidence, int i, long j2, SymbolConfidence symbolConfidence);

    public static final native long Vector_SymbolConfidence_size(long j, Vector_SymbolConfidence vector_SymbolConfidence);

    public static final native void delete_AnylineCore(long j);

    public static final native void delete_AnylineCoreDelegate(long j);

    public static final native void delete_AnylineException(long j);

    public static final native void delete_ArgumentException(long j);

    public static final native void delete_CheckLicense(long j);

    public static final native void delete_Contour(long j);

    public static final native void delete_CoreResult(long j);

    public static final native void delete_LicenseException(long j);

    public static final native void delete_LineDuration(long j);

    public static final native void delete_Map_Integer_Vector_SymbolConfidence(long j);

    public static final native void delete_Map_String_Integer(long j);

    public static final native void delete_Map_String_Map_Int_Vector_SymbolConfidence(long j);

    public static final native void delete_Map_String_Shared_ptr_Variable(long j);

    public static final native void delete_Map_String_String(long j);

    public static final native void delete_Polygon(long j);

    public static final native void delete_Reporter(long j);

    public static final native void delete_RunFailure(long j);

    public static final native void delete_SevenSegmentContour(long j);

    public static final native void delete_Square(long j);

    public static final native void delete_SymbolConfidence(long j);

    public static final native void delete_SyntaxException(long j);

    public static final native void delete_Variable(long j);

    public static final native void delete_Vector_Contour(long j);

    public static final native void delete_Vector_LineDuration(long j);

    public static final native void delete_Vector_Point(long j);

    public static final native void delete_Vector_SevenSegmentContour(long j);

    public static final native void delete_Vector_String(long j);

    public static final native void delete_Vector_SymbolConfidence(long j);

    public static final native String kNoValueFound_get();

    public static final native long new_AnylineCore(String str, String str2, String str3, String str4, String str5, String str6, long j, AnylineCoreDelegate anylineCoreDelegate) throws ArgumentException, LicenseException;

    public static final native long new_Contour__SWIG_0();

    public static final native long new_Contour__SWIG_1(long j, Vector_Point vector_Point);

    public static final native long new_Contour__SWIG_2(long j, Vector_Point vector_Point, Rect rect);

    public static final native long new_Contour__SWIG_3(long j, Contour contour);

    public static final native long new_CoreResult();

    public static final native long new_LineDuration();

    public static final native long new_Map_Integer_Vector_SymbolConfidence__SWIG_0();

    public static final native long new_Map_Integer_Vector_SymbolConfidence__SWIG_1(long j, Map_Integer_Vector_SymbolConfidence map_Integer_Vector_SymbolConfidence);

    public static final native long new_Map_String_Integer__SWIG_0();

    public static final native long new_Map_String_Integer__SWIG_1(long j, Map_String_Integer map_String_Integer);

    public static final native long new_Map_String_Map_Int_Vector_SymbolConfidence__SWIG_0();

    public static final native long new_Map_String_Map_Int_Vector_SymbolConfidence__SWIG_1(long j, Map_String_Map_Int_Vector_SymbolConfidence map_String_Map_Int_Vector_SymbolConfidence);

    public static final native long new_Map_String_Shared_ptr_Variable__SWIG_0();

    public static final native long new_Map_String_Shared_ptr_Variable__SWIG_1(long j, Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable);

    public static final native long new_Map_String_String__SWIG_0();

    public static final native long new_Map_String_String__SWIG_1(long j, Map_String_String map_String_String);

    public static final native long new_Polygon__SWIG_0();

    public static final native long new_Polygon__SWIG_1(long j, Polygon polygon);

    public static final native long new_Polygon__SWIG_2(Rect rect);

    public static final native long new_Polygon__SWIG_3(long j, Square square);

    public static final native long new_Polygon__SWIG_4(long j, Vector_Point vector_Point);

    public static final native long new_SevenSegmentContour(long j, Contour contour, int i);

    public static final native long new_Square__SWIG_0();

    public static final native long new_Square__SWIG_1(long j, Square square);

    public static final native long new_Square__SWIG_2(Rect rect);

    public static final native long new_Square__SWIG_3(Point point, Point point2, Point point3, Point point4);

    public static final native long new_SymbolConfidence();

    public static final native long new_Variable__SWIG_0();

    public static final native long new_Variable__SWIG_1(int i);

    public static final native long new_Variable__SWIG_10(long j, Square square);

    public static final native long new_Variable__SWIG_11(long j, Polygon polygon);

    public static final native long new_Variable__SWIG_12(long j, Vector_SevenSegmentContour vector_SevenSegmentContour);

    public static final native long new_Variable__SWIG_2(double d);

    public static final native long new_Variable__SWIG_3(long j);

    public static final native long new_Variable__SWIG_4(Scalar scalar);

    public static final native long new_Variable__SWIG_5(Rect rect);

    public static final native long new_Variable__SWIG_6(long j, Vector_Contour vector_Contour);

    public static final native long new_Variable__SWIG_7(String str);

    public static final native long new_Variable__SWIG_8(long j, CoreResult coreResult);

    public static final native long new_Variable__SWIG_9(String str, boolean z) throws ArgumentException;

    public static final native long new_Vector_Contour__SWIG_0();

    public static final native long new_Vector_Contour__SWIG_1(long j);

    public static final native long new_Vector_LineDuration__SWIG_0();

    public static final native long new_Vector_LineDuration__SWIG_1(long j);

    public static final native long new_Vector_Point__SWIG_0();

    public static final native long new_Vector_Point__SWIG_1(long j);

    public static final native long new_Vector_SevenSegmentContour__SWIG_0();

    public static final native long new_Vector_SevenSegmentContour__SWIG_1(long j);

    public static final native long new_Vector_String__SWIG_0();

    public static final native long new_Vector_String__SWIG_1(long j);

    public static final native long new_Vector_SymbolConfidence__SWIG_0();

    public static final native long new_Vector_SymbolConfidence__SWIG_1(long j);
}
