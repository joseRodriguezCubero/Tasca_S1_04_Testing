package n1exercici2;

public class CalculoDni {

        public char dni(Integer number){
            char[] charset = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                    'H', 'L', 'C', 'K', 'E'};

            int module = number % 23;

            return charset[module];
        }

}