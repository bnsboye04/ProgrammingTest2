import java.lang.reflect.Type;
import java.util.ArrayList;

public class Registration {
    // Request repository
    private String StudentID;
    private String CourseID;
    private String type1;
    private ArrayList<IRequest> requestList;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        requestList.add(request);
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        requestList.remove(request);
    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {
        return requestList.contains(request);
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        int num = 0;
        for (int i=0;i<requestList.size();i++){
            if (requestList.get(type).getRequestType() == type1.length()){
                i = num++;
                return num;
            }
        }
        return 0;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int num = 0;
        for (int i=0;i<requestList.size();i++){
            if (requestList.get(courseID.length()).getCourseID().equals(CourseID)){
                i = num++;
                return num;
            }
        }
        return 0;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int num = 0;
        for (int i=0;i<requestList.size();i++){
            if (requestList.get(studentID.length()).getStudentID().equals(StudentID)){
                i = num++;
                return num;
            }
        }
        return 0;
    }
}
