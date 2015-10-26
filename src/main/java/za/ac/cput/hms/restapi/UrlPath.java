package za.ac.cput.hms.restapi;

/**
 * Created by Andies on 2015-10-22.
 */
public class UrlPath {

    public static final String URL = "http://localhost:8080";

    public static class CityLinks{
        public static final String POST = URL + "/api/city/create";
        public static final String GET_ID = URL + "/api/city/get/";
        public static final String GETALL = URL + "/api/city/get/cities";
        public static final String PUT = URL + "/api/city/update";
    }

    public static class ResidenceLinks{
        public static final String POST = URL + "/api/residence/create";
        public static final String GET_ID = URL + "/api/residence/get/";
        public static final String GETALL = URL + "/api/residence/get/residences";
        public static final String PUT = URL + "/api/residence/update";
    }

    public static class RoomLinks{
        public static final String POST = URL + "/api/room/create";
        public static final String GET_ID = URL + "/api/room/get/";
        public static final String GETALL = URL + "/api/room/get/rooms";
    }
}
