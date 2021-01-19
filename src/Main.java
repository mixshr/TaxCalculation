public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(123.45, new IncomeTaxType(), taxService),
                new Bill(123.45, new VATaxType(), taxService),
                new Bill(123.45, new ProgressiveTaxType(), taxService),
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}