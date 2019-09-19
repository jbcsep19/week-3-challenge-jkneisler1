public class Education {
    String universityName;
    String universityAddress;
    Double gradePointAverage;
    Boolean graduated;
    String degree;
    String other;

    public Education() {
    }

    public Education(String universityName, String universityAddress, Double gradePointAverage, Boolean graduated, String degree, String other) {
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.gradePointAverage = gradePointAverage;
        this.graduated = graduated;
        this.degree = degree;
        this.other = other;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public Double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(Double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
