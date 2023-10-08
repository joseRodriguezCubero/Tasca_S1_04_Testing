package n1exercici3;

public class ChoseAnItem {

    public String item (int element) {

        String[] items = {"Cola", "Huevos", "Pan", "Leche", "Harina", "Salsa de Tomate"};
        try {
            return items[element-1];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error en el mensaje.");
        }
       return items[element-1];
    }

}
