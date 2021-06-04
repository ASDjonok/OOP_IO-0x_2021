package BRI_lab6;

public class ElectricalAppliance {

    /*
        Characteristics we need:
        – type -> String
        – isPlugged -> Boolean
        – power -> Integer
        – electromagneticRadiation -> Integer
    */

    private final String type;
    private final Boolean isPlugged;
    private final int power;
    private final int electromagneticRadiation;

    public ElectricalAppliance(String type, Boolean isPlugged, int power, int electromagneticRadiation) {
        this.type = type;
        this.isPlugged = isPlugged;
        this.power = power;
        this.electromagneticRadiation = electromagneticRadiation;
    }

    public String getType() {
        return type;
    }

    public Boolean getIsPlugged() {
        return isPlugged;
    }

    public int getPower() {
        return power;
    }

    public int getElectromagneticRadiation() {
        return electromagneticRadiation;
    }

    @Override
    public String toString() {
        return String.format("%s -> isPlugged: %b, power: %d, electromagneticRadiation: %d;", type, isPlugged, power, electromagneticRadiation);
    }
}
