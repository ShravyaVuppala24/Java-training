package ActiveMQ;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Message {

    @JmsListener(destination = "testqueue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the message as needed

    }

    @JmsListener(destination = "testtopic", containerFactory = "topicListenerFactory")
    public void receiveTopicMessage(String message) {
        System.out.println("Received topic message: " + message);
    }
}

