import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Daniel", "LS135135", 22000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Daniel", developer.getName());
    }

    @Test public void developerHasNiNumber(){
        assertEquals("LS135135", developer.getNiNumber());
    }

    @Test public void developerHasSalary(){
        assertEquals(22000, developer.getSalary(), 0.0);
    }

    @Test public void developerGetsBonus(){
        assertEquals(220.0, developer.salaryBonus(), 0.0);
    }

    @Test public void developerGetsRaise(){
        developer.salaryRaise(100);
        assertEquals(22100, developer.getSalary(), 0.0);
    }


}


