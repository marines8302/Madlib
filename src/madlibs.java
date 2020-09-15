public class madlibs {


    //Fun java code practice with mad libbed story
    public static void main(String[] args) {

        String heroName = "Hercules";
        String adjective1 = "beautiful";
        String adjective2 = "scary";
        String adjective3 = "gross";
        String verb = "break";
        String noun1 = "New York";
        String noun2 = "Guitar";
        String noun3 = "Betty";
        String noun4 = "Flower";
        String noun5 = "China";
        String noun6 = "Hat";
        String villianName = "Lex";
        int number = 53;
        String place = "Saturn";

        //The template for the story
        String story = "This morning " + heroName + " woke up feeling " + adjective1 + ". " +
                "'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 +
                "s were protesting to keep " + noun2 + " in stores. They began to " + verb + " " +
                "to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 +
                ". Concerned, " + heroName + " texted " + villianName + ", who flew " + heroName + " to " + place + " " +
                "and dropped" + heroName + " in a puddle of frozen " + noun5 + ". " + heroName + " woke up in the year "
                + number + ", in a world where " + noun6 + "s ruled the world.";
        System.out.println(story);

    }
}