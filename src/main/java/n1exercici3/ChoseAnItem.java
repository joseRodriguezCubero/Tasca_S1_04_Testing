package n1exercici3;

public class ChoseAnItem {

    public String item (int element) {

        String[] items = {"Cola", "Huevos", "Pan", "Leche", "Harina", "Salsa de Tomate"};
        String itemChosed = null;
        try {
            itemChosed = items[element - 1];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error en el mensaje.");
        }

        return itemChosed;
    }

}
