package home.contact.dao;

import home.contact.model.Contact;
import home.contact.model.Place;

import java.util.Set;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface InterfacePlaceDao {
    public  void  addPlace(Place title);
    public Set<Contact> getAllContactsPlace(Place title);
}
