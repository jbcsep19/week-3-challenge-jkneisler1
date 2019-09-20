import java.util.ArrayList;

public class Skills {

    private ArrayList<String> skills = new ArrayList<>();

    // Helper methods
    public void putString(String str) {
        skills.add(str);
    }

    public String printSkills(String header, Skills sk) {
        StringBuilder sbts = new StringBuilder();
        sbts.append(header);
        sbts.append("\n==================");
        if ((sk.getSkills().size()) % 2 == 0) {
            for (int i = 0; i < sk.getSkills().size(); i = i + 2) {
                sbts.append("\n   * ");
                sbts.append(sk.getSkills().get(i));
                for (int j = 0; j < (40 - (sk.getSkills().get(i).length() + 5)); j++) {
                    sbts.append(" ");
                }
                sbts.append("   * ");
                sbts.append(sk.getSkills().get(i + 1));
                sbts.append("\n");
            }
        }
        else {
            for (int i = 0; i < sk.getSkills().size() - 1; i = i + 2) {
                sbts.append("\n   * ");
                sbts.append(sk.getSkills().get(i));
                for (int j = 0; j < (40 - (sk.getSkills().get(i).length() + 5)); j++) {
                    sbts.append(" ");
                }
                sbts.append("   * ");
                sbts.append(sk.getSkills().get(i + 1));
                sbts.append("\n");
            }
            sbts.append("   * ");
            sbts.append(sk.getSkills().get(sk.getSkills().size()-1));       // Problem child
            sbts.append("\n");
        }
        sbts.append("\n");

        return sbts.toString();
    }

    // Constructors
    public Skills() {
    }
    public Skills(ArrayList<String> skills) {
        this.skills = skills;
    }

    // Getters and setters
    public ArrayList<String> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
