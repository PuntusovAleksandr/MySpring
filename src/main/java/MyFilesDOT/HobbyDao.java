package MyFilesDOT;

import CoreMyCpring.Contact;
import CoreMyCpring.Hobby;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class HobbyDao {
        private List<Hobby> listHobby = new ArrayList<Hobby>();

    public void addHobby(Hobby title){
        listHobby.add(title);
    }

    public Set<Contact> getAiiContactsWithHobby(Hobby title){

        return null;
    }

    public void setListHobby(List<Hobby> listHobby) {
        this.listHobby = listHobby;
    }

    @Override
    public String
    toString() {
        return "HobbyDao{" +
                "listHobby=" + listHobby +
                '}';
    }
}
