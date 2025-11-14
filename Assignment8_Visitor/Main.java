import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        PersonalDetails personal1 = new PersonalDetails("Sanzhar Baiserikov", 20, "+7(777)-869-0854");
        JobDetails job1 = new JobDetails("Student", "AITU", 52000);
        PersonalDetails personal2 = new PersonalDetails("Aizhan Karimova", 25, "+7(701)-1112233");
        JobDetails job2 = new JobDetails("Engineer", "IT", 60000);
        PersonalDetails personal3 = new PersonalDetails("Meiram Tolegen", 17, "+7(705)-4445566");
        JobDetails job3 = new JobDetails("Incel", "Arts", 30000);
        List<List<ElemWithVisit>> candidates = Arrays.asList(Arrays.asList(personal1, job1), Arrays.asList(personal2, job2), Arrays.asList(personal3, job3));
        System.out.println("Okay, attendance, here are the conclusions regarding your Job Applications");
        for (int i = 0; i < candidates.size(); i++) {
            List<ElemWithVisit> info = candidates.get(i);
            JobHiring hiringProcess = new JobHiring();
            PersonalDetails currentPersonal = (PersonalDetails)info.get(0);
            System.out.println("\nChecking person #" + (i + 1) + " (" + currentPersonal.votName() + "):");
            for(ElemWithVisit person:info) {
                person.accept(hiringProcess);
            }
            System.out.println(hiringProcess.verdict());
        }
    }
}