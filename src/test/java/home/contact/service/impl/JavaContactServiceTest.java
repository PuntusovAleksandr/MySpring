package home.contact.service.impl;

import home.contact.dao.ContactDao;
import home.contact.dao.HobbyDao;
import home.contact.dao.MessageDao;
import home.contact.dao.PlaceDao;
import home.contact.dao.inpl.ContactDaoImpl;
import home.contact.dao.inpl.HobbyDaoImpl;
import home.contact.dao.inpl.MessageDaoImpl;
import home.contact.dao.inpl.PlaceDaoImpl;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import home.contact.model.Message;
import home.contact.model.Place;
import home.contact.service.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.time.LocalDate;
import java.util.Collections;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class JavaContactServiceTest {

    @Mock
    private ContactService interfaceJavaContactService;
    @Mock
    private ContactDao contactDao;
    @Mock
    private HobbyDao hobbyDao;
    @Mock
    private MessageDao messageDao;
    @Mock
    private PlaceDao placeDao;

    @InjectMocks
    private JavaContactService javaContactService = new JavaContactService();

    @Autowired
    private Contact contact;
    @Autowired
    private Environment environment;
    @Autowired
    private HobbyDaoImpl hobbyDaoImpl;
    @Autowired
    private Place place;
    @Autowired
    private Message message;
    @Autowired
    private ContactDaoImpl contactDaoImpl;
    @Autowired
    private MessageDaoImpl messageDaoImpl;
    @Autowired
    private PlaceDaoImpl placeDaoImpl;
    @Autowired
    private Hobby hobby;

    @Test
    public void testCreateContact() throws Exception {
        javaContactService.createContact("a","b", any(LocalDate.class));
        verify(contactDao).addContact((Contact) anyObject());
        javaContactService.createContact("a","b");
        verify(contactDao, times(2)).addContact((Contact) anyObject());
        verify(interfaceJavaContactService, never()).createContact("Vas", "Das", null);
    }

    @Test
    public void testAddHobby() throws Exception {
        javaContactService.addHobby("hobby", "hobby");
        verify(hobbyDao).addHobby((Hobby) anyObject());
        javaContactService.addHobby("hobby", "hobby");
        verify(hobbyDao, times(2)).addHobby((Hobby) anyObject());
    }

    @Test
    public void testAddPlace() throws Exception {
        javaContactService.addPlace("1", "2", 1.1, 2.2);
        verify(placeDao).addPlace((Place) anyObject());
    }

    @Test
    public void testAddFriendShip() throws Exception {
        Contact con1 = new Contact();
        Contact con2 = new Contact();
        javaContactService.addFriendShip(con1, con2);
        verify(contactDao).addFriendShip(isA(Contact.class), isA(Contact.class));
    }

    @Test
    public void testGetFriendList() throws Exception {
        javaContactService.getFriendList(contact);
        verify(contactDao).getFriends(contact);
        javaContactService.getFriendList(contact);
        when(contactDao.getFriends(contact)).thenReturn(Collections.EMPTY_SET);
    }

    @Test
    public void testGetConversation() throws Exception {;
        when(javaContactService.getConversation((Contact) anyObject(), (Contact) anyObject())).thenReturn(Collections.EMPTY_LIST);
    }

    @Test(expected = NullPointerException.class)
    public void testDeleteContact() throws Exception {
        contact.setFirstName("a");
        contact.setLastName("aa");
        verify(contactDao).deleteContact(contact);
    }
    @Test
    public void testDeletContact() throws Exception {
        javaContactService.deleteContact(contact);
        verify(contactDao).deleteContact(contact);
    }

    @Test
    public void testGetIdContact() throws Exception {
        javaContactService.getIdContact(contact);
        verify(contactDao).getIdContact(contact);
    }

    @Test
    public void testToString() throws Exception {
        when(javaContactService.toString()).thenReturn(toString());
    }
}