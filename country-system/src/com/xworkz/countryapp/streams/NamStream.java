package com.xworkz.countryapp.streams;

import java.util.stream.Stream;

public interface NamStream<T> extends Stream<T> {
    NamStream namFilter(boolean c);
}
