import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList = new ArrayList<IRequest>();
    public String StudentID;
    public String CourseID;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        requestList.add(request);
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if(!exists(request)){
            throw new RuntimeException("Invalid");
        }
        requestList.remove(request);
    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {

        return requestList.contains(request);
    }

    // Count all requests
    public int count() { return requestList.size(); }

    // Count requests by request type
    public int countByType(int type) {
        Request request = new Request();
        int c=0;
        for(IRequest i:requestList) {
            if (i.getRequestType() == type) c++;
        }
        return c;
    }


    // Count request by course ID
    public int countByCourseID(String courseID) {
        Request request = new Request();
        int ci=0;
        for(IRequest req :requestList){
            if (req.getCourseID() == courseID) ci++;
        }
        return ci;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        Request request = new Request();
        int si=0;
        for(IRequest req :requestList){
            if (req.getStudentID() == studentID) si++;
        }
        return si;
    }
}
