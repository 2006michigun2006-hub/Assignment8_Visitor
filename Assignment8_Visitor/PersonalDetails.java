public class PersonalDetails implements ElemWithVisit {
    private final String name;
    private final int bDay;
    private final String phone;
    public PersonalDetails(String name, int bDay, String phone) {
        this.name = name;
        this.bDay = bDay;
        this.phone = phone;
    }
    public String votName() {
        return name;
    }
    public int votbDay() {
        return bDay;
    }
    public String votphone() {
        return phone;
    }
    public void accept(ComComVisitor visitor) {
        visitor.visit(this);
    }
}