Gradle Dynamic Dependency
=========================

Convenient way of toggle between source code dependency and artifact dependency.

Usage
-----
For example, if `app` module depend on `android-weak-handler`
- add dependency to `dependencies` block of `app`

```groovy
dependencies {
	compile convertDependency('android-weak-handler')
}
```

- add the following line to `local.properties` like this
```groovy
ndk.dir=E\:\\android-sdk\\ndk-bundle
sdk.dir=E\:\\android-sdk
android-weak-handler=com.badoo.mobile:android-weak-handler:1.1
```
Now you enable artifact dependency.
 
- If you comment it as following 
```groovy
ndk.dir=E\:\\android-sdk\\ndk-bundle
sdk.dir=E\:\\android-sdk
#android-weak-handler=com.badoo.mobile:android-weak-handler:1.1
```
The gradle script will clone the source code of `android-weak-handler` and include module named `android-weak-handler` into build.