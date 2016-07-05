package in.parsel.pvr.constants;

public class ErrorCode {

    public static final String UNKNOWN = "PAC.0.0.0";
    public static final String UNKNOWN_ERROR = "TI.0.0.1";
    public static final String BAD_REQUEST = "400";
    public static final String UNAUTHORIZED = "401";
    public static final String PAYMENT_REQUIRED = "402";
    public static final String FORBIDDEN = "403";
    public static final String RESOURCE_NOT_FOUND = "404";
    public static final String METHOD_NOT_ALLOWED = "405";
    public static final String UNSUPPORTED_MEDIA_TYPE = "415";
    public static final String INTERNAL_ERROR = "500";
    public static final String NOT_IMPLEMENTED = "501";
    public static final String SERVICE_OVERLOADED = "502";
    public static final String GATEWAY_TIMEOUT_OR_SERVICE_UNAVAILABLE = "503";
    public static final String MOVED_PERMANENTLY_TO_OTHER_URL = "300";
    public static final String FOUND_AND_MOVED_PERMANENTLY_TO_OTHER_URL = "301";
    public static final String FOUND_TRY_ANOTHER_URL = "302";
    public static final String NOT_MODIFIED = "303";

    //General
    public static final String NETWORK_NOT_CONNECTED = "PAC.0.0.1";
    public static final String SERVER_NOT_FOUND = "PAC.0.0.2";
    public static final String SERVER_CONNECTION_REFUSED = "PAC.0.0.3";
    public static final String INSERT_VALUES_EMPTY = "PAC.0.0.4";

	/* Client */

    /* Login */
    public static final String USERNAME_EMPTY = "PAC.0.1.1";
    public static final String PASSWORD_EMPTY = "PAC.0.1.2";

    /* Login */
    public static final String EMAIL_ID_EMPTY = "PAC.0.8.1";


    /* Configure Destination */
    public static final String CONFIGURE_DESTINATION_DEST_EMPTY = "PAC.0.4.1";
    public static final String CONFIGURE_DESTINATION_DATE_EMPTY = "PAC.0.4.2";
    public static final String CONFIGURE_DESTINATION_TIME_EMPTY = "PAC.0.4.3";
    public static final String CONFIGURE_DESTINATION_CONTENT_EMPTY = "PAC.0.4.4";
    public static final String CONFIGURE_DESTINATION_CONTENT_VALUE_EMPTY = "PAC.0.4.5";

    /*Driver Online time */
    public static final String DOT_FROM_TIME_EMPTY = "PAC.0.5.1";
    public static final String DOT_TO_TIME_EMPTY = "PAC.0.5.2";


    /*Book Shipment*/
    public static final String DESTINATION_LATLNG_EMPTY = "PAC.0.6.1";
    public static final String ORIGIN_LATLNG_EMPTY = "PAC.0.6.2";
    public static final String ORIGIN_ADDRESS_EMPTY = "PAC.0.6.3";
    public static final String DEST_ADRESS_EMPTY = "PAC.0.6.4";
    public static final String PICK_UP_TIME_EMPTY = "PAC.0.6.5";
    public static final String DROP_TIME_EMPTY = "PAC.0.6.6";
    public static final String PICK_UP_DATE_EMPTY = "PAC.0.6.7";
    public static final String DROP_DATE_EMPTY = "PAC.0.6.8";
    public static final String VEHICLE_TYPE_EMPTY = "PAC.0.6.9";
    public static final String DEST_ORIGIN_SAME = "PAC.0.6.10";

    /*Collect Parcel*/
    /* Login */
    public static final String QR_CODE_EMPTY = "PAC.0.7.1";
    public static final String QR_NAME_EMPTY = "PAC.0.7.2";

    public static final String SHIPMENT_NOT_EXISTING = "TI.0.2.11";
    public static final String INVALID_USERNAME_PASSWORD = "TI.0.1.3";

}
