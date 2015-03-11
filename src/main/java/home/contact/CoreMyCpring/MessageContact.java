package home.contact.CoreMyCpring;


import java.time.LocalDateTime;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class MessageContact {
    private LocalDateTime date;
    private Contact from;
    private Contact to;
    private String content;

    public MessageContact(LocalDateTime date, String content) {
        this.date = LocalDateTime.now();
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
        return "Message{" +
                "date=" + date +
                ", from=" + from +
                ", to=" + to +
                ", content='" + content + '\'' +
                '}'+"\n";
    }
}
