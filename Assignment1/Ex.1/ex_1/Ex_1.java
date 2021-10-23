package ex_1;
public class Ex_1
{
    public static void main(String[] args) 
    {
        TV tv_1 = new TV();
        tv_1.show_tv_details();
        System.out.println("_____________________________________");
        tv_1.Set_channel(200);
        System.out.println("_____________________________________");
        tv_1.Set_channel(120);
        System.out.println("_____________________________________");
        tv_1.Set_volume(10);
        System.out.println("_____________________________________");
        tv_1.Set_volume(7);
        System.out.println("_____________________________________");
        tv_1.Set_volume(5);
        System.out.println("_____________________________________");
        tv_1.Set_volume(1);
        System.out.println("_____________________________________");
        tv_1.Set_volume(0);
        System.out.println("_____________________________________");
        tv_1.Turn_on();
        System.out.println("_____________________________________");
        tv_1.Turn_off();
        System.out.println("_____________________________________");
        tv_1.volume_down();
        System.out.println("_____________________________________");
        tv_1.volume_up();
        System.out.println("_____________________________________");
        tv_1.volume_up();
        System.out.println("_____________________________________");
        tv_1.volume_down();
        System.out.println("_____________________________________");
        tv_1.Set_volume(7);
        System.out.println("_____________________________________");
        tv_1.volume_up();
        System.out.println("_____________________________________");
        tv_1.volume_down();
        System.out.println("_____________________________________");
        tv_1.show_tv_details();
        System.out.println("_____________________________________");
        
    }    
}
