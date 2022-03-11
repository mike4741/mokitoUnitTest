package service;

import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
     StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<String> findNamesWithLetterE(){
        List<String> studentsWithLetterE = new ArrayList<>();

        for(String s : this.studentRepository.getStudentsFromDatabase()){
            if(s.contains("e")){
                studentsWithLetterE.add(s);
            }
        }
         return  studentsWithLetterE;
    }

}
