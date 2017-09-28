package Package;

public class UsePackage {

    public static void main(String[] args) {

        // Create normal package: Price should be 4.50
        Package package1 = new Package(20, 'A');
        System.out.println(package1.display());

        System.out.println("-------------------");

        // Create Insured Package Price should be 2.00 + 3.95 = 5.95
        Package package2 = new InsuredPackage(7, 'A');
        System.out.println(package2.display());

        System.out.println("-------------------");

        // Create Second Insured Package: Price should be 2.35 + 3.95 = 6.30
        Package package3 = new InsuredPackage(15, 'T');
        System.out.println(package3.display());

    }

}
