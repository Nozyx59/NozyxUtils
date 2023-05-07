package fr.nozyx.nozyxutils;

public class Java {
    public static String getJavaVersion() {
        return SystemProperty.get("java.version");
    }

    public static String getJavaHome() {
        return SystemProperty.get("java.home");
    }
}
