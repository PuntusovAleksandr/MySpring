package home.contact.dao.inpl;

import home.contact.dao.InterfaceMessageDao;
import home.contact.model.Contact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MessageDaoTest {

    @Mock
    private InterfaceMessageDao interfaceMessageDao;
    @InjectMocks
    private static MessageDao messageDao = new MessageDao();

    @Test
    public void testStoreMessage() throws Exception {

    }

    @Test
    public void testGetConversation() throws Exception {
        when(interfaceMessageDao.getConversation(Matchers.<Contact>anyObject(), Matchers.<Contact>anyObject())).thenReturn(Collections.EMPTY_LIST);
    }
}