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

    @Test
    public void adaugaOSinguraNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals("Numarul de note adaugate difera de numarul " +
                "listei de note!",1, student.getNote().size());
    }

    @Test
    public void adaugaNotaIncorecta() {
        Student student = new Student();
//        1
        try{
//            2
            student.adaugaNota(11);
//        3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptii.");
        }
        catch (IllegalArgumentException iae){
//          4
        }
        catch (Exception e){
//        5 - nu ajunge aici
            fail("Nu arunca exceptie de tipul IllegalArgument.");
        }
//        6 - continua

    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaNotaIncorectaJUnit4() {
        Student student = new Student();
        student.adaugaNota(11);
    }


    @Test
    public void getNume() {
    }

    @Test
    public void getNote() {
    }

    @Test
    public void getNota() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(4);
        assertEquals(9, student.getNota(2));
    }

    @Test
    public void calculeazaMedie() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5, student.calculeazaMedie(), 0.001);

    }

    @Test
    public void areRestante() {
    Student student = new Student();
    student.adaugaNota(3);
    boolean rezultat = student.areRestante();
    assertTrue(rezultat);
    }

    @Test
    public void nuAreRestante() {
        Student student = new Student();
        student.adaugaNota(6);
        boolean rezultat = student.areRestante();
        assertFalse(rezultat);
    }


}