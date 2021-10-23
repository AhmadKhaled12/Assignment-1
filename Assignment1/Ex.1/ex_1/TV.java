package ex_1;
public class TV
{
    int channel;
    int volume_level;
    boolean on;
    public TV()
    {
        this.channel = 100;
        this.volume_level = 5;
        this.on = true;
    }
    public void Turn_on()
    {
        this.on = true;
        System.out.println("The TV is on.");
    }
    public void Turn_off()
    {
        this.on = false;
        System.out.println("The TV is off.");
    }
    public void Set_channel(int new_channel)
    {
        if (new_channel >= 1 && new_channel <= 120 )
        {
            this.channel = new_channel;
            System.out.println(new_channel);
        }
        else 
            System.out.println("The number of channel doesn't exist.");
    }
    public void Set_volume(int new_volume_level)
    {
        if (new_volume_level == 0)
            System.out.println("The sound is off.");
        if (new_volume_level >= 1 || new_volume_level <= 7)
        {
            if(new_volume_level == 7)
            {
                this.volume_level = new_volume_level;
                System.out.println("The sound is max.");
            }
            if (this.volume_level == 1)
            {
                new_volume_level = this.volume_level;
                System.out.println("The sound is minimum.");
            }
            else
            {
                new_volume_level = this.volume_level;
            }
            System.out.println(new_volume_level);
        }
        else
            System.out.println("The volume level is out of range");
    }
    public void channel_up()
    {
        if(this.channel < 120)
            System.out.println(this.channel ++);
        else 
            System.out.println("The channel doesn't exist.");
    }
    public void channel_down()
    {
        if(this.channel > 1)
            System.out.println(this.channel --);
        else 
            System.out.println("The channel doesn't exist.");
    }
    public void volume_up()
    {
        if (this.volume_level< 7)
            System.out.println(this.volume_level++);
        else 
            System.out.println("The voice is max.");
    }
    public void volume_down()
    {
        if (this.volume_level >= 1)
        {
            System.out.println(this.channel --);
            
            if (this.volume_level == 1)
                System.out.println("The sound is minimum.");
        }
        else
            System.out.println("The sound is off.");
    }
    public void show_tv_details()
    {
        if (this.on == true)
            System.out.println("The TV is on.");
        else
            System.out.println("The TV is off.");        
        System.out.println("The channel: " + this.channel);
        System.out.println("The volume level: " + this.volume_level);

    }
}
