package n3exercici2;

import n3exercici1.VideoConsole;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleListExampleTest {



    @Test

    void CheckIfTheReferenceIsTheSame(){

        VideoConsole videoConsole1 = new VideoConsole("Xbox360","Microsoft");

        VideoConsole videoConsole2 = videoConsole1;

        assertThat(videoConsole1).isEqualTo(videoConsole2);

    }

    @Test

    void CheckIfTheReferenceIsNotTheSame(){

        VideoConsole videoConsole1 = new VideoConsole("Xbox360","Microsoft");

        VideoConsole videoConsole3 = new VideoConsole("Xbox Series S","Microsoft");

        assertThat(videoConsole1).isNotEqualTo(videoConsole3);

    }

}