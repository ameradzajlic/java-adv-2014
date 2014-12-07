package localizedmessage;
import java.util.HashMap;
import java.util.Map;
@Locale(language = "en")
public class UserMessageService {
    Map<String,String> messages;
    String currentLanguage;
    public UserMessageService(){
        messages = new HashMap<>();
        messages.put("en", "Welcome");
        messages.put("fr", "Bienvenue");
        Locale annotation = this.getClass().getAnnotation(Locale.class);
        this.currentLanguage = annotation.language(); 
    }
    public void showWelcomeMessage(){
        System.out.println(messages.get(this.currentLanguage));
    }
}
