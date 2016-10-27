package lingaraj.hourglass.com.retrofit2v.models;

/**
 * Created by lingaraj on 10/26/16.
 */

public class Brand {
    private int id_brand;
    private String name;
    private int status;
    private CreatedAt created_at;
    private UpdatedAt updated_at;

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

    public CreatedAt getCreated_at() {
        return created_at;
    }

    public void setCreated_at(CreatedAt created_at) {
        this.created_at = created_at;
    }

    public UpdatedAt getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(UpdatedAt updated_at) {
        this.updated_at = updated_at;
    }
}
