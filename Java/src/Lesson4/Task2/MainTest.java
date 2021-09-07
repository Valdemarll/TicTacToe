package Lesson4.Task2;

import Task2.Doctor;
import Task2.Fireman;
import Task2.Programmer;
import Task2.Worker;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void workerTest(){
        Task2.Worker worker = new Worker();
        assertEquals("Я работаю рабочим", worker.work());
    }
    @Test
    public void programmerTest(){
        Task2.Programmer programmer = new Programmer();
        assertEquals("Я работаю программистом", programmer.work());
    }
    @Test
    public void firemanTest(){
        Task2.Fireman fireman = new Fireman();
        assertEquals("Я работаю пожарным", fireman.work());
    }
    @Test
    public void doctorTest(){
        Task2.Doctor doctor = new Doctor();
        assertEquals("Я работаю врачом", doctor.work());
    }
}
