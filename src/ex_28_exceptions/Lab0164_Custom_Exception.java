package ex_28_exceptions;

public class Lab0164_Custom_Exception {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123) ;
        Integer total_bal= sbi.add(icici);
        System.out.println(total_bal);

        Bank jpchse = new Bank("USD",1);
      Integer  total_bal_all_countries= sbi.add(jpchse);
        System.out.println(total_bal_all_countries          );
    }
}
class  Bank {
    public String getCurrency() {
        return currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    private  String currency;
    private  Integer amount;

    Bank(String currency, Integer amount){
            this.currency=currency;
        this.amount=amount;

    }
    public  Integer add (Bank bankName){
        if(bankName.currency.equalsIgnoreCase("INR")){
            return bankName.amount+this.amount;
        }else{
            try{
                throw new CustomException("Currency Mismatch, Can't Proceed!");
            }catch (CustomException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class  CustomException extends Exception{
    CustomException(String msg ){
        super(msg);
    }
}
