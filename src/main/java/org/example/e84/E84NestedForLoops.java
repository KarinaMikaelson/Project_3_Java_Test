package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {

        String [][] pattern = {
                {"$","$","$","$"},
                {"$"," "," ","$"},
                {"$"," "," ","$"},
                {"$","$","$","$"}
        };
        for(int i = 0; i < pattern.length; i++){
            for(int j = 0; j < pattern[i].length; j++){
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
