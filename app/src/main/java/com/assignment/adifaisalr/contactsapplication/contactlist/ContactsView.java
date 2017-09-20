package com.assignment.adifaisalr.contactsapplication.contactlist;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.assignment.adifaisalr.contactsapplication.R;
import com.assignment.adifaisalr.contactsapplication.data.Contact;

import java.util.List;

/**
 * Created by adifaisalr on 9/20/17.
 */

public class ContactsView extends LinearLayout implements ContactsContract.View{

    public ContactsView(Context context) {
        super(context);
        init();
    }

    public ContactsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        inflate(getContext(), R.layout.content_contacts, this);
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showContacts(List<Contact> contacts) {

    }

    @Override
    public void showContactDetailUi(String contactId) {

    }

    @Override
    public void showAddTaskUi() {

    }

    @Override
    public void showSuccessfullySavedMessage() {

    }

    @Override
    public void showNoContacts() {

    }

    @Override
    public void showNoContactsMatches() {

    }

    @Override
    public void showNetworkError() {

    }

    @Override
    public void setPresenter(ContactsContract.Presenter presenter) {

    }
}
