package org.example;

public class JewelsCalc {

    // On
    public int numJewelsInStonesOneLoop(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) { // On
            if (jewels.indexOf(stones.charAt(i)) != -1)
                counter++;
        }
        return counter;
    }

    //On2
    public int numJewelsInStonesCharArrays(String jewels, String stones) {
        int count = 0;
        for (char stone : stones.toCharArray()) {
            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // On2
    public int numJewelsInStonesTwoLoops(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
