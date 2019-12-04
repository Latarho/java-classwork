import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListLab {
  public static void main(String[] args) {
    // if y'all used a real IDE then debugging would be a lot easier
    // just sayin', breakpoints are great
    ArrayList<String> a = new ArrayList<String>();
    insertUnsorted(5, a);
    printList(a); // Java should have implied semicolons on new lines, every modern language does
    insertSorted(5, a);
    printList(a);
    removeMultiples(a);
    printList(a);
  }

  static void insertUnsorted(int count, ArrayList<String> tgt) {
    for (int i = 0; i < count; i++) {
      tgt.add(JOptionPane.showInputDialog(null, "Input an element"));
    }
    JOptionPane.showMessageDialog(null, "Done");
  }

  static void insertSorted(int count, ArrayList<String> tgt) {
    // Get elements from the user
    for (int i = 0; i < count; i++) {
      tgt.add(JOptionPane.showInputDialog(null, "Input an element"));
    }
    // Sort the elements
    boolean dirty;
    dirty = true;
    do {
      dirty = false;
      for (int i = 0; i < tgt.size() - 1; i++) {
        if (tgt.get(i).compareTo(tgt.get(i + 1)) >= 1) {
          dirty = true;
          String tmp = tgt.get(i);
          tgt.set(i, tgt.get(i + 1));
          tgt.set(i + 1, tmp);
        }
      }
    } while (dirty);
    JOptionPane.showMessageDialog(null, "Done");
  }

  static void printList(ArrayList<String> tgt) {
    System.out.println("Start of element list");
    for (int i = 0; i < tgt.size(); i++) {
      System.out.println(tgt.get(i));
    }
    System.out.println("End of element list");
  }

  static void removeMultiples(ArrayList<String> tgt) {
    ArrayList<String> seen = new ArrayList<String>();
    for (int i = 0; i < tgt.size(); i++) {
      if (seen.indexOf(tgt.get(i)) == -1) {
        seen.add(tgt.get(i));
      } else {
        tgt.remove(i);
        i -= 1;
      }
    }
  }

}