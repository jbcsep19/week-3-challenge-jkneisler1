import java.util.ArrayList;

public class Resume {
    String name;
    String email;
    String linkeIn;
    String address;
    String city;
    String state;
    String zip;
    String phone;

    // Education
    ArrayList<Education> education;

    // Work Experience
    ArrayList<WorkExperience> workExperience;

    // Skills
    ArrayList<Skills> skills;

    public Resume() {
    }


    public Resume(String name, String email, String linkeIn, String address, String city,
                  String state, String zip, String phone, ArrayList<Education> education,
                  ArrayList<WorkExperience> workExperience, ArrayList<Skills> skills) {
        this.name = name;
        this.email = email;
        this.linkeIn = linkeIn;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.education = education;
        this.workExperience = workExperience;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public String getLinkeIn() {
        return linkeIn;
    }

    public void setLinkeIn(String linkeIn) {
        this.linkeIn = linkeIn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
