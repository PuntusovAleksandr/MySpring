package home.contact.model;


import java.time.LocalDate;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class Message {
    private LocalDate date;
    private Contact from;
    private Contact to;
    private String content;

    public Message() {
    }

    public Message(LocalDate date, String content) {
        this.date = date.now();
        this.content = content;
    }

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

   @Override
    public String toString() {
        return "Message: " +
                "date= " + date +
                ", from= " + from +
                ", to= " + to +
                ", content '" + content + '\'' +
                '}'+"\n";
    }
}
