public class Admin {

    private final myDOB dob;
    private myDOB HiringDate;
    private String AdminID;

    Admin() {
        this.dob = new myDOB(3, 3, 3);
    }

    Admin(myDOB _dob) {
        this.dob = new myDOB(_dob);
    }

    public void setAdminID(String _AdminID) {
        this.AdminID = _AdminID;
    }

    public String getAdminID() {
        return this.AdminID;


    }
}
