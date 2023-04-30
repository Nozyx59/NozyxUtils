package fr.nozyx.nozyxutils;

public class Platform {
    public static boolean isWindows() {
        if (getOSName().contains("windows") || getOSName().contains("win")) return true;

        return false;
    }

    public static boolean isMac() {
        if (getOSName().contains("mac") || getOSName().contains("osx") || getOSName().contains("macos") || getOSName().contains("darwin")) return true;

        return false;
    }

    public static boolean isLinux() {
        if (getOSName().contains("linux") || getOSName().contains("unix")) return true;

        return false;
    }

    public static boolean isSolaris() {
        if (getOSName().contains("sun") || getOSName().contains("sunos")) return true;

        return false;
    }

    public static String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    public static String getOSVersion() {
        return System.getProperty("os.version");
    }

    public static String getArchitecture() {
        return System.getProperty("os.arch");
    }
}