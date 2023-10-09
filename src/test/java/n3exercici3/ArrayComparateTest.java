package n3exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayComparateTest {

    @Test
    void CompareIfTwoArraysAreTheSame(){
        ArrayComparate arrayComparate = new ArrayComparate();
        assertThat(arrayComparate.getArray1()).isEqualTo(arrayComparate.getArray2());
    }

    @Test
    void CompareIfTwoArraysAreNotTheSame(){
        ArrayComparate arrayComparate = new ArrayComparate();
        assertThat(arrayComparate.getArray1()).isNotEqualTo(arrayComparate.getArray3());
    }



}