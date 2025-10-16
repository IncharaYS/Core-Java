package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.instrument.Instrument;
import java.util.ArrayList;
import java.util.List;

public class InstrumentRunner {
    public static void main(String[] args) {
        List<Instrument> instrumentList = new ArrayList<>();

        instrumentList.add(new Instrument("I001", "Guitar", "String", "Wood", 15000.0, true));
        instrumentList.add(new Instrument("I002", "Piano", "Keyboard", "Wood", 50000.0, true));
        instrumentList.add(new Instrument("I003", "Violin", "String", "Wood", 20000.0, false));
        instrumentList.add(new Instrument("I004", "Flute", "Wind", "Metal", 5000.0, false));
        instrumentList.add(new Instrument("I005", "Drums", "Percussion", "Wood", 25000.0, true));
        instrumentList.add(new Instrument("I006", "Saxophone", "Wind", "Brass", 35000.0, true));
        instrumentList.add(new Instrument("I007", "Trumpet", "Wind", "Brass", 30000.0, true));
        instrumentList.add(new Instrument("I008", "Tabla", "Percussion", "Wood", 10000.0, false));
        instrumentList.add(new Instrument("I009", "Electric Keyboard", "Keyboard", "Plastic", 20000.0, true));
        instrumentList.add(new Instrument("I010", "Harmonica", "Wind", "Metal", 4000.0, false));

        System.out.println("Instrument list 1:");
        for(Instrument instrument : instrumentList){
            System.out.println(instrument);
        }
        System.out.println();
        System.out.println("Size of Instrument list 1:" + instrumentList.size());

        List<Instrument> instrumentList2 = new ArrayList<>();

        instrumentList2.add(new Instrument("I011", "Bass Guitar", "String", "Wood", 18000.0, true));
        instrumentList2.add(new Instrument("I012", "Cajon", "Percussion", "Wood", 12000.0, false));
        instrumentList2.add(new Instrument("I013", "Clarinet", "Wind", "Wood", 22000.0, true));
        instrumentList2.add(new Instrument("I014", "Electric Violin", "String", "Wood", 25000.0, true));
        instrumentList2.add(new Instrument("I015", "Timpani", "Percussion", "Copper", 40000.0, false));
        instrumentList2.add(new Instrument("I016", "Organ", "Keyboard", "Wood", 60000.0, true));
        instrumentList2.add(new Instrument("I017", "Oboe", "Wind", "Wood", 30000.0, false));
        instrumentList2.add(new Instrument("I018", "Synthesizer", "Keyboard", "Plastic", 45000.0, true));
        instrumentList2.add(new Instrument("I019", "Djembe", "Percussion", "Wood", 8000.0, false));
        instrumentList2.add(new Instrument("I020", "Accordion", "Keyboard", "Wood", 35000.0, true));

        System.out.println("Instrument list 2:");
        for(Instrument instrument : instrumentList2){
            System.out.println(instrument);
        }
        System.out.println();
        System.out.println("Size of Instrument list 2:" + instrumentList2.size());

        instrumentList.addAll(instrumentList2);
        System.out.println("Full instrument list:");
        for(Instrument instrument : instrumentList){
            System.out.println(instrument);
        }
        System.out.println();

        Instrument instrument1 = new Instrument("I006", "Saxophone", "Wind", "Brass", 35000.0, true);
        Instrument instrument2 = new Instrument("I021", "Electric Drum", "Percussion", "Wood", 28000.0, true);
        instrumentList.add(4, instrument2);

        System.out.println("Does list contain instrument1:" + instrumentList.contains(instrument1));
        System.out.println("Does list contain instrumentList2:" + instrumentList.containsAll(instrumentList2));
        System.out.println();

        instrumentList.remove(instrument1);
        instrumentList.remove(7);

        System.out.println("Instrument list after remove(Object) and remove(index):");
        for(Instrument instrument : instrumentList){
            System.out.println(instrument);
        }
        System.out.println();

        instrumentList.removeAll(instrumentList2);
        System.out.println("Instrument list after removing instrumentList2:");
        for(Instrument instrument : instrumentList){
            System.out.println(instrument);
        }
        System.out.println();

        System.out.println("Does list contain instrument1:" + instrumentList.contains(instrument1));
        System.out.println("Does list contain instrumentList2:" + instrumentList.containsAll(instrumentList2));
        System.out.println();

        instrumentList.addAll(instrumentList2);
        instrumentList.retainAll(instrumentList2);

        System.out.println("Instrument list after retaining only instrumentList2:");
        for(Instrument instrument : instrumentList){
            System.out.println(instrument);
        }
        System.out.println();
    }
}
