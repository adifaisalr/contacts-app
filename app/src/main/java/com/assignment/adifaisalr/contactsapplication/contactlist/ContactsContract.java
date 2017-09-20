package com.assignment.adifaisalr.contactsapplication.contactlist;

import com.assignment.adifaisalr.contactsapplication.BasePresenter;
import com.assignment.adifaisalr.contactsapplication.BaseView;
import com.assignment.adifaisalr.contactsapplication.data.Contact;

import java.util.List;

/**
 * Created by adifaisalr on 9/20/17.
 * <p>
 * This specifies the contract between the view and the presenter
 */

public interface ContactsContract {
    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showContacts(List<Contact> contacts);

        void showContactDetailUi(String contactId);

        void showAddTaskUi();

        void showSuccessfullySavedMessage();

        void showNoContacts();

        void showNoContactsMatches();

        void showNetworkError();
    }

    interface Presenter extends BasePresenter {

        void loadContacts();

        void addNewContact();

        void openContactDetails(Contact requestedContact);

        void searchContacts(String keyword);

    }
}
