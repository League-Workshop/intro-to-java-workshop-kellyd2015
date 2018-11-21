  int x = 216;
  int y = 268;
  int acceleration = 3;
  int xTwo = 366;
  int yTwo = 310;

void setup(){
  size(634,648);
  PImage catPic= loadImage("cat.jpg");
  background(catPic);
}
void draw (){
  if(mousePressed){
  println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

  noStroke();
  fill(236,48,136);
  ellipse(x, y, 50, 20);
  
  noStroke();
  fill(236,48,136);
  ellipse(xTwo, yTwo, 50, 20);
  if(keyPressed){
    y+=2*acceleration;
    x+=-2*acceleration;
    
    yTwo+=2*acceleration;
    xTwo+=-1.5*acceleration;

  }

}
void keyPressed() {
  x++;
  y--;
}