public class HotDogStand {
    public int standID;
    private int hotdogsSold;
    private static int totalHotdogs = 0;

    public HotDogStand(int standID, int hotdogsSold) {
        if (hotdogsSold < 0 || standID < 0) {
            System.out.println("The standID and hotdogsSold cannot be negative.");
            System.exit(0);
        } else {
            this.standID = standID;
            this.hotdogsSold = hotdogsSold;
            totalHotdogs += hotdogsSold;
        }
    }

    public void justSold() {
        hotdogsSold++;
        totalHotdogs++;
    }

    public int getHotdogsSold() {
        return hotdogsSold;
    }

    public static int getTotalHotdogs() {
        return totalHotdogs;
    }

    public static void main(String[] args) {
        HotDogStand spicyDogStand = new HotDogStand(123, 100);
        HotDogStand chiliDogStand = new HotDogStand(456, 200);
        HotDogStand cheeseyDogStand = new HotDogStand(789, 300);

        String linebreak = "----------------------";
        System.out.println(linebreak);
        System.out.println("The Spicy Dog Stand's in town! It's standID is " + spicyDogStand.standID);
        System.out.println("and they've sold " + spicyDogStand.getHotdogsSold() + " spicy hot dogs so far!");

        System.out.println(linebreak);
        System.out.println("The Chili Dog Stand's in town! It's standID is " + chiliDogStand.standID);
        System.out.println("and they've sold " + chiliDogStand.getHotdogsSold() + " chili hot dogs so far!");

        System.out.println(linebreak);
        System.out.println("The Cheese Dog Stand's in town! It's standID is " + cheeseyDogStand.standID);
        System.out.println("and they've sold " + cheeseyDogStand.getHotdogsSold() + " cheesey hot dogs so far!");
        System.out.println(linebreak);

        System.out.println(linebreak);
        System.out.println("A total of " + HotDogStand.getTotalHotdogs() + " has been sold already!");
        System.out.println(linebreak);

        spicyDogStand.justSold();
        chiliDogStand.justSold();
        cheeseyDogStand.justSold();

        System.out.println("Wow, each stand sold another hotdog!");
        System.out.println(linebreak);
        System.out.println("The totals are now:");
        System.out.println("Spicy Dog Stand #" + spicyDogStand.standID + ": " + spicyDogStand.getHotdogsSold());
        System.out.println("Chili Dog Stand #" + chiliDogStand.standID + ": " + chiliDogStand.getHotdogsSold());
        System.out.println("Cheesey Dog Stand #" + cheeseyDogStand.standID + ": " + cheeseyDogStand.getHotdogsSold());
        System.out.println(linebreak);
        System.out.println("So the total amount of hotdogs sold is now: " + HotDogStand.totalHotdogs);
    }
}

// TEST CASE OUTPUT
// ----------------------
// The Spicy Dog Stand's in town! It's standID is 123
// and they've sold 100 spicy hot dogs so far!
// ----------------------
// The Chili Dog Stand's in town! It's standID is 456
// and they've sold 200 chili hot dogs so far!
// ----------------------
// The Cheese Dog Stand's in town! It's standID is 789
// and they've sold 300 cheesey hot dogs so far!
// ----------------------
// ----------------------
// A total of 600 has been sold already!
// ----------------------
// Wow, each stand sold another hotdog!
// ----------------------
// The totals are now:
// Spicy Dog Stand #123: 101
// Chili Dog Stand #456: 201
// Cheesey Dog Stand #789: 301
// ----------------------
// So the total amount of hotdogs sold is now: 603
