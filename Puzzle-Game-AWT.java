import javax.swing.JFrame;
2 | import javax.swing.JLabel;
3 | import java.awt.FlowLayout;
4 | import javax.swing.JTextField;
5 | import javax.swing.ImageIcon;
6 | import java.awt.event.ActionListener;
7 | import java.awt.event.ActionEvent;
8 |
9 | public class OwlGreeting extends JFrame implements ActionListener{
10|    JLabel labelQuestion, labelGreeting;
11|    JTextField textAnswer;
12|    ImageIcon owl;
13|
14|    public OwlGreeting(){
15|      setLayout(new FlowLayout());
16|      labelQuestion = new JLabel("Whooooo's there?");
17|      textAnswer = new JTextField(10);
18|      labelGreeting = new JLabel();
19|      owl = new ImageIcon("animal39-2.png");
20|      textAnswer.addActionListener(this);
21|      add(labelQuestion);
22|      add(textAnswer);
23|      add(labelGreeting);
24|    }
25|
26|    public static void main(String args[]){
27|      OwlGreeting window = new OwlGreeting();
28|      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
29|      window.setSize(275, 100);
30|      window.setTitle("Owl Greeting");
31|      window.setVisible(true);
32|    }
33|
34|    public void actionPerformed(ActionEvent e){
35|      String name = textAnswer.getText();
36|      labelGreeting.setText("Hoot for " + name + "!");
37|      labelGreeting.setIcon(owl);
38|    }
39| }
