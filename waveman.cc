#include <stdio.h>
#include<stdlib.h>
#include "glut.h"

#ifdef __APPLE__
#include <OpenGL/gl.h>
#else
#include <GL/gl.h>
#endif
#ifdef __APPLE__
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif
#include <math.h>
int pID;
void drawCircle(float r1, float r2, float pos1, float pos2){
    glBegin(GL_TRIANGLE_FAN);
	for(int ii = 0; ii < 100; ii++) { 
		float theta = 2.0f * 3.1415926f * ii / 100;//get the current angle 
		float x = r1 * cosf(theta);//calculate the x component 
		float y = r2 * sinf(theta);//calculate the y component 
		glVertex2f(x + pos1, y + pos2);//output vertex 
    } 
	glEnd(); 
}

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
     glBegin(GL_TRIANGLES);
        glVertex3f(0, -.2, 0);
        glVertex3f(1, -0.2, 0);
        glVertex3f(0, 1, 0);
    glEnd();

    glBegin(GL_TRIANGLES);
        glVertex3f(0, .5, 0);
        glVertex3f(-.5, .5, 0);
        glVertex3f(0, 1, 0);
    glEnd();
    glBegin(GL_TRIANGLES);
        glVertex3f( -.1,.5, 0);
        glVertex3f(-.5, .5, 0);//stays the same
        glVertex3f(-.5, -.2, 0);
    glEnd();



    //draw Man
    glColor4f(1.0, 1.0, 0.0, 1.0); 
    drawCircle (.045, .06, -.2, .13);
    glLineWidth(2.5); 
    glColor4f(1.0, 1.0, 0.0, 1.0); 
    glBegin(GL_LINES);
    //body
    glVertex3f(-.2, .07, 0.0);
    glVertex3f(-.2, -.1, 0.0);

    glVertex3f(-.2, -.1, 0.0);
    glVertex3f(-.17, -.2, 0.0);

    glVertex3f(-.2, -.1, 0.0);
    glVertex3f(-.23, -.2, 0.0);


    glVertex3f(-.2, 0, 0.0);
    glVertex3f(-.17, .06, 0.0);

    glVertex3f(-.2, 0, 0.0);
    glVertex3f(-.23, .06, 0.0);


    //draw mouth
    glColor3f(0.0, 0.0, 0.0); 
    drawCircle (.03, .02, -.2, .13);

    glEnd();
    glutSwapBuffers();
    
}
void pressQ (unsigned char key, int xmouse, int ymouse){
    switch (key){
		case 'q':
			glutDestroyWindow (pID);
            exit (0);
            break;
    }
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE);
    glutInitWindowSize(800, 500);
    glutInitWindowPosition(100, 100);
    pID = glutCreateWindow("Wave Man");
    glutKeyboardFunc(pressQ);
    glutDisplayFunc(drawBack);
    glutMainLoop();
    return 0;
}
