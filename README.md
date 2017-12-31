# **Flurry The Carousel**
Simple Android library, which can serve as Image Slider too !

## Table of Contents  
[Gradle dependecy](#gradledependency)  
[Usage](#usage)  
[Check the latest Version](#latestVersion)  
[Flurry step by step gradle integration for gradle beginners](#stepbystepgradle)  
[About author](#aboutAuthor)



<a name="gradledependency"/>     

## **Gradle:** 
 `             
compile 'com.github.rohitksingh:Flurry:1.0.3                                                                                                                       
`

<a name="Header"/>

### **How to integrate ?** 
If you are already familiar with gradle. Add the following code in your root build.gradle .          
If you are new to gradle see below  [Step by step integration guide](#stepbystepgradle) .

> Add hosting repository url 

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

> Add compile time dependency

    dependencies {
       compile 'com.github.rohitksingh:Flurry:1.0.3'
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
                
You can find the latest version of Flurry in [JitPack.io](https://jitpack.io/#rohitksingh/Flurry)

 <a name= "stepbystepgradle"/>

## **Flurry step by step gradle integration for gradle beginners:**

### **1)  Go to your project build.gradle and this**

     allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	 }



![repo](https://user-images.githubusercontent.com/11274840/30658631-38906c12-9df0-11e7-9625-5dd06f38c2ab.png)

### **2) Go to app modile build.gradle and add this**  
  
      dependencies {
       compile 'com.github.rohitksingh:Flurry:1.0.3'
    }


	
![compile](https://user-images.githubusercontent.com/11274840/30658703-6ea1122a-9df0-11e7-873d-32e165c03d80.png)	




### **3) Hit the sync Button**

![gradle](https://user-images.githubusercontent.com/11274840/30658730-8ad314ca-9df0-11e7-886c-ac9d4ed4a7e6.png)

### And you are done.

<a name="aboutAuthor"/>

</br></br>
## About author
<p align="center">This Repository is developed and maintained by </p>
<p align="center">
  <a href="https://stackoverflow.com/users/4700156/rohit-singh?tab=profile"><img width="100" height="100" src="https://user-images.githubusercontent.com/11274840/30627155-38952a30-9dec-11e7-9072-a00d9a86bdb8.gif">
</p></a>
<a href="https://stackoverflow.com/users/4700156/rohit-singh?tab=profile">
<p align="center">
  Rohit Singh
</p>
</a>



