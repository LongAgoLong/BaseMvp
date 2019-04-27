# BaseMvp
封装了MVP的基类，最简单那实现MVP的方式    
[![](https://jitpack.io/v/LongAgoLong/BaseMvp.svg)](https://jitpack.io/#LongAgoLong/BaseMvp)  
**gradle依赖**
```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
```java
implementation 'com.github.LongAgoLong:BaseMvp:$JitPack-Version$'
implementation 'io.reactivex.rxjava2:rxjava:2.1.17'
implementation 'io.reactivex.rxjava2:rxandroid:2.0.2'
implementation 'com.trello.rxlifecycle2:rxlifecycle:2.2.2'
implementation 'com.trello.rxlifecycle2:rxlifecycle-components:2.2.2'
```
**maven依赖**
```java
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
```java
<dependency>
	<groupId>com.github.LongAgoLong</groupId>
	<artifactId>BaseMvp</artifactId>
	<version>$JitPack-Version$</version>
</dependency>
```
