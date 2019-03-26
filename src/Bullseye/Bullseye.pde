void setup(){
  size(500,500);
}

void draw(){
  int size = 500;
  for (int i=0; i<10; i++){
    
  ellipse(250,250,size,size);
  
  size -= 50;
  
  if (i % 2 == 0){
  
  fill(#FF0000);
  
  }else{
   fill(#000000);
  }
  }
}