public class Student { 2 usages
    String fname: 1 usage 
    String lname: 1 usage
    long id;
    long enrolledCourse; 2 usages

    Student(String fname,String lname,long id){ 1 usage
        this.fname=fname;
        this.lname=lname;
        this.id=id;
    }
    void enroll(long enrolledCourse){ 1 usage
        this.enrolledCoures=enrolledCoures;

    }
    void checkEnrolledCourse(){ 1 usage
        System.out.println(this.enrolledCoures)
    }
}
