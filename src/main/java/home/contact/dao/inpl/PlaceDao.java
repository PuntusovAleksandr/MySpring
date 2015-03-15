package home.contact.dao.inpl;

import home.contact.model.Contact;
import home.contact.model.Place;
import home.contact.dao.InterfacePlaceDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class PlaceDao implements InterfacePlaceDao{
    private List<Place> placeList;



    @Override
    public void addPlace(Place title) {
        if (placeList==null) placeList  = new ArrayList<Place>();
        placeList.add(title);
    }

    @Override
    public Set<Contact> getAllContactsPlace(Place title) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myJavaContact.xml");
        ContactDao contactDao = (ContactDao) context.getBean("ContactDao");
        List<Contact> contacList= contactDao.getContactlist();
        Set<Contact> contactsPlaceList = new HashSet<>();
        if (placeList==null)return null;

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
        return "PlaceDaoList= " + placeList;
    }
}


