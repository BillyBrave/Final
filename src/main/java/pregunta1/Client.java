package pregunta1;

public class Client {

    public static void main(String[] args) {
        Sharer sharer = new Sharer();
        sharer.share("Mastering design patterns", SharerType.Facebook);
        sharer.share("Mastering design patterns", SharerType.Reddit);
        sharer.share("Mastering design patterns", SharerType.Twitter);
        
        sharer.shareEveryWhere("I'll receive my Master's degree from UNMSM very soon");
    }
}
