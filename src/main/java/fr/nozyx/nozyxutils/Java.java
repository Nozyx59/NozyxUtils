package fr.nozyx.nozyxutils;

public class Java {
    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public static String getJavaHome() {
        return System.getProperty("java.home");
    }
}
