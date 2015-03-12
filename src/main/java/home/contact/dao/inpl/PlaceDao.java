package home.contact.dao.inpl;

import home.contact.model.Contact;
import home.contact.model.Place;
import home.contact.dao.InterfacePlaceDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class PlaceDao implements InterfacePlaceDao{
    private List<Place> placeList;
    private Set<Contact> contactsPlaceList;
    private List<Contact> contactDaoList;

    @Override
    public void addPlace(Place title) {
        if (placeList==null) placeList  = new ArrayList<Place>();
        placeList.add(title);
    }

    @Override
    public Set<Contact> getAllContactsPlace(Place title) {
        if (placeList==null)return null;
        contactDaoList = new ContactDao().getContactlist();
        for (int i = 0; i < contactDaoList.size() ; i++) {
            if (contactDaoList.get(i).getPlaces().equals(title)){
                contactsPlaceList.add(contactDaoList.get(i));
            }
        }
        return contactsPlaceList;
    }

    @Override
    public String toString() {
        return "PlaceDao : " +
                "placeList= " + placeList +
                ", contactsPlaceList= " + contactsPlaceList +
                ", contactDaoList= " + contactDaoList;
    }
}


