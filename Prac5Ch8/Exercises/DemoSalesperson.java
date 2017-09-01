/**
 * Created by jc321128 on 1/09/17.
 */
public class DemoSalesperson
{
    public static void main(String args[])
    {
        SalesPerson[] salesPeople = new SalesPerson[10];
        System.out.println("The Sales People: ");

        int id = 111;
        int sales = 25000;
        for (SalesPerson person : salesPeople)
        {

            person = new SalesPerson(id, sales);
            id++;
            sales += 5000;
            System.out.println("Person:\nID" + person.getIdNumber() + "\nSales Amount" + person.getAnnualSalesAmount());
        }
    }
}
