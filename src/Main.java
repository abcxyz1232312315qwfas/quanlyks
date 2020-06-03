
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import view.Show;



public class Main extends JFrame {

private JPanel contentPane;
private JDesktopPane desktopPane;
private JButton btnNewButton;
private Show m1; //The Frame to be added
/**
 * Launch the application.
 */
public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                Main frame = new Main();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}

/**
 * Create the frame.
 */
public Main() {
    initComponents();
    createEvents();
}
private void initComponents(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1706, 995);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);

    btnNewButton = new JButton("Analyze Single");


    desktopPane = new JDesktopPane();
    desktopPane.setBackground(SystemColor.window);
    GroupLayout gl_contentPane = new GroupLayout(contentPane);
    gl_contentPane.setHorizontalGroup(
        gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1597, GroupLayout.PREFERRED_SIZE))
            .addGroup(gl_contentPane.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewButton)
                .addContainerGap(1496, Short.MAX_VALUE))
    );
    gl_contentPane.setVerticalGroup(
        gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
                .addComponent(btnNewButton)
                .addGap(18)
                .addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
    );
    GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
    gl_desktopPane.setHorizontalGroup(
        gl_desktopPane.createParallelGroup(Alignment.LEADING)
            .addGap(0, 1597, Short.MAX_VALUE)
    );
    gl_desktopPane.setVerticalGroup(
        gl_desktopPane.createParallelGroup(Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
    );
    desktopPane.setLayout(gl_desktopPane);
    contentPane.setLayout(gl_contentPane);
}
private void createEvents(){
    btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            if(m1==null){
            m1 =  new Show();
            desktopPane.add(m1);

            }
        }

        
    });

}
}