package fr.nozyx.nozyxutils;

public class User {
    public static String getUsername() {
        return SystemProperty.get("user.name");
    }

    public static String getUserHome() {
        return SystemProperty.get("user.home");
    }
}
