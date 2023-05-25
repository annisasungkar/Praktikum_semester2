package pemlanbab8;

public class employee implements payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private invoice[] invoices;

    public employee(int registrationNumber, String name, int salaryPerMonth, invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double totaInvoiceAmount = 0.0;
        for (invoice invoice : invoices) {
            totaInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totaInvoiceAmount;
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public invoice[] getInvoice() {
        return invoices;
    }
}
