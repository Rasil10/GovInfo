package helpinghand.govinfo.TrialPages;

import java.util.ArrayList;

/**
 * Created by Rasil10 on 2017-12-13.
 */

public class OfficeInfo {
    int id;
    String name;
    String phone;
    ArrayList<String> locations;
    String shortDetail;
    String type;
    int busyRating;




    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(String shortDetail) {
        this.shortDetail = shortDetail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBusyRating() {
        return busyRating;
    }

    public void setBusyRating(int busyRating) {
        this.busyRating = busyRating;
    }
}
