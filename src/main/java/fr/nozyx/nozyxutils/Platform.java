package fr.nozyx.nozyxutils;

public class Platform {
    public static boolean isWindows() {
        return getOSName().contains("windows") || getOSName().contains("win");
    }

    public static boolean isMac() {
        return getOSName().contains("mac") || getOSName().contains("osx") || getOSName().contains("macos") || getOSName().contains("darwin");
    }

    public static boolean isLinux() {
        return getOSName().contains("linux") || getOSName().contains("unix");
    }

    public static boolean isSolaris() {
        return getOSName().contains("sun") || getOSName().contains("sunos");
    }

    public static String getOSName() {
        return SystemProperty.get("os.name").toLowerCase();
    }

    public static String getOSVersion() {
        return SystemProperty.get("os.version");
    }

    public static String getArchitecture() {
        return SystemProperty.get("os.arch");
    }
}