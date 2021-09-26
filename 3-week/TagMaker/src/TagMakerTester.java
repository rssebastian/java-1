import java.util.Scanner;

public class TagMakerTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TagMaker newTag = new TagMaker();
        System.out.println("Welcome to the conference! Let me get you a name tag. Who are you?");
        newTag.setName(keyboard.nextLine());
        System.out.println("From which organization?");
        newTag.setOrg(keyboard.nextLine());
        System.out.println("Great! Here's your nametag!");
        newTag.printTag();

        System.out.println("Did I get your information wrong? Let me try again. Who are you?");
        newTag.clearNameAndName();
        newTag.setName(keyboard.nextLine());
        System.out.println("From which organization?");
        newTag.setOrg(keyboard.nextLine());
        System.out.println("Sorry about that! Here's your nametag!");
        newTag.printTag();

        System.out.println("...Wrong again? Let me try one more time. Who are you?");
        newTag.clearNameAndName();
        newTag.setName(keyboard.nextLine());
        System.out.println("From which organization?");
        newTag.setOrg(keyboard.nextLine());
        System.out.println("Sigh, here you go. Did I get it right this time?");
        newTag.printTag();

        System.out.println("I got it wrong again? Here's a blank one so you can do it yourself.");
        TagMaker.printBlankTag();
        keyboard.close();
    }
}

/*
 * TEST CASE OUTPUT Welcome to the conference! Let me get you a name tag. Who
 * are you? John Doe From which organization? Facebook Great! Here's your
 * nametag!
 * ############################################################################
 * ### ANNUAL CONFERENCE ###
 * ############################################################################
 * ### NAME: John Doe ### ### ### ### ORGANIZATION: Facebook ### ### ###
 * ############################################################################
 * Did I get your information wrong? Let me try again. Who are you? Dohn Joe
 * From which organization? Amazon Sorry about that! Here's your nametag!
 * ############################################################################
 * ### ANNUAL CONFERENCE ###
 * ############################################################################
 * ### NAME: Dohn Joe ### ### ### ### ORGANIZATION: Amazon ### ### ###
 * ############################################################################
 * ...Wrong again? Let me try one more time. Who are you? John Joe From which
 * organization? Apple Sigh, here you go. Did I get it right this time?
 * ############################################################################
 * ### ANNUAL CONFERENCE ###
 * ############################################################################
 * ### NAME: John Joe ### ### ### ### ORGANIZATION: Apple ### ### ###
 * ############################################################################
 * I got it wrong again? Here's a blank one so you can do it yourself.
 * ############################################################################
 * ### ANNUAL CONFERENCE ###
 * ############################################################################
 * ### NAME: ### ### ### ### ORGANIZATION: ### ### ###
 * ############################################################################
 */