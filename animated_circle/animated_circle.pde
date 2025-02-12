int x = 0;
int direction = 1;

void setup (){
size (400,400);
fill (255);
}
void draw() {
 background(0);
 x=x+ direction;
 
 if (frameCount % width ==0){
   direction = direction * -1; 
 }
 
 ellipse (x, height/2, 40,40);
}
