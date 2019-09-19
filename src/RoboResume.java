import java.util.Scanner;

public class RoboResume {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String input;
        boolean tmpBool;                // used in some of the questions below
        Resume yourResume = null;

        System.out.println("Would you like to create a resume? (Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            yourResume = new Resume();
        }
        else {
            System.out.println("Please return to this fabulous app when your are ready.");
            System.exit(0);
        }

        // Enter your personal/specific information
        System.out.print("What is your full name: ");
        input = keybd.nextLine();
        yourResume.setName(input);

        System.out.print("What is your email address: ");
        input = keybd.nextLine();
        yourResume.setEmail(input);

        System.out.print("What is your linkedIn accout address: ");
        input = keybd.nextLine();
        yourResume.setLinkeIn(input);

        System.out.print("What is your current address: ");
        input = keybd.nextLine();
        yourResume.setAddress(input);

        System.out.print("What is your city of residence: ");
        input = keybd.nextLine();
        yourResume.setCity(input);

        System.out.print("What is your state: ");
        input = keybd.nextLine();
        yourResume.setState(input);

        System.out.print("What is your zip: ");
        input = keybd.nextLine();
        yourResume.setZip(input);

        System.out.print("What is your phone number: ");
        input = keybd.nextLine();
        yourResume.setPhone(input);

        // Enter your educational experience
        System.out.println("Did you attend a college or university:(Y|N)");
        input = keybd.nextLine();
        if (input.equalsIgnoreCase("y")) {
            boolean continueEd = true;

            while(continueEd) {
                Education ed = new Education();

                System.out.println("What is the name of the university or college you attended: ");
                input = keybd.nextLine();
                ed.setUniversityName(input);

                System.out.println("What is the address of the university or college you attended: ");
                input = keybd.nextLine();
                ed.setUniversityAddress(input);

                System.out.println("Did you graduate: (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    tmpBool = true;
                } else {
                    tmpBool = false;
                }
                ed.setGraduated(tmpBool);

                if (tmpBool) {
                    System.out.println("What is the grade point average you achieved while attending university or college: ");
                    input = keybd.nextLine();
                    ed.setGradePointAverage(Double.parseDouble(input));

                    System.out.println("What degree did you earn when you graduated university or college: ");
                    input = keybd.nextLine();
                    ed.setDegree(input);
                }

                System.out.println("Did you recieve any awards or recognition when in school");
                input = keybd.nextLine();
                ed.setOther(input);

                yourResume.education.add(ed);

                System.out.println("Did your attend any other colleges or universities? (Y|N)");
                input = keybd.nextLine();
                if (input.equalsIgnoreCase("n")) { continueEd = false; }
            }

            // Skills section
            System.out.println("You will be asked to enter technical, managerial, and soft skills separately");
            System.out.println("Do you have any technical skills that you would like to enter: (Y|N)");
            input = keybd.nextLine();
            if (input.equalsIgnoreCase("y")) {
                boolean continueSkills = true;
                Skills tmpSkills = new Skills();
                while (continueSkills) {
                    System.out.println("Please enter a skill that you would like to enter: ");
                    input = keybd.nextLine();

                    yourResume.skills.add(input);

                    System.out.println("Do you want to enter any more skills? (Y|N)");
                    input = keybd.nextLine();
                    if (input.equalsIgnoreCase("n")) {
                        continueSkills = false;
                    }
                }
            }
        }
    }
}
