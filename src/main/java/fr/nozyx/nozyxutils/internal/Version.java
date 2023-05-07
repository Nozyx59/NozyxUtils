package fr.nozyx.nozyxutils.internal;

public class Version {
    public String version;
    public VersionType versionType;

    public String getVersion() {
        return this.version;
    }

    public VersionType getVersionType() {
        return this.versionType;
    }

    public String getFullVersion() {
        return this.versionType + "-" + this.version;
    }

    public Version(String version, VersionType versionType) {
        this.version = version;
        this.versionType = versionType;
    }

    public enum VersionType {
        RELEASE, SNAPSHOT
    }
}
