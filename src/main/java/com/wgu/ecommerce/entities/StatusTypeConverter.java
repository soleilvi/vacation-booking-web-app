package com.wgu.ecommerce.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

// TODO delete possibly
//@Converter(autoApply = true)
//public class StatusTypeConverter implements AttributeConverter<StatusType, String> {
//    @Override
//    public String convertToDatabaseColumn(StatusType status) {
//        if (status == null) {
//            return null;
//        }
//        return status.getShortName();
//    }
//
//    @Override
//    public StatusType convertToEntityAttribute(String shortName) {
//        if (shortName == null) {
//            return null;
//        }
//
//        return StatusType.fromShortName(shortName);
//    }
//}
