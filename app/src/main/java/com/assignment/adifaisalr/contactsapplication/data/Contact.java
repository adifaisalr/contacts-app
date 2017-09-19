package com.assignment.adifaisalr.contactsapplication.data;

import android.util.Patterns;

import com.google.common.base.Strings;

/**
 * Created by adifaisalr on 9/19/17.
 */

public class Contact {

    private Integer mId;

    private String mFirstName;

    private String mLastName;

    private String mPhoneNumber;

    private String mEmail;

    private String mProfilePic;

    private Boolean mFavorite;

    private String mUrl;

    /***
     * Used for edit Contact, if the Contact already has an mId
     *
     * @param mId            mId of the contact
     * @param mFirstName     first name of the contact
     * @param mLastName      last name of the contact
     * @param mProfilePic    mUrl profile picture of the contact
     * @param mFavorite      true if the contact is mFavorite, false if not mFavorite
     * @param mUrl           mUrl of the contact detail
     */
    public Contact(Integer mId, String mFirstName, String mLastName, String mProfilePic, Boolean mFavorite, String mUrl) {
        this.mId = mId;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mProfilePic = mProfilePic;
        this.mFavorite = mFavorite;
        this.mUrl = mUrl;
    }

    /**
     * Used for create new Contact, first name, last name, email and phone number required, profile pic is optional
     * @param mFirstName    first name of the contact
     * @param mLastName     last name of the contact
     * @param mPhoneNumber  phone number of the contact
     * @param mEmail        email of the contact
     * @param mProfilePic   url of the image profile picture
     */
    public Contact(String mFirstName, String mLastName, String mPhoneNumber, String mEmail, String mProfilePic) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mPhoneNumber = mPhoneNumber;
        this.mEmail = mEmail;
        this.mProfilePic = mProfilePic;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmProfilePic() {
        return mProfilePic;
    }

    public void setmProfilePic(String mProfilePic) {
        this.mProfilePic = mProfilePic;
    }

    public Boolean getmFavorite() {
        return mFavorite;
    }

    public void setmFavorite(Boolean mFavorite) {
        this.mFavorite = mFavorite;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public boolean isValidFirstName(){
        return !Strings.isNullOrEmpty(mFirstName) && mFirstName.length() > 2;
    }

    public boolean isValidLastName(){
        return !Strings.isNullOrEmpty(mLastName) && mLastName.length() > 2;
    }

    public boolean isValidPhoneNumber(){
        return !Strings.isNullOrEmpty(mPhoneNumber) && mPhoneNumber.length() > 9;
    }

    public boolean isValidEmail(){
        return !Strings.isNullOrEmpty(mEmail) && !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches();
    }
}
