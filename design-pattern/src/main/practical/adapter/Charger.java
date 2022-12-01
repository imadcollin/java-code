package adapter;

public class Charger implements ChargerAdapter {
    private String phoneType;
    private ChargerAdapter chargerAdapter;
    private boolean supported = false;

    public Charger(String phoneTpye) {
        this.phoneType = phoneTpye;
        init();
    }

    private void init() {
        if (isIos(phoneType)) {
            IosCharger ios = new IosCharger();
            ios.charge();
        }
        if (isAndroid(phoneType)) {
            if (phoneType.equalsIgnoreCase("Nokia")) {
                NokiaCharger nokiaCharger = new NokiaCharger();
                nokiaCharger.charge();
            } else if (phoneType.equalsIgnoreCase("Samsung")) {
                SamsungCharger samsungCharger = new SamsungCharger();
                samsungCharger.charge();
            }
        }
    }

    @Override
    public void charge() {

    }

    @Override
    public void comsumptionMeasuer() {
        System.out.println("some kwatts");
    }


    private boolean isIos(String phoneType) {
        return (phoneType.equalsIgnoreCase("Iphone") || phoneType.equalsIgnoreCase("apple"));

    }

    private boolean isAndroid(String phoneType) {
        return (phoneType.equalsIgnoreCase("Nokia") || phoneType.equalsIgnoreCase("Samsung"));

    }
}
