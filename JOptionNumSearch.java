import javax.swing.*;

public class JOptionNumSearch {
  public static void main (String[] arg) {
        int [] num = new int [5];
        int i = 0;
        String inpt, srch, mssg="";
        int index = i;

        for (i = 0; i <=4; i++) {
            inpt = JOptionPane.showInputDialog("Enter Integer Number for Index" + i);
            num[i] = Integer.parseInt(inpt);

        }

        srch = JOptionPane.showInputDialog("Enter Search Number: " );

        for (i = 0; i <= 4; i++) {
            if (num[i] == Integer.parseInt(srch)) {
                index  = i;
                mssg = "Found at Index" + index;
                break;

            }
            else {
                mssg = "Not Found";
            }
        }
        JOptionPane.showMessageDialog(null, mssg, "Search", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}