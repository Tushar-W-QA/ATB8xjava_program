package oct.ex_23102024_Exception;

public class Lab150_bank {


    private String currency;
    private Integer amount;

    public Lab150_bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Lab150_bank bankName) throws Exception {
        if(!bankName.currency.equalsIgnoreCase("INR")){
                throw new Exception("Currency is not matching");
        }
        return bankName.amount + this.amount;
    }
}
