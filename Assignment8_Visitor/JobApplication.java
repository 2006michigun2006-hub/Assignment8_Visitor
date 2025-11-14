public class JobApplication implements ComComVisitor {
    public void visit(PersonalDetails perDet) {
        System.out.println("Look, that's the refferens about you");
        System.out.println("Here is your name: " + perDet.votName());
        System.out.println("Here is your date of birth: " + perDet.votbDay());
        System.out.println("Here is your phone number: " + perDet.votphone());
    }
    public void visit(JobDetails jobDet) {
        System.out.println("Proffesionally, here is your prof.information");
        System.out.println("Here is your job: " + jobDet.votjob());
        System.out.println("Here is your exact job: " + jobDet.votjobExact());
        System.out.println("Here is your salary: " + jobDet.votzp());
    }
}