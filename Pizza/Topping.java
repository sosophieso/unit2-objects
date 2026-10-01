import greenfoot.*;

public class Topping extends Actor
{
    private String name;

    public Topping(String name)
    {
        this.name = name;
        setImage(name + ".png");
    }

    public void act()
    {
        fall();
    }

    public void fall()
    {
        setLocation(getX(), getY() + 2);

        if (getY() >= getWorld().getHeight() - 1)
        {
            int randomX = (int)(Math.random() * (getWorld().getWidth()));
            setLocation(randomX, 0);
        }
    }
}