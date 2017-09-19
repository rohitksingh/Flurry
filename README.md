# **Flurry The Carousel**
Simple Android library, which can serve as Image Slider too !

# Table of Contents  
[Gradle dependecy](#gradledependency)  
[How to integrate ?](#Header)  
[Adding Flurry to Layout](#FlurryXml)  
[Adding Flurry to Java File](#Header)  
[Check the latest version](#latestVersion)  
[How to integrate ?](#Header)  
[How to integrate ?](#Header)  
[Flurry step by step gradle integration for newbies to gradle](#stepbystepgradle)  



<a name="gradledependency"/>     

## **Gradle Dependency** 
### `compile 'com.github.rohitksingh:Flurry:1.0.2`

<a name="Header"/>

## **How to integrate ?** 
If you are already familiar with gradle

Just Add the following code in your root build.gradle . If you are new to gradle see below      
[Step by step integration guide](#stepbystepgradle) .

`allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
		compile 'com.github.User:Repo:Tag'
	}`
 <a name= "stepbystepgradle"/>
## **Step by step guide to integrate Flurry dependency in gradle file (For Beginners to Gradle)**

#### **1)  Go to your root build.gradle**

??????Image ??????

#### **2) Add repository link and dependency like this**  



allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
		compile 'com.github.User:Repo:Tag'
	}

#### **3) Finally your build.gradle file will look like this** 

??????? Image

#### **4) Hit the sync Button**

And you are done



<a name= "FlurryXml"/>
Adding Flurry to Layout (xml)

`<com.rohksin.flurry.Flurry
        android:id="@+id/flurry"
        android:layout_width="match_parent"
        android:layout_height="300dp"/>`

<a name ="latestVersion"/>                
## **Check the latest Version**             
                
[JitPack.io](https://jitpack.io/#rohitksingh/Flurry-The-Carousel)
