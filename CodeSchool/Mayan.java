package CodeSchool;

public class Mayan extends Language {


    Mayan(String inputlanguageName, int inputNumSpeakers) {
        super(inputlanguageName,
                inputNumSpeakers,
                "Central America",
                "verb-object-subject");
    }
    @Override
    public void getInfo() {
        /** overides getInfo from parent Language class */
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken +
                " The language follows the ord order: " + this.wordOrder+ "\n Fun Fact: Ki'che' is an ergative language.");
    }
}