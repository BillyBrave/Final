package pregunta3;

public class Client {

    public static void main(String[] args) {
        String message = "Hello";
        
        QuickMessenger quickMessenger = new QuickMessenger();
        
        
        Message secureMessage= new SecureMessage();
        Message selfDestructingMessage= new SelfDestructingMessage();
        
        quickMessenger.send(message);
        quickMessenger.send(secureMessage.transform(message));
        quickMessenger.send(selfDestructingMessage.transform(message));
        
   
        
        VIPMessenger vipMessenger = new VIPMessenger();
        vipMessenger.send(message);
        vipMessenger.send(secureMessage.transform(message));
        vipMessenger.send(selfDestructingMessage.transform(message));
        

        
        EZMessenger ezMessenger = new EZMessenger();
        ezMessenger.send(message);
        ezMessenger.send(secureMessage.transform(message));
        ezMessenger.send(selfDestructingMessage.transform(message));
        
    }
}
