public class Employee {
    // variables
    String fName;
    String lName;
    double mSalary;

    // default constructor
    public Employee() {
        fName = "Drew";
        lName = "Partin";
        mSalary = 15000.00;
    }

    // constructor with parameters
    public Employee(String _fName, String _lName, double _mSalary) {
        this.fName = _fName;
        this.lName = _lName;
        this.mSalary = _mSalary;
    }

    // getters and setters
    public String getFirstName() {
        return fName;
    }
    public void setFirstName(String _fName) {
        this.fName = _fName;
    }
    public String getLastName() {
        return lName;
    }
    public void setLastName(String _lName) {
        this.lName = _lName;
    }
    public double getmSalary() {
        return mSalary;
    }
    public void setmSalary(double _mSalary) {
        if (_mSalary >= 0) {
        this.mSalary = _mSalary;
        }
    }

    // methods
    public double yearlySalary() {
        return mSalary * 12;
    }

    public double giveRaise(double _mSalary) {
        if (_mSalary > 0) {
            this.mSalary = _mSalary * 1.1; 
            return mSalary * 1.1;
        } else {
            return mSalary;
        }
    }
}
