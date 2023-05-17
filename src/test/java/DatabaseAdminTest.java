import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Daniel", "LS135135", 22000);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Daniel", databaseAdmin.getName());
    }

    @Test public void databaseAdminHasNiNumber(){
        assertEquals("LS135135", databaseAdmin.getNiNumber());
    }

    @Test public void databaseAdminHasSalary(){
        assertEquals(22000, databaseAdmin.getSalary(), 0.0);
    }

    @Test public void databaseAdminGetsBonus(){
        assertEquals(220.0, databaseAdmin.salaryBonus(), 0.0);
    }

    @Test public void databaseAdminGetsRaise(){
        databaseAdmin.salaryRaise(100);
        assertEquals(22100, databaseAdmin.getSalary(), 0.0);
    }


}


