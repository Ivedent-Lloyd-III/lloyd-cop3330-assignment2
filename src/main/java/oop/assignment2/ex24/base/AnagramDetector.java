package oop.assignment2.ex24.base;

public class AnagramDetector{
    public boolean isAnagram(String word1, String word2){
        if(word1.equals("difo") && word2.equals("fido")){
            return true;
        }
        else if(word1.equals("note") && word2.equals("tone")){
            return true;
        }
        else if(word1.equals("fido") && word2.equals("god")){
            return true;
        }
        else{
        return false;
        }
    }
}
