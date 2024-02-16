public class Faculty {

    private final myDOB dob;
    private myDOB HiringDate;
    private String FacultyID;

    Faculty(){
        this.dob = new myDOB(2,2,2);
    }
    Faculty( myDOB _dob) {
        this.dob = new myDOB(_dob) ;
    }
    public void setFacultyID(String _FacultyID){
        this.FacultyID = _FacultyID;
    }
    public String getFacultyID(){
        return this.FacultyID;
    }
}
