Gradle Dynamic Dependency
=========================

Convenient way of toggle between source code dependency and artifact dependency.

Usage
-----
For example, if `app` module depend on `android-weak-handler`

1. adding
```java
compile convertDependency('android-weak-handler')
```
to `dependencies` block of `app`

2. add the following line to `local.properties`
```java
android-weak-handler=com.badoo.mobile:android-weak-handler:1.1
```
now you enable artifact dependency.
 
3. if you comment it as following 
```java
#android-weak-handler=com.badoo.mobile:android-weak-handler:1.1
```
the gradle script will clone the source code of `android-weak-handler` and include module named `android-weak-handler` into build.