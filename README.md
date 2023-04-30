# NozyxUtils
NozyxUtils is a Java library create to help developers by making tasks easier to use.
## **_WARNING_ ! To use NozyxUtils, you must use Java 1.8.0 or higher.**

# Installation:
## ***Maven :***
In `pom.xml`, add Nozyx's Repository :
```
<repositories>
    <repository>
      <url>https://nozyx59.github.io/maven</url>
    </repository>
</repositories>    
```

And add NozyxUtils as dependency :

```
<dependencies>
    <dependency>
        <groupId>fr.nozyx</groupId>
        <artifactId>nozyxutils</artifactId>
        <version>THE_VERSION_YOU_WANT</version>
    </dependency>
</dependencies>
```

## ***Gradle :***
In `build.gradle`, add Nozyx's Repository :
```
repositories {
    maven {
        url = "https://nozyx59.github.io/maven"
    }
}
```

And add NozyxUtils as dependency :

```
dependencies {
    implementation "fr.nozyx:nozyxutils:THE_VERSION_YOU_WANT"
}
```
