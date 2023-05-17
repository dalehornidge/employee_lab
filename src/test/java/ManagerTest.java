import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Daniel", "LS135135", 22000, "Electronics");
    }

    @Test
    public void managerHasName(){
        assertEquals("Daniel", manager.getName());
    }

    @Test public void managerHasNiNumber(){
        assertEquals("LS135135", manager.getNiNumber());
    }

    @Test public void managerHasSalary(){
        assertEquals(22000, manager.getSalary(), 0.0);
    }

    @Test public void managerHasDepartment(){
        assertEquals("Electronics", manager.getDeptName());
    }

    @Test public void managerGetsBonus(){
        assertEquals(220.0, manager.salaryBonus(), 0.0);
    }

    @Test public void managerGetsRaise(){
        manager.salaryRaise(100);
        assertEquals(22100, manager.getSalary(), 0.0);
    }


}


