package com.wgu.ecommerce.entities;

public enum StatusType {
    pending, ordered, canceled;
//    pending("p"), ordered("o"), canceled("c");
//
//    private String shortName;
//
//    private StatusType(String shortName) { this.shortName = shortName; }
//
//    public String getShortName() { return shortName; }
//
//    public static StatusType fromShortName(String shortName) {
//        switch (shortName) {
//            case "p":
//                return StatusType.pending;
//            case "o":
//                return StatusType.ordered;
//            case "c":
//                return StatusType.canceled;
//            default:
//                throw new IllegalArgumentException("Unknown status type: " + shortName);
//        }
//    }
}
