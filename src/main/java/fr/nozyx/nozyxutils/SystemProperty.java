package fr.nozyx.nozyxutils;

import fr.nozyx.nozyxutils.exception.PropertyException;

public class SystemProperty {
    public static String get(String propertyName) {
        if (System.getProperty(propertyName) == null) throw new PropertyException("Cannot return the property value because the return value of \"" + propertyName + "\" property is null");
        return System.getProperty(propertyName);
    }

    public static void set(String propertyName, String propertyValue) {
        if (propertyName == null || propertyName.isEmpty()) throw new PropertyException("Cannot set the property name because the given name is null or empty");
        if (propertyValue == null || propertyValue.isEmpty()) throw new PropertyException("Cannot set the \"" + propertyName + "\" property value because the given value is null or empty");
        System.setProperty(propertyName, propertyValue);
    }
}