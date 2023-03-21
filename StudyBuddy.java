/*Team Name: C.A.R.D
Members = Caitlin, David, Adam T, Ryan, Conner
Name of app = StudyBuddy
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudyBuddy {
    private JPanel Background;
    private JPanel Welcome;
    private JButton continueBtn;
    private JTextPane welcomeTxtPane;
    private JPanel Name;
    private JButton backBtnName;
    private JButton NextBtnName;
    private JLabel nameLbl;
    private JTextField forenameTxtField;
    private JTextField surnameTxtField;
    private JPanel DigitalSkillsSoftwareDev;
    private JLabel DigitalSkillsSoftwareLbl;
    private JLabel DigitalSkillsSoftwarePracticalLbl;
    private JButton NextBtnDigSkillsSoftware;
    private JButton backBtnDigSkillsSoftware;
    private JPanel DigitalSkillsCyber;
    private JComboBox DigSkillsSoftwareDevTheory;
    private JComboBox DigSkillsSoftwareDevPrac;
    private JComboBox DigSkillsCyberGrade;
    private JButton BackBtnCyber;
    private JButton NextBtnCyber;
    private JPanel DigSkillsDataScience;
    private JComboBox DigSkillsDataGrade;
    private JLabel DigSkillsDataLbl;
    private JPanel IoT;
    private JPanel NetworkInfrastructure;
    private JPanel ComputerScience;
    private JPanel CloudComputing;
    private JPanel SoftwareDevelopment;
    private JPanel ProfessionalPractice;
    private JPanel Results;
    private JComboBox compSciGrade;
    private JButton compSciNextButton;
    private JButton compSciBackButton;
    private JComboBox networkTheory;
    private JComboBox networkPractical;
    private JButton networkNextButton;
    private JButton networkBackButton;
    private JButton BackBtnData;
    private JButton NextBtnData;
    private JButton backButtonIoT;
    private JButton nextButtonIoT;
    private JComboBox iotPracticalGrade;
    private JComboBox iotTheoryGrade;
    private JLabel iotPracticalLabel;
    private JLabel iotTheoryLabel;
    private JComboBox SoftDevTheoryGrade;
    private JComboBox SoftDevPracticalGrade;
    private JButton BackBtnSoftDev;
    private JButton NextBtnSoftDev;
    private JComboBox CloudComputingGrade;
    private JButton NextBtnCloud;
    private JButton BackBtnCloud;
    private JButton BackBtnProfPractice;
    private JButton NextBtnProfPractice;
    private JTextPane WelcomeTxtPane;
    private JTextPane ResultsTxtPane;
    private JButton confirmBtnName;
    private JLabel fullNameLbl;
    private JLabel testLbl;
    private JLabel totalDigSkillsSoftware;
    private JLabel DigSkillsSoftwareDevScoreLbl;
    private JButton confirmBtn;
    private JButton confirmBtnDSCS;
    private JLabel dscsLbl;
    private JButton confirmBtnDigSkillsSoftware;
    private JComboBox ProPractGrade;
    private JButton backBtnResults;
    private JPanel DigitalSkillsComputerScience;
    private JButton nextBtnDigSkillsCompSci;
    private JButton backBtnDigSkillsCompSci;
    private JButton confirmBtnDigSkillsCompSci;
    private JComboBox DigSkillsCompSciGrade;
    private JLabel DigSkillsCompSciLbl;
    private JLabel NetworkLbl;
    private JButton confirmBtnNetworkInfrastructure;
    private JButton confirmBtnDataScience;
    private JButton confirmBtnIoT;
    private JLabel IotLbl;
    private JLabel DataLbl;
    private JButton confirmBtnComputerScience;
    private JButton confirmBtnCloudComputing;
    private JButton confirmBtnProfessionalPractice;
    private JButton confirmBtnSoftwareDevelopment;
    private JLabel compSciLbl;
    private JLabel cloudCompLbl;
    private JLabel softDevLbl;
    private JLabel ProfPracticeLbl;
    public String surname;
    public String forename;
    public int total;

    /*
    main method
    displays the frame with name of Study Buddy
    sets background for Study Buddy
    sets exit on close
    packs frames
    sets frame to visible
     */
    public static void main(String[] args) {
        // create new jFrame
        JFrame frame = new JFrame("Study Buddy");
        // set the jFrame to contain the GUI
        frame.setContentPane(new StudyBuddy().Background);
        // set exit on close, pack components and make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    // action listener for continue button, takes user to Name panel
    public StudyBuddy() {
        //Takes the user onto the Age page when clicked
        continueBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // removes previous panel, adds next panel, repaints and revalidates panels
            Background.removeAll();
            Background.add(Name);
            Background.repaint();
            Background.revalidate();

        }
    });


        //Confirms and displays the users full name.
        confirmBtnName.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                //Asks the user to input forename
            forename = forenameTxtField.getText();
                //Asks the user to input surname
            surname = surnameTxtField.getText();

            //Puts the full name together and displays it on the full name label
            fullNameLbl.setText(forename + " " + surname);
            }
        });


    // action listener for back button, takes user back to Welcome panel
        backBtnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Welcome);
                Background.repaint();
                Background.revalidate();
            }
        });


        // next button to digital skills soft dev panel
        NextBtnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();
            }
        });


        // back button to Name panel
        backBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Name);
                Background.repaint();
                Background.revalidate();
            }
        });


        //Confirms the users input, finds which number the input would equal and adds it to a total
        confirmBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Initialise DigSkillsSoftwareDevScore as an integer with value 0
                int DigSkillsSoftwareDevScore = 0;

                /*Checks to see if the Digital Skills: Software Development Theory grade = "Pass."
                 Adds 3 to total if Digital Skills: Software Development Theory grade = "Pass."
                 */
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass."){
                    DigSkillsSoftwareDevScore += 3;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 Adds 2 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)"){
                    DigSkillsSoftwareDevScore +=  2;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)"){
                    DigSkillsSoftwareDevScore += 1;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 3)"
                 Adds 0 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore +=0;
                }

                /*Checks to see if the Digital Skills: Software Development Practical grade = "Pass."
                 Adds 3 to total if Digital Skills: Software Development Practical grade = "Pass."
                 */
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass."){
                    DigSkillsSoftwareDevScore += 3;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 Adds 2 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)"){
                    DigSkillsSoftwareDevScore +=  2;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)"){
                    DigSkillsSoftwareDevScore += 1;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 Adds 0 to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsSoftwareDevScore += 0;
                }

                //Updates total and displays Digital Skills: Software Development total
                total = total + DigSkillsSoftwareDevScore;
                DigSkillsSoftwareDevScoreLbl.setText(String.valueOf(DigSkillsSoftwareDevScore));
            }
        });


        // next button to digital skills cyber
        NextBtnDigSkillsSoftware.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();

            }
        });


        // back button to software dev
        BackBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsSoftwareDev);
                Background.repaint();
                Background.revalidate();

                /*Checks to see if the Digital Skills: Software Development Theory grade = "Pass."
                 Subtracts 3 to total if Digital Skills: Software Development Theory grade = "Pass."
                 */
                if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Pass."){
                    total = total - 3;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 Subtracts 2 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }
                /*Checks to see if the Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 Subtracts 1 to total if Digital Skills: Software Development Theory grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevTheory.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }

                /*Checks to see if the Digital Skills: Software Development Practical grade = "Pass."
                 Subtracts 3  to total if Digital Skills: Software Development Practical grade = "Pass."
                 */
                if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Pass."){
                    total = total - 3;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 Subtracts 2  to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }
                /*Checks to see if the Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 Subtracts 1  to total if Digital Skills: Software Development Practical grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsSoftwareDevPrac.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
            }
        });


        //Confirms the users input, finds which number the input would equal and adds it to a total
        confirmBtnDSCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int DigSkillsCyberSecure = 0;

                /*Checks to see if the Digital Skills: Cyber Security grade = "Pass."
                 Adds 3  to total if Digital Skills: Cyber Security grade = "Pass."
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass."){
                    DigSkillsCyberSecure += 3;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 Adds 2  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    DigSkillsCyberSecure +=  2;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 Adds 1 to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    DigSkillsCyberSecure += 1;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 3)"
                 Adds 0  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCyberSecure += 0;
                }

                //Updates total and displays Digital Skills: Cyber Security total
                total = total + DigSkillsCyberSecure;
                dscsLbl.setText(String.valueOf(DigSkillsCyberSecure));


            }
        });
        // next button to data sci
        NextBtnCyber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();

            }
        });


        backBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsCyber);
                Background.repaint();
                Background.revalidate();

                /*Checks to see if the Digital Skills: Cyber Security grade = "Pass."
                 Subtracts 3 to total if Digital Skills: Cyber Security grade = "Pass."
                 */
                if (DigSkillsCyberGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 Subtracts 2 to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }
                /*Checks to see if the Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 Subtracts 1 to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCyberGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                }

            }
        });


        confirmBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int DigSkillsCompSci = 0;

                /*Checks to see if the Digital Skills: Computer Science = "Pass."
                 Adds 3  to total if Digital Skills: Computer Science grade = "Pass."
                 */
                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass."){
                    DigSkillsCompSci += 3;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 1)"
                 Adds 2  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    DigSkillsCompSci +=  2;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 2)"
                 Adds 1  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    DigSkillsCompSci += 1;
                }
                /*Checks to see if the Digital Skills: Computer Science = "Fail. (Attempt 3)"
                 Adds 0  to total if Digital Skills: Computer Science grade = "Fail. (Attempt 3)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    DigSkillsCompSci += 0;
                }

                //Updates total and displays Digital Skills: Computing Science total
                total = total + DigSkillsCompSci;
                DigSkillsCompSciLbl.setText(String.valueOf(DigSkillsCompSci));
            }
        });
        nextBtnDigSkillsCompSci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();
            }
        });
        //David's work

        // back btn to cyber
        BackBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigitalSkillsComputerScience);
                Background.repaint();
                Background.revalidate();


                /*Checks to see if the Digital Skills: Cyber Security = "Pass"
                 Subtracts 3  to total if Digital Skills: Cyber Security grade = "Pass."
                 */
                if (DigSkillsCompSciGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }
                /*Checks to see if the Digital Skills: Cyber = "Fail. (Attempt 1)"
                 Subtracts 2  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 1)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }
                /*Checks to see if the Digital Skills: Cyber = "Fail. (Attempt 2)"
                 Subtracts 1  to total if Digital Skills: Cyber Security grade = "Fail. (Attempt 2)"
                 */
                else if (DigSkillsCompSciGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }

            }
        });
        //David's work

        confirmBtnDataScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int total2 = 0;

                if (DigSkillsDataGrade.getSelectedItem() == "Pass."){
                    total2 = total2 + 3;
                }else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total2 = total2 + 2;
                }else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total2 = total2 + 1;
                }
                DataLbl.setText(String.valueOf(total2));
                total = total + total2;

            }
        });

        // next btn to IoT
        NextBtnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();
            }
        });
        //Adam's work

        // back btn to data sci
        backButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(DigSkillsDataScience);
                Background.repaint();
                Background.revalidate();

                if (DigSkillsDataGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (DigSkillsDataGrade.getSelectedItem() == "Fail. (Attempt 2)") {
                    total = total - 1;
                }

            }
        });



        // Connor's Work

        confirmBtnIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int Total3 = 0;

                if (iotTheoryGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 +=0;

                }
                if (iotPracticalGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                IotLbl.setText(String.valueOf(Total3));
            }
        });

        //Adam's work

        // next btn to network infra
        nextButtonIoT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();




            }
        });
        //Caitlin's work

        // back btn to IoT
        networkBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(IoT);
                Background.repaint();
                Background.revalidate();


                if (iotPracticalGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (iotPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
                if (iotTheoryGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (iotTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
            }
        });
        //Caitlin's work
        confirmBtnNetworkInfrastructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;

                if (networkTheory.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (networkTheory.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 +=0;

                }
                if (networkPractical.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (networkPractical.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                NetworkLbl.setText(String.valueOf(Total3));
            }
        });
        // next btn to comp sci
        networkNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ComputerScience);
                Background.repaint();
                Background.revalidate();
            }
        });
        //Caitlin's work

        // back btn to network infra
        compSciBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(NetworkInfrastructure);
                Background.repaint();
                Background.revalidate();

                if (networkPractical.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (networkPractical.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (networkPractical.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
                if (networkTheory.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (networkTheory.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (networkTheory.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }

            }//
        });
        //Caitlin's work
        confirmBtnComputerScience.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;


                if (compSciGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                compSciLbl.setText(String.valueOf(Total3));

            }
        });

        // next btn to cloud comp
        compSciNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();
            }
        });
        //Ryan's work

        // back btn to comp sci
        BackBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        Background.removeAll();
                        Background.add(ComputerScience);
                        Background.repaint();
                        Background.revalidate();

                if (compSciGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (compSciGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }

            }
        });
        //Ryan's work

        // next btn to soft dev
        NextBtnCloud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();
            }
        });//
        //Ryan's work
        confirmBtnCloudComputing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;
                if (CloudComputingGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;
                }
                total = total + Total3;
                cloudCompLbl.setText(String.valueOf(Total3));
            }
        });
        // back btn to cloud comp
        BackBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(CloudComputing);
                Background.repaint();
                Background.revalidate();

                if (CloudComputingGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
                if (CloudComputingGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (CloudComputingGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
            }
        });
        //Ryan's work
        confirmBtnSoftwareDevelopment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;

                if (SoftDevTheoryGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 +=0;

                }
                if (SoftDevPracticalGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                softDevLbl.setText(String.valueOf(Total3));
            }
        });
        // next btn to pro practice
        NextBtnSoftDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(ProfessionalPractice);
                Background.repaint();
                Background.revalidate();
            }
        });

        // back btn to software dev
        BackBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(SoftwareDevelopment);
                Background.repaint();
                Background.revalidate();

                if (SoftDevPracticalGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (SoftDevPracticalGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
                if (SoftDevTheoryGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (SoftDevTheoryGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
            }
        });
        confirmBtnProfessionalPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Total3 = 0;

                if (ProPractGrade.getSelectedItem() == "Pass."){
                    Total3 += 3;

                }else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    Total3 +=  2;

                }else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    Total3 += 1;

                }else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 3)") {
                    Total3 += 0;

                }
                total = total + Total3;
                ProfPracticeLbl.setText(String.valueOf(Total3));
            }
        });
        // next btn to results
        NextBtnProfPractice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Background.removeAll();
                Background.add(Results);
                Background.repaint();
                Background.revalidate();

                String fullName = (forename + " " + surname);
                String digSkillsSoftwareDevTheoryInput = (String) DigSkillsSoftwareDevTheory.getSelectedItem();
                String digSkillsSoftwareDevPracInput = (String) DigSkillsSoftwareDevPrac.getSelectedItem();
                String digSkillsCyberInput = (String) DigSkillsCyberGrade.getSelectedItem();
                String digSkillsCompSciInput = (String) DigSkillsCompSciGrade.getSelectedItem();
                String digSkillsDataSciInput = (String) DigSkillsDataGrade.getSelectedItem();
                String IoTTheoryInput = (String) iotTheoryGrade.getSelectedItem();
                String IoTPracticalInput = (String) iotPracticalGrade.getSelectedItem();
                String networkTheoryInput = (String) networkTheory.getSelectedItem();
                String networkPracticalInput = (String) networkPractical.getSelectedItem();
                String compSciInput = (String) compSciGrade.getSelectedItem();
                String cloudCompInput = (String) CloudComputingGrade.getSelectedItem();
                String softwareDevTheoryInput = (String) SoftDevTheoryGrade.getSelectedItem();
                String softwareDevPracInput = (String) SoftDevPracticalGrade.getSelectedItem();
                String professionalPracticeInput = (String) ProPractGrade.getSelectedItem();

                ResultsTxtPane.setText(fullName + "\n" +
                                      "Your grades are;\n" +
                                      "Digital Skills: Software Development Theory                  -   " + digSkillsSoftwareDevTheoryInput + "\n" +
                                      "Digital Skills: Software Development Practical               -   " + digSkillsSoftwareDevPracInput + "\n" +
                                      "Digital Skills: Cyber Security                                               -   " + digSkillsCyberInput + "\n" +
                                      "Digital Skills: Computer Science                                       -   " + digSkillsCompSciInput + "\n" +
                                      "Internet of Things Theory                                                     -   " + IoTTheoryInput + "\n" +
                                      "Internet of Things Practical                                                  -   " + IoTPracticalInput + "\n" +
                                      "Network Infrastructure Theory                                             -   " + networkTheoryInput + "\n" +
                                      "Network Infrastructure Practical                                          -   " + networkPracticalInput + "\n" +
                                      "Computer Science                                                                 -   " + compSciInput + "\n" +
                                      "Cloud Computing                                                                   -   " + cloudCompInput + "\n" +
                                      "Software Development Theory                                             -   " + softwareDevTheoryInput + "\n" +
                                      "Software Development Practical                                          -   " + softwareDevPracInput + "\n" +
                                      "Professional Practice                                                             -   " + professionalPracticeInput + "\n");
            }
        });


        backBtnResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ProPractGrade.getSelectedItem() == "Pass."){
                    total = total - 3;
                }else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 1)"){
                    total = total - 2;
                }else if (ProPractGrade.getSelectedItem() == "Fail. (Attempt 2)"){
                    total = total - 1;
                }
            }
        });





    }
}