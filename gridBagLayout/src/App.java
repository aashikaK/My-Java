import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
      JFrame f= new JFrame();
      GridBagLayout gb=new GridBagLayout();
      GridBagConstraints gbc= new GridBagConstraints();
      f.setLayout(gb);

      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.weightx=2;
      gbc.gridx=0;
      gbc.gridy=0;
      f.add(new JButton("button1"),gbc);

      gbc.gridx=1;
      gbc.gridy=0;
      f.add(new JButton("button2"),gbc);

      gbc.fill=GridBagConstraints.VERTICAL;
      gbc.weighty=2;
      gbc.gridx=0;
      gbc.gridy=1;
      f.add(new JButton("HI next row"),gbc);

      gbc.fill=GridBagConstraints.VERTICAL;
      gbc.gridx=1;
      gbc.gridy=1;
      f.add(new JButton("2ndrow2ndcol"),gbc);

      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=0;
      gbc.gridy=2;
      f.add(new JButton("2NDLAST"),gbc);

      gbc.fill=GridBagConstraints.HORIZONTAL;
      gbc.gridx=1;
      gbc.gridy=2;
      f.add(new JButton("LAST"),gbc);

      f.setSize(400,400);
      f.setPreferredSize(new Dimension(400,400));
      f.setVisible(true);
    }
}
