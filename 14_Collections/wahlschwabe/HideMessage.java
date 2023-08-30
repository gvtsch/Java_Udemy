package wahlschwabe;

public class HideMessage<Type> {
    private Type message;

    public HideMessage(Type message) {
        this.message = message;
    }

    public Type getMessage(String password) {
        if (password.equals("test")) {
            return message;
        } else {
            return null;
        }
    }
}
