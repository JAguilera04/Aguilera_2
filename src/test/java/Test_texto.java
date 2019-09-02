/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Lector.Texto;
import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class Test_texto {

    Texto texto;

    public Test_texto() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        texto = new Texto();
        Exception e = new Exception();
        String texto2 = "Neil Alden Armstrong (August 5, 1930 â€“ August 25, 2012) was an American astronaut\n"
                + "and aeronautical engineer who was the first person to walk on the Moon. He was also\n"
                + "a naval aviator, test pilot, and university professor.\n"
                + "\n"
                + "A graduate of Purdue University, Armstrong studied aeronautical engineering with\n"
                + "his college tuition paid for by the U.S. Navy under the Holloway Plan.\n"
                + "He became a midshipman in 1949, and a naval aviator the following year. \n"
                + "He saw action in the Korean War, flying the Grumman F9F Panther from the aircraft\n"
                + "carrier USS Essex. In September 1951, he was hit by anti-aircraft fire while making\n"
                + "a low bombing run, and was forced to bail out. After the war, he completed his\n"
                + "bachelor's degree at Purdue and became a test pilot at the National Advisory\n"
                + "Committee for Aeronautics (NACA) High-Speed Flight Station at Edwards Air Force\n"
                + "Base in California. He was the project pilot on Century Series fighters and flew\n"
                + "the North American X-15 seven times. He was also a participant in the U.S. Air\n"
                + "Force's Man in Space Soonest and X-20 Dyna-Soar human spaceflight programs.";
    }

    @Test
    public void Prueba() {
        assertEquals(texto.LeeFichero("C:\\Users\\usuario\\Documents\\NetBeansProjects\\lector_Archivo\\texto.txt"), "Neil Alden Armstrong (August 5, 1930 â€“ August 25, 2012) was an American astronaut\n"
                + "and aeronautical engineer who was the first person to walk on the Moon. He was also\n"
                + "a naval aviator, test pilot, and university professor.\n"
                + "\n"
                + "A graduate of Purdue University, Armstrong studied aeronautical engineering with\n"
                + "his college tuition paid for by the U.S. Navy under the Holloway Plan.\n"
                + "He became a midshipman in 1949, and a naval aviator the following year. \n"
                + "He saw action in the Korean War, flying the Grumman F9F Panther from the aircraft\n"
                + "carrier USS Essex. In September 1951, he was hit by anti-aircraft fire while making\n"
                + "a low bombing run, and was forced to bail out. After the war, he completed his\n"
                + "bachelor's degree at Purdue and became a test pilot at the National Advisory\n"
                + "Committee for Aeronautics (NACA) High-Speed Flight Station at Edwards Air Force\n"
                + "Base in California. He was the project pilot on Century Series fighters and flew\n"
                + "the North American X-15 seven times. He was also a participant in the U.S. Air\n"
                + "Force's Man in Space Soonest and X-20 Dyna-Soar human spaceflight programs.");
    }

}
