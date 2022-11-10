import javax.swing.*;


//Frame基本框架，用于设置游戏窗口的基本信息
public class MyFrame extends JFrame {
    public MyFrame()
    {
        this.add(new GamePanel());
        setBounds(200,200,506,534);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
