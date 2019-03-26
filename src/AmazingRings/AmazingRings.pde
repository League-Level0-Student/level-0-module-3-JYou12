int speed1 = 10;
int speed2 = -10;
int x1 = 250;
int x2 = 750;



void setup() {
  size(1000, 1000);
}

void draw() {
x1 = x1 + speed1;
x2 = x2 + speed2;

  background(#D3D1D1);

  drawRing1(x1);
  drawRing2(x2);
  if (x1 > 1000) {
    speed1 = -10;
  } else if (x1 < 0){
    speed1 = 10;
  }

  if (x2 > 1000) {
    speed2 = -10;
  } else if (x2 < 0){
    speed2 = 10;
  }
}
//x1 250 x2 750
void drawRing1(int x1) {
  int size = 500;

  int y=500;
  x1 += 50;
  for (int i=0; i<10; i++) {

    ellipse(x1, y, size, size);


    size -= 50;


    if (i % 2 == 0) {

      fill(#000000);
    } else {
      fill(#D3D1D1);
    }
  }
  fill(#D3D1D1);
}

void drawRing2(int x2) {
  int size = 500;

  int y=500;
  x2 += 50;
  for (int i=0; i<10; i++) {


    ellipse(x2, y, size, size);

    size -= 50;


    if (i % 2 == 0) {

      fill(#000000);
    } else {
      fill(#D3D1D1);
    }
  }
  fill(#D3D1D1);
}