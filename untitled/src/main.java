package MYdefault;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
 class actionLisner{
	public String result; 
	private int []indexOF(char[] a){
		 int razm=1,k=0;
		int index[] = new int[razm];
		index[0]=0;
		for(int i = 0 ; i<a.length ; i++){
			if(a[i]==','||a[i]==':'||a[i]==';'||a[i]==' '||a[i]=='.'||a[i]=='\0'){
				razm++;
				int[]ind =index;
				index = new int[razm];
				k++;
				for(int dinamic=0 ; dinamic < razm-1 ; dinamic++)
				index[dinamic]=ind[dinamic];
				index[k]=i+1;
			}
			else if(a[i]=='\n'){
				razm++;
				int[]ind =index;
				index = new int[razm];
				k++;
				for(int dinamic=0 ; dinamic < razm-1 ; dinamic++)
				index[dinamic]=ind[dinamic];
				index[k]=i+1;
				break;
			}
		}
		 return index;
	 }
	private void promegutok(String []sort){
			int index[] = new int[sort.length-1];
			for(int i = 0 ; i<sort.length-1 ; i++)
				index[i]=i;
			for(int i = 0 ; i<sort.length-1 ; i++){
				for(int j = i+1 ; j<sort.length-1 ; j++)
				if(sort[i].length()-1>sort[j].length()-1){
					String prom = sort[i];
					sort[i]=sort[j];
					sort[j]=prom;
				}	
			}
			result=sort[0];
			for(int i = 1 ; i<sort.length-1 ; i++)
				result+=sort[i];
	 }
	private void sort(int []index,String text){
		 String []sortMasive = new String[index.length];
		 for(int i = 0 ; i < index.length-1 ; i++){
			 sortMasive[i]=text.substring(index[i], index[i+1]);
		 }
		promegutok(sortMasive);
	 }
	actionLisner(String text){
		sort(indexOF(text.toCharArray()), text);
	}
}
public class MAIN extends JFrame {
	static boolean flag=false;
	class TEXTFIELD extends JTextField{
		TEXTFIELD(int i,int number){
			super(i);
			super.setBackground(Color.cyan);
				super.setText("������� ����� � ���� ����� "+number);
				super.addMouseListener(new MouseAdapter(){
		            @Override
		            public void mouseClicked(MouseEvent e){
		                setText("");
		                flag=true;
		            }
		        });
		}
	}
	class Radion extends JRadioButton{
		Radion(int name){
			super("������� ���� "+name);
			super.setBackground(Color.MAGENTA);
			super.setEnabled(false);
		}
	}
	JRadioButton r1 = new Radion(1);
	JRadioButton r2 = new Radion(2);
	JTextField pole1=new TEXTFIELD(120,1);
	JTextField pole2=new TEXTFIELD(120,2);
	
	class BUTTON extends JButton{
	BUTTON(String name){
		super(name);
		JPopupMenu popup = new JPopupMenu();
		JMenuItem menuItem2 = new JMenuItem("���� ����� ����������� �� ������ ��������� ���� ������� ������� ������ ����������");
		JMenuItem menuItem = new JMenuItem("depending on the text displayed on the button varies its function \nif the button inscription masive(processing)\nelse clear(depending on the checked RadioButton, the cleaning fields)");
		JMenuItem menuItem1 = new JMenuItem("[translete]\n\n� ����������� �� ������� �� ������ ������� �� ������� \n���� �� ������ ������� masive(���� ���������)\n����� clear(�� � ����������� �� ����������� RadioButton ������������ ������� �����)");
		menuItem2.setBackground(Color.RED);
		menuItem.setBackground(Color.YELLOW);
		menuItem1.setBackground(Color.GREEN);
		popup.add(menuItem2);
		popup.add(menuItem);
		popup.add(menuItem1);
		super.setComponentPopupMenu(popup);
		super.setBackground(Color.PINK);	
		 super.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            	 	String name = getText();
            	 if(name=="masiv"){
            		 if(flag){
            		 pole2.setText(new actionLisner(pole1.getText()+'\n').result);
            		 setText("clear");
            		 pole1.setBackground(Color.green);
            		 pole2.setBackground(Color.green);
            		 pole2.setEnabled(true);
            		 }
            		 else{
            			 setBackground(Color.red);
            			 pole1.setText(JOptionPane.showInputDialog("no readeng text PLEASE\n write text in pole1"));
            			 flag = true ;
            			 setBackground(Color.pink);
            		 }
            		 r1.setEnabled(true);
            		 r2.setEnabled(true);
            	 }
            	 else{
            		 if(r1.isSelected()&&!r2.isSelected()){
            			 pole1.setText(""); 
            			 flag = false;
            			 pole1.setBackground(Color.red);
            		 }
            		
            		 else if(r2.isSelected()&&!r1.isSelected()){
            			pole2.setText(""); 
            			pole2.setBackground(Color.red);
            		 }
            		 
            		 else if(r2.isSelected()&&r1.isSelected()){
                		 pole2.setText("");
                		 pole1.setText("");
                		 pole1.setBackground(Color.CYAN);
                		 pole2.setBackground(Color.CYAN);
                		 flag = false;
            		 }
            		 setText("masiv");
            		 pole2.setEnabled(false);
            		 pole2.setBackground(Color.LIGHT_GRAY);
            	 }
             }
        });
	}
}
public MAIN(String name){
	super(name);
	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	super.setSize(getMaximumSize());
	 JPanel p = new JPanel(new FlowLayout()); 
     super.add(p);
     p.add(new BUTTON("masiv"));
	 p.add(r1);
	 p.add(r2);
	 p.add(pole1);
	 p.add(pole2);
	 pole2.setEnabled(false);
	 pole2.setBackground(Color.LIGHT_GRAY);
	 p.setBackground(Color.MAGENTA);
	 super.isResizable();
	 super.setResizable(false);
	 super.setVisible(true);
	
}
	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
             new MAIN("proga 8");
             }
        });
   }
	}

