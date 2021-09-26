public class TagMaker {
    private String name = "";
    private String organization = "";

    public TagMaker() {
    }

    // Set the name
    public void setName(String name) {
        this.name = name;
    }

    // Set the organization
    public void setOrg(String org) {
        this.organization = org;
    }

    private String getName() {
        return this.name;
    }

    private String getOrg() {
        return this.organization;
    }

    // Print tag with the name and organization
    public void printTag() {
        String linebreak = "############################################################################";
        System.out.println(linebreak);
        System.out.println("###                           ANNUAL CONFERENCE                          ###");
        System.out.println(linebreak);
        System.out.printf("### NAME: %-62s ###%n", getName());
        System.out.println("###                                                                      ###");
        System.out.printf("### ORGANIZATION: %-54s ###%n", getOrg());
        System.out.println("###                                                                      ###");
        System.out.println(linebreak);
    }

    // Clear the name and organization
    public void clearNameAndName() {
        this.name = "";
        this.organization = "";
    }

    // Print a blank tag
    public static void printBlankTag() {
        TagMaker blank = new TagMaker();
        blank.printTag();
    }
}
