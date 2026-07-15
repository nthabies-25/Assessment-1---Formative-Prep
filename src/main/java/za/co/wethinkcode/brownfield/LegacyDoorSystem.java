package za.co.wethinkcode.brownfield;

public class LegacyDoorSystem {

    public String generateAccessBadge(String userId, String name) {
        return "BADGE_PRINTED_FOR:[" + userId + "] " + name.toUpperCase();
    }

}
