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

public class Lightning extends PApplet {

  int startX=(int)(Math.random()*300);
  int startY=0;
  int endX=(int)(Math.random()*300);
  int endY=0;
  int cx=25;


public void setup()
{
	size(300,300);
	background(0,0,0);
	strokeWeight(.75f);
}
public void draw()
{
	stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	while(startY<310)
	{
		endX=startX+(int)(Math.random()*20)-9;
		endY=startY+(int)(Math.random()*10);
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
	cloud();
	//noLoop();
	
}

public void mousePressed()
{
	startX=(int)(Math.random()*300);
	startY=0;
	endX=(int)(Math.random()*300);
	endY=0;
	redraw();
}


public void cloud()
{
	noStroke();
	fill(50,50,50);
	ellipse(cx,10,100,50);
	ellipse(cx+60,10,100,50);
	ellipse(cx+118,10,100,50);
	ellipse(cx+184,10,100,50);
	ellipse(cx+243,10,100,50);
	//if(cx<350)
	//{
	//	cx+=60;
	//}
}




  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
