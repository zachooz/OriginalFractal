import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

float r = 0;
public void setup(){
	background(0);
	size(600,600);
	noStroke();
	

}
public void draw(){
	background(0);
	translate(300,300);
	r-=.05f;
	rotate(r);
	fraCreate(0,0,1,0);
}

public void fraCreate(int x, int y, int theWidth, int tC){
	int theCount = tC;
	fill(x*5,y*10,theWidth);
	rect(x,y,theWidth,theWidth);
	if(theWidth<200){
			rotate(.2f);
			fraCreate(x+theWidth,y+theWidth, theWidth*2, theCount);
	} else if(theCount<11){
		theCount++;
		fraCreate(0,0,1,theCount);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
