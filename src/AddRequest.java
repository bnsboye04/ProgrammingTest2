public class AddRequest extends Request {
    private AddRequest(String StudentID, String CourseID) {
        createRequest(REQUEST_DROP, StudentID, CourseID);
    }
}

