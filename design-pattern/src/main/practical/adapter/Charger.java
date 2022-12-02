package adapter;

public class Charger implements AndroidCharger, ChargerAdapter {
    private String phoneType;
    private IosCharger iosCharger;

    public Charger(String phoneTpye) {
        this.phoneType = phoneTpye;
    }

    @Override
    public void charge() {
        if (isIos(phoneType)) {
            iosCharger = new IosCharger();
            iosCharger.charge();
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
