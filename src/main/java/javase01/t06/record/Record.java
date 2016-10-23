package javase01.t06.record;

import javase01.t06.notepad.Notepad;

public class Record {

    private String record;
    private int index;
    Notepad notepad=new Notepad();

    public void add(){
        notepad.addNote(index, this.record);
    }

    public void remove(){
        notepad.removeNote(index);
    }

    public void get(){
        notepad.getNote();
    }

    public void set(){
        notepad.setNote(index, record);
    }
}
