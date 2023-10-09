package n3exercici4;
import n3exercici1.VideoConsole;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

class ArrayLIstOfObjectsTest {

    VideoConsole videoConsole1 = new VideoConsole("GameBoy", "Nintendo");
    VideoConsole videoConsole2 = new VideoConsole("PS5", "Sony");
    VideoGame videoGame1 = new VideoGame("Pokemon", "Pokemon Company");
    VideoGame videoGame2 = new VideoGame("Metal Gear Solid", "Konami");
    ArrayList<Object> objects1 = newArrayList(videoConsole1, videoConsole2, videoGame1,videoGame2);
    ArrayList<Object> objects1SomeMissing = newArrayList(videoGame1, videoGame2,videoConsole1);
    ArrayList<Object> objects1DifferentOrder = newArrayList(videoConsole1, videoGame1, videoConsole2, videoGame2);


    @Test
    void TheArrayLIstHasTheSameObjectsInAnyOrder(){
        assertThat(objects1).containsExactlyInAnyOrderElementsOf(objects1DifferentOrder);
        // assertion will pass
    }

    @Test
    void TheArrayListOnlyHasOneVideoGame1(){
        assertThat(objects1).containsOnlyOnce(videoGame1);
        // assertion will pass
    }

    @Test
    void TheArrayListNotHasVideoConsole2(){
        assertThat(objects1SomeMissing).doesNotContain(videoConsole2);
        // assertion will pass
    }

}