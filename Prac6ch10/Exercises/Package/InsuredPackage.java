package Package;

public class InsuredPackage extends Package {

    public InsuredPackage(double wt, char sm) {
        super(wt, sm);
        this.isInsured = true;
        this.shippingCost = calculateCost(wt, sm, isInsured);
    }
}

