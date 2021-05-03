int x1 = 800;
int x2 = 200;
int y = 250;
int speed = 1;
int x;
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1000,500);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();

 
}

void draw() {
  background(#D1CCCC);
 int size = 350;
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
  for (int i = 0; i < 7; i++) {
   ellipse(x1, y, size, size);
   size-=50;
  }
  
  size = 350;
  for (int j = 0; j<7; j++){
    ellipse(x2, y, size, size);
    size-=50;
  }
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
x1-=speed;
x2+=speed;
 
 //x= x+speed; 
     // x+speed;  
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
       
        if (x1-175<=0||x1+175>=1000){
          speed=-speed;
        }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
