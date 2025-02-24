import com.google.cloud.translate.*;

public class LanguageTranslator {
    public static void main(String[] args) {
        String text = "Hello, how are you?";
        String targetLanguage = "es"; // Spanish

        String translatedText = translateText(text, targetLanguage);
        System.out.println("Translated Text: " + translatedText);
    }

    public static String translateText(String text, String targetLanguage) {
        try {
            Translate translate = TranslateOptions.getDefaultInstance().getService();
            Translation translation = translate.translate(
                text,
                Translate.TranslateOption.targetLanguage(targetLanguage)
            );
            return translation.getTranslatedText();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error in translation";
        }
    }
}
