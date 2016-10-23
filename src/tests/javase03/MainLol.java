package tests.javase03;

import javase03.t01.CrazyLogger;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;

public class MainLol {

    public static void main(String[] args){
        CrazyLogger crazyLogger=new CrazyLogger();
        crazyLogger.addMessage();
        crazyLogger.addMessage();
        crazyLogger.addMessage();
        crazyLogger.find();

    }
}
