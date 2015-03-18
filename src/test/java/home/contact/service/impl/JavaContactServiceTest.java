package home.contact.service.impl;

import home.contact.dao.InterfaceContactDao;
import home.contact.dao.InterfaceHobbyDao;
import home.contact.dao.InterfaceMessageDao;
import home.contact.dao.InterfacePlaceDao;
import home.contact.model.Contact;
import home.contact.service.InterfaceJavaContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Collections;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class JavaContactServiceTest {


    @Mock
    private InterfaceJavaContactService interfaceJavaContactService;
    @Mock
    private InterfaceContactDao interfaceContactDao;
    @Mock
    private InterfaceHobbyDao interfaceHobbyDao;
    @Mock
    private InterfaceMessageDao interfaceMessageDao;
    @Mock
    private InterfacePlaceDao interfacePlaceDao;

    @InjectMocks
    private JavaContactService javaContactService = new JavaContactService();

    @Test(expected = TooLittleActualInvocations.class)
    public void testCreateContact() throws Exception {
        interfaceJavaContactService.createContact(anyString(), anyString(), (LocalDate) anyObject());
        verify(interfaceJavaContactService).createContact(anyString(), anyString(), (LocalDate) anyObject());
        interfaceJavaContactService.createContact(anyString(), anyString(), (LocalDate) anyObject());
        verify(interfaceJavaContactService, times(3)).createContact(anyString(), anyString(), (LocalDate) anyObject());
        verify(interfaceJavaContactService, never()).createContact("Vas", "Das", null);

        InOrder inOrder = inOrder(interfaceJavaContactService);
        inOrder.verify(interfaceJavaContactService).createContact(anyString(), anyString(), (LocalDate) anyObject());
    }

    @Test
    public void testAddHobby() throws Exception {
        interfaceJavaContactService.addHobby("hobby", "hobby");
        verify(interfaceJavaContactService).addHobby(anyString(), anyString());
        interfaceJavaContactService.addHobby("hobby", "hobby");
        verify(interfaceJavaContactService, times(2)).addHobby(anyString(), anyString());
        interfaceJavaContactService.addHobby(null, "hobby");
        verify(interfaceJavaContactService, times(3)).addHobby(anyString(), anyString());
        interfaceJavaContactService.addHobby("as", "hobby");
        verify(interfaceJavaContactService, times(4)).addHobby(anyString(), anyString());
    }

    @Test
    public void testAddPlace() throws Exception {
        interfaceJavaContactService.addPlace("1", "2", 1.1, 2.2);
        verify(interfaceJavaContactService).addPlace("1", "2", 1.1, 2.2);
    }

    @Test
    public void testAddFriendShip() throws Exception {
        Contact con1 = new Contact();
        Contact con2 = new Contact();
        interfaceJavaContactService.addFriendShip(con1, con2);
        verify(interfaceJavaContactService).addFriendShip(isA(Contact.class), isA(Contact.class));
    }

    @Test
    public void testGetFriendList() throws Exception {

        when(interfaceJavaContactService.getFriendList((Contact) anyObject())).thenReturn(Collections.EMPTY_SET);
        interfaceJavaContactService.getFriendList((Contact) anyObject());
        verify(interfaceJavaContactService).getFriendList((Contact) anyObject());
        Contact con1 = new Contact();
        Contact con2 = new Contact();
        con1.setFirstName("a");
        con2.setFirstName("aa");
        interfaceContactDao.addContact(con1);
        interfaceContactDao.addContact(con2);
        interfaceJavaContactService.addFriendShip(con1, con2);
        when(interfaceJavaContactService.getFriendList(con1)).thenReturn(Collections.EMPTY_SET);
    }

    @Test
    public void testGetConversation() throws Exception {;
        when(interfaceJavaContactService.getConversation((Contact) anyObject(), (Contact) anyObject())).thenReturn(Collections.EMPTY_LIST);
    }
}