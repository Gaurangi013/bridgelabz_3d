package Practice.oops.Abstraction;

 class Student {
    
    int rollNo;

    // Constructor
    public Student( int rollNo) {
        
        this.rollNo = rollNo;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println(" Roll No: " + rollNo);
    }
    
}
