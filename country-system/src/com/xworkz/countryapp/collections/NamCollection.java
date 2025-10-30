package com.xworkz.countryapp.collections;

import com.xworkz.countryapp.impl.NamStreamImpl;
import com.xworkz.countryapp.streams.NamStream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public interface NamCollection<T> extends Collection<T>, List<T> {
    default NamStream<T> namStream(){
        return new NamStreamImpl<T>();

    }

}
