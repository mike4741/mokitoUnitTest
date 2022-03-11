import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import repository.StudentRepository;
import service.StudentService;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestStudentService {
//               // using student repository for the test
////    StudentRepository studentRepository = new StudentRepository();
//
////  using mock for test
    StudentRepository studentRepository = mock(StudentRepository.class);

    StudentService studentService = new StudentService(studentRepository);


    @Test
     void testFindNamesWithLetterE(){
        when(studentRepository.getStudentsFromDatabase()).thenReturn(List.of("jon", "david", "elon", "michelle", "esther"));
        List<String> result = studentService.findNamesWithLetterE();
        List<String> expected = List.of("elon", "michelle", "esther");
        assertEquals(expected ,result);
        verify(studentRepository).getStudentsFromDatabase();

    }


}
