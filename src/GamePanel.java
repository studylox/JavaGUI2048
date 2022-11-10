import javax.swing.*;
import java.awt.*;

//GamePanel主要用于写游戏主逻辑


//画笔，在该方法里面绘制背景板，块（待写）
public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏操作
        ImageData.background.paintIcon(this, g, 0, 0);//绘制背景板
    }
}
