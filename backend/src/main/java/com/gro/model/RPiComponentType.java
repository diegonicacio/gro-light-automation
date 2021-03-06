package com.gro.model;

public enum RPiComponentType {
    TEMPERATURE_HUMIDITY,
    TEMPERATURE,
    HUMIDITY,
    PROXIMITY,
    RELAY;
    
    public static RPiComponentType from(String type) {
        RPiComponentType result = null;
        
        switch(type.toLowerCase()) {
            case "temperature_humidity":
                result = TEMPERATURE_HUMIDITY;
                break;
            case "temperature":
                result = TEMPERATURE;
                break;
            case "humidity":
                result = HUMIDITY;
                break;
            case "proximity":
                result = PROXIMITY;
                break;
            case "relay":
                result = RELAY;
                break;
            default:
                result = null;
        }
        
        return result;
    }
    
}
