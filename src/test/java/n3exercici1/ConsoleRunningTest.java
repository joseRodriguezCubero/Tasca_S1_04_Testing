package n3exercici1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleRunningTest {

    @Test
    void twoConsolesAreEquals() {
        VideoConsole videoConsole1 = new VideoConsole("PS5","Sony");
        VideoConsole videoConsole2 = new VideoConsole("PS5","Sony");
        assertThat(videoConsole1).isEqualTo(videoConsole2);
    }

    @Test
    void twoConsolesAreNotEquals(){
        VideoConsole videoConsole1 = new VideoConsole("PS5","Sony");
        VideoConsole videoConsole2 = new VideoConsole("PS3","Sony");
        assertThat(assertThat(videoConsole1).isNotEqualTo(videoConsole2));
    }
}


