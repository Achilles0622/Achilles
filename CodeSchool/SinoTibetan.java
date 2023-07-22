package CodeSchool;

public class SinoTibetan extends Language {

    SinoTibetan(String inputLanguageName, int inputNumSpeakers) {
        super(inputLanguageName,
                inputNumSpeakers,
                "Asia",
                "subject-object-verb");
        if(inputLanguageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }

}