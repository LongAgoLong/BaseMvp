# AndroidUtil
封装了一些Android常用的代码块  
会持续整理更新  
[![](https://jitpack.io/v/LongAgoLong/AndroidUtil.svg)](https://jitpack.io/#LongAgoLong/AndroidUtil)  
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
implementation 'com.github.LongAgoLong:AndroidUtil:$JitPack-Version$'
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
	<artifactId>AndroidUtil</artifactId>
	<version>$JitPack-Version$</version>
</dependency>
```
