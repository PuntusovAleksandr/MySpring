package home.contact.CoreMyCpring;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class Hobby {
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}'+"\n";
    }
}
