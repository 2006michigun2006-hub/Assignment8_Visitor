public class JobHiring implements ComComVisitor {
    private boolean hasChances = true;
    private String rejectionReasons = "";
    public void visit(PersonalDetails personalDetails) {
        if(personalDetails.votbDay() < 18) {
            rejectionReasons += "Your age doesn't allow us to hire you.\n";
            hasChances = false;
        }
    }
    public void visit(JobDetails jobDetails) {
        if(jobDetails.votjob().equalsIgnoreCase("Student")) {
            rejectionReasons += "Your status as Student is very bad, we don't want poor stupid workers.\n";
            hasChances = false;
        }
        if(jobDetails.votzp() > 20000) {
            rejectionReasons += "Your salary is too huge! No, no... NOOO!\n";
            hasChances = false;
        }
    }
    public String verdict() {
        if(hasChances) {
            return "\nYou are hired! Congrats!";
        }
        else {
            return "\nYou don't fit to us and that's why:\n" + rejectionReasons;
        }
    }
}