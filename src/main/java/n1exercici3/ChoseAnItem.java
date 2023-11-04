package n1exercici3;

public class ChoseAnItem {

    public String item (int element) throws ArrayIndexOutOfBoundsException{

        String[] items = {"Cola", "Huevos", "Pan", "Leche", "Harina", "Salsa de Tomate"};
        String itemChosed = null;

            itemChosed = items[element - 1];

        return itemChosed;
    }

}
