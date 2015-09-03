  int startX=(int)(Math.random()*300);
  int startY=0;
  int endX=(int)(Math.random()*300);
  int endY=0;
  int cx=25;


void setup()
{
	size(300,300);
	background(0,0,0);
	strokeWeight(.75);
}
void draw()
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

void mousePressed()
{
	startX=(int)(Math.random()*300);
	startY=0;
	endX=(int)(Math.random()*300);
	endY=0;
	redraw();
}


void cloud()
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




