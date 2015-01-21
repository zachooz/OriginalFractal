float r = 0;
public void setup(){
	background(0);
	size(600,600);
	noStroke();
	

}
public void draw(){
	background(0);
	translate(300,300);
	r-=.05;
	rotate(r);
	fraCreate(0,0,1,0);
}

public void fraCreate(int x, int y, int theWidth, int tC){
	int theCount = tC;
	fill(x*5,y*10,theWidth);
	rect(x,y,theWidth,theWidth);
	if(theWidth<200){
			rotate(.2);
			fraCreate(x+theWidth,y+theWidth, theWidth*2, theCount);
	} else if(theCount<11){
		theCount++;
		fraCreate(0,0,1,theCount);
	}
}