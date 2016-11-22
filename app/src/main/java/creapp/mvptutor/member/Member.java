
package creapp.mvptutor.member;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import creapp.mvptutor.photo.Photo;

public class Member {
    @SerializedName("ID")
    @Expose
    private int id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Telephone")
    @Expose
    private String telephone;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("ZipCode")
    @Expose
    private String zipCode;
    @SerializedName("Gender")
    @Expose
    private int gender;
    @SerializedName("BirthDate")
    @Expose
    private String birthDate;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("BBM")
    @Expose
    private String bBM;
    @SerializedName("BranchOffice")
    @Expose
    private String branchOffice;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("AccessToken")
    @Expose
    private String accessToken;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("Photo")
    @Expose
    private Photo photo;
    @SerializedName("Office")
    @Expose
    private String office;

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 
     * @param telephone
     *     The Telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The Address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The City
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The Country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 
     * @param zipCode
     *     The ZipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 
     * @return
     *     The gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The Gender
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param birthDate
     *     The BirthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The Website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return
     *     The bBM
     */
    public String getBBM() {
        return bBM;
    }

    /**
     * 
     * @param bBM
     *     The BBM
     */
    public void setBBM(String bBM) {
        this.bBM = bBM;
    }

    /**
     * 
     * @return
     *     The branchOffice
     */
    public String getBranchOffice() {
        return branchOffice;
    }

    /**
     * 
     * @param branchOffice
     *     The BranchOffice
     */
    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * @param accessToken
     *     The AccessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The Link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The photo
     */
    public Photo getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The Photo
     */
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The office
     */
    public String getOffice() {
        return office;
    }

    /**
     * 
     * @param office
     *     The Office
     */
    public void setOffice(String office) {
        this.office = office;
    }

}
