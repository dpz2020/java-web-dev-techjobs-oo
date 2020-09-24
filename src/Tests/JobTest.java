package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.assertEquals;

public class JobTest {

    @Test
    public void testSettingJobId() {

        Job j1 = new Job();
        Job j2 = new Job();
        assertEquals(false, j1.getId() == j2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job j1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true, j1.getEmployer().getValue() == "ACME");
        assertEquals(true, j1.getLocation().getValue() == "Desert");
        assertEquals(true, j1.getPositionType().getValue() == "Quality control");
        assertEquals(true, j1.getCoreCompetency().getValue() == "Persistence");





    }

    @Test
    public void testJobsForEquality() {
        Job j1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true, j1.getId() != j2.getId());

    }
}
