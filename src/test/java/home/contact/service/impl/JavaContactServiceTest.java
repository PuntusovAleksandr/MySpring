package home.contact.service.impl;

import home.contact.dao.InterfaceContactDao;
import home.contact.dao.InterfaceHobbyDao;
import home.contact.dao.inpl.ContactDao;
import home.contact.dao.inpl.HobbyDao;
import home.contact.model.Contact;
import home.contact.service.InterfaceJavaContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.mockito.Mockito.anyObject;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class JavaContactServiceTest {

    @Mock
    private InterfaceJavaContactService interfaceJavaContactService;
    private InterfaceContactDao interfaceContactDao;
    private InterfaceHobbyDao interfaceHobbyDao;

    @InjectMocks
    private JavaContactService javaContactService = new JavaContactService();
    private ContactDao contactDao = new ContactDao();
    private HobbyDao hobby = new HobbyDao();

    @Test
    public void testCreateContact() throws Exception {
//        javaContactService.createContact("as" , "bs" , (LocalDate) anyObject());
//        verify(interfaceJavaContactService).createContact(anyString(), anyString(), (LocalDate) anyObject());
    }

    @Test
    public void testAddHobby() throws Exception {
//        hobby.addHobby(new Hobby("as", "ege"));
//        javaContactService.addHobby("Description", "Title");
//        verify(interfaceHobbyDao).addHobby(new Hobby(anyString(), anyString()));
    }

    @Test
    public void testAddPlace() throws Exception {

    }

    @Test
    public void testAddFriendShip() throws Exception {

    }

    @Test
    public void testGetFriendList() throws Exception {
        when(interfaceJavaContactService.getFriendList((Contact) anyObject())).thenReturn(Collections.EMPTY_SET);
    }

    @Test
    public void testGetConversation() throws Exception {;
        when(interfaceJavaContactService.getConversation((Contact) anyObject(), (Contact) anyObject())).thenReturn(Collections.EMPTY_LIST);
    }
}