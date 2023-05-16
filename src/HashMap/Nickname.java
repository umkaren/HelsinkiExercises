package HashMap;

import java.util.HashMap;

public class Nickname {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        String matthewsNickname = nicknames.get("matthew");

        System.out.println("matthew's nickname is " + matthewsNickname);

    }

}
