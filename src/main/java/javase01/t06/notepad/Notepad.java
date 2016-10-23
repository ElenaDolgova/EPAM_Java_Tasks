package javase01.t06.notepad;
/**
 * @author Elena Dolgova
 * @version 1.0
 */

import java.util.ArrayList;

public class Notepad {

    ArrayList <String> notepad=new ArrayList<String>();


    /**
     *Adding new record at index
     *
     * @param i
     * index
     * @param data
     * new record
     * @return new record will be add in Notepad
     */
    public void addNote(int i, String data){
        notepad.add(i,data);
    }

    /**
     * Removing note at index
     *
     * @param i index
     * @return note will be remove
     */
    public  void removeNote (int i){
        notepad.remove(i);
    }

    /**
     * @return Notepad
     */
    public ArrayList<String> getNote (){
        return  notepad;
    }

    /**
     * @param i index
     * @param data new data
     * @return Replacing old data in the new
     */
    public String setNote(int i, String data){
        return notepad.set(i,data);
    }
}
