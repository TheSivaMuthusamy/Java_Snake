/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snake;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Siva
 */
public class Apple {
    private int x, y, score;
    private Snakep snake;
    
    public Apple(Snakep s) {
        x = (int)(Math.random() * 394);
        y = (int)(Math.random() * 394);
        snake = s; 
    }
    
    public void changePosition() {
       x = (int)(Math.random() * 394);
       y = (int)(Math.random() * 394); 
    }
    
    public int getScore() {
        return score;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 7, 7);
    }
    
    public boolean snakeCollision() {
    
        int snakeX = snake.getX() + 2;
        int snakeY = snake.getY() + 2;
        if (snakeX >= x-1 && snakeX <= (x+8))
            if (snakeY >= y-1 && snakeY <= (y+8)) {
                changePosition();
                score++;
                snake.setElongate(true);
                return true;
            }
        return false;
    }

    
    
}
