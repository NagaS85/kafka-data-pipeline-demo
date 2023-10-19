package com.kafka.data.pipeline.demo.topology;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StreamProcessor {
    private static final Serde<String> STRING_SERDE = Serdes.String();

    @Autowired
    void buildPipeline(StreamsBuilder streamsBuilder) {
        /* Build Topology to derive transform data */
        KStream<String, String> messageStream = streamsBuilder
                .stream("source-csv-spooldir-topic-03", Consumed.with(STRING_SERDE, STRING_SERDE));
        messageStream.foreach((s, s2) -> {
            System.out.println("s2    "+s2);
        });
        //TODO
    }
}

