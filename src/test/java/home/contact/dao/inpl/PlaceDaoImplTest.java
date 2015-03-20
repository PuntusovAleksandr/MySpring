package home.contact.dao.inpl;

import home.contact.model.Place;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaceDaoImplTest {

    @Test
    public void testAddPlace() throws Exception {

    }

    @Test
    public void testGetAllContactsPlace() throws Exception {
        assertEquals(null, new PlaceDaoImpl().getAllContactsPlace(new Place()));
        PlaceDaoImpl placeDao = new PlaceDaoImpl();
    }
}