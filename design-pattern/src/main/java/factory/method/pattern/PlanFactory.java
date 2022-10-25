package factory.method.pattern;

public class PlanFactory {
    public Plan getPlan(String plan) {
        if (plan == null || plan.equals("")) return null;

        else if (plan.equalsIgnoreCase("CommercialPlan")) return new CommercialPlan();

        else if (plan.equalsIgnoreCase("DomsticPlan")) return new DomsticPlan();

        return null;
    }
}
