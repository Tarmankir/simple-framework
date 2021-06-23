package api.bodies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("id_company")
    private Integer id_company;

    @SerializedName("company")
    private CompanySubObjectBody company;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("inn")
    private Integer inn;

    @SerializedName("ogrn")
    private Integer ogrn;

    @SerializedName("kpp")
    private Integer kpp;

    @SerializedName("phone")
    private Integer phone;

    @SerializedName("adress")
    private String adress;

    @SerializedName("users")
    private List<String> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId_company() {
        return id_company;
    }

    public void setId_company(Integer id_company) {
        this.id_company = id_company;
    }

    public CompanySubObjectBody getCompany() {
        return company;
    }

    public void setCompany(CompanySubObjectBody company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    public Integer getOgrn() {
        return ogrn;
    }

    public void setOgrn(Integer ogrn) {
        this.ogrn = ogrn;
    }

    public Integer getKpp() {
        return kpp;
    }

    public void setKpp(Integer kpp) {
        this.kpp = kpp;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}