package lingaraj.hourglass.com.retrofit2v.models;

/**
 * Created by lingaraj on 10/26/16.
 */

public class BestRate {
    private int id_asset;
    private int value;
    private   int loan_to_value;
     private   int offered;
    private int annual_rate;
    private int quantity;
   // private  int rank;

    public int getId_asset() {
        return id_asset;
    }

    public void setId_asset(int id_asset) {
        this.id_asset = id_asset;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLoan_to_value() {
        return loan_to_value;
    }

    public void setLoan_to_value(int loan_to_value) {
        this.loan_to_value = loan_to_value;
    }

    public int getOffered() {
        return offered;
    }

    public void setOffered(int offered) {
        this.offered = offered;
    }

    public int getAnnual_rate() {
        return annual_rate;
    }

    public void setAnnual_rate(int annual_rate) {
        this.annual_rate = annual_rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

/*    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    } */
}
