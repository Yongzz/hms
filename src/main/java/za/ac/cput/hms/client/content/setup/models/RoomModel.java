package za.ac.cput.hms.client.content.setup.models;

import javax.validation.constraints.NotNull;

/**
 * Created by Andies on 2015-10-23.
 */
public class RoomModel {

    @NotNull
    private String roomType;

    @NotNull
    private String residence;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
