import javax.swing.*;
import java.net.URL;


//ImageData里主要放置背景板和所有图块，把它们都转成图标ImageIcon，方便后期直接在Panel上用画笔绘制
public class ImageData {
    public static URL back=ImageData.class.getResource("background.png");
    public static ImageIcon background=new ImageIcon(back);

    public static URL block2=ImageData.class.getResource("block_2.png");
    public static ImageIcon block_2=new ImageIcon(block2);

    //4
    public static URL block4=ImageData.class.getResource("block_4.png");
    public static ImageIcon block_4=new ImageIcon(block4);
    //8
    public static URL block8=ImageData.class.getResource("block_8.png");
    public static ImageIcon block_8=new ImageIcon(block8);

    //16
    public static URL block16=ImageData.class.getResource("block_16.png");
    public static ImageIcon block_16=new ImageIcon(block16);

    //32
    public static URL block32=ImageData.class.getResource("block_32.png");
    public static ImageIcon block_32=new ImageIcon(block32);

    //64
    public static URL block64=ImageData.class.getResource("block_64.png");
    public static ImageIcon block_64=new ImageIcon(block64);

    //128
    public static URL block128=ImageData.class.getResource("block_128.png");
    public static ImageIcon block_128=new ImageIcon(block128);

    //256
    public static URL block256=ImageData.class.getResource("block_256.png");
    public static ImageIcon block_256=new ImageIcon(block256);

    //512
    public static URL block512=ImageData.class.getResource("block_512.png");
    public static ImageIcon block_512=new ImageIcon(block512);

    //1024
    public static URL block1024=ImageData.class.getResource("block_1024.png");
    public static ImageIcon block_1024=new ImageIcon(block1024);

    //2048
    public static URL block2048=ImageData.class.getResource("block_2048.png");
    public static ImageIcon block_2048=new ImageIcon(block2048);
}
