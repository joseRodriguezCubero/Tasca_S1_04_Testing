package n3exercici4;

import n3exercici1.VideoConsole;

import java.util.ArrayList;

public class ArrayLIstOfObjects {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        VideoConsole videoConsole1 = new VideoConsole("GameBoy", "Nintendo");
        objects.add(videoConsole1);

        VideoGame videoGame1 = new VideoGame("Pokemon", "Pokemon Company");
        objects.add(videoGame1);

        VideoConsole videoConsole2 = new VideoConsole("PS5", "Sony");
        objects.add(videoConsole2);

        VideoGame videoGame2 = new VideoGame("Metal Gear Solid", "Konami");
        objects.add(videoGame2);




        System.out.println(objects);

    }
}
