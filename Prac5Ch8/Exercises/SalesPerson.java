/**
 * Created by jc321128 on 1/09/17.
 */
public class SalesPerson
{
    int idNumber;
    double annualSalesAmount;

    public SalesPerson(int idNumber, double annualSalesAmount)
    {
        this.idNumber = idNumber;
        this.annualSalesAmount = annualSalesAmount;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getAnnualSalesAmount() {
        return annualSalesAmount;
    }

    public void setAnnualSalesAmount(double annualSalesAmount) {
        this.annualSalesAmount = annualSalesAmount;
    }
}
