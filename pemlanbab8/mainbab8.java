package pemlanbab8;

public class mainbab8 {
    public static void main(String[] args) {
        invoice invoice1 = new invoice("Pulsa", 1, 60000);
        invoice invoice2 = new invoice("Sabun Mandi", 6, 7000);
        invoice invoice3 = new invoice("Parfume", 1, 45000);
        invoice invoice4 = new invoice("Tissue", 2, 7500);
        invoice invoice5 = new invoice("Pulpen", 5, 3000);
        invoice invoice6 = new invoice("Air Mineral Galon", 2, 31000);
        invoice invoice7 = new invoice("Makanan Kucing", 1, 61000);

        invoice[] invoices = {invoice1,invoice2,invoice3,invoice4,invoice5,invoice6,invoice7};

        employee employee1 = new employee(3080, "Ananda Annisa Sungkar", 7000000, invoices);

        System.out.println("=========================================");
        System.out.println("        Gaji Karyawan NV. Meneer");
        System.out.println("=========================================");
        System.out.println("Nomor Registrasi: " + employee1.getRegistrationNumber());
        System.out.println("Nama Lengkap    : " + employee1.getName());
        System.out.println("Gaji per bulan  : Rp." + employee1.getSalaryPerMonth());
        System.out.println();
        System.out.println("============TAGIHAN KOPERASI=============");
        System.out.println("Produk          Jumlah          Total");
        System.out.println(invoice1.getProductName() + "             "+ invoice1.getQuantitiy() + "             "+ invoice1.getPayableAmount());
        System.out.println(invoice2.getProductName() + "       "+ invoice2.getQuantitiy() + "             "+ invoice2.getPayableAmount());
        System.out.println(invoice3.getProductName() + "           "+ invoice3.getQuantitiy() + "             "+ invoice3.getPayableAmount());
        System.out.println(invoice4.getProductName() + "            "+ invoice4.getQuantitiy() + "             "+ invoice4.getPayableAmount());
        System.out.println(invoice5.getProductName() + "            "+ invoice5.getQuantitiy() + "             "+ invoice5.getPayableAmount());
        System.out.println(invoice6.getProductName() + " "+ invoice6.getQuantitiy() + "             "+ invoice6.getPayableAmount());
        System.out.println(invoice7.getProductName() + "    "+ invoice7.getQuantitiy() + "             "+ invoice7.getPayableAmount());
        System.out.println("=========================================");
        System.out.println("               GAJI BERSIH             ");
        System.out.println("              Rp." + employee1.getPayableAmount() + ",-                ");
        System.out.println();
    }
}
