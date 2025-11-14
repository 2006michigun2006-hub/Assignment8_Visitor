public class JobDetails implements ElemWithVisit {
    private final String job;
    private final String jobExact;
    private final int zp;
    public JobDetails(String job, String jobExact, int zp) {
        this.job = job;
        this.jobExact = jobExact;
        this.zp = zp;
    }
    public String votjob() {
        return job;
    }
    public String votjobExact() {
        return jobExact;
    }
    public int votzp() {
        return zp;
    }
    public void accept(ComComVisitor visitor) {
        visitor.visit(this);
    }
}