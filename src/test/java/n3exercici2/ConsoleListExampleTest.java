package n3exercici2;

import n3exercici1.VideoConsole;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleListExampleTest {

    @Test
    void CheckIfTheReferenceIsTheSame(){
        VideoConsole videoConsole1 = new VideoConsole("Xbox360","Microsoft");
        VideoConsole videoConsole2 = new VideoConsole("Xbox360","Microsoft");
        VideoConsole videoConsole3 = new VideoConsole("Xbox Series S","Microsoft");

       assertThat(videoConsole1.hashCode()).isEqualTo(videoConsole2.hashCode());
    }
    @Test
    void CheckIfTheReferenceIsNotTheSame(){
        VideoConsole videoConsole1 = new VideoConsole("Xbox360","Microsoft");
        VideoConsole videoConsole2 = new VideoConsole("Xbox360","Microsoft");
        VideoConsole videoConsole3 = new VideoConsole("Xbox Series S","Microsoft");

        assertThat(videoConsole1.hashCode()).isNotEqualTo(videoConsole3.hashCode());
    }

}