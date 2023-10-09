package n3exercici5;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;

class MapExampleTest {
    @Test
    void MapKeyChecker() {
        HashMap<Integer,String> doNotCallExGirlFriends = new HashMap<>();

        doNotCallExGirlFriends.put(654465454, "Maria");
        doNotCallExGirlFriends.put(654231546, "Yolanda");
        doNotCallExGirlFriends.put(654213456, "Maria Ros");
        doNotCallExGirlFriends.put(655124125, "Beatriz");

        assertThat(doNotCallExGirlFriends).containsKey(655124125);
        //test will be pass

    }
}