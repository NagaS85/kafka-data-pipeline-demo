package com.kafka.data.pipeline.demo.model;

import lombok.Data;

@Data
public class DiseaseIndicator {

    Integer yearStart;
    Integer yearEnd;
    String locationAbbr;
    String locationDesc;
    String dataSource;
    String topic;
    String question;
    String response;
    String dataValueUnit;
    String dataValueType;
    Double dataValue;
    Double dataValueAlt;
    String dataValueFootnoteSymbol;
    String datavalueFootnote;
    Double lowConfidenceLimit;
    Double highConfidenceLimit;
    String stratificationCategory1;
    String stratification1;
    String stratificationCategory2;
    String stratification2;
    String stratificationCategory3;
    String stratification3;
    String geoLocation;
    String responseID;
    Integer ocationID;
    String topicID;
    String questionID;
    String dataValueTypeID;
    String stratificationCategoryID1;
    String stratificationID1;
    String stratificationCategoryID2;
    String stratificationID2;
    String stratificationCategoryID3;
    String stratificationID3;
}
