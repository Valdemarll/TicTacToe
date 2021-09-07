package Task2;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void workerTest(){
        Worker worker = new Worker();
        assertEquals("Я работаю рабочим", worker.work());
    }
    @Test
    public void programmerTest(){
        Programmer programmer = new Programmer();
        assertEquals("Я работаю программистом", programmer.work());
    }
    @Test
    public void firemanTest(){
        Fireman fireman = new Fireman();
        assertEquals("Я работаю пожарным", fireman.work());
    }
    @Test
    public void doctorTest(){
        Doctor doctor = new Doctor();
        assertEquals("Я работаю врачом", doctor.work());
    }
}
