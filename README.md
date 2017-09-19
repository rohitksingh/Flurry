# **Flurry The Carousel**
Simple Android library, which can serve as Image Slider too !

## Table of Contents  
[Gradle dependecy](#gradledependency)  
[Usage](#usage)  
[Check the latest Version](#latestVersion)  
[Flurry step by step gradle integration for gradle beginners](#stepbystepgradle)  



<a name="gradledependency"/>     

## **Gradle:** 
 `             
compile 'com.github.rohitksingh:Flurry:1.0.2                                                                                                                       
`

<a name="Header"/>

### **How to integrate ?** 
If you are already familiar with gradle. Add the following code in your root build.gradle .          
If you are new to gradle see below  [Step by step integration guide](#stepbystepgradle) .

> build.gradle

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

> build.gradle

    dependencies {
       compile 'com.github.rohitksingh:Flurry:1.0.2'
    }

<a name="usage"/>

## **Usage:**

### **Add following code in your layout**

    <com.rohksin.flurry.Flurry
        android:id="@+id/flurry"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

### **Add following code in your Activity**

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       

        Flurry flurry = (Flurry)findViewById(R.id.flurry);
        
    }

<a name ="latestVersion"/>  
              
## **Check the latest Version:**             
                
You can find the latest version of Flurry in [JitPack.io](https://jitpack.io/#rohitksingh/Flurry-The-Carousel)

 <a name= "stepbystepgradle"/>

## **Flurry step by step gradle integration for gradle beginners:**

### **1)  Go to your root build.gradle**

??????Image ??????

### **2) Add repository link and dependency like this**  



allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
		compile 'com.github.User:Repo:Tag'
	}

### **3) Finally your build.gradle file will look like this** 

??????? Image

### **4) Hit the sync Button**

And you are done





