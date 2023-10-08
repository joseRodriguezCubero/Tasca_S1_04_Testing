package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChoseAnItemTest {

    @Test
    void NegativeOneShoulRetrunIndexOutOfBoundsException(){
        var choseAnItem = new ChoseAnItem();
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    choseAnItem.item(8);
                });

        }
    }

