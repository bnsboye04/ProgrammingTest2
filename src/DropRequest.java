public class DropRequest extends Request {
    private DropRequest(String StudentID, String CourseID) {
        createRequest(REQUEST_DROP, StudentID, CourseID);
    }
}
