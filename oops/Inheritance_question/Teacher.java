package Practice.oops.Abstraction;

 class Teacher {
    String subject;
 

    // Constructor
    public Teacher(String subject) {
        this.subject = subject;
        
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Subject: " + subject);
    }
    
}
