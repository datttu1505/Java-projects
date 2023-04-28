/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */

    
public class Word implements Comparable<Word>{
private String word;
private int count;
public Word() {
}
public Word(String w, int cnt) {
word=w;
count=cnt;
}

public void setWord(String w) {
word=w;
}
public String getWord() {
return word;
}
public void setCount(int c) {
count = c;
}
public int getCount() {
return count;
}
@Override /** Override equals defined in Object */
public boolean equals(Object o) {
return word.equals(((Word)o).word);
}
public int compareTo(Word w) {
return word.compareTo(w.word);
}
public String toString() {
return word+":"+count;
}
}

