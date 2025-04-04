package application;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Creature {
private int x, y; // Position of the creature
private boolean isVisible; // Whether the creature is currently visible
private String type; // "bunny" or "snake"
private Image image; // Image representing the creature

public Creature(String type, int startX, int startY) {
this.type = type;
this.x = startX;
this.y = startY;
this.isVisible = false; // Initially not visible

// Load the appropriate image based on the type
if (type.equals("bunny")) {
image = new ImageIcon("bunny.png").getImage();
} else if (type.equals("snake")) {
image = new ImageIcon("snake.png").getImage();
}
}

// Make the creature appear
public void appear() {
isVisible = true;
}

// Make the creature disappear
public void disappear() {
isVisible = false;
}

// Check if the creature is visible
public boolean isVisible() {
return isVisible;
}

// Handle when the creature is clicked
public int onClick() {
if (!isVisible) return 0; // Clicking an invisible creature does nothing

disappear(); // Creature disappears when clicked

if (type.equals("bunny")) {
return 10; // Bunny gives +10 points
} else if (type.equals("snake")) {
return -5; // Snake deducts -5 points
}
return 0;
}

// Get the creature's X position
public int getX() {
return x;
}

// Get the creature's Y position
public int getY() {
return y;
}

// Get the image associated with the creature
public Image getImage() {
return image;
}

// Get the type of the creature
public String getType() {
return type;
}
}
