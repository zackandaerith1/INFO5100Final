package Business.Role.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author jaydenwjc
 */
public class VolunteerDirectory {

    private ArrayList<Volunteer> volunteerDirectory;

    public VolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public Volunteer addVolunteer(String id, String name, String address, String email, String contactNumber) {
        Volunteer volunteer = new Volunteer(id, name, address, email, contactNumber);
        volunteerDirectory.add(volunteer);
        return volunteer;
    }

}
