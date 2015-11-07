package com.test.one;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import com.test.Instrument;
import com.test.Performer;


public class OneBand implements Performer {

    private Map<String, Instrument> instruments;
    private Properties instrumentsSummary;

    public OneBand() {
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setInstrumentsSummary(Properties instrumentsSummary) {
        this.instrumentsSummary = instrumentsSummary;
    }

    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
        Enumeration keys = instrumentsSummary.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = instrumentsSummary.getProperty(key);
            System.out.println(key + ":" + value);
        }
    }
}
