package lingaraj.hourglass.com.retrofit2v.models;

/**
 * Created by lingaraj on 10/26/16.
 */

public class Category {
    private  int id_category;
    private  int id_parent;
    private String name;
    private String image;
    private int sort;
    private int status;
    private CreatedAt created_at;
    private UpdatedAt updated_at;
    private Links _links;

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public int getId_parent() {
        return id_parent;
    }

    public void setId_parent(int id_parent) {
        this.id_parent = id_parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
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

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }
}
