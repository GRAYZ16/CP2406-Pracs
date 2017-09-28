package Package;

public class Package 
{
	public static final char AIR = 'A';
	public static final char TRUCK = 'T';
	public static final char MAIL = 'M';
	
    private double weight; 
    private char shippingMethod;
    protected double shippingCost;
    protected boolean isInsured;

    public Package(double weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        this.isInsured = false;
        this.shippingCost = calculateCost(weight, shippingMethod, isInsured);
    }

    // Costs variables
    // {Air, Truck, Mail}
	private double[][] costs = {{2, 1.5, .5},
								{3, 2.35, 1.5},
								{4.5, 3.25, 2.15}};


    private int threshold1 = 8;
    private int threshold2 = 16;

    // Method to calculate cost of shipping
    protected double calculateCost(double wt, char sm, boolean isInsured)
	{
        double cost;
		int shippingType;
		int weightType;

        switch(sm)
        {
            case Package.AIR:
				shippingType = 0;
                break;
            case Package.MAIL:
            	shippingType = 1;
                break;
            case Package.TRUCK:
            	shippingType = 2;
                break;
			default:
				return -1;
        }

        if(wt <= threshold1)
        	weightType = 0;
        else if(wt <= threshold2)
        	weightType = 1;
        else
        	weightType = 2;

        cost = costs[weightType][shippingType];

        if(isInsured)
		{
			if(cost <= 1) cost += 2.45;
			else if(cost < 3) cost += 3.95;
			else cost += 5.55;
		}

        return cost;
    }

    // Display method
    public String display() {
        String sm;
        if(shippingMethod == 'A') {
            sm = "Air";
        } else if(shippingMethod == 'T') {
            sm = "Truck";
        } else {
            sm = "Mail";
        }
        return "Weight: " + weight + "\nShipping Method: " + sm + "\nShipping Cost: " + shippingCost +
                "\nPackage is insured: " + isInsured;
    }


}
