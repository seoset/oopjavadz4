package model;

public class DataModel {
    private int[] first;
    private int[] second;

    public int[] getFirst() {
        return first;
    }

    public void setFirst(int[] first) {
        this.first = first;
    }

    public int[] getSecond() {
        return second;
    }

    public void setSecond(int[] second) {
        this.second = second;
    }

    public boolean validate() {
        return first != null && second != null;
    }

    public int[][] calculate() {
        if(!validate()) throw new RuntimeException("data not set");
        int[][] res = new int[first.length][second.length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                res[i][j] = first[i] * second[j];
            }
        }
        return res;
    }
}
