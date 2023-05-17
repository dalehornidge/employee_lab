import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Daniel", "LS135135", 22000, "Electronics", 100000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Daniel", director.getName());
    }

    @Test public void directorHasNiNumber(){
        assertEquals("LS135135", director.getNiNumber());
    }

    @Test public void directorHasSalary(){
        assertEquals(22000, director.getSalary(), 0.0);
    }

    @Test public void directorHasDepartment(){
        assertEquals("Electronics", director.getDeptName());
    }

    @Test public void directorGetsBonus(){
        assertEquals(220.0, director.salaryBonus(), 0.0);
    }

    @Test public void directorGetsRaise(){
        director.salaryRaise(100);
        assertEquals(22100, director.getSalary(), 0.0);
    }

    @Test public void directorGetsBudget(){
        director.setBudget(100000);
        assertEquals(100000, director.getBudget(), 0.0);
    }


}



