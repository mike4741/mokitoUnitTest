package repository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private String[] studentDatabase = {"elon", "michelle", "esther","man", "oscar"};

    public List<String> getStudentsFromDatabase() {
        List<String > studentFromDB = new ArrayList<>();
        for (String s : studentDatabase
             ) {
            studentFromDB.add(s);
        }
        return studentFromDB;
//        return null;
    }
}
