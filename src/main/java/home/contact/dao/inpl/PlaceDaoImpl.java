package home.contact.dao.inpl;

import home.contact.dao.ContactDao;
import home.contact.dao.PlaceDao;
import home.contact.model.Contact;
import home.contact.model.Place;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class PlaceDaoImpl implements PlaceDao {
    private List<Place> placeList;
    @Autowired
    private ContactDao contactDao;

    @Override
    public void addPlace(Place title) {
        if (placeList==null) placeList  = new ArrayList<Place>();
        placeList.add(title);
    }

    @Override
    public Set<Contact> getAllContactsPlace(Place title) {
        if (placeList==null)return null;
        List<Contact> contacList= contactDao.getContactlist();
        Set<Contact> contactsPlaceList = new HashSet<Contact>();

        for (int i = 0; i < contacList.size() ; i++) {
            for (int j = 0; j <contacList.get(i).getPlaces().size() ; j++) {
                if (contacList.get(i).getPlaces().contains(title)){
                    contactsPlaceList.add(contacList.get(i));
                }
            }
        }
        return contactsPlaceList;
    }

    @Override
    public String toString() {
        return "PlaceDaoList=" + placeList;
    }
}


