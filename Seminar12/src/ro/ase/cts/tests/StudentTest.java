package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void testConstructorWorksCorectlyForName() {
        String nume = "Andrei";
        Student student = new Student(nume);
        assertEquals(nume, student.getNume());
    }


    @Test
    public void setNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testDefaultConstructorWorksCorectly() {
        Student student = new Student();
        assertNotNull("Lista de note nu a fost initializata",student.getNote());
        assertNotNull("Numele nu a gost initializat",student.getNume());
    }


    @Test
    public void adaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
        if(student.getNote().size() != 1){
            fail("Numarul de note adaugate difera de numarul listei de note!");
        }
    }

}