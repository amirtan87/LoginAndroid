package in.parsel.pvr.constants;

import android.os.Build;

public class Constants {


    public static final int ENV = 2;
    public static final String BASE_URL = (ENV == 1) ?
            "https://dev.parsel.in/pbb/" : (ENV == 2) ? "https://pvr.parsel.in/pbb/" : (ENV == 4) ?"http://54.169.36.204/pbb/" :
            (ENV == 5)?"http://54.169.72.9/pbb/" :"http://live.parsel.in:8080/pbb/";
    public static final String PLACES_API_KEY = "AIzaSyAaVfRB94hmwuv6wu5JQ9nf8wrTYDw21lU";
    public static final String SOCKET_URL = (ENV == 1) ? "ws://dev.parsel.in:8080/PVRSocket/pvrsock?uId="
            : (ENV == 2) ? "ws://pvr.parsel.in:8080/PVRSocket/pvrsock?uId=" :(ENV == 4) ?"ws://54.169.36.204/PVRSocket/pvrsock?uId=" :
            "ws://52.74.192.212:8080/PVRSocket/pvrsock?uId=";

    // Database creation sql statement
    public enum DatabaseTables {

        TABLE_QUANTUM_SHIPMENTS("create table quantum_job(uId text primary key, "
                                  + " sId integer , job text not null, status text, dropPack integer);",
                                  "quantum_job",
                                  new String[]{"uId", "sId", "job", "status", "dropPack"}),
        TABLE_CARRIER_LIST("create table carriers(cId integer primary key, "
                + " carrier text not null);",
                "carriers",
                new String[]{"cId", "carrier"}),
        TABLE_DRIVER_LOG("create table driver_log(dId integer, "
                + " log text not null , time text not null ,state integer);",
                "driver_log",
                new String[]{"dId", "log", "time", "state"});

        private String query;
        private String table;
        private String[] columns;

        DatabaseTables(String que, String tab, String[] cols) {
            query = que;
            table = tab;
            columns = cols;
        }

        public String query() {
            return query;
        }

        public String[] columns() {
            return columns;
        }

        public String table() {
            return table;
        }
    }

    public static  class Device{
        public static String OSNAME = System.getProperty("os.name");
        public static String OSVERSION = System.getProperty("os.version");
        public static String RELEASE = Build.VERSION.RELEASE;
        public static String DEVICE = Build.DEVICE;
        public static String MODEL = Build.MODEL;
        public static String PRODUCT = Build.PRODUCT;
        public static String DEVICE_INFO =  "VERSION.RELEASE : "+ Build.VERSION.RELEASE
        +"\nVERSION.INCREMENTAL : "+Build.VERSION.INCREMENTAL
        +"\nVERSION.SDK.NUMBER : "+Build.VERSION.SDK_INT
        +"\nBOARD : "+Build.BOARD
        +"\nBOOTLOADER : "+Build.BOOTLOADER
        +"\nBRAND : "+Build.BRAND
        +"\nCPU_ABI : "+Build.CPU_ABI
        +"\nCPU_ABI2 : "+Build.CPU_ABI2
        +"\nDISPLAY : "+Build.DISPLAY
        +"\nFINGERPRINT : "+Build.FINGERPRINT
        +"\nHARDWARE : "+Build.HARDWARE
        +"\nHOST : "+Build.HOST
        +"\nID : "+Build.ID
        +"\nMANUFACTURER : "+Build.MANUFACTURER
        +"\nMODEL : "+Build.MODEL
        +"\nPRODUCT : "+Build.PRODUCT
        +"\nSERIAL : "+Build.SERIAL
        +"\nTAGS : "+Build.TAGS
        +"\nTIME : "+Build.TIME
        +"\nTYPE : "+Build.TYPE
        +"\nUNKNOWN : "+Build.UNKNOWN
        +"\nUSER : "+Build.USER;
    }

    public static class HeaderProperty {
        public static  final String UUID = "uuid";
        public static  final String DEVICE_TOKEN = "device_token";
        public static  final String DEVICE_INFO = "device_info";

    }

    public static class SharedPreferenceKeys {
        public static final String PVR = "pvr";
        public static final String USER = "user";
        public static final String VEHICLE = "vehicle";
        public static final String PASSWORD = "password";
        public static final String ONLINE = "online";
        public static final String SHIPMENT_ID = "shipment_id";
        public static final String ACK_SHIPMENT_ID = "ack_shipment_id";
        public static final String PQSID = "pqsid";
        public static final String SHIPPER_JOB = "shipper_job";
        public static final String SHIPMENT_COUNT = "shipment_count";
        public static final String STATUS_CODE = "status_code";
    }

    public static class GData {

        // Milliseconds per second
        public static final int MILLISECONDS_PER_SECOND = 1000;

        // The update interval
        public static final int UPDATE_INTERVAL_IN_SECONDS = 5;

        // A fast interval ceiling
        public static final int FAST_CEILING_IN_SECONDS = 1;

        // Update interval in milliseconds
        public static final long UPDATE_INTERVAL_IN_MILLISECONDS = MILLISECONDS_PER_SECOND
                * UPDATE_INTERVAL_IN_SECONDS;

        // A fast ceiling of update intervals, used when the app is visible
        public static final long FAST_INTERVAL_CEILING_IN_MILLISECONDS = MILLISECONDS_PER_SECOND
                * FAST_CEILING_IN_SECONDS;

    }

    public static class Titles {
        public static final String PVR = "PVR";
        public static final String LOGIN = "Login";
        public static final String LOGOUT = "Logout";
        public static final String APP_ONLINE = "App Online";
        public static final String CARRIER = "Carrier";
        public static final String FORGET_PASSWORD = "Forget Password";
        public static final String REGISTER = "Register";
        public static final String MY_MAP_TITLE = "Map";
        public static final String SHIPMENTS = "Shipments";
        public static final String TRIP = "TRIP";
        public static final String COLLECT_AMOUNT = "Collect Amount";
        public static final String TURN_AWAY = "Turn Away";
        public static final String SOS = "Help !";
        public static final String COLLECT_PARCEL = "Parcel Collect";
        public static final String SHIFT_TIME = "Shift Time";
        public static final String ONGOING_SHIPMENTS = "Ongoing Shipments";
        public static final String PENDING_SHIPMENTS = "Pending Shipments";
        public static final String DELIVERED_SHIPMENTS = "Delivered Shipments";
        public static final String OTP_ACCESS = "OTP Access";
        public static final String CARRIER_LIST = "Carriers";
        public static final String QUANTUM = "Quantum";
        public static final String EMPTY = "";

    }

    public static class URL {
        public static final String REGISTER = BASE_URL + "sec/signup";
            public static final String LOGIN = BASE_URL + "sec/login";
        public static final String LOGOUT = BASE_URL + "sec/logout";
        public static final String FORGOT_PASSWORD = BASE_URL + "sec/forgotpass";
        public static final String RETRIEVE_SHIPMENTS = BASE_URL + "drivr/retrieveshipments";
        public static final String UPDATE_SHIPMENT_STATE = BASE_URL + "drivr/updateshipmentstate";
        public static final String CREATE_QUANTUM = BASE_URL + "drivr/createquantumshipment";
        public static final String UPDATE_DRIVER_LOCATION = BASE_URL + "drivr/updatedriverlocation";
        public static final String TURN_AWAY = BASE_URL + "drivr/updateshipmentstate";
        public static final String SOS = BASE_URL + "drivr/sos";
        public static final String MANAGE_ONLINE = BASE_URL + "drivr/manageonline";
        public static final String DROP_PACKAGAE = BASE_URL + "drivr/droppackage";
        public static final String CHECK_SHIFTTIME = BASE_URL + "drivr/drivershiftstatus";
        public static final String GET_ALL_CARRIERS = BASE_URL + "sadm/carriers";
        public static final String DRIVER_ACK = BASE_URL + "drivr/statusdelivery";
        public static final String QUANTUM_CACHE = BASE_URL + "drivr/savecacheshipments";
        public static final String ONLINE_LOG_CACHE = BASE_URL + "drivr/saveonlinecache";
        public static final String DEVICE_LOG = BASE_URL + "common/logactions";
        public static final String RETRIEVE_SHIPMENTS_PAGINATION = BASE_URL + "drivr/retrievechshipments";
        public static final String OTP_GENERATE = BASE_URL + "sadm/generateOTP";
        public static final String OTP_VALIDATE = BASE_URL + "sadm/validateOTP";
    }

    public static class Keys {
        public static final String NAVIGATION_INFO = "navigation_info";
        public final static String BASE_URL_KEY = "BASEURL";
        public final static String MESSAGE_KEY = "msg";
        public final static String MESSAGE_TITLE = "title";
        public final static String TITLE_IMAGE = "title_image";
        public final static String IS_SMS = "is_sms";
        public final static String SHIPPER_JOB = "shipper_job";
        public final static String SHIPPER_JOBS = "shipper_jobs";
        public final static String IS_QUANTUM = "is_quantum";
        public final static String STATUS_CODE = "status_code";
        public final static String AS_CP = "as_cp";
        public final static String NOTIFICATION_XML = "notification_xml";
        public final static String CARRIER_ID = "carrier_id";
        public final static String CARRIER_NAME = "carrier_name";
        public final static String COD = "cod";
        public final static String QRCODE = "qrcode";
        public final static String QRNAME = "qrname";
        public final static String CLAT = "clat";
        public final static String CLNG = "clng";
        public final static String LAT = "lat";
        public final static String LNG = "lng";
        public final static String IS_END_TRIP = "is_end_trip";
        public final static String ASSIGNED_COUNT = "assignedShipments";
        public final static String ONGOING_COUNT = "ongoingShipments";
        public static final String SENT_TOKEN_TO_SERVER = "sentTokenToServer";
        public static final String REGISTRATION_COMPLETE = "registrationComplete";
        public static final String CARRIERS = "carriers";
        public static final String BILL_NO = "bill_no";
        public static final String IS_DROP = "is_drop";
        public static final String SHIPMENT_ACK = "shipment_ack";
        public static final String USER_MULTI_CONNECT = "User Multiple Connection";
        public static final String USER_EMPTY = "User Id is 0";
        public static final String INVALID_USER = "Invalid User Token";
        public static final String GCM_TOKEN = "gcm_token";
        public static final String RECIPIENT_NO = "recipient_no";
        public static final String PACKET_NO = "pack_no";
        public static final String PACKET_COUNT = "pack_count";
        public static final String HAS_OTP = "has_otp";
        public static final String VALID_OTP = "valid_otp";
    }

    public static class Status {
        public static final String ASSIGNED_TIME = "ASSIGNED_TIME";
        public final static String REACHED_TIME = "REACHED_TIME";
        public final static String START_TRIP_TIME = "START_TRIP_TIME";
        public final static String END_TRIP_TIME = "END_TRIP_TIME";
        public final static String COMPLETED_TIME = "COMPLETED_TIME";
        public final static String COMPLETED_LOCATION = "COMPLETED_LOCATION";
        public final static String START_LOCATION = "START_LOCATION";
        public final static String REACHED_LOCATION = "REACHED_LOCATION";
        public final static String COMPLETED_ADDRESS = "COMPLETED_ADDRESS";
        public final static String AMOUNT_COLLECTED = "AMOUNT_COLLECTED";
        public final static String DISTANCE_TRAVELLED = "DISTANCE_TRAVELLED";
        public final static String TRAVEL_TIME = "TRAVEL_TIME";
        public final static String COD = "COD";
        public static final String ASSIGNED = "AS";
        public static final String REACHED = "RC";
        public static final String COLLECT_PARCEL = "CP";
        public static final String START_TRIP = "ST";
        public static final String DROP_PACK = "DP";
        public static final String END_TRIP = "ET";
        public static final String COLLECT_AMOUNT = "CA";
        public static final String TURNED_AWAY = "TA";
        public static final String QSTARTED = "qstarted";
        public static final String QENDED = "qended";

    }

    public static class QUANTUM_TYPE {
        public static final int START_TRIP = 1;
        public static final int DROP_PACKAGE = 2;
        public static final int END_TRIP = 3;
    }

    public static class CACHE_REQUEST_TYPE {
        public static final int QUANTUM_CACHE = 1;
        public static final int ONLINE_LOG_CACHE = 2;
    }

    public static class QUANTUM_STATUS {
        public static final String ST = "ST";
        public static final String ST_DP = "ST-DP";
        public static final String ST_DP_ET = "ST-DP-ET";
    }

    public static class Misc {
        public final static String KEY_LOADING = "LOADING";
        public final static String GETTING_ADDRESS = "Getting Address";
    }

    public static class IntentAction {
        public final static String ALARM_MANAGER = "alarm_manager";
    }

    public static class Fare {
        public static final int HALF_DAY_BASE_FARE = 400;
        public static final int PER_TRIP_BASE_FARE = 150;
        public static final int FULL_DAY_BASE_FARE = 700;
    }

    public static class SocketState {
        public static final int DRIVER_START_SHIFT = 1500;
        public static final int DRIVER_END_SHIFT = 1501;
        public static final int UPLOAD = 1;
        public static final int DOWNLOAD = 2;
        public static final int SOS_ALERT = 3;
        public static final int JOB_ASSIGNED = 4;
        public static final int UPDATE_LOCATION = 5;
        public static final int SHIPMENT_COUNT = 6;
        public static final int SOCKET_REACHED = 8;
        public static final int SOCKET_COLLECT_PARCEL = 9;
        public static final int SOCKET_START_TRIP = 10;
        public static final int SOCKET_END_TRIP = 11;
        public static final int SOCKET_COLLECT_AMOUNT = 12;
        public static final int SOCKET_TURNED_AWAY = 13;
        public static final int SOCKET_SHIPMENT_CANCELLED = 14;
        public static final int SOCKET_PONG = -1;

    }

    public static class SharedKeys {
        public final static String CURRENT_LOCATION = "Current Location";
        public final static String USER_AUTH = "user_auth";
        public final static String CUSTOM_PROGRESS_STATE = "custom_progress_state";
    }

    public static class HeaderKey {
        public final static String CONTENT_TYPE = "Content-Type";
    }

    public static class HeaderValue {
        public final static String CONTENT_TYPE = "application/json";
        public final static String UPLOAD_CONTENT_TYPE = "application/octet-stream";
    }

    public static class EVENTS {
    }

    public static class NavigationAction {
        public final static String LOGIN = "login";
        public final static String SHIPMENTLIST_TO_HOME = "shipmentlist_to_home";
        public final static String RTP_TO_PARCEL_LIST = "rtp_to_parcel_list";
        public final static String SHIPMENT_LIST = "shipment_list";
        public final static String MENU_TO_SHIPMENT_LIST = "menu_to_shipment_list";
        public final static String MENU_TO_DJ = "menu_to_dj";
        public final static String RTP_TO_DP = "rtp_to_dp";
        public final static String CP_TO_RTP = "cp_to_rtp";
        public final static String RTP_TO_CP = "rtp_to_cp";
        public final static String TO_LOGOUT = "to_logout";
        public final static String CARRIERID = "carrierid";
        public final static String QRCODE = "qrcode";
        public final static String CARRIER_LIST = "carrier_list";
        public final static String COD = "cod";
        public final static String DROP_PACKAGE = "drop_package";
        public final static String QUANTUM = "Quantum";

    }

    public class Labels {
        public static final String EMPTY = "";
    }

    public class SMSCODES {
        public static final String SMS_BOOKED = "The shipment has been turned away";
        public static final String SMS_SENDER_ID = "PARSEL";
        public static final String SMS_CANCELLED = "cancelled";

    }

    public class ActionCode {
        public final static int BOOKING_TO_ADDINFO = 1007;
        public final static int CARRIERID = 1008;
        public final static int SHIPMENTDETAILS = 1009;
        public final static int COD = 1010;
        public final static int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 8;
        public final static int QRCODE = 1010;
        public static final int SIGNATURE = 1;
        public static final int VS_TO_CPD = 2;
        public static final int QS_TO_CD = 3;
        public static final int CARRIER_LIST = 4;
    }

    public class RequestCode {
        public final static int REGISTER = 1;
        public final static int LOGIN = 2;
        public final static int CHECK_GPS = 3;
        public final static int RETRIEVE_SHIPMENTS = 4;
        public final static int START_TRIP = 5;
        public final static int END_TRIP = 6;
        public final static int UPDATE_DRIVER_LOC = 7;
        public final static int COLLECT_AMOUNT = 8;
        public final static int TURN_AWAY = 9;
        public final static int RTP_TO_MAP = 10;
        public final static int SOS = 11;
        public final static int SAVE_IN_CACHE = 12;
        public final static int COLLECT_PARCEL = 13;
        public final static int REACHED = 14;
        public final static int SMS_ASSIGNED = 15;
        public final static int MANAGE_ONLINE = 16;
        public final static int LOGOUT = 17;
        public final static int SMS_CANCELLED = 18;
        public final static int DROP_PACKAGE = 19;
        public final static int SHIFT_TIME = 20;
        public final static int CARRIERS = 21;
        public final static int FORGET_PASSWORD = 22;
        public final static int DRIVER_ACK = 23;
        public final static int ONGOING_SHIPMENT = 24;
        public final static int PENDING_SHIPMENT = 25;
        public final static int DELIVERED_SHIPMENT = 26;
        public final static int TURNEDAWAY_SHIPMENT = 27;
    }

    public static class ShipmentStatus {
        public final static String PENDING = "Pending";
        public final static String ONGOING = "Ongoing";
        public final static String DELIVERED = "Delivered";
        public final static String TURNEDAWAY = "Turned Away";
    }

    public static class TimerKey {
        public final static String LOCATION_SERVICE = "location_service";
    }

    public static class Counts {
        public final static int STATUS_COUNT = 4;
    }
}
