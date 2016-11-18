/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private String StudentID;
    private String CourseID;
    private int type;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        this.type = type;
        this.StudentID = studentID;
        this.CourseID = courseID;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {

        return this.StudentID;
    }

    @Override
    public String setStudentID(String studentID) {
        if(studentID == null){
            throw new RuntimeException("Invalid");
        }else {
            this.StudentID = studentID;
        }return null;
    }

    @Override
    public String getCourseID() {

        return this.CourseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if(courseID == null){
            throw new RuntimeException("Invalid");
        }else {
            this.StudentID = courseID;
        }return null;
    }

    @Override
    public int getRequestType() {

        return this.type;
    }

    @Override
    public int setRequestType(int type) {
        if(type == 1 || type == 2)
        this.type = type;
        return type;
    }
}
