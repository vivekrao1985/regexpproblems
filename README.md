# regexpproblems
Steps to reproduce problem -

```java -jar checkstyle-8.0-all.jar -c check-style.xml src/main/java/my/checkstyle/frustrations/ShouldPass.java```

```java -jar checkstyle-8.0-all.jar -c check-style.xml src/main/java/my/checkstyle/frustrations/ShouldAlsoPass.java```

This is where I expect a failure -

```java -jar checkstyle-8.0-all.jar -c check-style.xml src/main/java/my/checkstyle/frustrations/ShouldFail.java```

Actual -
```
Starting audit...
Audit done.
```

Expected -
```
Starting audit...
[ERROR] /path/to/prject/regexpproblems/src/main/java/my/checkstyle/frustrations/ShouldFail.java:1: Line does not match expected header line of '^package .*\n\n.*'. [RegexpHeader]
Audit done.
```