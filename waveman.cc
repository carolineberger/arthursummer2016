
#include "glut.h"
void drawBack()
{   
     glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
     //sand
     glColor3f(1.0f, 0.8f, 0.0f);
     glRectf(-1.0f,-0.2f, 1.0f, -1.0f);

     //sky
     glColor3f(0.0f, 0.4f, 0.7f);
     glRectf(-1.0f,-0.2f, 1.0f, 1.0f);


     //water
     glColor3f(0.0f, 0.0f, 1.0f);
     glRectf(0.0f, -0.2f, 1.0f, -1.0f);

     //easier way of doing a triangle?
     GLfloat vertices[] = {
     0.0f, -0.2f, 0.0f,
     0.0f, -0.3f, 0.0f,
     -0.2f,  -0.2f, 0.0f
};  

     glEnd();
     glutSwapBuffers();
    
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE);
    glutInitWindowSize(800, 500);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Wave Man");
    glutDisplayFunc(drawBack);
    glutMainLoop();
    return 0;
}