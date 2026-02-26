package Abstract_Factory_Pattern;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

@SuppressWarnings("unused")
public class Client {

	private JFrame frmCrafting;
	private static String material;
	private static String item;
	private static Fierarie fabricaAbstracta;
	Font fontMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frmCrafting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	private void initialize() {
		
		frmCrafting = new JFrame(); // creare obiect de tip JFrame
		frmCrafting.setTitle("Crafting...");
		frmCrafting.setResizable(false);
		frmCrafting.setBounds(100, 100, 1050, 600);
		frmCrafting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrafting.getContentPane().setLayout(null);
		
		JButton item_craft = new JButton("Craft Item"); // butonul de craft
		item_craft.setFont(new Font("Minecraft", Font.PLAIN, 25));
		item_craft.setBounds(64, 402, 287, 79);
		item_craft.setBackground(new Color(192, 192, 192));
		frmCrafting.getContentPane().add(item_craft);
		
		try { // exceptie pentru crearea unui obiect de tip Font
			fontMC = Font.createFont(Font.TRUETYPE_FONT, new File("src/Images/Minecraft.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(fontMC);
		} catch (FontFormatException e3) {
			e3.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		JLabel raresLbl = new JLabel("Rares-Stefan Lupu     1305B"); // label pentru nume dezvoltator1
		raresLbl.setForeground(new Color(192, 192, 192));
		raresLbl.setBounds(868, 527, 168, 25);
		raresLbl.setFont(new Font("Minecraft", Font.PLAIN, 11));
		frmCrafting.getContentPane().add(raresLbl);

		JLabel bejanLbl = new JLabel("Robert-Cristian Bejan"); // label pentru nume dezvoltator2
		bejanLbl.setForeground(new Color(192, 192, 192));
		bejanLbl.setBounds(868, 511, 168, 20);
		bejanLbl.setFont(new Font("Minecraft", Font.PLAIN, 11));
		frmCrafting.getContentPane().add(bejanLbl);

		JButton sword = new JButton( 
				new ImageIcon(new ImageIcon("src/Images/diamondsword.png").getImage().getScaledInstance(80, 80, 0))); // creare buton pentru 'sword'
		sword.setBackground(new Color(192, 192, 192));
		sword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = "sabie";
				item_craft.setEnabled(true);
			}
		});
		sword.setBounds(64, 242, 89, 86);
		frmCrafting.getContentPane().add(sword);

		JButton pickaxe = new JButton(""); // creare buton pentru 'pickaxe'
		pickaxe.setBackground(new Color(192, 192, 192));
		pickaxe.setIcon(
				new ImageIcon(new ImageIcon("src/Images/diamondpickaxe.png").getImage().getScaledInstance(80, 80, 0)));
		pickaxe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = "tarnacop";
				item_craft.setEnabled(true);
			}
		});
		pickaxe.setBounds(163, 242, 89, 86);
		frmCrafting.getContentPane().add(pickaxe);

		JButton axe = new JButton(""); // creare buton pentru 'axe'
		axe.setBackground(new Color(192, 192, 192));
		axe.setIcon(
				new ImageIcon(new ImageIcon("src/Images/diamondaxe.png").getImage().getScaledInstance(80, 80, 0)));
		axe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = "topor";
				item_craft.setEnabled(true);
			}
		});
		axe.setBounds(262, 242, 89, 86);
		frmCrafting.getContentPane().add(axe);

		JComboBox comboBox = new JComboBox(); // creare meniu de tip ComboBox
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "-Selectare material-", "Lemn", "Piatra", "Fier", "Aur", "Diamant" }));
		comboBox.setBounds(64, 111, 287, 27);
		frmCrafting.getContentPane().add(comboBox);
		comboBox.setFont(new Font("Minecraft", Font.PLAIN, 18));

		JLabel item_name = new JLabel(""); // label pentru afisarea numelui item-ului fabricat
		item_name.setForeground(new Color(192, 192, 192));
		item_name.setHorizontalAlignment(SwingConstants.CENTER);
		item_name.setBounds(575, 61, 370, 39);
		frmCrafting.getContentPane().add(item_name);
		item_name.setFont(new Font("Minecraft", Font.PLAIN, 30));
		
		JLabel item_crafted = new JLabel(""); // label pentru afisarea imaginii item-ului fabricat
		item_crafted.setBounds(575, 111, 370, 370);
		frmCrafting.getContentPane().add(item_crafted);
		item_crafted.setIcon(new ImageIcon("src/Images/diamondpickaxe-semn.png"));

		JLabel app_name = new JLabel("Crafting Workbench"); // label pentru afisarea numelui aplicatiei
		app_name.setForeground(new Color(192, 192, 192));
		app_name.setBounds(64, 36, 376, 39);
		frmCrafting.getContentPane().add(app_name);
		app_name.setFont(new Font("Minecraft", Font.PLAIN, 30));

		axe.setEnabled(false);
		pickaxe.setEnabled(false);
		sword.setEnabled(false);
		
				JLabel background = new JLabel(""); // label pentru background
				background.setIcon(new ImageIcon("src/Images/Dirt_background_BE1 (1).png"));
				background.setBounds(-15, -31, 1071, 615);
				frmCrafting.getContentPane().add(background);
		
		try {
			fabricaAbstracta = Selectare_Fabrica.selectare(material);
		} catch (Exception e1) {
			item_craft.setEnabled(false);
		}
		try {
			fabricaAbstracta.create(item);
		} catch (Exception e2) {
			item_craft.setEnabled(false);
		}

		item_craft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(item + " de " + material);
				if (item.equals("sabie")) {
					if (material.equals("Fier")) {
						item_crafted.setIcon(new ImageIcon("src/Images/ironsword.png"));
						item_name.setText("Iron Sword");
					} else if (material.equals("Aur")) {
						item_crafted.setIcon(new ImageIcon("src/Images/goldsword.png"));
						item_name.setText("Golden Sword");
					} else if (material.equals("Lemn")) {
						item_crafted.setIcon(new ImageIcon("src/Images/woodsword.png"));
						item_name.setText("Wooden Sword");
					} else if (material.equals("Diamant")) {
						item_crafted.setIcon(new ImageIcon("src/Images/diamondsword.png"));
						item_name.setText("Diamond Sword");
					} else if (material.equals("Piatra")) {
						item_crafted.setIcon(new ImageIcon("src/Images/stonesword.png"));
						item_name.setText("Stone Sword");
					}
				} else if (item.equals("topor")) {
					if (material.equals("Fier")) {
						item_crafted.setIcon(new ImageIcon("src/Images/ironaxe.png"));
						item_name.setText("Iron Axe");
					} else if (material.equals("Aur")) {
						item_crafted.setIcon(new ImageIcon("src/Images/goldaxe.png"));
						item_name.setText("Golden Axe");
					} else if (material.equals("Lemn")) {
						item_crafted.setIcon(new ImageIcon("src/Images/woodaxe.png"));
						item_name.setText("Wooden Axe");
					} else if (material.equals("Diamant")) {
						item_crafted.setIcon(new ImageIcon("src/Images/diamondaxe.png"));
						item_name.setText("Diamond Axe");
					} else if (material.equals("Piatra")) {
						item_crafted.setIcon(new ImageIcon("src/Images/stoneaxe.png"));
						item_name.setText("Stone Axe");
					}
				} else if (item.equals("tarnacop")) {
					if (material.equals("Fier")) {
						item_crafted.setIcon(new ImageIcon("src/Images/ironpickaxe.png"));
						item_name.setText("Iron Pickaxe");
					} else if (material.equals("Aur")) {
						item_crafted.setIcon(new ImageIcon("src/Images/goldpickaxe.png"));
						item_name.setText("Golden Pickaxe");
					} else if (material.equals("Lemn")) {
						item_crafted.setIcon(new ImageIcon("src/Images/woodpickaxe.png"));
						item_name.setText("Wooden Pickaxe");
					} else if (material.equals("Diamant")) {
						item_crafted.setIcon(new ImageIcon("src/Images/diamondpickaxe.png"));
						item_name.setText("Diamond Pickaxe");
					} else if (material.equals("Piatra")) {
						item_crafted.setIcon(new ImageIcon("src/Images/stonepickaxe.png"));
						item_name.setText("Stone Pickaxe");
					}
				}
			}
		});

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(comboBox.getSelectedItem());
					material = (String) comboBox.getSelectedItem();
					if(material == "-Selectare material-") { 
						material=null;
						axe.setEnabled(false);
						pickaxe.setEnabled(false);
						sword.setEnabled(false);
						item_craft.setEnabled(false);}//daca se selecteaza "-Selectare material-" dezactivam toate butoanele
					if (material != null) {
						axe.setEnabled(true);
						pickaxe.setEnabled(true);
						sword.setEnabled(true);
					
					if (material.equals("Fier")) {
						sword.setIcon(new ImageIcon(
								new ImageIcon("src/Images/ironsword.png").getImage().getScaledInstance(80, 80, 0)));
						pickaxe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/ironpickaxe.png").getImage().getScaledInstance(80, 80, 0)));
						axe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/ironaxe.png").getImage().getScaledInstance(80, 80, 0)));
					} else if (material.equals("Aur")) {
						sword.setIcon(new ImageIcon(
								new ImageIcon("src/Images/goldsword.png").getImage().getScaledInstance(80, 80, 0)));
						pickaxe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/goldpickaxe.png").getImage().getScaledInstance(80, 80, 0)));
						axe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/goldaxe.png").getImage().getScaledInstance(80, 80, 0)));
					} else if (material.equals("Lemn")) {
						sword.setIcon(new ImageIcon(
								new ImageIcon("src/Images/woodsword.png").getImage().getScaledInstance(80, 80, 0)));
						pickaxe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/woodpickaxe.png").getImage().getScaledInstance(80, 80, 0)));
						axe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/woodaxe.png").getImage().getScaledInstance(80, 80, 0)));
					} else if (material.equals("Diamant")) {
						sword.setIcon(new ImageIcon(
								new ImageIcon("src/Images/diamondsword.png").getImage().getScaledInstance(80, 80, 0)));
						pickaxe.setIcon(new ImageIcon(new ImageIcon("src/Images/diamondpickaxe.png").getImage()
								.getScaledInstance(80, 80, 0)));
						axe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/diamondaxe.png").getImage().getScaledInstance(80, 80, 0)));
					} else if (material.equals("Piatra")) {
						sword.setIcon(new ImageIcon(
								new ImageIcon("src/Images/stonesword.png").getImage().getScaledInstance(80, 80, 0)));
						pickaxe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/stonepickaxe.png").getImage().getScaledInstance(80, 80, 0)));
						axe.setIcon(new ImageIcon(
								new ImageIcon("src/Images/stoneaxe.png").getImage().getScaledInstance(80, 80, 0)));
					}
					}
				}
			}
		});
	}
}
