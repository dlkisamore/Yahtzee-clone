package yahtzee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;
import java.io.*;

public class YahtzeeGUI extends JFrame {
	//GUI element declaration
	//BUTTONS
    private JButton acesButton = new JButton();
	private JButton twosButton = new JButton();
    private JButton threesButton = new JButton();
    private JButton foursButton = new JButton();
    private JButton fivesButton = new JButton();
    private JButton sixesButton = new JButton();
    private JButton threeOfAKindButton = new JButton();
    private JButton fourOfAKindButton = new JButton();
    private JButton fullHouseButton = new JButton();
    private JButton smStraightButton = new JButton();
    private JButton lgStraightButton = new JButton();
    private JButton yahtzeeButton = new JButton();
    private JButton chanceButton = new JButton();
	private JButton yahtzeeBonusButton = new JButton();
    private JButton rollButton = new JButton();
    //LABELS
	private JLabel playerLabel = new JLabel();
	private JLabel upperSectionLabel = new JLabel();
    private JLabel guideHowLabel = new JLabel();
    private JLabel guideScoreLabel = new JLabel();
    private JLabel acesLabel = new JLabel();
	private JLabel acesHowLabel = new JLabel();
    private JLabel twosLabel = new JLabel();
    private JLabel twosHowLabel = new JLabel();
    private JLabel threesLabel = new JLabel();
    private JLabel threesHowLabel = new JLabel();
    private JLabel foursLabel = new JLabel();
    private JLabel foursHowLabel = new JLabel();
    private JLabel fivesLabel = new JLabel();
    private JLabel fivesHowLabel = new JLabel();
    private JLabel sixesLabel = new JLabel();
    private JLabel sixesHowLabel = new JLabel();
    private JLabel topTotalLabel = new JLabel();
    private JLabel topFirstArrowLabel = new JLabel();
    private JLabel topTotalScoreLabel = new JLabel();
    private JLabel topBonusLabel = new JLabel();
    private JLabel topBonusHowLabel = new JLabel();
    private JLabel topBonusScoreLabel = new JLabel();
    private JLabel topTotalUpperLabel = new JLabel();
    private JLabel topSecondArrowLabel = new JLabel();
    private JLabel topTotalUpperScoreLabel = new JLabel();
    private JLabel lowerSectionLabel = new JLabel();
    private JLabel threeOfAKindLabel = new JLabel();
    private JLabel threeOfAKindHowLabel = new JLabel();
    private JLabel fourOfAKindLabel = new JLabel();
    private JLabel fourOfAKindHowLabel = new JLabel();
    private JLabel fullHouseLabel = new JLabel();
    private JLabel fullHouseHowLabel = new JLabel();
    private JLabel smStraightLabel = new JLabel();
    private JLabel smStraightHowLabel = new JLabel();
    private JLabel lgStraightLabel = new JLabel();
    private JLabel lgStraightHowLabel = new JLabel();
    private JLabel yahtzeeLabel = new JLabel();
    private JLabel yahtzeeHowLabel = new JLabel();
    private JLabel chanceLabel = new JLabel();
    private JLabel chanceHowLabel = new JLabel();
    private JLabel yahtzeeBonusLabel = new JLabel();
    private JLabel yahtzeeHow1Label = new JLabel();
    private JLabel yahtzeeHow2Label = new JLabel();
	private JLabel yahtzeeBonusScoreLabel = new JLabel();
    private JLabel bottomTotalLowerLabel = new JLabel();
    private JLabel bottomFirstArrowLabel = new JLabel();
    private JLabel bottomLowerScoreLabel = new JLabel();
    private JLabel bottomTotalUpperLabel = new JLabel();
    private JLabel bottomSecondArrowLabel = new JLabel();
    private JLabel bottomUpperScoreLabel = new JLabel();
    private JLabel bottomTotalLabel = new JLabel();
    private JLabel bottomThirdArrowLabel = new JLabel();
	private JLabel bottomTotalScoreLabel = new JLabel();
    //TOGGLE BUTTONS
    private JToggleButton dieOneToggleButton = new JToggleButton();
    private JToggleButton dieTwoToggleButton = new JToggleButton();
    private JToggleButton dieThreeToggleButton = new JToggleButton();
    private JToggleButton dieFourToggleButton = new JToggleButton();
    private JToggleButton dieFiveToggleButton = new JToggleButton();
	
    public YahtzeeGUI() {
		setResizable(false);
		setTitle("YAHTZEE");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        playerLabel.setFont(new Font("Tahoma", 0, 24));
        playerLabel.setText(players.get(0).getName());
        playerLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        upperSectionLabel.setFont(new Font("Tahoma", 0, 14));
        upperSectionLabel.setText("UPPER SECTION");

        guideHowLabel.setFont(new Font("Tahoma", 0, 14));
        guideHowLabel.setText("How to Score");

        guideScoreLabel.setFont(new Font("Tahoma", 0, 14));
        guideScoreLabel.setText("Score");

        acesLabel.setFont(new Font("Tahoma", 0, 14));
        acesLabel.setText("Aces");

        acesHowLabel.setFont(new Font("Tahoma", 0, 12));
        acesHowLabel.setText("Add Only Aces");
		
		acesButton.setEnabled(false);
		acesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                acesButtonActionPerformed(evt);
            }
        });

        twosLabel.setFont(new Font("Tahoma", 0, 14));
        twosLabel.setText("Twos");

        twosHowLabel.setFont(new Font("Tahoma", 0, 12));
        twosHowLabel.setText("Add Only Twos");
		
		twosButton.setEnabled(false);
		twosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                twosButtonActionPerformed(evt);
            }
        });

        threesLabel.setFont(new Font("Tahoma", 0, 14));
        threesLabel.setText("Threes");
        
		threesHowLabel.setFont(new Font("Tahoma", 0, 11));
		threesHowLabel.setText("Add Only Threes");
		
		threesButton.setEnabled(false);
		threesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threesButtonActionPerformed(evt);
            }
        });
		
		foursLabel.setFont(new Font("Tahoma", 0, 14));
        foursLabel.setText("Fours");

        foursHowLabel.setFont(new Font("Tahoma", 0, 12));
        foursHowLabel.setText("Add Only Fours");

		foursButton.setEnabled(false);
		foursButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                foursButtonActionPerformed(evt);
            }
        });
		
        fivesLabel.setFont(new Font("Tahoma", 0, 14));
        fivesLabel.setText("Fives");

        fivesHowLabel.setFont(new Font("Tahoma", 0, 12));
        fivesHowLabel.setText("Add Only Fives");

		fivesButton.setEnabled(false);
		fivesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fivesButtonActionPerformed(evt);
            }
        });
		
        sixesLabel.setFont(new Font("Tahoma", 0, 14));
        sixesLabel.setText("Sixes");

        sixesHowLabel.setFont(new Font("Tahoma", 0, 12));
        sixesHowLabel.setText("Add Only Sixes");

		sixesButton.setEnabled(false);
		sixesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sixesButtonActionPerformed(evt);
            }
        });
		
        topTotalLabel.setFont(new Font("Tahoma", 0, 14));
        topTotalLabel.setText("TOTAL SCORE");

		topFirstArrowLabel.setFont(new Font("Tahoma", 0, 12));
        topFirstArrowLabel.setText("------------------->");

        topBonusLabel.setFont(new Font("Tahoma", 0, 14));
        topBonusLabel.setText("BONUS (Score >= 63)");

        topBonusHowLabel.setFont(new Font("Tahoma", 0, 12));
        topBonusHowLabel.setText("SCORE 35");

        topTotalScoreLabel.setFont(new Font("Tahoma", 0, 14));
        topTotalScoreLabel.setText("0");

        topBonusScoreLabel.setFont(new Font("Tahoma", 0, 14));
        topBonusScoreLabel.setText("0");

        topTotalUpperLabel.setFont(new Font("Tahoma", 0, 14));
        topTotalUpperLabel.setText("TOTAL (Upper)");

        topSecondArrowLabel.setFont(new Font("Tahoma", 0, 12));
        topSecondArrowLabel.setText("------------------->");

        topTotalUpperScoreLabel.setFont(new Font("Tahoma", 0, 14));
        topTotalUpperScoreLabel.setText("0");

		lowerSectionLabel.setFont(new Font("Tahoma", 0, 14));
        lowerSectionLabel.setText("LOWER SECTION");

        threeOfAKindLabel.setFont(new Font("Tahoma", 0, 14));
        threeOfAKindLabel.setText("3 of a kind");

		threeOfAKindHowLabel.setFont(new Font("Tahoma", 0, 12));
        threeOfAKindHowLabel.setText("Add All Dice");

		threeOfAKindButton.setEnabled(false);
		threeOfAKindButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                threeOfAKindButtonActionPerformed(evt);
            }
        });
		
		fourOfAKindLabel.setFont(new Font("Tahoma", 0, 14));
        fourOfAKindLabel.setText("4 of a kind");

        fourOfAKindHowLabel.setFont(new Font("Tahoma", 0, 12));
        fourOfAKindHowLabel.setText("Add All Dice");

		fourOfAKindButton.setEnabled(false);
		fourOfAKindButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fourOfAKindButtonActionPerformed(evt);
            }
        });
		
        fullHouseLabel.setFont(new Font("Tahoma", 0, 14));
        fullHouseLabel.setText("Full House");

        fullHouseHowLabel.setFont(new Font("Tahoma", 0, 12));
        fullHouseHowLabel.setText("SCORE 25");

		fullHouseButton.setEnabled(false);
		fullHouseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fullHouseButtonActionPerformed(evt);
            }
        });
		
        smStraightLabel.setFont(new Font("Tahoma", 0, 14));
        smStraightLabel.setText("Sm. Straight");

        smStraightHowLabel.setFont(new Font("Tahoma", 0, 12));
        smStraightHowLabel.setText("SCORE 30");

		smStraightButton.setEnabled(false);
        smStraightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                smStraightButtonActionPerformed(evt);
            }
        });

        lgStraightLabel.setFont(new Font("Tahoma", 0, 14));
        lgStraightLabel.setText("Lg. Straight");

        lgStraightHowLabel.setFont(new Font("Tahoma", 0, 12));
        lgStraightHowLabel.setText("SCORE 40");

		lgStraightButton.setEnabled(false);
		lgStraightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lgStraightButtonActionPerformed(evt);
            }
        });
		
        yahtzeeLabel.setFont(new Font("Tahoma", 0, 14));
        yahtzeeLabel.setText("YAHTZEE (5 of a kind)");

        yahtzeeHowLabel.setFont(new Font("Tahoma", 0, 12));
        yahtzeeHowLabel.setText("SCORE 50");

		yahtzeeButton.setEnabled(false);
		yahtzeeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                yahtzeeButtonActionPerformed(evt);
            }
        });
		
        chanceLabel.setFont(new Font("Tahoma", 0, 14));
        chanceLabel.setText("Chance");

        chanceHowLabel.setFont(new Font("Tahoma", 0, 12));
        chanceHowLabel.setText("Add All Dice");

		chanceButton.setEnabled(false);
		chanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chanceButtonActionPerformed(evt);
            }
        });
		
        yahtzeeBonusLabel.setFont(new Font("Tahoma", 0, 14));
        yahtzeeBonusLabel.setText("YAHTZEE BONUS");

        yahtzeeHow1Label.setFont(new Font("Tahoma", 0, 12));
        yahtzeeHow1Label.setText("Bonus");
		
        yahtzeeHow2Label.setFont(new Font("Tahoma", 0, 12));
        yahtzeeHow2Label.setText("100 per bonus");
		
		yahtzeeBonusButton.setEnabled(false);
		yahtzeeBonusButton.setText("0");
		yahtzeeBonusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				yahtzeeBonusButtonActionPerformed(evt);
			}
		});

        yahtzeeBonusScoreLabel.setFont(new Font("Tahoma", 0, 14));
        yahtzeeBonusScoreLabel.setText("0");

        bottomTotalLowerLabel.setFont(new Font("Tahoma", 0, 14));
        bottomTotalLowerLabel.setText("TOTAL (Lower)");

		bottomFirstArrowLabel.setFont(new Font("Tahoma", 0, 12));
        bottomFirstArrowLabel.setText("------------------->");

        bottomLowerScoreLabel.setFont(new Font("Tahoma", 0, 14));
        bottomLowerScoreLabel.setText("0");

        bottomTotalUpperLabel.setFont(new Font("Tahoma", 0, 14));
        bottomTotalUpperLabel.setText("TOTAL (Upper)");

        bottomSecondArrowLabel.setFont(new Font("Tahoma", 0, 12));
        bottomSecondArrowLabel.setText("------------------->");

        bottomUpperScoreLabel.setFont(new Font("Tahoma", 0, 14));
        bottomUpperScoreLabel.setText("0");

        bottomTotalLabel.setFont(new Font("Tahoma", 0, 14));
        bottomTotalLabel.setText("TOTAL");

        bottomThirdArrowLabel.setFont(new Font("Tahoma", 0, 12));
        bottomThirdArrowLabel.setText("------------------->");

        bottomTotalScoreLabel.setFont(new Font("Tahoma", 0, 14));
        bottomTotalScoreLabel.setText("0");

        dieOneToggleButton.setFont(new Font("Tahoma", 0, 36));
        dieOneToggleButton.setText("1");
        dieOneToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		dieOneToggleButton.setEnabled(false);
		dieOneToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dieOneToggleButtonActionPerformed(evt);
            }
        });

        dieTwoToggleButton.setFont(new Font("Tahoma", 0, 36));
        dieTwoToggleButton.setText("1");
        dieTwoToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		dieTwoToggleButton.setEnabled(false);
		dieTwoToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dieTwoToggleButtonActionPerformed(evt);
            }
        });

        dieThreeToggleButton.setFont(new Font("Tahoma", 0, 36));
        dieThreeToggleButton.setText("1");
        dieThreeToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		dieThreeToggleButton.setEnabled(false);
		dieThreeToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dieThreeToggleButtonActionPerformed(evt);
            }
        });

        dieFourToggleButton.setFont(new Font("Tahoma", 0, 36));
        dieFourToggleButton.setText("1");
        dieFourToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		dieFourToggleButton.setEnabled(false);
		dieFourToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dieFourToggleButtonActionPerformed(evt);
            }
        });

        dieFiveToggleButton.setFont(new Font("Tahoma", 0, 36));
        dieFiveToggleButton.setText("1");
        dieFiveToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		dieFiveToggleButton.setEnabled(false);
		dieFiveToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dieFiveToggleButtonActionPerformed(evt);
            }
        });

        rollButton.setText("ROLL");
        rollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING) //PLAYER LABEL AND UPPER GUIDE LABELS
                        .addComponent(playerLabel, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(upperSectionLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(guideHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(guideScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup() //ACES
                        .addComponent(acesLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acesHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //TWOS
                        .addComponent(twosLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twosHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twosButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //THREES
                        .addComponent(threesLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threesHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //FOURS
                        .addComponent(foursLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foursHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foursButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //FIVES
                        .addComponent(fivesLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fivesHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fivesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //SIXES
                        .addComponent(sixesLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixesHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //TOTAL SCORE
                        .addComponent(topTotalLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topFirstArrowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topTotalScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //BONUS
                        .addComponent(topBonusLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topBonusHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topBonusScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //TOTAL UPPER
                        .addComponent(topTotalUpperLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topSecondArrowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topTotalUpperScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					//LOWER SECTION
					.addComponent(lowerSectionLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //3 OF A KIND
                        .addComponent(threeOfAKindLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeOfAKindHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeOfAKindButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // 4 OF A KIND
                        .addComponent(fourOfAKindLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourOfAKindHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourOfAKindButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // FULL HOUSE
                        .addComponent(fullHouseLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullHouseHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullHouseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // SMALL STRAIGHT
                        .addComponent(smStraightLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smStraightHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smStraightButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // LARGE STRAIGHT
                        .addComponent(lgStraightLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lgStraightHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lgStraightButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // YAHTZEE
                        .addComponent(yahtzeeLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yahtzeeHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yahtzeeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // CHANCE
                        .addComponent(chanceLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chanceHowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chanceButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //YAHTZEE BONUS
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(yahtzeeBonusLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addComponent(yahtzeeHow1Label, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(yahtzeeBonusButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addComponent(yahtzeeHow2Label, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(yahtzeeBonusScoreLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // BOTTOM TOTAL LOWER
                        .addComponent(bottomTotalLowerLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomFirstArrowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomLowerScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // BOTTOM TOTAL UPPER
                        .addComponent(bottomTotalUpperLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomSecondArrowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomUpperScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() // BOTTOM TOTAL
                        .addComponent(bottomTotalLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomThirdArrowLabel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bottomTotalScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(dieOneToggleButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dieTwoToggleButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dieThreeToggleButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dieFourToggleButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dieFiveToggleButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
					.addComponent(rollButton)
                    .addComponent(playerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(upperSectionLabel, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(guideHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guideScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(acesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acesHowLabel, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(acesButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(twosLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twosHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twosButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(threesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threesHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threesButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(foursLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foursHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foursButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(fivesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fivesHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fivesButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(sixesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixesHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(sixesButton, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(topTotalLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topTotalScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topFirstArrowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(topBonusLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(topBonusHowLabel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(topBonusScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(topTotalUpperLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topSecondArrowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(topTotalUpperScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lowerSectionLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeOfAKindHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeOfAKindLabel, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
							.addComponent(threeOfAKindButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(fourOfAKindButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(fourOfAKindHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(fourOfAKindLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(fullHouseLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(fullHouseHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(fullHouseButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(smStraightLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(smStraightHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(smStraightButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(lgStraightLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lgStraightHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lgStraightButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(yahtzeeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(yahtzeeHowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(yahtzeeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(chanceLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(chanceHowLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(chanceButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(yahtzeeBonusLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
									.addComponent(yahtzeeHow1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(yahtzeeBonusButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addComponent(yahtzeeHow2Label, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(yahtzeeBonusScoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(bottomTotalLowerLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bottomFirstArrowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(bottomLowerScoreLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(bottomTotalUpperLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(bottomSecondArrowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(bottomUpperScoreLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(bottomTotalLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(bottomThirdArrowLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(bottomTotalScoreLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
						.addComponent(dieOneToggleButton, GroupLayout.DEFAULT_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieTwoToggleButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieThreeToggleButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieFourToggleButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dieFiveToggleButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                )
        );
        pack();
    }// </editor-fold>                        
	
	//BUTTON EVENTS
	private void acesButtonActionPerformed(ActionEvent evt) {
		//calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 1) {
				score += 1;
			}
		}
		//update player values
		players.get(turn).setScore(0, score);
		players.get(turn).setUsed(0);
		nextTurn();
    }  
	
	private void twosButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 2) {
				score += 2;
			}
		}
		//update player values
		players.get(turn).setScore(1, score);
		players.get(turn).setUsed(1);
		nextTurn();
    }  
	
	private void threesButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 3) {
				score += 3;
			}
		}
		//update player values
		players.get(turn).setScore(2, score);
		players.get(turn).setUsed(2);
		nextTurn();
    }  
	
	private void foursButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 4) {
				score += 4;
			}
		}
		//update player values
		players.get(turn).setScore(3, score);
		players.get(turn).setUsed(3);
		nextTurn();
    }  
	
	private void fivesButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 5) {
				score += 5;
			}
		}
		//update player values
		players.get(turn).setScore(4, score);
		players.get(turn).setUsed(4);
		nextTurn();
    }  
	
	private void sixesButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		for(Die d : dice) {
			if(d.getNumber() == 6) {
				score += 6;
			}
		}
		//update player values
		players.get(turn).setScore(5, score);
		players.get(turn).setUsed(5);
		nextTurn();
    }  
	
	private void threeOfAKindButtonActionPerformed(ActionEvent evt) {
        //calculate score
		int score = 0;
		if(joker) {
			for(Die d : dice) {
				score += d.getNumber();
			}
		} else {
			//check for three of a kind
			int count[] = new int[6];
			for(Die d : dice) {
				count[d.getNumber() - 1]++;
			}
			for(int i : count) {
				if(i >= 3) {
					for(Die d : dice) {
						score += d.getNumber();
					}
					break;
				}
			}
		}
		//update player values
		players.get(turn).setScore(6, score);
		players.get(turn).setUsed(6);
		nextTurn();
    }  
	
	private void fourOfAKindButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		if(joker) {
			for(Die d : dice) {
				score += d.getNumber();
			}
		} else {
			//check for four of a kind
			int count[] = new int[6];
			for(Die d : dice) {
				count[d.getNumber() - 1]++;
			}
			for(int i : count) {
				if(i >= 4) {
					for(Die d : dice) {
						score += d.getNumber();
					}
					break;
				}
			}
		}
		//update player values
		players.get(turn).setScore(7, score);
		players.get(turn).setUsed(7);
		nextTurn();
    }  
	
	private void fullHouseButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		if(joker) {
			score = 25;
		} else {
			//check for full house
			int count[] = new int[6];
			for(Die d : dice) {
				count[d.getNumber() - 1]++;
			}
			String dieCount = "";
			for(int i : count) {
				dieCount += String.valueOf(i);
			}
			if(dieCount.contains("2") && dieCount.contains("3")) {
				score = 25;
			}
		}
		//update player values
		players.get(turn).setScore(8, score);
		players.get(turn).setUsed(8);
		nextTurn();
    }  
	
    private void smStraightButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		if(joker) {
			score = 30;
		} else {
			//check for small straight
			String dieSequence = "";
			for(Die d : dice) {
				dieSequence += String.valueOf(d.getNumber());
			}
			if((dieSequence.contains("1") && dieSequence.contains("2") && dieSequence.contains("3") && dieSequence.contains("4")) || (dieSequence.contains("2") && dieSequence.contains("3") && dieSequence.contains("4") && dieSequence.contains("5")) || (dieSequence.contains("3") && dieSequence.contains("4") && dieSequence.contains("5") && dieSequence.contains("6"))) {
				score = 30;
			}
		}
		//update player values
		players.get(turn).setScore(9, score);
		players.get(turn).setUsed(9);
		nextTurn();
    }       

	private void lgStraightButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		if(joker) {
			score = 40;
		} else {
			//check for large straight
			String dieSequence = "";
			for(Die d : dice) {
				dieSequence += String.valueOf(d.getNumber());
			}
			if((dieSequence.contains("1") && dieSequence.contains("2") && dieSequence.contains("3") && dieSequence.contains("4") && dieSequence.contains("5")) || (dieSequence.contains("2") && dieSequence.contains("3") && dieSequence.contains("4") && dieSequence.contains("5") && dieSequence.contains("6"))) {
				score = 40;
			}
		}
		//update player values
		players.get(turn).setScore(10, score);
		players.get(turn).setUsed(10);
		nextTurn();
    }  
	
	private void yahtzeeButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		//check for yahtzee
		int count[] = new int[6];
		for(Die d : dice) {
			count[d.getNumber() - 1]++;
		}
		for(int i : count) {
			if(i == 5) {
				score = 50;
				break;
			}
		}
		//update player values
		players.get(turn).setScore(11, score);
		players.get(turn).setUsed(11);
		nextTurn();
    }  
	
	private void chanceButtonActionPerformed(ActionEvent evt) {                                         
        //calculate score
		int score = 0;
		for(Die d : dice) {
			score += d.getNumber();
		}
		//update player values
		players.get(turn).setScore(12, score);
		players.get(turn).setUsed(12);
		nextTurn();
    }
	
	private void yahtzeeBonusButtonActionPerformed(ActionEvent evt) {
		players.get(turn).addYahtzeeBonusCount();
		players.get(turn).calculate();
		yahtzeeBonusButton.setText(players.get(turn).getYahtzeeBonusCount());
		yahtzeeBonusScoreLabel.setText(players.get(turn).getYahtzeeBonusScore());
		bottomLowerScoreLabel.setText(players.get(turn).getBottomTotalLowerScore());
		bottomTotalScoreLabel.setText(players.get(turn).getBottomTotalScore());
		joker = true;
		enableJoker();
	}

    private void rollButtonActionPerformed(ActionEvent evt) {
		//increase roll count
		rollCount++;
		joker = false;
		//roll dice if enabled
		for(int i = 0; i < 5; i++) {
			if(dice.get(i).isEnabled()) {
				dice.get(i).roll();
				statDice[dice.get(i).getNumber() - 1]++; //STAT TRACKING
			}
		}
		//set dice on GUI to display face value
		dieOneToggleButton.setText(String.valueOf(dice.get(0).getNumber()));
		dieTwoToggleButton.setText(String.valueOf(dice.get(1).getNumber()));
		dieThreeToggleButton.setText(String.valueOf(dice.get(2).getNumber()));
		dieFourToggleButton.setText(String.valueOf(dice.get(3).getNumber()));
		dieFiveToggleButton.setText(String.valueOf(dice.get(4).getNumber()));
        //enable everything if player 1 makes his first roll
		if(rollCount == 1) {
			acesButton.setEnabled(!players.get(turn).getUsed(0));
			twosButton.setEnabled(!players.get(turn).getUsed(1));
			threesButton.setEnabled(!players.get(turn).getUsed(2));
			foursButton.setEnabled(!players.get(turn).getUsed(3));
			fivesButton.setEnabled(!players.get(turn).getUsed(4));
			sixesButton.setEnabled(!players.get(turn).getUsed(5));
			threeOfAKindButton.setEnabled(!players.get(turn).getUsed(6));
			fourOfAKindButton.setEnabled(!players.get(turn).getUsed(7));
			fullHouseButton.setEnabled(!players.get(turn).getUsed(8));
			smStraightButton.setEnabled(!players.get(turn).getUsed(9));
			lgStraightButton.setEnabled(!players.get(turn).getUsed(10));
			yahtzeeButton.setEnabled(!players.get(turn).getUsed(11));
			chanceButton.setEnabled(!players.get(turn).getUsed(12));
			yahtzeeBonusButton.setEnabled(false); //should only be enabled if the dice show a yahtzee and a yahtzee has already been taken
			dieOneToggleButton.setEnabled(true);
			dieTwoToggleButton.setEnabled(true);
			dieThreeToggleButton.setEnabled(true);
			dieFourToggleButton.setEnabled(true);
			dieFiveToggleButton.setEnabled(true);
		}
		//disable roll button if roll count is 3
		if(rollCount == 3) {
			rollButton.setEnabled(false);
		}
		//check for bonus yahtzee and enable yahtzee bonus button if achieved
		//yahtzee bonus should be enabled if yahtzee score is 50 and if dice show a yahtzee
		//if an additional yahtzee has been found, set joker to true
		boolean same = true;
		for(int i = 0; i < 4; i++) {
			if(dice.get(i).getNumber() != dice.get(i + 1).getNumber()) {
				same = false;
			}
		}
		if(same) { //yahtzee
			//check to see if yahtzee has been set to 50
			if(players.get(turn).getScore(11).equals("50")) {
				yahtzeeBonusButton.setEnabled(true);
			} else { //check to see if yahtzee is set to 0 and used
				if(players.get(turn).getUsed(11)) {
					joker = true;
				}
			}
		}
		//handle Joker conditions
		if(joker) {
			enableJoker();
		}
    }
	
	private void dieOneToggleButtonActionPerformed(ActionEvent evt) {
		dice.get(0).toggle();
	}
	
	private void dieTwoToggleButtonActionPerformed(ActionEvent evt) {
		dice.get(1).toggle();
	}
	
	private void dieThreeToggleButtonActionPerformed(ActionEvent evt) {
		dice.get(2).toggle();
	}
	
	private void dieFourToggleButtonActionPerformed(ActionEvent evt) {
		dice.get(3).toggle();
	}
	
	private void dieFiveToggleButtonActionPerformed(ActionEvent evt) {
		dice.get(4).toggle();
	}
	
	//STAT TRACKING
	private static int statGamesPlayed;
	private static int[] statDice = new int[6]; //number of times each number is rolled
	private static String statHighPlayer;
	private static String statLowPlayer;
	private static int statHighScore;
	private static int statLowScore;
	private static int statYahtzeeCount;
	
	//FIELDS
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static int turn = 0;
	private static ArrayList<Die> dice = new ArrayList<Die>();
	private static int rollCount = 0;
	private static boolean joker = false;
	
    public static void main(String args[]) {
		//set stat tracking
		try(BufferedReader br = new BufferedReader(new FileReader("stats"))) {
			statGamesPlayed = Integer.valueOf(br.readLine());
			for(int i = 0; i < 6; i++) {
				statDice[i] = Integer.valueOf(br.readLine());
			}
			statHighPlayer = br.readLine();
			statHighScore = Integer.valueOf(br.readLine());
			statLowPlayer = br.readLine();
			statLowScore = Integer.valueOf(br.readLine());
			statYahtzeeCount = Integer.valueOf(br.readLine());
		} catch(Exception e) {
			statGamesPlayed = 0;
			for(int i = 0; i < 6; i++) {
				statDice[i] = 0;
			}
			statHighPlayer = "DEFAULT";
			statHighScore = 0;
			statLowPlayer = "DEFAULT";
			statLowScore = 1000000;
			statYahtzeeCount = 0;
		}
		//create form layout
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YahtzeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YahtzeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YahtzeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YahtzeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		//create dice
		for(int i = 0; i < 5; i++) {
			dice.add(new Die());
		}
		//popup to get user names
		getPlayers();
        //Create and display the form
		YahtzeeGUI gui = new YahtzeeGUI();
		gui.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(JOptionPane.showConfirmDialog(gui, "Are you sure you want to leave?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				gui.setVisible(true);
			}
		});
    }
	
	public static void getPlayers() {
		while(true) {
			String input = JOptionPane.showInputDialog(new JFrame("Player Names"), "Player Name: ");
			if(input == null) {
				if(players.size() == 0) {
					players.add(new Player("Player 1"));
				}
				break;
			}
			players.add(new Player(input));
		}
	}
	
	public void nextTurn() {
		//calculate player totals
		players.get(turn).calculate();
		//check for end condition
		boolean endGame = true;
		for(Player p : players) {
			for(boolean b : p.getUsed()) {
				if(!b) {
					endGame = false;
				}
			}
		}
		//if win...
		if(endGame) {
			//update games played
			statGamesPlayed++;
			//get final display info
			String playerScores = "";
			for(Player p : players) {
				//check for high and low score
				boolean highExtended = false;
				boolean lowExtended = false;
				if(Integer.valueOf(p.getBottomTotalScore()) > statHighScore) {
					statHighPlayer = p.getName();
					statHighScore = Integer.valueOf(p.getBottomTotalScore());
					highExtended = true;
				}
				if(Integer.valueOf(p.getBottomTotalScore()) < statLowScore) {
					statLowPlayer = p.getName();
					statLowScore = Integer.valueOf(p.getBottomTotalScore());
					lowExtended = true;
				}
				playerScores += p.getName() + ": " + p.getBottomTotalScore();
				if(highExtended) {
					playerScores += "   <- NEW HIGH SCORE!!!\n\n";
				} else if(lowExtended) {
					playerScores += "   <- NEW LOW SCORE!!!\n\n";
				} else {
					playerScores += "\n\n";
				}
				//update yahtzee stats
				if(Integer.valueOf(p.getScore(11)) > 0) {
					statYahtzeeCount++;
				}
				statYahtzeeCount += Integer.valueOf(p.getYahtzeeBonusCount());
			}
			playerScores += "High Score:    " + statHighPlayer + " : " + statHighScore + "\n";
			playerScores += " Low Score:    " + statLowPlayer + " : " + statLowScore;
			//write games played, dice frequencies, high score player, high score, low score player, low score, and yahtzee count to text file
			try(PrintWriter output = new PrintWriter("stats")) {
				output.println(statGamesPlayed);
				for(int i = 0; i < 6; i++) {
					output.println(statDice[i]);
				}
				output.println(statHighPlayer);
				output.println(statHighScore);
				output.println(statLowPlayer);
				output.println(statLowScore);
				output.println(statYahtzeeCount);
			} catch(Exception e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(new JFrame(), playerScores);
			System.exit(0);
		} else { //no end game...
			//change players
			if(turn == players.size() - 1) {
				turn = 0;
			} else {
				turn++;
			}
			//update player label text
			playerLabel.setText(players.get(turn).getName());
			//update button text
			if(players.get(turn).getUsed(0)) {
				acesButton.setText(players.get(turn).getScore(0));
			} else {
				acesButton.setText("");
			}
			if(players.get(turn).getUsed(1)) {
				twosButton.setText(players.get(turn).getScore(1));
			} else {
				twosButton.setText("");
			}
			if(players.get(turn).getUsed(2)) {
				threesButton.setText(players.get(turn).getScore(2));
			} else {
				threesButton.setText("");
			}
			if(players.get(turn).getUsed(3)) {
				foursButton.setText(players.get(turn).getScore(3));
			} else {
				foursButton.setText("");
			}
			if(players.get(turn).getUsed(4)) {
				fivesButton.setText(players.get(turn).getScore(4));
			} else {
				fivesButton.setText("");
			}
			if(players.get(turn).getUsed(5)) {
				sixesButton.setText(players.get(turn).getScore(5));
			} else {
				sixesButton.setText("");
			}
			if(players.get(turn).getUsed(6)) {
				threeOfAKindButton.setText(players.get(turn).getScore(6));
			} else {
				threeOfAKindButton.setText("");
			}
			if(players.get(turn).getUsed(7)) {
				fourOfAKindButton.setText(players.get(turn).getScore(7));
			} else {
				fourOfAKindButton.setText("");
			}
			if(players.get(turn).getUsed(8)) {
				fullHouseButton.setText(players.get(turn).getScore(8));
			} else {
				fullHouseButton.setText("");
			}
			if(players.get(turn).getUsed(9)) {
				smStraightButton.setText(players.get(turn).getScore(9));
			} else {
				smStraightButton.setText("");
			}
			if(players.get(turn).getUsed(10)) {
				lgStraightButton.setText(players.get(turn).getScore(10));
			} else {
				lgStraightButton.setText("");
			}
			if(players.get(turn).getUsed(11)) {
				yahtzeeButton.setText(players.get(turn).getScore(11));
			} else {
				yahtzeeButton.setText("");
			}
			if(players.get(turn).getUsed(12)) {
				chanceButton.setText(players.get(turn).getScore(12));
			} else {
				chanceButton.setText("");
			}
			yahtzeeBonusButton.setText(players.get(turn).getYahtzeeBonusCount());
			yahtzeeBonusButton.setEnabled(false);
			//update score label text
			topTotalScoreLabel.setText(players.get(turn).getTopTotalScore());
			topBonusScoreLabel.setText(players.get(turn).getTopBonusScore());
			topTotalUpperScoreLabel.setText(players.get(turn).getTopTotalUpperScore());
			yahtzeeBonusScoreLabel.setText(players.get(turn).getYahtzeeBonusScore());
			bottomLowerScoreLabel.setText(players.get(turn).getBottomTotalLowerScore());
			bottomUpperScoreLabel.setText(players.get(turn).getBottomTotalUpperScore());
			bottomTotalScoreLabel.setText(players.get(turn).getBottomTotalScore());
			//disable all score buttons
			disableScoreButtons();
			//set all dice to un-toggled and disabled
			for(int i = 0; i < 5; i++) {
				dice.get(i).setEnabled(true);
			}
			dieOneToggleButton.setSelected(false);
			dieTwoToggleButton.setSelected(false);
			dieThreeToggleButton.setSelected(false);
			dieFourToggleButton.setSelected(false);
			dieFiveToggleButton.setSelected(false);
			dieOneToggleButton.setEnabled(false);
			dieTwoToggleButton.setEnabled(false);
			dieThreeToggleButton.setEnabled(false);
			dieFourToggleButton.setEnabled(false);
			dieFiveToggleButton.setEnabled(false);
			//enable roll button
			rollButton.setEnabled(true);
			//reset trackers
			rollCount = 0;
			joker = false;
		}
	}
	
	public void enableJoker() {
		//disable yahtzee bonus button
		yahtzeeBonusButton.setEnabled(false);
		//check availability of upper dice box
		//if the upper dice box is available, all other buttons need greyed out
		switch(dice.get(0).getNumber()) {
			case 1:
				if(!players.get(turn).getUsed(0)) {
					disableScoreButtons();
					acesButton.setEnabled(true);
					return;
				}
			break;
			case 2:
				if(!players.get(turn).getUsed(1)) {
					disableScoreButtons();
					twosButton.setEnabled(true);
					return;
				}
			break;
			case 3:
				if(!players.get(turn).getUsed(2)) {
					disableScoreButtons();
					threesButton.setEnabled(true);
					return;
				}
			break;
			case 4:
				if(!players.get(turn).getUsed(3)) {
					disableScoreButtons();
					foursButton.setEnabled(true);
					return;
				}
			break;
			case 5:
				if(!players.get(turn).getUsed(4)) {
					disableScoreButtons();
					fivesButton.setEnabled(true);
					return;
				}
			break;
			case 6:
				if(!players.get(turn).getUsed(5)) {
					disableScoreButtons();
					sixesButton.setEnabled(true);
					return;
				}
			break;
		}
		//if the upper dice box is not available, activate all lower buttons and grey out all other buttons
		boolean bottomAvailable = false;
		for(int i = 6; i < 12; i++) {
			if(!players.get(turn).getUsed(i)) {
				bottomAvailable = true;
			}
		}
		if(bottomAvailable) {
			acesButton.setEnabled(false);
			twosButton.setEnabled(false);
			threesButton.setEnabled(false);
			foursButton.setEnabled(false);
			fivesButton.setEnabled(false);
			sixesButton.setEnabled(false);
			return;
		}
		//if the appropriate upper box is not available and the lower buttons are taken, enable all available upper buttons
		acesButton.setEnabled(!players.get(turn).getUsed(0));
		twosButton.setEnabled(!players.get(turn).getUsed(1));
		threesButton.setEnabled(!players.get(turn).getUsed(2));
		foursButton.setEnabled(!players.get(turn).getUsed(3));
		fivesButton.setEnabled(!players.get(turn).getUsed(4));
		sixesButton.setEnabled(!players.get(turn).getUsed(5));
	}
	
	public void disableScoreButtons() {
		acesButton.setEnabled(false);
		twosButton.setEnabled(false);
		threesButton.setEnabled(false);
		foursButton.setEnabled(false);
		fivesButton.setEnabled(false);
		sixesButton.setEnabled(false);
		threeOfAKindButton.setEnabled(false);
		fourOfAKindButton.setEnabled(false);
		fullHouseButton.setEnabled(false);
		smStraightButton.setEnabled(false);
		lgStraightButton.setEnabled(false);
		yahtzeeButton.setEnabled(false);
		chanceButton.setEnabled(false);
	}
}

class Player {
	private String name;
	private int scores[] = new int[13];
	private boolean used[] = new boolean[13];
	private int topTotalScore = 0;
	private int topBonusScore = 0;
	private int topTotalUpperScore = 0;
	private int yahtzeeBonusCount = 0;
	private int yahtzeeBonusScore = 0;
	private int bottomTotalLowerScore = 0;
	private int bottomTotalUpperScore = 0;
	private int bottomTotalScore = 0;
	
	public Player(String name) {
		this.name = name;
		for(int i = 0; i < 13; i++) {
			scores[i] = 0;
			used[i] = false;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void calculate() {
		//calculations for top of form
		this.topTotalScore = 0;
		for(int i = 0; i < 6; i++) {
			this.topTotalScore += scores[i];
		}
		if(this.topTotalScore >= 63) {
			this.topBonusScore = 35;
		}
		this.topTotalUpperScore = this.topTotalScore + this.topBonusScore;
		//calculations for bottom of form
		this.yahtzeeBonusScore = yahtzeeBonusCount*100;
		this.bottomTotalLowerScore = yahtzeeBonusScore;
		for(int i = 6; i < 13; i++) {
			this.bottomTotalLowerScore += scores[i];
		}
		this.bottomTotalUpperScore = this.topTotalUpperScore;
		this.bottomTotalScore = this.bottomTotalLowerScore + this.bottomTotalUpperScore;
	}
	
	public String getTopTotalScore() {
		return String.valueOf(this.topTotalScore);
	}
	
	public String getTopBonusScore() {
		return String.valueOf(this.topBonusScore);
	}
	
	public String getTopTotalUpperScore() {
		return String.valueOf(this.topTotalUpperScore);
	}
	
	public String getYahtzeeBonusCount() {
		return String.valueOf(this.yahtzeeBonusCount);
	}
	
	public String getYahtzeeBonusScore() {
		return String.valueOf(this.yahtzeeBonusScore);
	}
	
	public String getBottomTotalLowerScore() {
		return String.valueOf(this.bottomTotalLowerScore);
	}
	
	public String getBottomTotalUpperScore() {
		return String.valueOf(this.bottomTotalUpperScore);
	}
	
	public String getBottomTotalScore() {
		return String.valueOf(this.bottomTotalScore);
	}
	
	//SET USED STATES
	public void setUsed(int button) {
		this.used[button] = true;
	}
	
	//GET USED STATES
	public boolean[] getUsed() {
		return this.used;
	}
	
	public boolean getUsed(int button) {
		return this.used[button];
	}
	
	//GET 13 SCORES
	public String getScore(int button) {
		return String.valueOf(this.scores[button]);
	}
	
	//SET 13 SCORES
	public void setScore(int button, int score) {
		this.scores[button] = score;
	}
	
	public void addYahtzeeBonusCount() {
		this.yahtzeeBonusCount++;
	}
}

class Die {
	private int number;
	private boolean enabled;
	
	public Die() {
		number = 1;
		enabled = true;
	}
	
	public void roll() {
		Random random = new Random();
		this.number = random.nextInt(6) + 1;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public boolean isEnabled() {
		return this.enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void toggle() {
		this.enabled = !this.enabled;
	}
}