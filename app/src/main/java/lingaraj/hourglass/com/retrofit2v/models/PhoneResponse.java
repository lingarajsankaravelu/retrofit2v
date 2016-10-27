package lingaraj.hourglass.com.retrofit2v.models;

/**
 * Created by lingaraj on 10/26/16.
 */

public class PhoneResponse {
    private int id_asset;
    private  int id_category;
    private int id_brand;
    private String name;
    private int status;
    private String updated_at;
   // private int rank;
    private Rate rate;
   // private BestRate best_rate;
    private Category category;
    private Brand brand;
    private Links _links;

    public int getId_asset() {
        return id_asset;
    }

    public void setId_asset(int id_asset) {
        this.id_asset = id_asset;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

 /*   public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }*/

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

   /* public BestRate getBest_rate() {
        return best_rate;
    }

    public void setBest_rate(BestRate best_rate) {
        this.best_rate = best_rate;
    } */

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }
}
