package factory.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PlanFactoryTest {
    private static PlanFactory planFactory = null;

    @BeforeEach
    public void init() {
        planFactory = new PlanFactory();
    }

    @Test
    public void FactoryNotnull() {
        assertNotNull(planFactory);
    }

    @Test
    public void testDomesticalPlanRate() {
        Plan plan = planFactory.getPlan("DomsticPlan");

        plan.getRate();
        assertEquals(20, plan.rate);
        assertEquals(40, plan.calcBill(2));
    }

    @Test
    public void testDomesticalPlanName() {
        Plan plan = planFactory.getPlan("DomsticPlan");

        plan.getName();
        assertEquals("Domestically Plan", plan.name);
    }

    @Test
    public void testCommerialPlanName() {
        Plan plan = planFactory.getPlan("CommercialPlan");

        plan.getName();
        assertEquals("Commercial PLan", plan.name);
    }
}