
package co.uk.sentinelweb.depop.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class was generated from JSON : http://www.jsonschema2pojo.org/
 */
public class Header {

    @SerializedName("acquired_count")
    @Expose
    private Integer acquiredCount;
    @SerializedName("billing_data")
    @Expose
    private BillingData billingData;
    @SerializedName("billing_status")
    @Expose
    private String billingStatus;
    @Expose
    private String bio;
    @SerializedName("buyer_ratings")
    @Expose
    private Integer buyerRatings;
    @Expose
    private String country;
    @SerializedName("date_joined")
    @Expose
    private String dateJoined;
    @Expose
    private String email;
    @SerializedName("fb_access_token")
    @Expose
    private String fbAccessToken;
    @SerializedName("fb_id")
    @Expose
    private String fbId;
    @SerializedName("fb_id_connect_time")
    @Expose
    private String fbIdConnectTime;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @Expose
    private Object following;
    @SerializedName("following_count")
    @Expose
    private Integer followingCount;
    @SerializedName("garage_count")
    @Expose
    private Integer garageCount;
    @Expose
    private Integer id;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("is_staff")
    @Expose
    private Boolean isStaff;
    @SerializedName("is_superman")
    @Expose
    private Boolean isSuperman;
    @Expose
    private String language;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @Expose
    private Boolean newsletter;
    @SerializedName("paypal_account")
    @Expose
    private String paypalAccount;
    @Expose
    private String phone;
    @Expose
    private String picture;
    @SerializedName("picture_data")
    @Expose
    private PictureData pictureData;
    @SerializedName("preapproval_data")
    @Expose
    private Object preapprovalData;
    @Expose
    private Double rating;
    @SerializedName("recent_shipping_address")
    @Expose
    private RecentShippingAddress recentShippingAddress;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("seller_ratings")
    @Expose
    private Integer sellerRatings;
    @SerializedName("selling_count")
    @Expose
    private Integer sellingCount;
    @SerializedName("signup_status")
    @Expose
    private String signupStatus;
    @SerializedName("sold_count")
    @Expose
    private Integer soldCount;
    @SerializedName("terms_and_conditions")
    @Expose
    private Integer termsAndConditions;
    @SerializedName("tw_access_token")
    @Expose
    private String twAccessToken;
    @SerializedName("tw_access_token_secret")
    @Expose
    private String twAccessTokenSecret;
    @SerializedName("tw_id")
    @Expose
    private String twId;
    @Expose
    private String username;
    @Expose
    private String website;


    /**
     * 
     * @return
     *     The acquiredCount
     */
    public Integer getAcquiredCount() {
        return acquiredCount;
    }

    /**
     * 
     * @param acquiredCount
     *     The acquired_count
     */
    public void setAcquiredCount(Integer acquiredCount) {
        this.acquiredCount = acquiredCount;
    }

    /**
     * 
     * @return
     *     The billingData
     */
    public BillingData getBillingData() {
        return billingData;
    }

    /**
     * 
     * @param billingData
     *     The billing_data
     */
    public void setBillingData(BillingData billingData) {
        this.billingData = billingData;
    }

    /**
     * 
     * @return
     *     The billingStatus
     */
    public String getBillingStatus() {
        return billingStatus;
    }

    /**
     * 
     * @param billingStatus
     *     The billing_status
     */
    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * 
     * @return
     *     The buyerRatings
     */
    public Integer getBuyerRatings() {
        return buyerRatings;
    }

    /**
     * 
     * @param buyerRatings
     *     The buyer_ratings
     */
    public void setBuyerRatings(Integer buyerRatings) {
        this.buyerRatings = buyerRatings;
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
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The dateJoined
     */
    public String getDateJoined() {
        return dateJoined;
    }

    /**
     * 
     * @param dateJoined
     *     The date_joined
     */
    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
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
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The fbAccessToken
     */
    public String getFbAccessToken() {
        return fbAccessToken;
    }

    /**
     * 
     * @param fbAccessToken
     *     The fb_access_token
     */
    public void setFbAccessToken(String fbAccessToken) {
        this.fbAccessToken = fbAccessToken;
    }

    /**
     * 
     * @return
     *     The fbId
     */
    public String getFbId() {
        return fbId;
    }

    /**
     * 
     * @param fbId
     *     The fb_id
     */
    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    /**
     * 
     * @return
     *     The fbIdConnectTime
     */
    public String getFbIdConnectTime() {
        return fbIdConnectTime;
    }

    /**
     * 
     * @param fbIdConnectTime
     *     The fb_id_connect_time
     */
    public void setFbIdConnectTime(String fbIdConnectTime) {
        this.fbIdConnectTime = fbIdConnectTime;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The followersCount
     */
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * 
     * @param followersCount
     *     The followers_count
     */
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * 
     * @return
     *     The following
     */
    public Object getFollowing() {
        return following;
    }

    /**
     * 
     * @param following
     *     The following
     */
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     * 
     * @return
     *     The followingCount
     */
    public Integer getFollowingCount() {
        return followingCount;
    }

    /**
     * 
     * @param followingCount
     *     The following_count
     */
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    /**
     * 
     * @return
     *     The garageCount
     */
    public Integer getGarageCount() {
        return garageCount;
    }

    /**
     * 
     * @param garageCount
     *     The garage_count
     */
    public void setGarageCount(Integer garageCount) {
        this.garageCount = garageCount;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive
     *     The is_active
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * 
     * @return
     *     The isStaff
     */
    public Boolean getIsStaff() {
        return isStaff;
    }

    /**
     * 
     * @param isStaff
     *     The is_staff
     */
    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

    /**
     * 
     * @return
     *     The isSuperman
     */
    public Boolean getIsSuperman() {
        return isSuperman;
    }

    /**
     * 
     * @param isSuperman
     *     The is_superman
     */
    public void setIsSuperman(Boolean isSuperman) {
        this.isSuperman = isSuperman;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The newsletter
     */
    public Boolean getNewsletter() {
        return newsletter;
    }

    /**
     * 
     * @param newsletter
     *     The newsletter
     */
    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * 
     * @return
     *     The paypalAccount
     */
    public String getPaypalAccount() {
        return paypalAccount;
    }

    /**
     * 
     * @param paypalAccount
     *     The paypal_account
     */
    public void setPaypalAccount(String paypalAccount) {
        this.paypalAccount = paypalAccount;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 
     * @param picture
     *     The picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 
     * @return
     *     The pictureData
     */
    public PictureData getPictureData() {
        return pictureData;
    }

    /**
     * 
     * @param pictureData
     *     The picture_data
     */
    public void setPictureData(PictureData pictureData) {
        this.pictureData = pictureData;
    }

    /**
     * 
     * @return
     *     The preapprovalData
     */
    public Object getPreapprovalData() {
        return preapprovalData;
    }

    /**
     * 
     * @param preapprovalData
     *     The preapproval_data
     */
    public void setPreapprovalData(Object preapprovalData) {
        this.preapprovalData = preapprovalData;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The recentShippingAddress
     */
    public RecentShippingAddress getRecentShippingAddress() {
        return recentShippingAddress;
    }

    /**
     * 
     * @param recentShippingAddress
     *     The recent_shipping_address
     */
    public void setRecentShippingAddress(RecentShippingAddress recentShippingAddress) {
        this.recentShippingAddress = recentShippingAddress;
    }

    /**
     * 
     * @return
     *     The resourceUri
     */
    public String getResourceUri() {
        return resourceUri;
    }

    /**
     * 
     * @param resourceUri
     *     The resource_uri
     */
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * 
     * @return
     *     The sellerRatings
     */
    public Integer getSellerRatings() {
        return sellerRatings;
    }

    /**
     * 
     * @param sellerRatings
     *     The seller_ratings
     */
    public void setSellerRatings(Integer sellerRatings) {
        this.sellerRatings = sellerRatings;
    }

    /**
     * 
     * @return
     *     The sellingCount
     */
    public Integer getSellingCount() {
        return sellingCount;
    }

    /**
     * 
     * @param sellingCount
     *     The selling_count
     */
    public void setSellingCount(Integer sellingCount) {
        this.sellingCount = sellingCount;
    }

    /**
     * 
     * @return
     *     The signupStatus
     */
    public String getSignupStatus() {
        return signupStatus;
    }

    /**
     * 
     * @param signupStatus
     *     The signup_status
     */
    public void setSignupStatus(String signupStatus) {
        this.signupStatus = signupStatus;
    }

    /**
     * 
     * @return
     *     The soldCount
     */
    public Integer getSoldCount() {
        return soldCount;
    }

    /**
     * 
     * @param soldCount
     *     The sold_count
     */
    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    /**
     * 
     * @return
     *     The termsAndConditions
     */
    public Integer getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * 
     * @param termsAndConditions
     *     The terms_and_conditions
     */
    public void setTermsAndConditions(Integer termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    /**
     * 
     * @return
     *     The twAccessToken
     */
    public String getTwAccessToken() {
        return twAccessToken;
    }

    /**
     * 
     * @param twAccessToken
     *     The tw_access_token
     */
    public void setTwAccessToken(String twAccessToken) {
        this.twAccessToken = twAccessToken;
    }

    /**
     * 
     * @return
     *     The twAccessTokenSecret
     */
    public String getTwAccessTokenSecret() {
        return twAccessTokenSecret;
    }

    /**
     * 
     * @param twAccessTokenSecret
     *     The tw_access_token_secret
     */
    public void setTwAccessTokenSecret(String twAccessTokenSecret) {
        this.twAccessTokenSecret = twAccessTokenSecret;
    }

    /**
     * 
     * @return
     *     The twId
     */
    public String getTwId() {
        return twId;
    }

    /**
     * 
     * @param twId
     *     The tw_id
     */
    public void setTwId(String twId) {
        this.twId = twId;
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
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
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
     *     The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

}
