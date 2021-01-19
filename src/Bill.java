public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxService = taxService;
        this.taxType = taxType;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}