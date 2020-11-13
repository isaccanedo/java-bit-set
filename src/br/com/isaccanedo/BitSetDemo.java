package br.com.isaccanedo;

import java.util.BitSet;

/**
 * @author Isac Canedo
 */

public class BitSetDemo {

    public static void main(String[] args) {

        BitSet b1 = new BitSet(16);
        BitSet b2 = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            b1.set(i, i % 2 == 0);
            b2.set(i, i % 5 == 0);
        }

        System.out.println(b1);
        System.out.println(b2);
        b1.and(b2);
        System.out.println("AND : "+ b1);
        for (int i = 0; i < 16; i++) {
            b1.set(i, i % 2 == 0);
        }
        b1.or(b2);
        System.out.println("OR : "+ b1);
        b1.xor(b2);
        System.out.println("XOR : "+ b1);
        b1.flip(0, b1.size());
        System.out.println(b1);
    }

}
